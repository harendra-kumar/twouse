/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals;
import de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Different Individuals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DifferentIndividualsImpl#getDifferentIndividuals <em>Different Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DifferentIndividualsImpl extends AssertionImpl implements DifferentIndividuals
{
  /**
   * The cached value of the '{@link #getDifferentIndividuals() <em>Different Individuals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifferentIndividuals()
   * @generated
   * @ordered
   */
  protected EList<NamedIndividual> differentIndividuals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DifferentIndividualsImpl()
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
    return Owl2fsPackage.Literals.DIFFERENT_INDIVIDUALS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedIndividual> getDifferentIndividuals()
  {
    if (differentIndividuals == null)
    {
      differentIndividuals = new EObjectContainmentEList<NamedIndividual>(NamedIndividual.class, this, Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS);
    }
    return differentIndividuals;
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
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS:
        return ((InternalEList<?>)getDifferentIndividuals()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS:
        return getDifferentIndividuals();
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
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS:
        getDifferentIndividuals().clear();
        getDifferentIndividuals().addAll((Collection<? extends NamedIndividual>)newValue);
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
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS:
        getDifferentIndividuals().clear();
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
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS:
        return differentIndividuals != null && !differentIndividuals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DifferentIndividualsImpl
