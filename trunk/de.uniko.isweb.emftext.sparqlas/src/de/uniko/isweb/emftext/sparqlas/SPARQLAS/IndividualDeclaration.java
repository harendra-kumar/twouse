/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration#getIndividualVariable <em>Individual Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getIndividualDeclaration()
 * @model
 * @generated
 */
public interface IndividualDeclaration extends Declaration {
	/**
   * Returns the value of the '<em><b>Individual Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Individual Variable</em>' containment reference.
   * @see #setIndividualVariable(IndividualVariable)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getIndividualDeclaration_IndividualVariable()
   * @model containment="true" required="true"
   * @generated
   */
	IndividualVariable getIndividualVariable();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration#getIndividualVariable <em>Individual Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Individual Variable</em>' containment reference.
   * @see #getIndividualVariable()
   * @generated
   */
	void setIndividualVariable(IndividualVariable value);

} // IndividualDeclaration
