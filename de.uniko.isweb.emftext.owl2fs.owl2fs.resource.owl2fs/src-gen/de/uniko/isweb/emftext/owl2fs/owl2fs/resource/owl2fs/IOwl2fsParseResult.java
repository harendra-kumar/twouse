/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs;

// An interface used to access the result of parsing a
// document.
public interface IOwl2fsParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource>> getPostParseCommands();
}
