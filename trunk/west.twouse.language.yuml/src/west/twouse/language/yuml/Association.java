/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.Association#getType <em>Type</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Association#isNavigableSource <em>Navigable Source</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Association#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Association#getSourceVisibility <em>Source Visibility</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Association#isNavigableTarget <em>Navigable Target</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Association#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Association#getTargetVisibility <em>Target Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.yuml.YumlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Relationship {
	/**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link west.twouse.language.yuml.AssociationType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see west.twouse.language.yuml.AssociationType
   * @see #setType(AssociationType)
   * @see west.twouse.language.yuml.YumlPackage#getAssociation_Type()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
	AssociationType getType();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Association#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see west.twouse.language.yuml.AssociationType
   * @see #getType()
   * @generated
   */
	void setType(AssociationType value);

	/**
   * Returns the value of the '<em><b>Navigable Source</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Navigable Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Navigable Source</em>' attribute.
   * @see #setNavigableSource(boolean)
   * @see west.twouse.language.yuml.YumlPackage#getAssociation_NavigableSource()
   * @model default="false" unique="false" ordered="false"
   * @generated
   */
  boolean isNavigableSource();

  /**
   * Sets the value of the '{@link west.twouse.language.yuml.Association#isNavigableSource <em>Navigable Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Navigable Source</em>' attribute.
   * @see #isNavigableSource()
   * @generated
   */
  void setNavigableSource(boolean value);

  /**
   * Returns the value of the '<em><b>Source Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Source Cardinality</em>' containment reference.
   * @see #setSourceCardinality(Cardinality)
   * @see west.twouse.language.yuml.YumlPackage#getAssociation_SourceCardinality()
   * @model containment="true" ordered="false"
   * @generated
   */
	Cardinality getSourceCardinality();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Association#getSourceCardinality <em>Source Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Cardinality</em>' containment reference.
   * @see #getSourceCardinality()
   * @generated
   */
	void setSourceCardinality(Cardinality value);

	/**
   * Returns the value of the '<em><b>Source Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link west.twouse.language.yuml.Visibility}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Source Visibility</em>' attribute.
   * @see west.twouse.language.yuml.Visibility
   * @see #setSourceVisibility(Visibility)
   * @see west.twouse.language.yuml.YumlPackage#getAssociation_SourceVisibility()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
	Visibility getSourceVisibility();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Association#getSourceVisibility <em>Source Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Visibility</em>' attribute.
   * @see west.twouse.language.yuml.Visibility
   * @see #getSourceVisibility()
   * @generated
   */
	void setSourceVisibility(Visibility value);

	/**
   * Returns the value of the '<em><b>Navigable Target</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Navigable Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Navigable Target</em>' attribute.
   * @see #setNavigableTarget(boolean)
   * @see west.twouse.language.yuml.YumlPackage#getAssociation_NavigableTarget()
   * @model default="false" unique="false" ordered="false"
   * @generated
   */
  boolean isNavigableTarget();

  /**
   * Sets the value of the '{@link west.twouse.language.yuml.Association#isNavigableTarget <em>Navigable Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Navigable Target</em>' attribute.
   * @see #isNavigableTarget()
   * @generated
   */
  void setNavigableTarget(boolean value);

  /**
   * Returns the value of the '<em><b>Target Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Target Cardinality</em>' containment reference.
   * @see #setTargetCardinality(Cardinality)
   * @see west.twouse.language.yuml.YumlPackage#getAssociation_TargetCardinality()
   * @model containment="true" ordered="false"
   * @generated
   */
	Cardinality getTargetCardinality();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Association#getTargetCardinality <em>Target Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Cardinality</em>' containment reference.
   * @see #getTargetCardinality()
   * @generated
   */
	void setTargetCardinality(Cardinality value);

	/**
   * Returns the value of the '<em><b>Target Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link west.twouse.language.yuml.Visibility}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Target Visibility</em>' attribute.
   * @see west.twouse.language.yuml.Visibility
   * @see #setTargetVisibility(Visibility)
   * @see west.twouse.language.yuml.YumlPackage#getAssociation_TargetVisibility()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
	Visibility getTargetVisibility();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Association#getTargetVisibility <em>Target Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Visibility</em>' attribute.
   * @see west.twouse.language.yuml.Visibility
   * @see #getTargetVisibility()
   * @generated
   */
	void setTargetVisibility(Visibility value);

} // Association
