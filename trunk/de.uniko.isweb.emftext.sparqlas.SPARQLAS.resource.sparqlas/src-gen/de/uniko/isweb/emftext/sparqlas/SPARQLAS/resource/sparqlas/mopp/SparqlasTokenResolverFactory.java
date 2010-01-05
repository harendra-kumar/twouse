/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

public class SparqlasTokenResolverFactory implements de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolverFactory {
	
	private java.util.Map<java.lang.String, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver> featureName2CollectInTokenResolver;
	private static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver defaultResolver = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.analysis.SparqlasDefaultTokenResolver();
	
	public SparqlasTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.HashMap<java.lang.String, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.HashMap<java.lang.String, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver>();
		registerTokenResolver("INTEGER", new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.analysis.SparqlasINTEGERTokenResolver());
		registerTokenResolver("LITERAL", new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.analysis.SparqlasLITERALTokenResolver());
		registerTokenResolver("NODE", new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.analysis.SparqlasNODETokenResolver());
		registerTokenResolver("VARIABLE", new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.analysis.SparqlasVARIABLETokenResolver());
		registerTokenResolver("ABBRIRI", new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.analysis.SparqlasABBRIRITokenResolver());
		registerTokenResolver("FULLIRI", new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.analysis.SparqlasFULLIRITokenResolver());
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver internalCreateResolver(java.util.Map<java.lang.String, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver> resolverMap, java.lang.String key, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
