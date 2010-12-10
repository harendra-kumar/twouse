/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colorable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.ColorableElement#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.yuml.YumlPackage#getColorableElement()
 * @model abstract="true"
 * @generated
 */
public interface ColorableElement extends ModelElement {
	/**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see #setColor(String)
   * @see west.twouse.language.yuml.YumlPackage#getColorableElement_Color()
   * @model unique="false" ordered="false"
   * @generated
   */
	String getColor();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.ColorableElement#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see #getColor()
   * @generated
   */
	void setColor(String value);

} // ColorableElement
