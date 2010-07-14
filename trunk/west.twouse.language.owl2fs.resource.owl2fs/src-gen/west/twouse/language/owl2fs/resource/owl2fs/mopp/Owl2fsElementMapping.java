/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

/**
 * A basic implementation of the
 * west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class Owl2fsElementMapping<ReferenceType> implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public Owl2fsElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
