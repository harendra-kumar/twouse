/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.grammar;

public class Owl2fsWhiteSpace extends west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsFormattingElement {
	
	private final int amount;
	
	public Owl2fsWhiteSpace(int amount, west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality cardinality) {
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
