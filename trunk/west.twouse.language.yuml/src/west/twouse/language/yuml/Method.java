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
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.Method#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.yuml.YumlPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends ClassMember {
	/**
   * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' attribute list.
   * @see west.twouse.language.yuml.YumlPackage#getMethod_Arguments()
   * @model unique="false" ordered="false"
   * @generated
   */
	EList<String> getArguments();

} // Method
