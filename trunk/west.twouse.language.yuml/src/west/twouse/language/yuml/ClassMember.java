/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.ClassMember#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link west.twouse.language.yuml.ClassMember#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.yuml.YumlPackage#getClassMember()
 * @model abstract="true"
 * @generated
 */
public interface ClassMember extends EObject {
	/**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link west.twouse.language.yuml.Visibility}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see west.twouse.language.yuml.Visibility
   * @see #setVisibility(Visibility)
   * @see west.twouse.language.yuml.YumlPackage#getClassMember_Visibility()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
	Visibility getVisibility();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.ClassMember#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see west.twouse.language.yuml.Visibility
   * @see #getVisibility()
   * @generated
   */
	void setVisibility(Visibility value);

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
   * @see west.twouse.language.yuml.YumlPackage#getClassMember_Name()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
	String getName();

  /**
   * Sets the value of the '{@link west.twouse.language.yuml.ClassMember#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ClassMember
