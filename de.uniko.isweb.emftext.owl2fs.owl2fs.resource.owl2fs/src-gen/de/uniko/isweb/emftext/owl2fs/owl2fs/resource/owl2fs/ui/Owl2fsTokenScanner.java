/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui;

// An adapter from the Eclipse <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface
// to the generated lexer.
//
public class Owl2fsTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextScanner lexer;
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextToken currentToken;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsColorManager colorManager;
	
	// @param colorManager A manager to obtain color objects
	public Owl2fsTokenScanner(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsColorManager colorManager) {
		this.lexer = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsMetaInformation().createLexer();
		this.languageId = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsMetaInformation().getSyntaxName();
		this.store = de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.getDefault().getPreferenceStore();
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
			String enableKey = de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.ENABLE);
			if (store.getBoolean(enableKey)) {
				String colorKey = de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.COLOR);
				org.eclipse.swt.graphics.Color color = colorManager.getColor(org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey));
				int style = org.eclipse.swt.SWT.NORMAL;
				if (store.getBoolean(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.BOLD))) {
					style = style | org.eclipse.swt.SWT.BOLD;
				}
				if (store.getBoolean(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.ITALIC))) {
					style = style | org.eclipse.swt.SWT.ITALIC;
				}
				if (store.getBoolean(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.STRIKETHROUGH))) {
					style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
				}
				if (store.getBoolean(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.UNDERLINE))) {
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
