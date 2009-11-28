/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

public class SparqlasAntlrScanner implements de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public SparqlasAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextToken result = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
