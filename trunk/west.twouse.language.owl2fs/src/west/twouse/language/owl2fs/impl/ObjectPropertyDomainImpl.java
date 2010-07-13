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

import west.twouse.language.owl2fs.ClassExpression;
import west.twouse.language.owl2fs.ObjectPropertyDomain;
import west.twouse.language.owl2fs.ObjectPropertyExpression;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.ObjectPropertyDomainImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.ObjectPropertyDomainImpl#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyDomainImpl extends ObjectPropertyAxiomImpl implements ObjectPropertyDomain
{
  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected ClassExpression domain;

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
  protected ObjectPropertyDomainImpl()
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
    return Owl2fsPackage.Literals.OBJECT_PROPERTY_DOMAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassExpression getDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDomain(ClassExpression newDomain, NotificationChain msgs)
  {
    ClassExpression oldDomain = domain;
    domain = newDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN, oldDomain, newDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomain(ClassExpression newDomain)
  {
    if (newDomain != domain)
    {
      NotificationChain msgs = null;
      if (domain != null)
        msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN, null, msgs);
      if (newDomain != null)
        msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN, null, msgs);
      msgs = basicSetDomain(newDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN, newDomain, newDomain));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION, oldObjectPropertyExpression, newObjectPropertyExpression);
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
        msgs = ((InternalEObject)objectPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION, null, msgs);
      if (newObjectPropertyExpression != null)
        msgs = ((InternalEObject)newObjectPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetObjectPropertyExpression(newObjectPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION, newObjectPropertyExpression, newObjectPropertyExpression));
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
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN:
        return basicSetDomain(null, msgs);
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION:
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
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN:
        return getDomain();
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION:
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
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN:
        setDomain((ClassExpression)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION:
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
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN:
        setDomain((ClassExpression)null);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION:
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
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN:
        return domain != null;
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION:
        return objectPropertyExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectPropertyDomainImpl
