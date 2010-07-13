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
 * A representation of the model object '<em><b>Disjoint Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DisjointUnion#getUnionClass <em>Union Class</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DisjointUnion#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDisjointUnion()
 * @model
 * @generated
 */
public interface DisjointUnion extends ClassAxiom
{
  /**
   * Returns the value of the '<em><b>Union Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Union Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Union Class</em>' containment reference.
   * @see #setUnionClass(west.twouse.language.owl2fs.Class)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDisjointUnion_UnionClass()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  west.twouse.language.owl2fs.Class getUnionClass();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DisjointUnion#getUnionClass <em>Union Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Union Class</em>' containment reference.
   * @see #getUnionClass()
   * @generated
   */
  void setUnionClass(west.twouse.language.owl2fs.Class value);

  /**
   * Returns the value of the '<em><b>Disjoint Class Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.ClassExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disjoint Class Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disjoint Class Expressions</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDisjointUnion_DisjointClassExpressions()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<ClassExpression> getDisjointClassExpressions();

} // DisjointUnion
