/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class YumlKeyword extends west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement {
	
	private final String value;
	
	public YumlKeyword(String value, west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality) {
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
