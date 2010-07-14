/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface ISparqlasExpectedElement {
	
	public java.lang.String getTokenName();
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	public void addFollower(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path);
	public java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasPair<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers();
}
