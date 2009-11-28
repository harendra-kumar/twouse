/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual#getNodeID <em>Node ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getAnonymousIndividual()
 * @model
 * @generated
 */
public interface AnonymousIndividual extends Individual {
	/**
   * Returns the value of the '<em><b>Node ID</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Node ID</em>' attribute.
   * @see #setNodeID(String)
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getAnonymousIndividual_NodeID()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
	String getNodeID();

	/**
   * Sets the value of the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual#getNodeID <em>Node ID</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node ID</em>' attribute.
   * @see #getNodeID()
   * @generated
   */
	void setNodeID(String value);

} // AnonymousIndividual
