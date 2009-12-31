/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDatatype()
 * @model
 * @generated
 */
public interface Datatype extends DataRange, Entity
{
  /**
   * Returns the value of the '<em><b>Data Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' attribute.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps
   * @see #setDataType(DataTypeMaps)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDatatype_DataType()
   * @model required="true"
   * @generated
   */
  DataTypeMaps getDataType();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype#getDataType <em>Data Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' attribute.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataTypeMaps value);

} // Datatype
