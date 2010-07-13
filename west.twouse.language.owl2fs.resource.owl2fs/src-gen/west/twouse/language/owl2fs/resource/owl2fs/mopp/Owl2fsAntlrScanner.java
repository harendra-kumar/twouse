/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public class Owl2fsAntlrScanner implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextScanner {
	
	private org.antlr.runtime.Lexer antlrLexer;
	
	public Owl2fsAntlrScanner(org.antlr.runtime.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime.Token current = antlrLexer.nextToken();
		west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextToken result = new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsTextToken(current);
		return result;
	}
	
	public void setText(java.lang.String text) {
		antlrLexer.setCharStream(new org.antlr.runtime.ANTLRStringStream(text));
	}
	
}
