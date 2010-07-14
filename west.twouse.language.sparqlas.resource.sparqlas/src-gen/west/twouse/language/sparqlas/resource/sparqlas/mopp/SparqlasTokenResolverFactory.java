/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasTokenResolverFactory implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolverFactory {
	
	private java.util.Map<java.lang.String, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver> featureName2CollectInTokenResolver;
	private static west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver defaultResolver = new west.twouse.language.sparqlas.resource.sparqlas.analysis.SparqlasDefaultTokenResolver();
	
	public SparqlasTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<java.lang.String, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<java.lang.String, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver>();
		registerTokenResolver("INTEGER", new west.twouse.language.sparqlas.resource.sparqlas.analysis.SparqlasINTEGERTokenResolver());
		registerTokenResolver("LITERAL", new west.twouse.language.sparqlas.resource.sparqlas.analysis.SparqlasLITERALTokenResolver());
		registerTokenResolver("VARIABLE", new west.twouse.language.sparqlas.resource.sparqlas.analysis.SparqlasVARIABLETokenResolver());
		registerTokenResolver("NODE", new west.twouse.language.sparqlas.resource.sparqlas.analysis.SparqlasNODETokenResolver());
		registerTokenResolver("FULLIRI", new west.twouse.language.sparqlas.resource.sparqlas.analysis.SparqlasFULLIRITokenResolver());
		registerTokenResolver("ABBRIRI", new west.twouse.language.sparqlas.resource.sparqlas.analysis.SparqlasABBRIRITokenResolver());
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver internalCreateResolver(java.util.Map<java.lang.String, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver> resolverMap, java.lang.String key, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
