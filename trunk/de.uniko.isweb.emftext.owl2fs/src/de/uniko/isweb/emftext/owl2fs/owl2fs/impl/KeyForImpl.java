/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.KeyForImpl#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.KeyForImpl#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.KeyForImpl#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyForImpl extends ObjectAndDataPropertyAxiomImpl implements KeyFor
{
  /**
   * The cached value of the '{@link #getClassExpression() <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassExpression()
   * @generated
   * @ordered
   */
  protected ClassExpression classExpression;

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
   * The cached value of the '{@link #getObjectPropertyExpressions() <em>Object Property Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectPropertyExpressions()
   * @generated
   * @ordered
   */
  protected EList<ObjectPropertyExpression> objectPropertyExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeyForImpl()
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
    return Owl2fsPackage.Literals.KEY_FOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassExpression getClassExpression()
  {
    return classExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassExpression(ClassExpression newClassExpression, NotificationChain msgs)
  {
    ClassExpression oldClassExpression = classExpression;
    classExpression = newClassExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION, oldClassExpression, newClassExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassExpression(ClassExpression newClassExpression)
  {
    if (newClassExpression != classExpression)
    {
      NotificationChain msgs = null;
      if (classExpression != null)
        msgs = ((InternalEObject)classExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION, null, msgs);
      if (newClassExpression != null)
        msgs = ((InternalEObject)newClassExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION, null, msgs);
      msgs = basicSetClassExpression(newClassExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION, newClassExpression, newClassExpression));
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
      dataPropertyExpressions = new EObjectContainmentEList<DataPropertyExpression>(DataPropertyExpression.class, this, Owl2fsPackage.KEY_FOR__DATA_PROPERTY_EXPRESSIONS);
    }
    return dataPropertyExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectPropertyExpression> getObjectPropertyExpressions()
  {
    if (objectPropertyExpressions == null)
    {
      objectPropertyExpressions = new EObjectContainmentEList<ObjectPropertyExpression>(ObjectPropertyExpression.class, this, Owl2fsPackage.KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS);
    }
    return objectPropertyExpressions;
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
      case Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION:
        return basicSetClassExpression(null, msgs);
      case Owl2fsPackage.KEY_FOR__DATA_PROPERTY_EXPRESSIONS:
        return ((InternalEList<?>)getDataPropertyExpressions()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS:
        return ((InternalEList<?>)getObjectPropertyExpressions()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION:
        return getClassExpression();
      case Owl2fsPackage.KEY_FOR__DATA_PROPERTY_EXPRESSIONS:
        return getDataPropertyExpressions();
      case Owl2fsPackage.KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS:
        return getObjectPropertyExpressions();
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
      case Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)newValue);
        return;
      case Owl2fsPackage.KEY_FOR__DATA_PROPERTY_EXPRESSIONS:
        getDataPropertyExpressions().clear();
        getDataPropertyExpressions().addAll((Collection<? extends DataPropertyExpression>)newValue);
        return;
      case Owl2fsPackage.KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS:
        getObjectPropertyExpressions().clear();
        getObjectPropertyExpressions().addAll((Collection<? extends ObjectPropertyExpression>)newValue);
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
      case Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)null);
        return;
      case Owl2fsPackage.KEY_FOR__DATA_PROPERTY_EXPRESSIONS:
        getDataPropertyExpressions().clear();
        return;
      case Owl2fsPackage.KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS:
        getObjectPropertyExpressions().clear();
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
      case Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION:
        return classExpression != null;
      case Owl2fsPackage.KEY_FOR__DATA_PROPERTY_EXPRESSIONS:
        return dataPropertyExpressions != null && !dataPropertyExpressions.isEmpty();
      case Owl2fsPackage.KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS:
        return objectPropertyExpressions != null && !objectPropertyExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //KeyForImpl
