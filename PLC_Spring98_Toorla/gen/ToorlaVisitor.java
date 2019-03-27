// Generated from /home/hadi/PLC_Spring98_Toorla/grammar/Toorla.g4 by ANTLR 4.7.2

    import toorla.ast.binaryExpression.*;
    import toorla.ast.value.*;
    import toorla.ast.*;

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
	 * Visit a parse tree produced by {@link ToorlaParser#additionExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExp(ToorlaParser.AdditionExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#temp_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemp_add(ToorlaParser.Temp_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#multiplyExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExp(ToorlaParser.MultiplyExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToorlaParser#atomExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExp(ToorlaParser.AtomExpContext ctx);
}