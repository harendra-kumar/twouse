/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.Declaration#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface Declaration extends Axiom, AnnotationAxiom
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(Entity)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDeclaration_Entity()
   * @model containment="true" required="true"
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.Declaration#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

} // Declaration
