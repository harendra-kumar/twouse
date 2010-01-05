/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class SparqlasExpectedCsString extends de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasAbstractExpectedElement {
	
	private String value;
	
	public SparqlasExpectedCsString(String value) {
		super();
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getTokenName() {
		return "'" + value + "'";
	}
	
	public String toString() {
		return "CsString \"" + value + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof SparqlasExpectedCsString) {
			return this.value.equals(((SparqlasExpectedCsString) o).value);
		}
		return false;
	}
	
}
