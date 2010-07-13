/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.Ontology#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Ontology#getPackages <em>Packages</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Ontology#getComment <em>Comment</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Ontology#getOntologyIRI <em>Ontology IRI</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Ontology#getVersionIRI <em>Version IRI</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Ontology#getDirectlyImportsDocuments <em>Directly Imports Documents</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Ontology#getOntologyAnnotations <em>Ontology Annotations</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Ontology#getAxioms <em>Axioms</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getOntology()
 * @model
 * @generated
 */
public interface Ontology extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getOntology_Expressions()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Expression> getExpressions();

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getOntology_Packages()
   * @model containment="true"
   * @generated
   */
  EList<west.twouse.language.owl2fs.Package> getPackages();

  /**
   * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Comment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getOntology_Comment()
   * @model containment="true"
   * @generated
   */
  EList<Comment> getComment();

  /**
   * Returns the value of the '<em><b>Ontology IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ontology IRI</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ontology IRI</em>' containment reference.
   * @see #setOntologyIRI(IRI)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getOntology_OntologyIRI()
   * @model containment="true"
   * @generated
   */
  IRI getOntologyIRI();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.Ontology#getOntologyIRI <em>Ontology IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ontology IRI</em>' containment reference.
   * @see #getOntologyIRI()
   * @generated
   */
  void setOntologyIRI(IRI value);

  /**
   * Returns the value of the '<em><b>Version IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version IRI</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version IRI</em>' containment reference.
   * @see #setVersionIRI(IRI)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getOntology_VersionIRI()
   * @model containment="true"
   * @generated
   */
  IRI getVersionIRI();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.Ontology#getVersionIRI <em>Version IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version IRI</em>' containment reference.
   * @see #getVersionIRI()
   * @generated
   */
  void setVersionIRI(IRI value);

  /**
   * Returns the value of the '<em><b>Directly Imports Documents</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.IRI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directly Imports Documents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directly Imports Documents</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getOntology_DirectlyImportsDocuments()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<IRI> getDirectlyImportsDocuments();

  /**
   * Returns the value of the '<em><b>Ontology Annotations</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ontology Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ontology Annotations</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getOntology_OntologyAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getOntologyAnnotations();

  /**
   * Returns the value of the '<em><b>Axioms</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Axiom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axioms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axioms</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getOntology_Axioms()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Axiom> getAxioms();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.versionURI != 0 implies self.ontologyURI != 0
   * <!-- end-model-doc -->
   * @model
   * @generated
   */
  boolean versionURIrequiresontologyURItobespecified(DiagnosticChain diagnostics);

} // Ontology
