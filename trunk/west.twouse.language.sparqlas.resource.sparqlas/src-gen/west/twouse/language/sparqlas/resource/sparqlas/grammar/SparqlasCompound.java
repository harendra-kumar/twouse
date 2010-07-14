/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.grammar;

public class SparqlasCompound extends west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement {
	
	public SparqlasCompound(west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasChoice choice, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality) {
		super(cardinality, new west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
