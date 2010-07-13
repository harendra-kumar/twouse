/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.sparqlas.ClassExpression;
import west.twouse.language.sparqlas.DataPropertyExpression;
import west.twouse.language.sparqlas.HasKey;
import west.twouse.language.sparqlas.ObjectPropertyExpression;
import west.twouse.language.sparqlas.SparqlmsPackage;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.HasKeyImpl#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.HasKeyImpl#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.HasKeyImpl#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasKeyImpl extends AtomImpl implements HasKey
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
   * The cached value of the '{@link #getObjectPropertyExpression() <em>Object Property Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectPropertyExpression()
   * @generated
   * @ordered
   */
  protected EList<ObjectPropertyExpression> objectPropertyExpression;

  /**
   * The cached value of the '{@link #getDataPropertyExpression() <em>Data Property Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataPropertyExpression()
   * @generated
   * @ordered
   */
  protected EList<DataPropertyExpression> dataPropertyExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HasKeyImpl()
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
    return SparqlasPackage.Literals.HAS_KEY;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.HAS_KEY__CLASS_EXPRESSION, oldClassExpression, newClassExpression);
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
        msgs = ((InternalEObject)classExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.HAS_KEY__CLASS_EXPRESSION, null, msgs);
      if (newClassExpression != null)
        msgs = ((InternalEObject)newClassExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.HAS_KEY__CLASS_EXPRESSION, null, msgs);
      msgs = basicSetClassExpression(newClassExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.HAS_KEY__CLASS_EXPRESSION, newClassExpression, newClassExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectPropertyExpression> getObjectPropertyExpression()
  {
    if (objectPropertyExpression == null)
    {
      objectPropertyExpression = new EObjectContainmentEList<ObjectPropertyExpression>(ObjectPropertyExpression.class, this, SparqlasPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSION);
    }
    return objectPropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataPropertyExpression> getDataPropertyExpression()
  {
    if (dataPropertyExpression == null)
    {
      dataPropertyExpression = new EObjectContainmentEList<DataPropertyExpression>(DataPropertyExpression.class, this, SparqlasPackage.HAS_KEY__DATA_PROPERTY_EXPRESSION);
    }
    return dataPropertyExpression;
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
      case SparqlasPackage.HAS_KEY__CLASS_EXPRESSION:
        return basicSetClassExpression(null, msgs);
      case SparqlasPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSION:
        return ((InternalEList<?>)getObjectPropertyExpression()).basicRemove(otherEnd, msgs);
      case SparqlasPackage.HAS_KEY__DATA_PROPERTY_EXPRESSION:
        return ((InternalEList<?>)getDataPropertyExpression()).basicRemove(otherEnd, msgs);
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
      case SparqlasPackage.HAS_KEY__CLASS_EXPRESSION:
        return getClassExpression();
      case SparqlasPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSION:
        return getObjectPropertyExpression();
      case SparqlasPackage.HAS_KEY__DATA_PROPERTY_EXPRESSION:
        return getDataPropertyExpression();
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
      case SparqlasPackage.HAS_KEY__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)newValue);
        return;
      case SparqlasPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSION:
        getObjectPropertyExpression().clear();
        getObjectPropertyExpression().addAll((Collection<? extends ObjectPropertyExpression>)newValue);
        return;
      case SparqlasPackage.HAS_KEY__DATA_PROPERTY_EXPRESSION:
        getDataPropertyExpression().clear();
        getDataPropertyExpression().addAll((Collection<? extends DataPropertyExpression>)newValue);
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
      case SparqlasPackage.HAS_KEY__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)null);
        return;
      case SparqlasPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSION:
        getObjectPropertyExpression().clear();
        return;
      case SparqlasPackage.HAS_KEY__DATA_PROPERTY_EXPRESSION:
        getDataPropertyExpression().clear();
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
      case SparqlasPackage.HAS_KEY__CLASS_EXPRESSION:
        return classExpression != null;
      case SparqlasPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSION:
        return objectPropertyExpression != null && !objectPropertyExpression.isEmpty();
      case SparqlasPackage.HAS_KEY__DATA_PROPERTY_EXPRESSION:
        return dataPropertyExpression != null && !dataPropertyExpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HasKeyImpl
