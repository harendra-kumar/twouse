/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas;

/**
 * An interface used to access the result of parsing a document.
 */
public interface ISparqlasParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasCommand<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource>> getPostParseCommands();
	
}
