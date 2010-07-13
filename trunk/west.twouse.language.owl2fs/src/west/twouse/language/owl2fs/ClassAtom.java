/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.ClassAtom#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.ClassAtom#getIArg <em>IArg</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getClassAtom()
 * @model
 * @generated
 */
public interface ClassAtom extends Atom, DGAtom
{
  /**
   * Returns the value of the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Expression</em>' containment reference.
   * @see #setClassExpression(ClassExpression)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getClassAtom_ClassExpression()
   * @model containment="true" required="true"
   * @generated
   */
  ClassExpression getClassExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ClassAtom#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
  void setClassExpression(ClassExpression value);

  /**
   * Returns the value of the '<em><b>IArg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IArg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IArg</em>' containment reference.
   * @see #setIArg(IArg)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getClassAtom_IArg()
   * @model containment="true" required="true"
   * @generated
   */
  IArg getIArg();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ClassAtom#getIArg <em>IArg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IArg</em>' containment reference.
   * @see #getIArg()
   * @generated
   */
  void setIArg(IArg value);

} // ClassAtom
