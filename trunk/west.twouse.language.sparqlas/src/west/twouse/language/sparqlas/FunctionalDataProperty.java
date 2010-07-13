/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Data Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.FunctionalDataProperty#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getFunctionalDataProperty()
 * @model
 * @generated
 */
public interface FunctionalDataProperty extends DataPropertyAtom {
	/**
   * Returns the value of the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expression</em>' containment reference.
   * @see #setDataPropertyExpression(DataPropertyExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getFunctionalDataProperty_DataPropertyExpression()
   * @model containment="true" required="true"
   * @generated
   */
	DataPropertyExpression getDataPropertyExpression();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.FunctionalDataProperty#getDataPropertyExpression <em>Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Property Expression</em>' containment reference.
   * @see #getDataPropertyExpression()
   * @generated
   */
	void setDataPropertyExpression(DataPropertyExpression value);

} // FunctionalDataProperty
