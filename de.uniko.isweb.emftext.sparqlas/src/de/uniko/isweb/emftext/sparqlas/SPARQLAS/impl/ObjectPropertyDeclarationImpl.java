/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyDeclarationImpl#getObjectPropertyVariable <em>Object Property Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyDeclarationImpl extends DeclarationImpl implements ObjectPropertyDeclaration {
	/**
   * The cached value of the '{@link #getObjectPropertyVariable() <em>Object Property Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getObjectPropertyVariable()
   * @generated
   * @ordered
   */
	protected ObjectPropertyVariable objectPropertyVariable;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ObjectPropertyDeclarationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.OBJECT_PROPERTY_DECLARATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectPropertyVariable getObjectPropertyVariable() {
    return objectPropertyVariable;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetObjectPropertyVariable(ObjectPropertyVariable newObjectPropertyVariable, NotificationChain msgs) {
    ObjectPropertyVariable oldObjectPropertyVariable = objectPropertyVariable;
    objectPropertyVariable = newObjectPropertyVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE, oldObjectPropertyVariable, newObjectPropertyVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setObjectPropertyVariable(ObjectPropertyVariable newObjectPropertyVariable) {
    if (newObjectPropertyVariable != objectPropertyVariable)
    {
      NotificationChain msgs = null;
      if (objectPropertyVariable != null)
        msgs = ((InternalEObject)objectPropertyVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE, null, msgs);
      if (newObjectPropertyVariable != null)
        msgs = ((InternalEObject)newObjectPropertyVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE, null, msgs);
      msgs = basicSetObjectPropertyVariable(newObjectPropertyVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE, newObjectPropertyVariable, newObjectPropertyVariable));
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
      case SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE:
        return basicSetObjectPropertyVariable(null, msgs);
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
      case SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE:
        return getObjectPropertyVariable();
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
      case SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE:
        setObjectPropertyVariable((ObjectPropertyVariable)newValue);
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
      case SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE:
        setObjectPropertyVariable((ObjectPropertyVariable)null);
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
      case SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE:
        return objectPropertyVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectPropertyDeclarationImpl
