/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class Owl2fsPlaceholder extends west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsTerminal {
	
	private final java.lang.String tokenName;
	
	public Owl2fsPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, java.lang.String tokenName, west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public java.lang.String getTokenName() {
		return tokenName;
	}
	
}
