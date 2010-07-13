/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasAntlrScanner implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public SparqlasAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextToken result = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
