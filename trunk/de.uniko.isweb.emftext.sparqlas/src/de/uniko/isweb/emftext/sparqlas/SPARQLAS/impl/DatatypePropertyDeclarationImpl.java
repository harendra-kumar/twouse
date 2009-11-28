/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DatatypePropertyDeclarationImpl#getDatatypePropertyVariable <em>Datatype Property Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypePropertyDeclarationImpl extends DeclarationImpl implements DatatypePropertyDeclaration {
	/**
   * The cached value of the '{@link #getDatatypePropertyVariable() <em>Datatype Property Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDatatypePropertyVariable()
   * @generated
   * @ordered
   */
	protected DataPropertyVariable datatypePropertyVariable;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DatatypePropertyDeclarationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.DATATYPE_PROPERTY_DECLARATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DataPropertyVariable getDatatypePropertyVariable() {
    return datatypePropertyVariable;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDatatypePropertyVariable(DataPropertyVariable newDatatypePropertyVariable, NotificationChain msgs) {
    DataPropertyVariable oldDatatypePropertyVariable = datatypePropertyVariable;
    datatypePropertyVariable = newDatatypePropertyVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE, oldDatatypePropertyVariable, newDatatypePropertyVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDatatypePropertyVariable(DataPropertyVariable newDatatypePropertyVariable) {
    if (newDatatypePropertyVariable != datatypePropertyVariable)
    {
      NotificationChain msgs = null;
      if (datatypePropertyVariable != null)
        msgs = ((InternalEObject)datatypePropertyVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE, null, msgs);
      if (newDatatypePropertyVariable != null)
        msgs = ((InternalEObject)newDatatypePropertyVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE, null, msgs);
      msgs = basicSetDatatypePropertyVariable(newDatatypePropertyVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE, newDatatypePropertyVariable, newDatatypePropertyVariable));
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
      case SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE:
        return basicSetDatatypePropertyVariable(null, msgs);
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
      case SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE:
        return getDatatypePropertyVariable();
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
      case SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE:
        setDatatypePropertyVariable((DataPropertyVariable)newValue);
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
      case SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE:
        setDatatypePropertyVariable((DataPropertyVariable)null);
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
      case SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE:
        return datatypePropertyVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //DatatypePropertyDeclarationImpl
