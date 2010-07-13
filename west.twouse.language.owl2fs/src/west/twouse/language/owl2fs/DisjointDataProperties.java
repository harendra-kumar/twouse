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
 * A representation of the model object '<em><b>Disjoint Data Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DisjointDataProperties#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDisjointDataProperties()
 * @model
 * @generated
 */
public interface DisjointDataProperties extends DataPropertyAxiom
{
  /**
   * Returns the value of the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.DataPropertyExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Property Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expressions</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDisjointDataProperties_DataPropertyExpressions()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<DataPropertyExpression> getDataPropertyExpressions();

} // DisjointDataProperties
