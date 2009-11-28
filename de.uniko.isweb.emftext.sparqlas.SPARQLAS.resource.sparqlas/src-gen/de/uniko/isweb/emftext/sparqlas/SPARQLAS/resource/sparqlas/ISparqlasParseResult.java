/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas;

// An interface used to access the result of parsing a
// document.
public interface ISparqlasParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasCommand<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource>> getPostParseCommands();
}
