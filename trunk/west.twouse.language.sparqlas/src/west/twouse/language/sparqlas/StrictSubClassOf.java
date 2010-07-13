/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strict Sub Class Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.StrictSubClassOf#getSubClassExpression <em>Sub Class Expression</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.StrictSubClassOf#getSuperClassExpression <em>Super Class Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getStrictSubClassOf()
 * @model
 * @generated
 */
public interface StrictSubClassOf extends ClassAtom
{
  /**
   * Returns the value of the '<em><b>Sub Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Class Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Class Expression</em>' containment reference.
   * @see #setSubClassExpression(ClassExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getStrictSubClassOf_SubClassExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ClassExpression getSubClassExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.StrictSubClassOf#getSubClassExpression <em>Sub Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Class Expression</em>' containment reference.
   * @see #getSubClassExpression()
   * @generated
   */
  void setSubClassExpression(ClassExpression value);

  /**
   * Returns the value of the '<em><b>Super Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Class Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Class Expression</em>' containment reference.
   * @see #setSuperClassExpression(ClassExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getStrictSubClassOf_SuperClassExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ClassExpression getSuperClassExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.StrictSubClassOf#getSuperClassExpression <em>Super Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Class Expression</em>' containment reference.
   * @see #getSuperClassExpression()
   * @generated
   */
  void setSuperClassExpression(ClassExpression value);

} // StrictSubClassOf
