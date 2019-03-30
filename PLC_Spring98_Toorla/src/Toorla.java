import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class Toorla {
    public static void main( String[] args ) throws IOException {
        CharStream textStream = CharStreams.fromFileName( args[ 0 ] );
        System.out.println(textStream);

        ToorlaCompiler compiler = new ToorlaCompiler();
        System.out.println("3333333333");

        compiler.compile( textStream );
    }
}
