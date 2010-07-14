/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Intersection Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.ObjectIntersectionOf#getClassExpressions <em>Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getObjectIntersectionOf()
 * @model
 * @generated
 */
public interface ObjectIntersectionOf extends ClassExpression
{
  /**
   * Returns the value of the '<em><b>Class Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.ClassExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Expressions</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getObjectIntersectionOf_ClassExpressions()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<ClassExpression> getClassExpressions();

} // ObjectIntersectionOf