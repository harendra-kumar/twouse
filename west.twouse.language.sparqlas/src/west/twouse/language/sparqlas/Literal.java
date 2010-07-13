/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.Literal#getLexicalForm <em>Lexical Form</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.Literal#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends AbstractLiteral {
	/**
   * Returns the value of the '<em><b>Lexical Form</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lexical Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Lexical Form</em>' attribute.
   * @see #setLexicalForm(String)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getLiteral_LexicalForm()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
	String getLexicalForm();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.Literal#getLexicalForm <em>Lexical Form</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lexical Form</em>' attribute.
   * @see #getLexicalForm()
   * @generated
   */
	void setLexicalForm(String value);

	/**
   * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' containment reference.
   * @see #setDatatype(Datatype)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getLiteral_Datatype()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	Datatype getDatatype();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.Literal#getDatatype <em>Datatype</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' containment reference.
   * @see #getDatatype()
   * @generated
   */
	void setDatatype(Datatype value);

} // Literal
