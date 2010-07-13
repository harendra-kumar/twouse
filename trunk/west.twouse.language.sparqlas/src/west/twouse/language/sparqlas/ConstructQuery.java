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
 * A representation of the model object '<em><b>Construct Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.ConstructQuery#getConstructAtoms <em>Construct Atoms</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.ConstructQuery#getWhereAtoms <em>Where Atoms</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getConstructQuery()
 * @model
 * @generated
 */
public interface ConstructQuery extends Query, TemplateableElement
{
  /**
   * Returns the value of the '<em><b>Construct Atoms</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.Atom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Construct Atoms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Construct Atoms</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getConstructQuery_ConstructAtoms()
   * @model containment="true"
   * @generated
   */
  EList<Atom> getConstructAtoms();

  /**
   * Returns the value of the '<em><b>Where Atoms</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.Atom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Atoms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Atoms</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getConstructQuery_WhereAtoms()
   * @model containment="true"
   * @generated
   */
  EList<Atom> getWhereAtoms();

} // ConstructQuery
