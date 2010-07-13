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
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.TemplateParameter#getSignature <em>Signature</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.TemplateParameter#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.TemplateParameter#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateParameter()
 * @model
 * @generated
 */
public interface TemplateParameter extends EObject {
	/**
   * Returns the value of the '<em><b>Signature</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link west.twouse.language.sparqlas.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' container reference.
   * @see #setSignature(TemplateSignature)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateParameter_Signature()
   * @see west.twouse.language.sparqlas.TemplateSignature#getOwnedParameter
   * @model opposite="ownedParameter" required="true" transient="false"
   * @generated
   */
	TemplateSignature getSignature();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.TemplateParameter#getSignature <em>Signature</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' container reference.
   * @see #getSignature()
   * @generated
   */
	void setSignature(TemplateSignature value);

	/**
   * Returns the value of the '<em><b>Parametered Element</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link west.twouse.language.sparqlas.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametered Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parametered Element</em>' containment reference.
   * @see #setParameteredElement(ParameterableElement)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateParameter_ParameteredElement()
   * @see west.twouse.language.sparqlas.ParameterableElement#getTemplateParameter
   * @model opposite="templateParameter" containment="true" required="true"
   * @generated
   */
	ParameterableElement getParameteredElement();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.TemplateParameter#getParameteredElement <em>Parametered Element</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parametered Element</em>' containment reference.
   * @see #getParameteredElement()
   * @generated
   */
	void setParameteredElement(ParameterableElement value);

	/**
   * Returns the value of the '<em><b>Parameter Substitution</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Substitution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Substitution</em>' reference.
   * @see #setParameterSubstitution(TemplateParameterSubstitution)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getTemplateParameter_ParameterSubstitution()
   * @model required="true"
   * @generated
   */
	TemplateParameterSubstitution getParameterSubstitution();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.TemplateParameter#getParameterSubstitution <em>Parameter Substitution</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Substitution</em>' reference.
   * @see #getParameterSubstitution()
   * @generated
   */
	void setParameterSubstitution(TemplateParameterSubstitution value);

} // TemplateParameter
