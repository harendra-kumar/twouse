/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class SparqlasExpectedStructuralFeature extends west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasAbstractExpectedElement {
	
	private west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasPlaceholder placeholder;
	
	public SparqlasExpectedStructuralFeature(west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasPlaceholder placeholder) {
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
		if (o instanceof SparqlasExpectedStructuralFeature) {
			return getFeature().equals(((SparqlasExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
