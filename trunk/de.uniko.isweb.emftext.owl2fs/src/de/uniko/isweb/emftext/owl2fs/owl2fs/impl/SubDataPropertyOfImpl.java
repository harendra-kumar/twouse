/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Data Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubDataPropertyOfImpl#getSuperDataPropertyExpression <em>Super Data Property Expression</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubDataPropertyOfImpl#getSubDataPropertyExpression <em>Sub Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubDataPropertyOfImpl extends DataPropertyAxiomImpl implements SubDataPropertyOf
{
  /**
   * The cached value of the '{@link #getSuperDataPropertyExpression() <em>Super Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperDataPropertyExpression()
   * @generated
   * @ordered
   */
  protected DataPropertyExpression superDataPropertyExpression;

  /**
   * The cached value of the '{@link #getSubDataPropertyExpression() <em>Sub Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubDataPropertyExpression()
   * @generated
   * @ordered
   */
  protected DataPropertyExpression subDataPropertyExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubDataPropertyOfImpl()
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
    return Owl2fsPackage.Literals.SUB_DATA_PROPERTY_OF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyExpression getSuperDataPropertyExpression()
  {
    return superDataPropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperDataPropertyExpression(DataPropertyExpression newSuperDataPropertyExpression, NotificationChain msgs)
  {
    DataPropertyExpression oldSuperDataPropertyExpression = superDataPropertyExpression;
    superDataPropertyExpression = newSuperDataPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION, oldSuperDataPropertyExpression, newSuperDataPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperDataPropertyExpression(DataPropertyExpression newSuperDataPropertyExpression)
  {
    if (newSuperDataPropertyExpression != superDataPropertyExpression)
    {
      NotificationChain msgs = null;
      if (superDataPropertyExpression != null)
        msgs = ((InternalEObject)superDataPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION, null, msgs);
      if (newSuperDataPropertyExpression != null)
        msgs = ((InternalEObject)newSuperDataPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetSuperDataPropertyExpression(newSuperDataPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION, newSuperDataPropertyExpression, newSuperDataPropertyExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyExpression getSubDataPropertyExpression()
  {
    return subDataPropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubDataPropertyExpression(DataPropertyExpression newSubDataPropertyExpression, NotificationChain msgs)
  {
    DataPropertyExpression oldSubDataPropertyExpression = subDataPropertyExpression;
    subDataPropertyExpression = newSubDataPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION, oldSubDataPropertyExpression, newSubDataPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubDataPropertyExpression(DataPropertyExpression newSubDataPropertyExpression)
  {
    if (newSubDataPropertyExpression != subDataPropertyExpression)
    {
      NotificationChain msgs = null;
      if (subDataPropertyExpression != null)
        msgs = ((InternalEObject)subDataPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION, null, msgs);
      if (newSubDataPropertyExpression != null)
        msgs = ((InternalEObject)newSubDataPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetSubDataPropertyExpression(newSubDataPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION, newSubDataPropertyExpression, newSubDataPropertyExpression));
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
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION:
        return basicSetSuperDataPropertyExpression(null, msgs);
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION:
        return basicSetSubDataPropertyExpression(null, msgs);
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
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION:
        return getSuperDataPropertyExpression();
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION:
        return getSubDataPropertyExpression();
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
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION:
        setSuperDataPropertyExpression((DataPropertyExpression)newValue);
        return;
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION:
        setSubDataPropertyExpression((DataPropertyExpression)newValue);
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
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION:
        setSuperDataPropertyExpression((DataPropertyExpression)null);
        return;
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION:
        setSubDataPropertyExpression((DataPropertyExpression)null);
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
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION:
        return superDataPropertyExpression != null;
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION:
        return subDataPropertyExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //SubDataPropertyOfImpl
