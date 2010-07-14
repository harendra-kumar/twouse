/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.sparqlas.DataPropertyExpression;
import west.twouse.language.sparqlas.DataRange;
import west.twouse.language.sparqlas.DataSomeValuesFrom;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Some Values From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.DataSomeValuesFromImpl#getDataRange <em>Data Range</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.DataSomeValuesFromImpl#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataSomeValuesFromImpl extends ClassExpressionImpl implements DataSomeValuesFrom
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
   * The cached value of the '{@link #getDataPropertyExpressions() <em>Data Property Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataPropertyExpressions()
   * @generated
   * @ordered
   */
  protected EList<DataPropertyExpression> dataPropertyExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataSomeValuesFromImpl()
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
    return SparqlasPackage.Literals.DATA_SOME_VALUES_FROM;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE, oldDataRange, newDataRange);
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
        msgs = ((InternalEObject)dataRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE, null, msgs);
      if (newDataRange != null)
        msgs = ((InternalEObject)newDataRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE, null, msgs);
      msgs = basicSetDataRange(newDataRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE, newDataRange, newDataRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataPropertyExpression> getDataPropertyExpressions()
  {
    if (dataPropertyExpressions == null)
    {
      dataPropertyExpressions = new EObjectContainmentEList<DataPropertyExpression>(DataPropertyExpression.class, this, SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS);
    }
    return dataPropertyExpressions;
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
      case SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE:
        return basicSetDataRange(null, msgs);
      case SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS:
        return ((InternalEList<?>)getDataPropertyExpressions()).basicRemove(otherEnd, msgs);
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
      case SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE:
        return getDataRange();
      case SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS:
        return getDataPropertyExpressions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE:
        setDataRange((DataRange)newValue);
        return;
      case SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS:
        getDataPropertyExpressions().clear();
        getDataPropertyExpressions().addAll((Collection<? extends DataPropertyExpression>)newValue);
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
      case SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE:
        setDataRange((DataRange)null);
        return;
      case SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS:
        getDataPropertyExpressions().clear();
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
      case SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE:
        return dataRange != null;
      case SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS:
        return dataPropertyExpressions != null && !dataPropertyExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DataSomeValuesFromImpl
