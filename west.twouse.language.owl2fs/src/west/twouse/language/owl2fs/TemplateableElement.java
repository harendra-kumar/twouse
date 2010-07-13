/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.TemplateableElement#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getTemplateableElement()
 * @model
 * @generated
 */
public interface TemplateableElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Template Signature</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link west.twouse.language.owl2fs.TemplateSignature#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Template Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Template Signature</em>' containment reference.
   * @see #setOwnedTemplateSignature(TemplateSignature)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getTemplateableElement_OwnedTemplateSignature()
   * @see west.twouse.language.owl2fs.TemplateSignature#getTemplate
   * @model opposite="template" containment="true"
   * @generated
   */
  TemplateSignature getOwnedTemplateSignature();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Template Signature</em>' containment reference.
   * @see #getOwnedTemplateSignature()
   * @generated
   */
  void setOwnedTemplateSignature(TemplateSignature value);

  /**
   * Returns the value of the '<em><b>Template Binding</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.TemplateBinding}.
   * It is bidirectional and its opposite is '{@link west.twouse.language.owl2fs.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Binding</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Binding</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getTemplateableElement_TemplateBinding()
   * @see west.twouse.language.owl2fs.TemplateBinding#getBoundElement
   * @model opposite="boundElement" containment="true"
   * @generated
   */
  EList<TemplateBinding> getTemplateBinding();

} // TemplateableElement
