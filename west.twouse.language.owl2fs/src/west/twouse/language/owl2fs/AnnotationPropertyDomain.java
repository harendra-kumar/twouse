/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Property Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.AnnotationPropertyDomain#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.AnnotationPropertyDomain#getIri <em>Iri</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotationPropertyDomain()
 * @model
 * @generated
 */
public interface AnnotationPropertyDomain extends AnnotationAxiom
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotationPropertyDomain_AnnotationProperty()
   * @model containment="true" required="true"
   * @generated
   */
  AnnotationProperty getAnnotationProperty();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.AnnotationPropertyDomain#getAnnotationProperty <em>Annotation Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation Property</em>' containment reference.
   * @see #getAnnotationProperty()
   * @generated
   */
  void setAnnotationProperty(AnnotationProperty value);

  /**
   * Returns the value of the '<em><b>Iri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iri</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iri</em>' containment reference.
   * @see #setIri(IRI)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotationPropertyDomain_Iri()
   * @model containment="true" required="true"
   * @generated
   */
  IRI getIri();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.AnnotationPropertyDomain#getIri <em>Iri</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iri</em>' containment reference.
   * @see #getIri()
   * @generated
   */
  void setIri(IRI value);

} // AnnotationPropertyDomain
