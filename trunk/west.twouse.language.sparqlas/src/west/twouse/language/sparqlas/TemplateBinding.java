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
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.TemplateBinding#getBoundElement <em>Bound Element</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.TemplateBinding#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Substitution</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.TemplateParameterSubstitution}.
   * It is bidirectional and its opposite is '{@link west.twouse.language.sparqlas.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Substitution</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateBinding_ParameterSubstitution()
   * @see west.twouse.language.sparqlas.TemplateParameterSubstitution#getTemplateBinding
   * @model opposite="templateBinding" containment="true" required="true"
   * @generated
   */
  EList<TemplateParameterSubstitution> getParameterSubstitution();

  /**
   * Returns the value of the '<em><b>Bound Element</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link west.twouse.language.sparqlas.TemplateableElement#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound Element</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound Element</em>' container reference.
   * @see #setBoundElement(TemplateableElement)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateBinding_BoundElement()
   * @see west.twouse.language.sparqlas.TemplateableElement#getTemplateBinding
   * @model opposite="templateBinding" required="true" transient="false"
   * @generated
   */
  TemplateableElement getBoundElement();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.TemplateBinding#getBoundElement <em>Bound Element</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound Element</em>' container reference.
   * @see #getBoundElement()
   * @generated
   */
  void setBoundElement(TemplateableElement value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(TemplateSignature)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateBinding_Signature()
   * @model containment="true" required="true"
   * @generated
   */
  TemplateSignature getSignature();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.TemplateBinding#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(TemplateSignature value);

} // TemplateBinding
