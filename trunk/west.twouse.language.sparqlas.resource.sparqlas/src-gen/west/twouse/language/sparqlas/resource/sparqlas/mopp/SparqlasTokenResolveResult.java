/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

// A basic implementation of the ITokenResolveResult interface.
//
public class SparqlasTokenResolveResult implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public SparqlasTokenResolveResult() {
		super();
		clear();
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Object getResolvedToken() {
		return resolvedToken;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void setResolvedToken(Object resolvedToken) {
		this.resolvedToken = resolvedToken;
	}
	
	public void clear() {
		errorMessage = "Can't resolve token.";
		resolvedToken = null;
	}
}
