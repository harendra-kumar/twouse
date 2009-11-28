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
	
	public void setPosition(int startIncludingHiddenTokens, int startExcludingHiddenTokens);
	public int getStartExcludingHiddenTokens();
	public int getStartIncludingHiddenTokens();
	public String getPrefix();
	public void setPrefix(String prefix);
	public String getScopeID();
	public boolean discardFollowingExpectations();
}
