/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.ui;

public class SparqlasHoverTextProvider implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasHoverTextProvider {
	
	private west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasDefaultHoverTextProvider defaultProvider = new west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasDefaultHoverTextProvider();
	
	public java.lang.String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
