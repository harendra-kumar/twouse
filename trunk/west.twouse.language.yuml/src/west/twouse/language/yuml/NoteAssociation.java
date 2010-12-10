/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.NoteAssociation#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.yuml.YumlPackage#getNoteAssociation()
 * @model
 * @generated
 */
public interface NoteAssociation extends Relationship {
	/**
   * Returns the value of the '<em><b>Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' containment reference.
   * @see #setNote(Note)
   * @see west.twouse.language.yuml.YumlPackage#getNoteAssociation_Note()
   * @model containment="true" required="true" ordered="false"
   * @generated
   */
	Note getNote();

	/**
   * Sets the value of the '{@link west.twouse.language.yuml.NoteAssociation#getNote <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' containment reference.
   * @see #getNote()
   * @generated
   */
	void setNote(Note value);

} // NoteAssociation
