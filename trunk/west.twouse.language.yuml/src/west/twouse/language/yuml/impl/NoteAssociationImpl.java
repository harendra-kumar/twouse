/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import west.twouse.language.yuml.Note;
import west.twouse.language.yuml.NoteAssociation;
import west.twouse.language.yuml.YumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.impl.NoteAssociationImpl#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoteAssociationImpl extends RelationshipImpl implements NoteAssociation {
	/**
   * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
	protected Note note;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NoteAssociationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return YumlPackage.Literals.NOTE_ASSOCIATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Note getNote() {
    return note;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetNote(Note newNote, NotificationChain msgs) {
    Note oldNote = note;
    note = newNote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YumlPackage.NOTE_ASSOCIATION__NOTE, oldNote, newNote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNote(Note newNote) {
    if (newNote != note)
    {
      NotificationChain msgs = null;
      if (note != null)
        msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YumlPackage.NOTE_ASSOCIATION__NOTE, null, msgs);
      if (newNote != null)
        msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YumlPackage.NOTE_ASSOCIATION__NOTE, null, msgs);
      msgs = basicSetNote(newNote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.NOTE_ASSOCIATION__NOTE, newNote, newNote));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case YumlPackage.NOTE_ASSOCIATION__NOTE:
        return basicSetNote(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case YumlPackage.NOTE_ASSOCIATION__NOTE:
        return getNote();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case YumlPackage.NOTE_ASSOCIATION__NOTE:
        setNote((Note)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case YumlPackage.NOTE_ASSOCIATION__NOTE:
        setNote((Note)null);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case YumlPackage.NOTE_ASSOCIATION__NOTE:
        return note != null;
    }
    return super.eIsSet(featureID);
  }

} //NoteAssociationImpl
