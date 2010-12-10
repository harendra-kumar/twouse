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

import west.twouse.language.yuml.ColorableElement;
import west.twouse.language.yuml.Relationship;
import west.twouse.language.yuml.YumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.RelationshipImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.RelationshipImpl#getTargetLabel <em>Target Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationshipImpl extends ModelElementImpl implements Relationship {
	/**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
	protected west.twouse.language.yuml.Class source;

	/**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
	protected ColorableElement target;

	/**
   * The default value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSourceLabel()
   * @generated
   * @ordered
   */
	protected static final String SOURCE_LABEL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSourceLabel() <em>Source Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSourceLabel()
   * @generated
   * @ordered
   */
	protected String sourceLabel = SOURCE_LABEL_EDEFAULT;

	/**
   * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargetLabel()
   * @generated
   * @ordered
   */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargetLabel()
   * @generated
   * @ordered
   */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected RelationshipImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return YumlPackage.Literals.RELATIONSHIP;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public west.twouse.language.yuml.Class getSource() {
    return source;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSource(west.twouse.language.yuml.Class newSource, NotificationChain msgs) {
    west.twouse.language.yuml.Class oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YumlPackage.RELATIONSHIP__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSource(west.twouse.language.yuml.Class newSource) {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YumlPackage.RELATIONSHIP__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YumlPackage.RELATIONSHIP__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.RELATIONSHIP__SOURCE, newSource, newSource));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ColorableElement getTarget() {
    return target;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(ColorableElement newTarget, NotificationChain msgs)
  {
    ColorableElement oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YumlPackage.RELATIONSHIP__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ColorableElement newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YumlPackage.RELATIONSHIP__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YumlPackage.RELATIONSHIP__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.RELATIONSHIP__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSourceLabel() {
    return sourceLabel;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSourceLabel(String newSourceLabel) {
    String oldSourceLabel = sourceLabel;
    sourceLabel = newSourceLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.RELATIONSHIP__SOURCE_LABEL, oldSourceLabel, sourceLabel));
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTargetLabel() {
    return targetLabel;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTargetLabel(String newTargetLabel) {
    String oldTargetLabel = targetLabel;
    targetLabel = newTargetLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.RELATIONSHIP__TARGET_LABEL, oldTargetLabel, targetLabel));
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
      case YumlPackage.RELATIONSHIP__SOURCE:
        return basicSetSource(null, msgs);
      case YumlPackage.RELATIONSHIP__TARGET:
        return basicSetTarget(null, msgs);
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
      case YumlPackage.RELATIONSHIP__SOURCE:
        return getSource();
      case YumlPackage.RELATIONSHIP__TARGET:
        return getTarget();
      case YumlPackage.RELATIONSHIP__SOURCE_LABEL:
        return getSourceLabel();
      case YumlPackage.RELATIONSHIP__TARGET_LABEL:
        return getTargetLabel();
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
      case YumlPackage.RELATIONSHIP__SOURCE:
        setSource((west.twouse.language.yuml.Class)newValue);
        return;
      case YumlPackage.RELATIONSHIP__TARGET:
        setTarget((ColorableElement)newValue);
        return;
      case YumlPackage.RELATIONSHIP__SOURCE_LABEL:
        setSourceLabel((String)newValue);
        return;
      case YumlPackage.RELATIONSHIP__TARGET_LABEL:
        setTargetLabel((String)newValue);
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
      case YumlPackage.RELATIONSHIP__SOURCE:
        setSource((west.twouse.language.yuml.Class)null);
        return;
      case YumlPackage.RELATIONSHIP__TARGET:
        setTarget((ColorableElement)null);
        return;
      case YumlPackage.RELATIONSHIP__SOURCE_LABEL:
        setSourceLabel(SOURCE_LABEL_EDEFAULT);
        return;
      case YumlPackage.RELATIONSHIP__TARGET_LABEL:
        setTargetLabel(TARGET_LABEL_EDEFAULT);
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
      case YumlPackage.RELATIONSHIP__SOURCE:
        return source != null;
      case YumlPackage.RELATIONSHIP__TARGET:
        return target != null;
      case YumlPackage.RELATIONSHIP__SOURCE_LABEL:
        return SOURCE_LABEL_EDEFAULT == null ? sourceLabel != null : !SOURCE_LABEL_EDEFAULT.equals(sourceLabel);
      case YumlPackage.RELATIONSHIP__TARGET_LABEL:
        return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
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
    result.append(" (sourceLabel: ");
    result.append(sourceLabel);
    result.append(", targetLabel: ");
    result.append(targetLabel);
    result.append(')');
    return result.toString();
  }

} //RelationshipImpl
