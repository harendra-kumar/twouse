/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.grammar;

public class YumlCompound extends west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement {
	
	public YumlCompound(west.twouse.language.yuml.resource.yuml.grammar.YumlChoice choice, west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality) {
		super(cardinality, new west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
