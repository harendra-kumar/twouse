/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.analysis;

public class SparqlasFULLIRITokenResolver implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver {
	
	private west.twouse.language.sparqlas.resource.sparqlas.analysis.SparqlasDefaultTokenResolver defaultTokenResolver = new west.twouse.language.sparqlas.resource.sparqlas.analysis.SparqlasDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
