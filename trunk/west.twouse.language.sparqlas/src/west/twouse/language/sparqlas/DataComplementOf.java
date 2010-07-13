/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Complement Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.DataComplementOf#getDataRange <em>Data Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getDataComplementOf()
 * @model
 * @generated
 */
public interface DataComplementOf extends DataRange {
	/**
   * Returns the value of the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Data Range</em>' containment reference.
   * @see #setDataRange(DataRange)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDataComplementOf_DataRange()
   * @model containment="true" required="true"
   * @generated
   */
	DataRange getDataRange();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.DataComplementOf#getDataRange <em>Data Range</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Range</em>' containment reference.
   * @see #getDataRange()
   * @generated
   */
	void setDataRange(DataRange value);

} // DataComplementOf
