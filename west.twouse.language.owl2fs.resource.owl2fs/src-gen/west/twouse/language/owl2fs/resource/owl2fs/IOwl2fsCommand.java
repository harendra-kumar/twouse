/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IOwl2fsCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
