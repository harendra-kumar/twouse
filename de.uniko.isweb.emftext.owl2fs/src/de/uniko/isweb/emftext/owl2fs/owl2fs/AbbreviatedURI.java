/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abbreviated URI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI#getLocalName <em>Local Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getAbbreviatedURI()
 * @model
 * @generated
 */
public interface AbbreviatedURI extends EObject
{
  /**
   * Returns the value of the '<em><b>Local Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Name</em>' attribute.
   * @see #setLocalName(String)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getAbbreviatedURI_LocalName()
   * @model required="true" ordered="false"
   * @generated
   */
  String getLocalName();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI#getLocalName <em>Local Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Name</em>' attribute.
   * @see #getLocalName()
   * @generated
   */
  void setLocalName(String value);

} // AbbreviatedURI
