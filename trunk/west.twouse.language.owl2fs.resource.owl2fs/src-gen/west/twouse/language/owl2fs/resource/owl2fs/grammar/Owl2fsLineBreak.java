/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.grammar;

public class Owl2fsLineBreak extends west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsFormattingElement {
	
	private final int tabs;
	
	public Owl2fsLineBreak(west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality cardinality, int tabs) {
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
