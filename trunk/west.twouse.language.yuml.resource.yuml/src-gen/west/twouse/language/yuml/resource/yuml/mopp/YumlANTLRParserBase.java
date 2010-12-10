/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public abstract class YumlANTLRParserBase extends org.antlr.runtime3_2_0.Parser implements west.twouse.language.yuml.resource.yuml.IYumlTextParser {
	
	public YumlANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input) {
		super(input);
	}
	
	public YumlANTLRParserBase(org.antlr.runtime3_2_0.TokenStream input, org.antlr.runtime3_2_0.RecognizerSharedState state) {
		super(input, state);
	}
	
}
