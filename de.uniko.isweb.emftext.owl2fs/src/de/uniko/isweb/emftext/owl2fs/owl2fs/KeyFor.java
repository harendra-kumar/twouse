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
 * A representation of the model object '<em><b>Key For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getKeyFor()
 * @model
 * @generated
 */
public interface KeyFor extends ObjectAndDataPropertyAxiom
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
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getKeyFor_ClassExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ClassExpression getClassExpression();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
  void setClassExpression(ClassExpression value);

  /**
   * Returns the value of the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Property Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expressions</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getKeyFor_DataPropertyExpressions()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<DataPropertyExpression> getDataPropertyExpressions();

  /**
   * Returns the value of the '<em><b>Object Property Expressions</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expressions</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getKeyFor_ObjectPropertyExpressions()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<ObjectPropertyExpression> getObjectPropertyExpressions();

} // KeyFor
