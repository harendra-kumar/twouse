/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion#getIndividual <em>Individual</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getClassAssertion()
 * @model
 * @generated
 */
public interface ClassAssertion extends Assertion {
	/**
   * Returns the value of the '<em><b>Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Individual</em>' containment reference.
   * @see #setIndividual(Individual)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getClassAssertion_Individual()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	Individual getIndividual();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion#getIndividual <em>Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Individual</em>' containment reference.
   * @see #getIndividual()
   * @generated
   */
	void setIndividual(Individual value);

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
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getClassAssertion_ClassExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	ClassExpression getClassExpression();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
	void setClassExpression(ClassExpression value);

} // ClassAssertion
