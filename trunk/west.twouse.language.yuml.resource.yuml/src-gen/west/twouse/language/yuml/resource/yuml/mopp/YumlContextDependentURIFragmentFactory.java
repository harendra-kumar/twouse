/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class YumlContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements west.twouse.language.yuml.resource.yuml.IYumlContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final west.twouse.language.yuml.resource.yuml.IYumlReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public YumlContextDependentURIFragmentFactory(west.twouse.language.yuml.resource.yuml.IYumlReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public west.twouse.language.yuml.resource.yuml.IYumlReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
