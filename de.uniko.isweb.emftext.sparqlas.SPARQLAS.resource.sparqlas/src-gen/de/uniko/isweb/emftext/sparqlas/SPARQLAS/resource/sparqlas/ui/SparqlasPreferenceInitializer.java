/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui;

// Class used to initialize default preference values.
public class SparqlasPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasAntlrTokenHelper tokenHelper = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasPlugin.getDefault().getPreferenceStore();
		//Set default value for matching brackets
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
		//Set default value for occurrences
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasPreferenceConstants.EDITOR_OCCURRENCE_CHECKBOX, true);
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasPreferenceConstants.EDITOR_DEFINITION_COLOR, "240,216,168");
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasPreferenceConstants.EDITOR_PROXY_COLOR, "212,212,212");
		
		//store.setDefault(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_OVERVIEW_RULER, true);
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasBracketSet bracketSet = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasBracketSet(null, languageId);
		final java.util.Collection<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			if (!tokenHelper.canBeUsedForSyntaxColoring(i)) {
				continue;
			}
			
			String tokenName = tokenHelper.getTokenName(tokenNames, i);
			if (tokenName == null) {
				continue;
			}
			de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
