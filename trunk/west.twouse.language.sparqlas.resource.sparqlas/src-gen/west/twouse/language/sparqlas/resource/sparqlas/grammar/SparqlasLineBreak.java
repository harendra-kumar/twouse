/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.grammar;

public class SparqlasLineBreak extends west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement {
	
	private final int tabs;
	
	public SparqlasLineBreak(west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality, int tabs) {
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
