/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlAntlrScanner implements west.twouse.language.yuml.resource.yuml.IYumlTextScanner {
	
	private org.antlr.runtime3_2_0.Lexer antlrLexer;
	
	public YumlAntlrScanner(org.antlr.runtime3_2_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_2_0.Token current = antlrLexer.nextToken();
		west.twouse.language.yuml.resource.yuml.IYumlTextToken result = new west.twouse.language.yuml.resource.yuml.mopp.YumlTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_2_0.ANTLRStringStream(text));
	}
	
}
