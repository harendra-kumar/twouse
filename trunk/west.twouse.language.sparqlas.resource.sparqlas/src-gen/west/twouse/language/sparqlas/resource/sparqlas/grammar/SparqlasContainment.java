/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.grammar;

public class SparqlasContainment extends west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasTerminal {
	
	public SparqlasContainment(org.eclipse.emf.ecore.EStructuralFeature feature, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
