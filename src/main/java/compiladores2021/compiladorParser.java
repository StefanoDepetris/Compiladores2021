// Generated from c:\Users\Admin\OneDrive\Escritorio\Facultad\Compilador2021\src\main\java\compiladores2021\compilador.g4 by ANTLR 4.8
 
package compiladores2021;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, IGUAL=3, DIGITO=4, PCOMA=5, TIPO_DATO=6, COMA=7, ID=8;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_declaracion = 3, 
		RULE_secvar = 4, RULE_igual = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "declaracion", "secvar", 
			"igual"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", null, "';'", null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "IGUAL", "DIGITO", "PCOMA", "TIPO_DATO", "COMA", "ID"
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
	public String getGrammarFileName() { return "compilador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladorParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("INICIO"); 
			setState(13);
			instrucciones();
			 System.out.println("FIN"); 
			setState(15);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_DATO:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				instruccion();
				setState(18);
				instrucciones();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			declaracion();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode TIPO_DATO() { return getToken(compiladorParser.TIPO_DATO, 0); }
		public SecvarContext secvar() {
			return getRuleContext(SecvarContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(compiladorParser.PCOMA, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(TIPO_DATO);
			setState(26);
			secvar();
			setState(27);
			match(PCOMA);
			System.out.println("Encontrado");
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

	public static class SecvarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public TerminalNode COMA() { return getToken(compiladorParser.COMA, 0); }
		public SecvarContext secvar() {
			return getRuleContext(SecvarContext.class,0);
		}
		public SecvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterSecvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitSecvar(this);
		}
	}

	public final SecvarContext secvar() throws RecognitionException {
		SecvarContext _localctx = new SecvarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_secvar);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(ID);
				setState(31);
				igual();
				setState(32);
				match(COMA);
				setState(33);
				secvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(ID);
				setState(36);
				igual();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(ID);
				setState(38);
				match(COMA);
				setState(39);
				secvar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(ID);
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

	public static class IgualContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(compiladorParser.IGUAL, 0); }
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode DIGITO() { return getToken(compiladorParser.DIGITO, 0); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitIgual(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_igual);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(IGUAL);
				setState(44);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(IGUAL);
				setState(46);
				match(DIGITO);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\5\3\30\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\3\7\3\7\5\7\62\n\7\3\7\2\2\b\2\4\6\b"+
		"\n\f\2\2\2\62\2\16\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b\33\3\2\2\2\n+\3"+
		"\2\2\2\f\61\3\2\2\2\16\17\b\2\1\2\17\20\5\4\3\2\20\21\b\2\1\2\21\22\7"+
		"\2\2\3\22\3\3\2\2\2\23\24\5\6\4\2\24\25\5\4\3\2\25\30\3\2\2\2\26\30\3"+
		"\2\2\2\27\23\3\2\2\2\27\26\3\2\2\2\30\5\3\2\2\2\31\32\5\b\5\2\32\7\3\2"+
		"\2\2\33\34\7\b\2\2\34\35\5\n\6\2\35\36\7\7\2\2\36\37\b\5\1\2\37\t\3\2"+
		"\2\2 !\7\n\2\2!\"\5\f\7\2\"#\7\t\2\2#$\5\n\6\2$,\3\2\2\2%&\7\n\2\2&,\5"+
		"\f\7\2\'(\7\n\2\2()\7\t\2\2),\5\n\6\2*,\7\n\2\2+ \3\2\2\2+%\3\2\2\2+\'"+
		"\3\2\2\2+*\3\2\2\2,\13\3\2\2\2-.\7\5\2\2.\62\7\n\2\2/\60\7\5\2\2\60\62"+
		"\7\6\2\2\61-\3\2\2\2\61/\3\2\2\2\62\r\3\2\2\2\5\27+\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}