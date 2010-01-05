/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

// Abstract super class for all expected elements. Provides methods to
// add followers
public abstract class SparqlasAbstractExpectedElement implements de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement {
	
	private java.util.Set<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement> followers = new java.util.LinkedHashSet<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement>();
	
	public SparqlasAbstractExpectedElement() {
		super();
	}
	
	public void addFollower(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement follower) {
		followers.add(follower);
	}
	
	public java.util.Collection<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement> getFollowers() {
		return followers;
	}
	
}
