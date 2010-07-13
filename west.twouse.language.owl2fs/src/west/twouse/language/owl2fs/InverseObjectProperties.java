/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Object Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.InverseObjectProperties#getObjectPropertyExpression1 <em>Object Property Expression1</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.InverseObjectProperties#getObjectPropertyExpression2 <em>Object Property Expression2</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getInverseObjectProperties()
 * @model
 * @generated
 */
public interface InverseObjectProperties extends ObjectPropertyAxiom
{
  /**
   * Returns the value of the '<em><b>Object Property Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property Expression1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression1</em>' containment reference.
   * @see #setObjectPropertyExpression1(ObjectPropertyExpression)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getInverseObjectProperties_ObjectPropertyExpression1()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression1();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.InverseObjectProperties#getObjectPropertyExpression1 <em>Object Property Expression1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression1</em>' containment reference.
   * @see #getObjectPropertyExpression1()
   * @generated
   */
  void setObjectPropertyExpression1(ObjectPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Object Property Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property Expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression2</em>' containment reference.
   * @see #setObjectPropertyExpression2(ObjectPropertyExpression)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getInverseObjectProperties_ObjectPropertyExpression2()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression2();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.InverseObjectProperties#getObjectPropertyExpression2 <em>Object Property Expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression2</em>' containment reference.
   * @see #getObjectPropertyExpression2()
   * @generated
   */
  void setObjectPropertyExpression2(ObjectPropertyExpression value);

} // InverseObjectProperties
