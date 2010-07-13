/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

// A simple interface to access information about matching
// brackets.
public interface IOwl2fsBracketPair {
	
	// Returns the opening bracket.
	//
	// @return
	public String getOpeningBracket();
	
	// Returns the closing bracket.
	//
	// @return
	public String getClosingBracket();
	
	// Returns whether other bracket pairs shall be
	// automatically closed, when used inside of this
	// bracket pair.
	//
	// @return
	public boolean isClosingEnabledInside();
}
