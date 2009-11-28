/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

public class SparqlasProblem implements de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasProblem {
	
	private java.lang.String message;
	private de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.SparqlasEProblemType type;
	
	public SparqlasProblem(java.lang.String message, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.SparqlasEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.SparqlasEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
