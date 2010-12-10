/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.grammar;

public class YumlChoice extends west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement {
	
	public YumlChoice(west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality, west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return west.twouse.language.yuml.resource.yuml.util.YumlStringUtil.explode(getChildren(), "|");
	}
	
}
