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
 * A representation of the model object '<em><b>Same Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual#getSameIndividuals <em>Same Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getSameIndividual()
 * @model
 * @generated
 */
public interface SameIndividual extends Assertion
{
  /**
   * Returns the value of the '<em><b>Same Individuals</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Same Individuals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Same Individuals</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getSameIndividual_SameIndividuals()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<NamedIndividual> getSameIndividuals();

} // SameIndividual