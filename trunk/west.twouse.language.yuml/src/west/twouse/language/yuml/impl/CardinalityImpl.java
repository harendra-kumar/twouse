/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import west.twouse.language.yuml.Cardinality;
import west.twouse.language.yuml.YumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.impl.CardinalityImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.CardinalityImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardinalityImpl extends EObjectImpl implements Cardinality {
	/**
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
	protected static final String LOWER_BOUND_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
	protected String lowerBound = LOWER_BOUND_EDEFAULT;

	/**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
	protected static final String UPPER_BOUND_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
	protected String upperBound = UPPER_BOUND_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CardinalityImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return YumlPackage.Literals.CARDINALITY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLowerBound() {
    return lowerBound;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(String newLowerBound)
  {
    String oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.CARDINALITY__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getUpperBound() {
    return upperBound;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(String newUpperBound)
  {
    String oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.CARDINALITY__UPPER_BOUND, oldUpperBound, upperBound));
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
      case YumlPackage.CARDINALITY__LOWER_BOUND:
        return getLowerBound();
      case YumlPackage.CARDINALITY__UPPER_BOUND:
        return getUpperBound();
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
      case YumlPackage.CARDINALITY__LOWER_BOUND:
        setLowerBound((String)newValue);
        return;
      case YumlPackage.CARDINALITY__UPPER_BOUND:
        setUpperBound((String)newValue);
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
      case YumlPackage.CARDINALITY__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case YumlPackage.CARDINALITY__UPPER_BOUND:
        setUpperBound(UPPER_BOUND_EDEFAULT);
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
      case YumlPackage.CARDINALITY__LOWER_BOUND:
        return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
      case YumlPackage.CARDINALITY__UPPER_BOUND:
        return UPPER_BOUND_EDEFAULT == null ? upperBound != null : !UPPER_BOUND_EDEFAULT.equals(upperBound);
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
    result.append(" (lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(')');
    return result.toString();
  }

} //CardinalityImpl
