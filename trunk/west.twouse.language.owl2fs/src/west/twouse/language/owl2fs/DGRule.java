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
 * A representation of the model object '<em><b>DG Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DGRule#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DGRule#getBodyAtom <em>Body Atom</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DGRule#getHeadAtom <em>Head Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGRule()
 * @model
 * @generated
 */
public interface DGRule extends Rule
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGRule_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

  /**
   * Returns the value of the '<em><b>Body Atom</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.DGAtom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body Atom</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body Atom</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGRule_BodyAtom()
   * @model containment="true"
   * @generated
   */
  EList<DGAtom> getBodyAtom();

  /**
   * Returns the value of the '<em><b>Head Atom</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.DGAtom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head Atom</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head Atom</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDGRule_HeadAtom()
   * @model containment="true"
   * @generated
   */
  EList<DGAtom> getHeadAtom();

} // DGRule
