/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class YumlPlaceholder extends west.twouse.language.yuml.resource.yuml.grammar.YumlTerminal {
	
	private final String tokenName;
	
	public YumlPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
