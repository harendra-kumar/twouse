/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public SparqlasResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasResource(uri);
	}
}
