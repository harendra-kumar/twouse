/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

// A representation for a range in a document where a keyword (i.e.,
// a static string) is expected.
public class Owl2fsExpectedCsString extends de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsAbstractExpectedElement {
	
	private String value;
	
	public Owl2fsExpectedCsString(String value) {
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
		if (o instanceof Owl2fsExpectedCsString) {
			return this.value.equals(((Owl2fsExpectedCsString) o).value);
		}
		return false;
	}
	
}
