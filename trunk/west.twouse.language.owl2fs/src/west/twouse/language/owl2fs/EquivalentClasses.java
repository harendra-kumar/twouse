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
 * A representation of the model object '<em><b>Equivalent Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.EquivalentClasses#getEquivalentClassExpressions <em>Equivalent Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getEquivalentClasses()
 * @model
 * @generated
 */
public interface EquivalentClasses extends ClassAxiom
{
  /**
   * Returns the value of the '<em><b>Equivalent Class Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.ClassExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equivalent Class Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equivalent Class Expressions</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getEquivalentClasses_EquivalentClassExpressions()
   * @model containment="true" lower="2"
   * @generated
   */
  EList<ClassExpression> getEquivalentClassExpressions();

} // EquivalentClasses
