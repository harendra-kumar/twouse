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
 * A representation of the model object '<em><b>Edge Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.EdgeAssertion#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.EdgeAssertion#getDgNode1 <em>Dg Node1</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.EdgeAssertion#getDgNode2 <em>Dg Node2</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getEdgeAssertion()
 * @model
 * @generated
 */
public interface EdgeAssertion extends EObject
{
  /**
   * Returns the value of the '<em><b>Object Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property</em>' containment reference.
   * @see #setObjectProperty(ObjectProperty)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getEdgeAssertion_ObjectProperty()
   * @model containment="true" required="true"
   * @generated
   */
  ObjectProperty getObjectProperty();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.EdgeAssertion#getObjectProperty <em>Object Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property</em>' containment reference.
   * @see #getObjectProperty()
   * @generated
   */
  void setObjectProperty(ObjectProperty value);

  /**
   * Returns the value of the '<em><b>Dg Node1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dg Node1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dg Node1</em>' containment reference.
   * @see #setDgNode1(IRI)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getEdgeAssertion_DgNode1()
   * @model containment="true" required="true"
   * @generated
   */
  IRI getDgNode1();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.EdgeAssertion#getDgNode1 <em>Dg Node1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dg Node1</em>' containment reference.
   * @see #getDgNode1()
   * @generated
   */
  void setDgNode1(IRI value);

  /**
   * Returns the value of the '<em><b>Dg Node2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dg Node2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dg Node2</em>' containment reference.
   * @see #setDgNode2(IRI)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getEdgeAssertion_DgNode2()
   * @model containment="true" required="true"
   * @generated
   */
  IRI getDgNode2();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.EdgeAssertion#getDgNode2 <em>Dg Node2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dg Node2</em>' containment reference.
   * @see #getDgNode2()
   * @generated
   */
  void setDgNode2(IRI value);

} // EdgeAssertion
