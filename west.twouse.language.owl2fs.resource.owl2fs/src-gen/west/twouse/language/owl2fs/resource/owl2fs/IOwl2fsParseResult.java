/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

// An interface used to access the result of parsing a
// document.
public interface IOwl2fsParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsCommand<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource>> getPostParseCommands();
}
