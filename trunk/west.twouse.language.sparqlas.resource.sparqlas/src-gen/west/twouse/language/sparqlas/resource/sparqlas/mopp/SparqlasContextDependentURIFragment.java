/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

// Standard implementation of <code>IContextDependentURIFragment</code>.
//
// @param <ContainerType> the type of the object that contains the reference which shall be resolved by this fragment.
// @param <ReferenceType> the type of the reference which shall be resolved by this fragment.
//
public abstract class SparqlasContextDependentURIFragment<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasContextDependentURIFragment<ReferenceType> {
	
	protected String identifier;
	protected ContainerType container;
	protected org.eclipse.emf.ecore.EReference reference;
	protected int positionInReference;
	protected org.eclipse.emf.ecore.EObject proxy;
	protected west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolveResult<ReferenceType> result;
	
	private boolean resolving;
	
	public SparqlasContextDependentURIFragment(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		this.identifier = identifier;
		this.container = container;
		this.reference = reference;
		this.positionInReference = positionInReference;
		this.proxy = proxy;
	}
	
	public boolean isResolved() {
		return result != null;
	}
	
	public synchronized west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolveResult<ReferenceType> resolve() {
		if (resolving) {
			return null;
		}
		resolving = true;
		if (result == null || !result.wasResolved()) {
			result = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasReferenceResolveResult<ReferenceType>(false);
			//set an initial default error message
			result.setErrorMessage(getStdErrorMessage());
			
			west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolver<ContainerType, ReferenceType> resolver = getResolver();
			//do the actual resolving
			resolver.resolve(getIdentifier(), getContainer(), getReference(), getPositionInReference(), false, result);
			
			//EMFText allows proxies to resolve to multiple objects
			//the first is returned, the others are added here to the reference
			if(result.wasResolvedMultiple()) {
				handleMultipleResults();
			}
		}
		resolving = false;
		return result;
	}
	
	public abstract west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolver<ContainerType, ReferenceType> getResolver();
	
	private void handleMultipleResults() {
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> list = null;
		java.lang.Object temp = container.eGet(reference);
		if (temp instanceof org.eclipse.emf.common.util.EList<?>) {
			list = west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasCastUtil.cast(temp);
		}
		
		boolean first = true;
		for(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceMapping<ReferenceType> mapping : result.getMappings()) {
			if (first) {
				first = false;
			} else if (list != null) {
				addResultToList(mapping, proxy, list);
			} else {
				west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasPlugin.logError(container.eClass().getName() + "." + reference.getName() + " has multiplicity 1 but was resolved to multiple elements", null);
			}
		}
	}
	
	private void addResultToList(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceMapping<ReferenceType> mapping, org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> list) {
		org.eclipse.emf.ecore.EObject target = null;
		int proxyPosition = list.indexOf(proxy);
		
		if (mapping instanceof west.twouse.language.sparqlas.resource.sparqlas.ISparqlasElementMapping<?>) {
			target = ((west.twouse.language.sparqlas.resource.sparqlas.ISparqlasElementMapping<ReferenceType>) mapping).getTargetElement();
		} else if (mapping instanceof west.twouse.language.sparqlas.resource.sparqlas.ISparqlasURIMapping<?>) {
			target = org.eclipse.emf.ecore.util.EcoreUtil.copy(proxy);
			org.eclipse.emf.common.util.URI uri = ((west.twouse.language.sparqlas.resource.sparqlas.ISparqlasURIMapping<ReferenceType>) mapping).getTargetIdentifier();
			((org.eclipse.emf.ecore.InternalEObject) target).eSetProxyURI(uri);
		} else {
			assert false;
		}
		try {
			// if target is an another proxy and list is "unique"
			// add() will try to resolve the new proxy to check for uniqueness.
			// There seems to be no way to avoid that. Until now this does not
			// cause any problems.
			if (proxyPosition + 1 == list.size()) {
				list.add(target);
			} else {
				list.add(proxyPosition + 1, target);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	private String getStdErrorMessage() {
		String typeName = this.getReference().getEType().getName();
		String msg = typeName + " '" + identifier + "' not declared";
		return msg;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public ContainerType getContainer() {
		return container;
	}
	
	public org.eclipse.emf.ecore.EReference getReference() {
		return reference;
	}
	
	public int getPositionInReference() {
		return positionInReference;
	}
	
	public org.eclipse.emf.ecore.EObject getProxy() {
		return proxy;
	}
	
}
