/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#getEntity <em>Entity</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsFunctional <em>Is Functional</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsReflexive <em>Is Reflexive</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsInverseFunctional <em>Is Inverse Functional</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsIrreflexive <em>Is Irreflexive</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsSymmetric <em>Is Symmetric</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsTransitive <em>Is Transitive</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsAsysmmetric <em>Is Asysmmetric</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends Axiom
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(Entity)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDeclaration_Entity()
   * @model containment="true"
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Is Functional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Functional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Functional</em>' attribute.
   * @see #setIsFunctional(boolean)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDeclaration_IsFunctional()
   * @model derived="true"
   * @generated
   */
  boolean isIsFunctional();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsFunctional <em>Is Functional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Functional</em>' attribute.
   * @see #isIsFunctional()
   * @generated
   */
  void setIsFunctional(boolean value);

  /**
   * Returns the value of the '<em><b>Is Reflexive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Reflexive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Reflexive</em>' attribute.
   * @see #setIsReflexive(boolean)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDeclaration_IsReflexive()
   * @model derived="true"
   * @generated
   */
  boolean isIsReflexive();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsReflexive <em>Is Reflexive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Reflexive</em>' attribute.
   * @see #isIsReflexive()
   * @generated
   */
  void setIsReflexive(boolean value);

  /**
   * Returns the value of the '<em><b>Is Inverse Functional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Inverse Functional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Inverse Functional</em>' attribute.
   * @see #setIsInverseFunctional(boolean)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDeclaration_IsInverseFunctional()
   * @model derived="true"
   * @generated
   */
  boolean isIsInverseFunctional();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsInverseFunctional <em>Is Inverse Functional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Inverse Functional</em>' attribute.
   * @see #isIsInverseFunctional()
   * @generated
   */
  void setIsInverseFunctional(boolean value);

  /**
   * Returns the value of the '<em><b>Is Irreflexive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Irreflexive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Irreflexive</em>' attribute.
   * @see #setIsIrreflexive(boolean)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDeclaration_IsIrreflexive()
   * @model derived="true"
   * @generated
   */
  boolean isIsIrreflexive();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsIrreflexive <em>Is Irreflexive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Irreflexive</em>' attribute.
   * @see #isIsIrreflexive()
   * @generated
   */
  void setIsIrreflexive(boolean value);

  /**
   * Returns the value of the '<em><b>Is Symmetric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Symmetric</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Symmetric</em>' attribute.
   * @see #setIsSymmetric(boolean)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDeclaration_IsSymmetric()
   * @model derived="true"
   * @generated
   */
  boolean isIsSymmetric();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsSymmetric <em>Is Symmetric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Symmetric</em>' attribute.
   * @see #isIsSymmetric()
   * @generated
   */
  void setIsSymmetric(boolean value);

  /**
   * Returns the value of the '<em><b>Is Transitive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Transitive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Transitive</em>' attribute.
   * @see #setIsTransitive(boolean)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDeclaration_IsTransitive()
   * @model derived="true"
   * @generated
   */
  boolean isIsTransitive();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsTransitive <em>Is Transitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Transitive</em>' attribute.
   * @see #isIsTransitive()
   * @generated
   */
  void setIsTransitive(boolean value);

  /**
   * Returns the value of the '<em><b>Is Asysmmetric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Asysmmetric</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Asysmmetric</em>' attribute.
   * @see #setIsAsysmmetric(boolean)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getDeclaration_IsAsysmmetric()
   * @model derived="true"
   * @generated
   */
  boolean isIsAsysmmetric();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsAsysmmetric <em>Is Asysmmetric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Asysmmetric</em>' attribute.
   * @see #isIsAsysmmetric()
   * @generated
   */
  void setIsAsysmmetric(boolean value);

} // Declaration
