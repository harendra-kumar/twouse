/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.ObjectPropertyAtom#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.ObjectPropertyAtom#getIArg1 <em>IArg1</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.ObjectPropertyAtom#getIArg2 <em>IArg2</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectPropertyAtom()
 * @model
 * @generated
 */
public interface ObjectPropertyAtom extends Atom, DGAtom
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectPropertyAtom_ObjectPropertyExpression()
   * @model containment="true" required="true"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ObjectPropertyAtom#getObjectPropertyExpression <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression</em>' containment reference.
   * @see #getObjectPropertyExpression()
   * @generated
   */
  void setObjectPropertyExpression(ObjectPropertyExpression value);

  /**
   * Returns the value of the '<em><b>IArg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IArg1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IArg1</em>' containment reference.
   * @see #setIArg1(IArg)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectPropertyAtom_IArg1()
   * @model containment="true" required="true"
   * @generated
   */
  IArg getIArg1();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ObjectPropertyAtom#getIArg1 <em>IArg1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IArg1</em>' containment reference.
   * @see #getIArg1()
   * @generated
   */
  void setIArg1(IArg value);

  /**
   * Returns the value of the '<em><b>IArg2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IArg2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IArg2</em>' containment reference.
   * @see #setIArg2(IArg)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectPropertyAtom_IArg2()
   * @model containment="true" required="true"
   * @generated
   */
  IArg getIArg2();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ObjectPropertyAtom#getIArg2 <em>IArg2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IArg2</em>' containment reference.
   * @see #getIArg2()
   * @generated
   */
  void setIArg2(IArg value);

} // ObjectPropertyAtom
