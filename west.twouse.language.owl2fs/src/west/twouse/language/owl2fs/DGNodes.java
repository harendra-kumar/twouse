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
 * A representation of the model object '<em><b>DG Nodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DGNodes#getNodeAssertion <em>Node Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGNodes()
 * @model
 * @generated
 */
public interface DGNodes extends EObject
{
  /**
   * Returns the value of the '<em><b>Node Assertion</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.NodeAssertion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Assertion</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Assertion</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGNodes_NodeAssertion()
   * @model containment="true" required="true"
   * @generated
   */
  EList<NodeAssertion> getNodeAssertion();

} // DGNodes
