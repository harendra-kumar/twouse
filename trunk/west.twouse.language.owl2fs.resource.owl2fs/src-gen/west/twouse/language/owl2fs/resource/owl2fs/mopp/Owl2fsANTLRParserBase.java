/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public abstract class Owl2fsANTLRParserBase extends org.antlr.runtime.Parser implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextParser {
	
	public Owl2fsANTLRParserBase(org.antlr.runtime.TokenStream input) {
		super(input);
	}
	
	public Owl2fsANTLRParserBase(org.antlr.runtime.TokenStream input, org.antlr.runtime.RecognizerSharedState state) {
		super(input, state);
	}
	
}
