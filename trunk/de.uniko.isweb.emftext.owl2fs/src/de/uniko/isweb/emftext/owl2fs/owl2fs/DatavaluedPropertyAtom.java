/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datavalued Property Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getAtomTarget <em>Atom Target</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getAtomSource <em>Atom Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDatavaluedPropertyAtom()
 * @model
 * @generated
 */
public interface DatavaluedPropertyAtom extends PropertyAtom
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
   * @see #setHasPredicateSymbol(DataPropertyExpression)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDatavaluedPropertyAtom_HasPredicateSymbol()
   * @model containment="true" required="true"
   * @generated
   */
  DataPropertyExpression getHasPredicateSymbol();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Predicate Symbol</em>' containment reference.
   * @see #getHasPredicateSymbol()
   * @generated
   */
  void setHasPredicateSymbol(DataPropertyExpression value);

  /**
   * Returns the value of the '<em><b>Atom Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom Target</em>' containment reference.
   * @see #setAtomTarget(DataRangeAtom)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDatavaluedPropertyAtom_AtomTarget()
   * @model containment="true" required="true" derived="true"
   * @generated
   */
  DataRangeAtom getAtomTarget();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getAtomTarget <em>Atom Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom Target</em>' containment reference.
   * @see #getAtomTarget()
   * @generated
   */
  void setAtomTarget(DataRangeAtom value);

  /**
   * Returns the value of the '<em><b>Atom Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom Source</em>' containment reference.
   * @see #setAtomSource(DataRangeAtom)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDatavaluedPropertyAtom_AtomSource()
   * @model containment="true" required="true" derived="true"
   * @generated
   */
  DataRangeAtom getAtomSource();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getAtomSource <em>Atom Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom Source</em>' containment reference.
   * @see #getAtomSource()
   * @generated
   */
  void setAtomSource(DataRangeAtom value);

} // DatavaluedPropertyAtom
