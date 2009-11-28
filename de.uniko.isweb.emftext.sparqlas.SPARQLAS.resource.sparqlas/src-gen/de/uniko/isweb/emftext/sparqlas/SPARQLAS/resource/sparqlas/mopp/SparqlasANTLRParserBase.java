/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

public abstract class SparqlasANTLRParserBase extends org.antlr.runtime.Parser implements de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextParser {
	
	public SparqlasANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public SparqlasANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
