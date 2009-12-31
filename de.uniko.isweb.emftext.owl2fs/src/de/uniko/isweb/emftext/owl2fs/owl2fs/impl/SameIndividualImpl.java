/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Same Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SameIndividualImpl#getSameIndividuals <em>Same Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SameIndividualImpl extends AssertionImpl implements SameIndividual
{
  /**
   * The cached value of the '{@link #getSameIndividuals() <em>Same Individuals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSameIndividuals()
   * @generated
   * @ordered
   */
  protected EList<NamedIndividual> sameIndividuals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SameIndividualImpl()
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
    return Owl2fsPackage.Literals.SAME_INDIVIDUAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedIndividual> getSameIndividuals()
  {
    if (sameIndividuals == null)
    {
      sameIndividuals = new EObjectContainmentEList<NamedIndividual>(NamedIndividual.class, this, Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS);
    }
    return sameIndividuals;
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
      case Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS:
        return ((InternalEList<?>)getSameIndividuals()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS:
        return getSameIndividuals();
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
      case Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS:
        getSameIndividuals().clear();
        getSameIndividuals().addAll((Collection<? extends NamedIndividual>)newValue);
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
      case Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS:
        getSameIndividuals().clear();
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
      case Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS:
        return sameIndividuals != null && !sameIndividuals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SameIndividualImpl
