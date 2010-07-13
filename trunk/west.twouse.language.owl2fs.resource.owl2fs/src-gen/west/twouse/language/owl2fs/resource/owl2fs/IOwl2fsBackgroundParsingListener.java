/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

// A listener interface for classes that need notification
// when a background parsing pass has completed.
public interface IOwl2fsBackgroundParsingListener {
	
	// Signals that the given resource has been changed and
	// the background parsing is completed.
	//
	// @param resource the resource that has changed
	public void parsingCompleted(org.eclipse.emf.ecore.resource.Resource resource);
}
