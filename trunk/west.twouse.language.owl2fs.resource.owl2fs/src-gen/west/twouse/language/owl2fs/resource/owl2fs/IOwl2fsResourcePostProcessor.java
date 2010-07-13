/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

// Implementors of this interface can be used to post-process
// parsed text resources. This can be useful to validate or
// modify the model that was instantiated for the text.
public interface IOwl2fsResourcePostProcessor {
	
	// Processes the resource after it was parsed.
	//
	// @param resource the resource to validate of modify
	public void process(west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsResource resource);
}
