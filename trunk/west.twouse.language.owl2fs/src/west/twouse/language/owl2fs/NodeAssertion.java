/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.NodeAssertion#getClass_ <em>Class</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.NodeAssertion#getDgNode <em>Dg Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getNodeAssertion()
 * @model
 * @generated
 */
public interface NodeAssertion extends EObject
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(west.twouse.language.owl2fs.Class)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getNodeAssertion_Class()
   * @model containment="true" required="true"
   * @generated
   */
  west.twouse.language.owl2fs.Class getClass_();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.NodeAssertion#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(west.twouse.language.owl2fs.Class value);

  /**
   * Returns the value of the '<em><b>Dg Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dg Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dg Node</em>' containment reference.
   * @see #setDgNode(IRI)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getNodeAssertion_DgNode()
   * @model containment="true" required="true"
   * @generated
   */
  IRI getDgNode();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.NodeAssertion#getDgNode <em>Dg Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dg Node</em>' containment reference.
   * @see #getDgNode()
   * @generated
   */
  void setDgNode(IRI value);

} // NodeAssertion
