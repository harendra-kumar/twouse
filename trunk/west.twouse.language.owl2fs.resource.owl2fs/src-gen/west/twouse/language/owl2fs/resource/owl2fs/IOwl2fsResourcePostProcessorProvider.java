/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IOwl2fsResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsResourcePostProcessor getResourcePostProcessor();
	
}
