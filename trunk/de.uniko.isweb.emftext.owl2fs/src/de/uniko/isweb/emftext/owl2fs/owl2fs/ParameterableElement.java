/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getParameterableElement()
 * @model
 * @generated
 */
public interface ParameterableElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Owning Template Parameter</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owning Template Parameter</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owning Template Parameter</em>' container reference.
   * @see #setOwningTemplateParameter(TemplateParameter)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getParameterableElement_OwningTemplateParameter()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getOwnedParameteredElement
   * @model opposite="ownedParameteredElement" transient="false"
   * @generated
   */
  TemplateParameter getOwningTemplateParameter();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owning Template Parameter</em>' container reference.
   * @see #getOwningTemplateParameter()
   * @generated
   */
  void setOwningTemplateParameter(TemplateParameter value);

  /**
   * Returns the value of the '<em><b>Template Parameter</b></em>' reference.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Parameter</em>' reference.
   * @see #setTemplateParameter(TemplateParameter)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getParameterableElement_TemplateParameter()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getParameteredElement
   * @model opposite="parameteredElement"
   * @generated
   */
  TemplateParameter getTemplateParameter();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template Parameter</em>' reference.
   * @see #getTemplateParameter()
   * @generated
   */
  void setTemplateParameter(TemplateParameter value);

} // ParameterableElement
