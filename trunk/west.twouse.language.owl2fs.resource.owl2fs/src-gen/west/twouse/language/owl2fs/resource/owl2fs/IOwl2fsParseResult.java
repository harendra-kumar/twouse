/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IOwl2fsParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsCommand<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource>> getPostParseCommands();
	
}
