/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.TemplateParameterSubstitution#getActual <em>Actual</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.TemplateParameterSubstitution#getFormal <em>Formal</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateParameterSubstitution()
 * @model
 * @generated
 */
public interface TemplateParameterSubstitution extends EObject
{
  /**
   * Returns the value of the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actual</em>' containment reference.
   * @see #setActual(ParameterableElement)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateParameterSubstitution_Actual()
   * @model containment="true" required="true"
   * @generated
   */
  ParameterableElement getActual();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.TemplateParameterSubstitution#getActual <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actual</em>' containment reference.
   * @see #getActual()
   * @generated
   */
  void setActual(ParameterableElement value);

  /**
   * Returns the value of the '<em><b>Template Binding</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link west.twouse.language.sparqlas.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Binding</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Binding</em>' container reference.
   * @see #setTemplateBinding(TemplateBinding)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateParameterSubstitution_TemplateBinding()
   * @see west.twouse.language.sparqlas.TemplateBinding#getParameterSubstitution
   * @model opposite="parameterSubstitution" required="true" transient="false"
   * @generated
   */
  TemplateBinding getTemplateBinding();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template Binding</em>' container reference.
   * @see #getTemplateBinding()
   * @generated
   */
  void setTemplateBinding(TemplateBinding value);

  /**
   * Returns the value of the '<em><b>Formal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal</em>' containment reference.
   * @see #setFormal(ParameterableElement)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateParameterSubstitution_Formal()
   * @model containment="true" required="true"
   * @generated
   */
  ParameterableElement getFormal();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.TemplateParameterSubstitution#getFormal <em>Formal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal</em>' containment reference.
   * @see #getFormal()
   * @generated
   */
  void setFormal(ParameterableElement value);

} // TemplateParameterSubstitution
