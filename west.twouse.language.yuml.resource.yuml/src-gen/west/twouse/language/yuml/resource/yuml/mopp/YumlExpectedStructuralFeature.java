/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class YumlExpectedStructuralFeature extends west.twouse.language.yuml.resource.yuml.mopp.YumlAbstractExpectedElement {
	
	private west.twouse.language.yuml.resource.yuml.grammar.YumlPlaceholder placeholder;
	
	public YumlExpectedStructuralFeature(west.twouse.language.yuml.resource.yuml.grammar.YumlPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof YumlExpectedStructuralFeature) {
			return getFeature().equals(((YumlExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
