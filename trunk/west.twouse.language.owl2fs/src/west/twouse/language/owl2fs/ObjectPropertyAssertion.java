/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.ObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectPropertyAssertion()
 * @model
 * @generated
 */
public interface ObjectPropertyAssertion extends Assertion
{
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectPropertyAssertion_ObjectPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression</em>' containment reference.
   * @see #getObjectPropertyExpression()
   * @generated
   */
  void setObjectPropertyExpression(ObjectPropertyExpression value);

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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectPropertyAssertion_SourceIndividual()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Individual getSourceIndividual();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}' containment reference.
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectPropertyAssertion_TargetIndividual()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Individual getTargetIndividual();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Individual</em>' containment reference.
   * @see #getTargetIndividual()
   * @generated
   */
  void setTargetIndividual(Individual value);

} // ObjectPropertyAssertion
