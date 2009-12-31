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
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Entity#getEntityURI <em>Entity URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity URI</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity URI</em>' containment reference.
   * @see #setEntityURI(URI)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getEntity_EntityURI()
   * @model containment="true" required="true"
   * @generated
   */
  URI getEntityURI();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Entity#getEntityURI <em>Entity URI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity URI</em>' containment reference.
   * @see #getEntityURI()
   * @generated
   */
  void setEntityURI(URI value);

} // Entity
