/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.grammar;

public class Owl2fsCompound extends west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsSyntaxElement {
	
	public Owl2fsCompound(west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsChoice choice, west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality cardinality) {
		super(cardinality, new west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
