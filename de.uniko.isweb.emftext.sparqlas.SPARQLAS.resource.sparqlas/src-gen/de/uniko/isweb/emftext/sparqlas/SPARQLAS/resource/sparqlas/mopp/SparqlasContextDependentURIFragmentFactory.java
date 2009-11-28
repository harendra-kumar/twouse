/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

// A factory for ContextDependentURIFragments. Given a feasible reference resolver,
// the factory returns a matching fragment that used the resolver to resolver proxy
// objects.
//
// @param <ContainerType> the type of the class containing the reference to be resolved
// @param <ReferenceType> the type of the reference to be resolved
//
public class SparqlasContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public SparqlasContextDependentURIFragmentFactory(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
