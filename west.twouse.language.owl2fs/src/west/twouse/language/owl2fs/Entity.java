/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.Entity#getEntityIRI <em>Entity IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity IRI</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity IRI</em>' containment reference.
   * @see #setEntityIRI(IRI)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getEntity_EntityIRI()
   * @model containment="true" required="true"
   * @generated
   */
  IRI getEntityIRI();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.Entity#getEntityIRI <em>Entity IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity IRI</em>' containment reference.
   * @see #getEntityIRI()
   * @generated
   */
  void setEntityIRI(IRI value);

} // Entity
