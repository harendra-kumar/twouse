/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Object Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.SubObjectPropertyOf#getSubObjectPropertyExpression <em>Sub Object Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.SubObjectPropertyOf#getSubObjectPropertyChain <em>Sub Object Property Chain</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getSubObjectPropertyOf()
 * @model
 * @generated
 */
public interface SubObjectPropertyOf extends ObjectPropertyAtom {
	/**
   * Returns the value of the '<em><b>Sub Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Object Property Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Object Property Expression</em>' containment reference.
   * @see #setSubObjectPropertyExpression(ObjectPropertyExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getSubObjectPropertyOf_SubObjectPropertyExpression()
   * @model containment="true" ordered="false"
   * @generated
   */
	ObjectPropertyExpression getSubObjectPropertyExpression();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.SubObjectPropertyOf#getSubObjectPropertyExpression <em>Sub Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Object Property Expression</em>' containment reference.
   * @see #getSubObjectPropertyExpression()
   * @generated
   */
	void setSubObjectPropertyExpression(ObjectPropertyExpression value);

	/**
   * Returns the value of the '<em><b>Sub Object Property Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Object Property Chain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Object Property Chain</em>' containment reference.
   * @see #setSubObjectPropertyChain(ObjectPropertyChain)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getSubObjectPropertyOf_SubObjectPropertyChain()
   * @model containment="true" ordered="false"
   * @generated
   */
  ObjectPropertyChain getSubObjectPropertyChain();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.SubObjectPropertyOf#getSubObjectPropertyChain <em>Sub Object Property Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Object Property Chain</em>' containment reference.
   * @see #getSubObjectPropertyChain()
   * @generated
   */
  void setSubObjectPropertyChain(ObjectPropertyChain value);

  /**
   * Returns the value of the '<em><b>Super Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Object Property Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Super Object Property Expression</em>' containment reference.
   * @see #setSuperObjectPropertyExpression(ObjectPropertyExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getSubObjectPropertyOf_SuperObjectPropertyExpression()
   * @model containment="true" required="true"
   * @generated
   */
	ObjectPropertyExpression getSuperObjectPropertyExpression();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Object Property Expression</em>' containment reference.
   * @see #getSuperObjectPropertyExpression()
   * @generated
   */
	void setSuperObjectPropertyExpression(ObjectPropertyExpression value);

} // SubObjectPropertyOf
