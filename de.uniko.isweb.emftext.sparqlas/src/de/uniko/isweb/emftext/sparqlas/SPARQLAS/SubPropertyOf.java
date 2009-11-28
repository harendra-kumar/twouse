/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf#getSubObjectPropertyExpression <em>Sub Object Property Expression</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getSubPropertyOf()
 * @model
 * @generated
 */
public interface SubPropertyOf extends ObjectPropertyAtom {
	/**
   * Returns the value of the '<em><b>Sub Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Object Property Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Object Property Expression</em>' containment reference.
   * @see #setSubObjectPropertyExpression(ObjectPropertyExpression)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getSubPropertyOf_SubObjectPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	ObjectPropertyExpression getSubObjectPropertyExpression();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf#getSubObjectPropertyExpression <em>Sub Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Object Property Expression</em>' containment reference.
   * @see #getSubObjectPropertyExpression()
   * @generated
   */
	void setSubObjectPropertyExpression(ObjectPropertyExpression value);

	/**
   * Returns the value of the '<em><b>Super Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Object Property Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Super Object Property Expression</em>' containment reference.
   * @see #setSuperObjectPropertyExpression(ObjectPropertyExpression)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getSubPropertyOf_SuperObjectPropertyExpression()
   * @model containment="true" required="true"
   * @generated
   */
	ObjectPropertyExpression getSuperObjectPropertyExpression();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Object Property Expression</em>' containment reference.
   * @see #getSuperObjectPropertyExpression()
   * @generated
   */
	void setSuperObjectPropertyExpression(ObjectPropertyExpression value);

} // SubPropertyOf
