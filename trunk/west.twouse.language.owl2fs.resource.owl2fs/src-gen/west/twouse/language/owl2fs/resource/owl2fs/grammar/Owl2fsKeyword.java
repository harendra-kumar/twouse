/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class Owl2fsKeyword extends west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsSyntaxElement {
	
	private final String value;
	
	public Owl2fsKeyword(String value, west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
