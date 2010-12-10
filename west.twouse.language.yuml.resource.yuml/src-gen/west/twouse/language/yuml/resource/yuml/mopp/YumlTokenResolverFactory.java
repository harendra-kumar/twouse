/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlTokenResolverFactory implements west.twouse.language.yuml.resource.yuml.IYumlTokenResolverFactory {
	
	private java.util.Map<String, west.twouse.language.yuml.resource.yuml.IYumlTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, west.twouse.language.yuml.resource.yuml.IYumlTokenResolver> featureName2CollectInTokenResolver;
	private static west.twouse.language.yuml.resource.yuml.IYumlTokenResolver defaultResolver = new west.twouse.language.yuml.resource.yuml.analysis.YumlDefaultTokenResolver();
	
	public YumlTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, west.twouse.language.yuml.resource.yuml.IYumlTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, west.twouse.language.yuml.resource.yuml.IYumlTokenResolver>();
		registerTokenResolver("CARDINALITY", new west.twouse.language.yuml.resource.yuml.analysis.YumlCARDINALITYTokenResolver());
		registerTokenResolver("ALPHANUM", new west.twouse.language.yuml.resource.yuml.analysis.YumlALPHANUMTokenResolver());
		registerTokenResolver("VISIBILITY", new west.twouse.language.yuml.resource.yuml.analysis.YumlVISIBILITYTokenResolver());
		registerTokenResolver("TEXT", new west.twouse.language.yuml.resource.yuml.analysis.YumlTEXTTokenResolver());
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected west.twouse.language.yuml.resource.yuml.IYumlTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private west.twouse.language.yuml.resource.yuml.IYumlTokenResolver internalCreateResolver(java.util.Map<String, west.twouse.language.yuml.resource.yuml.IYumlTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, west.twouse.language.yuml.resource.yuml.IYumlTokenResolver> resolverMap, String key, west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
