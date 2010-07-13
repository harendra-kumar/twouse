/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

// A common interface for scanners to be used by EMFText.
// A scanner is initialized with a text and delivers a
// sequence of tokens.
public interface IOwl2fsTextScanner {
	
	// Sets the text that must be scanned.
	public void setText(String text);
	
	// Returns the next token found in the text.
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextToken getNextToken();
}
