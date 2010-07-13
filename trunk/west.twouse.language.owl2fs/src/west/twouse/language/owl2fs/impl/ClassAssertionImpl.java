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

import west.twouse.language.owl2fs.ClassAssertion;
import west.twouse.language.owl2fs.ClassExpression;
import west.twouse.language.owl2fs.NamedIndividual;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.ClassAssertionImpl#getIndividual <em>Individual</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.ClassAssertionImpl#getClassExpression <em>Class Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassAssertionImpl extends AssertionImpl implements ClassAssertion
{
  /**
   * The cached value of the '{@link #getIndividual() <em>Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndividual()
   * @generated
   * @ordered
   */
  protected NamedIndividual individual;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassAssertionImpl()
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
    return Owl2fsPackage.Literals.CLASS_ASSERTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedIndividual getIndividual()
  {
    return individual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndividual(NamedIndividual newIndividual, NotificationChain msgs)
  {
    NamedIndividual oldIndividual = individual;
    individual = newIndividual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL, oldIndividual, newIndividual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndividual(NamedIndividual newIndividual)
  {
    if (newIndividual != individual)
    {
      NotificationChain msgs = null;
      if (individual != null)
        msgs = ((InternalEObject)individual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL, null, msgs);
      if (newIndividual != null)
        msgs = ((InternalEObject)newIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL, null, msgs);
      msgs = basicSetIndividual(newIndividual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL, newIndividual, newIndividual));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION, oldClassExpression, newClassExpression);
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
        msgs = ((InternalEObject)classExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION, null, msgs);
      if (newClassExpression != null)
        msgs = ((InternalEObject)newClassExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION, null, msgs);
      msgs = basicSetClassExpression(newClassExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION, newClassExpression, newClassExpression));
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
      case Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL:
        return basicSetIndividual(null, msgs);
      case Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION:
        return basicSetClassExpression(null, msgs);
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
      case Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL:
        return getIndividual();
      case Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION:
        return getClassExpression();
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
      case Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL:
        setIndividual((NamedIndividual)newValue);
        return;
      case Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)newValue);
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
      case Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL:
        setIndividual((NamedIndividual)null);
        return;
      case Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)null);
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
      case Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL:
        return individual != null;
      case Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION:
        return classExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassAssertionImpl
