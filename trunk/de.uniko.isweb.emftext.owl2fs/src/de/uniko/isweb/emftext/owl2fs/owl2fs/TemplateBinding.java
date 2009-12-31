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
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getBoundElement <em>Bound Element</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Substitution</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution}.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Substitution</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateBinding_ParameterSubstitution()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution#getTemplateBinding
   * @model opposite="templateBinding" containment="true"
   * @generated
   */
  EList<TemplateParameterSubstitution> getParameterSubstitution();

  /**
   * Returns the value of the '<em><b>Bound Element</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound Element</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound Element</em>' container reference.
   * @see #setBoundElement(TemplateableElement)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateBinding_BoundElement()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement#getTemplateBinding
   * @model opposite="templateBinding" required="true" transient="false"
   * @generated
   */
  TemplateableElement getBoundElement();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getBoundElement <em>Bound Element</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound Element</em>' container reference.
   * @see #getBoundElement()
   * @generated
   */
  void setBoundElement(TemplateableElement value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' reference.
   * @see #setSignature(TemplateSignature)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getTemplateBinding_Signature()
   * @model required="true"
   * @generated
   */
  TemplateSignature getSignature();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getSignature <em>Signature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(TemplateSignature value);

} // TemplateBinding
