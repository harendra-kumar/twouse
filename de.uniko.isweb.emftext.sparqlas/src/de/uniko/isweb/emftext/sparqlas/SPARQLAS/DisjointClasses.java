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
 * A representation of the model object '<em><b>Disjoint Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses#getClassExpressions <em>Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getDisjointClasses()
 * @model
 * @generated
 */
public interface DisjointClasses extends ClassAtom {
	/**
   * Returns the value of the '<em><b>Class Expressions</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Class Expressions</em>' containment reference list.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#getDisjointClasses_ClassExpressions()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
	EList<ClassExpression> getClassExpressions();

} // DisjointClasses
