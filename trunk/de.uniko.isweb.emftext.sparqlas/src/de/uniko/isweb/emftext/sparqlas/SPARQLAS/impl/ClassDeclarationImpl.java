/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassDeclarationImpl#getClassVariable <em>Class Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDeclarationImpl extends DeclarationImpl implements ClassDeclaration {
	/**
   * The cached value of the '{@link #getClassVariable() <em>Class Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getClassVariable()
   * @generated
   * @ordered
   */
	protected ClassVariable classVariable;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ClassDeclarationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.CLASS_DECLARATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClassVariable getClassVariable() {
    return classVariable;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetClassVariable(ClassVariable newClassVariable, NotificationChain msgs) {
    ClassVariable oldClassVariable = classVariable;
    classVariable = newClassVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE, oldClassVariable, newClassVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setClassVariable(ClassVariable newClassVariable) {
    if (newClassVariable != classVariable)
    {
      NotificationChain msgs = null;
      if (classVariable != null)
        msgs = ((InternalEObject)classVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE, null, msgs);
      if (newClassVariable != null)
        msgs = ((InternalEObject)newClassVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE, null, msgs);
      msgs = basicSetClassVariable(newClassVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE, newClassVariable, newClassVariable));
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
      case SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE:
        return basicSetClassVariable(null, msgs);
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
      case SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE:
        return getClassVariable();
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
      case SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE:
        setClassVariable((ClassVariable)newValue);
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
      case SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE:
        setClassVariable((ClassVariable)null);
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
      case SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE:
        return classVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassDeclarationImpl
