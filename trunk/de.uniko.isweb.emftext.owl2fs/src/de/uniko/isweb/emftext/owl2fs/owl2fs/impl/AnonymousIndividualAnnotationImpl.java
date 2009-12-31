/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Individual Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnonymousIndividualAnnotationImpl#getAnonymousIndividual <em>Anonymous Individual</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnonymousIndividualAnnotationImpl#getAnonymousIndiviudalAnnotations <em>Anonymous Indiviudal Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnonymousIndividualAnnotationImpl extends AxiomImpl implements AnonymousIndividualAnnotation
{
  /**
   * The cached value of the '{@link #getAnonymousIndividual() <em>Anonymous Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnonymousIndividual()
   * @generated
   * @ordered
   */
  protected AnonymousIndividual anonymousIndividual;

  /**
   * The cached value of the '{@link #getAnonymousIndiviudalAnnotations() <em>Anonymous Indiviudal Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnonymousIndiviudalAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> anonymousIndiviudalAnnotations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnonymousIndividualAnnotationImpl()
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
    return Owl2fsPackage.Literals.ANONYMOUS_INDIVIDUAL_ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousIndividual getAnonymousIndividual()
  {
    return anonymousIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnonymousIndividual(AnonymousIndividual newAnonymousIndividual, NotificationChain msgs)
  {
    AnonymousIndividual oldAnonymousIndividual = anonymousIndividual;
    anonymousIndividual = newAnonymousIndividual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL, oldAnonymousIndividual, newAnonymousIndividual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnonymousIndividual(AnonymousIndividual newAnonymousIndividual)
  {
    if (newAnonymousIndividual != anonymousIndividual)
    {
      NotificationChain msgs = null;
      if (anonymousIndividual != null)
        msgs = ((InternalEObject)anonymousIndividual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL, null, msgs);
      if (newAnonymousIndividual != null)
        msgs = ((InternalEObject)newAnonymousIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL, null, msgs);
      msgs = basicSetAnonymousIndividual(newAnonymousIndividual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL, newAnonymousIndividual, newAnonymousIndividual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnonymousIndiviudalAnnotations()
  {
    if (anonymousIndiviudalAnnotations == null)
    {
      anonymousIndiviudalAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS);
    }
    return anonymousIndiviudalAnnotations;
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
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL:
        return basicSetAnonymousIndividual(null, msgs);
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS:
        return ((InternalEList<?>)getAnonymousIndiviudalAnnotations()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL:
        return getAnonymousIndividual();
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS:
        return getAnonymousIndiviudalAnnotations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL:
        setAnonymousIndividual((AnonymousIndividual)newValue);
        return;
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS:
        getAnonymousIndiviudalAnnotations().clear();
        getAnonymousIndiviudalAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL:
        setAnonymousIndividual((AnonymousIndividual)null);
        return;
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS:
        getAnonymousIndiviudalAnnotations().clear();
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
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL:
        return anonymousIndividual != null;
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS:
        return anonymousIndiviudalAnnotations != null && !anonymousIndiviudalAnnotations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AnonymousIndividualAnnotationImpl
