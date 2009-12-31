/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Propety Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getAtomTarget <em>Atom Target</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getAtomSource <em>Atom Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getIndividualPropetyAtom()
 * @model
 * @generated
 */
public interface IndividualPropetyAtom extends PropertyAtom
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
   * @see #setHasPredicateSymbol(ObjectPropertyExpression)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getIndividualPropetyAtom_HasPredicateSymbol()
   * @model containment="true" required="true"
   * @generated
   */
  ObjectPropertyExpression getHasPredicateSymbol();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Predicate Symbol</em>' containment reference.
   * @see #getHasPredicateSymbol()
   * @generated
   */
  void setHasPredicateSymbol(ObjectPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Atom Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom Target</em>' containment reference.
   * @see #setAtomTarget(ClassAtom)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getIndividualPropetyAtom_AtomTarget()
   * @model containment="true" required="true" derived="true"
   * @generated
   */
  ClassAtom getAtomTarget();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getAtomTarget <em>Atom Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom Target</em>' containment reference.
   * @see #getAtomTarget()
   * @generated
   */
  void setAtomTarget(ClassAtom value);

  /**
   * Returns the value of the '<em><b>Atom Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom Source</em>' containment reference.
   * @see #setAtomSource(ClassAtom)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getIndividualPropetyAtom_AtomSource()
   * @model containment="true" required="true" derived="true"
   * @generated
   */
  ClassAtom getAtomSource();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getAtomSource <em>Atom Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom Source</em>' containment reference.
   * @see #getAtomSource()
   * @generated
   */
  void setAtomSource(ClassAtom value);

} // IndividualPropetyAtom
