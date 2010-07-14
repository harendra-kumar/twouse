/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.grammar;

public class SparqlasChoice extends west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement {
	
	public SparqlasChoice(west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasStringUtil.explode(getChildren(), "|");
	}
	
}
