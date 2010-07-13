/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.TemplateParameterSubstitution#getActual <em>Actual</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.TemplateParameterSubstitution#getFormal <em>Formal</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getTemplateParameterSubstitution()
 * @model
 * @generated
 */
public interface TemplateParameterSubstitution extends EObject
{
  /**
   * Returns the value of the '<em><b>Actual</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual</em>' reference.
   * @see #setActual(ParameterableElement)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getTemplateParameterSubstitution_Actual()
   * @model required="true"
   * @generated
   */
  ParameterableElement getActual();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.TemplateParameterSubstitution#getActual <em>Actual</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual</em>' reference.
   * @see #getActual()
   * @generated
   */
  void setActual(ParameterableElement value);

  /**
   * Returns the value of the '<em><b>Formal</b></em>' reference.
   * It is bidirectional and its opposite is '{@link west.twouse.language.owl2fs.TemplateParameter#getParameterSubstitution <em>Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal</em>' reference.
   * @see #setFormal(TemplateParameter)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getTemplateParameterSubstitution_Formal()
   * @see west.twouse.language.owl2fs.TemplateParameter#getParameterSubstitution
   * @model opposite="parameterSubstitution" required="true"
   * @generated
   */
  TemplateParameter getFormal();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.TemplateParameterSubstitution#getFormal <em>Formal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal</em>' reference.
   * @see #getFormal()
   * @generated
   */
  void setFormal(TemplateParameter value);

  /**
   * Returns the value of the '<em><b>Template Binding</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link west.twouse.language.owl2fs.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Binding</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Binding</em>' container reference.
   * @see #setTemplateBinding(TemplateBinding)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getTemplateParameterSubstitution_TemplateBinding()
   * @see west.twouse.language.owl2fs.TemplateBinding#getParameterSubstitution
   * @model opposite="parameterSubstitution" required="true" transient="false"
   * @generated
   */
  TemplateBinding getTemplateBinding();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template Binding</em>' container reference.
   * @see #getTemplateBinding()
   * @generated
   */
  void setTemplateBinding(TemplateBinding value);

} // TemplateParameterSubstitution
