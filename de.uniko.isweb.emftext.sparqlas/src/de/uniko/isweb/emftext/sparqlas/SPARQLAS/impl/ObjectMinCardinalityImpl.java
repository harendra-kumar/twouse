/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Min Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMinCardinalityImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMinCardinalityImpl#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMinCardinalityImpl#getObjectPropertyExpression <em>Object Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectMinCardinalityImpl extends ClassExpressionImpl implements ObjectMinCardinality {
	/**
   * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
	protected static final int CARDINALITY_EDEFAULT = 0;

	/**
   * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
	protected int cardinality = CARDINALITY_EDEFAULT;

	/**
   * The cached value of the '{@link #getClassExpression() <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getClassExpression()
   * @generated
   * @ordered
   */
	protected ClassExpression classExpression;

	/**
   * The cached value of the '{@link #getObjectPropertyExpression() <em>Object Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getObjectPropertyExpression()
   * @generated
   * @ordered
   */
	protected ObjectPropertyExpression objectPropertyExpression;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ObjectMinCardinalityImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.OBJECT_MIN_CARDINALITY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getCardinality() {
    return cardinality;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCardinality(int newCardinality) {
    int oldCardinality = cardinality;
    cardinality = newCardinality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY, oldCardinality, cardinality));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClassExpression getClassExpression() {
    return classExpression;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetClassExpression(ClassExpression newClassExpression, NotificationChain msgs) {
    ClassExpression oldClassExpression = classExpression;
    classExpression = newClassExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION, oldClassExpression, newClassExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setClassExpression(ClassExpression newClassExpression) {
    if (newClassExpression != classExpression)
    {
      NotificationChain msgs = null;
      if (classExpression != null)
        msgs = ((InternalEObject)classExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION, null, msgs);
      if (newClassExpression != null)
        msgs = ((InternalEObject)newClassExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION, null, msgs);
      msgs = basicSetClassExpression(newClassExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION, newClassExpression, newClassExpression));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectPropertyExpression getObjectPropertyExpression() {
    return objectPropertyExpression;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetObjectPropertyExpression(ObjectPropertyExpression newObjectPropertyExpression, NotificationChain msgs) {
    ObjectPropertyExpression oldObjectPropertyExpression = objectPropertyExpression;
    objectPropertyExpression = newObjectPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION, oldObjectPropertyExpression, newObjectPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setObjectPropertyExpression(ObjectPropertyExpression newObjectPropertyExpression) {
    if (newObjectPropertyExpression != objectPropertyExpression)
    {
      NotificationChain msgs = null;
      if (objectPropertyExpression != null)
        msgs = ((InternalEObject)objectPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION, null, msgs);
      if (newObjectPropertyExpression != null)
        msgs = ((InternalEObject)newObjectPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetObjectPropertyExpression(newObjectPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION, newObjectPropertyExpression, newObjectPropertyExpression));
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
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION:
        return basicSetClassExpression(null, msgs);
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION:
        return basicSetObjectPropertyExpression(null, msgs);
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
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY:
        return getCardinality();
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION:
        return getClassExpression();
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION:
        return getObjectPropertyExpression();
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
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY:
        setCardinality((Integer)newValue);
        return;
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)newValue);
        return;
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION:
        setObjectPropertyExpression((ObjectPropertyExpression)newValue);
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
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY:
        setCardinality(CARDINALITY_EDEFAULT);
        return;
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)null);
        return;
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION:
        setObjectPropertyExpression((ObjectPropertyExpression)null);
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
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY:
        return cardinality != CARDINALITY_EDEFAULT;
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION:
        return classExpression != null;
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION:
        return objectPropertyExpression != null;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (cardinality: ");
    result.append(cardinality);
    result.append(')');
    return result.toString();
  }

} //ObjectMinCardinalityImpl
