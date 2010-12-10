/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.Attribute#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.yuml.YumlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends ClassMember {
	/**
   * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stereotype</em>' attribute.
   * @see #setStereotype(String)
   * @see west.twouse.language.yuml.YumlPackage#getAttribute_Stereotype()
   * @model unique="false" ordered="false"
   * @generated
   */
  String getStereotype();

  /**
   * Sets the value of the '{@link west.twouse.language.yuml.Attribute#getStereotype <em>Stereotype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stereotype</em>' attribute.
   * @see #getStereotype()
   * @generated
   */
  void setStereotype(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see west.twouse.language.yuml.YumlPackage#getAttribute_Type()
   * @model unique="false" ordered="false"
   * @generated
   */
	String getType();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Attribute#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
	void setType(String value);

} // Attribute
