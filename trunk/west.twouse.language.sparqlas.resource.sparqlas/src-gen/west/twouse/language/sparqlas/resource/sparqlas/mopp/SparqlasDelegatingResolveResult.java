/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

// An implementation of the ResolveResult interface that delegates
// all method calls to another ResolveResult. Client may subclass
// this class to easily create custom ResolveResults.
//
// @param <ReferenceType> the type of the references that can be contained in this result
//
public class SparqlasDelegatingResolveResult<ReferenceType> implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolveResult<ReferenceType> {
	
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolveResult<ReferenceType> delegate;
	
	public SparqlasDelegatingResolveResult(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolveResult<ReferenceType> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceMapping<ReferenceType>> getMappings() {
		return delegate.getMappings();
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, target);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, target, warning);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
}
