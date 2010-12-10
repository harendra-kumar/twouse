/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.ui;

/**
 * A class used to initialize default preference values.
 */
public class YumlPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	private final static west.twouse.language.yuml.resource.yuml.ui.YumlAntlrTokenHelper tokenHelper = new west.twouse.language.yuml.resource.yuml.ui.YumlAntlrTokenHelper();
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = west.twouse.language.yuml.resource.yuml.ui.YumlUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(west.twouse.language.yuml.resource.yuml.ui.YumlPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(west.twouse.language.yuml.resource.yuml.ui.YumlPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = west.twouse.language.yuml.resource.yuml.ui.YumlUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new west.twouse.language.yuml.resource.yuml.mopp.YumlMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = west.twouse.language.yuml.resource.yuml.ui.YumlUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new west.twouse.language.yuml.resource.yuml.mopp.YumlMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, west.twouse.language.yuml.resource.yuml.IYumlMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		west.twouse.language.yuml.resource.yuml.ui.YumlBracketSet bracketSet = new west.twouse.language.yuml.resource.yuml.ui.YumlBracketSet(null, null);
		final java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (west.twouse.language.yuml.resource.yuml.IYumlBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + west.twouse.language.yuml.resource.yuml.ui.YumlPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, west.twouse.language.yuml.resource.yuml.IYumlMetaInformation metaInformation) {
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
			west.twouse.language.yuml.resource.yuml.IYumlTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, west.twouse.language.yuml.resource.yuml.ui.YumlSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
