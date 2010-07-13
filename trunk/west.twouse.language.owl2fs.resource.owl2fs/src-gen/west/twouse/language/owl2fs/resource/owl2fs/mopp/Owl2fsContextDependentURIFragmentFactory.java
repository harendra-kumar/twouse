/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

// A factory for ContextDependentURIFragments. Given a feasible reference resolver,
// the factory returns a matching fragment that used the resolver to resolver proxy
// objects.
//
// @param <ContainerType> the type of the class containing the reference to be resolved
// @param <ReferenceType> the type of the reference to be resolved
//
public class Owl2fsContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public Owl2fsContextDependentURIFragmentFactory(west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
