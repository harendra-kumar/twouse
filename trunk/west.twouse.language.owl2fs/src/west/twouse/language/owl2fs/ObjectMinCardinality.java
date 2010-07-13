/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Min Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.ObjectMinCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.ObjectMinCardinality#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.ObjectMinCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectMinCardinality()
 * @model
 * @generated
 */
public interface ObjectMinCardinality extends ClassExpression, Expression
{
  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' attribute.
   * @see #setCardinality(int)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectMinCardinality_Cardinality()
   * @model required="true" ordered="false"
   * @generated
   */
  int getCardinality();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ObjectMinCardinality#getCardinality <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' attribute.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(int value);

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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectMinCardinality_ClassExpression()
   * @model containment="true" ordered="false"
   * @generated
   */
  ClassExpression getClassExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ObjectMinCardinality#getClassExpression <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Expression</em>' containment reference.
   * @see #getClassExpression()
   * @generated
   */
  void setClassExpression(ClassExpression value);

  /**
   * Returns the value of the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Property Expression</em>' containment reference.
   * @see #setObjectPropertyExpression(ObjectPropertyExpression)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getObjectMinCardinality_ObjectPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  ObjectPropertyExpression getObjectPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.ObjectMinCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Property Expression</em>' containment reference.
   * @see #getObjectPropertyExpression()
   * @generated
   */
  void setObjectPropertyExpression(ObjectPropertyExpression value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.cardinality>=0
   * <!-- end-model-doc -->
   * @model
   * @generated
   */
  boolean Thecardinalitymustbenonnegative(DiagnosticChain diagnostics);

} // ObjectMinCardinality
