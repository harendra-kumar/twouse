/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object One Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getObjectOneOf()
 * @model
 * @generated
 */
public interface ObjectOneOf extends ClassExpression {
	/**
   * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individuals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Individuals</em>' containment reference list.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getObjectOneOf_Individuals()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	EList<Individual> getIndividuals();

} // ObjectOneOf
