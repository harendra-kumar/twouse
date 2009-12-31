/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataRange;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data All Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataAllValuesFromImpl#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataAllValuesFromImpl#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAllValuesFromImpl extends ClassExpressionImpl implements DataAllValuesFrom
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
   * The cached value of the '{@link #getDataPropertyExpressions() <em>Data Property Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataPropertyExpressions()
   * @generated
   * @ordered
   */
  protected DataPropertyExpression dataPropertyExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataAllValuesFromImpl()
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
    return Owl2fsPackage.Literals.DATA_ALL_VALUES_FROM;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE, oldDataRange, newDataRange);
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
        msgs = ((InternalEObject)dataRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE, null, msgs);
      if (newDataRange != null)
        msgs = ((InternalEObject)newDataRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE, null, msgs);
      msgs = basicSetDataRange(newDataRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE, newDataRange, newDataRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyExpression getDataPropertyExpressions()
  {
    return dataPropertyExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataPropertyExpressions(DataPropertyExpression newDataPropertyExpressions, NotificationChain msgs)
  {
    DataPropertyExpression oldDataPropertyExpressions = dataPropertyExpressions;
    dataPropertyExpressions = newDataPropertyExpressions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS, oldDataPropertyExpressions, newDataPropertyExpressions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataPropertyExpressions(DataPropertyExpression newDataPropertyExpressions)
  {
    if (newDataPropertyExpressions != dataPropertyExpressions)
    {
      NotificationChain msgs = null;
      if (dataPropertyExpressions != null)
        msgs = ((InternalEObject)dataPropertyExpressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS, null, msgs);
      if (newDataPropertyExpressions != null)
        msgs = ((InternalEObject)newDataPropertyExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS, null, msgs);
      msgs = basicSetDataPropertyExpressions(newDataPropertyExpressions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS, newDataPropertyExpressions, newDataPropertyExpressions));
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
      case Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE:
        return basicSetDataRange(null, msgs);
      case Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS:
        return basicSetDataPropertyExpressions(null, msgs);
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
      case Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE:
        return getDataRange();
      case Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS:
        return getDataPropertyExpressions();
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
      case Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE:
        setDataRange((DataRange)newValue);
        return;
      case Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS:
        setDataPropertyExpressions((DataPropertyExpression)newValue);
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
      case Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE:
        setDataRange((DataRange)null);
        return;
      case Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS:
        setDataPropertyExpressions((DataPropertyExpression)null);
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
      case Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE:
        return dataRange != null;
      case Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS:
        return dataPropertyExpressions != null;
    }
    return super.eIsSet(featureID);
  }

} //DataAllValuesFromImpl
