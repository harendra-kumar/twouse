/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.grammar;

public class YumlContainment extends west.twouse.language.yuml.resource.yuml.grammar.YumlTerminal {
	
	public YumlContainment(org.eclipse.emf.ecore.EStructuralFeature feature, west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
