/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration#getObjectPropertyVariable <em>Object Property Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getObjectPropertyDeclaration()
 * @model
 * @generated
 */
public interface ObjectPropertyDeclaration extends Declaration {
	/**
   * Returns the value of the '<em><b>Object Property Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Variable</em>' containment reference.
   * @see #setObjectPropertyVariable(ObjectPropertyVariable)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getObjectPropertyDeclaration_ObjectPropertyVariable()
   * @model containment="true" required="true"
   * @generated
   */
	ObjectPropertyVariable getObjectPropertyVariable();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration#getObjectPropertyVariable <em>Object Property Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Variable</em>' containment reference.
   * @see #getObjectPropertyVariable()
   * @generated
   */
	void setObjectPropertyVariable(ObjectPropertyVariable value);

} // ObjectPropertyDeclaration
