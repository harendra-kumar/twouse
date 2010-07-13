/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

// A representation for a range in a document where a terminal (i.e.,
// a placeholder or a keyword) is expected.
// The range is expressed using two integers denoting the start of the range
// including hidden tokens (e.g., whitespace) and excluding those token 
// (i.e., the part of the document containing the relevant characters).
public class SparqlasExpectedTerminal {
	
	private int followSetID;
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement terminal;
	private int startIncludingHiddenTokens;
	private int startExcludingHiddenTokens;
	private String prefix;
	
	public SparqlasExpectedTerminal(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement terminal, int followSetID) {
		super();
		this.terminal = terminal;
		this.followSetID = followSetID;
	}
	
	public int getFollowSetID() {
		return followSetID;
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement getTerminal() {
		return terminal;
	}
	
	public String toString() {
		return terminal == null ? "null" : terminal.toString();
	}
	
	public boolean equals(Object o) {
		return this.terminal.equals(((SparqlasExpectedTerminal) o).terminal);
	}
	
	public void setPosition(int startIncludingHiddenTokens, int startExcludingHiddenTokens) {
		assert startExcludingHiddenTokens <= startExcludingHiddenTokens;
		assert startIncludingHiddenTokens <= startExcludingHiddenTokens;
		this.startIncludingHiddenTokens = startIncludingHiddenTokens;
		this.startExcludingHiddenTokens = startExcludingHiddenTokens;
	}
	
	public int getStartIncludingHiddenTokens() {
		return startIncludingHiddenTokens;
	}
	
	public int getStartExcludingHiddenTokens() {
		return startExcludingHiddenTokens;
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
}
