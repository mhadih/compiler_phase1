// Generated from /home/hadi/Desktop/compiler/compiler_phase1/PLC_Spring98_Toorla/grammar/Toorla.g4 by ANTLR 4.7.2

    import toorla.ast.expression.binaryExpression.*;
    import toorla.ast.expression.value.*;
    import toorla.ast.expression.*;
    import toorla.ast.statement.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ToorlaParser}.
 */
public interface ToorlaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ToorlaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ToorlaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#classStar}.
	 * @param ctx the parse tree
	 */
	void enterClassStar(ToorlaParser.ClassStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#classStar}.
	 * @param ctx the parse tree
	 */
	void exitClassStar(ToorlaParser.ClassStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(ToorlaParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(ToorlaParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#entryClass}.
	 * @param ctx the parse tree
	 */
	void enterEntryClass(ToorlaParser.EntryClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#entryClass}.
	 * @param ctx the parse tree
	 */
	void exitEntryClass(ToorlaParser.EntryClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#mainFunc}.
	 * @param ctx the parse tree
	 */
	void enterMainFunc(ToorlaParser.MainFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#mainFunc}.
	 * @param ctx the parse tree
	 */
	void exitMainFunc(ToorlaParser.MainFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ToorlaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ToorlaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#classItemStar}.
	 * @param ctx the parse tree
	 */
	void enterClassItemStar(ToorlaParser.ClassItemStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#classItemStar}.
	 * @param ctx the parse tree
	 */
	void exitClassItemStar(ToorlaParser.ClassItemStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(ToorlaParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(ToorlaParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifier(ToorlaParser.Access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifier(ToorlaParser.Access_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#idPlus}.
	 * @param ctx the parse tree
	 */
	void enterIdPlus(ToorlaParser.IdPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#idPlus}.
	 * @param ctx the parse tree
	 */
	void exitIdPlus(ToorlaParser.IdPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#idStar}.
	 * @param ctx the parse tree
	 */
	void enterIdStar(ToorlaParser.IdStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#idStar}.
	 * @param ctx the parse tree
	 */
	void exitIdStar(ToorlaParser.IdStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ToorlaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ToorlaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ToorlaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ToorlaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ToorlaParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ToorlaParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ToorlaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ToorlaParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#tmpArgument}.
	 * @param ctx the parse tree
	 */
	void enterTmpArgument(ToorlaParser.TmpArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#tmpArgument}.
	 * @param ctx the parse tree
	 */
	void exitTmpArgument(ToorlaParser.TmpArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ToorlaParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ToorlaParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(ToorlaParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(ToorlaParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#statementStar}.
	 * @param ctx the parse tree
	 */
	void enterStatementStar(ToorlaParser.StatementStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#statementStar}.
	 * @param ctx the parse tree
	 */
	void exitStatementStar(ToorlaParser.StatementStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ToorlaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ToorlaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(ToorlaParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(ToorlaParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ToorlaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ToorlaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ToorlaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ToorlaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#break}.
	 * @param ctx the parse tree
	 */
	void enterBreak(ToorlaParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#break}.
	 * @param ctx the parse tree
	 */
	void exitBreak(ToorlaParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(ToorlaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(ToorlaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#continue}.
	 * @param ctx the parse tree
	 */
	void enterContinue(ToorlaParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#continue}.
	 * @param ctx the parse tree
	 */
	void exitContinue(ToorlaParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(ToorlaParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(ToorlaParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(ToorlaParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(ToorlaParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ToorlaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ToorlaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(ToorlaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(ToorlaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ToorlaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ToorlaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ToorlaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ToorlaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#expressionL1}.
	 * @param ctx the parse tree
	 */
	void enterExpressionL1(ToorlaParser.ExpressionL1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#expressionL1}.
	 * @param ctx the parse tree
	 */
	void exitExpressionL1(ToorlaParser.ExpressionL1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#expressionL2}.
	 * @param ctx the parse tree
	 */
	void enterExpressionL2(ToorlaParser.ExpressionL2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#expressionL2}.
	 * @param ctx the parse tree
	 */
	void exitExpressionL2(ToorlaParser.ExpressionL2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#expressionL3}.
	 * @param ctx the parse tree
	 */
	void enterExpressionL3(ToorlaParser.ExpressionL3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#expressionL3}.
	 * @param ctx the parse tree
	 */
	void exitExpressionL3(ToorlaParser.ExpressionL3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#expressionL4}.
	 * @param ctx the parse tree
	 */
	void enterExpressionL4(ToorlaParser.ExpressionL4Context ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#expressionL4}.
	 * @param ctx the parse tree
	 */
	void exitExpressionL4(ToorlaParser.ExpressionL4Context ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#expressionL5}.
	 * @param ctx the parse tree
	 */
	void enterExpressionL5(ToorlaParser.ExpressionL5Context ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#expressionL5}.
	 * @param ctx the parse tree
	 */
	void exitExpressionL5(ToorlaParser.ExpressionL5Context ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#expressionL6}.
	 * @param ctx the parse tree
	 */
	void enterExpressionL6(ToorlaParser.ExpressionL6Context ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#expressionL6}.
	 * @param ctx the parse tree
	 */
	void exitExpressionL6(ToorlaParser.ExpressionL6Context ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#expressionL7}.
	 * @param ctx the parse tree
	 */
	void enterExpressionL7(ToorlaParser.ExpressionL7Context ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#expressionL7}.
	 * @param ctx the parse tree
	 */
	void exitExpressionL7(ToorlaParser.ExpressionL7Context ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(ToorlaParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(ToorlaParser.SingleExpressionContext ctx);
}