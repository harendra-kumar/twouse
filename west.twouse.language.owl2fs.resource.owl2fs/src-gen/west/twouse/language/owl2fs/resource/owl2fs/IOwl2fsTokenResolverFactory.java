/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs;

// A TokenResolverFactory creates TokenResolvers for a given token name.
// They may be implemented like a registry.
public interface IOwl2fsTokenResolverFactory {
	
	// Creates a token resolver for normal tokens of type 'tokenName'.
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver createTokenResolver(String tokenName);
	
	// Creates a token resolver for COLLECT-IN tokens that are stores in
	// feature 'featureName'.
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver createCollectInTokenResolver(String featureName);
}
