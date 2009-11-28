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
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query#getQueryIRI <em>Query IRI</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query#getAtoms <em>Atoms</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject {
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
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getQuery_QueryIRI()
   * @model containment="true" ordered="false"
   * @generated
   */
	IRI getQueryIRI();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query#getQueryIRI <em>Query IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query IRI</em>' containment reference.
   * @see #getQueryIRI()
   * @generated
   */
	void setQueryIRI(IRI value);

	/**
   * Returns the value of the '<em><b>Atoms</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atoms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Atoms</em>' containment reference list.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getQuery_Atoms()
   * @model containment="true"
   * @generated
   */
	EList<Atom> getAtoms();

} // Query
