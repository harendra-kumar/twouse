/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class Owl2fsSyntaxElement {
	
	private Owl2fsSyntaxElement[] children;
	private Owl2fsSyntaxElement parent;
	private west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality cardinality;
	
	public Owl2fsSyntaxElement(west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality cardinality, Owl2fsSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (Owl2fsSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(Owl2fsSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public Owl2fsSyntaxElement[] getChildren() {
		if (children == null) {
			return new Owl2fsSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsCardinality getCardinality() {
		return cardinality;
	}
	
}
