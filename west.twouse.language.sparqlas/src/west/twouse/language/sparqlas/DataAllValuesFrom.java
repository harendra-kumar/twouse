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
 * A representation of the model object '<em><b>Data All Values From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.DataAllValuesFrom#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.DataAllValuesFrom#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getDataAllValuesFrom()
 * @model
 * @generated
 */
public interface DataAllValuesFrom extends ClassExpression
{
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
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDataAllValuesFrom_DataRange()
   * @model containment="true" required="true"
   * @generated
   */
  DataRange getDataRange();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.DataAllValuesFrom#getDataRange <em>Data Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Range</em>' containment reference.
   * @see #getDataRange()
   * @generated
   */
  void setDataRange(DataRange value);

  /**
   * Returns the value of the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * The list contents are of type {@link west.twouse.language.sparqlas.DataPropertyExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Property Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property Expressions</em>' containment reference list.
   * @see west.twouse.language.sparqlas.SparqlasPackage#getDataAllValuesFrom_DataPropertyExpressions()
   * @model containment="true" required="true"
   * @generated
   */
  EList<DataPropertyExpression> getDataPropertyExpressions();

} // DataAllValuesFrom
