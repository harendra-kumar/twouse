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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.Package#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Package#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Package#getPackageUri <em>Package Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends TemplateableElement
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getPackage_Expressions()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Expression> getExpressions();

  /**
   * Returns the value of the '<em><b>Axioms</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.owl2fs.Axiom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axioms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axioms</em>' containment reference list.
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getPackage_Axioms()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Axiom> getAxioms();

  /**
   * Returns the value of the '<em><b>Package Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Uri</em>' attribute.
   * @see #setPackageUri(String)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getPackage_PackageUri()
   * @model
   * @generated
   */
  String getPackageUri();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.Package#getPackageUri <em>Package Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Uri</em>' attribute.
   * @see #getPackageUri()
   * @generated
   */
  void setPackageUri(String value);

} // Package
