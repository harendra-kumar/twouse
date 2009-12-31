/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByAnonymousIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation By Anonymous Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByAnonymousIndividualImpl#getAnnotationValue <em>Annotation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationByAnonymousIndividualImpl extends AnnotationImpl implements AnnotationByAnonymousIndividual
{
  /**
   * The cached value of the '{@link #getAnnotationValue() <em>Annotation Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationValue()
   * @generated
   * @ordered
   */
  protected AnonymousIndividual annotationValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationByAnonymousIndividualImpl()
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
    return Owl2fsPackage.Literals.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousIndividual getAnnotationValue()
  {
    return annotationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationValue(AnonymousIndividual newAnnotationValue, NotificationChain msgs)
  {
    AnonymousIndividual oldAnnotationValue = annotationValue;
    annotationValue = newAnnotationValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE, oldAnnotationValue, newAnnotationValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationValue(AnonymousIndividual newAnnotationValue)
  {
    if (newAnnotationValue != annotationValue)
    {
      NotificationChain msgs = null;
      if (annotationValue != null)
        msgs = ((InternalEObject)annotationValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE, null, msgs);
      if (newAnnotationValue != null)
        msgs = ((InternalEObject)newAnnotationValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE, null, msgs);
      msgs = basicSetAnnotationValue(newAnnotationValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE, newAnnotationValue, newAnnotationValue));
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
      case Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE:
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
      case Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE:
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
      case Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE:
        setAnnotationValue((AnonymousIndividual)newValue);
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
      case Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE:
        setAnnotationValue((AnonymousIndividual)null);
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
      case Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE:
        return annotationValue != null;
    }
    return super.eIsSet(featureID);
  }

} //AnnotationByAnonymousIndividualImpl
