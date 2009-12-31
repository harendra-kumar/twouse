/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

// Standard implementation of <code>IContextDependentURIFragment</code>.
//
// @param <ContainerType> the type of the object that contains the reference which shall be resolved by this fragment.
// @param <ReferenceType> the type of the reference which shall be resolved by this fragment.
//
public abstract class Owl2fsContextDependentURIFragment<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> implements de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsContextDependentURIFragment<ReferenceType> {
	
	protected String identifier;
	protected ContainerType container;
	protected org.eclipse.emf.ecore.EReference reference;
	protected int positionInReference;
	protected org.eclipse.emf.ecore.EObject proxy;
	protected de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsReferenceResolveResult<ReferenceType> result;
	
	private boolean resolving;
	
	public Owl2fsContextDependentURIFragment(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		this.identifier = identifier;
		this.container = container;
		this.reference = reference;
		this.positionInReference = positionInReference;
		this.proxy = proxy;
	}
	
	public boolean isResolved() {
		return result != null;
	}
	
	public synchronized de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsReferenceResolveResult<ReferenceType> resolve() {
		if (resolving) {
			return null;
		}
		resolving = true;
		if (result == null || !result.wasResolved()) {
			result = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsReferenceResolveResult<ReferenceType>(false);
			//set an initial default error message
			result.setErrorMessage(getStdErrorMessage());
			
			de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsReferenceResolver<ContainerType, ReferenceType> resolver = getResolver();
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
	
	public abstract de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsReferenceResolver<ContainerType, ReferenceType> getResolver();
	
	private void handleMultipleResults() {
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> list = null;
		java.lang.Object temp = container.eGet(reference);
		if (temp instanceof org.eclipse.emf.common.util.EList<?>) {
			list = de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.util.Owl2fsCastUtil.cast(temp);
		}
		
		boolean first = true;
		for(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsReferenceMapping<ReferenceType> mapping : result.getMappings()) {
			if (first) {
				first = false;
			} else if (list != null) {
				addResultToList(mapping, proxy, list);
			} else {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.logError(container.eClass().getName() + "." + reference.getName() + " has multiplicity 1 but was resolved to multiple elements", null);
			}
		}
	}
	
	private void addResultToList(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsReferenceMapping<ReferenceType> mapping, org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> list) {
		org.eclipse.emf.ecore.EObject target = null;
		int proxyPosition = list.indexOf(proxy);
		
		if (mapping instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsElementMapping<?>) {
			target = ((de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsElementMapping<ReferenceType>) mapping).getTargetElement();
		} else if (mapping instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsURIMapping<?>) {
			target = org.eclipse.emf.ecore.util.EcoreUtil.copy(proxy);
			org.eclipse.emf.common.util.URI uri = ((de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsURIMapping<ReferenceType>) mapping).getTargetIdentifier();
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
