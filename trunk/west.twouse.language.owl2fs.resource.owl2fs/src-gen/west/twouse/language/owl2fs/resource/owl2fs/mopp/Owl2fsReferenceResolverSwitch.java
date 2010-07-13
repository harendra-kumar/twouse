/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public class Owl2fsReferenceResolverSwitch implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsReferenceResolverSwitch {
	
	
	public void setOptions(java.util.Map<?, ?> options) {
	}
	
	public void resolveFuzzy(java.lang.String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
	}
}
