/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

public class Owl2fsMetaInformation implements de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "owl2fs";
	}
	
	public java.lang.String getURI() {
		return "http://west.uni-koblenz.de/OWL2FS";
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextScanner createLexer() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsAntlrScanner(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsLexer());
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsParser().createInstance(inputStream, encoding);
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextPrinter createPrinter(java.io.OutputStream outputStream, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource resource) {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsPrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsReferenceResolverSwitch getReferenceResolverSwitch() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsReferenceResolverSwitch();
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolverFactory getTokenResolverFactory() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "de.uniko.isweb.emftext.owl2fs/metamodel/owl2fs.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsParser(null).getTokenNames();
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsBracketPair> getBracketPairs() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsFoldingInformationProvider().getFoldableClasses();
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsHoverTextProvider getHoverTextProvider() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsHoverTextProvider();
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsColorManager createColorManager() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsColorManager();
	}
	
	public org.eclipse.jface.text.rules.ITokenScanner createTokenScanner(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsColorManager colorManager) {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsResourceFactory();
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsNewFileContentProvider getNewFileContentProvider() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsNewFileContentProvider();
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsCodeCompletionHelper createCodeCompletionHelper() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsCodeCompletionHelper();
	}
	
}
