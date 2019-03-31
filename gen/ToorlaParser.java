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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, ID=44, LETTER=45, STRINGCONST=46, 
		NUMBER=47, CHARACTER=48, WS=49, KEYWORD=50;
	public static final int
		RULE_program = 0, RULE_classStar = 1, RULE_class = 2, RULE_entryClass = 3, 
		RULE_mainFunc = 4, RULE_classBody = 5, RULE_classItemStar = 6, RULE_field = 7, 
		RULE_access_modifier = 8, RULE_idPlus = 9, RULE_idStar = 10, RULE_primitiveType = 11, 
		RULE_type = 12, RULE_method = 13, RULE_argumentList = 14, RULE_tmpArgument = 15, 
		RULE_argument = 16, RULE_funcBody = 17, RULE_statementStar = 18, RULE_statement = 19, 
		RULE_singleStatement = 20, RULE_assign = 21, RULE_block = 22, RULE_break = 23, 
		RULE_if = 24, RULE_continue = 25, RULE_dec = 26, RULE_inc = 27, RULE_print = 28, 
		RULE_return = 29, RULE_while = 30, RULE_expression = 31, RULE_expressionL1 = 32, 
		RULE_expressionL2 = 33, RULE_expressionL3 = 34, RULE_expressionL4 = 35, 
		RULE_expressionL5 = 36, RULE_expressionL6 = 37, RULE_expressionL7 = 38, 
		RULE_singleExpression = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classStar", "class", "entryClass", "mainFunc", "classBody", 
			"classItemStar", "field", "access_modifier", "idPlus", "idStar", "primitiveType", 
			"type", "method", "argumentList", "tmpArgument", "argument", "funcBody", 
			"statementStar", "statement", "singleStatement", "assign", "block", "break", 
			"if", "continue", "dec", "inc", "print", "return", "while", "expression", 
			"expressionL1", "expressionL2", "expressionL3", "expressionL4", "expressionL5", 
			"expressionL6", "expressionL7", "singleExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'inherits'", "':'", "'end'", "'entry'", "'public'", 
			"'function'", "'main()'", "'returns'", "'int'", "'field'", "';'", "'private'", 
			"','", "'string'", "'bool'", "'['", "']'", "'('", "')'", "'='", "'begin'", 
			"'break'", "'if'", "'else'", "'continue'", "'--'", "'++'", "'print'", 
			"'return'", "'while'", "'||'", "'&&'", "'=='", "'<>'", "'>'", "'<'", 
			"'-'", "'+'", "'/'", "'*'", "'%'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "LETTER", "STRINGCONST", 
			"NUMBER", "CHARACTER", "WS", "KEYWORD"
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
			setState(80);
			classStar();
			setState(81);
			entryClass();
			setState(82);
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
		public ClassContext class() {
			return getRuleContext(ClassContext.class,0);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				class();
				setState(85);
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

	public static class ClassContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ToorlaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToorlaParser.ID, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__0);
			setState(91);
			match(ID);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(92);
				match(T__1);
				setState(93);
				match(ID);
				}
			}

			setState(96);
			match(T__2);
			setState(97);
			classBody();
			setState(98);
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
			setState(100);
			match(T__4);
			setState(101);
			match(T__0);
			setState(102);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(103);
				match(T__1);
				setState(104);
				match(ID);
				}
			}

			setState(107);
			match(T__2);
			setState(108);
			classItemStar();
			setState(109);
			mainFunc();
			setState(110);
			classItemStar();
			setState(111);
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
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(113);
				match(T__5);
				}
			}

			setState(116);
			match(T__6);
			setState(117);
			match(T__7);
			setState(118);
			match(T__8);
			setState(119);
			match(T__9);
			setState(120);
			match(T__2);
			setState(121);
			funcBody();
			setState(122);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(124);
				field();
				}
				break;
			case 2:
				{
				setState(125);
				method();
				}
				break;
			}
			setState(128);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(130);
					field();
					}
					break;
				case 2:
					{
					setState(131);
					method();
					}
					break;
				}
				setState(134);
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
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__12) {
				{
				setState(139);
				access_modifier();
				}
			}

			setState(142);
			match(T__10);
			setState(143);
			idPlus();
			setState(144);
			type(0);
			setState(145);
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
			setState(147);
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
			setState(149);
			match(ID);
			setState(150);
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__13);
				setState(153);
				match(ID);
				setState(154);
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
			setState(158);
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
			setState(161);
			primitiveType();
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
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
					setState(163);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(164);
					match(T__16);
					setState(165);
					match(T__17);
					}
					} 
				}
				setState(170);
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
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__12) {
				{
				setState(171);
				access_modifier();
				}
			}

			setState(174);
			match(T__6);
			setState(175);
			match(ID);
			setState(176);
			match(T__18);
			setState(177);
			argumentList();
			setState(178);
			match(T__19);
			setState(179);
			match(T__8);
			setState(180);
			type(0);
			setState(181);
			match(T__2);
			setState(182);
			funcBody();
			setState(183);
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
		public TmpArgumentContext tmpArgument() {
			return getRuleContext(TmpArgumentContext.class,0);
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
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				argument();
				setState(186);
				tmpArgument();
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

	public static class TmpArgumentContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TmpArgumentContext tmpArgument() {
			return getRuleContext(TmpArgumentContext.class,0);
		}
		public TmpArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmpArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterTmpArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitTmpArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitTmpArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmpArgumentContext tmpArgument() throws RecognitionException {
		TmpArgumentContext _localctx = new TmpArgumentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tmpArgument);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(T__13);
				setState(192);
				argument();
				setState(193);
				tmpArgument();
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
			setState(198);
			match(ID);
			setState(199);
			match(T__2);
			setState(200);
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
			setState(202);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				statement();
				setState(205);
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
		public IfContext if() {
			return getRuleContext(IfContext.class,0);
		}
		public WhileContext while() {
			return getRuleContext(WhileContext.class,0);
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				singleStatement(0);
				setState(211);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				while();
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
		public BreakContext break() {
			return getRuleContext(BreakContext.class,0);
		}
		public ContinueContext continue() {
			return getRuleContext(ContinueContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReturnContext return() {
			return getRuleContext(ReturnContext.class,0);
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
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(219);
				assign();
				}
				break;
			case 2:
				{
				setState(220);
				break();
				}
				break;
			case 3:
				{
				setState(221);
				continue();
				}
				break;
			case 4:
				{
				setState(222);
				dec();
				}
				break;
			case 5:
				{
				setState(223);
				inc();
				}
				break;
			case 6:
				{
				setState(224);
				print();
				}
				break;
			case 7:
				{
				setState(225);
				return();
				}
				break;
			case 8:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
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
					setState(229);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(230);
					match(T__11);
					}
					} 
				}
				setState(235);
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
		enterRule(_localctx, 42, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			expression();
			setState(237);
			match(T__20);
			setState(238);
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
		enterRule(_localctx, 44, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__21);
			setState(241);
			statementStar();
			setState(242);
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

	public static class BreakContext extends ParserRuleContext {
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__22);
			setState(245);
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

	public static class IfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__23);
			setState(248);
			match(T__18);
			setState(249);
			expression();
			setState(250);
			match(T__19);
			setState(251);
			statement();
			setState(252);
			match(T__24);
			setState(253);
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

	public static class ContinueContext extends ParserRuleContext {
		public ContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueContext continue() throws RecognitionException {
		ContinueContext _localctx = new ContinueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__25);
			setState(256);
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
		enterRule(_localctx, 52, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			expression();
			setState(259);
			match(T__26);
			setState(260);
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
		enterRule(_localctx, 54, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			expression();
			setState(263);
			match(T__27);
			setState(264);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ToorlaParser.ID, 0); }
		public TerminalNode STRINGCONST() { return getToken(ToorlaParser.STRINGCONST, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__28);
			setState(267);
			match(T__18);
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRINGCONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(269);
			match(T__19);
			setState(270);
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

	public static class ReturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__29);
			setState(273);
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

	public static class WhileContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ToorlaListener ) ((ToorlaListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToorlaVisitor ) return ((ToorlaVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__30);
			setState(276);
			match(T__18);
			setState(277);
			expression();
			setState(278);
			match(T__19);
			setState(279);
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
		enterRule(_localctx, 62, RULE_expression);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				expressionL1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				expressionL1();
				setState(283);
				match(T__31);
				setState(284);
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
		enterRule(_localctx, 64, RULE_expressionL1);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				expressionL2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				expressionL2();
				setState(290);
				match(T__32);
				setState(291);
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
		enterRule(_localctx, 66, RULE_expressionL2);
		int _la;
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				expressionL3();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				expressionL3();
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==T__33 || _la==T__34) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(298);
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
		enterRule(_localctx, 68, RULE_expressionL3);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				expressionL4();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				expressionL4();
				setState(304);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(305);
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
		enterRule(_localctx, 70, RULE_expressionL4);
		int _la;
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				expressionL5();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				expressionL5();
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
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
		enterRule(_localctx, 72, RULE_expressionL5);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				expressionL6();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				expressionL6();
				setState(318);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(319);
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
		enterRule(_localctx, 74, RULE_expressionL6);
		int _la;
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case ID:
			case STRINGCONST:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				expressionL7();
				}
				break;
			case T__37:
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__42) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(325);
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
		enterRule(_localctx, 76, RULE_expressionL7);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case STRINGCONST:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				singleExpression();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(T__18);
				setState(330);
				singleExpression();
				setState(331);
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
		enterRule(_localctx, 78, RULE_singleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0154\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\5\4a\n\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\5\6u\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u0081\n\7\3\7\3\7\3\b\3\b\5\b\u0087"+
		"\n\b\3\b\3\b\3\b\5\b\u008c\n\b\3\t\5\t\u008f\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u009f\n\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00a9\n\16\f\16\16\16\u00ac\13\16\3\17\5\17"+
		"\u00af\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\5\20\u00c0\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00c7\n"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00d3\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00db\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00e6\n\26\3\26\3\26\7\26\u00ea\n\26\f\26\16"+
		"\26\u00ed\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u0121\n!\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u0128\n\"\3#\3#\3#\3#\3#\5#\u012f\n#\3$\3$\3$\3$\3$\5$\u0136\n$\3%\3"+
		"%\3%\3%\3%\5%\u013d\n%\3&\3&\3&\3&\3&\5&\u0144\n&\3\'\3\'\3\'\5\'\u0149"+
		"\n\'\3(\3(\3(\3(\3(\5(\u0150\n(\3)\3)\3)\2\4\32**\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\13\4\2\b\b\17\17"+
		"\4\2\f\f\21\22\4\2..\60\60\3\2$%\3\2&\'\3\2()\3\2*,\4\2((--\4\2..\60\61"+
		"\2\u014c\2R\3\2\2\2\4Z\3\2\2\2\6\\\3\2\2\2\bf\3\2\2\2\nt\3\2\2\2\f\u0080"+
		"\3\2\2\2\16\u008b\3\2\2\2\20\u008e\3\2\2\2\22\u0095\3\2\2\2\24\u0097\3"+
		"\2\2\2\26\u009e\3\2\2\2\30\u00a0\3\2\2\2\32\u00a2\3\2\2\2\34\u00ae\3\2"+
		"\2\2\36\u00bf\3\2\2\2 \u00c6\3\2\2\2\"\u00c8\3\2\2\2$\u00cc\3\2\2\2&\u00d2"+
		"\3\2\2\2(\u00da\3\2\2\2*\u00e5\3\2\2\2,\u00ee\3\2\2\2.\u00f2\3\2\2\2\60"+
		"\u00f6\3\2\2\2\62\u00f9\3\2\2\2\64\u0101\3\2\2\2\66\u0104\3\2\2\28\u0108"+
		"\3\2\2\2:\u010c\3\2\2\2<\u0112\3\2\2\2>\u0115\3\2\2\2@\u0120\3\2\2\2B"+
		"\u0127\3\2\2\2D\u012e\3\2\2\2F\u0135\3\2\2\2H\u013c\3\2\2\2J\u0143\3\2"+
		"\2\2L\u0148\3\2\2\2N\u014f\3\2\2\2P\u0151\3\2\2\2RS\5\4\3\2ST\5\b\5\2"+
		"TU\5\4\3\2U\3\3\2\2\2VW\5\6\4\2WX\5\4\3\2X[\3\2\2\2Y[\3\2\2\2ZV\3\2\2"+
		"\2ZY\3\2\2\2[\5\3\2\2\2\\]\7\3\2\2]`\7.\2\2^_\7\4\2\2_a\7.\2\2`^\3\2\2"+
		"\2`a\3\2\2\2ab\3\2\2\2bc\7\5\2\2cd\5\f\7\2de\7\6\2\2e\7\3\2\2\2fg\7\7"+
		"\2\2gh\7\3\2\2hk\7.\2\2ij\7\4\2\2jl\7.\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2"+
		"\2mn\7\5\2\2no\5\16\b\2op\5\n\6\2pq\5\16\b\2qr\7\6\2\2r\t\3\2\2\2su\7"+
		"\b\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\t\2\2wx\7\n\2\2xy\7\13\2\2yz"+
		"\7\f\2\2z{\7\5\2\2{|\5$\23\2|}\7\6\2\2}\13\3\2\2\2~\u0081\5\20\t\2\177"+
		"\u0081\5\34\17\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2"+
		"\u0082\u0083\5\16\b\2\u0083\r\3\2\2\2\u0084\u0087\5\20\t\2\u0085\u0087"+
		"\5\34\17\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\u0089\5\16\b\2\u0089\u008c\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0086"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c\17\3\2\2\2\u008d\u008f\5\22\n\2\u008e"+
		"\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\r"+
		"\2\2\u0091\u0092\5\24\13\2\u0092\u0093\5\32\16\2\u0093\u0094\7\16\2\2"+
		"\u0094\21\3\2\2\2\u0095\u0096\t\2\2\2\u0096\23\3\2\2\2\u0097\u0098\7."+
		"\2\2\u0098\u0099\5\26\f\2\u0099\25\3\2\2\2\u009a\u009b\7\20\2\2\u009b"+
		"\u009c\7.\2\2\u009c\u009f\5\26\f\2\u009d\u009f\3\2\2\2\u009e\u009a\3\2"+
		"\2\2\u009e\u009d\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1\t\3\2\2\u00a1\31"+
		"\3\2\2\2\u00a2\u00a3\b\16\1\2\u00a3\u00a4\5\30\r\2\u00a4\u00aa\3\2\2\2"+
		"\u00a5\u00a6\f\3\2\2\u00a6\u00a7\7\23\2\2\u00a7\u00a9\7\24\2\2\u00a8\u00a5"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\33\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5\22\n\2\u00ae\u00ad\3\2\2"+
		"\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\t\2\2\u00b1\u00b2"+
		"\7.\2\2\u00b2\u00b3\7\25\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\7\26\2"+
		"\2\u00b5\u00b6\7\13\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\7\5\2\2\u00b8"+
		"\u00b9\5$\23\2\u00b9\u00ba\7\6\2\2\u00ba\35\3\2\2\2\u00bb\u00bc\5\"\22"+
		"\2\u00bc\u00bd\5 \21\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bb"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\37\3\2\2\2\u00c1\u00c2\7\20\2\2\u00c2"+
		"\u00c3\5\"\22\2\u00c3\u00c4\5 \21\2\u00c4\u00c7\3\2\2\2\u00c5\u00c7\3"+
		"\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7!\3\2\2\2\u00c8\u00c9"+
		"\7.\2\2\u00c9\u00ca\7\5\2\2\u00ca\u00cb\5\32\16\2\u00cb#\3\2\2\2\u00cc"+
		"\u00cd\5&\24\2\u00cd%\3\2\2\2\u00ce\u00cf\5(\25\2\u00cf\u00d0\5&\24\2"+
		"\u00d0\u00d3\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\'\3\2\2\2\u00d4\u00d5\5*\26\2\u00d5\u00d6\7\16\2\2\u00d6"+
		"\u00db\3\2\2\2\u00d7\u00db\5.\30\2\u00d8\u00db\5\62\32\2\u00d9\u00db\5"+
		"> \2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db)\3\2\2\2\u00dc\u00dd\b\26\1\2\u00dd\u00e6\5,\27\2"+
		"\u00de\u00e6\5\60\31\2\u00df\u00e6\5\64\33\2\u00e0\u00e6\5\66\34\2\u00e1"+
		"\u00e6\58\35\2\u00e2\u00e6\5:\36\2\u00e3\u00e6\5<\37\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5"+
		"\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00eb\3\2\2\2\u00e7\u00e8\f\4\2\2\u00e8"+
		"\u00ea\7\16\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec+\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef"+
		"\5@!\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\5@!\2\u00f1-\3\2\2\2\u00f2\u00f3"+
		"\7\30\2\2\u00f3\u00f4\5&\24\2\u00f4\u00f5\7\6\2\2\u00f5/\3\2\2\2\u00f6"+
		"\u00f7\7\31\2\2\u00f7\u00f8\7\16\2\2\u00f8\61\3\2\2\2\u00f9\u00fa\7\32"+
		"\2\2\u00fa\u00fb\7\25\2\2\u00fb\u00fc\5@!\2\u00fc\u00fd\7\26\2\2\u00fd"+
		"\u00fe\5(\25\2\u00fe\u00ff\7\33\2\2\u00ff\u0100\5(\25\2\u0100\63\3\2\2"+
		"\2\u0101\u0102\7\34\2\2\u0102\u0103\7\16\2\2\u0103\65\3\2\2\2\u0104\u0105"+
		"\5@!\2\u0105\u0106\7\35\2\2\u0106\u0107\7\16\2\2\u0107\67\3\2\2\2\u0108"+
		"\u0109\5@!\2\u0109\u010a\7\36\2\2\u010a\u010b\7\16\2\2\u010b9\3\2\2\2"+
		"\u010c\u010d\7\37\2\2\u010d\u010e\7\25\2\2\u010e\u010f\t\4\2\2\u010f\u0110"+
		"\7\26\2\2\u0110\u0111\7\16\2\2\u0111;\3\2\2\2\u0112\u0113\7 \2\2\u0113"+
		"\u0114\5@!\2\u0114=\3\2\2\2\u0115\u0116\7!\2\2\u0116\u0117\7\25\2\2\u0117"+
		"\u0118\5@!\2\u0118\u0119\7\26\2\2\u0119\u011a\5(\25\2\u011a?\3\2\2\2\u011b"+
		"\u0121\5B\"\2\u011c\u011d\5B\"\2\u011d\u011e\7\"\2\2\u011e\u011f\5B\""+
		"\2\u011f\u0121\3\2\2\2\u0120\u011b\3\2\2\2\u0120\u011c\3\2\2\2\u0121A"+
		"\3\2\2\2\u0122\u0128\5D#\2\u0123\u0124\5D#\2\u0124\u0125\7#\2\2\u0125"+
		"\u0126\5D#\2\u0126\u0128\3\2\2\2\u0127\u0122\3\2\2\2\u0127\u0123\3\2\2"+
		"\2\u0128C\3\2\2\2\u0129\u012f\5F$\2\u012a\u012b\5F$\2\u012b\u012c\t\5"+
		"\2\2\u012c\u012d\5F$\2\u012d\u012f\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012a"+
		"\3\2\2\2\u012fE\3\2\2\2\u0130\u0136\5H%\2\u0131\u0132\5H%\2\u0132\u0133"+
		"\t\6\2\2\u0133\u0134\5H%\2\u0134\u0136\3\2\2\2\u0135\u0130\3\2\2\2\u0135"+
		"\u0131\3\2\2\2\u0136G\3\2\2\2\u0137\u013d\5J&\2\u0138\u0139\5J&\2\u0139"+
		"\u013a\t\7\2\2\u013a\u013b\5J&\2\u013b\u013d\3\2\2\2\u013c\u0137\3\2\2"+
		"\2\u013c\u0138\3\2\2\2\u013dI\3\2\2\2\u013e\u0144\5L\'\2\u013f\u0140\5"+
		"L\'\2\u0140\u0141\t\b\2\2\u0141\u0142\5L\'\2\u0142\u0144\3\2\2\2\u0143"+
		"\u013e\3\2\2\2\u0143\u013f\3\2\2\2\u0144K\3\2\2\2\u0145\u0149\5N(\2\u0146"+
		"\u0147\t\t\2\2\u0147\u0149\5N(\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2"+
		"\2\u0149M\3\2\2\2\u014a\u0150\5P)\2\u014b\u014c\7\25\2\2\u014c\u014d\5"+
		"P)\2\u014d\u014e\7\26\2\2\u014e\u0150\3\2\2\2\u014f\u014a\3\2\2\2\u014f"+
		"\u014b\3\2\2\2\u0150O\3\2\2\2\u0151\u0152\t\n\2\2\u0152Q\3\2\2\2\33Z`"+
		"kt\u0080\u0086\u008b\u008e\u009e\u00aa\u00ae\u00bf\u00c6\u00d2\u00da\u00e5"+
		"\u00eb\u0120\u0127\u012e\u0135\u013c\u0143\u0148\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}