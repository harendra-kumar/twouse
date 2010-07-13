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
 * A representation of the model object '<em><b>DL Safe Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DLSafeRule#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DLSafeRule#getBodyAtom <em>Body Atom</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DLSafeRule#getHeadAtom <em>Head Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDLSafeRule()
 * @model
 * @generated
 */
public interface DLSafeRule extends Rule
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDLSafeRule_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

  /**
   * Returns the value of the '<em><b>Body Atom</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Atom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body Atom</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body Atom</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDLSafeRule_BodyAtom()
   * @model containment="true"
   * @generated
   */
  EList<Atom> getBodyAtom();

  /**
   * Returns the value of the '<em><b>Head Atom</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Atom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head Atom</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head Atom</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDLSafeRule_HeadAtom()
   * @model containment="true"
   * @generated
   */
  EList<Atom> getHeadAtom();

} // DLSafeRule
