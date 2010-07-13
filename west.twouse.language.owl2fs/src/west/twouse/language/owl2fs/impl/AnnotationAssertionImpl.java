/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import west.twouse.language.owl2fs.AnnotationAssertion;
import west.twouse.language.owl2fs.AnnotationProperty;
import west.twouse.language.owl2fs.AnnotationSubject;
import west.twouse.language.owl2fs.AnnotationValue;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.AnnotationAssertionImpl#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.AnnotationAssertionImpl#getAnnotationSubject <em>Annotation Subject</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.AnnotationAssertionImpl#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationAssertionImpl extends AnnotationAxiomImpl implements AnnotationAssertion
{
  /**
   * The cached value of the '{@link #getAnnotationProperty() <em>Annotation Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationProperty()
   * @generated
   * @ordered
   */
  protected AnnotationProperty annotationProperty;

  /**
   * The cached value of the '{@link #getAnnotationSubject() <em>Annotation Subject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationSubject()
   * @generated
   * @ordered
   */
  protected AnnotationSubject annotationSubject;

  /**
   * The cached value of the '{@link #getAnnotationValue() <em>Annotation Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationValue()
   * @generated
   * @ordered
   */
  protected AnnotationValue annotationValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationAssertionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Owl2fsPackage.Literals.ANNOTATION_ASSERTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationProperty getAnnotationProperty()
  {
    return annotationProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationProperty(AnnotationProperty newAnnotationProperty, NotificationChain msgs)
  {
    AnnotationProperty oldAnnotationProperty = annotationProperty;
    annotationProperty = newAnnotationProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY, oldAnnotationProperty, newAnnotationProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationProperty(AnnotationProperty newAnnotationProperty)
  {
    if (newAnnotationProperty != annotationProperty)
    {
      NotificationChain msgs = null;
      if (annotationProperty != null)
        msgs = ((InternalEObject)annotationProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY, null, msgs);
      if (newAnnotationProperty != null)
        msgs = ((InternalEObject)newAnnotationProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY, null, msgs);
      msgs = basicSetAnnotationProperty(newAnnotationProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY, newAnnotationProperty, newAnnotationProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationSubject getAnnotationSubject()
  {
    return annotationSubject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationSubject(AnnotationSubject newAnnotationSubject, NotificationChain msgs)
  {
    AnnotationSubject oldAnnotationSubject = annotationSubject;
    annotationSubject = newAnnotationSubject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT, oldAnnotationSubject, newAnnotationSubject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationSubject(AnnotationSubject newAnnotationSubject)
  {
    if (newAnnotationSubject != annotationSubject)
    {
      NotificationChain msgs = null;
      if (annotationSubject != null)
        msgs = ((InternalEObject)annotationSubject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT, null, msgs);
      if (newAnnotationSubject != null)
        msgs = ((InternalEObject)newAnnotationSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT, null, msgs);
      msgs = basicSetAnnotationSubject(newAnnotationSubject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT, newAnnotationSubject, newAnnotationSubject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValue getAnnotationValue()
  {
    return annotationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationValue(AnnotationValue newAnnotationValue, NotificationChain msgs)
  {
    AnnotationValue oldAnnotationValue = annotationValue;
    annotationValue = newAnnotationValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE, oldAnnotationValue, newAnnotationValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationValue(AnnotationValue newAnnotationValue)
  {
    if (newAnnotationValue != annotationValue)
    {
      NotificationChain msgs = null;
      if (annotationValue != null)
        msgs = ((InternalEObject)annotationValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE, null, msgs);
      if (newAnnotationValue != null)
        msgs = ((InternalEObject)newAnnotationValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE, null, msgs);
      msgs = basicSetAnnotationValue(newAnnotationValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE, newAnnotationValue, newAnnotationValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
        return basicSetAnnotationProperty(null, msgs);
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT:
        return basicSetAnnotationSubject(null, msgs);
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE:
        return basicSetAnnotationValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
        return getAnnotationProperty();
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT:
        return getAnnotationSubject();
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE:
        return getAnnotationValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
        setAnnotationProperty((AnnotationProperty)newValue);
        return;
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT:
        setAnnotationSubject((AnnotationSubject)newValue);
        return;
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE:
        setAnnotationValue((AnnotationValue)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
        setAnnotationProperty((AnnotationProperty)null);
        return;
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT:
        setAnnotationSubject((AnnotationSubject)null);
        return;
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE:
        setAnnotationValue((AnnotationValue)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY:
        return annotationProperty != null;
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT:
        return annotationSubject != null;
      case Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE:
        return annotationValue != null;
    }
    return super.eIsSet(featureID);
  }

} //AnnotationAssertionImpl
