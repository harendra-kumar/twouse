/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlParseResult implements west.twouse.language.yuml.resource.yuml.IYumlParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>> commands = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>>();
	
	public YumlParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
