/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IYumlCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
