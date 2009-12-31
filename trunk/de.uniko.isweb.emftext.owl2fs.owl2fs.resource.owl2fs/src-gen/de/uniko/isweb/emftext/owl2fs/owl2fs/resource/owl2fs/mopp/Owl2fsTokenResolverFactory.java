/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

public class Owl2fsTokenResolverFactory implements de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolverFactory {
	
	private java.util.Map<java.lang.String, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver> tokenName2TokenResolver;
	private java.util.Map<java.lang.String, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver> featureName2CollectInTokenResolver;
	private static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver defaultResolver = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.analysis.Owl2fsDefaultTokenResolver();
	
	public Owl2fsTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.HashMap<java.lang.String, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.HashMap<java.lang.String, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver>();
		registerTokenResolver("INTEGER", new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.analysis.Owl2fsINTEGERTokenResolver());
		registerTokenResolver("LITERAL", new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.analysis.Owl2fsLITERALTokenResolver());
		registerTokenResolver("NODE", new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.analysis.Owl2fsNODETokenResolver());
		registerTokenResolver("DIRTYIRI", new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.analysis.Owl2fsDIRTYIRITokenResolver());
		registerTokenResolver("FULLIRI", new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.analysis.Owl2fsFULLIRITokenResolver());
		registerTokenResolver("QUOTED_34_34", new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.analysis.Owl2fsQUOTED_34_34TokenResolver());
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver createTokenResolver(java.lang.String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver createCollectInTokenResolver(java.lang.String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(java.lang.String tokenName, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(java.lang.String featureName, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver deRegisterTokenResolver(java.lang.String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver internalCreateResolver(java.util.Map<java.lang.String, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<java.lang.String, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver> resolverMap, java.lang.String key, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
