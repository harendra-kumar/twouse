/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

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
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getOntologyAnnotations <em>Ontology Annotations</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getImportedOntologies <em>Imported Ontologies</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getOntologyURI <em>Ontology URI</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getVersionURI <em>Version URI</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntology()
 * @model
 * @generated
 */
public interface Ontology extends EObject
{
  /**
   * Returns the value of the '<em><b>Ontology Annotations</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ontology Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ontology Annotations</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntology_OntologyAnnotations()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Annotation> getOntologyAnnotations();

  /**
   * Returns the value of the '<em><b>Axioms</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axioms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axioms</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntology_Axioms()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Axiom> getAxioms();

  /**
   * Returns the value of the '<em><b>Imported Ontologies</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Ontologies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Ontologies</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntology_ImportedOntologies()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Ontology> getImportedOntologies();

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntology_Expressions()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Expression> getExpressions();

  /**
   * Returns the value of the '<em><b>Ontology URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ontology URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ontology URI</em>' attribute.
   * @see #setOntologyURI(String)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntology_OntologyURI()
   * @model required="true"
   * @generated
   */
  String getOntologyURI();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getOntologyURI <em>Ontology URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ontology URI</em>' attribute.
   * @see #getOntologyURI()
   * @generated
   */
  void setOntologyURI(String value);

  /**
   * Returns the value of the '<em><b>Version URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version URI</em>' attribute.
   * @see #setVersionURI(String)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntology_VersionURI()
   * @model
   * @generated
   */
  String getVersionURI();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getVersionURI <em>Version URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version URI</em>' attribute.
   * @see #getVersionURI()
   * @generated
   */
  void setVersionURI(String value);

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntology_Packages()
   * @model containment="true"
   * @generated
   */
  EList<de.uniko.isweb.emftext.owl2fs.owl2fs.Package> getPackages();

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
