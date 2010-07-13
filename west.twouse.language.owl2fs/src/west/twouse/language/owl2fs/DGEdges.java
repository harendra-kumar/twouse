/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DG Edges</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DGEdges#getEdgeAssertion <em>Edge Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGEdges()
 * @model
 * @generated
 */
public interface DGEdges extends EObject
{
  /**
   * Returns the value of the '<em><b>Edge Assertion</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.EdgeAssertion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge Assertion</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge Assertion</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGEdges_EdgeAssertion()
   * @model containment="true" required="true"
   * @generated
   */
  EList<EdgeAssertion> getEdgeAssertion();

} // DGEdges
