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
 * A representation of the model object '<em><b>Built In Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.BuiltInAtom#getIri <em>Iri</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.BuiltInAtom#getDArg <em>DArg</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getBuiltInAtom()
 * @model
 * @generated
 */
public interface BuiltInAtom extends Atom
{
  /**
   * Returns the value of the '<em><b>Iri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iri</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iri</em>' containment reference.
   * @see #setIri(IRI)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getBuiltInAtom_Iri()
   * @model containment="true" required="true"
   * @generated
   */
  IRI getIri();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.BuiltInAtom#getIri <em>Iri</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iri</em>' containment reference.
   * @see #getIri()
   * @generated
   */
  void setIri(IRI value);

  /**
   * Returns the value of the '<em><b>DArg</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.DArg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DArg</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DArg</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getBuiltInAtom_DArg()
   * @model containment="true" required="true"
   * @generated
   */
  EList<DArg> getDArg();

} // BuiltInAtom
