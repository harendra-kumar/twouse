/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class SparqlasAbstractExpectedElement implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement {
	
	private java.util.Set<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement> followers = new java.util.LinkedHashSet<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement>();
	
	public SparqlasAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement> getFollowers() {
		return followers;
	}
	
}
