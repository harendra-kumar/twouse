/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasBracketInformationProvider {
	
	public class BracketPair implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasBracketPair {
		
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
	
	public java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasBracketPair> getBracketPairs() {
		java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasBracketPair> result = new java.util.ArrayList<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasBracketPair>();
		result.add(new BracketPair("(", ")", true));
		return result;
	}
	
}
