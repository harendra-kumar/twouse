/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

public class Owl2fsProblem implements de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsProblem {
	
	private java.lang.String message;
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.Owl2fsEProblemType type;
	
	public Owl2fsProblem(java.lang.String message, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.Owl2fsEProblemType type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.Owl2fsEProblemType getType() {
		return type;
	}
	
	public java.lang.String getMessage() {
		return message;
	}
	
}
