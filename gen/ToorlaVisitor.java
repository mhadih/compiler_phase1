// Generated from /home/hadi/Desktop/compiler/compiler_phase1/PLC_Spring98_Toorla/grammar/Toorla.g4 by ANTLR 4.7.2

    import toorla.ast.expression.binaryExpression.*;
    import toorla.ast.expression.value.*;
    import toorla.ast.expression.*;
    import toorla.ast.statement.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ToorlaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ToorlaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ToorlaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#classStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStar(ToorlaParser.ClassStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#class1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass1(ToorlaParser.Class1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#entryClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryClass(ToorlaParser.EntryClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#mainFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunc(ToorlaParser.MainFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ToorlaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#classItemStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassItemStar(ToorlaParser.ClassItemStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(ToorlaParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#access_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifier(ToorlaParser.Access_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#idPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPlus(ToorlaParser.IdPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#idStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdStar(ToorlaParser.IdStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ToorlaParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ToorlaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(ToorlaParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ToorlaParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#argumentStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentStar(ToorlaParser.ArgumentStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ToorlaParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(ToorlaParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#statementStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementStar(ToorlaParser.StatementStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ToorlaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(ToorlaParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ToorlaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#assignListPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignListPlus(ToorlaParser.AssignListPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#assignListStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignListStar(ToorlaParser.AssignListStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#assignID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignID(ToorlaParser.AssignIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ToorlaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ToorlaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#breakRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakRole(ToorlaParser.BreakRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#ifRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfRole(ToorlaParser.IfRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#continueRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueRole(ToorlaParser.ContinueRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(ToorlaParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(ToorlaParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#printRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintRole(ToorlaParser.PrintRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#returnRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnRole(ToorlaParser.ReturnRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#whileRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileRole(ToorlaParser.WhileRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ToorlaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#expressionL1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionL1(ToorlaParser.ExpressionL1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#expressionL2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionL2(ToorlaParser.ExpressionL2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#expressionL3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionL3(ToorlaParser.ExpressionL3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#expressionL4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionL4(ToorlaParser.ExpressionL4Context ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#expressionL5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionL5(ToorlaParser.ExpressionL5Context ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#expressionL6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionL6(ToorlaParser.ExpressionL6Context ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#expressionL7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionL7(ToorlaParser.ExpressionL7Context ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(ToorlaParser.SingleExpressionContext ctx);
}