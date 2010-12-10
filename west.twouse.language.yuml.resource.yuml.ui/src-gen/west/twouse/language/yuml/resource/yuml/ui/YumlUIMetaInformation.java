/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.ui;

public class YumlUIMetaInformation extends west.twouse.language.yuml.resource.yuml.mopp.YumlMetaInformation {
	
	public west.twouse.language.yuml.resource.yuml.IYumlHoverTextProvider getHoverTextProvider() {
		return new west.twouse.language.yuml.resource.yuml.ui.YumlHoverTextProvider();
	}
	
	public west.twouse.language.yuml.resource.yuml.ui.YumlImageProvider getImageProvider() {
		return west.twouse.language.yuml.resource.yuml.ui.YumlImageProvider.INSTANCE;
	}
	
	public west.twouse.language.yuml.resource.yuml.ui.YumlColorManager createColorManager() {
		return new west.twouse.language.yuml.resource.yuml.ui.YumlColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(west.twouse.language.yuml.resource.yuml.IYumlTextResource,
	 * west.twouse.language.yuml.resource.yuml.ui.YumlColorManager) instead.
	 */
	public west.twouse.language.yuml.resource.yuml.ui.YumlTokenScanner createTokenScanner(west.twouse.language.yuml.resource.yuml.ui.YumlColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public west.twouse.language.yuml.resource.yuml.ui.YumlTokenScanner createTokenScanner(west.twouse.language.yuml.resource.yuml.IYumlTextResource resource, west.twouse.language.yuml.resource.yuml.ui.YumlColorManager colorManager) {
		return new west.twouse.language.yuml.resource.yuml.ui.YumlTokenScanner(resource, colorManager);
	}
	
	public west.twouse.language.yuml.resource.yuml.ui.YumlCodeCompletionHelper createCodeCompletionHelper() {
		return new west.twouse.language.yuml.resource.yuml.ui.YumlCodeCompletionHelper();
	}
	
}
