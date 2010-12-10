/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IYumlResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public west.twouse.language.yuml.resource.yuml.IYumlResourcePostProcessor getResourcePostProcessor();
	
}
