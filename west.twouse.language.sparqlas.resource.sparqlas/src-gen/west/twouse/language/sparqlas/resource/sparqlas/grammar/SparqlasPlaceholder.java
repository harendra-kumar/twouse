/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class SparqlasPlaceholder extends west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasTerminal {
	
	private final java.lang.String tokenName;
	
	public SparqlasPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, java.lang.String tokenName, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public java.lang.String getTokenName() {
		return tokenName;
	}
	
}
