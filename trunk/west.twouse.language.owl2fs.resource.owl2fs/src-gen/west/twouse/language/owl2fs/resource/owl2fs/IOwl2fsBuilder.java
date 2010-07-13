/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

public interface IOwl2fsBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
