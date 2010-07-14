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
 * A representation of the model object '<em><b>Same Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.SameIndividual#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getSameIndividual()
 * @model
 * @generated
 */
public interface SameIndividual extends Assertion
{
  /**
   * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.Individual}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Individuals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Individuals</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getSameIndividual_Individuals()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<Individual> getIndividuals();

} // SameIndividual
