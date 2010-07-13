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

import west.twouse.language.sparqlas.Individual;
import west.twouse.language.sparqlas.NegativeObjectPropertyAssertion;
import west.twouse.language.sparqlas.ObjectPropertyExpression;
import west.twouse.language.sparqlas.SparqlmsPackage;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negative Object Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.NegativeObjectPropertyAssertionImpl#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.NegativeObjectPropertyAssertionImpl#getTargetIndividual <em>Target Individual</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.NegativeObjectPropertyAssertionImpl#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegativeObjectPropertyAssertionImpl extends AssertionImpl implements NegativeObjectPropertyAssertion
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
   * The cached value of the '{@link #getTargetIndividual() <em>Target Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetIndividual()
   * @generated
   * @ordered
   */
  protected Individual targetIndividual;

  /**
   * The cached value of the '{@link #getObjectPropertyExpression() <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectPropertyExpression()
   * @generated
   * @ordered
   */
  protected ObjectPropertyExpression objectPropertyExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NegativeObjectPropertyAssertionImpl()
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
    return SparqlasPackage.Literals.NEGATIVE_OBJECT_PROPERTY_ASSERTION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, oldSourceIndividual, newSourceIndividual);
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
        msgs = ((InternalEObject)sourceIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
      if (newSourceIndividual != null)
        msgs = ((InternalEObject)newSourceIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, null, msgs);
      msgs = basicSetSourceIndividual(newSourceIndividual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL, newSourceIndividual, newSourceIndividual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Individual getTargetIndividual()
  {
    return targetIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetIndividual(Individual newTargetIndividual, NotificationChain msgs)
  {
    Individual oldTargetIndividual = targetIndividual;
    targetIndividual = newTargetIndividual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, oldTargetIndividual, newTargetIndividual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetIndividual(Individual newTargetIndividual)
  {
    if (newTargetIndividual != targetIndividual)
    {
      NotificationChain msgs = null;
      if (targetIndividual != null)
        msgs = ((InternalEObject)targetIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, null, msgs);
      if (newTargetIndividual != null)
        msgs = ((InternalEObject)newTargetIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, null, msgs);
      msgs = basicSetTargetIndividual(newTargetIndividual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL, newTargetIndividual, newTargetIndividual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyExpression getObjectPropertyExpression()
  {
    return objectPropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectPropertyExpression(ObjectPropertyExpression newObjectPropertyExpression, NotificationChain msgs)
  {
    ObjectPropertyExpression oldObjectPropertyExpression = objectPropertyExpression;
    objectPropertyExpression = newObjectPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION, oldObjectPropertyExpression, newObjectPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectPropertyExpression(ObjectPropertyExpression newObjectPropertyExpression)
  {
    if (newObjectPropertyExpression != objectPropertyExpression)
    {
      NotificationChain msgs = null;
      if (objectPropertyExpression != null)
        msgs = ((InternalEObject)objectPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION, null, msgs);
      if (newObjectPropertyExpression != null)
        msgs = ((InternalEObject)newObjectPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetObjectPropertyExpression(newObjectPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION, newObjectPropertyExpression, newObjectPropertyExpression));
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
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return basicSetSourceIndividual(null, msgs);
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
        return basicSetTargetIndividual(null, msgs);
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
        return basicSetObjectPropertyExpression(null, msgs);
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
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return getSourceIndividual();
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
        return getTargetIndividual();
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
        return getObjectPropertyExpression();
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
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        setSourceIndividual((Individual)newValue);
        return;
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
        setTargetIndividual((Individual)newValue);
        return;
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
        setObjectPropertyExpression((ObjectPropertyExpression)newValue);
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
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        setSourceIndividual((Individual)null);
        return;
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
        setTargetIndividual((Individual)null);
        return;
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
        setObjectPropertyExpression((ObjectPropertyExpression)null);
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
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL:
        return sourceIndividual != null;
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL:
        return targetIndividual != null;
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION:
        return objectPropertyExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //NegativeObjectPropertyAssertionImpl
