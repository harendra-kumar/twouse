/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasParseResult implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasCommand<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource>> commands = new java.util.ArrayList<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasCommand<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource>>();
	
	public SparqlasParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasCommand<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
