/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

public class Owl2fsParseResult implements de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource>> commands = new java.util.ArrayList<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource>>();
	
	public Owl2fsParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
