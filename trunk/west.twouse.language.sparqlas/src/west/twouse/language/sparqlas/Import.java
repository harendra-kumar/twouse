/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.Import#getImportIRI <em>Import IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Import IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import IRI</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import IRI</em>' containment reference.
   * @see #setImportIRI(IRI)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getImport_ImportIRI()
   * @model containment="true" required="true"
   * @generated
   */
  IRI getImportIRI();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.Import#getImportIRI <em>Import IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import IRI</em>' containment reference.
   * @see #getImportIRI()
   * @generated
   */
  void setImportIRI(IRI value);

} // Import
