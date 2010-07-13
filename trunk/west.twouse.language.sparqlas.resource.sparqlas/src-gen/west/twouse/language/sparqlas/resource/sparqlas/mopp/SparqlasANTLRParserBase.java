/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public abstract class SparqlasANTLRParserBase extends org.antlr.runtime.Parser implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextParser {
	
	public SparqlasANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public SparqlasANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
