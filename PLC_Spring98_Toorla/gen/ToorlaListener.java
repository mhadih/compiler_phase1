// Generated from /home/hadi/PLC_Spring98_Toorla/grammar/Toorla.g4 by ANTLR 4.7.2

    import toorla.ast.binaryExpression.*;
    import toorla.ast.value.*;
    import toorla.ast.*;

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
	 * Enter a parse tree produced by {@link ToorlaParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(ToorlaParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(ToorlaParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#temp_add}.
	 * @param ctx the parse tree
	 */
	void enterTemp_add(ToorlaParser.Temp_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#temp_add}.
	 * @param ctx the parse tree
	 */
	void exitTemp_add(ToorlaParser.Temp_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(ToorlaParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(ToorlaParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToorlaParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(ToorlaParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToorlaParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(ToorlaParser.AtomExpContext ctx);
}