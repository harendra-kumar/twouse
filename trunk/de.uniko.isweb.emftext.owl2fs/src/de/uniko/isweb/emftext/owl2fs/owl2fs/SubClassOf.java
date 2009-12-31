/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Class Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf#getSubClassExpression <em>Sub Class Expression</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf#getSuperClassExpression <em>Super Class Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getSubClassOf()
 * @model
 * @generated
 */
public interface SubClassOf extends ClassAxiom
{
  /**
   * Returns the value of the '<em><b>Sub Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Class Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Class Expression</em>' containment reference.
   * @see #setSubClassExpression(ClassExpression)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getSubClassOf_SubClassExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ClassExpression getSubClassExpression();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf#getSubClassExpression <em>Sub Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Class Expression</em>' containment reference.
   * @see #getSubClassExpression()
   * @generated
   */
  void setSubClassExpression(ClassExpression value);

  /**
   * Returns the value of the '<em><b>Super Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Class Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Class Expression</em>' containment reference.
   * @see #setSuperClassExpression(ClassExpression)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getSubClassOf_SuperClassExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ClassExpression getSuperClassExpression();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf#getSuperClassExpression <em>Super Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Class Expression</em>' containment reference.
   * @see #getSuperClassExpression()
   * @generated
   */
  void setSuperClassExpression(ClassExpression value);

} // SubClassOf
