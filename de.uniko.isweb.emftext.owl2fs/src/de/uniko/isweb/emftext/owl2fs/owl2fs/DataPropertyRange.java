/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange#getRange <em>Range</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDataPropertyRange()
 * @model
 * @generated
 */
public interface DataPropertyRange extends DataPropertyAxiom
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(DataRange)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDataPropertyRange_Range()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  DataRange getRange();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(DataRange value);

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
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDataPropertyRange_DataPropertyExpression()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  DataPropertyExpression getDataPropertyExpression();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange#getDataPropertyExpression <em>Data Property Expression</em>}' containment reference.
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
   * {self.range.arity = 1}
   * <!-- end-model-doc -->
   * @model
   * @generated
   */
  boolean Thedatarangemustbeofarityone(DiagnosticChain diagnostics);

} // DataPropertyRange
