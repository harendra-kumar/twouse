/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Has Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataHasValueImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataHasValueImpl#getDataPropertyExpression <em>Data Property Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataHasValueImpl extends ClassExpressionImpl implements DataHasValue {
	/**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
	protected Literal literal;

	/**
   * The cached value of the '{@link #getDataPropertyExpression() <em>Data Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDataPropertyExpression()
   * @generated
   * @ordered
   */
	protected DataPropertyExpression dataPropertyExpression;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DataHasValueImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.DATA_HAS_VALUE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Literal getLiteral() {
    return literal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetLiteral(Literal newLiteral, NotificationChain msgs) {
    Literal oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.DATA_HAS_VALUE__LITERAL, oldLiteral, newLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLiteral(Literal newLiteral) {
    if (newLiteral != literal)
    {
      NotificationChain msgs = null;
      if (literal != null)
        msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.DATA_HAS_VALUE__LITERAL, null, msgs);
      if (newLiteral != null)
        msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.DATA_HAS_VALUE__LITERAL, null, msgs);
      msgs = basicSetLiteral(newLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.DATA_HAS_VALUE__LITERAL, newLiteral, newLiteral));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DataPropertyExpression getDataPropertyExpression() {
    return dataPropertyExpression;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDataPropertyExpression(DataPropertyExpression newDataPropertyExpression, NotificationChain msgs) {
    DataPropertyExpression oldDataPropertyExpression = dataPropertyExpression;
    dataPropertyExpression = newDataPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION, oldDataPropertyExpression, newDataPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDataPropertyExpression(DataPropertyExpression newDataPropertyExpression) {
    if (newDataPropertyExpression != dataPropertyExpression)
    {
      NotificationChain msgs = null;
      if (dataPropertyExpression != null)
        msgs = ((InternalEObject)dataPropertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION, null, msgs);
      if (newDataPropertyExpression != null)
        msgs = ((InternalEObject)newDataPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetDataPropertyExpression(newDataPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION, newDataPropertyExpression, newDataPropertyExpression));
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
      case SPARQLASPackage.DATA_HAS_VALUE__LITERAL:
        return basicSetLiteral(null, msgs);
      case SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION:
        return basicSetDataPropertyExpression(null, msgs);
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
      case SPARQLASPackage.DATA_HAS_VALUE__LITERAL:
        return getLiteral();
      case SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION:
        return getDataPropertyExpression();
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
      case SPARQLASPackage.DATA_HAS_VALUE__LITERAL:
        setLiteral((Literal)newValue);
        return;
      case SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION:
        setDataPropertyExpression((DataPropertyExpression)newValue);
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
      case SPARQLASPackage.DATA_HAS_VALUE__LITERAL:
        setLiteral((Literal)null);
        return;
      case SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION:
        setDataPropertyExpression((DataPropertyExpression)null);
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
      case SPARQLASPackage.DATA_HAS_VALUE__LITERAL:
        return literal != null;
      case SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION:
        return dataPropertyExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //DataHasValueImpl
