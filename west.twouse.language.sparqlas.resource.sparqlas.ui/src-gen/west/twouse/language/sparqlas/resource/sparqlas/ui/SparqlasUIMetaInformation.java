/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.ui;

public class SparqlasUIMetaInformation extends west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasMetaInformation {
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasHoverTextProvider getHoverTextProvider() {
		return new west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasHoverTextProvider();
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasColorManager createColorManager() {
		return new west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasColorManager();
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasTokenScanner createTokenScanner(west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasColorManager colorManager) {
		return new west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasTokenScanner(colorManager);
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasCodeCompletionHelper createCodeCompletionHelper() {
		return new west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasCodeCompletionHelper();
	}
	
}
