/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

// A representation for a range in a document where a CsString (e.g.,
// a keyword) is expected.
public class SparqlasExpectedCsString extends de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasAbstractExpectedElement {
	private String value;
	
	public SparqlasExpectedCsString(String value) {
		this("0", value);
	}
	
	public SparqlasExpectedCsString(String scopeID, String value) {
		super(scopeID, false);
		this.value = value;
	}
	
	public SparqlasExpectedCsString(String scopeID, boolean discardFollowingExpectations, String value) {
		super(scopeID, discardFollowingExpectations);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return super.toString() + " CsString \"" + value + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof SparqlasExpectedCsString) {
			return this.value.equals(((SparqlasExpectedCsString) o).value);
		}
		return false;
	}
}
