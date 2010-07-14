/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.grammar;

public class SparqlasSequence extends west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement {
	
	public SparqlasSequence(west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasStringUtil.explode(getChildren(), " ");
	}
	
}
