package ANTLR;

// Generated from LexerT.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGINGPS=1, END=2, BEGIN=3, INPUT=4, OUTPUT=5, ORDEN=6, DIRECCION=7, DISTANCIA=8, 
		SENTIDO=9, MEDIDA=10, PUNTO=11, EXPONENCIAL=12, COSENO=13, RAIZC=14, OR=15, 
		AND=16, MAYOR=17, MENOR=18, EQUAL=19, NOTEQUAL=20, VARNAME=21, CADENA=22, 
		INT=23, FLOAT=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"BEGINGPS", "END", "BEGIN", "INPUT", "OUTPUT", "ORDEN", "DIRECCION", "DISTANCIA", 
		"SENTIDO", "MEDIDA", "PUNTO", "EXPONENCIAL", "COSENO", "RAIZC", "OR", 
		"AND", "MAYOR", "MENOR", "EQUAL", "NOTEQUAL", "VARNAME", "CADENA", "INT", 
		"FLOAT", "WS"
	};


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u01c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u00c3\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e7\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00f2\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u010e\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u012e\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\6\26\u019e\n\26\r\26\16\26\u019f\3\27\3\27\6\27\u01a4\n\27"+
		"\r\27\16\27\u01a5\3\27\3\27\3\30\5\30\u01ab\n\30\3\30\6\30\u01ae\n\30"+
		"\r\30\16\30\u01af\3\31\5\31\u01b3\n\31\3\31\6\31\u01b6\n\31\r\31\16\31"+
		"\u01b7\3\31\3\31\6\31\u01bc\n\31\r\31\16\31\u01bd\3\32\6\32\u01c1\n\32"+
		"\r\32\16\32\u01c2\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\3\2\6\3\2c|\7\2\"\"*+C\\c|~~\3\2\62;\5\2\13\f\17\17\""+
		"\"\u01d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5H\3\2\2\2\7b\3\2\2"+
		"\2\t}\3\2\2\2\13\u0093\3\2\2\2\r\u00c2\3\2\2\2\17\u00e6\3\2\2\2\21\u00f1"+
		"\3\2\2\2\23\u010d\3\2\2\2\25\u012d\3\2\2\2\27\u012f\3\2\2\2\31\u0131\3"+
		"\2\2\2\33\u0139\3\2\2\2\35\u0149\3\2\2\2\37\u0154\3\2\2\2!\u0156\3\2\2"+
		"\2#\u0158\3\2\2\2%\u0168\3\2\2\2\'\u0178\3\2\2\2)\u0188\3\2\2\2+\u019d"+
		"\3\2\2\2-\u01a1\3\2\2\2/\u01aa\3\2\2\2\61\u01b2\3\2\2\2\63\u01c0\3\2\2"+
		"\2\65\66\7d\2\2\66\67\7k\2\2\678\7g\2\289\7p\2\29:\7x\2\2:;\7g\2\2;<\7"+
		"p\2\2<=\7k\2\2=>\7f\2\2>?\7q\2\2?@\7\"\2\2@A\7c\2\2AB\7n\2\2BC\7\"\2\2"+
		"CD\7i\2\2DE\7r\2\2EF\7u\2\2FG\7\60\2\2G\4\3\2\2\2HI\7j\2\2IJ\7c\2\2JK"+
		"\7u\2\2KL\7\"\2\2LM\7n\2\2MN\7n\2\2NO\7g\2\2OP\7i\2\2PQ\7c\2\2QR\7f\2"+
		"\2RS\7q\2\2ST\7\"\2\2TU\7c\2\2UV\7\"\2\2VW\7v\2\2WX\7w\2\2XY\7\"\2\2Y"+
		"Z\7f\2\2Z[\7g\2\2[\\\7u\2\2\\]\7v\2\2]^\7k\2\2^_\7p\2\2_`\7q\2\2`a\7\60"+
		"\2\2a\6\3\2\2\2bc\7f\2\2cd\7g\2\2de\7u\2\2ef\7f\2\2fg\7g\2\2gh\7\"\2\2"+
		"hi\7v\2\2ij\7w\2\2jk\7\"\2\2kl\7w\2\2lm\7d\2\2mn\7k\2\2no\7e\2\2op\7c"+
		"\2\2pq\7e\2\2qr\7k\2\2rs\7q\2\2st\7p\2\2tu\7\"\2\2uv\7c\2\2vw\7e\2\2w"+
		"x\7v\2\2xy\7w\2\2yz\7c\2\2z{\7n\2\2{|\7.\2\2|\b\3\2\2\2}~\7r\2\2~\177"+
		"\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7h\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7e\2\2\u0086"+
		"\u0087\7k\2\2\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2\u0089\u008a\7\"\2"+
		"\2\u008a\u008b\7f\2\2\u008b\u008c\7g\2\2\u008c\u008d\7\"\2\2\u008d\u008e"+
		"\7t\2\2\u008e\u008f\7w\2\2\u008f\u0090\7v\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7<\2\2\u0092\n\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7f\2\2\u0096\u0097\7k\2\2\u0097\u0098\7e\2\2\u0098\u0099\7c\2\2"+
		"\u0099\u009a\7e\2\2\u009a\u009b\7k\2\2\u009b\u009c\7q\2\2\u009c\u009d"+
		"\7p\2\2\u009d\u009e\7g\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7\"\2\2\u00a0"+
		"\u00a1\7f\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\7t\2"+
		"\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8"+
		"\7<\2\2\u00a8\f\3\2\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7t\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7i\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\u00b0\7v\2\2\u00b0\u00c3\7g\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7k\2\2"+
		"\u00b3\u00b4\7i\2\2\u00b4\u00b5\7w\2\2\u00b5\u00c3\7g\2\2\u00b6\u00b7"+
		"\7e\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7w\2\2\u00bd\u00c3\7c\2\2"+
		"\u00be\u00bf\7i\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c3"+
		"\7c\2\2\u00c2\u00a9\3\2\2\2\u00c2\u00b1\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2"+
		"\u00be\3\2\2\2\u00c3\16\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2"+
		"\u00c6\u00c7\7\"\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca"+
		"\7t\2\2\u00ca\u00cb\7v\2\2\u00cb\u00e7\7g\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7n\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7w\2"+
		"\2\u00d1\u00e7\7t\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5"+
		"\7\"\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00e7\7g\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7\"\2"+
		"\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7u\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0\u00e7\7g\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"\u00e4\7e\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e7\7q\2\2\u00e6\u00c4\3\2\2"+
		"\2\u00e6\u00cc\3\2\2\2\u00e6\u00d2\3\2\2\2\u00e6\u00d9\3\2\2\2\u00e6\u00e1"+
		"\3\2\2\2\u00e7\20\3\2\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7w\2\2\u00ea"+
		"\u00eb\7t\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7v\2\2"+
		"\u00ee\u00f2\7g\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f2\7p\2\2\u00f1\u00e8"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\22\3\2\2\2\u00f3\u00f4\7c\2\2\u00f4"+
		"\u00f5\7\"\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7\"\2"+
		"\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7j\2\2\u00fe\u010e\7c\2\2\u00ff"+
		"\u0100\7c\2\2\u0100\u0101\7\"\2\2\u0101\u0102\7n\2\2\u0102\u0103\7c\2"+
		"\2\u0103\u0104\7\"\2\2\u0104\u0105\7k\2\2\u0105\u0106\7|\2\2\u0106\u0107"+
		"\7s\2\2\u0107\u0108\7w\2\2\u0108\u0109\7k\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7t\2\2\u010b\u010c\7f\2\2\u010c\u010e\7c\2\2\u010d\u00f3\3\2\2"+
		"\2\u010d\u00ff\3\2\2\2\u010e\24\3\2\2\2\u010f\u0110\7m\2\2\u0110\u0111"+
		"\7k\2\2\u0111\u0112\7n\2\2\u0112\u0113\7q\2\2\u0113\u0114\7o\2\2\u0114"+
		"\u0115\7g\2\2\u0115\u0116\7v\2\2\u0116\u0117\7t\2\2\u0117\u0118\7q\2\2"+
		"\u0118\u012e\7u\2\2\u0119\u011a\7o\2\2\u011a\u011b\7g\2\2\u011b\u011c"+
		"\7v\2\2\u011c\u011d\7t\2\2\u011d\u011e\7q\2\2\u011e\u012e\7u\2\2\u011f"+
		"\u0120\7m\2\2\u0120\u0121\7k\2\2\u0121\u0122\7n\2\2\u0122\u0123\7q\2\2"+
		"\u0123\u0124\7o\2\2\u0124\u0125\7g\2\2\u0125\u0126\7v\2\2\u0126\u0127"+
		"\7t\2\2\u0127\u012e\7q\2\2\u0128\u0129\7o\2\2\u0129\u012a\7g\2\2\u012a"+
		"\u012b\7v\2\2\u012b\u012c\7t\2\2\u012c\u012e\7q\2\2\u012d\u010f\3\2\2"+
		"\2\u012d\u0119\3\2\2\2\u012d\u011f\3\2\2\2\u012d\u0128\3\2\2\2\u012e\26"+
		"\3\2\2\2\u012f\u0130\7\60\2\2\u0130\30\3\2\2\2\u0131\u0132\7c\2\2\u0132"+
		"\u0133\7e\2\2\u0133\u0134\7g\2\2\u0134\u0135\7n\2\2\u0135\u0136\7g\2\2"+
		"\u0136\u0137\7t\2\2\u0137\u0138\7c\2\2\u0138\32\3\2\2\2\u0139\u013a\7"+
		"r\2\2\u013a\u013b\7c\2\2\u013b\u013c\7u\2\2\u013c\u013d\7c\2\2\u013d\u013e"+
		"\7t\2\2\u013e\u013f\7\"\2\2\u013f\u0140\7e\2\2\u0140\u0141\7c\2\2\u0141"+
		"\u0142\7o\2\2\u0142\u0143\7d\2\2\u0143\u0144\7k\2\2\u0144\u0145\7q\2\2"+
		"\u0145\u0146\7\"\2\2\u0146\u0147\7g\2\2\u0147\u0148\7p\2\2\u0148\34\3"+
		"\2\2\2\u0149\u014a\7f\2\2\u014a\u014b\7g\2\2\u014b\u014c\7t\2\2\u014c"+
		"\u014d\7t\2\2\u014d\u014e\7c\2\2\u014e\u014f\7r\2\2\u014f\u0150\7c\2\2"+
		"\u0150\u0151\7t\2\2\u0151\u0152\7\"\2\2\u0152\u0153\7c\2\2\u0153\36\3"+
		"\2\2\2\u0154\u0155\7q\2\2\u0155 \3\2\2\2\u0156\u0157\7{\2\2\u0157\"\3"+
		"\2\2\2\u0158\u0159\7f\2\2\u0159\u015a\7k\2\2\u015a\u015b\7u\2\2\u015b"+
		"\u015c\7v\2\2\u015c\u015d\7c\2\2\u015d\u015e\7p\2\2\u015e\u015f\7e\2\2"+
		"\u015f\u0160\7k\2\2\u0160\u0161\7c\2\2\u0161\u0162\7\"\2\2\u0162\u0163"+
		"\7o\2\2\u0163\u0164\7c\2\2\u0164\u0165\7{\2\2\u0165\u0166\7q\2\2\u0166"+
		"\u0167\7t\2\2\u0167$\3\2\2\2\u0168\u0169\7f\2\2\u0169\u016a\7k\2\2\u016a"+
		"\u016b\7u\2\2\u016b\u016c\7v\2\2\u016c\u016d\7c\2\2\u016d\u016e\7p\2\2"+
		"\u016e\u016f\7e\2\2\u016f\u0170\7k\2\2\u0170\u0171\7c\2\2\u0171\u0172"+
		"\7\"\2\2\u0172\u0173\7o\2\2\u0173\u0174\7g\2\2\u0174\u0175\7p\2\2\u0175"+
		"\u0176\7q\2\2\u0176\u0177\7t\2\2\u0177&\3\2\2\2\u0178\u0179\7f\2\2\u0179"+
		"\u017a\7k\2\2\u017a\u017b\7u\2\2\u017b\u017c\7v\2\2\u017c\u017d\7c\2\2"+
		"\u017d\u017e\7p\2\2\u017e\u017f\7e\2\2\u017f\u0180\7k\2\2\u0180\u0181"+
		"\7c\2\2\u0181\u0182\7\"\2\2\u0182\u0183\7k\2\2\u0183\u0184\7i\2\2\u0184"+
		"\u0185\7w\2\2\u0185\u0186\7c\2\2\u0186\u0187\7n\2\2\u0187(\3\2\2\2\u0188"+
		"\u0189\7f\2\2\u0189\u018a\7k\2\2\u018a\u018b\7u\2\2\u018b\u018c\7v\2\2"+
		"\u018c\u018d\7c\2\2\u018d\u018e\7p\2\2\u018e\u018f\7e\2\2\u018f\u0190"+
		"\7k\2\2\u0190\u0191\7c\2\2\u0191\u0192\7\"\2\2\u0192\u0193\7f\2\2\u0193"+
		"\u0194\7k\2\2\u0194\u0195\7h\2\2\u0195\u0196\7g\2\2\u0196\u0197\7t\2\2"+
		"\u0197\u0198\7g\2\2\u0198\u0199\7p\2\2\u0199\u019a\7v\2\2\u019a\u019b"+
		"\7g\2\2\u019b*\3\2\2\2\u019c\u019e\t\2\2\2\u019d\u019c\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0,\3\2\2\2\u01a1"+
		"\u01a3\7$\2\2\u01a2\u01a4\t\3\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\7$\2\2\u01a8.\3\2\2\2\u01a9\u01ab\7/\2\2\u01aa\u01a9\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01ae\t\4\2\2\u01ad\u01ac\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\60\3\2\2\2\u01b1\u01b3\7/\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2"+
		"\u01b3\u01b5\3\2\2\2\u01b4\u01b6\t\4\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01bb\7\60\2\2\u01ba\u01bc\t\4\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3"+
		"\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\62\3\2\2\2\u01bf"+
		"\u01c1\t\5\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\b\32\2\2\u01c5"+
		"\64\3\2\2\2\20\2\u00c2\u00e6\u00f1\u010d\u012d\u019f\u01a5\u01aa\u01af"+
		"\u01b2\u01b7\u01bd\u01c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}