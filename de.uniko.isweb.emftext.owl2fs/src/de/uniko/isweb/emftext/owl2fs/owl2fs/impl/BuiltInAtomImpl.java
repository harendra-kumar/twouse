/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DObject;
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
 * An implementation of the model object '<em><b>Built In Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.BuiltInAtomImpl#getHasPredicateSymbol <em>Has Predicate Symbol</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.BuiltInAtomImpl#getHasTerms <em>Has Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltInAtomImpl extends AtomImpl implements BuiltInAtom
{
  /**
   * The default value of the '{@link #getHasPredicateSymbol() <em>Has Predicate Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasPredicateSymbol()
   * @generated
   * @ordered
   */
  protected static final BuiltInID HAS_PREDICATE_SYMBOL_EDEFAULT = BuiltInID.EQUAL;

  /**
   * The cached value of the '{@link #getHasPredicateSymbol() <em>Has Predicate Symbol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasPredicateSymbol()
   * @generated
   * @ordered
   */
  protected BuiltInID hasPredicateSymbol = HAS_PREDICATE_SYMBOL_EDEFAULT;

  /**
   * The cached value of the '{@link #getHasTerms() <em>Has Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasTerms()
   * @generated
   * @ordered
   */
  protected EList<DObject> hasTerms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuiltInAtomImpl()
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
    return Owl2fsPackage.Literals.BUILT_IN_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInID getHasPredicateSymbol()
  {
    return hasPredicateSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasPredicateSymbol(BuiltInID newHasPredicateSymbol)
  {
    BuiltInID oldHasPredicateSymbol = hasPredicateSymbol;
    hasPredicateSymbol = newHasPredicateSymbol == null ? HAS_PREDICATE_SYMBOL_EDEFAULT : newHasPredicateSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.BUILT_IN_ATOM__HAS_PREDICATE_SYMBOL, oldHasPredicateSymbol, hasPredicateSymbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DObject> getHasTerms()
  {
    if (hasTerms == null)
    {
      hasTerms = new EObjectContainmentEList<DObject>(DObject.class, this, Owl2fsPackage.BUILT_IN_ATOM__HAS_TERMS);
    }
    return hasTerms;
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
      case Owl2fsPackage.BUILT_IN_ATOM__HAS_TERMS:
        return ((InternalEList<?>)getHasTerms()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.BUILT_IN_ATOM__HAS_PREDICATE_SYMBOL:
        return getHasPredicateSymbol();
      case Owl2fsPackage.BUILT_IN_ATOM__HAS_TERMS:
        return getHasTerms();
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
      case Owl2fsPackage.BUILT_IN_ATOM__HAS_PREDICATE_SYMBOL:
        setHasPredicateSymbol((BuiltInID)newValue);
        return;
      case Owl2fsPackage.BUILT_IN_ATOM__HAS_TERMS:
        getHasTerms().clear();
        getHasTerms().addAll((Collection<? extends DObject>)newValue);
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
      case Owl2fsPackage.BUILT_IN_ATOM__HAS_PREDICATE_SYMBOL:
        setHasPredicateSymbol(HAS_PREDICATE_SYMBOL_EDEFAULT);
        return;
      case Owl2fsPackage.BUILT_IN_ATOM__HAS_TERMS:
        getHasTerms().clear();
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
      case Owl2fsPackage.BUILT_IN_ATOM__HAS_PREDICATE_SYMBOL:
        return hasPredicateSymbol != HAS_PREDICATE_SYMBOL_EDEFAULT;
      case Owl2fsPackage.BUILT_IN_ATOM__HAS_TERMS:
        return hasTerms != null && !hasTerms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (hasPredicateSymbol: ");
    result.append(hasPredicateSymbol);
    result.append(')');
    return result.toString();
  }

} //BuiltInAtomImpl
