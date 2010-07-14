/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface ISparqlasCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
