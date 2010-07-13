/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

// An element that is expected at a given position in a resource
// stream.
public interface IOwl2fsExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement follower);
	public java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement> getFollowers();
}
