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
 * A representation of the model object '<em><b>Object One Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.ObjectOneOf#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectOneOf()
 * @model
 * @generated
 */
public interface ObjectOneOf extends ClassExpression, Expression
{
  /**
   * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Individual}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Individuals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Individuals</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectOneOf_Individuals()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  EList<Individual> getIndividuals();

} // ObjectOneOf
