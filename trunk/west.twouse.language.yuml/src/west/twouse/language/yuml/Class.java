/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.Class#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Class#getName <em>Name</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Class#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.yuml.YumlPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ColorableElement {
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
   * @see west.twouse.language.yuml.YumlPackage#getClass_Stereotype()
   * @model unique="false" ordered="false"
   * @generated
   */
	String getStereotype();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Class#getStereotype <em>Stereotype</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stereotype</em>' attribute.
   * @see #getStereotype()
   * @generated
   */
	void setStereotype(String value);

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see west.twouse.language.yuml.YumlPackage#getClass_Name()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Class#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.yuml.Attribute}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see west.twouse.language.yuml.YumlPackage#getClass_Attributes()
   * @model containment="true"
   * @generated
   */
	EList<Attribute> getAttributes();

	/**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.yuml.Method}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see west.twouse.language.yuml.YumlPackage#getClass_Methods()
   * @model containment="true"
   * @generated
   */
	EList<Method> getMethods();

} // Class
