/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.DatatypePropertyDeclaration#getDatatypeProperty <em>Datatype Property</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.DatatypePropertyDeclaration#getDatatypePropertyVariable <em>Datatype Property Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getDatatypePropertyDeclaration()
 * @model
 * @generated
 */
public interface DatatypePropertyDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Datatype Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype Property</em>' containment reference.
   * @see #setDatatypeProperty(DataProperty)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDatatypePropertyDeclaration_DatatypeProperty()
   * @model containment="true"
   * @generated
   */
  DataProperty getDatatypeProperty();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.DatatypePropertyDeclaration#getDatatypeProperty <em>Datatype Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype Property</em>' containment reference.
   * @see #getDatatypeProperty()
   * @generated
   */
  void setDatatypeProperty(DataProperty value);

  /**
   * Returns the value of the '<em><b>Datatype Property Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype Property Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype Property Variable</em>' containment reference.
   * @see #setDatatypePropertyVariable(DataPropertyVariable)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDatatypePropertyDeclaration_DatatypePropertyVariable()
   * @model containment="true"
   * @generated
   */
  DataPropertyVariable getDatatypePropertyVariable();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.DatatypePropertyDeclaration#getDatatypePropertyVariable <em>Datatype Property Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype Property Variable</em>' containment reference.
   * @see #getDatatypePropertyVariable()
   * @generated
   */
  void setDatatypePropertyVariable(DataPropertyVariable value);

} // DatatypePropertyDeclaration
