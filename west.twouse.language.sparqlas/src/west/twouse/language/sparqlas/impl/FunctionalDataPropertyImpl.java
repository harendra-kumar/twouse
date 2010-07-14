/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import west.twouse.language.sparqlas.DataPropertyExpression;
import west.twouse.language.sparqlas.FunctionalDataProperty;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Data Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.FunctionalDataPropertyImpl#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalDataPropertyImpl extends DataPropertyAtomImpl implements FunctionalDataProperty
{
  /**
   * The cached value of the '{@link #getDataPropertyExpression() <em>Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataPropertyExpression()
   * @generated
   * @ordered
   */
  protected DataPropertyExpression dataPropertyExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionalDataPropertyImpl()
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
    return SparqlasPackage.Literals.FUNCTIONAL_DATA_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyExpression getDataPropertyExpression()
  {
    return dataPropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataPropertyExpression(DataPropertyExpression newDataPropertyExpression, NotificationChain msgs)
  {
    DataPropertyExpression oldDataPropertyExpression = dataPropertyExpression;
    dataPropertyExpression = newDataPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, newDataPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataPropertyExpression(DataPropertyExpression newDataPropertyExpression)
  {
    if (newDataPropertyExpression != dataPropertyExpression)
    {
      NotificationChain msgs = null;
      if (dataPropertyExpression != null)
        msgs = ((InternalEObject)dataPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION, null, msgs);
      if (newDataPropertyExpression != null)
        msgs = ((InternalEObject)newDataPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetDataPropertyExpression(newDataPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION, newDataPropertyExpression, newDataPropertyExpression));
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
      case SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION:
        return basicSetDataPropertyExpression(null, msgs);
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
      case SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION:
        return getDataPropertyExpression();
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
      case SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION:
        setDataPropertyExpression((DataPropertyExpression)newValue);
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
      case SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION:
        setDataPropertyExpression((DataPropertyExpression)null);
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
      case SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION:
        return dataPropertyExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionalDataPropertyImpl
