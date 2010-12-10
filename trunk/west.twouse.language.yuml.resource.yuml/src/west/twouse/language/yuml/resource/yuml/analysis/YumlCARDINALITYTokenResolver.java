/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.analysis;

public class YumlCARDINALITYTokenResolver implements west.twouse.language.yuml.resource.yuml.IYumlTokenResolver {
	
	private west.twouse.language.yuml.resource.yuml.analysis.YumlDefaultTokenResolver defaultTokenResolver = new west.twouse.language.yuml.resource.yuml.analysis.YumlDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
