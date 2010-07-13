/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public class Owl2fsParseResult implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsCommand<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource>> commands = new java.util.ArrayList<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsCommand<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource>>();
	
	public Owl2fsParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsCommand<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
