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

import west.twouse.language.owl2fs.DataPropertyAssertion;
import west.twouse.language.owl2fs.DataPropertyExpression;
import west.twouse.language.owl2fs.Individual;
import west.twouse.language.owl2fs.Literal;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.DataPropertyAssertionImpl#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DataPropertyAssertionImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DataPropertyAssertionImpl#getSourceIndividual <em>Source Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropertyAssertionImpl extends AssertionImpl implements DataPropertyAssertion
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
   * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetValue()
   * @generated
   * @ordered
   */
  protected Literal targetValue;

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
    return Owl2fsPackage.Literals.DATA_PROPERTY_ASSERTION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, newDataPropertyExpression);
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
        msgs = ((InternalEObject)dataPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION, null, msgs);
      if (newDataPropertyExpression != null)
        msgs = ((InternalEObject)newDataPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetDataPropertyExpression(newDataPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION, newDataPropertyExpression, newDataPropertyExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getTargetValue()
  {
    return targetValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetValue(Literal newTargetValue, NotificationChain msgs)
  {
    Literal oldTargetValue = targetValue;
    targetValue = newTargetValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, oldTargetValue, newTargetValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetValue(Literal newTargetValue)
  {
    if (newTargetValue != targetValue)
    {
      NotificationChain msgs = null;
      if (targetValue != null)
        msgs = ((InternalEObject)targetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, null, msgs);
      if (newTargetValue != null)
        msgs = ((InternalEObject)newTargetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, null, msgs);
      msgs = basicSetTargetValue(newTargetValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE, newTargetValue, newTargetValue));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, newSourceIndividual);
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
        msgs = ((InternalEObject)sourceIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
      if (newSourceIndividual != null)
        msgs = ((InternalEObject)newSourceIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
      msgs = basicSetSourceIndividual(newSourceIndividual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, newSourceIndividual, newSourceIndividual));
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
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
        return basicSetDataPropertyExpression(null, msgs);
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        return basicSetTargetValue(null, msgs);
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return basicSetSourceIndividual(null, msgs);
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
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
        return getDataPropertyExpression();
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        return getTargetValue();
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return getSourceIndividual();
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
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
        setDataPropertyExpression((DataPropertyExpression)newValue);
        return;
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        setTargetValue((Literal)newValue);
        return;
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        setSourceIndividual((Individual)newValue);
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
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
        setDataPropertyExpression((DataPropertyExpression)null);
        return;
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        setTargetValue((Literal)null);
        return;
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        setSourceIndividual((Individual)null);
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
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION:
        return dataPropertyExpression != null;
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE:
        return targetValue != null;
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return sourceIndividual != null;
    }
    return super.eIsSet(featureID);
  }

} //DataPropertyAssertionImpl
