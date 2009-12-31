/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

// A basic implementation of the ITokenResolveResult interface.
//
public class Owl2fsTokenResolveResult implements de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public Owl2fsTokenResolveResult() {
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
