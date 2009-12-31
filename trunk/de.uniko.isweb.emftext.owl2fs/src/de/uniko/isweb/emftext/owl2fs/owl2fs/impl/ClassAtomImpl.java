/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.IObject;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAtomImpl#getHasPredicateSymbol <em>Has Predicate Symbol</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAtomImpl#getHasTerm <em>Has Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassAtomImpl extends AtomImpl implements ClassAtom
{
  /**
   * The cached value of the '{@link #getHasPredicateSymbol() <em>Has Predicate Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasPredicateSymbol()
   * @generated
   * @ordered
   */
  protected ClassExpression hasPredicateSymbol;

  /**
   * The cached value of the '{@link #getHasTerm() <em>Has Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasTerm()
   * @generated
   * @ordered
   */
  protected IObject hasTerm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassAtomImpl()
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
    return Owl2fsPackage.Literals.CLASS_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassExpression getHasPredicateSymbol()
  {
    return hasPredicateSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasPredicateSymbol(ClassExpression newHasPredicateSymbol, NotificationChain msgs)
  {
    ClassExpression oldHasPredicateSymbol = hasPredicateSymbol;
    hasPredicateSymbol = newHasPredicateSymbol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ATOM__HAS_PREDICATE_SYMBOL, oldHasPredicateSymbol, newHasPredicateSymbol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasPredicateSymbol(ClassExpression newHasPredicateSymbol)
  {
    if (newHasPredicateSymbol != hasPredicateSymbol)
    {
      NotificationChain msgs = null;
      if (hasPredicateSymbol != null)
        msgs = ((InternalEObject)hasPredicateSymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ATOM__HAS_PREDICATE_SYMBOL, null, msgs);
      if (newHasPredicateSymbol != null)
        msgs = ((InternalEObject)newHasPredicateSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ATOM__HAS_PREDICATE_SYMBOL, null, msgs);
      msgs = basicSetHasPredicateSymbol(newHasPredicateSymbol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ATOM__HAS_PREDICATE_SYMBOL, newHasPredicateSymbol, newHasPredicateSymbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IObject getHasTerm()
  {
    return hasTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasTerm(IObject newHasTerm, NotificationChain msgs)
  {
    IObject oldHasTerm = hasTerm;
    hasTerm = newHasTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ATOM__HAS_TERM, oldHasTerm, newHasTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasTerm(IObject newHasTerm)
  {
    if (newHasTerm != hasTerm)
    {
      NotificationChain msgs = null;
      if (hasTerm != null)
        msgs = ((InternalEObject)hasTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ATOM__HAS_TERM, null, msgs);
      if (newHasTerm != null)
        msgs = ((InternalEObject)newHasTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.CLASS_ATOM__HAS_TERM, null, msgs);
      msgs = basicSetHasTerm(newHasTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS_ATOM__HAS_TERM, newHasTerm, newHasTerm));
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
      case Owl2fsPackage.CLASS_ATOM__HAS_PREDICATE_SYMBOL:
        return basicSetHasPredicateSymbol(null, msgs);
      case Owl2fsPackage.CLASS_ATOM__HAS_TERM:
        return basicSetHasTerm(null, msgs);
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
      case Owl2fsPackage.CLASS_ATOM__HAS_PREDICATE_SYMBOL:
        return getHasPredicateSymbol();
      case Owl2fsPackage.CLASS_ATOM__HAS_TERM:
        return getHasTerm();
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
      case Owl2fsPackage.CLASS_ATOM__HAS_PREDICATE_SYMBOL:
        setHasPredicateSymbol((ClassExpression)newValue);
        return;
      case Owl2fsPackage.CLASS_ATOM__HAS_TERM:
        setHasTerm((IObject)newValue);
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
      case Owl2fsPackage.CLASS_ATOM__HAS_PREDICATE_SYMBOL:
        setHasPredicateSymbol((ClassExpression)null);
        return;
      case Owl2fsPackage.CLASS_ATOM__HAS_TERM:
        setHasTerm((IObject)null);
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
      case Owl2fsPackage.CLASS_ATOM__HAS_PREDICATE_SYMBOL:
        return hasPredicateSymbol != null;
      case Owl2fsPackage.CLASS_ATOM__HAS_TERM:
        return hasTerm != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassAtomImpl
