/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.ui;

// An adapter from the Eclipse <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface
// to the generated lexer.
//
public class SparqlasTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextScanner lexer;
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasColorManager colorManager;
	
	// @param colorManager A manager to obtain color objects
	public SparqlasTokenScanner(west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasColorManager colorManager) {
		this.lexer = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasMetaInformation().createLexer();
		this.languageId = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasMetaInformation().getSyntaxName();
		this.store = west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasPlugin.getDefault().getPreferenceStore();
		this.colorManager = colorManager;
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		currentToken = lexer.getNextToken();
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		org.eclipse.jface.text.TextAttribute ta = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			String enableKey = west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
					style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
				}
				ta = new org.eclipse.jface.text.TextAttribute(color, null, style);
			}
		}
		return new org.eclipse.jface.text.rules.Token(ta);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			//ignore this error. It might occur during editing when locations are outdated quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
}
