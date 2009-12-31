/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Atom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AtomImpl#getIsInConsequent <em>Is In Consequent</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AtomImpl#getIsInAntecedent <em>Is In Antecedent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AtomImpl extends EObjectImpl implements Atom
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomImpl()
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
    return Owl2fsPackage.Literals.ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Consequent getIsInConsequent()
  {
    if (eContainerFeatureID() != Owl2fsPackage.ATOM__IS_IN_CONSEQUENT) return null;
    return (Consequent)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsInConsequent(Consequent newIsInConsequent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newIsInConsequent, Owl2fsPackage.ATOM__IS_IN_CONSEQUENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsInConsequent(Consequent newIsInConsequent)
  {
    if (newIsInConsequent != eInternalContainer() || (eContainerFeatureID() != Owl2fsPackage.ATOM__IS_IN_CONSEQUENT && newIsInConsequent != null))
    {
      if (EcoreUtil.isAncestor(this, newIsInConsequent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newIsInConsequent != null)
        msgs = ((InternalEObject)newIsInConsequent).eInverseAdd(this, Owl2fsPackage.CONSEQUENT__CONTAINS_ATOMS, Consequent.class, msgs);
      msgs = basicSetIsInConsequent(newIsInConsequent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ATOM__IS_IN_CONSEQUENT, newIsInConsequent, newIsInConsequent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedent getIsInAntecedent()
  {
    if (eContainerFeatureID() != Owl2fsPackage.ATOM__IS_IN_ANTECEDENT) return null;
    return (Antecedent)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsInAntecedent(Antecedent newIsInAntecedent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newIsInAntecedent, Owl2fsPackage.ATOM__IS_IN_ANTECEDENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsInAntecedent(Antecedent newIsInAntecedent)
  {
    if (newIsInAntecedent != eInternalContainer() || (eContainerFeatureID() != Owl2fsPackage.ATOM__IS_IN_ANTECEDENT && newIsInAntecedent != null))
    {
      if (EcoreUtil.isAncestor(this, newIsInAntecedent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newIsInAntecedent != null)
        msgs = ((InternalEObject)newIsInAntecedent).eInverseAdd(this, Owl2fsPackage.ANTECEDENT__CONTAINS_ATOMS, Antecedent.class, msgs);
      msgs = basicSetIsInAntecedent(newIsInAntecedent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ATOM__IS_IN_ANTECEDENT, newIsInAntecedent, newIsInAntecedent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Owl2fsPackage.ATOM__IS_IN_CONSEQUENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetIsInConsequent((Consequent)otherEnd, msgs);
      case Owl2fsPackage.ATOM__IS_IN_ANTECEDENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetIsInAntecedent((Antecedent)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case Owl2fsPackage.ATOM__IS_IN_CONSEQUENT:
        return basicSetIsInConsequent(null, msgs);
      case Owl2fsPackage.ATOM__IS_IN_ANTECEDENT:
        return basicSetIsInAntecedent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case Owl2fsPackage.ATOM__IS_IN_CONSEQUENT:
        return eInternalContainer().eInverseRemove(this, Owl2fsPackage.CONSEQUENT__CONTAINS_ATOMS, Consequent.class, msgs);
      case Owl2fsPackage.ATOM__IS_IN_ANTECEDENT:
        return eInternalContainer().eInverseRemove(this, Owl2fsPackage.ANTECEDENT__CONTAINS_ATOMS, Antecedent.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case Owl2fsPackage.ATOM__IS_IN_CONSEQUENT:
        return getIsInConsequent();
      case Owl2fsPackage.ATOM__IS_IN_ANTECEDENT:
        return getIsInAntecedent();
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
      case Owl2fsPackage.ATOM__IS_IN_CONSEQUENT:
        setIsInConsequent((Consequent)newValue);
        return;
      case Owl2fsPackage.ATOM__IS_IN_ANTECEDENT:
        setIsInAntecedent((Antecedent)newValue);
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
      case Owl2fsPackage.ATOM__IS_IN_CONSEQUENT:
        setIsInConsequent((Consequent)null);
        return;
      case Owl2fsPackage.ATOM__IS_IN_ANTECEDENT:
        setIsInAntecedent((Antecedent)null);
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
      case Owl2fsPackage.ATOM__IS_IN_CONSEQUENT:
        return getIsInConsequent() != null;
      case Owl2fsPackage.ATOM__IS_IN_ANTECEDENT:
        return getIsInAntecedent() != null;
    }
    return super.eIsSet(featureID);
  }

} //AtomImpl
