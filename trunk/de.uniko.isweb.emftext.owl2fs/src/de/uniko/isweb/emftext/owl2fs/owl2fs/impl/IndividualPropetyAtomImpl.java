/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Propety Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualPropetyAtomImpl#getHasPredicateSymbol <em>Has Predicate Symbol</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualPropetyAtomImpl#getAtomTarget <em>Atom Target</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualPropetyAtomImpl#getAtomSource <em>Atom Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualPropetyAtomImpl extends PropertyAtomImpl implements IndividualPropetyAtom
{
  /**
   * The cached value of the '{@link #getHasPredicateSymbol() <em>Has Predicate Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasPredicateSymbol()
   * @generated
   * @ordered
   */
  protected ObjectPropertyExpression hasPredicateSymbol;

  /**
   * The cached value of the '{@link #getAtomTarget() <em>Atom Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomTarget()
   * @generated
   * @ordered
   */
  protected ClassAtom atomTarget;

  /**
   * The cached value of the '{@link #getAtomSource() <em>Atom Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomSource()
   * @generated
   * @ordered
   */
  protected ClassAtom atomSource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndividualPropetyAtomImpl()
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
    return Owl2fsPackage.Literals.INDIVIDUAL_PROPETY_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyExpression getHasPredicateSymbol()
  {
    return hasPredicateSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasPredicateSymbol(ObjectPropertyExpression newHasPredicateSymbol, NotificationChain msgs)
  {
    ObjectPropertyExpression oldHasPredicateSymbol = hasPredicateSymbol;
    hasPredicateSymbol = newHasPredicateSymbol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL, oldHasPredicateSymbol, newHasPredicateSymbol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasPredicateSymbol(ObjectPropertyExpression newHasPredicateSymbol)
  {
    if (newHasPredicateSymbol != hasPredicateSymbol)
    {
      NotificationChain msgs = null;
      if (hasPredicateSymbol != null)
        msgs = ((InternalEObject)hasPredicateSymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL, null, msgs);
      if (newHasPredicateSymbol != null)
        msgs = ((InternalEObject)newHasPredicateSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL, null, msgs);
      msgs = basicSetHasPredicateSymbol(newHasPredicateSymbol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL, newHasPredicateSymbol, newHasPredicateSymbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAtom getAtomTarget()
  {
    return atomTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtomTarget(ClassAtom newAtomTarget, NotificationChain msgs)
  {
    ClassAtom oldAtomTarget = atomTarget;
    atomTarget = newAtomTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET, oldAtomTarget, newAtomTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomTarget(ClassAtom newAtomTarget)
  {
    if (newAtomTarget != atomTarget)
    {
      NotificationChain msgs = null;
      if (atomTarget != null)
        msgs = ((InternalEObject)atomTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET, null, msgs);
      if (newAtomTarget != null)
        msgs = ((InternalEObject)newAtomTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET, null, msgs);
      msgs = basicSetAtomTarget(newAtomTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET, newAtomTarget, newAtomTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAtom getAtomSource()
  {
    return atomSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtomSource(ClassAtom newAtomSource, NotificationChain msgs)
  {
    ClassAtom oldAtomSource = atomSource;
    atomSource = newAtomSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE, oldAtomSource, newAtomSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomSource(ClassAtom newAtomSource)
  {
    if (newAtomSource != atomSource)
    {
      NotificationChain msgs = null;
      if (atomSource != null)
        msgs = ((InternalEObject)atomSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE, null, msgs);
      if (newAtomSource != null)
        msgs = ((InternalEObject)newAtomSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE, null, msgs);
      msgs = basicSetAtomSource(newAtomSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE, newAtomSource, newAtomSource));
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
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL:
        return basicSetHasPredicateSymbol(null, msgs);
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET:
        return basicSetAtomTarget(null, msgs);
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE:
        return basicSetAtomSource(null, msgs);
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
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL:
        return getHasPredicateSymbol();
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET:
        return getAtomTarget();
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE:
        return getAtomSource();
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
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL:
        setHasPredicateSymbol((ObjectPropertyExpression)newValue);
        return;
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET:
        setAtomTarget((ClassAtom)newValue);
        return;
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE:
        setAtomSource((ClassAtom)newValue);
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
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL:
        setHasPredicateSymbol((ObjectPropertyExpression)null);
        return;
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET:
        setAtomTarget((ClassAtom)null);
        return;
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE:
        setAtomSource((ClassAtom)null);
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
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL:
        return hasPredicateSymbol != null;
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET:
        return atomTarget != null;
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE:
        return atomSource != null;
    }
    return super.eIsSet(featureID);
  }

} //IndividualPropetyAtomImpl
