/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Object Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf#getSubObjectPropertyExpressions <em>Sub Object Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getSubObjectPropertyOf()
 * @model
 * @generated
 */
public interface SubObjectPropertyOf extends ObjectPropertyAxiom
{
  /**
   * Returns the value of the '<em><b>Super Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Object Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Object Property Expression</em>' containment reference.
   * @see #setSuperObjectPropertyExpression(ObjectPropertyExpression)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getSubObjectPropertyOf_SuperObjectPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ObjectPropertyExpression getSuperObjectPropertyExpression();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Object Property Expression</em>' containment reference.
   * @see #getSuperObjectPropertyExpression()
   * @generated
   */
  void setSuperObjectPropertyExpression(ObjectPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Sub Object Property Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Object Property Expressions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Object Property Expressions</em>' containment reference.
   * @see #setSubObjectPropertyExpressions(ObjectPropertyExpression)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getSubObjectPropertyOf_SubObjectPropertyExpressions()
   * @model containment="true" required="true"
   * @generated
   */
  ObjectPropertyExpression getSubObjectPropertyExpressions();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf#getSubObjectPropertyExpressions <em>Sub Object Property Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Object Property Expressions</em>' containment reference.
   * @see #getSubObjectPropertyExpressions()
   * @generated
   */
  void setSubObjectPropertyExpressions(ObjectPropertyExpression value);

} // SubObjectPropertyOf
