/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.grammar;

public class YumlSequence extends west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement {
	
	public YumlSequence(west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality, west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return west.twouse.language.yuml.resource.yuml.util.YumlStringUtil.explode(getChildren(), " ");
	}
	
}
