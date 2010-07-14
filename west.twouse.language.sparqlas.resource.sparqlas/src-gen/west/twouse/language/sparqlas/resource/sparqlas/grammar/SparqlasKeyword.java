/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class SparqlasKeyword extends west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement {
	
	private final String value;
	
	public SparqlasKeyword(String value, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality) {
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
