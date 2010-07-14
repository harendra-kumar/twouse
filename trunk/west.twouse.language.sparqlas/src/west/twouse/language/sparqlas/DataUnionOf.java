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
 * A representation of the model object '<em><b>Data Union Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.DataUnionOf#getDataRanges <em>Data Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getDataUnionOf()
 * @model
 * @generated
 */
public interface DataUnionOf extends DataRange
{
  /**
   * Returns the value of the '<em><b>Data Ranges</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.DataRange}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Ranges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Ranges</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDataUnionOf_DataRanges()
   * @model containment="true" lower="2"
   * @generated
   */
  EList<DataRange> getDataRanges();

} // DataUnionOf
