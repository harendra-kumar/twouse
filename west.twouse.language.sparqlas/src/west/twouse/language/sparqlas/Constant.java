/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.Constant#getConstantIRI <em>Constant IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getConstant()
 * @model abstract="true"
 * @generated
 */
public interface Constant extends Term {
	/**
   * Returns the value of the '<em><b>Constant IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant IRI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Constant IRI</em>' containment reference.
   * @see #setConstantIRI(IRI)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getConstant_ConstantIRI()
   * @model containment="true" required="true"
   * @generated
   */
	IRI getConstantIRI();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.Constant#getConstantIRI <em>Constant IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant IRI</em>' containment reference.
   * @see #getConstantIRI()
   * @generated
   */
	void setConstantIRI(IRI value);

} // Constant
