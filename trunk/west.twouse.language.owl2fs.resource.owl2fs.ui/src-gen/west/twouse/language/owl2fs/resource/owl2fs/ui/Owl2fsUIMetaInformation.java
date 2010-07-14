/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.ui;

public class Owl2fsUIMetaInformation extends west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsMetaInformation {
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsHoverTextProvider getHoverTextProvider() {
		return new west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsHoverTextProvider();
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsColorManager createColorManager() {
		return new west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsColorManager();
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsTokenScanner createTokenScanner(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsColorManager colorManager) {
		return new west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsTokenScanner(colorManager);
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsCodeCompletionHelper createCodeCompletionHelper() {
		return new west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsCodeCompletionHelper();
	}
	
}
