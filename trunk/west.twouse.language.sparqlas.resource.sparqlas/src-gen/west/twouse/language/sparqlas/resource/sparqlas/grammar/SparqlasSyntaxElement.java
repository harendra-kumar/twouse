/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class SparqlasSyntaxElement {
	
	private SparqlasSyntaxElement[] children;
	private SparqlasSyntaxElement parent;
	private west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality;
	
	public SparqlasSyntaxElement(west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality, SparqlasSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (SparqlasSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(SparqlasSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public SparqlasSyntaxElement[] getChildren() {
		if (children == null) {
			return new SparqlasSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality getCardinality() {
		return cardinality;
	}
	
}
