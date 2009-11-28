/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual;

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
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SameIndividualImpl#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SameIndividualImpl extends AssertionImpl implements SameIndividual {
	/**
   * The cached value of the '{@link #getIndividuals() <em>Individuals</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getIndividuals()
   * @generated
   * @ordered
   */
	protected EList<Individual> individuals;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SameIndividualImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.SAME_INDIVIDUAL;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Individual> getIndividuals() {
    if (individuals == null)
    {
      individuals = new EObjectContainmentEList<Individual>(Individual.class, this, SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS);
    }
    return individuals;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS:
        return ((InternalEList<?>)getIndividuals()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS:
        return getIndividuals();
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
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS:
        getIndividuals().clear();
        getIndividuals().addAll((Collection<? extends Individual>)newValue);
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
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS:
        getIndividuals().clear();
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
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS:
        return individuals != null && !individuals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SameIndividualImpl
