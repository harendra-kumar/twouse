/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.InverseObjectProperty#getObjectProperty <em>Object Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getInverseObjectProperty()
 * @model
 * @generated
 */
public interface InverseObjectProperty extends ObjectPropertyExpression, Expression
{
  /**
   * Returns the value of the '<em><b>Object Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property</em>' containment reference.
   * @see #setObjectProperty(ObjectProperty)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getInverseObjectProperty_ObjectProperty()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ObjectProperty getObjectProperty();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.InverseObjectProperty#getObjectProperty <em>Object Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property</em>' containment reference.
   * @see #getObjectProperty()
   * @generated
   */
  void setObjectProperty(ObjectProperty value);

} // InverseObjectProperty
