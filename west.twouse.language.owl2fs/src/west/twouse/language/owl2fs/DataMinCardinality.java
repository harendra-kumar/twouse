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
 * A representation of the model object '<em><b>Data Min Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DataMinCardinality#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DataMinCardinality#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DataMinCardinality#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataMinCardinality()
 * @model
 * @generated
 */
public interface DataMinCardinality extends ClassExpression, Expression
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataMinCardinality_Cardinality()
   * @model required="true" ordered="false"
   * @generated
   */
  int getCardinality();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataMinCardinality#getCardinality <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' attribute.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(int value);

  /**
   * Returns the value of the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Range</em>' containment reference.
   * @see #setDataRange(DataRange)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataMinCardinality_DataRange()
   * @model containment="true" ordered="false"
   * @generated
   */
  DataRange getDataRange();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataMinCardinality#getDataRange <em>Data Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Range</em>' containment reference.
   * @see #getDataRange()
   * @generated
   */
  void setDataRange(DataRange value);

  /**
   * Returns the value of the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expression</em>' containment reference.
   * @see #setDataPropertyExpression(DataPropertyExpression)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataMinCardinality_DataPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  DataPropertyExpression getDataPropertyExpression();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataMinCardinality#getDataPropertyExpression <em>Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Property Expression</em>' containment reference.
   * @see #getDataPropertyExpression()
   * @generated
   */
  void setDataPropertyExpression(DataPropertyExpression value);

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

} // DataMinCardinality
