/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.Literal#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Literal#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.Literal#getLanguageTag <em>Language Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends AnnotationValue, DArg
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getLiteral_LexicalValue()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  String getLexicalValue();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.Literal#getLexicalValue <em>Lexical Value</em>}' attribute.
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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getLiteral_Datatype()
   * @model containment="true" ordered="false"
   * @generated
   */
  Datatype getDatatype();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.Literal#getDatatype <em>Datatype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' containment reference.
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(Datatype value);

  /**
   * Returns the value of the '<em><b>Language Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language Tag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language Tag</em>' attribute.
   * @see #setLanguageTag(String)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getLiteral_LanguageTag()
   * @model
   * @generated
   */
  String getLanguageTag();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.Literal#getLanguageTag <em>Language Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language Tag</em>' attribute.
   * @see #getLanguageTag()
   * @generated
   */
  void setLanguageTag(String value);

} // Literal
