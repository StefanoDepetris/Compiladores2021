// Generated from c:\Users\Admin\OneDrive\Escritorio\Facultad\Compilador2021\src\main\java\compiladores2021\.antlr\Activodad 0709 by ANTLR 4.8
 
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
		PA=1, PC=2, IGUAL=3, DIGITO=4, PCOMA=5, TIPO_DATO=6, COMA=7, ID=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PA", "PC", "IGUAL", "DIGITO", "PCOMA", "TIPO_DATO", "COMA", "ID"
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


	public compiladorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Activodad 0709"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\65\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7+\n\7\3\b\3\b\3\t\3\t\7\t\61\n\t\f\t\16\t\64\13\t\2\2\n\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\5\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\2\67\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\27"+
		"\3\2\2\2\t\31\3\2\2\2\13\33\3\2\2\2\r*\3\2\2\2\17,\3\2\2\2\21.\3\2\2\2"+
		"\23\24\7*\2\2\24\4\3\2\2\2\25\26\7+\2\2\26\6\3\2\2\2\27\30\7?\2\2\30\b"+
		"\3\2\2\2\31\32\t\2\2\2\32\n\3\2\2\2\33\34\7=\2\2\34\f\3\2\2\2\35\36\7"+
		"k\2\2\36\37\7p\2\2\37+\7v\2\2 !\7f\2\2!\"\7q\2\2\"#\7w\2\2#$\7d\2\2$%"+
		"\7n\2\2%+\7g\2\2&\'\7e\2\2\'(\7j\2\2()\7c\2\2)+\7t\2\2*\35\3\2\2\2* \3"+
		"\2\2\2*&\3\2\2\2+\16\3\2\2\2,-\7.\2\2-\20\3\2\2\2.\62\t\3\2\2/\61\t\4"+
		"\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\22\3\2\2"+
		"\2\64\62\3\2\2\2\5\2*\62\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}