/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasMetaInformation implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "sparqlas";
	}
	
	public java.lang.String getURI() {
		return "http://west.uni-koblenz.de/sparqlas";
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextScanner createLexer() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasAntlrScanner(new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLexer());
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasParser().createInstance(inputStream, encoding);
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextPrinter createPrinter(java.io.OutputStream outputStream, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource resource) {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolverSwitch getReferenceResolverSwitch() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasReferenceResolverSwitch();
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolverFactory getTokenResolverFactory() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "west.twouse.language.sparqlas/metamodel/sparqlas.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasParser(null).getTokenNames();
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasBracketPair> getBracketPairs() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasResourceFactory();
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasNewFileContentProvider getNewFileContentProvider() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasNewFileContentProvider();
	}
	
}
