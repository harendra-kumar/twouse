/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data One Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf#getConstants <em>Constants</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDataOneOf()
 * @model
 * @generated
 */
public interface DataOneOf extends DataRange, Expression
{
  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.Literal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDataOneOf_Constants()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  EList<Literal> getConstants();

} // DataOneOf
