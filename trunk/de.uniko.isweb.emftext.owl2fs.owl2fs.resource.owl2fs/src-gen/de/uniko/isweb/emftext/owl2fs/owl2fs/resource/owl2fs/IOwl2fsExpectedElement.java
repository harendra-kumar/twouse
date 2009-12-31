/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs;

// An element that is expected at a given position in a resource
// stream.
public interface IOwl2fsExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement follower);
	public java.util.Collection<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement> getFollowers();
}
