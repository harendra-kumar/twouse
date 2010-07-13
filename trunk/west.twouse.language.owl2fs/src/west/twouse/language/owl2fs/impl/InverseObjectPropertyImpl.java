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

import west.twouse.language.owl2fs.InverseObjectProperty;
import west.twouse.language.owl2fs.ObjectProperty;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inverse Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.InverseObjectPropertyImpl#getObjectProperty <em>Object Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InverseObjectPropertyImpl extends ObjectPropertyExpressionImpl implements InverseObjectProperty
{
  /**
   * The cached value of the '{@link #getObjectProperty() <em>Object Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectProperty()
   * @generated
   * @ordered
   */
  protected ObjectProperty objectProperty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InverseObjectPropertyImpl()
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
    return Owl2fsPackage.Literals.INVERSE_OBJECT_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectProperty getObjectProperty()
  {
    return objectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectProperty(ObjectProperty newObjectProperty, NotificationChain msgs)
  {
    ObjectProperty oldObjectProperty = objectProperty;
    objectProperty = newObjectProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY, oldObjectProperty, newObjectProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectProperty(ObjectProperty newObjectProperty)
  {
    if (newObjectProperty != objectProperty)
    {
      NotificationChain msgs = null;
      if (objectProperty != null)
        msgs = ((InternalEObject)objectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY, null, msgs);
      if (newObjectProperty != null)
        msgs = ((InternalEObject)newObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY, null, msgs);
      msgs = basicSetObjectProperty(newObjectProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY, newObjectProperty, newObjectProperty));
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
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY:
        return basicSetObjectProperty(null, msgs);
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
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY:
        return getObjectProperty();
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
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY:
        setObjectProperty((ObjectProperty)newValue);
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
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY:
        setObjectProperty((ObjectProperty)null);
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
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY:
        return objectProperty != null;
    }
    return super.eIsSet(featureID);
  }

} //InverseObjectPropertyImpl
