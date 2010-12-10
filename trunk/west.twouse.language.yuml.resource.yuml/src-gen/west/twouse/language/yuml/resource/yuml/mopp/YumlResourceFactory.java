/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public YumlResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlResource(uri);
	}
	
}
