/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.grammar;

public class YumlWhiteSpace extends west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement {
	
	private final int amount;
	
	public YumlWhiteSpace(int amount, west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality) {
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
