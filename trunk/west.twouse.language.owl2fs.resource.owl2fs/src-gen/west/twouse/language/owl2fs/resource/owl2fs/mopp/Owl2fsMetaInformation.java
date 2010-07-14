/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public class Owl2fsMetaInformation implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "owl2fs";
	}
	
	public java.lang.String getURI() {
		return "http://west.uni-koblenz.de/owl2fs";
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextScanner createLexer() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsAntlrScanner(new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsLexer());
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsParser().createInstance(inputStream, encoding);
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextPrinter createPrinter(java.io.OutputStream outputStream, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource resource) {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsReferenceResolverSwitch getReferenceResolverSwitch() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsReferenceResolverSwitch();
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolverFactory getTokenResolverFactory() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "west.twouse.language.owl2fs/metamodel/owl2fs.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsParser(null).getTokenNames();
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsBracketPair> getBracketPairs() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsResourceFactory();
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsNewFileContentProvider getNewFileContentProvider() {
		return new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsNewFileContentProvider();
	}
	
}
