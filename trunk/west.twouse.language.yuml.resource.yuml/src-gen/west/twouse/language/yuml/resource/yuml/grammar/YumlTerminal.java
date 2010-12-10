/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.grammar;

public class YumlTerminal extends west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement {
	
	private final org.eclipse.emf.ecore.EStructuralFeature feature;
	private final int mandatoryOccurencesAfter;
	
	public YumlTerminal(org.eclipse.emf.ecore.EStructuralFeature feature, west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality, int mandatoryOccurencesAfter) {
		super(cardinality, null);
		this.feature = feature;
		this.mandatoryOccurencesAfter = mandatoryOccurencesAfter;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return feature;
	}
	
	public int getMandatoryOccurencesAfter() {
		return mandatoryOccurencesAfter;
	}
	
	public String toString() {
		return feature.getName() + "[]";
	}
	
}
