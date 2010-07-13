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
 * A representation of the model object '<em><b>Prefix Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.PrefixDefinition#getPref <em>Pref</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.PrefixDefinition#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getPrefixDefinition()
 * @model
 * @generated
 */
public interface PrefixDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pref</em>' attribute.
   * @see #setPref(String)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getPrefixDefinition_Pref()
   * @model
   * @generated
   */
  String getPref();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.PrefixDefinition#getPref <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pref</em>' attribute.
   * @see #getPref()
   * @generated
   */
  void setPref(String value);

  /**
   * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' containment reference.
   * @see #setNamespace(FullIRI)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getPrefixDefinition_Namespace()
   * @model containment="true" required="true"
   * @generated
   */
  FullIRI getNamespace();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.PrefixDefinition#getNamespace <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' containment reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(FullIRI value);

} // PrefixDefinition
