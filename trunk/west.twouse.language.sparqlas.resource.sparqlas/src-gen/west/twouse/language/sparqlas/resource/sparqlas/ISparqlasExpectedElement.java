/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas;

// An element that is expected at a given position in a resource
// stream.
public interface ISparqlasExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement follower);
	public java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement> getFollowers();
}
