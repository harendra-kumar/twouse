/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.grammar;

public class Owl2fsContainment extends west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsTerminal {
	
	public Owl2fsContainment(org.eclipse.emf.ecore.EStructuralFeature feature, west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
