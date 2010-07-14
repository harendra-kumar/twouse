/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Data Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.SubDataPropertyOf#getSubDataPropertyExpression <em>Sub Data Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.SubDataPropertyOf#getSuperDataPropertyExpression <em>Super Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getSubDataPropertyOf()
 * @model
 * @generated
 */
public interface SubDataPropertyOf extends DataPropertyAtom
{
  /**
   * Returns the value of the '<em><b>Sub Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Data Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Data Property Expression</em>' containment reference.
   * @see #setSubDataPropertyExpression(DataPropertyExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getSubDataPropertyOf_SubDataPropertyExpression()
   * @model containment="true" required="true"
   * @generated
   */
  DataPropertyExpression getSubDataPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.SubDataPropertyOf#getSubDataPropertyExpression <em>Sub Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Data Property Expression</em>' containment reference.
   * @see #getSubDataPropertyExpression()
   * @generated
   */
  void setSubDataPropertyExpression(DataPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Super Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Data Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Data Property Expression</em>' containment reference.
   * @see #setSuperDataPropertyExpression(DataPropertyExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getSubDataPropertyOf_SuperDataPropertyExpression()
   * @model containment="true" required="true"
   * @generated
   */
  DataPropertyExpression getSuperDataPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.SubDataPropertyOf#getSuperDataPropertyExpression <em>Super Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Data Property Expression</em>' containment reference.
   * @see #getSuperDataPropertyExpression()
   * @generated
   */
  void setSuperDataPropertyExpression(DataPropertyExpression value);

} // SubDataPropertyOf
