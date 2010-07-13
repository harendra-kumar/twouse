/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.Variable#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Term {
	/**
   * Returns the value of the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' attribute.
   * @see #setSymbol(String)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getVariable_Symbol()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
	String getSymbol();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.Variable#getSymbol <em>Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' attribute.
   * @see #getSymbol()
   * @generated
   */
	void setSymbol(String value);

} // Variable
