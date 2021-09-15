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
		PA=1, PC=2, LA=3, LC=4, I_WHILE=5, FOR=6, IF=7, ELSE=8, ELSEIF=9, AND=10, 
		OR=11, IGUAL=12, MENOR=13, MAYOR=14, SUMA=15, RESTA=16, MULT=17, DIVISION=18, 
		ENTERO=19, PCOMA=20, TIPO_DATO=21, COMA=22, ID=23;
	public static final int
		RULE_i_if = 0, RULE_i_while = 1, RULE_signosdecomparacion = 2, RULE_ladoA = 3, 
		RULE_ladoB = 4, RULE_bloque = 5, RULE_programa = 6, RULE_instrucciones = 7, 
		RULE_instruccion = 8, RULE_estructuradecontrol = 9, RULE_i_for = 10, RULE_declaracion = 11, 
		RULE_secvar = 12, RULE_oal = 13, RULE_term = 14, RULE_t = 15, RULE_factores = 16, 
		RULE_f = 17, RULE_andor = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"i_if", "i_while", "signosdecomparacion", "ladoA", "ladoB", "bloque", 
			"programa", "instrucciones", "instruccion", "estructuradecontrol", "i_for", 
			"declaracion", "secvar", "oal", "term", "t", "factores", "f", "andor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'while'", "'for'", "'if'", "'else'", 
			"'else if'", "'&&'", "'||'", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", 
			"'/'", null, "';'", null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LA", "LC", "I_WHILE", "FOR", "IF", "ELSE", "ELSEIF", 
			"AND", "OR", "IGUAL", "MENOR", "MAYOR", "SUMA", "RESTA", "MULT", "DIVISION", 
			"ENTERO", "PCOMA", "TIPO_DATO", "COMA", "ID"
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

	public static class I_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(compiladorParser.IF, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public LadoAContext ladoA() {
			return getRuleContext(LadoAContext.class,0);
		}
		public SignosdecomparacionContext signosdecomparacion() {
			return getRuleContext(SignosdecomparacionContext.class,0);
		}
		public LadoBContext ladoB() {
			return getRuleContext(LadoBContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public I_ifContext i_if() {
			return getRuleContext(I_ifContext.class,0);
		}
		public TerminalNode ELSEIF() { return getToken(compiladorParser.ELSEIF, 0); }
		public TerminalNode ELSE() { return getToken(compiladorParser.ELSE, 0); }
		public I_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterI_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitI_if(this);
		}
	}

	public final I_ifContext i_if() throws RecognitionException {
		I_ifContext _localctx = new I_ifContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_i_if);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(IF);
				setState(39);
				match(PA);
				setState(40);
				ladoA();
				setState(41);
				signosdecomparacion();
				setState(42);
				ladoB();
				setState(43);
				match(PC);
				setState(44);
				bloque();
				setState(45);
				i_if();
				}
				break;
			case ELSEIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(ELSEIF);
				setState(48);
				match(PA);
				setState(49);
				ladoA();
				setState(50);
				signosdecomparacion();
				setState(51);
				ladoB();
				setState(52);
				match(PC);
				setState(53);
				bloque();
				setState(54);
				i_if();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(ELSE);
				setState(57);
				bloque();
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

	public static class I_whileContext extends ParserRuleContext {
		public TerminalNode I_WHILE() { return getToken(compiladorParser.I_WHILE, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public LadoAContext ladoA() {
			return getRuleContext(LadoAContext.class,0);
		}
		public SignosdecomparacionContext signosdecomparacion() {
			return getRuleContext(SignosdecomparacionContext.class,0);
		}
		public LadoBContext ladoB() {
			return getRuleContext(LadoBContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public I_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterI_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitI_while(this);
		}
	}

	public final I_whileContext i_while() throws RecognitionException {
		I_whileContext _localctx = new I_whileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_i_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(I_WHILE);
			setState(61);
			match(PA);
			setState(62);
			ladoA();
			setState(63);
			signosdecomparacion();
			setState(64);
			ladoB();
			setState(65);
			match(PC);
			setState(66);
			bloque();
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

	public static class SignosdecomparacionContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(compiladorParser.MENOR, 0); }
		public List<TerminalNode> IGUAL() { return getTokens(compiladorParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(compiladorParser.IGUAL, i);
		}
		public TerminalNode MAYOR() { return getToken(compiladorParser.MAYOR, 0); }
		public AndorContext andor() {
			return getRuleContext(AndorContext.class,0);
		}
		public SignosdecomparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signosdecomparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterSignosdecomparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitSignosdecomparacion(this);
		}
	}

	public final SignosdecomparacionContext signosdecomparacion() throws RecognitionException {
		SignosdecomparacionContext _localctx = new SignosdecomparacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_signosdecomparacion);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(MENOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(MENOR);
				setState(70);
				match(IGUAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(MAYOR);
				setState(72);
				match(IGUAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(MAYOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				match(IGUAL);
				setState(75);
				match(IGUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				andor();
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

	public static class LadoAContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(compiladorParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public OalContext oal() {
			return getRuleContext(OalContext.class,0);
		}
		public LadoAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ladoA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterLadoA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitLadoA(this);
		}
	}

	public final LadoAContext ladoA() throws RecognitionException {
		LadoAContext _localctx = new LadoAContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ladoA);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				oal();
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

	public static class LadoBContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(compiladorParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public OalContext oal() {
			return getRuleContext(OalContext.class,0);
		}
		public LadoBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ladoB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterLadoB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitLadoB(this);
		}
	}

	public final LadoBContext ladoB() throws RecognitionException {
		LadoBContext _localctx = new LadoBContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ladoB);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				oal();
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(compiladorParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(compiladorParser.LC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LA:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(LA);
				setState(90);
				instrucciones();
				setState(91);
				match(LC);
				}
				break;
			case PA:
			case I_WHILE:
			case FOR:
			case IF:
			case ELSE:
			case ELSEIF:
			case RESTA:
			case ENTERO:
			case TIPO_DATO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				instruccion();
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
		enterRule(_localctx, 12, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			instrucciones();
			setState(97);
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
		enterRule(_localctx, 14, RULE_instrucciones);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case I_WHILE:
			case FOR:
			case IF:
			case ELSE:
			case ELSEIF:
			case RESTA:
			case ENTERO:
			case TIPO_DATO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				instruccion();
				setState(100);
				instrucciones();
				}
				break;
			case EOF:
			case LC:
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
		public EstructuradecontrolContext estructuradecontrol() {
			return getRuleContext(EstructuradecontrolContext.class,0);
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
		enterRule(_localctx, 16, RULE_instruccion);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case RESTA:
			case ENTERO:
			case TIPO_DATO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				declaracion();
				}
				break;
			case I_WHILE:
			case FOR:
			case IF:
			case ELSE:
			case ELSEIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				estructuradecontrol();
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

	public static class EstructuradecontrolContext extends ParserRuleContext {
		public I_whileContext i_while() {
			return getRuleContext(I_whileContext.class,0);
		}
		public I_ifContext i_if() {
			return getRuleContext(I_ifContext.class,0);
		}
		public I_forContext i_for() {
			return getRuleContext(I_forContext.class,0);
		}
		public EstructuradecontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuradecontrol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterEstructuradecontrol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitEstructuradecontrol(this);
		}
	}

	public final EstructuradecontrolContext estructuradecontrol() throws RecognitionException {
		EstructuradecontrolContext _localctx = new EstructuradecontrolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_estructuradecontrol);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case I_WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				i_while();
				}
				break;
			case IF:
			case ELSE:
			case ELSEIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				i_if();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				i_for();
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

	public static class I_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(compiladorParser.FOR, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public List<SecvarContext> secvar() {
			return getRuleContexts(SecvarContext.class);
		}
		public SecvarContext secvar(int i) {
			return getRuleContext(SecvarContext.class,i);
		}
		public List<TerminalNode> PCOMA() { return getTokens(compiladorParser.PCOMA); }
		public TerminalNode PCOMA(int i) {
			return getToken(compiladorParser.PCOMA, i);
		}
		public LadoAContext ladoA() {
			return getRuleContext(LadoAContext.class,0);
		}
		public SignosdecomparacionContext signosdecomparacion() {
			return getRuleContext(SignosdecomparacionContext.class,0);
		}
		public LadoBContext ladoB() {
			return getRuleContext(LadoBContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public I_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterI_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitI_for(this);
		}
	}

	public final I_forContext i_for() throws RecognitionException {
		I_forContext _localctx = new I_forContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_i_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(FOR);
			setState(115);
			match(PA);
			setState(116);
			secvar();
			setState(117);
			match(PCOMA);
			setState(118);
			ladoA();
			setState(119);
			signosdecomparacion();
			setState(120);
			ladoB();
			setState(121);
			match(PCOMA);
			setState(122);
			secvar();
			setState(123);
			match(PC);
			setState(124);
			bloque();
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
		enterRule(_localctx, 22, RULE_declaracion);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_DATO:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(TIPO_DATO);
				setState(127);
				secvar();
				setState(128);
				match(PCOMA);
				System.out.println("Encontrado");
				}
				break;
			case PA:
			case RESTA:
			case ENTERO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				secvar();
				setState(132);
				match(PCOMA);
				System.out.println("Encontrado");
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

	public static class SecvarContext extends ParserRuleContext {
		public LadoAContext ladoA() {
			return getRuleContext(LadoAContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(compiladorParser.IGUAL, 0); }
		public LadoBContext ladoB() {
			return getRuleContext(LadoBContext.class,0);
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
		enterRule(_localctx, 24, RULE_secvar);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				ladoA();
				setState(138);
				match(IGUAL);
				setState(139);
				ladoB();
				setState(140);
				match(COMA);
				setState(141);
				secvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				ladoA();
				setState(144);
				match(IGUAL);
				setState(145);
				ladoB();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				ladoA();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				ladoA();
				setState(149);
				match(COMA);
				setState(150);
				secvar();
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

	public static class OalContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public OalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterOal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitOal(this);
		}
	}

	public final OalContext oal() throws RecognitionException {
		OalContext _localctx = new OalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_oal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			term();
			setState(155);
			t();
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

	public static class TermContext extends ParserRuleContext {
		public FactoresContext factores() {
			return getRuleContext(FactoresContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			factores();
			setState(158);
			f();
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

	public static class TContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladorParser.SUMA, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(compiladorParser.RESTA, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_t);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(SUMA);
				setState(161);
				term();
				setState(162);
				t();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(RESTA);
				setState(165);
				term();
				setState(166);
				t();
				}
				break;
			case PC:
			case AND:
			case OR:
			case IGUAL:
			case MENOR:
			case MAYOR:
			case PCOMA:
			case COMA:
				enterOuterAlt(_localctx, 3);
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

	public static class FactoresContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(compiladorParser.ENTERO, 0); }
		public TerminalNode RESTA() { return getToken(compiladorParser.RESTA, 0); }
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public OalContext oal() {
			return getRuleContext(OalContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public FactoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterFactores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitFactores(this);
		}
	}

	public final FactoresContext factores() throws RecognitionException {
		FactoresContext _localctx = new FactoresContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factores);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ENTERO);
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(RESTA);
				setState(173);
				match(ENTERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				match(PA);
				setState(176);
				oal();
				setState(177);
				match(PC);
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

	public static class FContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(compiladorParser.MULT, 0); }
		public FactoresContext factores() {
			return getRuleContext(FactoresContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode DIVISION() { return getToken(compiladorParser.DIVISION, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_f);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(MULT);
				setState(182);
				factores();
				setState(183);
				f();
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(DIVISION);
				setState(186);
				factores();
				setState(187);
				f();
				}
				break;
			case PC:
			case AND:
			case OR:
			case IGUAL:
			case MENOR:
			case MAYOR:
			case SUMA:
			case RESTA:
			case PCOMA:
			case COMA:
				enterOuterAlt(_localctx, 3);
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

	public static class AndorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(compiladorParser.AND, 0); }
		public TerminalNode OR() { return getToken(compiladorParser.OR, 0); }
		public AndorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterAndor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitAndor(this);
		}
	}

	public final AndorContext andor() throws RecognitionException {
		AndorContext _localctx = new AndorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_andor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2=\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\5\5U\n\5\3"+
		"\6\3\6\3\6\5\6Z\n\6\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\5\tj\n\t\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\5\13s\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u008a\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u009b\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ac\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00b6\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00c1\n\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&\2\3\3\2\f\r\2\u00cc\2<\3\2\2\2\4>\3\2\2\2\6"+
		"O\3\2\2\2\bT\3\2\2\2\nY\3\2\2\2\f`\3\2\2\2\16b\3\2\2\2\20i\3\2\2\2\22"+
		"m\3\2\2\2\24r\3\2\2\2\26t\3\2\2\2\30\u0089\3\2\2\2\32\u009a\3\2\2\2\34"+
		"\u009c\3\2\2\2\36\u009f\3\2\2\2 \u00ab\3\2\2\2\"\u00b5\3\2\2\2$\u00c0"+
		"\3\2\2\2&\u00c2\3\2\2\2()\7\t\2\2)*\7\3\2\2*+\5\b\5\2+,\5\6\4\2,-\5\n"+
		"\6\2-.\7\4\2\2./\5\f\7\2/\60\5\2\2\2\60=\3\2\2\2\61\62\7\13\2\2\62\63"+
		"\7\3\2\2\63\64\5\b\5\2\64\65\5\6\4\2\65\66\5\n\6\2\66\67\7\4\2\2\678\5"+
		"\f\7\289\5\2\2\29=\3\2\2\2:;\7\n\2\2;=\5\f\7\2<(\3\2\2\2<\61\3\2\2\2<"+
		":\3\2\2\2=\3\3\2\2\2>?\7\7\2\2?@\7\3\2\2@A\5\b\5\2AB\5\6\4\2BC\5\n\6\2"+
		"CD\7\4\2\2DE\5\f\7\2E\5\3\2\2\2FP\7\17\2\2GH\7\17\2\2HP\7\16\2\2IJ\7\20"+
		"\2\2JP\7\16\2\2KP\7\20\2\2LM\7\16\2\2MP\7\16\2\2NP\5&\24\2OF\3\2\2\2O"+
		"G\3\2\2\2OI\3\2\2\2OK\3\2\2\2OL\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QU\7\25\2"+
		"\2RU\7\31\2\2SU\5\34\17\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\t\3\2\2\2VZ\7"+
		"\25\2\2WZ\7\31\2\2XZ\5\34\17\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\13\3\2\2"+
		"\2[\\\7\5\2\2\\]\5\20\t\2]^\7\6\2\2^a\3\2\2\2_a\5\22\n\2`[\3\2\2\2`_\3"+
		"\2\2\2a\r\3\2\2\2bc\5\20\t\2cd\7\2\2\3d\17\3\2\2\2ef\5\22\n\2fg\5\20\t"+
		"\2gj\3\2\2\2hj\3\2\2\2ie\3\2\2\2ih\3\2\2\2j\21\3\2\2\2kn\5\30\r\2ln\5"+
		"\24\13\2mk\3\2\2\2ml\3\2\2\2n\23\3\2\2\2os\5\4\3\2ps\5\2\2\2qs\5\26\f"+
		"\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\25\3\2\2\2tu\7\b\2\2uv\7\3\2\2vw\5\32"+
		"\16\2wx\7\26\2\2xy\5\b\5\2yz\5\6\4\2z{\5\n\6\2{|\7\26\2\2|}\5\32\16\2"+
		"}~\7\4\2\2~\177\5\f\7\2\177\27\3\2\2\2\u0080\u0081\7\27\2\2\u0081\u0082"+
		"\5\32\16\2\u0082\u0083\7\26\2\2\u0083\u0084\b\r\1\2\u0084\u008a\3\2\2"+
		"\2\u0085\u0086\5\32\16\2\u0086\u0087\7\26\2\2\u0087\u0088\b\r\1\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0085\3\2\2\2\u008a\31\3\2\2"+
		"\2\u008b\u008c\5\b\5\2\u008c\u008d\7\16\2\2\u008d\u008e\5\n\6\2\u008e"+
		"\u008f\7\30\2\2\u008f\u0090\5\32\16\2\u0090\u009b\3\2\2\2\u0091\u0092"+
		"\5\b\5\2\u0092\u0093\7\16\2\2\u0093\u0094\5\n\6\2\u0094\u009b\3\2\2\2"+
		"\u0095\u009b\5\b\5\2\u0096\u0097\5\b\5\2\u0097\u0098\7\30\2\2\u0098\u0099"+
		"\5\32\16\2\u0099\u009b\3\2\2\2\u009a\u008b\3\2\2\2\u009a\u0091\3\2\2\2"+
		"\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009b\33\3\2\2\2\u009c\u009d"+
		"\5\36\20\2\u009d\u009e\5 \21\2\u009e\35\3\2\2\2\u009f\u00a0\5\"\22\2\u00a0"+
		"\u00a1\5$\23\2\u00a1\37\3\2\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00a4\5\36"+
		"\20\2\u00a4\u00a5\5 \21\2\u00a5\u00ac\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7"+
		"\u00a8\5\36\20\2\u00a8\u00a9\5 \21\2\u00a9\u00ac\3\2\2\2\u00aa\u00ac\3"+
		"\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"!\3\2\2\2\u00ad\u00b6\7\25\2\2\u00ae\u00af\7\22\2\2\u00af\u00b6\7\25\2"+
		"\2\u00b0\u00b6\7\31\2\2\u00b1\u00b2\7\3\2\2\u00b2\u00b3\5\34\17\2\u00b3"+
		"\u00b4\7\4\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00ae\3\2"+
		"\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6#\3\2\2\2\u00b7\u00b8"+
		"\7\23\2\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\5$\23\2\u00ba\u00c1\3\2\2\2"+
		"\u00bb\u00bc\7\24\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\5$\23\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1%\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3\'\3\2\2\2\17<"+
		"OTY`imr\u0089\u009a\u00ab\u00b5\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}