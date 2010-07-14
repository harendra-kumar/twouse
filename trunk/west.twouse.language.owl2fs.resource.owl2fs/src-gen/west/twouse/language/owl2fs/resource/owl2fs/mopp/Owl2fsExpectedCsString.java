/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class Owl2fsExpectedCsString extends west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsAbstractExpectedElement {
	
	private west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsKeyword keyword;
	
	public Owl2fsExpectedCsString(west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsKeyword keyword) {
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
		if (o instanceof Owl2fsExpectedCsString) {
			return getValue().equals(((Owl2fsExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
