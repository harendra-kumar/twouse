/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas;

// A TokenResolverFactory creates TokenResolvers for a given token name.
// They may be implemented like a registry.
public interface ISparqlasTokenResolverFactory {
	
	// Creates a token resolver for normal tokens of type 'tokenName'.
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver createTokenResolver(String tokenName);
	
	// Creates a token resolver for COLLECT-IN tokens that are stores in
	// feature 'featureName'.
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver createCollectInTokenResolver(String featureName);
}
