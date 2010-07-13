/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Different Individuals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DifferentIndividuals#getDifferentIndividuals <em>Different Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDifferentIndividuals()
 * @model
 * @generated
 */
public interface DifferentIndividuals extends Assertion
{
  /**
   * Returns the value of the '<em><b>Different Individuals</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.NamedIndividual}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Different Individuals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Different Individuals</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDifferentIndividuals_DifferentIndividuals()
   * @model containment="true" lower="2" ordered="false"
   * @generated
   */
  EList<NamedIndividual> getDifferentIndividuals();

} // DifferentIndividuals
