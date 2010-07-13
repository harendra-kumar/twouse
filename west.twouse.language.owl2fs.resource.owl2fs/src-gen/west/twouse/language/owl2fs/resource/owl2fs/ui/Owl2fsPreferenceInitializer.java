/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.ui;

// Class used to initialize default preference values.
public class Owl2fsPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsAntlrTokenHelper tokenHelper = new west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.getDefault().getPreferenceStore();
		//Set default value for matching brackets
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
		//Set default value for occurrences
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsPreferenceConstants.EDITOR_OCCURRENCE_CHECKBOX, true);
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsPreferenceConstants.EDITOR_DEFINITION_COLOR, "240,216,168");
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsPreferenceConstants.EDITOR_PROXY_COLOR, "212,212,212");
		
		//store.setDefault(AbstractDecoratedTextEditorPreferenceConstants.EDITOR_OVERVIEW_RULER, true);
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsBracketSet bracketSet = new west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsBracketSet(null, languageId);
		final java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsMetaInformation metaInformation) {
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
			west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
