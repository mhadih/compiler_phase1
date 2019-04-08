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

        CommonTokenStream tokenStream = new CommonTokenStream( toorlaLexer );

        System.out.println(tokenStream);



        ToorlaParser toorlaParser = new ToorlaParser( tokenStream );
        Program toorlaASTCode = toorlaParser.program().resProgram;
//        Expression toorlaASTCode = toorlaParser.program().resProgram;
        System.out.println(toorlaASTCode);

        Visitor<Void> treePrinter = new TreePrinter();
        toorlaASTCode.accept( treePrinter );
    }
}
