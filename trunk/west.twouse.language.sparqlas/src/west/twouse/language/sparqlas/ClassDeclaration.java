/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.ClassDeclaration#getClass_ <em>Class</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.ClassDeclaration#getClassVariable <em>Class Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getClassDeclaration()
 * @model
 * @generated
 */
public interface ClassDeclaration extends Declaration {
	/**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(west.twouse.language.sparqlas.Class)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getClassDeclaration_Class()
   * @model containment="true"
   * @generated
   */
	west.twouse.language.sparqlas.Class getClass_();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.ClassDeclaration#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
	void setClass(west.twouse.language.sparqlas.Class value);

	/**
   * Returns the value of the '<em><b>Class Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Class Variable</em>' containment reference.
   * @see #setClassVariable(ClassVariable)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getClassDeclaration_ClassVariable()
   * @model containment="true"
   * @generated
   */
	ClassVariable getClassVariable();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.ClassDeclaration#getClassVariable <em>Class Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Variable</em>' containment reference.
   * @see #getClassVariable()
   * @generated
   */
	void setClassVariable(ClassVariable value);

} // ClassDeclaration
