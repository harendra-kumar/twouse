/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration#getClassVariable <em>Class Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getClassDeclaration()
 * @model
 * @generated
 */
public interface ClassDeclaration extends Declaration {
	/**
   * Returns the value of the '<em><b>Class Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Class Variable</em>' containment reference.
   * @see #setClassVariable(ClassVariable)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getClassDeclaration_ClassVariable()
   * @model containment="true" required="true"
   * @generated
   */
	ClassVariable getClassVariable();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration#getClassVariable <em>Class Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Variable</em>' containment reference.
   * @see #getClassVariable()
   * @generated
   */
	void setClassVariable(ClassVariable value);

} // ClassDeclaration
