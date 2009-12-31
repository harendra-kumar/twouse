/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Constant Pair</b></em>'.
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
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair#getConstant <em>Constant</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair#getFacet <em>Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getFacetConstantPair()
 * @model
 * @generated
 */
public interface FacetConstantPair extends EObject
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
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getFacetConstantPair_Constant()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Literal getConstant();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(Literal value);

  /**
   * Returns the value of the '<em><b>Facet</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Facet</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facet</em>' attribute.
   * @see #setFacet(String)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getFacetConstantPair_Facet()
   * @model required="true" ordered="false"
   * @generated
   */
  String getFacet();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair#getFacet <em>Facet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Facet</em>' attribute.
   * @see #getFacet()
   * @generated
   */
  void setFacet(String value);

} // FacetConstantPair
