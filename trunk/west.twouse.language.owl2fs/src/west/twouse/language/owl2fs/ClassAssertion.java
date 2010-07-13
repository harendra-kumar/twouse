/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.ClassAssertion#getIndividual <em>Individual</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.ClassAssertion#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getClassAssertion()
 * @model
 * @generated
 */
public interface ClassAssertion extends Assertion
{
  /**
   * Returns the value of the '<em><b>Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Individual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Individual</em>' containment reference.
   * @see #setIndividual(NamedIndividual)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getClassAssertion_Individual()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  NamedIndividual getIndividual();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ClassAssertion#getIndividual <em>Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Individual</em>' containment reference.
   * @see #getIndividual()
   * @generated
   */
  void setIndividual(NamedIndividual value);

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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getClassAssertion_ClassExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ClassExpression getClassExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ClassAssertion#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
  void setClassExpression(ClassExpression value);

} // ClassAssertion
