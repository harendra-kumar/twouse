/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DataPropertyAssertion#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataPropertyAssertion()
 * @model
 * @generated
 */
public interface DataPropertyAssertion extends Assertion
{
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataPropertyAssertion_DataPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  DataPropertyExpression getDataPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Property Expression</em>' containment reference.
   * @see #getDataPropertyExpression()
   * @generated
   */
  void setDataPropertyExpression(DataPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Target Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Value</em>' containment reference.
   * @see #setTargetValue(Literal)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataPropertyAssertion_TargetValue()
   * @model containment="true" required="true"
   * @generated
   */
  Literal getTargetValue();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataPropertyAssertion#getTargetValue <em>Target Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Value</em>' containment reference.
   * @see #getTargetValue()
   * @generated
   */
  void setTargetValue(Literal value);

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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataPropertyAssertion_SourceIndividual()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Individual getSourceIndividual();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Individual</em>' containment reference.
   * @see #getSourceIndividual()
   * @generated
   */
  void setSourceIndividual(Individual value);

} // DataPropertyAssertion
