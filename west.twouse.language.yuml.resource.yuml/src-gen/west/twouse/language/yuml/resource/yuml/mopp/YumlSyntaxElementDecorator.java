/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private YumlSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public YumlSyntaxElementDecorator(west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement decoratedElement, YumlSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public YumlSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
