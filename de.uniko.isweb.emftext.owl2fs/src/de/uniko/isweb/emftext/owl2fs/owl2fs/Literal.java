/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Literal#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Literal#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Constant, DObject
{
  /**
   * Returns the value of the '<em><b>Lexical Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lexical Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lexical Value</em>' attribute.
   * @see #setLexicalValue(String)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getLiteral_LexicalValue()
   * @model required="true" ordered="false"
   * @generated
   */
  String getLexicalValue();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Literal#getLexicalValue <em>Lexical Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lexical Value</em>' attribute.
   * @see #getLexicalValue()
   * @generated
   */
  void setLexicalValue(String value);

  /**
   * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' containment reference.
   * @see #setDatatype(Datatype)
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getLiteral_Datatype()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
  Datatype getDatatype();

  /**
   * Sets the value of the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Literal#getDatatype <em>Datatype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' containment reference.
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(Datatype value);

} // Literal
