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
 * A representation of the model object '<em><b>Disjoint Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.DisjointUnion#getClass_ <em>Class</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.DisjointUnion#getClassVariable <em>Class Variable</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.DisjointUnion#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getDisjointUnion()
 * @model
 * @generated
 */
public interface DisjointUnion extends ClassAtom
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(west.twouse.language.sparqlas.Class)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDisjointUnion_Class()
   * @model containment="true"
   * @generated
   */
  west.twouse.language.sparqlas.Class getClass_();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.DisjointUnion#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(west.twouse.language.sparqlas.Class value);

  /**
   * Returns the value of the '<em><b>Class Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Variable</em>' containment reference.
   * @see #setClassVariable(ClassVariable)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDisjointUnion_ClassVariable()
   * @model containment="true"
   * @generated
   */
  ClassVariable getClassVariable();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.DisjointUnion#getClassVariable <em>Class Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Variable</em>' containment reference.
   * @see #getClassVariable()
   * @generated
   */
  void setClassVariable(ClassVariable value);

  /**
   * Returns the value of the '<em><b>Disjoint Class Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.ClassExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disjoint Class Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disjoint Class Expressions</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDisjointUnion_DisjointClassExpressions()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<ClassExpression> getDisjointClassExpressions();

} // DisjointUnion
