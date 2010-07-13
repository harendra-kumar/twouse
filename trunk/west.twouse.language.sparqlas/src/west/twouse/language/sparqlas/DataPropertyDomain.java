/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.DataPropertyDomain#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.DataPropertyDomain#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getDataPropertyDomain()
 * @model
 * @generated
 */
public interface DataPropertyDomain extends DataPropertyAtom {
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
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDataPropertyDomain_DataPropertyExpression()
   * @model containment="true" required="true"
   * @generated
   */
	DataPropertyExpression getDataPropertyExpression();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.DataPropertyDomain#getDataPropertyExpression <em>Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Property Expression</em>' containment reference.
   * @see #getDataPropertyExpression()
   * @generated
   */
	void setDataPropertyExpression(DataPropertyExpression value);

	/**
   * Returns the value of the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' containment reference.
   * @see #setDomain(ClassExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDataPropertyDomain_Domain()
   * @model containment="true" required="true"
   * @generated
   */
	ClassExpression getDomain();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.DataPropertyDomain#getDomain <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' containment reference.
   * @see #getDomain()
   * @generated
   */
	void setDomain(ClassExpression value);

} // DataPropertyDomain
