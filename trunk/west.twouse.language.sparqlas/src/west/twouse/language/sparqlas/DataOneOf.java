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
 * A representation of the model object '<em><b>Data One Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.DataOneOf#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getDataOneOf()
 * @model
 * @generated
 */
public interface DataOneOf extends DataRange {
	/**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.AbstractLiteral}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDataOneOf_Literals()
   * @model containment="true" required="true"
   * @generated
   */
	EList<AbstractLiteral> getLiterals();

} // DataOneOf
