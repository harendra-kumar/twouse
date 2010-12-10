/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.ui;

public class YumlAnnotationModelFactory implements org.eclipse.core.filebuffers.IAnnotationModelFactory {
	
	public org.eclipse.jface.text.source.IAnnotationModel createAnnotationModel(org.eclipse.core.runtime.IPath location) {
		org.eclipse.core.resources.IWorkspace workspace = org.eclipse.core.resources.ResourcesPlugin.getWorkspace();
		org.eclipse.core.resources.IWorkspaceRoot root = workspace.getRoot();
		org.eclipse.core.resources.IResource resource = root.findMember(location);
		return new west.twouse.language.yuml.resource.yuml.ui.YumlAnnotationModel(resource);
	}
	
}
