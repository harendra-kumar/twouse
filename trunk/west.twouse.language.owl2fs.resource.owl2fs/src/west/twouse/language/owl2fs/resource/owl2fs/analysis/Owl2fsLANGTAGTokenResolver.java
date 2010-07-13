/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.analysis;

public class Owl2fsLANGTAGTokenResolver implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver {
	
	private west.twouse.language.owl2fs.resource.owl2fs.analysis.Owl2fsDefaultTokenResolver defaultTokenResolver = new west.twouse.language.owl2fs.resource.owl2fs.analysis.Owl2fsDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
