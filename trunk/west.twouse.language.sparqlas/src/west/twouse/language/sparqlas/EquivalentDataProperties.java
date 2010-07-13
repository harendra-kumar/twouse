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
 * A representation of the model object '<em><b>Equivalent Data Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.EquivalentDataProperties#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getEquivalentDataProperties()
 * @model
 * @generated
 */
public interface EquivalentDataProperties extends DataPropertyAtom {
	/**
   * Returns the value of the '<em><b>Data Property Expression</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.DataPropertyExpression}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Property Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expression</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getEquivalentDataProperties_DataPropertyExpression()
   * @model containment="true" lower="2"
   * @generated
   */
	EList<DataPropertyExpression> getDataPropertyExpression();

} // EquivalentDataProperties
