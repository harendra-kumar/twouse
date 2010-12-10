/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.grammar;

public class YumlLineBreak extends west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement {
	
	private final int tabs;
	
	public YumlLineBreak(west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
