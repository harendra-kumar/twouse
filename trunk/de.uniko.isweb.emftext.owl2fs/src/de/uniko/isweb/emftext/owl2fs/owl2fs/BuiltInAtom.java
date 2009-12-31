/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom#getHasTerms <em>Has Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getBuiltInAtom()
 * @model
 * @generated
 */
public interface BuiltInAtom extends Atom
{
  /**
   * Returns the value of the '<em><b>Has Predicate Symbol</b></em>' attribute.
   * The default value is <code>""</code>.
   * The literals are from the enumeration {@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Predicate Symbol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Predicate Symbol</em>' attribute.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID
   * @see #setHasPredicateSymbol(BuiltInID)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getBuiltInAtom_HasPredicateSymbol()
   * @model default="" required="true"
   * @generated
   */
  BuiltInID getHasPredicateSymbol();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Predicate Symbol</em>' attribute.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID
   * @see #getHasPredicateSymbol()
   * @generated
   */
  void setHasPredicateSymbol(BuiltInID value);

  /**
   * Returns the value of the '<em><b>Has Terms</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.DObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Terms</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getBuiltInAtom_HasTerms()
   * @model containment="true"
   * @generated
   */
  EList<DObject> getHasTerms();

} // BuiltInAtom
