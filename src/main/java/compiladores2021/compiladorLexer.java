// Generated from c:\Users\Admin\OneDrive\Escritorio\Facultad\Compilador2021\src\main\java\compiladores2021\compilador.g4 by ANTLR 4.8
 
package compiladores2021;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, LA=3, LC=4, I_WHILE=5, FOR=6, IF=7, ELSE=8, ELSEIF=9, AND=10, 
		OR=11, IGUAL=12, MENOR=13, MAYOR=14, SUMA=15, RESTA=16, MULT=17, DIVISION=18, 
		ENTERO=19, PCOMA=20, TIPO_DATO=21, COMA=22, ID=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PA", "PC", "LA", "LC", "I_WHILE", "FOR", "IF", "ELSE", "ELSEIF", "AND", 
			"OR", "IGUAL", "MENOR", "MAYOR", "SUMA", "RESTA", "MULT", "DIVISION", 
			"ENTERO", "PCOMA", "TIPO_DATO", "COMA", "ID"
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


	public compiladorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compilador.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\6\24i\n\24\r\24\16\24j\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26|\n\26\3\27\3\27"+
		"\3\30\3\30\7\30\u0082\n\30\f\30\16\30\u0085\13\30\2\2\31\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\3\2\5\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\2\u0089"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r?"+
		"\3\2\2\2\17C\3\2\2\2\21F\3\2\2\2\23K\3\2\2\2\25S\3\2\2\2\27V\3\2\2\2\31"+
		"Y\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!a\3\2\2\2#c\3\2\2\2%e\3"+
		"\2\2\2\'h\3\2\2\2)l\3\2\2\2+{\3\2\2\2-}\3\2\2\2/\177\3\2\2\2\61\62\7*"+
		"\2\2\62\4\3\2\2\2\63\64\7+\2\2\64\6\3\2\2\2\65\66\7}\2\2\66\b\3\2\2\2"+
		"\678\7\177\2\28\n\3\2\2\29:\7y\2\2:;\7j\2\2;<\7k\2\2<=\7n\2\2=>\7g\2\2"+
		">\f\3\2\2\2?@\7h\2\2@A\7q\2\2AB\7t\2\2B\16\3\2\2\2CD\7k\2\2DE\7h\2\2E"+
		"\20\3\2\2\2FG\7g\2\2GH\7n\2\2HI\7u\2\2IJ\7g\2\2J\22\3\2\2\2KL\7g\2\2L"+
		"M\7n\2\2MN\7u\2\2NO\7g\2\2OP\7\"\2\2PQ\7k\2\2QR\7h\2\2R\24\3\2\2\2ST\7"+
		"(\2\2TU\7(\2\2U\26\3\2\2\2VW\7~\2\2WX\7~\2\2X\30\3\2\2\2YZ\7?\2\2Z\32"+
		"\3\2\2\2[\\\7>\2\2\\\34\3\2\2\2]^\7@\2\2^\36\3\2\2\2_`\7-\2\2` \3\2\2"+
		"\2ab\7/\2\2b\"\3\2\2\2cd\7,\2\2d$\3\2\2\2ef\7\61\2\2f&\3\2\2\2gi\t\2\2"+
		"\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k(\3\2\2\2lm\7=\2\2m*\3\2\2"+
		"\2no\7k\2\2op\7p\2\2p|\7v\2\2qr\7f\2\2rs\7q\2\2st\7w\2\2tu\7d\2\2uv\7"+
		"n\2\2v|\7g\2\2wx\7e\2\2xy\7j\2\2yz\7c\2\2z|\7t\2\2{n\3\2\2\2{q\3\2\2\2"+
		"{w\3\2\2\2|,\3\2\2\2}~\7.\2\2~.\3\2\2\2\177\u0083\t\3\2\2\u0080\u0082"+
		"\t\4\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\60\3\2\2\2\u0085\u0083\3\2\2\2\6\2j{\u0083\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}