/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.ui;

public class Owl2fsHoverTextProvider implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsHoverTextProvider {
	
	private west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsDefaultHoverTextProvider defaultProvider = new west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsDefaultHoverTextProvider();
	
	public java.lang.String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
