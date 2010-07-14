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
 * A representation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getParameterableElement()
 * @model abstract="true"
 * @generated
 */
public interface ParameterableElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Template Parameter</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link west.twouse.language.sparqlas.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Parameter</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Parameter</em>' container reference.
   * @see #setTemplateParameter(TemplateParameter)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getParameterableElement_TemplateParameter()
   * @see west.twouse.language.sparqlas.TemplateParameter#getParameteredElement
   * @model opposite="parameteredElement" transient="false"
   * @generated
   */
  TemplateParameter getTemplateParameter();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template Parameter</em>' container reference.
   * @see #getTemplateParameter()
   * @generated
   */
  void setTemplateParameter(TemplateParameter value);

} // ParameterableElement
