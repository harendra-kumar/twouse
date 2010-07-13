/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.HasKey#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.HasKey#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.HasKey#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getHasKey()
 * @model
 * @generated
 */
public interface HasKey extends Axiom, AnnotationAxiom
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getHasKey_ClassExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ClassExpression getClassExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.HasKey#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
  void setClassExpression(ClassExpression value);

  /**
   * Returns the value of the '<em><b>Object Property Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.ObjectPropertyExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expressions</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getHasKey_ObjectPropertyExpressions()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<ObjectPropertyExpression> getObjectPropertyExpressions();

  /**
   * Returns the value of the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.DataPropertyExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Property Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expressions</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getHasKey_DataPropertyExpressions()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<DataPropertyExpression> getDataPropertyExpressions();

} // HasKey
