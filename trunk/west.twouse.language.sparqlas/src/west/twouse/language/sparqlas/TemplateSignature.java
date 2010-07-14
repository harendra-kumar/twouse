/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

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
 *   <li>{@link west.twouse.language.sparqlas.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.TemplateSignature#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateSignature()
 * @model
 * @generated
 */
public interface TemplateSignature extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.TemplateParameter}.
   * It is bidirectional and its opposite is '{@link west.twouse.language.sparqlas.TemplateParameter#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Parameter</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateSignature_OwnedParameter()
   * @see west.twouse.language.sparqlas.TemplateParameter#getSignature
   * @model opposite="signature" containment="true" required="true"
   * @generated
   */
  EList<TemplateParameter> getOwnedParameter();

  /**
   * Returns the value of the '<em><b>Template</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link west.twouse.language.sparqlas.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' container reference.
   * @see #setTemplate(TemplateableElement)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateSignature_Template()
   * @see west.twouse.language.sparqlas.TemplateableElement#getOwnedTemplateSignature
   * @model opposite="ownedTemplateSignature" required="true" transient="false"
   * @generated
   */
  TemplateableElement getTemplate();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.TemplateSignature#getTemplate <em>Template</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' container reference.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(TemplateableElement value);

} // TemplateSignature
