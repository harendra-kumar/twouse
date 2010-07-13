/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Has Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DataHasValue#getConstant <em>Constant</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DataHasValue#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataHasValue()
 * @model
 * @generated
 */
public interface DataHasValue extends ClassExpression, Expression
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(Literal)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataHasValue_Constant()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Literal getConstant();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataHasValue#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(Literal value);

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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataHasValue_DataPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  DataPropertyExpression getDataPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataHasValue#getDataPropertyExpression <em>Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Property Expression</em>' containment reference.
   * @see #getDataPropertyExpression()
   * @generated
   */
  void setDataPropertyExpression(DataPropertyExpression value);

} // DataHasValue
