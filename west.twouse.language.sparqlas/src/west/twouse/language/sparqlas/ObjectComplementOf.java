/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Complement Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.ObjectComplementOf#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getObjectComplementOf()
 * @model
 * @generated
 */
public interface ObjectComplementOf extends ClassExpression {
	/**
   * Returns the value of the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Class Expression</em>' containment reference.
   * @see #setClassExpression(ClassExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getObjectComplementOf_ClassExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	ClassExpression getClassExpression();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.ObjectComplementOf#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
	void setClassExpression(ClassExpression value);

} // ObjectComplementOf
