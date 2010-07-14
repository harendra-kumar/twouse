/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ISparqlasResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasResourcePostProcessor getResourcePostProcessor();
	
}
