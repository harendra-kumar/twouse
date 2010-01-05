/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas;

// An element that is expected at a given position in a resource
// stream.
public interface ISparqlasExpectedElement {
	
	public java.lang.String getTokenName();
	public void addFollower(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement follower);
	public java.util.Collection<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement> getFollowers();
}
