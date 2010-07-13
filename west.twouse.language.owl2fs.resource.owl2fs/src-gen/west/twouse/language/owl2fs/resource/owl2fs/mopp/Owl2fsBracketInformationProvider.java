/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public class Owl2fsBracketInformationProvider {
	
	public class BracketPair implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsBracketPair> getBracketPairs() {
		java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsBracketPair> result = new java.util.ArrayList<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsBracketPair>();
		result.add(new BracketPair("(", ")", true));
		return result;
	}
	
}
