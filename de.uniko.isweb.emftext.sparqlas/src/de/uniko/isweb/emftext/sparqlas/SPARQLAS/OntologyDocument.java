/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;

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
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument#getPrefixDefinition <em>Prefix Definition</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getOntologyDocument()
 * @model
 * @generated
 */
public interface OntologyDocument extends EObject {
	/**
   * Returns the value of the '<em><b>Prefix Definition</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix Definition</em>' containment reference list.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getOntologyDocument_PrefixDefinition()
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
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getOntologyDocument_Query()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	Query getQuery();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
	void setQuery(Query value);

} // OntologyDocument
