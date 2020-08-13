package com.meamoria.lexurgy.sc

import com.meamoria.lexurgy.*
import java.util.concurrent.ConcurrentHashMap

class Declarations(
    val features: List<Feature>,
    val diacritics: List<Diacritic>,
    val symbols: List<Symbol>,
    val classes: List<SegmentClass>
) {

    private val featureNameToFeatureMap = features.associateBy { it.name }
    private val valueToFeature = features.flatMap { feature ->
        feature.allValues.map { it to feature }
    }.toMap()
    private val nulls = features.mapNotNull { it.nullAlias }

    private val diacriticNameToDiacritic = diacritics.associateBy { it.name }
    private val floatingDiacritics = diacritics.filter { it.floating }

    private val symbolsAsComplexSymbols = symbols.map { complexSymbol(it) }
    private val symbolNameToSymbol = symbols.associateBy { it.name }
    private val matrixToSimpleSymbol = symbols.associateBy { it.matrix.removeExplicitNulls() }

    private val matrixToSymbolCache = ConcurrentHashMap<Matrix, PhoneticSegment>()

    private val classNameToClass = classes.associateBy { it.name }

    private val phoneticParser = PhoneticParser(
        symbols.map { it.name },
        diacritics.filter { it.before }.map { it.name },
        diacritics.filterNot { it.before }.map { it.name }
    )

    fun parsePhonetic(text: String): Word<PhoneticSegment> =
        phoneticParser.parse(text)

    fun parsePhonetic(word: Word<PlainS>): Word<PhonS> = parsePhonetic(word.string)

    fun String.toFeature(): Feature =
        featureNameToFeatureMap[this] ?: throw LscUndefinedName("feature", this)

    fun String.toClass(): SegmentClass =
        classNameToClass[this] ?: throw LscUndefinedName("sound class", this)

    /**
     * Checks if this segment is the same as the specified pattern plus
     * any number of floating diacritics.
     */
    fun PhoneticSegment.matches(pattern: PhoneticSegment): Boolean {
        if (floatingDiacritics.isEmpty()) return this == pattern
        val thisSymbol = this.toComplexSymbol() ?: return this == pattern
        if (!thisSymbol.diacritics.any { it.floating }) return this == pattern
        val patternSymbol = pattern.toComplexSymbol() ?: return this == pattern
        return searchDiacritics(
            thisSymbol.toMatrix(),
            listOf(patternSymbol),
            availableDiacritics = floatingDiacritics
        ) == this.toComplexSymbol()
    }

    /**
     * Tries to match the specified matrix to the this phonetic symbol.
     * Returns true if the matrix matched, false otherwise. Binds variables.
     */
    fun PhoneticSegment.matches(matrix: Matrix, bindings: Bindings): Boolean {
        val complexSymbolMatrix = toMatrix() ?: Matrix(emptyList())
        for (value in matrix.valueList) {
            val realValue = if (value.isNull())
                AbsentFeature(valueToFeature.getValue(value as SimpleValue).name)
            else value
            if (!realValue.matches(complexSymbolMatrix, bindings)) return false
        }
        return true
    }

    private fun MatrixValue.isNull(): Boolean = this in nulls

    fun PhoneticSegment.withFloatingDiacriticsFrom(
        other: PhoneticSegment, excluding: PhoneticSegment? = null
    ): PhoneticSegment {
        if (floatingDiacritics.isEmpty()) return this
        val excludingDiacritics = excluding?.toComplexSymbol()?.diacritics ?: listOf()
        val otherSymbol = other.toComplexSymbol() ?: return this
        val otherFloating = otherSymbol.diacritics.filter {
            it.floating && it !in excludingDiacritics
        }
        if (otherFloating.isEmpty()) return this
        val thisSymbol = this.toComplexSymbol() ?: return this
        var result = thisSymbol
        for (diacritic in otherFloating) {
            if (diacritic !in result.diacritics) result = result.withDiacritic(diacritic)
        }
        return result.toPhoneticSegment()
    }

    fun PhoneticSegment.toComplexSymbol(): ComplexSymbol? {
        val (core, before, after) = phoneticParser.breakDiacritics(string)
        val coreSymbol = symbolNameToSymbol[core] ?: return null
        val diacritics = (before + after).map { diacriticNameToDiacritic.getValue(it) }
        return complexSymbol(coreSymbol, diacritics)
    }

    fun PhoneticSegment.toMatrix(): Matrix? = toComplexSymbol()?.toMatrix()

    fun Symbol.toPhoneticSegment(): PhoneticSegment = PhoneticSegment(name)

    /**
     * Creates a ``ComplexSymbol`` with the specified core and diacritics. This
     * is a member of ``Declarations`` (and the ``ComplexSymbol`` constructor is
     * marked ``internal``) because it enforces declaration order on the diacritics.
     */
    fun complexSymbol(coreSymbol: Symbol, diacritics: Iterable<Diacritic> = emptyList()): ComplexSymbol =
        ComplexSymbol(coreSymbol, this.diacritics.filter { it in diacritics })

    fun ComplexSymbol.withDiacritic(diacritic: Diacritic): ComplexSymbol =
        complexSymbol(symbol, diacritics + diacritic)

    fun ComplexSymbol.toMatrix(): Matrix {
        var result = symbol.matrix
        for (diacritic in diacritics) result = result.update(diacritic.matrix)
        return result
    }

    fun ComplexSymbol.toPhoneticSegment(): PhoneticSegment = PhoneticSegment(string)

    fun Matrix.toSymbol(): PhoneticSegment {
        matrixToSymbolCache[this]?.let { return it }

        val matrix = removeExplicitNulls()

        val result = matrixToSimpleSymbol[matrix]?.toPhoneticSegment()
            ?: searchDiacritics(matrix)?.toPhoneticSegment()
            ?: throw LscInvalidMatrix(matrix)

        return result.also { matrixToSymbolCache[this] = it }
    }

    private fun Matrix.removeExplicitNulls(): Matrix = Matrix(valueList.filterNot { it.isNull() })

    private fun searchDiacritics(
        matrix: Matrix,
        candidates: List<ComplexSymbol> = symbolsAsComplexSymbols,
        bestDistance: Int? = null,
        availableDiacritics: List<Diacritic> = diacritics
    ): ComplexSymbol? {
        val sortedCandidates = candidates.sortedBy { it.distanceTo(matrix) }
        sortedCandidates.first().takeIf { it.distanceTo(matrix) == 0 }?.let { return it }

        for (candidate in sortedCandidates) {
            val candidateDistance = candidate.distanceTo(matrix)
            if (bestDistance != null && candidateDistance >= bestDistance) return null
            val withDiacritics = availableDiacritics.map { candidate.withDiacritic(it) }
            searchDiacritics(matrix, withDiacritics, candidateDistance, availableDiacritics)?.let { return it }
        }
        return null
    }

    private fun ComplexSymbol.distanceTo(matrix: Matrix): Int {
        val symbolMatrix = toMatrix()
        val difference = (matrix.simpleValues.filterNot { it in symbolMatrix.simpleValues } +
                symbolMatrix.simpleValues.filterNot { it in matrix.simpleValues }
                )
        return difference.size
    }

    fun Matrix.update(updateMatrix: Matrix): Matrix {
        val oldMatrixFeatures = simpleValues.associateBy { it.toFeature() }
        val newMatrixValues = valueList.toMutableList()
        for (value in updateMatrix.valueList) {
            if (value is AbsentFeature) {
                val updateFeature = value.featureName.toFeature()
                oldMatrixFeatures[updateFeature]?.let { newMatrixValues.remove(it) }
            } else {
                val updateFeature = (value as SimpleValue).toFeature()
                oldMatrixFeatures[updateFeature]?.let { newMatrixValues.remove(it) }
                newMatrixValues += value
            }
        }
        return Matrix(newMatrixValues)
    }

    private fun SimpleValue.toFeature(): Feature =
        valueToFeature[this] ?: throw LscUndefinedName("feature value", name)

    fun MatrixValue.matches(matrix: Matrix, bindings: Bindings): Boolean =
        matches(this@Declarations, matrix, bindings)
}

class SegmentClass(val name: String, val sounds: List<String>)

class Feature(val name: String, val values: List<SimpleValue>, val nullAlias: SimpleValue? = null) {
    val allValues: List<SimpleValue> = listOfNotNull(nullAlias) + values

    override fun toString(): String = values.joinToString(prefix = "$name(", postfix = ")")
}

class Symbol(val name: String, val matrix: Matrix) {
    override fun toString(): String = name + if (matrix.valueList.isEmpty()) "" else " $matrix"
}

/**
 * A symbol with diacritics.
 *
 * The constructor is marked ``internal`` because validation depends on the declarations.
 * Use the ``complexSymbol`` function in ``Declarations`` to create instances.
 */
data class ComplexSymbol internal constructor(val symbol: Symbol, val diacritics: List<Diacritic>) {
    val string = (diacritics.filter { it.before }.map { it.name } +
            listOf(symbol.name) +
            diacritics.filterNot { it.before }.map { it.name }
            ).joinToString("")

    override fun toString(): String = string
}

data class Diacritic(val name: String, val matrix: Matrix, val before: Boolean, val floating: Boolean)

class LscUndefinedName(val nameType: String, val undefinedName: String) :
    LscUserError("The $nameType name $undefinedName is not defined")
