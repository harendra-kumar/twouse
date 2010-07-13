/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Object Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.EquivalentObjectProperties#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getEquivalentObjectProperties()
 * @model
 * @generated
 */
public interface EquivalentObjectProperties extends ObjectPropertyAtom {
	/**
   * Returns the value of the '<em><b>Object Property Expression</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.ObjectPropertyExpression}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Property Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getEquivalentObjectProperties_ObjectPropertyExpression()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
	EList<ObjectPropertyExpression> getObjectPropertyExpression();

} // EquivalentObjectProperties
