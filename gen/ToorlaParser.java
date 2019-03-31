// Generated from /home/hadi/Desktop/compiler/compiler_phase1/PLC_Spring98_Toorla/grammar/Toorla.g4 by ANTLR 4.7.2

    import toorla.ast.expression.binaryExpression.*;
    import toorla.ast.expression.value.*;
    import toorla.ast.expression.*;
    import toorla.ast.statement.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToorlaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, Main=45, ID=46, 
		LETTER=47, STRINGCONST=48, NUMBER=49, CHARACTER=50, WS=51, KEYWORD=52, 
		SPECIAL=53;
	public static final int
		RULE_program = 0, RULE_classStar = 1, RULE_class1 = 2, RULE_entryClass = 3, 
		RULE_mainFunc = 4, RULE_classBody = 5, RULE_classItemStar = 6, RULE_field = 7, 
		RULE_access_modifier = 8, RULE_idPlus = 9, RULE_idStar = 10, RULE_primitiveType = 11, 
		RULE_type = 12, RULE_method = 13, RULE_argumentList = 14, RULE_argumentStar = 15, 
		RULE_argument = 16, RULE_funcBody = 17, RULE_statementStar = 18, RULE_statement = 19, 
		RULE_singleStatement = 20, RULE_declaration = 21, RULE_assignListPlus = 22, 
		RULE_assignListStar = 23, RULE_assignID = 24, RULE_assign = 25, RULE_block = 26, 
		RULE_breakRole = 27, RULE_ifRole = 28, RULE_continueRole = 29, RULE_dec = 30, 
		RULE_inc = 31, RULE_printRole = 32, RULE_returnRole = 33, RULE_whileRole = 34, 
		RULE_expression = 35, RULE_expressionL1 = 36, RULE_expressionL2 = 37, 
		RULE_expressionL3 = 38, RULE_expressionL4 = 39, RULE_expressionL5 = 40, 
		RULE_expressionL6 = 41, RULE_expressionL7 = 42, RULE_singleExpression = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classStar", "class1", "entryClass", "mainFunc", "classBody", 
			"classItemStar", "field", "access_modifier", "idPlus", "idStar", "primitiveType", 
			"type", "method", "argumentList", "argumentStar", "argument", "funcBody", 
			"statementStar", "statement", "singleStatement", "declaration", "assignListPlus", 
			"assignListStar", "assignID", "assign", "block", "breakRole", "ifRole", 
			"continueRole", "dec", "inc", "printRole", "returnRole", "whileRole", 
			"expression", "expressionL1", "expressionL2", "expressionL3", "expressionL4", 
			"expressionL5", "expressionL6", "expressionL7", "singleExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'inherits'", "':'", "'end'", "'entry'", "'public'", 
			"'function'", "'()'", "'returns'", "'int'", "'field'", "';'", "'private'", 
			"','", "'string'", "'bool'", "'['", "']'", "'('", "')'", "'var'", "'='", 
			"'begin'", "'break'", "'if'", "'else'", "'continue'", "'--'", "'++'", 
			"'print'", "'return'", "'while'", "'||'", "'&&'", "'=='", "'<>'", "'>'", 
			"'<'", "'-'", "'+'", "'/'", "'*'", "'%'", "'!'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Main", "ID", "LETTER", 
			"STRINGCONST", "NUMBER", "CHARACTER", "WS", "KEYWORD", "SPECIAL"
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
	public String getGrammarFileName() { return "Toorla.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int counter;
	    void print()
	    {
	        System.out.println( "hello" );
	    }

	public ToorlaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ClassStarContext> classStar() {
			return getRuleContexts(ClassStarContext.class);
		}
		public ClassStarContext classStar(int i) {
			return getRuleContext(ClassStarContext.class,i);
		}
		public EntryClassContext entryClass() {
			return getRuleContext(EntryClassContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			classStar();
			setState(89);
			entryClass();
			setState(90);
			classStar();
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

	public static class ClassStarContext extends ParserRuleContext {
		public Class1Context class1() {
			return getRuleContext(Class1Context.class,0);
		}
		public ClassStarContext classStar() {
			return getRuleContext(ClassStarContext.class,0);
		}
		public ClassStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClassStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClassStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClassStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStarContext classStar() throws RecognitionException {
		ClassStarContext _localctx = new ClassStarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classStar);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				class1();
				setState(93);
				classStar();
				}
				break;
			case EOF:
			case T__4:
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

	public static class Class1Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public Class1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClass1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClass1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClass1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class1Context class1() throws RecognitionException {
		Class1Context _localctx = new Class1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_class1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__0);
			setState(99);
			match(ID);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(100);
				match(T__1);
				setState(101);
				match(ID);
				}
			}

			setState(104);
			match(T__2);
			setState(105);
			classBody();
			setState(106);
			match(T__3);
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

	public static class EntryClassContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public List<ClassItemStarContext> classItemStar() {
			return getRuleContexts(ClassItemStarContext.class);
		}
		public ClassItemStarContext classItemStar(int i) {
			return getRuleContext(ClassItemStarContext.class,i);
		}
		public MainFuncContext mainFunc() {
			return getRuleContext(MainFuncContext.class,0);
		}
		public EntryClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterEntryClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitEntryClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitEntryClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryClassContext entryClass() throws RecognitionException {
		EntryClassContext _localctx = new EntryClassContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entryClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__4);
			setState(109);
			match(T__0);
			setState(110);
			match(ID);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(111);
				match(T__1);
				setState(112);
				match(ID);
				}
			}

			setState(115);
			match(T__2);
			setState(116);
			classItemStar();
			setState(117);
			mainFunc();
			setState(118);
			classItemStar();
			setState(119);
			match(T__3);
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

	public static class MainFuncContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(ToorlaParser.Main, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public MainFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterMainFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitMainFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitMainFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFuncContext mainFunc() throws RecognitionException {
		MainFuncContext _localctx = new MainFuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(121);
				match(T__5);
				}
			}

			setState(124);
			match(T__6);
			setState(125);
			match(Main);
			setState(126);
			match(T__7);
			setState(127);
			match(T__8);
			setState(128);
			match(T__9);
			setState(129);
			match(T__2);
			setState(130);
			funcBody();
			setState(131);
			match(T__3);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassItemStarContext classItemStar() {
			return getRuleContext(ClassItemStarContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(133);
				field();
				}
				break;
			case 2:
				{
				setState(134);
				method();
				}
				break;
			}
			setState(137);
			classItemStar();
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

	public static class ClassItemStarContext extends ParserRuleContext {
		public ClassItemStarContext classItemStar() {
			return getRuleContext(ClassItemStarContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ClassItemStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classItemStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClassItemStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClassItemStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClassItemStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassItemStarContext classItemStar() throws RecognitionException {
		ClassItemStarContext _localctx = new ClassItemStarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classItemStar);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(139);
					field();
					}
					break;
				case 2:
					{
					setState(140);
					method();
					}
					break;
				}
				setState(143);
				classItemStar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FieldContext extends ParserRuleContext {
		public IdPlusContext idPlus() {
			return getRuleContext(IdPlusContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__12) {
				{
				setState(148);
				access_modifier();
				}
			}

			setState(151);
			match(T__10);
			setState(152);
			idPlus();
			setState(153);
			type(0);
			setState(154);
			match(T__11);
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

	public static class Access_modifierContext extends ParserRuleContext {
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitAccess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_access_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__12) ) {
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

	public static class IdPlusContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public IdStarContext idStar() {
			return getRuleContext(IdStarContext.class,0);
		}
		public IdPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterIdPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitIdPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitIdPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdPlusContext idPlus() throws RecognitionException {
		IdPlusContext _localctx = new IdPlusContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_idPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			idStar();
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

	public static class IdStarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public IdStarContext idStar() {
			return getRuleContext(IdStarContext.class,0);
		}
		public IdStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterIdStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitIdStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitIdStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdStarContext idStar() throws RecognitionException {
		IdStarContext _localctx = new IdStarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_idStar);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(T__13);
				setState(162);
				match(ID);
				setState(163);
				idStar();
				}
				break;
			case T__9:
			case T__14:
			case T__15:
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			primitiveType();
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(172);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(173);
					match(T__16);
					setState(174);
					match(T__17);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__12) {
				{
				setState(180);
				access_modifier();
				}
			}

			setState(183);
			match(T__6);
			setState(184);
			match(ID);
			setState(185);
			match(T__18);
			setState(186);
			argumentList();
			setState(187);
			match(T__19);
			setState(188);
			match(T__8);
			setState(189);
			type(0);
			setState(190);
			match(T__2);
			setState(191);
			funcBody();
			setState(192);
			match(T__3);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentStarContext argumentStar() {
			return getRuleContext(ArgumentStarContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argumentList);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				argument();
				setState(195);
				argumentStar();
				}
				break;
			case T__19:
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

	public static class ArgumentStarContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentStarContext argumentStar() {
			return getRuleContext(ArgumentStarContext.class,0);
		}
		public ArgumentStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterArgumentStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitArgumentStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitArgumentStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentStarContext argumentStar() throws RecognitionException {
		ArgumentStarContext _localctx = new ArgumentStarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumentStar);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__13);
				setState(201);
				argument();
				setState(202);
				argumentStar();
				}
				break;
			case T__19:
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(ID);
			setState(208);
			match(T__2);
			setState(209);
			type(0);
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

	public static class FuncBodyContext extends ParserRuleContext {
		public StatementStarContext statementStar() {
			return getRuleContext(StatementStarContext.class,0);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitFuncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			statementStar();
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

	public static class StatementStarContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementStarContext statementStar() {
			return getRuleContext(StatementStarContext.class,0);
		}
		public StatementStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatementStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatementStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatementStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementStarContext statementStar() throws RecognitionException {
		StatementStarContext _localctx = new StatementStarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementStar);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				statement();
				setState(214);
				statementStar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfRoleContext ifRole() {
			return getRuleContext(IfRoleContext.class,0);
		}
		public WhileRoleContext whileRole() {
			return getRuleContext(WhileRoleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				singleStatement(0);
				setState(220);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				ifRole();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				whileRole();
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

	public static class SingleStatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public BreakRoleContext breakRole() {
			return getRuleContext(BreakRoleContext.class,0);
		}
		public ContinueRoleContext continueRole() {
			return getRuleContext(ContinueRoleContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public PrintRoleContext printRole() {
			return getRuleContext(PrintRoleContext.class,0);
		}
		public ReturnRoleContext returnRole() {
			return getRuleContext(ReturnRoleContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		return singleStatement(0);
	}

	private SingleStatementContext singleStatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, _parentState);
		SingleStatementContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_singleStatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(228);
				assign();
				}
				break;
			case 2:
				{
				setState(229);
				breakRole();
				}
				break;
			case 3:
				{
				setState(230);
				continueRole();
				}
				break;
			case 4:
				{
				setState(231);
				dec();
				}
				break;
			case 5:
				{
				setState(232);
				inc();
				}
				break;
			case 6:
				{
				setState(233);
				printRole();
				}
				break;
			case 7:
				{
				setState(234);
				returnRole();
				}
				break;
			case 8:
				{
				setState(235);
				declaration();
				}
				break;
			case 9:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SingleStatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_singleStatement);
					setState(239);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(240);
					match(T__11);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public AssignListPlusContext assignListPlus() {
			return getRuleContext(AssignListPlusContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__20);
			setState(247);
			assignListPlus();
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

	public static class AssignListPlusContext extends ParserRuleContext {
		public AssignIDContext assignID() {
			return getRuleContext(AssignIDContext.class,0);
		}
		public AssignListStarContext assignListStar() {
			return getRuleContext(AssignListStarContext.class,0);
		}
		public AssignListPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignListPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterAssignListPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitAssignListPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitAssignListPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignListPlusContext assignListPlus() throws RecognitionException {
		AssignListPlusContext _localctx = new AssignListPlusContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignListPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			assignID();
			setState(250);
			assignListStar();
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

	public static class AssignListStarContext extends ParserRuleContext {
		public AssignIDContext assignID() {
			return getRuleContext(AssignIDContext.class,0);
		}
		public AssignListStarContext assignListStar() {
			return getRuleContext(AssignListStarContext.class,0);
		}
		public AssignListStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignListStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterAssignListStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitAssignListStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitAssignListStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignListStarContext assignListStar() throws RecognitionException {
		AssignListStarContext _localctx = new AssignListStarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignListStar);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(T__13);
				setState(253);
				assignID();
				setState(254);
				assignListStar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AssignIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterAssignID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitAssignID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitAssignID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignIDContext assignID() throws RecognitionException {
		AssignIDContext _localctx = new AssignIDContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
			setState(260);
			match(T__21);
			setState(261);
			expression();
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

	public static class AssignContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			expression();
			setState(264);
			match(T__21);
			setState(265);
			expression();
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

	public static class BlockContext extends ParserRuleContext {
		public StatementStarContext statementStar() {
			return getRuleContext(StatementStarContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__22);
			setState(268);
			statementStar();
			setState(269);
			match(T__3);
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

	public static class BreakRoleContext extends ParserRuleContext {
		public BreakRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterBreakRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitBreakRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitBreakRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakRoleContext breakRole() throws RecognitionException {
		BreakRoleContext _localctx = new BreakRoleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_breakRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__23);
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

	public static class IfRoleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterIfRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitIfRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitIfRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfRoleContext ifRole() throws RecognitionException {
		IfRoleContext _localctx = new IfRoleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifRole);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(T__24);
				setState(274);
				match(T__18);
				setState(275);
				expression();
				setState(276);
				match(T__19);
				setState(277);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__24);
				setState(280);
				match(T__18);
				setState(281);
				expression();
				setState(282);
				match(T__19);
				setState(283);
				statement();
				setState(284);
				match(T__25);
				setState(285);
				statement();
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

	public static class ContinueRoleContext extends ParserRuleContext {
		public ContinueRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterContinueRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitContinueRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitContinueRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueRoleContext continueRole() throws RecognitionException {
		ContinueRoleContext _localctx = new ContinueRoleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_continueRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__26);
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

	public static class DecContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			expression();
			setState(292);
			match(T__27);
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

	public static class IncContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expression();
			setState(295);
			match(T__28);
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

	public static class PrintRoleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public TerminalNode STRINGCONST() { return getToken(ToorlaParser.STRINGCONST, 0); }
		public TerminalNode NUMBER() { return getToken(ToorlaParser.NUMBER, 0); }
		public PrintRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterPrintRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitPrintRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitPrintRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintRoleContext printRole() throws RecognitionException {
		PrintRoleContext _localctx = new PrintRoleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_printRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__29);
			setState(298);
			match(T__18);
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGCONST) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(300);
			match(T__19);
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

	public static class ReturnRoleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterReturnRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitReturnRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitReturnRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnRoleContext returnRole() throws RecognitionException {
		ReturnRoleContext _localctx = new ReturnRoleContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returnRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__30);
			setState(303);
			expression();
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

	public static class WhileRoleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterWhileRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitWhileRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitWhileRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileRoleContext whileRole() throws RecognitionException {
		WhileRoleContext _localctx = new WhileRoleContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_whileRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__31);
			setState(306);
			match(T__18);
			setState(307);
			expression();
			setState(308);
			match(T__19);
			setState(309);
			statement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionL1Context> expressionL1() {
			return getRuleContexts(ExpressionL1Context.class);
		}
		public ExpressionL1Context expressionL1(int i) {
			return getRuleContext(ExpressionL1Context.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				expressionL1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				expressionL1();
				setState(313);
				match(T__32);
				setState(314);
				expressionL1();
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

	public static class ExpressionL1Context extends ParserRuleContext {
		public List<ExpressionL2Context> expressionL2() {
			return getRuleContexts(ExpressionL2Context.class);
		}
		public ExpressionL2Context expressionL2(int i) {
			return getRuleContext(ExpressionL2Context.class,i);
		}
		public ExpressionL1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionL1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionL1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionL1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionL1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionL1Context expressionL1() throws RecognitionException {
		ExpressionL1Context _localctx = new ExpressionL1Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionL1);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				expressionL2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				expressionL2();
				setState(320);
				match(T__33);
				setState(321);
				expressionL2();
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

	public static class ExpressionL2Context extends ParserRuleContext {
		public List<ExpressionL3Context> expressionL3() {
			return getRuleContexts(ExpressionL3Context.class);
		}
		public ExpressionL3Context expressionL3(int i) {
			return getRuleContext(ExpressionL3Context.class,i);
		}
		public ExpressionL2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionL2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionL2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionL2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionL2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionL2Context expressionL2() throws RecognitionException {
		ExpressionL2Context _localctx = new ExpressionL2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressionL2);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				expressionL3();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				expressionL3();
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==T__34 || _la==T__35) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				expressionL3();
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

	public static class ExpressionL3Context extends ParserRuleContext {
		public List<ExpressionL4Context> expressionL4() {
			return getRuleContexts(ExpressionL4Context.class);
		}
		public ExpressionL4Context expressionL4(int i) {
			return getRuleContext(ExpressionL4Context.class,i);
		}
		public ExpressionL3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionL3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionL3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionL3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionL3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionL3Context expressionL3() throws RecognitionException {
		ExpressionL3Context _localctx = new ExpressionL3Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionL3);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				expressionL4();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				expressionL4();
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(335);
				expressionL4();
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

	public static class ExpressionL4Context extends ParserRuleContext {
		public List<ExpressionL5Context> expressionL5() {
			return getRuleContexts(ExpressionL5Context.class);
		}
		public ExpressionL5Context expressionL5(int i) {
			return getRuleContext(ExpressionL5Context.class,i);
		}
		public ExpressionL4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionL4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionL4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionL4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionL4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionL4Context expressionL4() throws RecognitionException {
		ExpressionL4Context _localctx = new ExpressionL4Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionL4);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				expressionL5();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				expressionL5();
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==T__38 || _la==T__39) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				expressionL5();
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

	public static class ExpressionL5Context extends ParserRuleContext {
		public List<ExpressionL6Context> expressionL6() {
			return getRuleContexts(ExpressionL6Context.class);
		}
		public ExpressionL6Context expressionL6(int i) {
			return getRuleContext(ExpressionL6Context.class,i);
		}
		public ExpressionL5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionL5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionL5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionL5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionL5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionL5Context expressionL5() throws RecognitionException {
		ExpressionL5Context _localctx = new ExpressionL5Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionL5);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				expressionL6();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				expressionL6();
				setState(348);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(349);
				expressionL6();
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

	public static class ExpressionL6Context extends ParserRuleContext {
		public ExpressionL7Context expressionL7() {
			return getRuleContext(ExpressionL7Context.class,0);
		}
		public ExpressionL6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionL6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionL6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionL6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionL6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionL6Context expressionL6() throws RecognitionException {
		ExpressionL6Context _localctx = new ExpressionL6Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionL6);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case ID:
			case STRINGCONST:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				expressionL7();
				}
				break;
			case T__38:
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				_la = _input.LA(1);
				if ( !(_la==T__38 || _la==T__43) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(355);
				expressionL7();
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

	public static class ExpressionL7Context extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionL7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionL7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterExpressionL7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitExpressionL7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitExpressionL7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionL7Context expressionL7() throws RecognitionException {
		ExpressionL7Context _localctx = new ExpressionL7Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressionL7);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case STRINGCONST:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				singleExpression();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(T__18);
				setState(360);
				singleExpression();
				setState(361);
				match(T__19);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ToorlaParser.NUMBER, 0); }
		public TerminalNode STRINGCONST() { return getToken(ToorlaParser.STRINGCONST, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_singleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRINGCONST) | (1L << NUMBER))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 20:
			return singleStatement_sempred((SingleStatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean singleStatement_sempred(SingleStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0172\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3c\n\3\3\4\3\4\3\4\3\4\5"+
		"\4i\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\5\6}\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u008a"+
		"\n\7\3\7\3\7\3\b\3\b\5\b\u0090\n\b\3\b\3\b\3\b\5\b\u0095\n\b\3\t\5\t\u0098"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00a8"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b2\n\16\f\16\16\16"+
		"\u00b5\13\16\3\17\5\17\u00b8\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00c9\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00d0\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\5\24\u00dc\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e4\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f0\n\26\3\26"+
		"\3\26\7\26\u00f4\n\26\f\26\16\26\u00f7\13\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0104\n\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0122\n\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\5%\u013f\n%\3&\3&\3&\3&\3&\5&\u0146\n&\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u014d\n\'\3(\3(\3(\3(\3(\5(\u0154\n(\3)\3)\3)\3)\3)\5)\u015b\n)\3"+
		"*\3*\3*\3*\3*\5*\u0162\n*\3+\3+\3+\5+\u0167\n+\3,\3,\3,\3,\3,\5,\u016e"+
		"\n,\3-\3-\3-\2\4\32*.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVX\2\n\4\2\b\b\17\17\4\2\f\f\21\22\4\2\60\60"+
		"\62\63\3\2%&\3\2\'(\3\2)*\3\2+-\4\2))..\2\u0169\2Z\3\2\2\2\4b\3\2\2\2"+
		"\6d\3\2\2\2\bn\3\2\2\2\n|\3\2\2\2\f\u0089\3\2\2\2\16\u0094\3\2\2\2\20"+
		"\u0097\3\2\2\2\22\u009e\3\2\2\2\24\u00a0\3\2\2\2\26\u00a7\3\2\2\2\30\u00a9"+
		"\3\2\2\2\32\u00ab\3\2\2\2\34\u00b7\3\2\2\2\36\u00c8\3\2\2\2 \u00cf\3\2"+
		"\2\2\"\u00d1\3\2\2\2$\u00d5\3\2\2\2&\u00db\3\2\2\2(\u00e3\3\2\2\2*\u00ef"+
		"\3\2\2\2,\u00f8\3\2\2\2.\u00fb\3\2\2\2\60\u0103\3\2\2\2\62\u0105\3\2\2"+
		"\2\64\u0109\3\2\2\2\66\u010d\3\2\2\28\u0111\3\2\2\2:\u0121\3\2\2\2<\u0123"+
		"\3\2\2\2>\u0125\3\2\2\2@\u0128\3\2\2\2B\u012b\3\2\2\2D\u0130\3\2\2\2F"+
		"\u0133\3\2\2\2H\u013e\3\2\2\2J\u0145\3\2\2\2L\u014c\3\2\2\2N\u0153\3\2"+
		"\2\2P\u015a\3\2\2\2R\u0161\3\2\2\2T\u0166\3\2\2\2V\u016d\3\2\2\2X\u016f"+
		"\3\2\2\2Z[\5\4\3\2[\\\5\b\5\2\\]\5\4\3\2]\3\3\2\2\2^_\5\6\4\2_`\5\4\3"+
		"\2`c\3\2\2\2ac\3\2\2\2b^\3\2\2\2ba\3\2\2\2c\5\3\2\2\2de\7\3\2\2eh\7\60"+
		"\2\2fg\7\4\2\2gi\7\60\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\5\2\2kl\5"+
		"\f\7\2lm\7\6\2\2m\7\3\2\2\2no\7\7\2\2op\7\3\2\2ps\7\60\2\2qr\7\4\2\2r"+
		"t\7\60\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\5\2\2vw\5\16\b\2wx\5\n\6"+
		"\2xy\5\16\b\2yz\7\6\2\2z\t\3\2\2\2{}\7\b\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2"+
		"\2\2~\177\7\t\2\2\177\u0080\7/\2\2\u0080\u0081\7\n\2\2\u0081\u0082\7\13"+
		"\2\2\u0082\u0083\7\f\2\2\u0083\u0084\7\5\2\2\u0084\u0085\5$\23\2\u0085"+
		"\u0086\7\6\2\2\u0086\13\3\2\2\2\u0087\u008a\5\20\t\2\u0088\u008a\5\34"+
		"\17\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\5\16\b\2\u008c\r\3\2\2\2\u008d\u0090\5\20\t\2\u008e\u0090\5\34"+
		"\17\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\5\16\b\2\u0092\u0095\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008f\3"+
		"\2\2\2\u0094\u0093\3\2\2\2\u0095\17\3\2\2\2\u0096\u0098\5\22\n\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\r"+
		"\2\2\u009a\u009b\5\24\13\2\u009b\u009c\5\32\16\2\u009c\u009d\7\16\2\2"+
		"\u009d\21\3\2\2\2\u009e\u009f\t\2\2\2\u009f\23\3\2\2\2\u00a0\u00a1\7\60"+
		"\2\2\u00a1\u00a2\5\26\f\2\u00a2\25\3\2\2\2\u00a3\u00a4\7\20\2\2\u00a4"+
		"\u00a5\7\60\2\2\u00a5\u00a8\5\26\f\2\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3"+
		"\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa"+
		"\31\3\2\2\2\u00ab\u00ac\b\16\1\2\u00ac\u00ad\5\30\r\2\u00ad\u00b3\3\2"+
		"\2\2\u00ae\u00af\f\3\2\2\u00af\u00b0\7\23\2\2\u00b0\u00b2\7\24\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\33\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\5\22\n\2\u00b7\u00b6"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\t\2\2\u00ba"+
		"\u00bb\7\60\2\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd\5\36\20\2\u00bd\u00be"+
		"\7\26\2\2\u00be\u00bf\7\13\2\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\7\5\2"+
		"\2\u00c1\u00c2\5$\23\2\u00c2\u00c3\7\6\2\2\u00c3\35\3\2\2\2\u00c4\u00c5"+
		"\5\"\22\2\u00c5\u00c6\5 \21\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\3\2\2\2"+
		"\u00c8\u00c4\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00cb"+
		"\7\20\2\2\u00cb\u00cc\5\"\22\2\u00cc\u00cd\5 \21\2\u00cd\u00d0\3\2\2\2"+
		"\u00ce\u00d0\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0!\3"+
		"\2\2\2\u00d1\u00d2\7\60\2\2\u00d2\u00d3\7\5\2\2\u00d3\u00d4\5\32\16\2"+
		"\u00d4#\3\2\2\2\u00d5\u00d6\5&\24\2\u00d6%\3\2\2\2\u00d7\u00d8\5(\25\2"+
		"\u00d8\u00d9\5&\24\2\u00d9\u00dc\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d7"+
		"\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\'\3\2\2\2\u00dd\u00de\5*\26\2\u00de"+
		"\u00df\7\16\2\2\u00df\u00e4\3\2\2\2\u00e0\u00e4\5\66\34\2\u00e1\u00e4"+
		"\5:\36\2\u00e2\u00e4\5F$\2\u00e3\u00dd\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4)\3\2\2\2\u00e5\u00e6\b\26\1\2"+
		"\u00e6\u00f0\5\64\33\2\u00e7\u00f0\58\35\2\u00e8\u00f0\5<\37\2\u00e9\u00f0"+
		"\5> \2\u00ea\u00f0\5@!\2\u00eb\u00f0\5B\"\2\u00ec\u00f0\5D#\2\u00ed\u00f0"+
		"\5,\27\2\u00ee\u00f0\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef"+
		"\u00e8\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00eb\3\2"+
		"\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f5\3\2\2\2\u00f1\u00f2\f\4\2\2\u00f2\u00f4\7\16\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"+\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\27\2\2\u00f9\u00fa\5.\30\2"+
		"\u00fa-\3\2\2\2\u00fb\u00fc\5\62\32\2\u00fc\u00fd\5\60\31\2\u00fd/\3\2"+
		"\2\2\u00fe\u00ff\7\20\2\2\u00ff\u0100\5\62\32\2\u0100\u0101\5\60\31\2"+
		"\u0101\u0104\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u0102"+
		"\3\2\2\2\u0104\61\3\2\2\2\u0105\u0106\7\60\2\2\u0106\u0107\7\30\2\2\u0107"+
		"\u0108\5H%\2\u0108\63\3\2\2\2\u0109\u010a\5H%\2\u010a\u010b\7\30\2\2\u010b"+
		"\u010c\5H%\2\u010c\65\3\2\2\2\u010d\u010e\7\31\2\2\u010e\u010f\5&\24\2"+
		"\u010f\u0110\7\6\2\2\u0110\67\3\2\2\2\u0111\u0112\7\32\2\2\u01129\3\2"+
		"\2\2\u0113\u0114\7\33\2\2\u0114\u0115\7\25\2\2\u0115\u0116\5H%\2\u0116"+
		"\u0117\7\26\2\2\u0117\u0118\5(\25\2\u0118\u0122\3\2\2\2\u0119\u011a\7"+
		"\33\2\2\u011a\u011b\7\25\2\2\u011b\u011c\5H%\2\u011c\u011d\7\26\2\2\u011d"+
		"\u011e\5(\25\2\u011e\u011f\7\34\2\2\u011f\u0120\5(\25\2\u0120\u0122\3"+
		"\2\2\2\u0121\u0113\3\2\2\2\u0121\u0119\3\2\2\2\u0122;\3\2\2\2\u0123\u0124"+
		"\7\35\2\2\u0124=\3\2\2\2\u0125\u0126\5H%\2\u0126\u0127\7\36\2\2\u0127"+
		"?\3\2\2\2\u0128\u0129\5H%\2\u0129\u012a\7\37\2\2\u012aA\3\2\2\2\u012b"+
		"\u012c\7 \2\2\u012c\u012d\7\25\2\2\u012d\u012e\t\4\2\2\u012e\u012f\7\26"+
		"\2\2\u012fC\3\2\2\2\u0130\u0131\7!\2\2\u0131\u0132\5H%\2\u0132E\3\2\2"+
		"\2\u0133\u0134\7\"\2\2\u0134\u0135\7\25\2\2\u0135\u0136\5H%\2\u0136\u0137"+
		"\7\26\2\2\u0137\u0138\5(\25\2\u0138G\3\2\2\2\u0139\u013f\5J&\2\u013a\u013b"+
		"\5J&\2\u013b\u013c\7#\2\2\u013c\u013d\5J&\2\u013d\u013f\3\2\2\2\u013e"+
		"\u0139\3\2\2\2\u013e\u013a\3\2\2\2\u013fI\3\2\2\2\u0140\u0146\5L\'\2\u0141"+
		"\u0142\5L\'\2\u0142\u0143\7$\2\2\u0143\u0144\5L\'\2\u0144\u0146\3\2\2"+
		"\2\u0145\u0140\3\2\2\2\u0145\u0141\3\2\2\2\u0146K\3\2\2\2\u0147\u014d"+
		"\5N(\2\u0148\u0149\5N(\2\u0149\u014a\t\5\2\2\u014a\u014b\5N(\2\u014b\u014d"+
		"\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014dM\3\2\2\2\u014e"+
		"\u0154\5P)\2\u014f\u0150\5P)\2\u0150\u0151\t\6\2\2\u0151\u0152\5P)\2\u0152"+
		"\u0154\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u014f\3\2\2\2\u0154O\3\2\2\2"+
		"\u0155\u015b\5R*\2\u0156\u0157\5R*\2\u0157\u0158\t\7\2\2\u0158\u0159\5"+
		"R*\2\u0159\u015b\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015b"+
		"Q\3\2\2\2\u015c\u0162\5T+\2\u015d\u015e\5T+\2\u015e\u015f\t\b\2\2\u015f"+
		"\u0160\5T+\2\u0160\u0162\3\2\2\2\u0161\u015c\3\2\2\2\u0161\u015d\3\2\2"+
		"\2\u0162S\3\2\2\2\u0163\u0167\5V,\2\u0164\u0165\t\t\2\2\u0165\u0167\5"+
		"V,\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0167U\3\2\2\2\u0168\u016e"+
		"\5X-\2\u0169\u016a\7\25\2\2\u016a\u016b\5X-\2\u016b\u016c\7\26\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016eW\3\2\2\2"+
		"\u016f\u0170\t\4\2\2\u0170Y\3\2\2\2\35bhs|\u0089\u008f\u0094\u0097\u00a7"+
		"\u00b3\u00b7\u00c8\u00cf\u00db\u00e3\u00ef\u00f5\u0103\u0121\u013e\u0145"+
		"\u014c\u0153\u015a\u0161\u0166\u016d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}