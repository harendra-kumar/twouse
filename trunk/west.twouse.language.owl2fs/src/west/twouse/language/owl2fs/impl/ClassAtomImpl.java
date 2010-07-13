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

import west.twouse.language.owl2fs.ClassAtom;
import west.twouse.language.owl2fs.ClassExpression;
import west.twouse.language.owl2fs.IArg;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.ClassAtomImpl#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.ClassAtomImpl#getIArg <em>IArg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassAtomImpl extends AtomImpl implements ClassAtom
{
  /**
   * The cached value of the '{@link #getClassExpression() <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassExpression()
   * @generated
   * @ordered
   */
  protected ClassExpression classExpression;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassAtomImpl()
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
    return Owl2fsPackage.Literals.CLASS_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassExpression getClassExpression()
  {
    return classExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassExpression(ClassExpression newClassExpression, NotificationChain msgs)
  {
    ClassExpression oldClassExpression = classExpression;
    classExpression = newClassExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION, oldClassExpression, newClassExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassExpression(ClassExpression newClassExpression)
  {
    if (newClassExpression != classExpression)
    {
      NotificationChain msgs = null;
      if (classExpression != null)
        msgs = ((InternalEObject)classExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION, null, msgs);
      if (newClassExpression != null)
        msgs = ((InternalEObject)newClassExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION, null, msgs);
      msgs = basicSetClassExpression(newClassExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION, newClassExpression, newClassExpression));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ATOM__IARG, oldIArg, newIArg);
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
        msgs = ((InternalEObject)iArg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ATOM__IARG, null, msgs);
      if (newIArg != null)
        msgs = ((InternalEObject)newIArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ATOM__IARG, null, msgs);
      msgs = basicSetIArg(newIArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ATOM__IARG, newIArg, newIArg));
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
      case Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION:
        return basicSetClassExpression(null, msgs);
      case Owl2fsPackage.CLASS_ATOM__IARG:
        return basicSetIArg(null, msgs);
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
      case Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION:
        return getClassExpression();
      case Owl2fsPackage.CLASS_ATOM__IARG:
        return getIArg();
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
      case Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)newValue);
        return;
      case Owl2fsPackage.CLASS_ATOM__IARG:
        setIArg((IArg)newValue);
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
      case Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)null);
        return;
      case Owl2fsPackage.CLASS_ATOM__IARG:
        setIArg((IArg)null);
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
      case Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION:
        return classExpression != null;
      case Owl2fsPackage.CLASS_ATOM__IARG:
        return iArg != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassAtomImpl
