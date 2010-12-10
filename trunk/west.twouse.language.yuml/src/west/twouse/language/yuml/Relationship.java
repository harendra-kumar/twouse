/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Relationship#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Relationship#getTargetLabel <em>Target Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.yuml.YumlPackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends ModelElement {
	/**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(west.twouse.language.yuml.Class)
   * @see west.twouse.language.yuml.YumlPackage#getRelationship_Source()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	west.twouse.language.yuml.Class getSource();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Relationship#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
	void setSource(west.twouse.language.yuml.Class value);

	/**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(ColorableElement)
   * @see west.twouse.language.yuml.YumlPackage#getRelationship_Target()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	ColorableElement getTarget();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Relationship#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ColorableElement value);

	/**
   * Returns the value of the '<em><b>Source Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Source Label</em>' attribute.
   * @see #setSourceLabel(String)
   * @see west.twouse.language.yuml.YumlPackage#getRelationship_SourceLabel()
   * @model unique="false" ordered="false"
   * @generated
   */
	String getSourceLabel();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Relationship#getSourceLabel <em>Source Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Label</em>' attribute.
   * @see #getSourceLabel()
   * @generated
   */
	void setSourceLabel(String value);

	/**
   * Returns the value of the '<em><b>Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Target Label</em>' attribute.
   * @see #setTargetLabel(String)
   * @see west.twouse.language.yuml.YumlPackage#getRelationship_TargetLabel()
   * @model unique="false" ordered="false"
   * @generated
   */
	String getTargetLabel();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Relationship#getTargetLabel <em>Target Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Label</em>' attribute.
   * @see #getTargetLabel()
   * @generated
   */
	void setTargetLabel(String value);

} // Relationship
