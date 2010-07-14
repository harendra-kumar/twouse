/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private SparqlasSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<java.lang.Integer> indicesToPrint = new java.util.ArrayList<java.lang.Integer>();
	
	public SparqlasSyntaxElementDecorator(west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement decoratedElement, SparqlasSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(java.lang.Integer index) {
		indicesToPrint.add(index);
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public SparqlasSyntaxElementDecorator[] getChildDecorators() {
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
