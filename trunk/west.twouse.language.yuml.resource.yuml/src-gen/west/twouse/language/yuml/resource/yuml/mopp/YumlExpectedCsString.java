/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class YumlExpectedCsString extends west.twouse.language.yuml.resource.yuml.mopp.YumlAbstractExpectedElement {
	
	private west.twouse.language.yuml.resource.yuml.grammar.YumlKeyword keyword;
	
	public YumlExpectedCsString(west.twouse.language.yuml.resource.yuml.grammar.YumlKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof YumlExpectedCsString) {
			return getValue().equals(((YumlExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
