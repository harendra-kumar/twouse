/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs;

// A simple interface for commands that can be executed
// and that return information about the success of their
// execution.
public interface IOwl2fsCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
