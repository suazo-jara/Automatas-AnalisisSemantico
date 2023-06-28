// Generated from LexerT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGINGPS=1, END=2, BEGIN=3, INPUT=4, OUTPUT=5, ORDEN=6, DIRECCION=7, DISTANCIA=8, 
		SENTIDO=9, MEDIDA=10, PUNTO=11, EXPONENCIAL=12, COSENO=13, RAIZC=14, OR=15, 
		AND=16, MAYOR=17, MENOR=18, EQUAL=19, NOTEQUAL=20, VARNAME=21, INT=22, 
		FLOAT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGINGPS", "END", "BEGIN", "INPUT", "OUTPUT", "ORDEN", "DIRECCION", "DISTANCIA", 
		"SENTIDO", "MEDIDA", "PUNTO", "EXPONENCIAL", "COSENO", "RAIZC", "OR", 
		"AND", "MAYOR", "MENOR", "EQUAL", "NOTEQUAL", "VARNAME", "INT", "FLOAT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'bienvenido al gps.'", "'has llegado a tu destino.'", "'desde tu ubicacion actual,'", 
		"'preferencias de ruta:'", "'indicaciones de ruta:'", null, null, null, 
		null, null, "'.'", "'acelera'", "'pasar cambio en'", "'derrapar a'", "'o'", 
		"'y'", "'distancia mayor'", "'distancia menor'", "'distancia igual'", 
		"'distancia diferente'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGINGPS", "END", "BEGIN", "INPUT", "OUTPUT", "ORDEN", "DIRECCION", 
		"DISTANCIA", "SENTIDO", "MEDIDA", "PUNTO", "EXPONENCIAL", "COSENO", "RAIZC", 
		"OR", "AND", "MAYOR", "MENOR", "EQUAL", "NOTEQUAL", "VARNAME", "INT", 
		"FLOAT", "WS"
	};
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u01bc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00c1\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00e5\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00f0\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u010c\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u012c\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\6\26\u019c\n\26\r\26\16\26\u019d\3\27\5\27\u01a1\n\27\3\27\6\27\u01a4"+
		"\n\27\r\27\16\27\u01a5\3\30\5\30\u01a9\n\30\3\30\6\30\u01ac\n\30\r\30"+
		"\16\30\u01ad\3\30\3\30\6\30\u01b2\n\30\r\30\16\30\u01b3\3\31\6\31\u01b7"+
		"\n\31\r\31\16\31\u01b8\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u01ce\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\3\63\3\2\2\2\5F\3\2\2\2\7`\3\2\2\2\t{\3\2\2\2\13\u0091\3\2\2"+
		"\2\r\u00c0\3\2\2\2\17\u00e4\3\2\2\2\21\u00ef\3\2\2\2\23\u010b\3\2\2\2"+
		"\25\u012b\3\2\2\2\27\u012d\3\2\2\2\31\u012f\3\2\2\2\33\u0137\3\2\2\2\35"+
		"\u0147\3\2\2\2\37\u0152\3\2\2\2!\u0154\3\2\2\2#\u0156\3\2\2\2%\u0166\3"+
		"\2\2\2\'\u0176\3\2\2\2)\u0186\3\2\2\2+\u019b\3\2\2\2-\u01a0\3\2\2\2/\u01a8"+
		"\3\2\2\2\61\u01b6\3\2\2\2\63\64\7d\2\2\64\65\7k\2\2\65\66\7g\2\2\66\67"+
		"\7p\2\2\678\7x\2\289\7g\2\29:\7p\2\2:;\7k\2\2;<\7f\2\2<=\7q\2\2=>\7\""+
		"\2\2>?\7c\2\2?@\7n\2\2@A\7\"\2\2AB\7i\2\2BC\7r\2\2CD\7u\2\2DE\7\60\2\2"+
		"E\4\3\2\2\2FG\7j\2\2GH\7c\2\2HI\7u\2\2IJ\7\"\2\2JK\7n\2\2KL\7n\2\2LM\7"+
		"g\2\2MN\7i\2\2NO\7c\2\2OP\7f\2\2PQ\7q\2\2QR\7\"\2\2RS\7c\2\2ST\7\"\2\2"+
		"TU\7v\2\2UV\7w\2\2VW\7\"\2\2WX\7f\2\2XY\7g\2\2YZ\7u\2\2Z[\7v\2\2[\\\7"+
		"k\2\2\\]\7p\2\2]^\7q\2\2^_\7\60\2\2_\6\3\2\2\2`a\7f\2\2ab\7g\2\2bc\7u"+
		"\2\2cd\7f\2\2de\7g\2\2ef\7\"\2\2fg\7v\2\2gh\7w\2\2hi\7\"\2\2ij\7w\2\2"+
		"jk\7d\2\2kl\7k\2\2lm\7e\2\2mn\7c\2\2no\7e\2\2op\7k\2\2pq\7q\2\2qr\7p\2"+
		"\2rs\7\"\2\2st\7c\2\2tu\7e\2\2uv\7v\2\2vw\7w\2\2wx\7c\2\2xy\7n\2\2yz\7"+
		".\2\2z\b\3\2\2\2{|\7r\2\2|}\7t\2\2}~\7g\2\2~\177\7h\2\2\177\u0080\7g\2"+
		"\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083\u0084"+
		"\7e\2\2\u0084\u0085\7k\2\2\u0085\u0086\7c\2\2\u0086\u0087\7u\2\2\u0087"+
		"\u0088\7\"\2\2\u0088\u0089\7f\2\2\u0089\u008a\7g\2\2\u008a\u008b\7\"\2"+
		"\2\u008b\u008c\7t\2\2\u008c\u008d\7w\2\2\u008d\u008e\7v\2\2\u008e\u008f"+
		"\7c\2\2\u008f\u0090\7<\2\2\u0090\n\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7f\2\2\u0094\u0095\7k\2\2\u0095\u0096\7e\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7e\2\2\u0098\u0099\7k\2\2\u0099\u009a\7q\2\2"+
		"\u009a\u009b\7p\2\2\u009b\u009c\7g\2\2\u009c\u009d\7u\2\2\u009d\u009e"+
		"\7\"\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7\"\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7c\2\2"+
		"\u00a5\u00a6\7<\2\2\u00a6\f\3\2\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7k"+
		"\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7v\2\2\u00ae\u00c1\7g\2\2\u00af\u00b0\7u\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7i\2\2\u00b2\u00b3\7w\2\2\u00b3\u00c1\7g\2\2"+
		"\u00b4\u00b5\7e\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7w\2\2\u00bb"+
		"\u00c1\7c\2\2\u00bc\u00bd\7i\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7t\2\2"+
		"\u00bf\u00c1\7c\2\2\u00c0\u00a7\3\2\2\2\u00c0\u00af\3\2\2\2\u00c0\u00b4"+
		"\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\16\3\2\2\2\u00c2\u00c3\7c\2\2\u00c3"+
		"\u00c4\7n\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7q\2"+
		"\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7v\2\2\u00c9\u00e5\7g\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\7u\2\2\u00ce"+
		"\u00cf\7w\2\2\u00cf\u00e5\7t\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2"+
		"\u00d2\u00d3\7\"\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6\u00e5\7g\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7n\2\2\u00d9"+
		"\u00da\7\"\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7u\2"+
		"\2\u00dd\u00de\7v\2\2\u00de\u00e5\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e5\7q\2\2\u00e4"+
		"\u00c2\3\2\2\2\u00e4\u00ca\3\2\2\2\u00e4\u00d0\3\2\2\2\u00e4\u00d7\3\2"+
		"\2\2\u00e4\u00df\3\2\2\2\u00e5\20\3\2\2\2\u00e6\u00e7\7f\2\2\u00e7\u00e8"+
		"\7w\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7p\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00f0\7g\2\2\u00ed\u00ee\7g\2\2\u00ee\u00f0\7p\2\2"+
		"\u00ef\u00e6\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\22\3\2\2\2\u00f1\u00f2"+
		"\7c\2\2\u00f2\u00f3\7\"\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7c\2\2\u00f5"+
		"\u00f6\7\"\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7t\2"+
		"\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7j\2\2\u00fc\u010c"+
		"\7c\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7\"\2\2\u00ff\u0100\7n\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7\"\2\2\u0102\u0103\7k\2\2\u0103\u0104\7|\2"+
		"\2\u0104\u0105\7s\2\2\u0105\u0106\7w\2\2\u0106\u0107\7k\2\2\u0107\u0108"+
		"\7g\2\2\u0108\u0109\7t\2\2\u0109\u010a\7f\2\2\u010a\u010c\7c\2\2\u010b"+
		"\u00f1\3\2\2\2\u010b\u00fd\3\2\2\2\u010c\24\3\2\2\2\u010d\u010e\7m\2\2"+
		"\u010e\u010f\7k\2\2\u010f\u0110\7n\2\2\u0110\u0111\7q\2\2\u0111\u0112"+
		"\7o\2\2\u0112\u0113\7g\2\2\u0113\u0114\7v\2\2\u0114\u0115\7t\2\2\u0115"+
		"\u0116\7q\2\2\u0116\u012c\7u\2\2\u0117\u0118\7o\2\2\u0118\u0119\7g\2\2"+
		"\u0119\u011a\7v\2\2\u011a\u011b\7t\2\2\u011b\u011c\7q\2\2\u011c\u012c"+
		"\7u\2\2\u011d\u011e\7m\2\2\u011e\u011f\7k\2\2\u011f\u0120\7n\2\2\u0120"+
		"\u0121\7q\2\2\u0121\u0122\7o\2\2\u0122\u0123\7g\2\2\u0123\u0124\7v\2\2"+
		"\u0124\u0125\7t\2\2\u0125\u012c\7q\2\2\u0126\u0127\7o\2\2\u0127\u0128"+
		"\7g\2\2\u0128\u0129\7v\2\2\u0129\u012a\7t\2\2\u012a\u012c\7q\2\2\u012b"+
		"\u010d\3\2\2\2\u012b\u0117\3\2\2\2\u012b\u011d\3\2\2\2\u012b\u0126\3\2"+
		"\2\2\u012c\26\3\2\2\2\u012d\u012e\7\60\2\2\u012e\30\3\2\2\2\u012f\u0130"+
		"\7c\2\2\u0130\u0131\7e\2\2\u0131\u0132\7g\2\2\u0132\u0133\7n\2\2\u0133"+
		"\u0134\7g\2\2\u0134\u0135\7t\2\2\u0135\u0136\7c\2\2\u0136\32\3\2\2\2\u0137"+
		"\u0138\7r\2\2\u0138\u0139\7c\2\2\u0139\u013a\7u\2\2\u013a\u013b\7c\2\2"+
		"\u013b\u013c\7t\2\2\u013c\u013d\7\"\2\2\u013d\u013e\7e\2\2\u013e\u013f"+
		"\7c\2\2\u013f\u0140\7o\2\2\u0140\u0141\7d\2\2\u0141\u0142\7k\2\2\u0142"+
		"\u0143\7q\2\2\u0143\u0144\7\"\2\2\u0144\u0145\7g\2\2\u0145\u0146\7p\2"+
		"\2\u0146\34\3\2\2\2\u0147\u0148\7f\2\2\u0148\u0149\7g\2\2\u0149\u014a"+
		"\7t\2\2\u014a\u014b\7t\2\2\u014b\u014c\7c\2\2\u014c\u014d\7r\2\2\u014d"+
		"\u014e\7c\2\2\u014e\u014f\7t\2\2\u014f\u0150\7\"\2\2\u0150\u0151\7c\2"+
		"\2\u0151\36\3\2\2\2\u0152\u0153\7q\2\2\u0153 \3\2\2\2\u0154\u0155\7{\2"+
		"\2\u0155\"\3\2\2\2\u0156\u0157\7f\2\2\u0157\u0158\7k\2\2\u0158\u0159\7"+
		"u\2\2\u0159\u015a\7v\2\2\u015a\u015b\7c\2\2\u015b\u015c\7p\2\2\u015c\u015d"+
		"\7e\2\2\u015d\u015e\7k\2\2\u015e\u015f\7c\2\2\u015f\u0160\7\"\2\2\u0160"+
		"\u0161\7o\2\2\u0161\u0162\7c\2\2\u0162\u0163\7{\2\2\u0163\u0164\7q\2\2"+
		"\u0164\u0165\7t\2\2\u0165$\3\2\2\2\u0166\u0167\7f\2\2\u0167\u0168\7k\2"+
		"\2\u0168\u0169\7u\2\2\u0169\u016a\7v\2\2\u016a\u016b\7c\2\2\u016b\u016c"+
		"\7p\2\2\u016c\u016d\7e\2\2\u016d\u016e\7k\2\2\u016e\u016f\7c\2\2\u016f"+
		"\u0170\7\"\2\2\u0170\u0171\7o\2\2\u0171\u0172\7g\2\2\u0172\u0173\7p\2"+
		"\2\u0173\u0174\7q\2\2\u0174\u0175\7t\2\2\u0175&\3\2\2\2\u0176\u0177\7"+
		"f\2\2\u0177\u0178\7k\2\2\u0178\u0179\7u\2\2\u0179\u017a\7v\2\2\u017a\u017b"+
		"\7c\2\2\u017b\u017c\7p\2\2\u017c\u017d\7e\2\2\u017d\u017e\7k\2\2\u017e"+
		"\u017f\7c\2\2\u017f\u0180\7\"\2\2\u0180\u0181\7k\2\2\u0181\u0182\7i\2"+
		"\2\u0182\u0183\7w\2\2\u0183\u0184\7c\2\2\u0184\u0185\7n\2\2\u0185(\3\2"+
		"\2\2\u0186\u0187\7f\2\2\u0187\u0188\7k\2\2\u0188\u0189\7u\2\2\u0189\u018a"+
		"\7v\2\2\u018a\u018b\7c\2\2\u018b\u018c\7p\2\2\u018c\u018d\7e\2\2\u018d"+
		"\u018e\7k\2\2\u018e\u018f\7c\2\2\u018f\u0190\7\"\2\2\u0190\u0191\7f\2"+
		"\2\u0191\u0192\7k\2\2\u0192\u0193\7h\2\2\u0193\u0194\7g\2\2\u0194\u0195"+
		"\7t\2\2\u0195\u0196\7g\2\2\u0196\u0197\7p\2\2\u0197\u0198\7v\2\2\u0198"+
		"\u0199\7g\2\2\u0199*\3\2\2\2\u019a\u019c\t\2\2\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e,\3\2\2\2"+
		"\u019f\u01a1\7/\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3"+
		"\3\2\2\2\u01a2\u01a4\t\3\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6.\3\2\2\2\u01a7\u01a9\7/\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\t\3"+
		"\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\7\60\2\2\u01b0\u01b2\t"+
		"\3\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\60\3\2\2\2\u01b5\u01b7\t\4\2\2\u01b6\u01b5\3\2\2"+
		"\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01bb\b\31\2\2\u01bb\62\3\2\2\2\17\2\u00c0\u00e4\u00ef"+
		"\u010b\u012b\u019d\u01a0\u01a5\u01a8\u01ad\u01b3\u01b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}