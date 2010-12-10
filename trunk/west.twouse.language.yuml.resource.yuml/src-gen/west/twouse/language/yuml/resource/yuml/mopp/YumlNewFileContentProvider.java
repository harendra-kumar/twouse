/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlNewFileContentProvider {
	
	public west.twouse.language.yuml.resource.yuml.IYumlMetaInformation getMetaInformation() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlMetaInformation();
	}
	
	public String getNewFileContent(String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getModel(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new west.twouse.language.yuml.resource.yuml.util.YumlMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		west.twouse.language.yuml.resource.yuml.IYumlTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			west.twouse.language.yuml.resource.yuml.mopp.YumlPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new west.twouse.language.yuml.resource.yuml.mopp.YumlResource());
	}
	
}
