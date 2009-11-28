/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas;

// A common interface for scanners to be used by EMFText.
// A scanner is initialized with a text and delivers a
// sequence of tokens.
public interface ISparqlasTextScanner {
	
	// Sets the text that must be scanned.
	public void setText(String text);
	
	// Returns the next token found in the text.
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextToken getNextToken();
}
