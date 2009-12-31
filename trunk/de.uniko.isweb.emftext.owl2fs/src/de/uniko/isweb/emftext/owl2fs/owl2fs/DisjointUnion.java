/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjoint Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion#getUnionClass <em>Union Class</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDisjointUnion()
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
   * @see #setUnionClass(de.uniko.isweb.emftext.owl2fs.owl2fs.Class)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDisjointUnion_UnionClass()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  de.uniko.isweb.emftext.owl2fs.owl2fs.Class getUnionClass();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion#getUnionClass <em>Union Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Union Class</em>' containment reference.
   * @see #getUnionClass()
   * @generated
   */
  void setUnionClass(de.uniko.isweb.emftext.owl2fs.owl2fs.Class value);

  /**
   * Returns the value of the '<em><b>Disjoint Class Expressions</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disjoint Class Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disjoint Class Expressions</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDisjointUnion_DisjointClassExpressions()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<ClassExpression> getDisjointClassExpressions();

} // DisjointUnion
