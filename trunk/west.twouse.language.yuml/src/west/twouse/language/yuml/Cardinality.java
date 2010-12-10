/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.Cardinality#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link west.twouse.language.yuml.Cardinality#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.yuml.YumlPackage#getCardinality()
 * @model
 * @generated
 */
public interface Cardinality extends EObject {
	/**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(String)
   * @see west.twouse.language.yuml.YumlPackage#getCardinality_LowerBound()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
	String getLowerBound();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Cardinality#getLowerBound <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(String value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' attribute.
   * @see #setUpperBound(String)
   * @see west.twouse.language.yuml.YumlPackage#getCardinality_UpperBound()
   * @model unique="false" ordered="false"
   * @generated
   */
	String getUpperBound();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.Cardinality#getUpperBound <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(String value);

} // Cardinality
