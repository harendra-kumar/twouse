package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasNewFileContentProvider {
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasMetaInformation getMetaInformation() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasMetaInformation();
	}
	
	public java.lang.String getNewFileContent(java.lang.String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getOntologyDocument(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, java.lang.String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasPrinter(outputStream, new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasResource());
	}
	
}
