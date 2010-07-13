/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasReferenceResolverSwitch implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolverSwitch {
	
	
	public void setOptions(java.util.Map<?, ?> options) {
	}
	
	public void resolveFuzzy(java.lang.String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
	}
}
