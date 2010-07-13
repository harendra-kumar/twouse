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

import west.twouse.language.sparqlas.AbstractLiteral;
import west.twouse.language.sparqlas.DataPropertyAssertion;
import west.twouse.language.sparqlas.DataPropertyExpression;
import west.twouse.language.sparqlas.Individual;
import west.twouse.language.sparqlas.SparqlmsPackage;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.DataPropertyAssertionImpl#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.DataPropertyAssertionImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.DataPropertyAssertionImpl#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropertyAssertionImpl extends AssertionImpl implements DataPropertyAssertion
{
  /**
   * The cached value of the '{@link #getSourceIndividual() <em>Source Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceIndividual()
   * @generated
   * @ordered
   */
  protected Individual sourceIndividual;

  /**
   * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetValue()
   * @generated
   * @ordered
   */
  protected AbstractLiteral targetValue;

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
  protected DataPropertyAssertionImpl()
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
    return SparqlasPackage.Literals.DATA_PROPERTY_ASSERTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Individual getSourceIndividual()
  {
    return sourceIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceIndividual(Individual newSourceIndividual, NotificationChain msgs)
  {
    Individual oldSourceIndividual = sourceIndividual;
    sourceIndividual = newSourceIndividual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, newSourceIndividual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceIndividual(Individual newSourceIndividual)
  {
    if (newSourceIndividual != sourceIndividual)
    {
      NotificationChain msgs = null;
      if (sourceIndividual != null)
        msgs = ((InternalEObject)sourceIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
      if (newSourceIndividual != null)
        msgs = ((InternalEObject)newSourceIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
      msgs = basicSetSourceIndividual(newSourceIndividual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, newSourceIndividual, newSourceIndividual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractLiteral getTargetValue()
  {
    return targetValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetValue(AbstractLiteral newTargetValue, NotificationChain msgs)
  {
    AbstractLiteral oldTargetValue = targetValue;
    targetValue = newTargetValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, oldTargetValue, newTargetValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetValue(AbstractLiteral newTargetValue)
  {
    if (newTargetValue != targetValue)
    {
      NotificationChain msgs = null;
      if (targetValue != null)
        msgs = ((InternalEObject)targetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, null, msgs);
      if (newTargetValue != null)
        msgs = ((InternalEObject)newTargetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, null, msgs);
      msgs = basicSetTargetValue(newTargetValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, newTargetValue, newTargetValue));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, newDataPropertyExpression);
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
        msgs = ((InternalEObject)dataPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION, null, msgs);
      if (newDataPropertyExpression != null)
        msgs = ((InternalEObject)newDataPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetDataPropertyExpression(newDataPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION, newDataPropertyExpression, newDataPropertyExpression));
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
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return basicSetSourceIndividual(null, msgs);
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        return basicSetTargetValue(null, msgs);
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
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
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return getSourceIndividual();
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        return getTargetValue();
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
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
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        setSourceIndividual((Individual)newValue);
        return;
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        setTargetValue((AbstractLiteral)newValue);
        return;
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
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
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        setSourceIndividual((Individual)null);
        return;
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        setTargetValue((AbstractLiteral)null);
        return;
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
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
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return sourceIndividual != null;
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        return targetValue != null;
      case SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
        return dataPropertyExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //DataPropertyAssertionImpl
