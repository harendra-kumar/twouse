/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datavalued Property Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatavaluedPropertyAtomImpl#getHasPredicateSymbol <em>Has Predicate Symbol</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatavaluedPropertyAtomImpl#getAtomTarget <em>Atom Target</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatavaluedPropertyAtomImpl#getAtomSource <em>Atom Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatavaluedPropertyAtomImpl extends PropertyAtomImpl implements DatavaluedPropertyAtom
{
  /**
   * The cached value of the '{@link #getHasPredicateSymbol() <em>Has Predicate Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasPredicateSymbol()
   * @generated
   * @ordered
   */
  protected DataPropertyExpression hasPredicateSymbol;

  /**
   * The cached value of the '{@link #getAtomTarget() <em>Atom Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomTarget()
   * @generated
   * @ordered
   */
  protected DataRangeAtom atomTarget;

  /**
   * The cached value of the '{@link #getAtomSource() <em>Atom Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomSource()
   * @generated
   * @ordered
   */
  protected DataRangeAtom atomSource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatavaluedPropertyAtomImpl()
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
    return Owl2fsPackage.Literals.DATAVALUED_PROPERTY_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyExpression getHasPredicateSymbol()
  {
    return hasPredicateSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasPredicateSymbol(DataPropertyExpression newHasPredicateSymbol, NotificationChain msgs)
  {
    DataPropertyExpression oldHasPredicateSymbol = hasPredicateSymbol;
    hasPredicateSymbol = newHasPredicateSymbol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL, oldHasPredicateSymbol, newHasPredicateSymbol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasPredicateSymbol(DataPropertyExpression newHasPredicateSymbol)
  {
    if (newHasPredicateSymbol != hasPredicateSymbol)
    {
      NotificationChain msgs = null;
      if (hasPredicateSymbol != null)
        msgs = ((InternalEObject)hasPredicateSymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL, null, msgs);
      if (newHasPredicateSymbol != null)
        msgs = ((InternalEObject)newHasPredicateSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL, null, msgs);
      msgs = basicSetHasPredicateSymbol(newHasPredicateSymbol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL, newHasPredicateSymbol, newHasPredicateSymbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataRangeAtom getAtomTarget()
  {
    return atomTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtomTarget(DataRangeAtom newAtomTarget, NotificationChain msgs)
  {
    DataRangeAtom oldAtomTarget = atomTarget;
    atomTarget = newAtomTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_TARGET, oldAtomTarget, newAtomTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomTarget(DataRangeAtom newAtomTarget)
  {
    if (newAtomTarget != atomTarget)
    {
      NotificationChain msgs = null;
      if (atomTarget != null)
        msgs = ((InternalEObject)atomTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_TARGET, null, msgs);
      if (newAtomTarget != null)
        msgs = ((InternalEObject)newAtomTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_TARGET, null, msgs);
      msgs = basicSetAtomTarget(newAtomTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_TARGET, newAtomTarget, newAtomTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataRangeAtom getAtomSource()
  {
    return atomSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtomSource(DataRangeAtom newAtomSource, NotificationChain msgs)
  {
    DataRangeAtom oldAtomSource = atomSource;
    atomSource = newAtomSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE, oldAtomSource, newAtomSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomSource(DataRangeAtom newAtomSource)
  {
    if (newAtomSource != atomSource)
    {
      NotificationChain msgs = null;
      if (atomSource != null)
        msgs = ((InternalEObject)atomSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE, null, msgs);
      if (newAtomSource != null)
        msgs = ((InternalEObject)newAtomSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE, null, msgs);
      msgs = basicSetAtomSource(newAtomSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE, newAtomSource, newAtomSource));
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
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL:
        return basicSetHasPredicateSymbol(null, msgs);
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_TARGET:
        return basicSetAtomTarget(null, msgs);
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE:
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
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL:
        return getHasPredicateSymbol();
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_TARGET:
        return getAtomTarget();
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE:
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
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL:
        setHasPredicateSymbol((DataPropertyExpression)newValue);
        return;
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_TARGET:
        setAtomTarget((DataRangeAtom)newValue);
        return;
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE:
        setAtomSource((DataRangeAtom)newValue);
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
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL:
        setHasPredicateSymbol((DataPropertyExpression)null);
        return;
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_TARGET:
        setAtomTarget((DataRangeAtom)null);
        return;
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE:
        setAtomSource((DataRangeAtom)null);
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
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL:
        return hasPredicateSymbol != null;
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_TARGET:
        return atomTarget != null;
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE:
        return atomSource != null;
    }
    return super.eIsSet(featureID);
  }

} //DatavaluedPropertyAtomImpl
