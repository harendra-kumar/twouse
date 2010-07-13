/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Intersection Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DataIntersectionOf#getDataRange <em>Data Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataIntersectionOf()
 * @model
 * @generated
 */
public interface DataIntersectionOf extends DataRange, Expression
{
  /**
   * Returns the value of the '<em><b>Data Range</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.DataRange}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Range</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Range</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataIntersectionOf_DataRange()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<DataRange> getDataRange();

} // DataIntersectionOf
