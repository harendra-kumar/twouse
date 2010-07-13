/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Range Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.DataRangeAtom#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.DataRangeAtom#getDArg <em>DArg</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataRangeAtom()
 * @model
 * @generated
 */
public interface DataRangeAtom extends Atom
{
  /**
   * Returns the value of the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Range</em>' containment reference.
   * @see #setDataRange(DataRange)
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataRangeAtom_DataRange()
   * @model containment="true" required="true"
   * @generated
   */
  DataRange getDataRange();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataRangeAtom#getDataRange <em>Data Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Range</em>' containment reference.
   * @see #getDataRange()
   * @generated
   */
  void setDataRange(DataRange value);

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
   * @see west.twouse.language.owl2fs.Owl2fsPackage#getDataRangeAtom_DArg()
   * @model containment="true" required="true"
   * @generated
   */
  DArg getDArg();

  /**
   * Sets the value of the '{@link west.twouse.language.owl2fs.DataRangeAtom#getDArg <em>DArg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DArg</em>' containment reference.
   * @see #getDArg()
   * @generated
   */
  void setDArg(DArg value);

} // DataRangeAtom
