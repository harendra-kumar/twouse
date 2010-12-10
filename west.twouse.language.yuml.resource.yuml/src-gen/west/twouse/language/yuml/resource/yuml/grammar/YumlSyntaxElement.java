/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class YumlSyntaxElement {
	
	private YumlSyntaxElement[] children;
	private YumlSyntaxElement parent;
	private west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality;
	
	public YumlSyntaxElement(west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality, YumlSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (YumlSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(YumlSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public YumlSyntaxElement[] getChildren() {
		if (children == null) {
			return new YumlSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality getCardinality() {
		return cardinality;
	}
	
}
