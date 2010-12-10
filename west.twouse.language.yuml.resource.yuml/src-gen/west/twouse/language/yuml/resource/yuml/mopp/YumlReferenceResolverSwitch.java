/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlReferenceResolverSwitch implements west.twouse.language.yuml.resource.yuml.IYumlReferenceResolverSwitch {
	
	
	public void setOptions(java.util.Map<?, ?> options) {
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, west.twouse.language.yuml.resource.yuml.IYumlReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		return null;
	}
	
}
