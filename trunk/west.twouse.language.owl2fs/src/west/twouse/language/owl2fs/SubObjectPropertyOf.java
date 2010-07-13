/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Object Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.SubObjectPropertyOf#getSubObjectPropertyExpression <em>Sub Object Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getSubObjectPropertyOf()
 * @model
 * @generated
 */
public interface SubObjectPropertyOf extends ObjectPropertyAxiom
{
  /**
   * Returns the value of the '<em><b>Sub Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Object Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Object Property Expression</em>' containment reference.
   * @see #setSubObjectPropertyExpression(SubObjectPropertyExpression)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getSubObjectPropertyOf_SubObjectPropertyExpression()
   * @model containment="true" required="true"
   * @generated
   */
  SubObjectPropertyExpression getSubObjectPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.SubObjectPropertyOf#getSubObjectPropertyExpression <em>Sub Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Object Property Expression</em>' containment reference.
   * @see #getSubObjectPropertyExpression()
   * @generated
   */
  void setSubObjectPropertyExpression(SubObjectPropertyExpression value);

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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getSubObjectPropertyOf_SuperObjectPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ObjectPropertyExpression getSuperObjectPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Object Property Expression</em>' containment reference.
   * @see #getSuperObjectPropertyExpression()
   * @generated
   */
  void setSuperObjectPropertyExpression(ObjectPropertyExpression value);

} // SubObjectPropertyOf
