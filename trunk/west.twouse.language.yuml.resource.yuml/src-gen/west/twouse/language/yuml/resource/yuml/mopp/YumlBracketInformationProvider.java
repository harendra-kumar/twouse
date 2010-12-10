/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlBracketInformationProvider {
	
	public class BracketPair implements west.twouse.language.yuml.resource.yuml.IYumlBracketPair {
		
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
	
	public java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlBracketPair> getBracketPairs() {
		java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlBracketPair> result = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.IYumlBracketPair>();
		result.add(new BracketPair("[", "]", true));
		result.add(new BracketPair("(", ")", true));
		return result;
	}
	
}
