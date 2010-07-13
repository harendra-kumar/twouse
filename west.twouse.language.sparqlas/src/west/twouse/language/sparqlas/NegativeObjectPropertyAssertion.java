/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getNegativeObjectPropertyAssertion()
 * @model
 * @generated
 */
public interface NegativeObjectPropertyAssertion extends Assertion {
	/**
   * Returns the value of the '<em><b>Source Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Individual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Source Individual</em>' containment reference.
   * @see #setSourceIndividual(Individual)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getNegativeObjectPropertyAssertion_SourceIndividual()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	Individual getSourceIndividual();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Individual</em>' containment reference.
   * @see #getSourceIndividual()
   * @generated
   */
	void setSourceIndividual(Individual value);

	/**
   * Returns the value of the '<em><b>Target Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Individual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Target Individual</em>' containment reference.
   * @see #setTargetIndividual(Individual)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getNegativeObjectPropertyAssertion_TargetIndividual()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	Individual getTargetIndividual();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Individual</em>' containment reference.
   * @see #getTargetIndividual()
   * @generated
   */
	void setTargetIndividual(Individual value);

	/**
   * Returns the value of the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression</em>' containment reference.
   * @see #setObjectPropertyExpression(ObjectPropertyExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getNegativeObjectPropertyAssertion_ObjectPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	ObjectPropertyExpression getObjectPropertyExpression();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression</em>' containment reference.
   * @see #getObjectPropertyExpression()
   * @generated
   */
	void setObjectPropertyExpression(ObjectPropertyExpression value);

} // NegativeObjectPropertyAssertion
