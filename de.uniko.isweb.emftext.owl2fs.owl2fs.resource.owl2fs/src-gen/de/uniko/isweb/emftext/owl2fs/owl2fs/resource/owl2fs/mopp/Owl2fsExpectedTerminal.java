/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

// A representation for a range in a document where a terminal (i.e.,
// a placeholder or a keyword) is expected.
// The range is expressed using two integers denoting the start of the range
// including hidden tokens (e.g., whitespace) and excluding those token 
// (i.e., the part of the document containing the relevant characters).
public class Owl2fsExpectedTerminal {
	
	private int followSetID;
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement terminal;
	private int startIncludingHiddenTokens;
	private int startExcludingHiddenTokens;
	private String prefix;
	
	public Owl2fsExpectedTerminal(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement terminal, int followSetID) {
		super();
		this.terminal = terminal;
		this.followSetID = followSetID;
	}
	
	public int getFollowSetID() {
		return followSetID;
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement getTerminal() {
		return terminal;
	}
	
	public String toString() {
		return terminal == null ? "null" : terminal.toString();
	}
	
	public boolean equals(Object o) {
		return this.terminal.equals(((Owl2fsExpectedTerminal) o).terminal);
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
