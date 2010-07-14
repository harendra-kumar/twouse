/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public class Owl2fsSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private Owl2fsSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<java.lang.Integer> indicesToPrint = new java.util.ArrayList<java.lang.Integer>();
	
	public Owl2fsSyntaxElementDecorator(west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsSyntaxElement decoratedElement, Owl2fsSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(java.lang.Integer index) {
		indicesToPrint.add(index);
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.grammar.Owl2fsSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public Owl2fsSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public java.lang.Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
