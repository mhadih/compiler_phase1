import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import toorla.ast.Program;
import toorla.ast.expression.Expression;
import toorla.visitor.TreePrinter;
import toorla.visitor.Visitor;

public class ToorlaCompiler {
    public void compile(CharStream textStream) {
        System.out.println("qqqqq");
        ToorlaLexer toorlaLexer = new ToorlaLexer( textStream );
//        System.out.println(toorlaLexer);

        CommonTokenStream tokenStream = new CommonTokenStream( toorlaLexer );

        System.out.println("wwwwww");

        System.out.println(tokenStream);



        ToorlaParser toorlaParser = new ToorlaParser( tokenStream );
////        Program toorlaASTCode = toorlaParser.program().mProgram;
//        Expression toorlaASTCode = toorlaParser.program().expression;
//        System.out.println(toorlaASTCode);
//
//        Visitor<Void> treePrinter = new TreePrinter();
//        toorlaASTCode.accept( treePrinter );
    }
}
