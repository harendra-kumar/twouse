/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas;

// An interface used to access the result of parsing a
// document.
public interface ISparqlasParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasCommand<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource>> getPostParseCommands();
}
