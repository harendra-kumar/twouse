/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas;

public interface ISparqlasBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
