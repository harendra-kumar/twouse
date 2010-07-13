/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import west.twouse.language.owl2fs.DArg;
import west.twouse.language.owl2fs.DataProperty;
import west.twouse.language.owl2fs.DataPropetyAtom;
import west.twouse.language.owl2fs.IArg;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Propety Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.DataPropetyAtomImpl#getDataProperty <em>Data Property</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DataPropetyAtomImpl#getIArg <em>IArg</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DataPropetyAtomImpl#getDArg <em>DArg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropetyAtomImpl extends AtomImpl implements DataPropetyAtom
{
  /**
   * The cached value of the '{@link #getDataProperty() <em>Data Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataProperty()
   * @generated
   * @ordered
   */
  protected DataProperty dataProperty;

  /**
   * The cached value of the '{@link #getIArg() <em>IArg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIArg()
   * @generated
   * @ordered
   */
  protected IArg iArg;

  /**
   * The cached value of the '{@link #getDArg() <em>DArg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDArg()
   * @generated
   * @ordered
   */
  protected DArg dArg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataPropetyAtomImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Owl2fsPackage.Literals.DATA_PROPETY_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataProperty getDataProperty()
  {
    return dataProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataProperty(DataProperty newDataProperty, NotificationChain msgs)
  {
    DataProperty oldDataProperty = dataProperty;
    dataProperty = newDataProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY, oldDataProperty, newDataProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataProperty(DataProperty newDataProperty)
  {
    if (newDataProperty != dataProperty)
    {
      NotificationChain msgs = null;
      if (dataProperty != null)
        msgs = ((InternalEObject)dataProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY, null, msgs);
      if (newDataProperty != null)
        msgs = ((InternalEObject)newDataProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY, null, msgs);
      msgs = basicSetDataProperty(newDataProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY, newDataProperty, newDataProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IArg getIArg()
  {
    return iArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIArg(IArg newIArg, NotificationChain msgs)
  {
    IArg oldIArg = iArg;
    iArg = newIArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPETY_ATOM__IARG, oldIArg, newIArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIArg(IArg newIArg)
  {
    if (newIArg != iArg)
    {
      NotificationChain msgs = null;
      if (iArg != null)
        msgs = ((InternalEObject)iArg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPETY_ATOM__IARG, null, msgs);
      if (newIArg != null)
        msgs = ((InternalEObject)newIArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPETY_ATOM__IARG, null, msgs);
      msgs = basicSetIArg(newIArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPETY_ATOM__IARG, newIArg, newIArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DArg getDArg()
  {
    return dArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDArg(DArg newDArg, NotificationChain msgs)
  {
    DArg oldDArg = dArg;
    dArg = newDArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPETY_ATOM__DARG, oldDArg, newDArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDArg(DArg newDArg)
  {
    if (newDArg != dArg)
    {
      NotificationChain msgs = null;
      if (dArg != null)
        msgs = ((InternalEObject)dArg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPETY_ATOM__DARG, null, msgs);
      if (newDArg != null)
        msgs = ((InternalEObject)newDArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPETY_ATOM__DARG, null, msgs);
      msgs = basicSetDArg(newDArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPETY_ATOM__DARG, newDArg, newDArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY:
        return basicSetDataProperty(null, msgs);
      case Owl2fsPackage.DATA_PROPETY_ATOM__IARG:
        return basicSetIArg(null, msgs);
      case Owl2fsPackage.DATA_PROPETY_ATOM__DARG:
        return basicSetDArg(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY:
        return getDataProperty();
      case Owl2fsPackage.DATA_PROPETY_ATOM__IARG:
        return getIArg();
      case Owl2fsPackage.DATA_PROPETY_ATOM__DARG:
        return getDArg();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY:
        setDataProperty((DataProperty)newValue);
        return;
      case Owl2fsPackage.DATA_PROPETY_ATOM__IARG:
        setIArg((IArg)newValue);
        return;
      case Owl2fsPackage.DATA_PROPETY_ATOM__DARG:
        setDArg((DArg)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY:
        setDataProperty((DataProperty)null);
        return;
      case Owl2fsPackage.DATA_PROPETY_ATOM__IARG:
        setIArg((IArg)null);
        return;
      case Owl2fsPackage.DATA_PROPETY_ATOM__DARG:
        setDArg((DArg)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY:
        return dataProperty != null;
      case Owl2fsPackage.DATA_PROPETY_ATOM__IARG:
        return iArg != null;
      case Owl2fsPackage.DATA_PROPETY_ATOM__DARG:
        return dArg != null;
    }
    return super.eIsSet(featureID);
  }

} //DataPropetyAtomImpl
