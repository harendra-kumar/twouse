/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas;

// A text parser parses a text into a tree of <code>EObject</code>s.
// It is associated with a <code>TextResource</code>.
public interface ISparqlasTextParser extends west.twouse.language.sparqlas.resource.sparqlas.ISparqlasConfigurable {
	
	// Parses the content given to the parser and create a tree
	// of EObjects. The root of this tree is wrapped together
	// with some commands that might be executed after parsing.
	//
	// @return the result of the parse process
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasParseResult parse();
	
	// Parses the document and returns a list of expected elements.
	// Each expected element covers a range in the input stream.
	//
	// If the parser implementation can not determine expected
	// elements null can be returned.
	// This method is used by the code completion to figure out
	// which proposals can be shown to users for a given cursor
	// position.
	//
	// The class 'type' is used as start symbol.
	public java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource dummyResource);
	
	// Signals the parse to terminates the parsing as soon as possible.
	public void terminate();
}
