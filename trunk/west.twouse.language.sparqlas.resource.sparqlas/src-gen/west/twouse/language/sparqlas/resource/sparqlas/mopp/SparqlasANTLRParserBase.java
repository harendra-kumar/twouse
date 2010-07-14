/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public abstract class SparqlasANTLRParserBase extends org.antlr.runtime3_2_0.Parser implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextParser {
	
	public SparqlasANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input) {
		super(input);
	}
	
	public SparqlasANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input, org.antlr.runtime3_2_0.RecognizerSharedState state) {
		super(input, state);
	}
	
}
