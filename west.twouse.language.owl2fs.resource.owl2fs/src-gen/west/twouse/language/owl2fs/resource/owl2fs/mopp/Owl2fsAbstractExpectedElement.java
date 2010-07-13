/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class Owl2fsAbstractExpectedElement implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement {
	
	private java.util.Set<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement> followers = new java.util.LinkedHashSet<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement>();
	
	public Owl2fsAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement> getFollowers() {
		return followers;
	}
	
}
