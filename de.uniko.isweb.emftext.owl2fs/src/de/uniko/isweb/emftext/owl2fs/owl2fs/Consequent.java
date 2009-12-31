/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consequent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent#getContainsAtoms <em>Contains Atoms</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getConsequent()
 * @model
 * @generated
 */
public interface Consequent extends EObject
{
  /**
   * Returns the value of the '<em><b>Contains Atoms</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.Atom}.
   * It is bidirectional and its opposite is '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Atom#getIsInConsequent <em>Is In Consequent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contains Atoms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contains Atoms</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getConsequent_ContainsAtoms()
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Atom#getIsInConsequent
   * @model opposite="isInConsequent" containment="true"
   * @generated
   */
  EList<Atom> getContainsAtoms();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getConsequent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Consequent
