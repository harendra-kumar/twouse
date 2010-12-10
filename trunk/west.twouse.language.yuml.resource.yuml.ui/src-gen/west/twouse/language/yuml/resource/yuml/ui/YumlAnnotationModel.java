/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.ui;

public class YumlAnnotationModel extends org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel implements org.eclipse.jface.text.source.IAnnotationModel {
	
	public YumlAnnotationModel(org.eclipse.core.resources.IResource resource) {
		super(resource);
	}
	
	protected org.eclipse.ui.texteditor.MarkerAnnotation createMarkerAnnotation(org.eclipse.core.resources.IMarker marker) {
		return new west.twouse.language.yuml.resource.yuml.ui.YumlMarkerAnnotation(marker);
	}
	
}
