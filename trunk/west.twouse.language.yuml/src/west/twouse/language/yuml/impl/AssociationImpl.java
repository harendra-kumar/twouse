/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import west.twouse.language.yuml.Association;
import west.twouse.language.yuml.AssociationType;
import west.twouse.language.yuml.Cardinality;
import west.twouse.language.yuml.Visibility;
import west.twouse.language.yuml.YumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.impl.AssociationImpl#getType <em>Type</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.AssociationImpl#isNavigableSource <em>Navigable Source</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.AssociationImpl#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.AssociationImpl#getSourceVisibility <em>Source Visibility</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.AssociationImpl#isNavigableTarget <em>Navigable Target</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.AssociationImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.AssociationImpl#getTargetVisibility <em>Target Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends RelationshipImpl implements Association {
	/**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
	protected static final AssociationType TYPE_EDEFAULT = AssociationType.SIMPLE_ASSOCIATION;

	/**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
	protected AssociationType type = TYPE_EDEFAULT;

	/**
   * The default value of the '{@link #isNavigableSource() <em>Navigable Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isNavigableSource()
   * @generated
   * @ordered
   */
	protected static final boolean NAVIGABLE_SOURCE_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isNavigableSource() <em>Navigable Source</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isNavigableSource()
   * @generated
   * @ordered
   */
	protected boolean navigableSource = NAVIGABLE_SOURCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSourceCardinality()
   * @generated
   * @ordered
   */
	protected Cardinality sourceCardinality;

	/**
   * The default value of the '{@link #getSourceVisibility() <em>Source Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSourceVisibility()
   * @generated
   * @ordered
   */
	protected static final Visibility SOURCE_VISIBILITY_EDEFAULT = Visibility.UNSPECIFIED;

	/**
   * The cached value of the '{@link #getSourceVisibility() <em>Source Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSourceVisibility()
   * @generated
   * @ordered
   */
	protected Visibility sourceVisibility = SOURCE_VISIBILITY_EDEFAULT;

	/**
   * The default value of the '{@link #isNavigableTarget() <em>Navigable Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isNavigableTarget()
   * @generated
   * @ordered
   */
	protected static final boolean NAVIGABLE_TARGET_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isNavigableTarget() <em>Navigable Target</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isNavigableTarget()
   * @generated
   * @ordered
   */
	protected boolean navigableTarget = NAVIGABLE_TARGET_EDEFAULT;

  /**
   * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargetCardinality()
   * @generated
   * @ordered
   */
	protected Cardinality targetCardinality;

	/**
   * The default value of the '{@link #getTargetVisibility() <em>Target Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargetVisibility()
   * @generated
   * @ordered
   */
	protected static final Visibility TARGET_VISIBILITY_EDEFAULT = Visibility.UNSPECIFIED;

	/**
   * The cached value of the '{@link #getTargetVisibility() <em>Target Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargetVisibility()
   * @generated
   * @ordered
   */
	protected Visibility targetVisibility = TARGET_VISIBILITY_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AssociationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return YumlPackage.Literals.ASSOCIATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssociationType getType() {
    return type;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setType(AssociationType newType) {
    AssociationType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.ASSOCIATION__TYPE, oldType, type));
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNavigableSource()
  {
    return navigableSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNavigableSource(boolean newNavigableSource)
  {
    boolean oldNavigableSource = navigableSource;
    navigableSource = newNavigableSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE, oldNavigableSource, navigableSource));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Cardinality getSourceCardinality() {
    return sourceCardinality;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSourceCardinality(Cardinality newSourceCardinality, NotificationChain msgs) {
    Cardinality oldSourceCardinality = sourceCardinality;
    sourceCardinality = newSourceCardinality;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YumlPackage.ASSOCIATION__SOURCE_CARDINALITY, oldSourceCardinality, newSourceCardinality);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSourceCardinality(Cardinality newSourceCardinality) {
    if (newSourceCardinality != sourceCardinality)
    {
      NotificationChain msgs = null;
      if (sourceCardinality != null)
        msgs = ((InternalEObject)sourceCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YumlPackage.ASSOCIATION__SOURCE_CARDINALITY, null, msgs);
      if (newSourceCardinality != null)
        msgs = ((InternalEObject)newSourceCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YumlPackage.ASSOCIATION__SOURCE_CARDINALITY, null, msgs);
      msgs = basicSetSourceCardinality(newSourceCardinality, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.ASSOCIATION__SOURCE_CARDINALITY, newSourceCardinality, newSourceCardinality));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Visibility getSourceVisibility() {
    return sourceVisibility;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSourceVisibility(Visibility newSourceVisibility) {
    Visibility oldSourceVisibility = sourceVisibility;
    sourceVisibility = newSourceVisibility == null ? SOURCE_VISIBILITY_EDEFAULT : newSourceVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.ASSOCIATION__SOURCE_VISIBILITY, oldSourceVisibility, sourceVisibility));
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNavigableTarget()
  {
    return navigableTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNavigableTarget(boolean newNavigableTarget)
  {
    boolean oldNavigableTarget = navigableTarget;
    navigableTarget = newNavigableTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.ASSOCIATION__NAVIGABLE_TARGET, oldNavigableTarget, navigableTarget));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Cardinality getTargetCardinality() {
    return targetCardinality;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTargetCardinality(Cardinality newTargetCardinality, NotificationChain msgs) {
    Cardinality oldTargetCardinality = targetCardinality;
    targetCardinality = newTargetCardinality;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YumlPackage.ASSOCIATION__TARGET_CARDINALITY, oldTargetCardinality, newTargetCardinality);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTargetCardinality(Cardinality newTargetCardinality) {
    if (newTargetCardinality != targetCardinality)
    {
      NotificationChain msgs = null;
      if (targetCardinality != null)
        msgs = ((InternalEObject)targetCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YumlPackage.ASSOCIATION__TARGET_CARDINALITY, null, msgs);
      if (newTargetCardinality != null)
        msgs = ((InternalEObject)newTargetCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YumlPackage.ASSOCIATION__TARGET_CARDINALITY, null, msgs);
      msgs = basicSetTargetCardinality(newTargetCardinality, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.ASSOCIATION__TARGET_CARDINALITY, newTargetCardinality, newTargetCardinality));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Visibility getTargetVisibility() {
    return targetVisibility;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTargetVisibility(Visibility newTargetVisibility) {
    Visibility oldTargetVisibility = targetVisibility;
    targetVisibility = newTargetVisibility == null ? TARGET_VISIBILITY_EDEFAULT : newTargetVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.ASSOCIATION__TARGET_VISIBILITY, oldTargetVisibility, targetVisibility));
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
      case YumlPackage.ASSOCIATION__SOURCE_CARDINALITY:
        return basicSetSourceCardinality(null, msgs);
      case YumlPackage.ASSOCIATION__TARGET_CARDINALITY:
        return basicSetTargetCardinality(null, msgs);
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
      case YumlPackage.ASSOCIATION__TYPE:
        return getType();
      case YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE:
        return isNavigableSource();
      case YumlPackage.ASSOCIATION__SOURCE_CARDINALITY:
        return getSourceCardinality();
      case YumlPackage.ASSOCIATION__SOURCE_VISIBILITY:
        return getSourceVisibility();
      case YumlPackage.ASSOCIATION__NAVIGABLE_TARGET:
        return isNavigableTarget();
      case YumlPackage.ASSOCIATION__TARGET_CARDINALITY:
        return getTargetCardinality();
      case YumlPackage.ASSOCIATION__TARGET_VISIBILITY:
        return getTargetVisibility();
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
      case YumlPackage.ASSOCIATION__TYPE:
        setType((AssociationType)newValue);
        return;
      case YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE:
        setNavigableSource((Boolean)newValue);
        return;
      case YumlPackage.ASSOCIATION__SOURCE_CARDINALITY:
        setSourceCardinality((Cardinality)newValue);
        return;
      case YumlPackage.ASSOCIATION__SOURCE_VISIBILITY:
        setSourceVisibility((Visibility)newValue);
        return;
      case YumlPackage.ASSOCIATION__NAVIGABLE_TARGET:
        setNavigableTarget((Boolean)newValue);
        return;
      case YumlPackage.ASSOCIATION__TARGET_CARDINALITY:
        setTargetCardinality((Cardinality)newValue);
        return;
      case YumlPackage.ASSOCIATION__TARGET_VISIBILITY:
        setTargetVisibility((Visibility)newValue);
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
      case YumlPackage.ASSOCIATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE:
        setNavigableSource(NAVIGABLE_SOURCE_EDEFAULT);
        return;
      case YumlPackage.ASSOCIATION__SOURCE_CARDINALITY:
        setSourceCardinality((Cardinality)null);
        return;
      case YumlPackage.ASSOCIATION__SOURCE_VISIBILITY:
        setSourceVisibility(SOURCE_VISIBILITY_EDEFAULT);
        return;
      case YumlPackage.ASSOCIATION__NAVIGABLE_TARGET:
        setNavigableTarget(NAVIGABLE_TARGET_EDEFAULT);
        return;
      case YumlPackage.ASSOCIATION__TARGET_CARDINALITY:
        setTargetCardinality((Cardinality)null);
        return;
      case YumlPackage.ASSOCIATION__TARGET_VISIBILITY:
        setTargetVisibility(TARGET_VISIBILITY_EDEFAULT);
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
      case YumlPackage.ASSOCIATION__TYPE:
        return type != TYPE_EDEFAULT;
      case YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE:
        return navigableSource != NAVIGABLE_SOURCE_EDEFAULT;
      case YumlPackage.ASSOCIATION__SOURCE_CARDINALITY:
        return sourceCardinality != null;
      case YumlPackage.ASSOCIATION__SOURCE_VISIBILITY:
        return sourceVisibility != SOURCE_VISIBILITY_EDEFAULT;
      case YumlPackage.ASSOCIATION__NAVIGABLE_TARGET:
        return navigableTarget != NAVIGABLE_TARGET_EDEFAULT;
      case YumlPackage.ASSOCIATION__TARGET_CARDINALITY:
        return targetCardinality != null;
      case YumlPackage.ASSOCIATION__TARGET_VISIBILITY:
        return targetVisibility != TARGET_VISIBILITY_EDEFAULT;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", navigableSource: ");
    result.append(navigableSource);
    result.append(", sourceVisibility: ");
    result.append(sourceVisibility);
    result.append(", navigableTarget: ");
    result.append(navigableTarget);
    result.append(", targetVisibility: ");
    result.append(targetVisibility);
    result.append(')');
    return result.toString();
  }

} //AssociationImpl
