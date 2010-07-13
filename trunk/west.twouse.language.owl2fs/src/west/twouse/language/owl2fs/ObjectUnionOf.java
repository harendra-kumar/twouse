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
 * A representation of the model object '<em><b>Object Union Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.ObjectUnionOf#getClassExpressions <em>Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectUnionOf()
 * @model
 * @generated
 */
public interface ObjectUnionOf extends ClassExpression, Expression
{
  /**
   * Returns the value of the '<em><b>Class Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.ClassExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Expressions</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectUnionOf_ClassExpressions()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<ClassExpression> getClassExpressions();

} // ObjectUnionOf
