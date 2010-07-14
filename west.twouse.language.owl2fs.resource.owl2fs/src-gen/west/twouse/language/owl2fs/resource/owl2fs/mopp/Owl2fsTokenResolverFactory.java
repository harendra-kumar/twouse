/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public class Owl2fsTokenResolverFactory implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolverFactory {
	
	private java.util.Map<java.lang.String, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver> featureName2CollectInTokenResolver;
	private static west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver defaultResolver = new west.twouse.language.owl2fs.resource.owl2fs.analysis.Owl2fsDefaultTokenResolver();
	
	public Owl2fsTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<java.lang.String, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<java.lang.String, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver>();
		registerTokenResolver("COMMENT", new west.twouse.language.owl2fs.resource.owl2fs.analysis.Owl2fsCOMMENTTokenResolver());
		registerTokenResolver("INTEGER", new west.twouse.language.owl2fs.resource.owl2fs.analysis.Owl2fsINTEGERTokenResolver());
		registerTokenResolver("LITERAL", new west.twouse.language.owl2fs.resource.owl2fs.analysis.Owl2fsLITERALTokenResolver());
		registerTokenResolver("NODE", new west.twouse.language.owl2fs.resource.owl2fs.analysis.Owl2fsNODETokenResolver());
		registerTokenResolver("FULLIRI", new west.twouse.language.owl2fs.resource.owl2fs.analysis.Owl2fsFULLIRITokenResolver());
		registerTokenResolver("ABBRIRI", new west.twouse.language.owl2fs.resource.owl2fs.analysis.Owl2fsABBRIRITokenResolver());
		registerTokenResolver("LANGTAG", new west.twouse.language.owl2fs.resource.owl2fs.analysis.Owl2fsLANGTAGTokenResolver());
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver internalCreateResolver(java.util.Map<java.lang.String, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver> resolverMap, java.lang.String key, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
