/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.FacetRestriction#getConstrainingFacet <em>Constraining Facet</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.FacetRestriction#getRestrictionValue <em>Restriction Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getFacetRestriction()
 * @model
 * @generated
 */
public interface FacetRestriction extends EObject {
	/**
   * Returns the value of the '<em><b>Constraining Facet</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraining Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Constraining Facet</em>' containment reference.
   * @see #setConstrainingFacet(IRI)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getFacetRestriction_ConstrainingFacet()
   * @model containment="true" required="true"
   * @generated
   */
	IRI getConstrainingFacet();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.FacetRestriction#getConstrainingFacet <em>Constraining Facet</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraining Facet</em>' containment reference.
   * @see #getConstrainingFacet()
   * @generated
   */
	void setConstrainingFacet(IRI value);

	/**
   * Returns the value of the '<em><b>Restriction Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Restriction Value</em>' containment reference.
   * @see #setRestrictionValue(AbstractLiteral)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getFacetRestriction_RestrictionValue()
   * @model containment="true" required="true"
   * @generated
   */
	AbstractLiteral getRestrictionValue();

	/**
   * Sets the value of the '{@link west.twouse.language.sparqlas.FacetRestriction#getRestrictionValue <em>Restriction Value</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Restriction Value</em>' containment reference.
   * @see #getRestrictionValue()
   * @generated
   */
	void setRestrictionValue(AbstractLiteral value);

} // FacetRestriction
