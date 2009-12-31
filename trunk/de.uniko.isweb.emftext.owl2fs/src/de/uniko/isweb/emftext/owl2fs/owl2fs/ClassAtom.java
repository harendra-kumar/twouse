/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom#getHasTerm <em>Has Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getClassAtom()
 * @model
 * @generated
 */
public interface ClassAtom extends Atom
{
  /**
   * Returns the value of the '<em><b>Has Predicate Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Predicate Symbol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Predicate Symbol</em>' containment reference.
   * @see #setHasPredicateSymbol(ClassExpression)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getClassAtom_HasPredicateSymbol()
   * @model containment="true" required="true"
   * @generated
   */
  ClassExpression getHasPredicateSymbol();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Predicate Symbol</em>' containment reference.
   * @see #getHasPredicateSymbol()
   * @generated
   */
  void setHasPredicateSymbol(ClassExpression value);

  /**
   * Returns the value of the '<em><b>Has Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Term</em>' containment reference.
   * @see #setHasTerm(IObject)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getClassAtom_HasTerm()
   * @model containment="true" required="true"
   * @generated
   */
  IObject getHasTerm();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom#getHasTerm <em>Has Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Term</em>' containment reference.
   * @see #getHasTerm()
   * @generated
   */
  void setHasTerm(IObject value);

} // ClassAtom
