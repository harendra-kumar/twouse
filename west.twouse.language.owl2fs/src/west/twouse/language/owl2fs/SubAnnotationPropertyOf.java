/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Annotation Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.SubAnnotationPropertyOf#getSubAnnotationProperty <em>Sub Annotation Property</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.SubAnnotationPropertyOf#getSuperAnnotationProperty <em>Super Annotation Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getSubAnnotationPropertyOf()
 * @model
 * @generated
 */
public interface SubAnnotationPropertyOf extends AnnotationAxiom
{
  /**
   * Returns the value of the '<em><b>Sub Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Annotation Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Annotation Property</em>' containment reference.
   * @see #setSubAnnotationProperty(AnnotationProperty)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getSubAnnotationPropertyOf_SubAnnotationProperty()
   * @model containment="true" required="true"
   * @generated
   */
  AnnotationProperty getSubAnnotationProperty();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.SubAnnotationPropertyOf#getSubAnnotationProperty <em>Sub Annotation Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Annotation Property</em>' containment reference.
   * @see #getSubAnnotationProperty()
   * @generated
   */
  void setSubAnnotationProperty(AnnotationProperty value);

  /**
   * Returns the value of the '<em><b>Super Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Annotation Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Annotation Property</em>' containment reference.
   * @see #setSuperAnnotationProperty(AnnotationProperty)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getSubAnnotationPropertyOf_SuperAnnotationProperty()
   * @model containment="true" required="true"
   * @generated
   */
  AnnotationProperty getSuperAnnotationProperty();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.SubAnnotationPropertyOf#getSuperAnnotationProperty <em>Super Annotation Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Annotation Property</em>' containment reference.
   * @see #getSuperAnnotationProperty()
   * @generated
   */
  void setSuperAnnotationProperty(AnnotationProperty value);

} // SubAnnotationPropertyOf
