/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.ObjectPropertyDeclaration#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.ObjectPropertyDeclaration#getObjectPropertyVariable <em>Object Property Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getObjectPropertyDeclaration()
 * @model
 * @generated
 */
public interface ObjectPropertyDeclaration extends Declaration
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
   * @see west.twouse.language.sparqlas.SparqlasPackage#getObjectPropertyDeclaration_ObjectProperty()
   * @model containment="true"
   * @generated
   */
  ObjectProperty getObjectProperty();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.ObjectPropertyDeclaration#getObjectProperty <em>Object Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property</em>' containment reference.
   * @see #getObjectProperty()
   * @generated
   */
  void setObjectProperty(ObjectProperty value);

  /**
   * Returns the value of the '<em><b>Object Property Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Variable</em>' containment reference.
   * @see #setObjectPropertyVariable(ObjectPropertyVariable)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getObjectPropertyDeclaration_ObjectPropertyVariable()
   * @model containment="true"
   * @generated
   */
  ObjectPropertyVariable getObjectPropertyVariable();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.ObjectPropertyDeclaration#getObjectPropertyVariable <em>Object Property Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Variable</em>' containment reference.
   * @see #getObjectPropertyVariable()
   * @generated
   */
  void setObjectPropertyVariable(ObjectPropertyVariable value);

} // ObjectPropertyDeclaration
