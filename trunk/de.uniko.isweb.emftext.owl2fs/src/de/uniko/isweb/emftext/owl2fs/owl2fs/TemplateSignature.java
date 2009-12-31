/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateSignature()
 * @model
 * @generated
 */
public interface TemplateSignature extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateSignature_Parameter()
   * @model required="true"
   * @generated
   */
  EList<TemplateParameter> getParameter();

  /**
   * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter}.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Parameter</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateSignature_OwnedParameter()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getSignature
   * @model opposite="signature" containment="true"
   * @generated
   */
  EList<TemplateParameter> getOwnedParameter();

  /**
   * Returns the value of the '<em><b>Template</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' container reference.
   * @see #setTemplate(TemplateableElement)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateSignature_Template()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement#getOwnedTemplateSignature
   * @model opposite="ownedTemplateSignature" required="true" transient="false"
   * @generated
   */
  TemplateableElement getTemplate();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getTemplate <em>Template</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' container reference.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(TemplateableElement value);

} // TemplateSignature
