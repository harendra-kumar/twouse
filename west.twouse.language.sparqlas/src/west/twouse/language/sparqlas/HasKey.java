/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.HasKey#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.HasKey#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.HasKey#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getHasKey()
 * @model
 * @generated
 */
public interface HasKey extends Atom
{
  /**
   * Returns the value of the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Expression</em>' containment reference.
   * @see #setClassExpression(ClassExpression)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getHasKey_ClassExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ClassExpression getClassExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.HasKey#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
  void setClassExpression(ClassExpression value);

  /**
   * Returns the value of the '<em><b>Object Property Expression</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.ObjectPropertyExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getHasKey_ObjectPropertyExpression()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<ObjectPropertyExpression> getObjectPropertyExpression();

  /**
   * Returns the value of the '<em><b>Data Property Expression</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.DataPropertyExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expression</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getHasKey_DataPropertyExpression()
   * @model containment="true"
   * @generated
   */
  EList<DataPropertyExpression> getDataPropertyExpression();

} // HasKey
