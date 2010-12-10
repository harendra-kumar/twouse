/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlMetaInformation implements west.twouse.language.yuml.resource.yuml.IYumlMetaInformation {
	
	public String getSyntaxName() {
		return "yuml";
	}
	
	public String getURI() {
		return "http://west.uni-koblenz.de/softwareweb/yuml";
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTextScanner createLexer() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlAntlrScanner(new west.twouse.language.yuml.resource.yuml.mopp.YumlLexer());
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlParser().createInstance(inputStream, encoding);
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTextPrinter createPrinter(java.io.OutputStream outputStream, west.twouse.language.yuml.resource.yuml.IYumlTextResource resource) {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlReferenceResolverSwitch getReferenceResolverSwitch() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlReferenceResolverSwitch();
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTokenResolverFactory getTokenResolverFactory() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "west.twouse.language.yuml/metamodel/yuml.cs";
	}
	
	public String[] getTokenNames() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlParser(null).getTokenNames();
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTokenStyle getDefaultTokenStyle(String tokenName) {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlBracketPair> getBracketPairs() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlResourceFactory();
	}
	
	public west.twouse.language.yuml.resource.yuml.mopp.YumlNewFileContentProvider getNewFileContentProvider() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlNewFileContentProvider();
	}
	
}
