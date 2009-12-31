/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation By Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getAnnotationByConstant()
 * @model
 * @generated
 */
public interface AnnotationByConstant extends Annotation
{
  /**
   * Returns the value of the '<em><b>Annotation Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Value</em>' containment reference.
   * @see #setAnnotationValue(Literal)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getAnnotationByConstant_AnnotationValue()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Literal getAnnotationValue();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant#getAnnotationValue <em>Annotation Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Value</em>' containment reference.
   * @see #getAnnotationValue()
   * @generated
   */
  void setAnnotationValue(Literal value);

} // AnnotationByConstant
