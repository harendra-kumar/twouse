/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Propety Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DataPropetyAtom#getDataProperty <em>Data Property</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DataPropetyAtom#getIArg <em>IArg</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DataPropetyAtom#getDArg <em>DArg</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataPropetyAtom()
 * @model
 * @generated
 */
public interface DataPropetyAtom extends Atom
{
  /**
   * Returns the value of the '<em><b>Data Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Property</em>' containment reference.
   * @see #setDataProperty(DataProperty)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataPropetyAtom_DataProperty()
   * @model containment="true" required="true"
   * @generated
   */
  DataProperty getDataProperty();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataPropetyAtom#getDataProperty <em>Data Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Property</em>' containment reference.
   * @see #getDataProperty()
   * @generated
   */
  void setDataProperty(DataProperty value);

  /**
   * Returns the value of the '<em><b>IArg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>IArg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>IArg</em>' containment reference.
   * @see #setIArg(IArg)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataPropetyAtom_IArg()
   * @model containment="true" required="true" derived="true"
   * @generated
   */
  IArg getIArg();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataPropetyAtom#getIArg <em>IArg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>IArg</em>' containment reference.
   * @see #getIArg()
   * @generated
   */
  void setIArg(IArg value);

  /**
   * Returns the value of the '<em><b>DArg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DArg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DArg</em>' containment reference.
   * @see #setDArg(DArg)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataPropetyAtom_DArg()
   * @model containment="true" required="true" derived="true"
   * @generated
   */
  DArg getDArg();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataPropetyAtom#getDArg <em>DArg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DArg</em>' containment reference.
   * @see #getDArg()
   * @generated
   */
  void setDArg(DArg value);

} // DataPropetyAtom
