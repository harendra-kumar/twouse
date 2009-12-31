/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class Owl2fsAbstractExpectedElement implements de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement {
	
	private java.util.Set<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement> followers = new java.util.LinkedHashSet<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement>();
	
	public Owl2fsAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement> getFollowers() {
		return followers;
	}
	
}
