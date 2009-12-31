/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

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
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument#getOntology <em>Ontology</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument#getPrefixDefinition <em>Prefix Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntologyDocument()
 * @model
 * @generated
 */
public interface OntologyDocument extends EObject
{
  /**
   * Returns the value of the '<em><b>Ontology</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ontology</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ontology</em>' containment reference.
   * @see #setOntology(Ontology)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntologyDocument_Ontology()
   * @model containment="true" required="true"
   * @generated
   */
  Ontology getOntology();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument#getOntology <em>Ontology</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ontology</em>' containment reference.
   * @see #getOntology()
   * @generated
   */
  void setOntology(Ontology value);

  /**
   * Returns the value of the '<em><b>Prefix Definition</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix Definition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix Definition</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getOntologyDocument_PrefixDefinition()
   * @model containment="true" required="true"
   * @generated
   */
  EList<PrefixDefinition> getPrefixDefinition();

} // OntologyDocument
