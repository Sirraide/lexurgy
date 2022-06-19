// Generated from Lsc.g4 by ANTLR 4.7.2
package com.meamoria.lexurgy.sc.java;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LscLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SEP=2, CHANGE=3, CONDITION=4, EXCLUSION=5, ANCHOR=6, NEWLINE=7, 
		WHITESPACE=8, O_PAREN=9, C_PAREN=10, NULL=11, MATRIX_START=12, MATRIX_END=13, 
		LIST_START=14, LIST_END=15, AT_LEAST_ONE=16, OPTIONAL=17, HYPHEN=18, RULE_START=19, 
		INEXACT=20, NEGATION=21, SYLLABLE_BOUNDARY=22, WORD_BOUNDARY=23, BETWEEN_WORDS=24, 
		CLASSREF=25, INTERSECTION=26, INTERSECTION_NOT=27, TRANSFORMING=28, CLASS_DECL=29, 
		FEATURE_DECL=30, SYLLABLE_FEATURE=31, DIACRITIC_DECL=32, DIA_BEFORE=33, 
		DIA_FIRST=34, DIA_FLOATING=35, SYMBOL_DECL=36, SYLLABLE_DECL=37, EXPLICIT_SYLLABLES=38, 
		CLEAR_SYLLABLES=39, ANY_SYLLABLE=40, DEROMANIZER=41, ROMANIZER=42, ALL_MATCHING=43, 
		FIRST_MATCHING=44, LITERAL=45, LTR=46, RTL=47, PROPAGATE=48, CLEANUP=49, 
		NUMBER=50, NAME=51, STR1=52, STR=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "SEP", "CHANGE", "CONDITION", "EXCLUSION", "ANCHOR", "NEWLINE", 
			"WHITESPACE", "O_PAREN", "C_PAREN", "NULL", "MATRIX_START", "MATRIX_END", 
			"LIST_START", "LIST_END", "AT_LEAST_ONE", "OPTIONAL", "HYPHEN", "RULE_START", 
			"INEXACT", "NEGATION", "SYLLABLE_BOUNDARY", "WORD_BOUNDARY", "BETWEEN_WORDS", 
			"CLASSREF", "INTERSECTION", "INTERSECTION_NOT", "TRANSFORMING", "CLASS_DECL", 
			"FEATURE_DECL", "SYLLABLE_FEATURE", "DIACRITIC_DECL", "DIA_BEFORE", "DIA_FIRST", 
			"DIA_FLOATING", "SYMBOL_DECL", "SYLLABLE_DECL", "EXPLICIT_SYLLABLES", 
			"CLEAR_SYLLABLES", "ANY_SYLLABLE", "DEROMANIZER", "ROMANIZER", "ALL_MATCHING", 
			"FIRST_MATCHING", "LITERAL", "LTR", "RTL", "PROPAGATE", "CLEANUP", "NUMBER", 
			"NAME", "STR1", "STR", "CHAR", "DIGIT", "ANY", "COMMENT_START"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'_'", null, null, "'('", "')'", 
			"'*'", "'['", "']'", "'{'", "'}'", "'+'", "'?'", "'-'", "':'", "'~'", 
			"'!'", "'.'", "'$'", "'$$'", "'@'", "'&'", "'&!'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "SEP", "CHANGE", "CONDITION", "EXCLUSION", "ANCHOR", 
			"NEWLINE", "WHITESPACE", "O_PAREN", "C_PAREN", "NULL", "MATRIX_START", 
			"MATRIX_END", "LIST_START", "LIST_END", "AT_LEAST_ONE", "OPTIONAL", "HYPHEN", 
			"RULE_START", "INEXACT", "NEGATION", "SYLLABLE_BOUNDARY", "WORD_BOUNDARY", 
			"BETWEEN_WORDS", "CLASSREF", "INTERSECTION", "INTERSECTION_NOT", "TRANSFORMING", 
			"CLASS_DECL", "FEATURE_DECL", "SYLLABLE_FEATURE", "DIACRITIC_DECL", "DIA_BEFORE", 
			"DIA_FIRST", "DIA_FLOATING", "SYMBOL_DECL", "SYLLABLE_DECL", "EXPLICIT_SYLLABLES", 
			"CLEAR_SYLLABLES", "ANY_SYLLABLE", "DEROMANIZER", "ROMANIZER", "ALL_MATCHING", 
			"FIRST_MATCHING", "LITERAL", "LTR", "RTL", "PROPAGATE", "CLEANUP", "NUMBER", 
			"NAME", "STR1", "STR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LscLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lsc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u024a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\5\2w\n\2\3\2"+
		"\3\2\7\2{\n\2\f\2\16\2~\13\2\3\2\3\2\3\3\3\3\5\3\u0084\n\3\3\4\5\4\u0087"+
		"\n\4\3\4\3\4\3\4\3\4\5\4\u008d\n\4\3\5\5\5\u0090\n\5\3\5\3\5\5\5\u0094"+
		"\n\5\3\6\5\6\u0097\n\6\3\6\3\6\3\6\3\6\5\6\u009d\n\6\3\7\3\7\3\b\5\b\u00a2"+
		"\n\b\3\b\3\b\3\b\5\b\u00a7\n\b\3\b\5\b\u00aa\n\b\3\t\6\t\u00ad\n\t\r\t"+
		"\16\t\u00ae\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00e5\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u00f5\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \5 \u010b\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\5!\u011f\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u0131\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#"+
		"\u0141\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\5$\u0157\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0165\n%\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0179\n&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u018b\n\'\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0197\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\5)\u01a3\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\5*\u01bb\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\5+\u01cf\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01d9\n,\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\5-\u01e3\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01f3"+
		"\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01fe\n/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u0209\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u021d\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u022d\n\62\3\63\6\63\u0230\n\63\r\63\16\63\u0231\3\64\6\64\u0235"+
		"\n\64\r\64\16\64\u0236\3\65\3\65\3\66\6\66\u023c\n\66\r\66\16\66\u023d"+
		"\3\67\3\67\38\38\39\39\39\59\u0247\n9\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o\2q\2s\2\3\2\7\4\2\f"+
		"\f\17\17\f\2\13\17\"\"\u0087\u0087\u00a2\u00a2\u1682\u1682\u2002\u200c"+
		"\u202a\u202b\u2031\u2031\u2061\u2061\u3002\u3002\5\2\62;C\\c|\3\2\62;"+
		"\16\2\f\f\17\17\"#%&((*\61<<?B]_aa}}\177\u0080\2\u026d\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3v\3\2\2\2\5\u0081\3\2\2"+
		"\2\7\u0086\3\2\2\2\t\u008f\3\2\2\2\13\u0096\3\2\2\2\r\u009e\3\2\2\2\17"+
		"\u00a1\3\2\2\2\21\u00ac\3\2\2\2\23\u00b0\3\2\2\2\25\u00b2\3\2\2\2\27\u00b4"+
		"\3\2\2\2\31\u00b6\3\2\2\2\33\u00b8\3\2\2\2\35\u00ba\3\2\2\2\37\u00bc\3"+
		"\2\2\2!\u00be\3\2\2\2#\u00c0\3\2\2\2%\u00c2\3\2\2\2\'\u00c4\3\2\2\2)\u00c6"+
		"\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00ce\3\2\2\2"+
		"\63\u00d1\3\2\2\2\65\u00d3\3\2\2\2\67\u00d5\3\2\2\29\u00d8\3\2\2\2;\u00e4"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u010a\3\2\2\2A\u011e\3\2\2\2C\u0130\3\2\2\2E"+
		"\u0140\3\2\2\2G\u0156\3\2\2\2I\u0164\3\2\2\2K\u0178\3\2\2\2M\u018a\3\2"+
		"\2\2O\u0196\3\2\2\2Q\u01a2\3\2\2\2S\u01ba\3\2\2\2U\u01ce\3\2\2\2W\u01d8"+
		"\3\2\2\2Y\u01e2\3\2\2\2[\u01f2\3\2\2\2]\u01fd\3\2\2\2_\u0208\3\2\2\2a"+
		"\u021c\3\2\2\2c\u022c\3\2\2\2e\u022f\3\2\2\2g\u0234\3\2\2\2i\u0238\3\2"+
		"\2\2k\u023b\3\2\2\2m\u023f\3\2\2\2o\u0241\3\2\2\2q\u0246\3\2\2\2s\u0248"+
		"\3\2\2\2uw\5\21\t\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2x|\5s:\2y{\n\2\2\2zy"+
		"\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\b\2\2\2\u0080\4\3\2\2\2\u0081\u0083\7.\2\2\u0082\u0084\5\21\t\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\6\3\2\2\2\u0085\u0087\5\21\t"+
		"\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\7?\2\2\u0089\u008a\7@\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5\21\t\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\b\3\2\2\2\u008e\u0090\5\21\t"+
		"\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093"+
		"\7\61\2\2\u0092\u0094\5\21\t\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\n\3\2\2\2\u0095\u0097\5\21\t\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\61\2\2\u0099\u009a\7\61\2\2"+
		"\u009a\u009c\3\2\2\2\u009b\u009d\5\21\t\2\u009c\u009b\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\f\3\2\2\2\u009e\u009f\7a\2\2\u009f\16\3\2\2\2\u00a0\u00a2"+
		"\5\21\t\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\3\2\2\2"+
		"\u00a3\u00a4\7\17\2\2\u00a4\u00a7\7\f\2\2\u00a5\u00a7\7\f\2\2\u00a6\u00a3"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\5\21\t\2"+
		"\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\20\3\2\2\2\u00ab\u00ad"+
		"\t\3\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\22\3\2\2\2\u00b0\u00b1\7*\2\2\u00b1\24\3\2\2\2\u00b2"+
		"\u00b3\7+\2\2\u00b3\26\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5\30\3\2\2\2\u00b6"+
		"\u00b7\7]\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7_\2\2\u00b9\34\3\2\2\2\u00ba"+
		"\u00bb\7}\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7\177\2\2\u00bd \3\2\2\2\u00be"+
		"\u00bf\7-\2\2\u00bf\"\3\2\2\2\u00c0\u00c1\7A\2\2\u00c1$\3\2\2\2\u00c2"+
		"\u00c3\7/\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7<\2\2\u00c5(\3\2\2\2\u00c6\u00c7"+
		"\7\u0080\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9,\3\2\2\2\u00ca\u00cb"+
		"\7\60\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7&\2\2\u00cd\60\3\2\2\2\u00ce\u00cf"+
		"\7&\2\2\u00cf\u00d0\7&\2\2\u00d0\62\3\2\2\2\u00d1\u00d2\7B\2\2\u00d2\64"+
		"\3\2\2\2\u00d3\u00d4\7(\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\7(\2\2\u00d6"+
		"\u00d7\7#\2\2\u00d78\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9:\3\2\2\2\u00da\u00db"+
		"\7E\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7u\2\2\u00de"+
		"\u00e5\7u\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7c\2\2"+
		"\u00e2\u00e3\7u\2\2\u00e3\u00e5\7u\2\2\u00e4\u00da\3\2\2\2\u00e4\u00df"+
		"\3\2\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7H\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9"+
		"\7c\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7t\2\2\u00ec"+
		"\u00f5\7g\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7c\2\2"+
		"\u00f0\u00f1\7v\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f5"+
		"\7g\2\2\u00f4\u00e6\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f5>\3\2\2\2\u00f6\u00f7"+
		"\7*\2\2\u00f7\u00f8\7U\2\2\u00f8\u00f9\7{\2\2\u00f9\u00fa\7n\2\2\u00fa"+
		"\u00fb\7n\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7d\2\2\u00fd\u00fe\7n\2\2"+
		"\u00fe\u00ff\7g\2\2\u00ff\u010b\7+\2\2\u0100\u0101\7*\2\2\u0101\u0102"+
		"\7u\2\2\u0102\u0103\7{\2\2\u0103\u0104\7n\2\2\u0104\u0105\7n\2\2\u0105"+
		"\u0106\7c\2\2\u0106\u0107\7d\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2"+
		"\u0109\u010b\7+\2\2\u010a\u00f6\3\2\2\2\u010a\u0100\3\2\2\2\u010b@\3\2"+
		"\2\2\u010c\u010d\7F\2\2\u010d\u010e\7k\2\2\u010e\u010f\7c\2\2\u010f\u0110"+
		"\7e\2\2\u0110\u0111\7t\2\2\u0111\u0112\7k\2\2\u0112\u0113\7v\2\2\u0113"+
		"\u0114\7k\2\2\u0114\u011f\7e\2\2\u0115\u0116\7f\2\2\u0116\u0117\7k\2\2"+
		"\u0117\u0118\7c\2\2\u0118\u0119\7e\2\2\u0119\u011a\7t\2\2\u011a\u011b"+
		"\7k\2\2\u011b\u011c\7v\2\2\u011c\u011d\7k\2\2\u011d\u011f\7e\2\2\u011e"+
		"\u010c\3\2\2\2\u011e\u0115\3\2\2\2\u011fB\3\2\2\2\u0120\u0121\7*\2\2\u0121"+
		"\u0122\7D\2\2\u0122\u0123\7g\2\2\u0123\u0124\7h\2\2\u0124\u0125\7q\2\2"+
		"\u0125\u0126\7t\2\2\u0126\u0127\7g\2\2\u0127\u0131\7+\2\2\u0128\u0129"+
		"\7*\2\2\u0129\u012a\7d\2\2\u012a\u012b\7g\2\2\u012b\u012c\7h\2\2\u012c"+
		"\u012d\7q\2\2\u012d\u012e\7t\2\2\u012e\u012f\7g\2\2\u012f\u0131\7+\2\2"+
		"\u0130\u0120\3\2\2\2\u0130\u0128\3\2\2\2\u0131D\3\2\2\2\u0132\u0133\7"+
		"*\2\2\u0133\u0134\7H\2\2\u0134\u0135\7k\2\2\u0135\u0136\7t\2\2\u0136\u0137"+
		"\7u\2\2\u0137\u0138\7v\2\2\u0138\u0141\7+\2\2\u0139\u013a\7*\2\2\u013a"+
		"\u013b\7h\2\2\u013b\u013c\7k\2\2\u013c\u013d\7t\2\2\u013d\u013e\7u\2\2"+
		"\u013e\u013f\7v\2\2\u013f\u0141\7+\2\2\u0140\u0132\3\2\2\2\u0140\u0139"+
		"\3\2\2\2\u0141F\3\2\2\2\u0142\u0143\7*\2\2\u0143\u0144\7H\2\2\u0144\u0145"+
		"\7n\2\2\u0145\u0146\7q\2\2\u0146\u0147\7c\2\2\u0147\u0148\7v\2\2\u0148"+
		"\u0149\7k\2\2\u0149\u014a\7p\2\2\u014a\u014b\7i\2\2\u014b\u0157\7+\2\2"+
		"\u014c\u014d\7*\2\2\u014d\u014e\7h\2\2\u014e\u014f\7n\2\2\u014f\u0150"+
		"\7q\2\2\u0150\u0151\7c\2\2\u0151\u0152\7v\2\2\u0152\u0153\7k\2\2\u0153"+
		"\u0154\7p\2\2\u0154\u0155\7i\2\2\u0155\u0157\7+\2\2\u0156\u0142\3\2\2"+
		"\2\u0156\u014c\3\2\2\2\u0157H\3\2\2\2\u0158\u0159\7U\2\2\u0159\u015a\7"+
		"{\2\2\u015a\u015b\7o\2\2\u015b\u015c\7d\2\2\u015c\u015d\7q\2\2\u015d\u0165"+
		"\7n\2\2\u015e\u015f\7u\2\2\u015f\u0160\7{\2\2\u0160\u0161\7o\2\2\u0161"+
		"\u0162\7d\2\2\u0162\u0163\7q\2\2\u0163\u0165\7n\2\2\u0164\u0158\3\2\2"+
		"\2\u0164\u015e\3\2\2\2\u0165J\3\2\2\2\u0166\u0167\7U\2\2\u0167\u0168\7"+
		"{\2\2\u0168\u0169\7n\2\2\u0169\u016a\7n\2\2\u016a\u016b\7c\2\2\u016b\u016c"+
		"\7d\2\2\u016c\u016d\7n\2\2\u016d\u016e\7g\2\2\u016e\u0179\7u\2\2\u016f"+
		"\u0170\7u\2\2\u0170\u0171\7{\2\2\u0171\u0172\7n\2\2\u0172\u0173\7n\2\2"+
		"\u0173\u0174\7c\2\2\u0174\u0175\7d\2\2\u0175\u0176\7n\2\2\u0176\u0177"+
		"\7g\2\2\u0177\u0179\7u\2\2\u0178\u0166\3\2\2\2\u0178\u016f\3\2\2\2\u0179"+
		"L\3\2\2\2\u017a\u017b\7G\2\2\u017b\u017c\7z\2\2\u017c\u017d\7r\2\2\u017d"+
		"\u017e\7n\2\2\u017e\u017f\7k\2\2\u017f\u0180\7e\2\2\u0180\u0181\7k\2\2"+
		"\u0181\u018b\7v\2\2\u0182\u0183\7g\2\2\u0183\u0184\7z\2\2\u0184\u0185"+
		"\7r\2\2\u0185\u0186\7n\2\2\u0186\u0187\7k\2\2\u0187\u0188\7e\2\2\u0188"+
		"\u0189\7k\2\2\u0189\u018b\7v\2\2\u018a\u017a\3\2\2\2\u018a\u0182\3\2\2"+
		"\2\u018bN\3\2\2\2\u018c\u018d\7E\2\2\u018d\u018e\7n\2\2\u018e\u018f\7"+
		"g\2\2\u018f\u0190\7c\2\2\u0190\u0197\7t\2\2\u0191\u0192\7e\2\2\u0192\u0193"+
		"\7n\2\2\u0193\u0194\7g\2\2\u0194\u0195\7c\2\2\u0195\u0197\7t\2\2\u0196"+
		"\u018c\3\2\2\2\u0196\u0191\3\2\2\2\u0197P\3\2\2\2\u0198\u0199\7>\2\2\u0199"+
		"\u019a\7U\2\2\u019a\u019b\7{\2\2\u019b\u019c\7n\2\2\u019c\u01a3\7@\2\2"+
		"\u019d\u019e\7>\2\2\u019e\u019f\7u\2\2\u019f\u01a0\7{\2\2\u01a0\u01a1"+
		"\7n\2\2\u01a1\u01a3\7@\2\2\u01a2\u0198\3\2\2\2\u01a2\u019d\3\2\2\2\u01a3"+
		"R\3\2\2\2\u01a4\u01a5\7F\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7t\2\2\u01a7"+
		"\u01a8\7q\2\2\u01a8\u01a9\7o\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7p\2\2"+
		"\u01ab\u01ac\7k\2\2\u01ac\u01ad\7|\2\2\u01ad\u01ae\7g\2\2\u01ae\u01bb"+
		"\7t\2\2\u01af\u01b0\7f\2\2\u01b0\u01b1\7g\2\2\u01b1\u01b2\7t\2\2\u01b2"+
		"\u01b3\7q\2\2\u01b3\u01b4\7o\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6\7p\2\2"+
		"\u01b6\u01b7\7k\2\2\u01b7\u01b8\7|\2\2\u01b8\u01b9\7g\2\2\u01b9\u01bb"+
		"\7t\2\2\u01ba\u01a4\3\2\2\2\u01ba\u01af\3\2\2\2\u01bbT\3\2\2\2\u01bc\u01bd"+
		"\7T\2\2\u01bd\u01be\7q\2\2\u01be\u01bf\7o\2\2\u01bf\u01c0\7c\2\2\u01c0"+
		"\u01c1\7p\2\2\u01c1\u01c2\7k\2\2\u01c2\u01c3\7|\2\2\u01c3\u01c4\7g\2\2"+
		"\u01c4\u01cf\7t\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7q\2\2\u01c7\u01c8"+
		"\7o\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb\7k\2\2\u01cb"+
		"\u01cc\7|\2\2\u01cc\u01cd\7g\2\2\u01cd\u01cf\7t\2\2\u01ce\u01bc\3\2\2"+
		"\2\u01ce\u01c5\3\2\2\2\u01cfV\3\2\2\2\u01d0\u01d1\7V\2\2\u01d1\u01d2\7"+
		"j\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d9\7p\2\2\u01d4\u01d5\7v\2\2\u01d5\u01d6"+
		"\7j\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d9\7p\2\2\u01d8\u01d0\3\2\2\2\u01d8"+
		"\u01d4\3\2\2\2\u01d9X\3\2\2\2\u01da\u01db\7G\2\2\u01db\u01dc\7n\2\2\u01dc"+
		"\u01dd\7u\2\2\u01dd\u01e3\7g\2\2\u01de\u01df\7g\2\2\u01df\u01e0\7n\2\2"+
		"\u01e0\u01e1\7u\2\2\u01e1\u01e3\7g\2\2\u01e2\u01da\3\2\2\2\u01e2\u01de"+
		"\3\2\2\2\u01e3Z\3\2\2\2\u01e4\u01e5\7N\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7"+
		"\7v\2\2\u01e7\u01e8\7g\2\2\u01e8\u01e9\7t\2\2\u01e9\u01ea\7c\2\2\u01ea"+
		"\u01f3\7n\2\2\u01eb\u01ec\7n\2\2\u01ec\u01ed\7k\2\2\u01ed\u01ee\7v\2\2"+
		"\u01ee\u01ef\7g\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7c\2\2\u01f1\u01f3"+
		"\7n\2\2\u01f2\u01e4\3\2\2\2\u01f2\u01eb\3\2\2\2\u01f3\\\3\2\2\2\u01f4"+
		"\u01f5\7N\2\2\u01f5\u01f6\7V\2\2\u01f6\u01fe\7T\2\2\u01f7\u01f8\7N\2\2"+
		"\u01f8\u01f9\7v\2\2\u01f9\u01fe\7t\2\2\u01fa\u01fb\7n\2\2\u01fb\u01fc"+
		"\7v\2\2\u01fc\u01fe\7t\2\2\u01fd\u01f4\3\2\2\2\u01fd\u01f7\3\2\2\2\u01fd"+
		"\u01fa\3\2\2\2\u01fe^\3\2\2\2\u01ff\u0200\7T\2\2\u0200\u0201\7V\2\2\u0201"+
		"\u0209\7N\2\2\u0202\u0203\7T\2\2\u0203\u0204\7v\2\2\u0204\u0209\7n\2\2"+
		"\u0205\u0206\7t\2\2\u0206\u0207\7v\2\2\u0207\u0209\7n\2\2\u0208\u01ff"+
		"\3\2\2\2\u0208\u0202\3\2\2\2\u0208\u0205\3\2\2\2\u0209`\3\2\2\2\u020a"+
		"\u020b\7R\2\2\u020b\u020c\7t\2\2\u020c\u020d\7q\2\2\u020d\u020e\7r\2\2"+
		"\u020e\u020f\7c\2\2\u020f\u0210\7i\2\2\u0210\u0211\7c\2\2\u0211\u0212"+
		"\7v\2\2\u0212\u021d\7g\2\2\u0213\u0214\7r\2\2\u0214\u0215\7t\2\2\u0215"+
		"\u0216\7q\2\2\u0216\u0217\7r\2\2\u0217\u0218\7c\2\2\u0218\u0219\7i\2\2"+
		"\u0219\u021a\7c\2\2\u021a\u021b\7v\2\2\u021b\u021d\7g\2\2\u021c\u020a"+
		"\3\2\2\2\u021c\u0213\3\2\2\2\u021db\3\2\2\2\u021e\u021f\7E\2\2\u021f\u0220"+
		"\7n\2\2\u0220\u0221\7g\2\2\u0221\u0222\7c\2\2\u0222\u0223\7p\2\2\u0223"+
		"\u0224\7w\2\2\u0224\u022d\7r\2\2\u0225\u0226\7e\2\2\u0226\u0227\7n\2\2"+
		"\u0227\u0228\7g\2\2\u0228\u0229\7c\2\2\u0229\u022a\7p\2\2\u022a\u022b"+
		"\7w\2\2\u022b\u022d\7r\2\2\u022c\u021e\3\2\2\2\u022c\u0225\3\2\2\2\u022d"+
		"d\3\2\2\2\u022e\u0230\5o8\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232f\3\2\2\2\u0233\u0235\5m\67\2"+
		"\u0234\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237h\3\2\2\2\u0238\u0239\5q9\2\u0239j\3\2\2\2\u023a\u023c\5"+
		"q9\2\u023b\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023el\3\2\2\2\u023f\u0240\t\4\2\2\u0240n\3\2\2\2\u0241"+
		"\u0242\t\5\2\2\u0242p\3\2\2\2\u0243\u0244\7^\2\2\u0244\u0247\13\2\2\2"+
		"\u0245\u0247\n\6\2\2\u0246\u0243\3\2\2\2\u0246\u0245\3\2\2\2\u0247r\3"+
		"\2\2\2\u0248\u0249\7%\2\2\u0249t\3\2\2\2)\2v|\u0083\u0086\u008c\u008f"+
		"\u0093\u0096\u009c\u00a1\u00a6\u00a9\u00ae\u00e4\u00f4\u010a\u011e\u0130"+
		"\u0140\u0156\u0164\u0178\u018a\u0196\u01a2\u01ba\u01ce\u01d8\u01e2\u01f2"+
		"\u01fd\u0208\u021c\u022c\u0231\u0236\u023d\u0246\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}