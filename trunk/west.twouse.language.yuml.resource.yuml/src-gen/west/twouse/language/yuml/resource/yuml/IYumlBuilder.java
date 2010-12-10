/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml;

public interface IYumlBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(west.twouse.language.yuml.resource.yuml.mopp.YumlResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
