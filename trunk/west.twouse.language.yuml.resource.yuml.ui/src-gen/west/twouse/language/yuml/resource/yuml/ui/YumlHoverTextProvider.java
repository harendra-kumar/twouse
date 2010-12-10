/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.ui;

public class YumlHoverTextProvider implements west.twouse.language.yuml.resource.yuml.IYumlHoverTextProvider {
	
	private west.twouse.language.yuml.resource.yuml.ui.YumlDefaultHoverTextProvider defaultProvider = new west.twouse.language.yuml.resource.yuml.ui.YumlDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
