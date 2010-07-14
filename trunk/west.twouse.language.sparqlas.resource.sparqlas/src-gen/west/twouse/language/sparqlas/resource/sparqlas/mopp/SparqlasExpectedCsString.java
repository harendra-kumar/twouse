/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class SparqlasExpectedCsString extends west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasAbstractExpectedElement {
	
	private west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasKeyword keyword;
	
	public SparqlasExpectedCsString(west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public String getTokenName() {
		return "'" + getValue() + "'";
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof SparqlasExpectedCsString) {
			return getValue().equals(((SparqlasExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
