/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Object Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubObjectPropertyOfImpl#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubObjectPropertyOfImpl#getSubObjectPropertyExpressions <em>Sub Object Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubObjectPropertyOfImpl extends ObjectPropertyAxiomImpl implements SubObjectPropertyOf
{
  /**
   * The cached value of the '{@link #getSuperObjectPropertyExpression() <em>Super Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperObjectPropertyExpression()
   * @generated
   * @ordered
   */
  protected ObjectPropertyExpression superObjectPropertyExpression;

  /**
   * The cached value of the '{@link #getSubObjectPropertyExpressions() <em>Sub Object Property Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubObjectPropertyExpressions()
   * @generated
   * @ordered
   */
  protected ObjectPropertyExpression subObjectPropertyExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubObjectPropertyOfImpl()
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
    return Owl2fsPackage.Literals.SUB_OBJECT_PROPERTY_OF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyExpression getSuperObjectPropertyExpression()
  {
    return superObjectPropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperObjectPropertyExpression(ObjectPropertyExpression newSuperObjectPropertyExpression, NotificationChain msgs)
  {
    ObjectPropertyExpression oldSuperObjectPropertyExpression = superObjectPropertyExpression;
    superObjectPropertyExpression = newSuperObjectPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION, oldSuperObjectPropertyExpression, newSuperObjectPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperObjectPropertyExpression(ObjectPropertyExpression newSuperObjectPropertyExpression)
  {
    if (newSuperObjectPropertyExpression != superObjectPropertyExpression)
    {
      NotificationChain msgs = null;
      if (superObjectPropertyExpression != null)
        msgs = ((InternalEObject)superObjectPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION, null, msgs);
      if (newSuperObjectPropertyExpression != null)
        msgs = ((InternalEObject)newSuperObjectPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetSuperObjectPropertyExpression(newSuperObjectPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION, newSuperObjectPropertyExpression, newSuperObjectPropertyExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyExpression getSubObjectPropertyExpressions()
  {
    return subObjectPropertyExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubObjectPropertyExpressions(ObjectPropertyExpression newSubObjectPropertyExpressions, NotificationChain msgs)
  {
    ObjectPropertyExpression oldSubObjectPropertyExpressions = subObjectPropertyExpressions;
    subObjectPropertyExpressions = newSubObjectPropertyExpressions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS, oldSubObjectPropertyExpressions, newSubObjectPropertyExpressions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubObjectPropertyExpressions(ObjectPropertyExpression newSubObjectPropertyExpressions)
  {
    if (newSubObjectPropertyExpressions != subObjectPropertyExpressions)
    {
      NotificationChain msgs = null;
      if (subObjectPropertyExpressions != null)
        msgs = ((InternalEObject)subObjectPropertyExpressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS, null, msgs);
      if (newSubObjectPropertyExpressions != null)
        msgs = ((InternalEObject)newSubObjectPropertyExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS, null, msgs);
      msgs = basicSetSubObjectPropertyExpressions(newSubObjectPropertyExpressions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS, newSubObjectPropertyExpressions, newSubObjectPropertyExpressions));
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
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
        return basicSetSuperObjectPropertyExpression(null, msgs);
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS:
        return basicSetSubObjectPropertyExpressions(null, msgs);
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
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
        return getSuperObjectPropertyExpression();
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS:
        return getSubObjectPropertyExpressions();
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
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
        setSuperObjectPropertyExpression((ObjectPropertyExpression)newValue);
        return;
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS:
        setSubObjectPropertyExpressions((ObjectPropertyExpression)newValue);
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
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
        setSuperObjectPropertyExpression((ObjectPropertyExpression)null);
        return;
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS:
        setSubObjectPropertyExpressions((ObjectPropertyExpression)null);
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
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
        return superObjectPropertyExpression != null;
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS:
        return subObjectPropertyExpressions != null;
    }
    return super.eIsSet(featureID);
  }

} //SubObjectPropertyOfImpl
