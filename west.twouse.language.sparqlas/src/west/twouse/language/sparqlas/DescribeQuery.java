/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Describe Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.DescribeQuery#getDescribeIRI <em>Describe IRI</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.DescribeQuery#getAtoms <em>Atoms</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getDescribeQuery()
 * @model
 * @generated
 */
public interface DescribeQuery extends Query, TemplateableElement
{
  /**
   * Returns the value of the '<em><b>Describe IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Describe IRI</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Describe IRI</em>' containment reference.
   * @see #setDescribeIRI(IRI)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDescribeQuery_DescribeIRI()
   * @model containment="true" ordered="false"
   * @generated
   */
  IRI getDescribeIRI();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.DescribeQuery#getDescribeIRI <em>Describe IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Describe IRI</em>' containment reference.
   * @see #getDescribeIRI()
   * @generated
   */
  void setDescribeIRI(IRI value);

  /**
   * Returns the value of the '<em><b>Atoms</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.Atom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atoms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atoms</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDescribeQuery_Atoms()
   * @model containment="true"
   * @generated
   */
  EList<Atom> getAtoms();

} // DescribeQuery
