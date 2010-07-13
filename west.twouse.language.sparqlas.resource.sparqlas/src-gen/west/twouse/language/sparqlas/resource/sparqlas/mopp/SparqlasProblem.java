/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasProblem implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasProblem {
	
	private java.lang.String message;
	private west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType type;
	
	public SparqlasProblem(java.lang.String message, west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
