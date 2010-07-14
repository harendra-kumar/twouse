/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.OntologyDocument#getQueryIRI <em>Query IRI</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.OntologyDocument#getImport <em>Import</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.OntologyDocument#getPrefixDefinition <em>Prefix Definition</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.OntologyDocument#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getOntologyDocument()
 * @model
 * @generated
 */
public interface OntologyDocument extends EObject
{
  /**
   * Returns the value of the '<em><b>Query IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query IRI</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query IRI</em>' containment reference.
   * @see #setQueryIRI(IRI)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getOntologyDocument_QueryIRI()
   * @model containment="true" ordered="false"
   * @generated
   */
  IRI getQueryIRI();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.OntologyDocument#getQueryIRI <em>Query IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query IRI</em>' containment reference.
   * @see #getQueryIRI()
   * @generated
   */
  void setQueryIRI(IRI value);

  /**
   * Returns the value of the '<em><b>Import</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getOntologyDocument_Import()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImport();

  /**
   * Returns the value of the '<em><b>Prefix Definition</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.PrefixDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix Definition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix Definition</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getOntologyDocument_PrefixDefinition()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<PrefixDefinition> getPrefixDefinition();

  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(Query)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getOntologyDocument_Query()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Query getQuery();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.OntologyDocument#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(Query value);

} // OntologyDocument
