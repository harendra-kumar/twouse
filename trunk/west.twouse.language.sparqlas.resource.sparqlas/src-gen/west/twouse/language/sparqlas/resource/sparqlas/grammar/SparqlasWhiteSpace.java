/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.grammar;

public class SparqlasWhiteSpace extends west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement {
	
	private final int amount;
	
	public SparqlasWhiteSpace(int amount, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
