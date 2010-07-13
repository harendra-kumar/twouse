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

import west.twouse.language.owl2fs.DifferentIndividualsAtom;
import west.twouse.language.owl2fs.IArg;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Different Individuals Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.DifferentIndividualsAtomImpl#getIArg1 <em>IArg1</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DifferentIndividualsAtomImpl#getIArg2 <em>IArg2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DifferentIndividualsAtomImpl extends AtomImpl implements DifferentIndividualsAtom
{
  /**
   * The cached value of the '{@link #getIArg1() <em>IArg1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIArg1()
   * @generated
   * @ordered
   */
  protected IArg iArg1;

  /**
   * The cached value of the '{@link #getIArg2() <em>IArg2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIArg2()
   * @generated
   * @ordered
   */
  protected IArg iArg2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DifferentIndividualsAtomImpl()
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
    return Owl2fsPackage.Literals.DIFFERENT_INDIVIDUALS_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IArg getIArg1()
  {
    return iArg1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIArg1(IArg newIArg1, NotificationChain msgs)
  {
    IArg oldIArg1 = iArg1;
    iArg1 = newIArg1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1, oldIArg1, newIArg1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIArg1(IArg newIArg1)
  {
    if (newIArg1 != iArg1)
    {
      NotificationChain msgs = null;
      if (iArg1 != null)
        msgs = ((InternalEObject)iArg1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1, null, msgs);
      if (newIArg1 != null)
        msgs = ((InternalEObject)newIArg1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1, null, msgs);
      msgs = basicSetIArg1(newIArg1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1, newIArg1, newIArg1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IArg getIArg2()
  {
    return iArg2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIArg2(IArg newIArg2, NotificationChain msgs)
  {
    IArg oldIArg2 = iArg2;
    iArg2 = newIArg2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2, oldIArg2, newIArg2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIArg2(IArg newIArg2)
  {
    if (newIArg2 != iArg2)
    {
      NotificationChain msgs = null;
      if (iArg2 != null)
        msgs = ((InternalEObject)iArg2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2, null, msgs);
      if (newIArg2 != null)
        msgs = ((InternalEObject)newIArg2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2, null, msgs);
      msgs = basicSetIArg2(newIArg2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2, newIArg2, newIArg2));
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
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1:
        return basicSetIArg1(null, msgs);
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2:
        return basicSetIArg2(null, msgs);
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
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1:
        return getIArg1();
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2:
        return getIArg2();
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
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1:
        setIArg1((IArg)newValue);
        return;
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2:
        setIArg2((IArg)newValue);
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
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1:
        setIArg1((IArg)null);
        return;
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2:
        setIArg2((IArg)null);
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
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1:
        return iArg1 != null;
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2:
        return iArg2 != null;
    }
    return super.eIsSet(featureID);
  }

} //DifferentIndividualsAtomImpl
