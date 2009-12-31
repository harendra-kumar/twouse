/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getHasAntecedent <em>Has Antecedent</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getHasConsequent <em>Has Consequent</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getSwrlVariables <em>Swrl Variables</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends Axiom
{
  /**
   * Returns the value of the '<em><b>Has Antecedent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Antecedent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Antecedent</em>' containment reference.
   * @see #setHasAntecedent(Antecedent)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getRule_HasAntecedent()
   * @model containment="true" required="true"
   * @generated
   */
  Antecedent getHasAntecedent();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getHasAntecedent <em>Has Antecedent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Antecedent</em>' containment reference.
   * @see #getHasAntecedent()
   * @generated
   */
  void setHasAntecedent(Antecedent value);

  /**
   * Returns the value of the '<em><b>Has Consequent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Consequent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Consequent</em>' containment reference.
   * @see #setHasConsequent(Consequent)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getRule_HasConsequent()
   * @model containment="true" required="true"
   * @generated
   */
  Consequent getHasConsequent();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getHasConsequent <em>Has Consequent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Consequent</em>' containment reference.
   * @see #getHasConsequent()
   * @generated
   */
  void setHasConsequent(Consequent value);

  /**
   * Returns the value of the '<em><b>Swrl Variables</b></em>' containment reference list.
   * The list contents are of type {@link de.uniko.isweb.emftext.owl2fs.owl2fs.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Swrl Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Swrl Variables</em>' containment reference list.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getRule_SwrlVariables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getSwrlVariables();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getRule_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Rule
