/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

/**
 * A basic implementation of the
 * west.twouse.language.yuml.resource.yuml.IYumlURIMapping interface that can map
 * identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * west.twouse.language.yuml.resource.yuml.IYumlURIMapping.
 */
public class YumlURIMapping<ReferenceType> implements west.twouse.language.yuml.resource.yuml.IYumlURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public YumlURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
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
