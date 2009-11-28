/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration#getDatatypePropertyVariable <em>Datatype Property Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getDatatypePropertyDeclaration()
 * @model
 * @generated
 */
public interface DatatypePropertyDeclaration extends Declaration {
	/**
   * Returns the value of the '<em><b>Datatype Property Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype Property Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype Property Variable</em>' containment reference.
   * @see #setDatatypePropertyVariable(DataPropertyVariable)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getDatatypePropertyDeclaration_DatatypePropertyVariable()
   * @model containment="true" required="true"
   * @generated
   */
	DataPropertyVariable getDatatypePropertyVariable();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration#getDatatypePropertyVariable <em>Datatype Property Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype Property Variable</em>' containment reference.
   * @see #getDatatypePropertyVariable()
   * @generated
   */
	void setDatatypePropertyVariable(DataPropertyVariable value);

} // DatatypePropertyDeclaration
