/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.analysis;

public class SparqlasINTEGERTokenResolver implements de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver {
	
	private de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.analysis.SparqlasDefaultTokenResolver defaultTokenResolver = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.analysis.SparqlasDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		java.lang.String result = defaultTokenResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result) {
		defaultTokenResolver.resolve(lexem, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
