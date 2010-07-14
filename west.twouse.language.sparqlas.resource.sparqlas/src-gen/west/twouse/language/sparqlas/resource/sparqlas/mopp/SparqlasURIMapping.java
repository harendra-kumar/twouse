/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

/**
 * A basic implementation of the
 * west.twouse.language.sparqlas.resource.sparqlas.ISparqlasURIMapping interface
 * that can map identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * west.twouse.language.sparqlas.resource.sparqlas.ISparqlasURIMapping.
 */
public class SparqlasURIMapping<ReferenceType> implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public SparqlasURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
