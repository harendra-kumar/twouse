/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationSubject <em>Annotation Subject</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotationAssertion()
 * @model
 * @generated
 */
public interface AnnotationAssertion extends AnnotationAxiom
{
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotationAssertion_AnnotationProperty()
   * @model containment="true" required="true"
   * @generated
   */
  AnnotationProperty getAnnotationProperty();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationProperty <em>Annotation Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Property</em>' containment reference.
   * @see #getAnnotationProperty()
   * @generated
   */
  void setAnnotationProperty(AnnotationProperty value);

  /**
   * Returns the value of the '<em><b>Annotation Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation Subject</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Subject</em>' containment reference.
   * @see #setAnnotationSubject(AnnotationSubject)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotationAssertion_AnnotationSubject()
   * @model containment="true" required="true"
   * @generated
   */
  AnnotationSubject getAnnotationSubject();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationSubject <em>Annotation Subject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Subject</em>' containment reference.
   * @see #getAnnotationSubject()
   * @generated
   */
  void setAnnotationSubject(AnnotationSubject value);

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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotationAssertion_AnnotationValue()
   * @model containment="true" required="true"
   * @generated
   */
  AnnotationValue getAnnotationValue();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationValue <em>Annotation Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Value</em>' containment reference.
   * @see #getAnnotationValue()
   * @generated
   */
  void setAnnotationValue(AnnotationValue value);

} // AnnotationAssertion
