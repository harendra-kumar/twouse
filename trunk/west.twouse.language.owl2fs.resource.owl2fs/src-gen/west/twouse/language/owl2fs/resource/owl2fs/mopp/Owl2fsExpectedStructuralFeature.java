/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class Owl2fsExpectedStructuralFeature extends west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsAbstractExpectedElement {
	
	private west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsPlaceholder placeholder;
	
	public Owl2fsExpectedStructuralFeature(west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.lang.String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(java.lang.Object o) {
		if (o instanceof Owl2fsExpectedStructuralFeature) {
			return getFeature().equals(((Owl2fsExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
