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
 * A representation of the model object '<em><b>Ask Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.AskQuery#getAtoms <em>Atoms</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getAskQuery()
 * @model
 * @generated
 */
public interface AskQuery extends Query, TemplateableElement
{
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
   * @see west.twouse.language.sparqlas.SparqlasPackage#getAskQuery_Atoms()
   * @model containment="true"
   * @generated
   */
  EList<Atom> getAtoms();

} // AskQuery
