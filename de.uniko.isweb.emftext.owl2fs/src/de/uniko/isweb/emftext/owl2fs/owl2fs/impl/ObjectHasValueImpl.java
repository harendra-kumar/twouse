/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.Individual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Has Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectHasValueImpl#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectHasValueImpl#getIndividual <em>Individual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectHasValueImpl extends ClassExpressionImpl implements ObjectHasValue
{
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
   * The cached value of the '{@link #getIndividual() <em>Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndividual()
   * @generated
   * @ordered
   */
  protected Individual individual;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectHasValueImpl()
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
    return Owl2fsPackage.Literals.OBJECT_HAS_VALUE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION, oldObjectPropertyExpression, newObjectPropertyExpression);
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
        msgs = ((InternalEObject)objectPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION, null, msgs);
      if (newObjectPropertyExpression != null)
        msgs = ((InternalEObject)newObjectPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetObjectPropertyExpression(newObjectPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION, newObjectPropertyExpression, newObjectPropertyExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Individual getIndividual()
  {
    return individual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndividual(Individual newIndividual, NotificationChain msgs)
  {
    Individual oldIndividual = individual;
    individual = newIndividual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL, oldIndividual, newIndividual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndividual(Individual newIndividual)
  {
    if (newIndividual != individual)
    {
      NotificationChain msgs = null;
      if (individual != null)
        msgs = ((InternalEObject)individual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL, null, msgs);
      if (newIndividual != null)
        msgs = ((InternalEObject)newIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL, null, msgs);
      msgs = basicSetIndividual(newIndividual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL, newIndividual, newIndividual));
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
      case Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION:
        return basicSetObjectPropertyExpression(null, msgs);
      case Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL:
        return basicSetIndividual(null, msgs);
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
      case Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION:
        return getObjectPropertyExpression();
      case Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL:
        return getIndividual();
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
      case Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION:
        setObjectPropertyExpression((ObjectPropertyExpression)newValue);
        return;
      case Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL:
        setIndividual((Individual)newValue);
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
      case Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION:
        setObjectPropertyExpression((ObjectPropertyExpression)null);
        return;
      case Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL:
        setIndividual((Individual)null);
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
      case Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION:
        return objectPropertyExpression != null;
      case Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL:
        return individual != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectHasValueImpl
