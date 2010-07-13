/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DatatypeDefinition#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DatatypeDefinition#getDataRange <em>Data Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDatatypeDefinition()
 * @model
 * @generated
 */
public interface DatatypeDefinition extends Axiom, AnnotationAxiom
{
  /**
   * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' containment reference.
   * @see #setDatatype(Datatype)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDatatypeDefinition_Datatype()
   * @model containment="true" required="true"
   * @generated
   */
  Datatype getDatatype();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DatatypeDefinition#getDatatype <em>Datatype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' containment reference.
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(Datatype value);

  /**
   * Returns the value of the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Range</em>' containment reference.
   * @see #setDataRange(DataRange)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDatatypeDefinition_DataRange()
   * @model containment="true" required="true"
   * @generated
   */
  DataRange getDataRange();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DatatypeDefinition#getDataRange <em>Data Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Range</em>' containment reference.
   * @see #getDataRange()
   * @generated
   */
  void setDataRange(DataRange value);

} // DatatypeDefinition
