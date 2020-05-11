package com.meamoria.lexurgy.sc

import com.meamoria.lexurgy.Segment
import com.meamoria.lexurgy.Word

interface Matcher<I : Segment<I>> {
    fun claim(declarations: Declarations, word: Word<I>, start: Int, bindings: Bindings): Int?
}

class WordStartMatcher<I : Segment<I>> : Matcher<I> {
    override fun claim(declarations: Declarations, word: Word<I>, start: Int, bindings: Bindings): Int? =
        start.takeIf { it == 0 }
}

class WordEndMatcher<I : Segment<I>> : Matcher<I> {
    override fun claim(declarations: Declarations, word: Word<I>, start: Int, bindings: Bindings): Int? =
        start.takeIf { it == word.length }
}

class SequenceMatcher<I : Segment<I>>(val elements: List<Matcher<I>>) : Matcher<I> {
    override fun claim(declarations: Declarations, word: Word<I>, start: Int, bindings: Bindings): Int? {
        var elementStart = start
        for (element in elements) {
            elementStart = element.claim(declarations, word, elementStart, bindings) ?: return null
        }
        return elementStart
    }
}

interface SimpleMatcher<I : Segment<I>> : Matcher<I>

class MatrixMatcher(val matrix: Matrix) : SimpleMatcher<PhonS> {
    override fun claim(declarations: Declarations, word: Word<PhonS>, start: Int, bindings: Bindings): Int? {
        with(declarations) {
            val boundMatrix = matrix.bindVariables(bindings)
            return if (start < word.length && word[start].matches(boundMatrix, bindings)) start + 1
            else null
        }
    }
}

class TextMatcher<I: Segment<I>>(val text: Word<I>) : SimpleMatcher<I> {
    override fun claim(declarations: Declarations, word: Word<I>, start: Int, bindings: Bindings): Int? =
        if (word.drop(start).take(text.length) == text) start + text.length else null
}