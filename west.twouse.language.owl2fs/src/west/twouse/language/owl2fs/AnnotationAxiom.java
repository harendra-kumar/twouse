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
 * A representation of the model object '<em><b>Annotation Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.AnnotationAxiom#getAxiomAnnotations <em>Axiom Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotationAxiom()
 * @model abstract="true"
 * @generated
 */
public interface AnnotationAxiom extends Axiom
{
  /**
   * Returns the value of the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axiom Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axiom Annotations</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getAnnotationAxiom_AxiomAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAxiomAnnotations();

} // AnnotationAxiom
