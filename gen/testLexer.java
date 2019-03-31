// Generated from /home/hadi/Desktop/compiler/compiler_phase1/PLC_Spring98_Toorla/grammar/test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, STRINGCONST=5, LETTER=6, NUMBER=7, WS=8, 
		KEYWORD=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ID", "STRINGCONST", "LETTER", "NUMBER", "WS", 
			"KEYWORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "STRINGCONST", "LETTER", "NUMBER", "WS", 
			"KEYWORD"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13H\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5&\n\5\f\5"+
		"\16\5)\13\5\3\6\3\6\3\6\7\6.\n\6\f\6\16\6\61\13\6\3\6\3\6\3\7\5\7\66\n"+
		"\7\3\b\3\b\7\b:\n\b\f\b\16\b=\13\b\3\b\5\b@\n\b\3\t\3\t\3\t\3\t\3\n\5"+
		"\nG\n\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\t\3\2$$\4"+
		"\2C\\c|\3\2\63;\3\2\62;\3\2\62\62\4\2\13\f\"\"\7\2ckmnprty{{\2L\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\36\3\2\2\2\7 \3\2"+
		"\2\2\t\"\3\2\2\2\13*\3\2\2\2\r\65\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23F"+
		"\3\2\2\2\25\26\7h\2\2\26\27\7w\2\2\27\30\7p\2\2\30\31\7e\2\2\31\32\7v"+
		"\2\2\32\33\7k\2\2\33\34\7q\2\2\34\35\7p\2\2\35\4\3\2\2\2\36\37\7*\2\2"+
		"\37\6\3\2\2\2 !\7+\2\2!\b\3\2\2\2\"\'\5\r\7\2#&\5\r\7\2$&\5\17\b\2%#\3"+
		"\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\n\3\2\2\2)\'\3\2\2\2"+
		"*+\t\2\2\2+/\5\r\7\2,.\5\r\7\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2"+
		"\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\t\2\2\2\63\f\3\2\2\2\64\66\t\3\2"+
		"\2\65\64\3\2\2\2\66\16\3\2\2\2\67;\t\4\2\28:\t\5\2\298\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<@\3\2\2\2=;\3\2\2\2>@\t\6\2\2?\67\3\2\2\2?>\3\2"+
		"\2\2@\20\3\2\2\2AB\t\7\2\2BC\3\2\2\2CD\b\t\2\2D\22\3\2\2\2EG\t\b\2\2F"+
		"E\3\2\2\2G\24\3\2\2\2\n\2%\'/\65;?F\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}