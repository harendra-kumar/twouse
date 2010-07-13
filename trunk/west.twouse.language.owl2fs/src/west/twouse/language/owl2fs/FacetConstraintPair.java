/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Constraint Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * self.facet = 'length' 
 * or self.facet = 'minLength' 
 * or self.facet = 'maxLength' 
 * or self.facet = 'pattern' 
 * or self.facet = 'minInclusive' 
 * or self.facet = 'minExclusive' 
 * or self.facet = 'maxInclusive'
 * or self.facet = 'maxExclusive'
 * or self.facet = 'totalDigits' 
 * or self.facet = 'fractionDigits'
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.FacetConstraintPair#getConstant <em>Constant</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.FacetConstraintPair#getFacet <em>Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getFacetConstraintPair()
 * @model
 * @generated
 */
public interface FacetConstraintPair extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(Literal)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getFacetConstraintPair_Constant()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Literal getConstant();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.FacetConstraintPair#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(Literal value);

  /**
   * Returns the value of the '<em><b>Facet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facet</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facet</em>' containment reference.
   * @see #setFacet(IRI)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getFacetConstraintPair_Facet()
   * @model containment="true" required="true"
   * @generated
   */
  IRI getFacet();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.FacetConstraintPair#getFacet <em>Facet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Facet</em>' containment reference.
   * @see #getFacet()
   * @generated
   */
  void setFacet(IRI value);

} // FacetConstraintPair
