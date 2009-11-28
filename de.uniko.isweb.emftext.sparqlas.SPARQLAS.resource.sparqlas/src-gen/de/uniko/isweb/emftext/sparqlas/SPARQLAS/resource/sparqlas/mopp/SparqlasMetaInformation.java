/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

public class SparqlasMetaInformation implements de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasMetaInformation {
	
	public java.lang.String getSyntaxName() {
		return "sparqlas";
	}
	
	public java.lang.String getURI() {
		return "http://west.uni-koblenz.de/SPARQLAS";
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextScanner createLexer() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasAntlrScanner(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasLexer());
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextParser createParser(java.io.InputStream inputStream, java.lang.String encoding) {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasParser().createInstance(inputStream, encoding);
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextPrinter createPrinter(java.io.OutputStream outputStream, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource resource) {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasPrinter(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasReferenceResolverSwitch getReferenceResolverSwitch() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasReferenceResolverSwitch();
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolverFactory getTokenResolverFactory() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTokenResolverFactory();
	}
	
	public java.lang.String getPathToCSDefinition() {
		return "de.uniko.isweb.emftext.sparqlas/metamodel/SPARQLAS.cs";
	}
	
	public java.lang.String[] getTokenNames() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasParser(null).getTokenNames();
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasBracketPair> getBracketPairs() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasFoldingInformationProvider().getFoldableClasses();
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasHoverTextProvider getHoverTextProvider() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasHoverTextProvider();
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasColorManager createColorManager() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasColorManager();
	}
	
	public org.eclipse.jface.text.rules.ITokenScanner createTokenScanner(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasColorManager colorManager) {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ui.SparqlasTokenScanner(colorManager);
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasResourceFactory();
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasNewFileContentProvider getNewFileContentProvider() {
		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasNewFileContentProvider();
	}
	
}
