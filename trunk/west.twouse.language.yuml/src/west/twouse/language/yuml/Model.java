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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.Model#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.yuml.YumlPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.yuml.ModelElement}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see west.twouse.language.yuml.YumlPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
	EList<ModelElement> getElements();

} // Model
