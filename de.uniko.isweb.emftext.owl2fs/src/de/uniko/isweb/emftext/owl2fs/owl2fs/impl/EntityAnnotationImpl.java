/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Entity;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation;
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
 * An implementation of the model object '<em><b>Entity Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityAnnotationImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityAnnotationImpl#getEntityAnnotations <em>Entity Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityAnnotationImpl extends AxiomImpl implements EntityAnnotation
{
  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Entity entity;

  /**
   * The cached value of the '{@link #getEntityAnnotations() <em>Entity Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> entityAnnotations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityAnnotationImpl()
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
    return Owl2fsPackage.Literals.ENTITY_ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs)
  {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ENTITY_ANNOTATION__ENTITY, oldEntity, newEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(Entity newEntity)
  {
    if (newEntity != entity)
    {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ENTITY_ANNOTATION__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ENTITY_ANNOTATION__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ENTITY_ANNOTATION__ENTITY, newEntity, newEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getEntityAnnotations()
  {
    if (entityAnnotations == null)
    {
      entityAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, Owl2fsPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS);
    }
    return entityAnnotations;
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
      case Owl2fsPackage.ENTITY_ANNOTATION__ENTITY:
        return basicSetEntity(null, msgs);
      case Owl2fsPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS:
        return ((InternalEList<?>)getEntityAnnotations()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.ENTITY_ANNOTATION__ENTITY:
        return getEntity();
      case Owl2fsPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS:
        return getEntityAnnotations();
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
      case Owl2fsPackage.ENTITY_ANNOTATION__ENTITY:
        setEntity((Entity)newValue);
        return;
      case Owl2fsPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS:
        getEntityAnnotations().clear();
        getEntityAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
      case Owl2fsPackage.ENTITY_ANNOTATION__ENTITY:
        setEntity((Entity)null);
        return;
      case Owl2fsPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS:
        getEntityAnnotations().clear();
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
      case Owl2fsPackage.ENTITY_ANNOTATION__ENTITY:
        return entity != null;
      case Owl2fsPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS:
        return entityAnnotations != null && !entityAnnotations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntityAnnotationImpl
