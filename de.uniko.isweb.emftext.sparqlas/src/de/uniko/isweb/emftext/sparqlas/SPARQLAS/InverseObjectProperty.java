/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty#getObjectProperty <em>Object Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getInverseObjectProperty()
 * @model
 * @generated
 */
public interface InverseObjectProperty extends ObjectPropertyExpression {
	/**
   * Returns the value of the '<em><b>Object Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property</em>' containment reference.
   * @see #setObjectProperty(ObjectPropertyExpression)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getInverseObjectProperty_ObjectProperty()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	ObjectPropertyExpression getObjectProperty();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty#getObjectProperty <em>Object Property</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property</em>' containment reference.
   * @see #getObjectProperty()
   * @generated
   */
	void setObjectProperty(ObjectPropertyExpression value);

} // InverseObjectProperty
