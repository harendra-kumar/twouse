/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

/**
 * A basic implementation of the
 * west.twouse.language.yuml.resource.yuml.IYumlElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class YumlElementMapping<ReferenceType> implements west.twouse.language.yuml.resource.yuml.IYumlElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public YumlElementMapping(String identifier, ReferenceType target, String warning) {
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
