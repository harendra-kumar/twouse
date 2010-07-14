/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.grammar;

public class Owl2fsChoice extends west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsSyntaxElement {
	
	public Owl2fsChoice(west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality cardinality, west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return west.twouse.language.owl2fs.resource.owl2fs.util.Owl2fsStringUtil.explode(getChildren(), "|");
	}
	
}
