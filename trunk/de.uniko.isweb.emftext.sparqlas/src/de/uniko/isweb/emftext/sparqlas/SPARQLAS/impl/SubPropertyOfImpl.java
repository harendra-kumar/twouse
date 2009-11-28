/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Property Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SubPropertyOfImpl#getSubObjectPropertyExpression <em>Sub Object Property Expression</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SubPropertyOfImpl#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubPropertyOfImpl extends ObjectPropertyAtomImpl implements SubPropertyOf {
	/**
   * The cached value of the '{@link #getSubObjectPropertyExpression() <em>Sub Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSubObjectPropertyExpression()
   * @generated
   * @ordered
   */
	protected ObjectPropertyExpression subObjectPropertyExpression;

	/**
   * The cached value of the '{@link #getSuperObjectPropertyExpression() <em>Super Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSuperObjectPropertyExpression()
   * @generated
   * @ordered
   */
	protected ObjectPropertyExpression superObjectPropertyExpression;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SubPropertyOfImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.SUB_PROPERTY_OF;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectPropertyExpression getSubObjectPropertyExpression() {
    return subObjectPropertyExpression;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSubObjectPropertyExpression(ObjectPropertyExpression newSubObjectPropertyExpression, NotificationChain msgs) {
    ObjectPropertyExpression oldSubObjectPropertyExpression = subObjectPropertyExpression;
    subObjectPropertyExpression = newSubObjectPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION, oldSubObjectPropertyExpression, newSubObjectPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSubObjectPropertyExpression(ObjectPropertyExpression newSubObjectPropertyExpression) {
    if (newSubObjectPropertyExpression != subObjectPropertyExpression)
    {
      NotificationChain msgs = null;
      if (subObjectPropertyExpression != null)
        msgs = ((InternalEObject)subObjectPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION, null, msgs);
      if (newSubObjectPropertyExpression != null)
        msgs = ((InternalEObject)newSubObjectPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetSubObjectPropertyExpression(newSubObjectPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION, newSubObjectPropertyExpression, newSubObjectPropertyExpression));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectPropertyExpression getSuperObjectPropertyExpression() {
    return superObjectPropertyExpression;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSuperObjectPropertyExpression(ObjectPropertyExpression newSuperObjectPropertyExpression, NotificationChain msgs) {
    ObjectPropertyExpression oldSuperObjectPropertyExpression = superObjectPropertyExpression;
    superObjectPropertyExpression = newSuperObjectPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION, oldSuperObjectPropertyExpression, newSuperObjectPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSuperObjectPropertyExpression(ObjectPropertyExpression newSuperObjectPropertyExpression) {
    if (newSuperObjectPropertyExpression != superObjectPropertyExpression)
    {
      NotificationChain msgs = null;
      if (superObjectPropertyExpression != null)
        msgs = ((InternalEObject)superObjectPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION, null, msgs);
      if (newSuperObjectPropertyExpression != null)
        msgs = ((InternalEObject)newSuperObjectPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetSuperObjectPropertyExpression(newSuperObjectPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION, newSuperObjectPropertyExpression, newSuperObjectPropertyExpression));
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
      case SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION:
        return basicSetSubObjectPropertyExpression(null, msgs);
      case SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
        return basicSetSuperObjectPropertyExpression(null, msgs);
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
      case SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION:
        return getSubObjectPropertyExpression();
      case SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
        return getSuperObjectPropertyExpression();
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
      case SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION:
        setSubObjectPropertyExpression((ObjectPropertyExpression)newValue);
        return;
      case SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
        setSuperObjectPropertyExpression((ObjectPropertyExpression)newValue);
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
      case SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION:
        setSubObjectPropertyExpression((ObjectPropertyExpression)null);
        return;
      case SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
        setSuperObjectPropertyExpression((ObjectPropertyExpression)null);
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
      case SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION:
        return subObjectPropertyExpression != null;
      case SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION:
        return superObjectPropertyExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //SubPropertyOfImpl
