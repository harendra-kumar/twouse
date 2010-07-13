/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public class Owl2fsResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public Owl2fsResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsResource(uri);
	}
}
