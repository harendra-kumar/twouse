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
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getSignature <em>Signature</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getParameteredElement <em>Parametered Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateParameter()
 * @model
 * @generated
 */
public interface TemplateParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Parametered Element</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Parametered Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Parametered Element</em>' containment reference.
   * @see #setOwnedParameteredElement(ParameterableElement)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateParameter_OwnedParameteredElement()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getOwningTemplateParameter
   * @model opposite="owningTemplateParameter" containment="true"
   * @generated
   */
  ParameterableElement getOwnedParameteredElement();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Parametered Element</em>' containment reference.
   * @see #getOwnedParameteredElement()
   * @generated
   */
  void setOwnedParameteredElement(ParameterableElement value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' container reference.
   * @see #setSignature(TemplateSignature)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateParameter_Signature()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getOwnedParameter
   * @model opposite="ownedParameter" required="true" transient="false"
   * @generated
   */
  TemplateSignature getSignature();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getSignature <em>Signature</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' container reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(TemplateSignature value);

  /**
   * Returns the value of the '<em><b>Parametered Element</b></em>' reference.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parametered Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametered Element</em>' reference.
   * @see #setParameteredElement(ParameterableElement)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateParameter_ParameteredElement()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getTemplateParameter
   * @model opposite="templateParameter" required="true"
   * @generated
   */
  ParameterableElement getParameteredElement();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getParameteredElement <em>Parametered Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parametered Element</em>' reference.
   * @see #getParameteredElement()
   * @generated
   */
  void setParameteredElement(ParameterableElement value);

} // TemplateParameter
