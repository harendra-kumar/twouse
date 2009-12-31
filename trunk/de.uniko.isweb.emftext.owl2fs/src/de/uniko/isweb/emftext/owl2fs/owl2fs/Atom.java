/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Atom#getIsInConsequent <em>Is In Consequent</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Atom#getIsInAntecedent <em>Is In Antecedent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getAtom()
 * @model abstract="true"
 * @generated
 */
public interface Atom extends EObject
{
  /**
   * Returns the value of the '<em><b>Is In Consequent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent#getContainsAtoms <em>Contains Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is In Consequent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is In Consequent</em>' container reference.
   * @see #setIsInConsequent(Consequent)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getAtom_IsInConsequent()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent#getContainsAtoms
   * @model opposite="containsAtoms" transient="false"
   * @generated
   */
  Consequent getIsInConsequent();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Atom#getIsInConsequent <em>Is In Consequent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is In Consequent</em>' container reference.
   * @see #getIsInConsequent()
   * @generated
   */
  void setIsInConsequent(Consequent value);

  /**
   * Returns the value of the '<em><b>Is In Antecedent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent#getContainsAtoms <em>Contains Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is In Antecedent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is In Antecedent</em>' container reference.
   * @see #setIsInAntecedent(Antecedent)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getAtom_IsInAntecedent()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent#getContainsAtoms
   * @model opposite="containsAtoms" transient="false"
   * @generated
   */
  Antecedent getIsInAntecedent();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Atom#getIsInAntecedent <em>Is In Antecedent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is In Antecedent</em>' container reference.
   * @see #getIsInAntecedent()
   * @generated
   */
  void setIsInAntecedent(Antecedent value);

} // Atom
