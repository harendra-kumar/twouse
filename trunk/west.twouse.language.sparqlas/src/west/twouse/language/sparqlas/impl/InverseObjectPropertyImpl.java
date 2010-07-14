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

import west.twouse.language.sparqlas.InverseObjectProperty;
import west.twouse.language.sparqlas.ObjectPropertyExpression;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inverse Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.InverseObjectPropertyImpl#getObjectProperty <em>Object Property</em>}</li>
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
  protected ObjectPropertyExpression objectProperty;

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
    return SparqlasPackage.Literals.INVERSE_OBJECT_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyExpression getObjectProperty()
  {
    return objectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectProperty(ObjectPropertyExpression newObjectProperty, NotificationChain msgs)
  {
    ObjectPropertyExpression oldObjectProperty = objectProperty;
    objectProperty = newObjectProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY, oldObjectProperty, newObjectProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectProperty(ObjectPropertyExpression newObjectProperty)
  {
    if (newObjectProperty != objectProperty)
    {
      NotificationChain msgs = null;
      if (objectProperty != null)
        msgs = ((InternalEObject)objectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY, null, msgs);
      if (newObjectProperty != null)
        msgs = ((InternalEObject)newObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY, null, msgs);
      msgs = basicSetObjectProperty(newObjectProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY, newObjectProperty, newObjectProperty));
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
      case SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY:
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
      case SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY:
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
      case SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY:
        setObjectProperty((ObjectPropertyExpression)newValue);
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
      case SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY:
        setObjectProperty((ObjectPropertyExpression)null);
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
      case SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY:
        return objectProperty != null;
    }
    return super.eIsSet(featureID);
  }

} //InverseObjectPropertyImpl
