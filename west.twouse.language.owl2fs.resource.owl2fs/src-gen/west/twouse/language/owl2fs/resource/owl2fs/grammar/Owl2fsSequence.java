/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.grammar;

public class Owl2fsSequence extends west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsSyntaxElement {
	
	public Owl2fsSequence(west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality cardinality, west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return west.twouse.language.owl2fs.resource.owl2fs.util.Owl2fsStringUtil.explode(getChildren(), " ");
	}
	
}
