// Generated from Lsc.g4 by ANTLR 4.7.2
package com.meamoria.lexurgy.sc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LscParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SEP=2, CHANGE=3, CONDITION=4, EXCLUSION=5, ANCHOR=6, NEWLINE=7, 
		WHITESPACE=8, OPAREN=9, CPAREN=10, NULL=11, MATSTART=12, MATEND=13, LISTSTART=14, 
		LISTEND=15, ATLEASTONE=16, OPTIONAL=17, HYPHEN=18, RULESTART=19, NEGATION=20, 
		WORDBOUNDARY=21, CLASSREF=22, CLASSDECL=23, FEATUREDECL=24, DIACRITIC=25, 
		DIABEFORE=26, DIAFLOATING=27, SYMBOL=28, DEROMANIZER=29, ROMANIZER=30, 
		SUBRULE=31, PROPAGATE=32, FEATURE=33, VALUE=34, NUMBER=35, STR1=36, STR=37;
	public static final int
		RULE_lscfile = 0, RULE_classdecl = 1, RULE_classelement = 2, RULE_featuredecl = 3, 
		RULE_nullalias = 4, RULE_diacritic = 5, RULE_symbol = 6, RULE_symbolname = 7, 
		RULE_deromanizer = 8, RULE_romanizer = 9, RULE_interromanizer = 10, RULE_changerule = 11, 
		RULE_subrules = 12, RULE_subrule = 13, RULE_rulename = 14, RULE_ruleexpression = 15, 
		RULE_condition = 16, RULE_exclusion = 17, RULE_rulefrom = 18, RULE_ruleto = 19, 
		RULE_environlist = 20, RULE_ruleenviron = 21, RULE_boundarybefore = 22, 
		RULE_boundaryafter = 23, RULE_rulebefore = 24, RULE_ruleafter = 25, RULE_ruleelement = 26, 
		RULE_rulesequence = 27, RULE_sequenceelement = 28, RULE_rulecapture = 29, 
		RULE_rulerepeater = 30, RULE_rulegroup = 31, RULE_rulelist = 32, RULE_simpleelement = 33, 
		RULE_classref = 34, RULE_captureref = 35, RULE_fancymatrix = 36, RULE_fancyvalue = 37, 
		RULE_negvalue = 38, RULE_absentfeature = 39, RULE_featurevariable = 40, 
		RULE_empty = 41, RULE_repeatertype = 42, RULE_matrix = 43, RULE_feature = 44, 
		RULE_value = 45, RULE_text = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"lscfile", "classdecl", "classelement", "featuredecl", "nullalias", "diacritic", 
			"symbol", "symbolname", "deromanizer", "romanizer", "interromanizer", 
			"changerule", "subrules", "subrule", "rulename", "ruleexpression", "condition", 
			"exclusion", "rulefrom", "ruleto", "environlist", "ruleenviron", "boundarybefore", 
			"boundaryafter", "rulebefore", "ruleafter", "ruleelement", "rulesequence", 
			"sequenceelement", "rulecapture", "rulerepeater", "rulegroup", "rulelist", 
			"simpleelement", "classref", "captureref", "fancymatrix", "fancyvalue", 
			"negvalue", "absentfeature", "featurevariable", "empty", "repeatertype", 
			"matrix", "feature", "value", "text"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'_'", null, null, "'('", "')'", 
			"'*'", "'['", "']'", "'{'", "'}'", "'+'", "'?'", "'-'", "':'", "'!'", 
			"'$'", "'@'", "'Class'", "'Feature'", "'Diacritic'", "'(before)'", "'(floating)'", 
			"'Symbol'", "'Deromanizer'", "'Romanizer'", "'Then'", "'propagate'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "SEP", "CHANGE", "CONDITION", "EXCLUSION", "ANCHOR", 
			"NEWLINE", "WHITESPACE", "OPAREN", "CPAREN", "NULL", "MATSTART", "MATEND", 
			"LISTSTART", "LISTEND", "ATLEASTONE", "OPTIONAL", "HYPHEN", "RULESTART", 
			"NEGATION", "WORDBOUNDARY", "CLASSREF", "CLASSDECL", "FEATUREDECL", "DIACRITIC", 
			"DIABEFORE", "DIAFLOATING", "SYMBOL", "DEROMANIZER", "ROMANIZER", "SUBRULE", 
			"PROPAGATE", "FEATURE", "VALUE", "NUMBER", "STR1", "STR"
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

	@Override
	public String getGrammarFileName() { return "Lsc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LscParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LscfileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LscParser.EOF, 0); }
		public List<FeaturedeclContext> featuredecl() {
			return getRuleContexts(FeaturedeclContext.class);
		}
		public FeaturedeclContext featuredecl(int i) {
			return getRuleContext(FeaturedeclContext.class,i);
		}
		public List<DiacriticContext> diacritic() {
			return getRuleContexts(DiacriticContext.class);
		}
		public DiacriticContext diacritic(int i) {
			return getRuleContext(DiacriticContext.class,i);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<ClassdeclContext> classdecl() {
			return getRuleContexts(ClassdeclContext.class);
		}
		public ClassdeclContext classdecl(int i) {
			return getRuleContext(ClassdeclContext.class,i);
		}
		public DeromanizerContext deromanizer() {
			return getRuleContext(DeromanizerContext.class,0);
		}
		public List<ChangeruleContext> changerule() {
			return getRuleContexts(ChangeruleContext.class);
		}
		public ChangeruleContext changerule(int i) {
			return getRuleContext(ChangeruleContext.class,i);
		}
		public RomanizerContext romanizer() {
			return getRuleContext(RomanizerContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LscParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LscParser.NEWLINE, i);
		}
		public List<InterromanizerContext> interromanizer() {
			return getRuleContexts(InterromanizerContext.class);
		}
		public InterromanizerContext interromanizer(int i) {
			return getRuleContext(InterromanizerContext.class,i);
		}
		public LscfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lscfile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitLscfile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LscfileContext lscfile() throws RecognitionException {
		LscfileContext _localctx = new LscfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lscfile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FEATUREDECL) {
				{
				{
				setState(94);
				featuredecl();
				setState(96); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(95);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(98); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIACRITIC) {
				{
				{
				setState(105);
				diacritic();
				setState(107); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(106);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(109); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL) {
				{
				{
				setState(116);
				symbol();
				setState(118); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(117);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(120); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASSDECL) {
				{
				{
				setState(127);
				classdecl();
				setState(129); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(128);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(131); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEROMANIZER) {
				{
				setState(138);
				deromanizer();
				setState(140); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(139);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(142); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(146);
				changerule();
				}
			}

			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(149);
							match(NEWLINE);
							}
							}
							setState(152); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						setState(156);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case VALUE:
							{
							setState(154);
							changerule();
							}
							break;
						case ROMANIZER:
							{
							setState(155);
							interromanizer();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(163);
					match(NEWLINE);
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(168);
				changerule();
				}
				break;
			}
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(171);
					match(NEWLINE);
					}
					}
					setState(174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(176);
				romanizer();
				}
				break;
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(179);
				match(NEWLINE);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdeclContext extends ParserRuleContext {
		public TerminalNode CLASSDECL() { return getToken(LscParser.CLASSDECL, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(LscParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LscParser.WHITESPACE, i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode LISTSTART() { return getToken(LscParser.LISTSTART, 0); }
		public List<ClasselementContext> classelement() {
			return getRuleContexts(ClasselementContext.class);
		}
		public ClasselementContext classelement(int i) {
			return getRuleContext(ClasselementContext.class,i);
		}
		public TerminalNode LISTEND() { return getToken(LscParser.LISTEND, 0); }
		public List<TerminalNode> SEP() { return getTokens(LscParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LscParser.SEP, i);
		}
		public ClassdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitClassdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclContext classdecl() throws RecognitionException {
		ClassdeclContext _localctx = new ClassdeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(CLASSDECL);
			setState(188);
			match(WHITESPACE);
			setState(189);
			value();
			setState(190);
			match(WHITESPACE);
			setState(191);
			match(LISTSTART);
			setState(192);
			classelement();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(193);
				match(SEP);
				setState(194);
				classelement();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(LISTEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasselementContext extends ParserRuleContext {
		public ClassrefContext classref() {
			return getRuleContext(ClassrefContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ClasselementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classelement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitClasselement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasselementContext classelement() throws RecognitionException {
		ClasselementContext _localctx = new ClasselementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classelement);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASSREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				classref();
				}
				break;
			case FEATURE:
			case VALUE:
			case STR1:
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				text();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeaturedeclContext extends ParserRuleContext {
		public TerminalNode FEATUREDECL() { return getToken(LscParser.FEATUREDECL, 0); }
		public TerminalNode WHITESPACE() { return getToken(LscParser.WHITESPACE, 0); }
		public FeatureContext feature() {
			return getRuleContext(FeatureContext.class,0);
		}
		public TerminalNode OPAREN() { return getToken(LscParser.OPAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode CPAREN() { return getToken(LscParser.CPAREN, 0); }
		public NullaliasContext nullalias() {
			return getRuleContext(NullaliasContext.class,0);
		}
		public List<TerminalNode> SEP() { return getTokens(LscParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LscParser.SEP, i);
		}
		public TerminalNode CHANGE() { return getToken(LscParser.CHANGE, 0); }
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public FeaturedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featuredecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitFeaturedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeaturedeclContext featuredecl() throws RecognitionException {
		FeaturedeclContext _localctx = new FeaturedeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_featuredecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(FEATUREDECL);
			setState(207);
			match(WHITESPACE);
			setState(208);
			feature();
			setState(209);
			match(OPAREN);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULL) {
				{
				setState(210);
				nullalias();
				setState(211);
				match(SEP);
				}
			}

			setState(215);
			value();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(216);
				match(SEP);
				setState(217);
				value();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(CPAREN);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHANGE) {
				{
				setState(224);
				match(CHANGE);
				setState(225);
				matrix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullaliasContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(LscParser.NULL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NullaliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullalias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitNullalias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullaliasContext nullalias() throws RecognitionException {
		NullaliasContext _localctx = new NullaliasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nullalias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(NULL);
			setState(229);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiacriticContext extends ParserRuleContext {
		public TerminalNode DIACRITIC() { return getToken(LscParser.DIACRITIC, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(LscParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LscParser.WHITESPACE, i);
		}
		public TerminalNode STR1() { return getToken(LscParser.STR1, 0); }
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public TerminalNode DIABEFORE() { return getToken(LscParser.DIABEFORE, 0); }
		public TerminalNode DIAFLOATING() { return getToken(LscParser.DIAFLOATING, 0); }
		public DiacriticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diacritic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitDiacritic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiacriticContext diacritic() throws RecognitionException {
		DiacriticContext _localctx = new DiacriticContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_diacritic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(DIACRITIC);
			setState(232);
			match(WHITESPACE);
			setState(233);
			match(STR1);
			setState(234);
			match(WHITESPACE);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIABEFORE) {
				{
				setState(235);
				match(DIABEFORE);
				setState(236);
				match(WHITESPACE);
				}
			}

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIAFLOATING) {
				{
				setState(239);
				match(DIAFLOATING);
				setState(240);
				match(WHITESPACE);
				}
			}

			setState(243);
			matrix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(LscParser.SYMBOL, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(LscParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LscParser.WHITESPACE, i);
		}
		public List<SymbolnameContext> symbolname() {
			return getRuleContexts(SymbolnameContext.class);
		}
		public SymbolnameContext symbolname(int i) {
			return getRuleContext(SymbolnameContext.class,i);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public List<TerminalNode> SEP() { return getTokens(LscParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LscParser.SEP, i);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(SYMBOL);
			setState(246);
			match(WHITESPACE);
			setState(247);
			symbolname();
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEP:
			case NEWLINE:
				{
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEP) {
					{
					{
					setState(248);
					match(SEP);
					setState(249);
					symbolname();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case WHITESPACE:
				{
				setState(255);
				match(WHITESPACE);
				setState(256);
				matrix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolnameContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public SymbolnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitSymbolname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolnameContext symbolname() throws RecognitionException {
		SymbolnameContext _localctx = new SymbolnameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_symbolname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			text();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeromanizerContext extends ParserRuleContext {
		public TerminalNode DEROMANIZER() { return getToken(LscParser.DEROMANIZER, 0); }
		public TerminalNode RULESTART() { return getToken(LscParser.RULESTART, 0); }
		public TerminalNode NEWLINE() { return getToken(LscParser.NEWLINE, 0); }
		public SubrulesContext subrules() {
			return getRuleContext(SubrulesContext.class,0);
		}
		public DeromanizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deromanizer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitDeromanizer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeromanizerContext deromanizer() throws RecognitionException {
		DeromanizerContext _localctx = new DeromanizerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_deromanizer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(DEROMANIZER);
			setState(262);
			match(RULESTART);
			setState(263);
			match(NEWLINE);
			setState(264);
			subrules();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RomanizerContext extends ParserRuleContext {
		public TerminalNode ROMANIZER() { return getToken(LscParser.ROMANIZER, 0); }
		public TerminalNode RULESTART() { return getToken(LscParser.RULESTART, 0); }
		public TerminalNode NEWLINE() { return getToken(LscParser.NEWLINE, 0); }
		public SubrulesContext subrules() {
			return getRuleContext(SubrulesContext.class,0);
		}
		public RomanizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_romanizer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRomanizer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RomanizerContext romanizer() throws RecognitionException {
		RomanizerContext _localctx = new RomanizerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_romanizer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ROMANIZER);
			setState(267);
			match(RULESTART);
			setState(268);
			match(NEWLINE);
			setState(269);
			subrules();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterromanizerContext extends ParserRuleContext {
		public TerminalNode ROMANIZER() { return getToken(LscParser.ROMANIZER, 0); }
		public TerminalNode HYPHEN() { return getToken(LscParser.HYPHEN, 0); }
		public RulenameContext rulename() {
			return getRuleContext(RulenameContext.class,0);
		}
		public TerminalNode RULESTART() { return getToken(LscParser.RULESTART, 0); }
		public TerminalNode NEWLINE() { return getToken(LscParser.NEWLINE, 0); }
		public SubrulesContext subrules() {
			return getRuleContext(SubrulesContext.class,0);
		}
		public InterromanizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interromanizer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitInterromanizer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterromanizerContext interromanizer() throws RecognitionException {
		InterromanizerContext _localctx = new InterromanizerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interromanizer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ROMANIZER);
			setState(272);
			match(HYPHEN);
			setState(273);
			rulename();
			setState(274);
			match(RULESTART);
			setState(275);
			match(NEWLINE);
			setState(276);
			subrules();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeruleContext extends ParserRuleContext {
		public RulenameContext rulename() {
			return getRuleContext(RulenameContext.class,0);
		}
		public TerminalNode RULESTART() { return getToken(LscParser.RULESTART, 0); }
		public TerminalNode NEWLINE() { return getToken(LscParser.NEWLINE, 0); }
		public SubrulesContext subrules() {
			return getRuleContext(SubrulesContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(LscParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LscParser.WHITESPACE, i);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public TerminalNode PROPAGATE() { return getToken(LscParser.PROPAGATE, 0); }
		public ChangeruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changerule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitChangerule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangeruleContext changerule() throws RecognitionException {
		ChangeruleContext _localctx = new ChangeruleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_changerule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			rulename();
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(279);
				match(WHITESPACE);
				setState(280);
				matrix();
				}
				break;
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(283);
				match(WHITESPACE);
				setState(284);
				match(PROPAGATE);
				}
			}

			setState(287);
			match(RULESTART);
			setState(288);
			match(NEWLINE);
			setState(289);
			subrules();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubrulesContext extends ParserRuleContext {
		public List<SubruleContext> subrule() {
			return getRuleContexts(SubruleContext.class);
		}
		public SubruleContext subrule(int i) {
			return getRuleContext(SubruleContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LscParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LscParser.NEWLINE, i);
		}
		public List<TerminalNode> SUBRULE() { return getTokens(LscParser.SUBRULE); }
		public TerminalNode SUBRULE(int i) {
			return getToken(LscParser.SUBRULE, i);
		}
		public List<TerminalNode> RULESTART() { return getTokens(LscParser.RULESTART); }
		public TerminalNode RULESTART(int i) {
			return getToken(LscParser.RULESTART, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(LscParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LscParser.WHITESPACE, i);
		}
		public SubrulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrules; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitSubrules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrulesContext subrules() throws RecognitionException {
		SubrulesContext _localctx = new SubrulesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subrules);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			subrule();
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					match(NEWLINE);
					setState(293);
					match(SUBRULE);
					setState(294);
					match(RULESTART);
					setState(295);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WHITESPACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(296);
					subrule();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubruleContext extends ParserRuleContext {
		public List<RuleexpressionContext> ruleexpression() {
			return getRuleContexts(RuleexpressionContext.class);
		}
		public RuleexpressionContext ruleexpression(int i) {
			return getRuleContext(RuleexpressionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LscParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LscParser.NEWLINE, i);
		}
		public SubruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitSubrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubruleContext subrule() throws RecognitionException {
		SubruleContext _localctx = new SubruleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subrule);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			ruleexpression();
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					match(NEWLINE);
					setState(304);
					ruleexpression();
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulenameContext extends ParserRuleContext {
		public List<TerminalNode> VALUE() { return getTokens(LscParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(LscParser.VALUE, i);
		}
		public List<TerminalNode> HYPHEN() { return getTokens(LscParser.HYPHEN); }
		public TerminalNode HYPHEN(int i) {
			return getToken(LscParser.HYPHEN, i);
		}
		public RulenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRulename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulenameContext rulename() throws RecognitionException {
		RulenameContext _localctx = new RulenameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rulename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(VALUE);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HYPHEN) {
				{
				{
				setState(311);
				match(HYPHEN);
				setState(312);
				match(VALUE);
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleexpressionContext extends ParserRuleContext {
		public RulefromContext rulefrom() {
			return getRuleContext(RulefromContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(LscParser.CHANGE, 0); }
		public RuletoContext ruleto() {
			return getRuleContext(RuletoContext.class,0);
		}
		public TerminalNode CONDITION() { return getToken(LscParser.CONDITION, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode EXCLUSION() { return getToken(LscParser.EXCLUSION, 0); }
		public ExclusionContext exclusion() {
			return getRuleContext(ExclusionContext.class,0);
		}
		public RuleexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleexpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRuleexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleexpressionContext ruleexpression() throws RecognitionException {
		RuleexpressionContext _localctx = new RuleexpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ruleexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			rulefrom();
			setState(319);
			match(CHANGE);
			setState(320);
			ruleto();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONDITION) {
				{
				setState(321);
				match(CONDITION);
				setState(322);
				condition();
				}
			}

			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUSION) {
				{
				setState(325);
				match(EXCLUSION);
				setState(326);
				exclusion();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public RuleenvironContext ruleenviron() {
			return getRuleContext(RuleenvironContext.class,0);
		}
		public EnvironlistContext environlist() {
			return getRuleContext(EnvironlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				ruleenviron();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				environlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusionContext extends ParserRuleContext {
		public RuleenvironContext ruleenviron() {
			return getRuleContext(RuleenvironContext.class,0);
		}
		public EnvironlistContext environlist() {
			return getRuleContext(EnvironlistContext.class,0);
		}
		public ExclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitExclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusionContext exclusion() throws RecognitionException {
		ExclusionContext _localctx = new ExclusionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exclusion);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				ruleenviron();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				environlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulefromContext extends ParserRuleContext {
		public RuleelementContext ruleelement() {
			return getRuleContext(RuleelementContext.class,0);
		}
		public RulefromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulefrom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRulefrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulefromContext rulefrom() throws RecognitionException {
		RulefromContext _localctx = new RulefromContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rulefrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			ruleelement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuletoContext extends ParserRuleContext {
		public RuleelementContext ruleelement() {
			return getRuleContext(RuleelementContext.class,0);
		}
		public RuletoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRuleto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuletoContext ruleto() throws RecognitionException {
		RuletoContext _localctx = new RuletoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ruleto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			ruleelement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironlistContext extends ParserRuleContext {
		public TerminalNode LISTSTART() { return getToken(LscParser.LISTSTART, 0); }
		public List<RuleenvironContext> ruleenviron() {
			return getRuleContexts(RuleenvironContext.class);
		}
		public RuleenvironContext ruleenviron(int i) {
			return getRuleContext(RuleenvironContext.class,i);
		}
		public TerminalNode LISTEND() { return getToken(LscParser.LISTEND, 0); }
		public List<TerminalNode> SEP() { return getTokens(LscParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LscParser.SEP, i);
		}
		public EnvironlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitEnvironlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironlistContext environlist() throws RecognitionException {
		EnvironlistContext _localctx = new EnvironlistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_environlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(LISTSTART);
			setState(342);
			ruleenviron();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(343);
				match(SEP);
				setState(344);
				ruleenviron();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(LISTEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleenvironContext extends ParserRuleContext {
		public TerminalNode ANCHOR() { return getToken(LscParser.ANCHOR, 0); }
		public BoundarybeforeContext boundarybefore() {
			return getRuleContext(BoundarybeforeContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(LscParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LscParser.WHITESPACE, i);
		}
		public RulebeforeContext rulebefore() {
			return getRuleContext(RulebeforeContext.class,0);
		}
		public RuleafterContext ruleafter() {
			return getRuleContext(RuleafterContext.class,0);
		}
		public BoundaryafterContext boundaryafter() {
			return getRuleContext(BoundaryafterContext.class,0);
		}
		public RuleenvironContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleenviron; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRuleenviron(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleenvironContext ruleenviron() throws RecognitionException {
		RuleenvironContext _localctx = new RuleenvironContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ruleenviron);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(352);
				boundarybefore();
				setState(353);
				match(WHITESPACE);
				}
				break;
			}
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAREN) | (1L << NULL) | (1L << MATSTART) | (1L << LISTSTART) | (1L << WORDBOUNDARY) | (1L << CLASSREF) | (1L << FEATURE) | (1L << VALUE) | (1L << STR1) | (1L << STR))) != 0)) {
				{
				setState(357);
				rulebefore();
				setState(358);
				match(WHITESPACE);
				}
			}

			setState(362);
			match(ANCHOR);
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(363);
				match(WHITESPACE);
				setState(364);
				ruleafter();
				}
				break;
			}
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(367);
				match(WHITESPACE);
				setState(368);
				boundaryafter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundarybeforeContext extends ParserRuleContext {
		public TerminalNode WORDBOUNDARY() { return getToken(LscParser.WORDBOUNDARY, 0); }
		public BoundarybeforeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundarybefore; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitBoundarybefore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundarybeforeContext boundarybefore() throws RecognitionException {
		BoundarybeforeContext _localctx = new BoundarybeforeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boundarybefore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(WORDBOUNDARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundaryafterContext extends ParserRuleContext {
		public TerminalNode WORDBOUNDARY() { return getToken(LscParser.WORDBOUNDARY, 0); }
		public BoundaryafterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundaryafter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitBoundaryafter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundaryafterContext boundaryafter() throws RecognitionException {
		BoundaryafterContext _localctx = new BoundaryafterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boundaryafter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(WORDBOUNDARY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulebeforeContext extends ParserRuleContext {
		public RuleelementContext ruleelement() {
			return getRuleContext(RuleelementContext.class,0);
		}
		public RulebeforeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulebefore; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRulebefore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulebeforeContext rulebefore() throws RecognitionException {
		RulebeforeContext _localctx = new RulebeforeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rulebefore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			ruleelement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleafterContext extends ParserRuleContext {
		public RuleelementContext ruleelement() {
			return getRuleContext(RuleelementContext.class,0);
		}
		public RuleafterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleafter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRuleafter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleafterContext ruleafter() throws RecognitionException {
		RuleafterContext _localctx = new RuleafterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ruleafter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			ruleelement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleelementContext extends ParserRuleContext {
		public RulecaptureContext rulecapture() {
			return getRuleContext(RulecaptureContext.class,0);
		}
		public RulerepeaterContext rulerepeater() {
			return getRuleContext(RulerepeaterContext.class,0);
		}
		public RulegroupContext rulegroup() {
			return getRuleContext(RulegroupContext.class,0);
		}
		public RulelistContext rulelist() {
			return getRuleContext(RulelistContext.class,0);
		}
		public SimpleelementContext simpleelement() {
			return getRuleContext(SimpleelementContext.class,0);
		}
		public RulesequenceContext rulesequence() {
			return getRuleContext(RulesequenceContext.class,0);
		}
		public RuleelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleelement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRuleelement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleelementContext ruleelement() throws RecognitionException {
		RuleelementContext _localctx = new RuleelementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ruleelement);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				rulecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				rulerepeater();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				rulegroup();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				rulelist();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(383);
				simpleelement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(384);
				rulesequence();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesequenceContext extends ParserRuleContext {
		public List<SequenceelementContext> sequenceelement() {
			return getRuleContexts(SequenceelementContext.class);
		}
		public SequenceelementContext sequenceelement(int i) {
			return getRuleContext(SequenceelementContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(LscParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LscParser.WHITESPACE, i);
		}
		public RulesequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulesequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRulesequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesequenceContext rulesequence() throws RecognitionException {
		RulesequenceContext _localctx = new RulesequenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rulesequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			sequenceelement();
			setState(390); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(388);
					match(WHITESPACE);
					setState(389);
					sequenceelement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(392); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceelementContext extends ParserRuleContext {
		public RulecaptureContext rulecapture() {
			return getRuleContext(RulecaptureContext.class,0);
		}
		public RulerepeaterContext rulerepeater() {
			return getRuleContext(RulerepeaterContext.class,0);
		}
		public RulegroupContext rulegroup() {
			return getRuleContext(RulegroupContext.class,0);
		}
		public RulelistContext rulelist() {
			return getRuleContext(RulelistContext.class,0);
		}
		public SimpleelementContext simpleelement() {
			return getRuleContext(SimpleelementContext.class,0);
		}
		public SequenceelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceelement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitSequenceelement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceelementContext sequenceelement() throws RecognitionException {
		SequenceelementContext _localctx = new SequenceelementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sequenceelement);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				rulecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				rulerepeater();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				rulegroup();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				rulelist();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				simpleelement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulecaptureContext extends ParserRuleContext {
		public CapturerefContext captureref() {
			return getRuleContext(CapturerefContext.class,0);
		}
		public RulegroupContext rulegroup() {
			return getRuleContext(RulegroupContext.class,0);
		}
		public RulelistContext rulelist() {
			return getRuleContext(RulelistContext.class,0);
		}
		public ClassrefContext classref() {
			return getRuleContext(ClassrefContext.class,0);
		}
		public FancymatrixContext fancymatrix() {
			return getRuleContext(FancymatrixContext.class,0);
		}
		public RulecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulecapture; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRulecapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulecaptureContext rulecapture() throws RecognitionException {
		RulecaptureContext _localctx = new RulecaptureContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rulecapture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAREN:
				{
				setState(401);
				rulegroup();
				}
				break;
			case LISTSTART:
				{
				setState(402);
				rulelist();
				}
				break;
			case CLASSREF:
				{
				setState(403);
				classref();
				}
				break;
			case MATSTART:
				{
				setState(404);
				fancymatrix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(407);
			captureref();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulerepeaterContext extends ParserRuleContext {
		public RepeatertypeContext repeatertype() {
			return getRuleContext(RepeatertypeContext.class,0);
		}
		public RulegroupContext rulegroup() {
			return getRuleContext(RulegroupContext.class,0);
		}
		public RulelistContext rulelist() {
			return getRuleContext(RulelistContext.class,0);
		}
		public SimpleelementContext simpleelement() {
			return getRuleContext(SimpleelementContext.class,0);
		}
		public RulerepeaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulerepeater; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRulerepeater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulerepeaterContext rulerepeater() throws RecognitionException {
		RulerepeaterContext _localctx = new RulerepeaterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rulerepeater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAREN:
				{
				setState(409);
				rulegroup();
				}
				break;
			case LISTSTART:
				{
				setState(410);
				rulelist();
				}
				break;
			case NULL:
			case MATSTART:
			case WORDBOUNDARY:
			case CLASSREF:
			case FEATURE:
			case VALUE:
			case STR1:
			case STR:
				{
				setState(411);
				simpleelement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(414);
			repeatertype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulegroupContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(LscParser.OPAREN, 0); }
		public RuleelementContext ruleelement() {
			return getRuleContext(RuleelementContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(LscParser.CPAREN, 0); }
		public RulegroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulegroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRulegroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulegroupContext rulegroup() throws RecognitionException {
		RulegroupContext _localctx = new RulegroupContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rulegroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(OPAREN);
			setState(417);
			ruleelement();
			setState(418);
			match(CPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulelistContext extends ParserRuleContext {
		public TerminalNode LISTSTART() { return getToken(LscParser.LISTSTART, 0); }
		public List<RuleelementContext> ruleelement() {
			return getRuleContexts(RuleelementContext.class);
		}
		public RuleelementContext ruleelement(int i) {
			return getRuleContext(RuleelementContext.class,i);
		}
		public TerminalNode LISTEND() { return getToken(LscParser.LISTEND, 0); }
		public List<TerminalNode> SEP() { return getTokens(LscParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LscParser.SEP, i);
		}
		public RulelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulelist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRulelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulelistContext rulelist() throws RecognitionException {
		RulelistContext _localctx = new RulelistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rulelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(LISTSTART);
			setState(421);
			ruleelement();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(422);
				match(SEP);
				setState(423);
				ruleelement();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			match(LISTEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleelementContext extends ParserRuleContext {
		public ClassrefContext classref() {
			return getRuleContext(ClassrefContext.class,0);
		}
		public CapturerefContext captureref() {
			return getRuleContext(CapturerefContext.class,0);
		}
		public FancymatrixContext fancymatrix() {
			return getRuleContext(FancymatrixContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public SimpleelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleelement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitSimpleelement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleelementContext simpleelement() throws RecognitionException {
		SimpleelementContext _localctx = new SimpleelementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_simpleelement);
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASSREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				classref();
				}
				break;
			case WORDBOUNDARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				captureref();
				}
				break;
			case MATSTART:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				fancymatrix();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				empty();
				}
				break;
			case FEATURE:
			case VALUE:
			case STR1:
			case STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				text();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassrefContext extends ParserRuleContext {
		public TerminalNode CLASSREF() { return getToken(LscParser.CLASSREF, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ClassrefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classref; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitClassref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassrefContext classref() throws RecognitionException {
		ClassrefContext _localctx = new ClassrefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_classref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(CLASSREF);
			setState(439);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturerefContext extends ParserRuleContext {
		public TerminalNode WORDBOUNDARY() { return getToken(LscParser.WORDBOUNDARY, 0); }
		public TerminalNode NUMBER() { return getToken(LscParser.NUMBER, 0); }
		public CapturerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureref; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitCaptureref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapturerefContext captureref() throws RecognitionException {
		CapturerefContext _localctx = new CapturerefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_captureref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(WORDBOUNDARY);
			setState(442);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FancymatrixContext extends ParserRuleContext {
		public TerminalNode MATSTART() { return getToken(LscParser.MATSTART, 0); }
		public TerminalNode MATEND() { return getToken(LscParser.MATEND, 0); }
		public List<FancyvalueContext> fancyvalue() {
			return getRuleContexts(FancyvalueContext.class);
		}
		public FancyvalueContext fancyvalue(int i) {
			return getRuleContext(FancyvalueContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(LscParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LscParser.WHITESPACE, i);
		}
		public FancymatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fancymatrix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitFancymatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FancymatrixContext fancymatrix() throws RecognitionException {
		FancymatrixContext _localctx = new FancymatrixContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fancymatrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(MATSTART);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << NEGATION) | (1L << WORDBOUNDARY) | (1L << VALUE))) != 0)) {
				{
				setState(445);
				fancyvalue();
				}
			}

			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(448);
				match(WHITESPACE);
				setState(449);
				fancyvalue();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(MATEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FancyvalueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NegvalueContext negvalue() {
			return getRuleContext(NegvalueContext.class,0);
		}
		public AbsentfeatureContext absentfeature() {
			return getRuleContext(AbsentfeatureContext.class,0);
		}
		public FeaturevariableContext featurevariable() {
			return getRuleContext(FeaturevariableContext.class,0);
		}
		public FancyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fancyvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitFancyvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FancyvalueContext fancyvalue() throws RecognitionException {
		FancyvalueContext _localctx = new FancyvalueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fancyvalue);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				value();
				}
				break;
			case NEGATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				negvalue();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				absentfeature();
				}
				break;
			case WORDBOUNDARY:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				featurevariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegvalueContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(LscParser.NEGATION, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NegvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitNegvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegvalueContext negvalue() throws RecognitionException {
		NegvalueContext _localctx = new NegvalueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_negvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(NEGATION);
			setState(464);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbsentfeatureContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(LscParser.NULL, 0); }
		public FeatureContext feature() {
			return getRuleContext(FeatureContext.class,0);
		}
		public AbsentfeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absentfeature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitAbsentfeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsentfeatureContext absentfeature() throws RecognitionException {
		AbsentfeatureContext _localctx = new AbsentfeatureContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_absentfeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(NULL);
			setState(467);
			feature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeaturevariableContext extends ParserRuleContext {
		public TerminalNode WORDBOUNDARY() { return getToken(LscParser.WORDBOUNDARY, 0); }
		public FeatureContext feature() {
			return getRuleContext(FeatureContext.class,0);
		}
		public FeaturevariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featurevariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitFeaturevariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeaturevariableContext featurevariable() throws RecognitionException {
		FeaturevariableContext _localctx = new FeaturevariableContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_featurevariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(WORDBOUNDARY);
			setState(470);
			feature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(LscParser.NULL, 0); }
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatertypeContext extends ParserRuleContext {
		public TerminalNode ATLEASTONE() { return getToken(LscParser.ATLEASTONE, 0); }
		public TerminalNode NULL() { return getToken(LscParser.NULL, 0); }
		public TerminalNode OPTIONAL() { return getToken(LscParser.OPTIONAL, 0); }
		public RepeatertypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatertype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitRepeatertype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatertypeContext repeatertype() throws RecognitionException {
		RepeatertypeContext _localctx = new RepeatertypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_repeatertype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << ATLEASTONE) | (1L << OPTIONAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixContext extends ParserRuleContext {
		public TerminalNode MATSTART() { return getToken(LscParser.MATSTART, 0); }
		public TerminalNode MATEND() { return getToken(LscParser.MATEND, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(LscParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(LscParser.WHITESPACE, i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_matrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(MATSTART);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(477);
				value();
				}
			}

			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(480);
				match(WHITESPACE);
				setState(481);
				value();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487);
			match(MATEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureContext extends ParserRuleContext {
		public TerminalNode FEATURE() { return getToken(LscParser.FEATURE, 0); }
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_feature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(FEATURE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(LscParser.VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode FEATURE() { return getToken(LscParser.FEATURE, 0); }
		public TerminalNode VALUE() { return getToken(LscParser.VALUE, 0); }
		public TerminalNode STR1() { return getToken(LscParser.STR1, 0); }
		public TerminalNode STR() { return getToken(LscParser.STR, 0); }
		public TerminalNode NEGATION() { return getToken(LscParser.NEGATION, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LscVisitor ) return ((LscVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FEATURE) | (1L << VALUE) | (1L << STR1) | (1L << STR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(494);
				match(NEGATION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u01f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\6\2c\n\2\r\2\16\2d\7\2g\n\2\f"+
		"\2\16\2j\13\2\3\2\3\2\6\2n\n\2\r\2\16\2o\7\2r\n\2\f\2\16\2u\13\2\3\2\3"+
		"\2\6\2y\n\2\r\2\16\2z\7\2}\n\2\f\2\16\2\u0080\13\2\3\2\3\2\6\2\u0084\n"+
		"\2\r\2\16\2\u0085\7\2\u0088\n\2\f\2\16\2\u008b\13\2\3\2\3\2\6\2\u008f"+
		"\n\2\r\2\16\2\u0090\5\2\u0093\n\2\3\2\5\2\u0096\n\2\3\2\6\2\u0099\n\2"+
		"\r\2\16\2\u009a\3\2\3\2\5\2\u009f\n\2\7\2\u00a1\n\2\f\2\16\2\u00a4\13"+
		"\2\3\2\6\2\u00a7\n\2\r\2\16\2\u00a8\3\2\5\2\u00ac\n\2\3\2\6\2\u00af\n"+
		"\2\r\2\16\2\u00b0\3\2\5\2\u00b4\n\2\3\2\7\2\u00b7\n\2\f\2\16\2\u00ba\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00c6\n\3\f\3\16\3\u00c9"+
		"\13\3\3\3\3\3\3\4\3\4\5\4\u00cf\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00d8"+
		"\n\5\3\5\3\5\3\5\7\5\u00dd\n\5\f\5\16\5\u00e0\13\5\3\5\3\5\3\5\5\5\u00e5"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f0\n\7\3\7\3\7\5\7\u00f4"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00fd\n\b\f\b\16\b\u0100\13\b\3\b"+
		"\3\b\5\b\u0104\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u011c\n\r\3\r\3\r\5\r\u0120"+
		"\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u012c\n\16\f\16"+
		"\16\16\u012f\13\16\3\17\3\17\3\17\7\17\u0134\n\17\f\17\16\17\u0137\13"+
		"\17\3\20\3\20\3\20\7\20\u013c\n\20\f\20\16\20\u013f\13\20\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0146\n\21\3\21\3\21\5\21\u014a\n\21\3\22\3\22\5\22"+
		"\u014e\n\22\3\23\3\23\5\23\u0152\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\7\26\u015c\n\26\f\26\16\26\u015f\13\26\3\26\3\26\3\27\3\27\3"+
		"\27\5\27\u0166\n\27\3\27\3\27\3\27\5\27\u016b\n\27\3\27\3\27\3\27\5\27"+
		"\u0170\n\27\3\27\3\27\5\27\u0174\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0184\n\34\3\35\3\35\3\35"+
		"\6\35\u0189\n\35\r\35\16\35\u018a\3\36\3\36\3\36\3\36\3\36\5\36\u0192"+
		"\n\36\3\37\3\37\3\37\3\37\5\37\u0198\n\37\3\37\3\37\3 \3 \3 \5 \u019f"+
		"\n \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u01ab\n\"\f\"\16\"\u01ae\13"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u01b7\n#\3$\3$\3$\3%\3%\3%\3&\3&\5&\u01c1"+
		"\n&\3&\3&\7&\u01c5\n&\f&\16&\u01c8\13&\3&\3&\3\'\3\'\3\'\3\'\5\'\u01d0"+
		"\n\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\5-\u01e1\n-\3-\3-\7"+
		"-\u01e5\n-\f-\16-\u01e8\13-\3-\3-\3.\3.\3/\3/\3\60\3\60\5\60\u01f2\n\60"+
		"\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^\2\5\3\2\t\n\4\2\r\r\22\23\4\2#$&\'\2\u020a\2"+
		"h\3\2\2\2\4\u00bd\3\2\2\2\6\u00ce\3\2\2\2\b\u00d0\3\2\2\2\n\u00e6\3\2"+
		"\2\2\f\u00e9\3\2\2\2\16\u00f7\3\2\2\2\20\u0105\3\2\2\2\22\u0107\3\2\2"+
		"\2\24\u010c\3\2\2\2\26\u0111\3\2\2\2\30\u0118\3\2\2\2\32\u0125\3\2\2\2"+
		"\34\u0130\3\2\2\2\36\u0138\3\2\2\2 \u0140\3\2\2\2\"\u014d\3\2\2\2$\u0151"+
		"\3\2\2\2&\u0153\3\2\2\2(\u0155\3\2\2\2*\u0157\3\2\2\2,\u0165\3\2\2\2."+
		"\u0175\3\2\2\2\60\u0177\3\2\2\2\62\u0179\3\2\2\2\64\u017b\3\2\2\2\66\u0183"+
		"\3\2\2\28\u0185\3\2\2\2:\u0191\3\2\2\2<\u0197\3\2\2\2>\u019e\3\2\2\2@"+
		"\u01a2\3\2\2\2B\u01a6\3\2\2\2D\u01b6\3\2\2\2F\u01b8\3\2\2\2H\u01bb\3\2"+
		"\2\2J\u01be\3\2\2\2L\u01cf\3\2\2\2N\u01d1\3\2\2\2P\u01d4\3\2\2\2R\u01d7"+
		"\3\2\2\2T\u01da\3\2\2\2V\u01dc\3\2\2\2X\u01de\3\2\2\2Z\u01eb\3\2\2\2\\"+
		"\u01ed\3\2\2\2^\u01ef\3\2\2\2`b\5\b\5\2ac\7\t\2\2ba\3\2\2\2cd\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2eg\3\2\2\2f`\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"is\3\2\2\2jh\3\2\2\2km\5\f\7\2ln\7\t\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2pr\3\2\2\2qk\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t~\3\2\2\2"+
		"us\3\2\2\2vx\5\16\b\2wy\7\t\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{}\3\2\2\2|v\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0089"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\5\4\3\2\u0082\u0084\7\t\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0081\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0092\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008e\5\22\n\2\u008d\u008f\7\t\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u008c\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0096\5\30\r\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00ab\3"+
		"\2\2\2\u0097\u0099\7\t\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009f\5\30"+
		"\r\2\u009d\u009f\5\26\f\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u0098\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a7\7\t\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\5\30\r\2\u00ab"+
		"\u00a2\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b3\3\2\2\2\u00ad\u00af\7\t"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\5\24\13\2\u00b3\u00ae\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7\7\t\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\2\2\3\u00bc"+
		"\3\3\2\2\2\u00bd\u00be\7\31\2\2\u00be\u00bf\7\n\2\2\u00bf\u00c0\5\\/\2"+
		"\u00c0\u00c1\7\n\2\2\u00c1\u00c2\7\20\2\2\u00c2\u00c7\5\6\4\2\u00c3\u00c4"+
		"\7\4\2\2\u00c4\u00c6\5\6\4\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cb\7\21\2\2\u00cb\5\3\2\2\2\u00cc\u00cf\5F$\2\u00cd\u00cf"+
		"\5^\60\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\7\3\2\2\2\u00d0"+
		"\u00d1\7\32\2\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\5Z.\2\u00d3\u00d7\7\13"+
		"\2\2\u00d4\u00d5\5\n\6\2\u00d5\u00d6\7\4\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00de\5\\"+
		"/\2\u00da\u00db\7\4\2\2\u00db\u00dd\5\\/\2\u00dc\u00da\3\2\2\2\u00dd\u00e0"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e4\7\f\2\2\u00e2\u00e3\7\5\2\2\u00e3\u00e5\5X"+
		"-\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\t\3\2\2\2\u00e6\u00e7"+
		"\7\r\2\2\u00e7\u00e8\5\\/\2\u00e8\13\3\2\2\2\u00e9\u00ea\7\33\2\2\u00ea"+
		"\u00eb\7\n\2\2\u00eb\u00ec\7&\2\2\u00ec\u00ef\7\n\2\2\u00ed\u00ee\7\34"+
		"\2\2\u00ee\u00f0\7\n\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00f2\7\35\2\2\u00f2\u00f4\7\n\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5X-\2\u00f6"+
		"\r\3\2\2\2\u00f7\u00f8\7\36\2\2\u00f8\u00f9\7\n\2\2\u00f9\u0103\5\20\t"+
		"\2\u00fa\u00fb\7\4\2\2\u00fb\u00fd\5\20\t\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0104\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\n\2\2\u0102\u0104\5X-\2\u0103\u00fe"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0104\17\3\2\2\2\u0105\u0106\5^\60\2\u0106"+
		"\21\3\2\2\2\u0107\u0108\7\37\2\2\u0108\u0109\7\25\2\2\u0109\u010a\7\t"+
		"\2\2\u010a\u010b\5\32\16\2\u010b\23\3\2\2\2\u010c\u010d\7 \2\2\u010d\u010e"+
		"\7\25\2\2\u010e\u010f\7\t\2\2\u010f\u0110\5\32\16\2\u0110\25\3\2\2\2\u0111"+
		"\u0112\7 \2\2\u0112\u0113\7\24\2\2\u0113\u0114\5\36\20\2\u0114\u0115\7"+
		"\25\2\2\u0115\u0116\7\t\2\2\u0116\u0117\5\32\16\2\u0117\27\3\2\2\2\u0118"+
		"\u011b\5\36\20\2\u0119\u011a\7\n\2\2\u011a\u011c\5X-\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011e\7\n\2\2\u011e"+
		"\u0120\7\"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\7\25\2\2\u0122\u0123\7\t\2\2\u0123\u0124\5\32\16\2\u0124"+
		"\31\3\2\2\2\u0125\u012d\5\34\17\2\u0126\u0127\7\t\2\2\u0127\u0128\7!\2"+
		"\2\u0128\u0129\7\25\2\2\u0129\u012a\t\2\2\2\u012a\u012c\5\34\17\2\u012b"+
		"\u0126\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\33\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0135\5 \21\2\u0131\u0132"+
		"\7\t\2\2\u0132\u0134\5 \21\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\35\3\2\2\2\u0137\u0135\3\2\2"+
		"\2\u0138\u013d\7$\2\2\u0139\u013a\7\24\2\2\u013a\u013c\7$\2\2\u013b\u0139"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\37\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\5&\24\2\u0141\u0142\7\5\2"+
		"\2\u0142\u0145\5(\25\2\u0143\u0144\7\6\2\2\u0144\u0146\5\"\22\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0148\7\7"+
		"\2\2\u0148\u014a\5$\23\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"!\3\2\2\2\u014b\u014e\5,\27\2\u014c\u014e\5*\26\2\u014d\u014b\3\2\2\2"+
		"\u014d\u014c\3\2\2\2\u014e#\3\2\2\2\u014f\u0152\5,\27\2\u0150\u0152\5"+
		"*\26\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152%\3\2\2\2\u0153\u0154"+
		"\5\66\34\2\u0154\'\3\2\2\2\u0155\u0156\5\66\34\2\u0156)\3\2\2\2\u0157"+
		"\u0158\7\20\2\2\u0158\u015d\5,\27\2\u0159\u015a\7\4\2\2\u015a\u015c\5"+
		",\27\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\21"+
		"\2\2\u0161+\3\2\2\2\u0162\u0163\5.\30\2\u0163\u0164\7\n\2\2\u0164\u0166"+
		"\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016a\3\2\2\2\u0167"+
		"\u0168\5\62\32\2\u0168\u0169\7\n\2\2\u0169\u016b\3\2\2\2\u016a\u0167\3"+
		"\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016f\7\b\2\2\u016d"+
		"\u016e\7\n\2\2\u016e\u0170\5\64\33\2\u016f\u016d\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u0170\u0173\3\2\2\2\u0171\u0172\7\n\2\2\u0172\u0174\5\60\31\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174-\3\2\2\2\u0175\u0176\7\27\2\2"+
		"\u0176/\3\2\2\2\u0177\u0178\7\27\2\2\u0178\61\3\2\2\2\u0179\u017a\5\66"+
		"\34\2\u017a\63\3\2\2\2\u017b\u017c\5\66\34\2\u017c\65\3\2\2\2\u017d\u0184"+
		"\5<\37\2\u017e\u0184\5> \2\u017f\u0184\5@!\2\u0180\u0184\5B\"\2\u0181"+
		"\u0184\5D#\2\u0182\u0184\58\35\2\u0183\u017d\3\2\2\2\u0183\u017e\3\2\2"+
		"\2\u0183\u017f\3\2\2\2\u0183\u0180\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0182"+
		"\3\2\2\2\u0184\67\3\2\2\2\u0185\u0188\5:\36\2\u0186\u0187\7\n\2\2\u0187"+
		"\u0189\5:\36\2\u0188\u0186\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b9\3\2\2\2\u018c\u0192\5<\37\2\u018d\u0192"+
		"\5> \2\u018e\u0192\5@!\2\u018f\u0192\5B\"\2\u0190\u0192\5D#\2\u0191\u018c"+
		"\3\2\2\2\u0191\u018d\3\2\2\2\u0191\u018e\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0190\3\2\2\2\u0192;\3\2\2\2\u0193\u0198\5@!\2\u0194\u0198\5B\"\2\u0195"+
		"\u0198\5F$\2\u0196\u0198\5J&\2\u0197\u0193\3\2\2\2\u0197\u0194\3\2\2\2"+
		"\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a"+
		"\5H%\2\u019a=\3\2\2\2\u019b\u019f\5@!\2\u019c\u019f\5B\"\2\u019d\u019f"+
		"\5D#\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\5V,\2\u01a1?\3\2\2\2\u01a2\u01a3\7\13\2\2\u01a3"+
		"\u01a4\5\66\34\2\u01a4\u01a5\7\f\2\2\u01a5A\3\2\2\2\u01a6\u01a7\7\20\2"+
		"\2\u01a7\u01ac\5\66\34\2\u01a8\u01a9\7\4\2\2\u01a9\u01ab\5\66\34\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7\21\2\2\u01b0"+
		"C\3\2\2\2\u01b1\u01b7\5F$\2\u01b2\u01b7\5H%\2\u01b3\u01b7\5J&\2\u01b4"+
		"\u01b7\5T+\2\u01b5\u01b7\5^\60\2\u01b6\u01b1\3\2\2\2\u01b6\u01b2\3\2\2"+
		"\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7E"+
		"\3\2\2\2\u01b8\u01b9\7\30\2\2\u01b9\u01ba\5\\/\2\u01baG\3\2\2\2\u01bb"+
		"\u01bc\7\27\2\2\u01bc\u01bd\7%\2\2\u01bdI\3\2\2\2\u01be\u01c0\7\16\2\2"+
		"\u01bf\u01c1\5L\'\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c6"+
		"\3\2\2\2\u01c2\u01c3\7\n\2\2\u01c3\u01c5\5L\'\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7\17\2\2\u01caK\3\2\2\2\u01cb\u01d0"+
		"\5\\/\2\u01cc\u01d0\5N(\2\u01cd\u01d0\5P)\2\u01ce\u01d0\5R*\2\u01cf\u01cb"+
		"\3\2\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0"+
		"M\3\2\2\2\u01d1\u01d2\7\26\2\2\u01d2\u01d3\5\\/\2\u01d3O\3\2\2\2\u01d4"+
		"\u01d5\7\r\2\2\u01d5\u01d6\5Z.\2\u01d6Q\3\2\2\2\u01d7\u01d8\7\27\2\2\u01d8"+
		"\u01d9\5Z.\2\u01d9S\3\2\2\2\u01da\u01db\7\r\2\2\u01dbU\3\2\2\2\u01dc\u01dd"+
		"\t\3\2\2\u01ddW\3\2\2\2\u01de\u01e0\7\16\2\2\u01df\u01e1\5\\/\2\u01e0"+
		"\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e6\3\2\2\2\u01e2\u01e3\7\n"+
		"\2\2\u01e3\u01e5\5\\/\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e9\u01ea\7\17\2\2\u01eaY\3\2\2\2\u01eb\u01ec\7#\2\2\u01ec[\3\2"+
		"\2\2\u01ed\u01ee\7$\2\2\u01ee]\3\2\2\2\u01ef\u01f1\t\4\2\2\u01f0\u01f2"+
		"\7\26\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2_\3\2\2\29dhos"+
		"z~\u0085\u0089\u0090\u0092\u0095\u009a\u009e\u00a2\u00a8\u00ab\u00b0\u00b3"+
		"\u00b8\u00c7\u00ce\u00d7\u00de\u00e4\u00ef\u00f3\u00fe\u0103\u011b\u011f"+
		"\u012d\u0135\u013d\u0145\u0149\u014d\u0151\u015d\u0165\u016a\u016f\u0173"+
		"\u0183\u018a\u0191\u0197\u019e\u01ac\u01b6\u01c0\u01c6\u01cf\u01e0\u01e6"+
		"\u01f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}