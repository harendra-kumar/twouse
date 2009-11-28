/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue#getLiteral <em>Literal</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getDataHasValue()
 * @model
 * @generated
 */
public interface DataHasValue extends ClassExpression {
	/**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(Literal)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getDataHasValue_Literal()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	Literal getLiteral();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
	void setLiteral(Literal value);

	/**
   * Returns the value of the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expression</em>' containment reference.
   * @see #setDataPropertyExpression(DataPropertyExpression)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getDataHasValue_DataPropertyExpression()
   * @model containment="true" required="true"
   * @generated
   */
	DataPropertyExpression getDataPropertyExpression();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue#getDataPropertyExpression <em>Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Property Expression</em>' containment reference.
   * @see #getDataPropertyExpression()
   * @generated
   */
	void setDataPropertyExpression(DataPropertyExpression value);

} // DataHasValue
