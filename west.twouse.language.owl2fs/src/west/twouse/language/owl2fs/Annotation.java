/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.Annotation#getAnnotationAnnotations <em>Annotation Annotations</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Annotation#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Annotation#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation Annotations</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Annotations</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotation_AnnotationAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotationAnnotations();

  /**
   * Returns the value of the '<em><b>Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Property</em>' containment reference.
   * @see #setAnnotationProperty(AnnotationProperty)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotation_AnnotationProperty()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  AnnotationProperty getAnnotationProperty();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.Annotation#getAnnotationProperty <em>Annotation Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Property</em>' containment reference.
   * @see #getAnnotationProperty()
   * @generated
   */
  void setAnnotationProperty(AnnotationProperty value);

  /**
   * Returns the value of the '<em><b>Annotation Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Value</em>' containment reference.
   * @see #setAnnotationValue(AnnotationValue)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotation_AnnotationValue()
   * @model containment="true" required="true"
   * @generated
   */
  AnnotationValue getAnnotationValue();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.Annotation#getAnnotationValue <em>Annotation Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Value</em>' containment reference.
   * @see #getAnnotationValue()
   * @generated
   */
  void setAnnotationValue(AnnotationValue value);

} // Annotation
