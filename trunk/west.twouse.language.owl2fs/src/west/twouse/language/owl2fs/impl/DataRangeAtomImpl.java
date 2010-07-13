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
import west.twouse.language.owl2fs.DataRange;
import west.twouse.language.owl2fs.DataRangeAtom;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Range Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.DataRangeAtomImpl#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DataRangeAtomImpl#getDArg <em>DArg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataRangeAtomImpl extends AtomImpl implements DataRangeAtom
{
  /**
   * The cached value of the '{@link #getDataRange() <em>Data Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataRange()
   * @generated
   * @ordered
   */
  protected DataRange dataRange;

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
  protected DataRangeAtomImpl()
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
    return Owl2fsPackage.Literals.DATA_RANGE_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataRange getDataRange()
  {
    return dataRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataRange(DataRange newDataRange, NotificationChain msgs)
  {
    DataRange oldDataRange = dataRange;
    dataRange = newDataRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE, oldDataRange, newDataRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataRange(DataRange newDataRange)
  {
    if (newDataRange != dataRange)
    {
      NotificationChain msgs = null;
      if (dataRange != null)
        msgs = ((InternalEObject)dataRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE, null, msgs);
      if (newDataRange != null)
        msgs = ((InternalEObject)newDataRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE, null, msgs);
      msgs = basicSetDataRange(newDataRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE, newDataRange, newDataRange));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_RANGE_ATOM__DARG, oldDArg, newDArg);
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
        msgs = ((InternalEObject)dArg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_RANGE_ATOM__DARG, null, msgs);
      if (newDArg != null)
        msgs = ((InternalEObject)newDArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_RANGE_ATOM__DARG, null, msgs);
      msgs = basicSetDArg(newDArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_RANGE_ATOM__DARG, newDArg, newDArg));
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
      case Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE:
        return basicSetDataRange(null, msgs);
      case Owl2fsPackage.DATA_RANGE_ATOM__DARG:
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
      case Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE:
        return getDataRange();
      case Owl2fsPackage.DATA_RANGE_ATOM__DARG:
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
      case Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE:
        setDataRange((DataRange)newValue);
        return;
      case Owl2fsPackage.DATA_RANGE_ATOM__DARG:
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
      case Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE:
        setDataRange((DataRange)null);
        return;
      case Owl2fsPackage.DATA_RANGE_ATOM__DARG:
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
      case Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE:
        return dataRange != null;
      case Owl2fsPackage.DATA_RANGE_ATOM__DARG:
        return dArg != null;
    }
    return super.eIsSet(featureID);
  }

} //DataRangeAtomImpl
