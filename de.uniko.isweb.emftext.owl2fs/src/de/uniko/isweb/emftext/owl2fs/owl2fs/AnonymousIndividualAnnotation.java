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
 * A representation of the model object '<em><b>Anonymous Individual Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation#getAnonymousIndiviudalAnnotations <em>Anonymous Indiviudal Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getAnonymousIndividualAnnotation()
 * @model
 * @generated
 */
public interface AnonymousIndividualAnnotation extends Axiom
{
  /**
   * Returns the value of the '<em><b>Anonymous Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anonymous Individual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anonymous Individual</em>' containment reference.
   * @see #setAnonymousIndividual(AnonymousIndividual)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getAnonymousIndividualAnnotation_AnonymousIndividual()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  AnonymousIndividual getAnonymousIndividual();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation#getAnonymousIndividual <em>Anonymous Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anonymous Individual</em>' containment reference.
   * @see #getAnonymousIndividual()
   * @generated
   */
  void setAnonymousIndividual(AnonymousIndividual value);

  /**
   * Returns the value of the '<em><b>Anonymous Indiviudal Annotations</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anonymous Indiviudal Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anonymous Indiviudal Annotations</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getAnonymousIndividualAnnotation_AnonymousIndiviudalAnnotations()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  EList<Annotation> getAnonymousIndiviudalAnnotations();

} // AnonymousIndividualAnnotation
