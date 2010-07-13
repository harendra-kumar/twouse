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
 * A representation of the model object '<em><b>DG Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DGAxiom#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DGAxiom#getDgNodes <em>Dg Nodes</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DGAxiom#getDgEdges <em>Dg Edges</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DGAxiom#getMainClasses <em>Main Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGAxiom()
 * @model
 * @generated
 */
public interface DGAxiom extends Axiom
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGAxiom_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

  /**
   * Returns the value of the '<em><b>Dg Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dg Nodes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dg Nodes</em>' containment reference.
   * @see #setDgNodes(DGNodes)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGAxiom_DgNodes()
   * @model containment="true" required="true"
   * @generated
   */
  DGNodes getDgNodes();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DGAxiom#getDgNodes <em>Dg Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dg Nodes</em>' containment reference.
   * @see #getDgNodes()
   * @generated
   */
  void setDgNodes(DGNodes value);

  /**
   * Returns the value of the '<em><b>Dg Edges</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dg Edges</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dg Edges</em>' containment reference.
   * @see #setDgEdges(DGEdges)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGAxiom_DgEdges()
   * @model containment="true" required="true"
   * @generated
   */
  DGEdges getDgEdges();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DGAxiom#getDgEdges <em>Dg Edges</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dg Edges</em>' containment reference.
   * @see #getDgEdges()
   * @generated
   */
  void setDgEdges(DGEdges value);

  /**
   * Returns the value of the '<em><b>Main Classes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Classes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Classes</em>' containment reference.
   * @see #setMainClasses(MainClasses)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGAxiom_MainClasses()
   * @model containment="true" required="true"
   * @generated
   */
  MainClasses getMainClasses();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DGAxiom#getMainClasses <em>Main Classes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Classes</em>' containment reference.
   * @see #getMainClasses()
   * @generated
   */
  void setMainClasses(MainClasses value);

} // DGAxiom
