import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args) throws IOException {
		
		StringBuilder dotCode = new StringBuilder();

		Scanner stdin = new Scanner(System.in);

        while(stdin.hasNextLine()) {
			dotCode.append(stdin.nextLine());
		}


		//Invoke a lexer for lexical analysis
        DOTLexer lexer = new DOTLexer(new ANTLRInputStream(dotCode.toString()));
		
		//Prepare the list of tokens identified
        CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		//Pass the token list to the parser for syntax analysis
        DOTParser parser = new DOTParser(tokens);
		
		//Get the AST tree built for the input DOT code
		ParseTree tree = parser.graph();
		
		//Create a walker that can be used to traverse the tree (AST)
        ParseTreeWalker walker = new ParseTreeWalker();
		
		//for TaskII
		//Create a listener for pretty print
        DOTBaseListener baseListener = new DOTBaseListener();
		//Walk the tree by attaching the listener to the walker
        walker.walk(baseListener, tree);

        System.out.println("\nPretty-printed code:\n");

		//Create a listener for pretty print
        DOTPrettyPrintListener prettyListener = new DOTPrettyPrintListener();
		//Walk the tree by attaching the listener to the walker
        walker.walk(prettyListener, tree);

    }
}
