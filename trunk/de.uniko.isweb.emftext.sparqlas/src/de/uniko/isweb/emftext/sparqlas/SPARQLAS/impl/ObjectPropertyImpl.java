/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Constant;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyImpl#getConstantIRI <em>Constant IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyImpl extends ObjectPropertyExpressionImpl implements ObjectProperty {
	/**
   * The cached value of the '{@link #getConstantIRI() <em>Constant IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConstantIRI()
   * @generated
   * @ordered
   */
	protected IRI constantIRI;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ObjectPropertyImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.OBJECT_PROPERTY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IRI getConstantIRI() {
    return constantIRI;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetConstantIRI(IRI newConstantIRI, NotificationChain msgs) {
    IRI oldConstantIRI = constantIRI;
    constantIRI = newConstantIRI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI, oldConstantIRI, newConstantIRI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConstantIRI(IRI newConstantIRI) {
    if (newConstantIRI != constantIRI)
    {
      NotificationChain msgs = null;
      if (constantIRI != null)
        msgs = ((InternalEObject)constantIRI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI, null, msgs);
      if (newConstantIRI != null)
        msgs = ((InternalEObject)newConstantIRI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI, null, msgs);
      msgs = basicSetConstantIRI(newConstantIRI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI, newConstantIRI, newConstantIRI));
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
      case SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI:
        return basicSetConstantIRI(null, msgs);
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
      case SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI:
        return getConstantIRI();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI:
        setConstantIRI((IRI)newValue);
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
      case SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI:
        setConstantIRI((IRI)null);
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
      case SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI:
        return constantIRI != null;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == Term.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Constant.class)
    {
      switch (derivedFeatureID)
      {
        case SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI: return SPARQLASPackage.CONSTANT__CONSTANT_IRI;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == Term.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Constant.class)
    {
      switch (baseFeatureID)
      {
        case SPARQLASPackage.CONSTANT__CONSTANT_IRI: return SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ObjectPropertyImpl
