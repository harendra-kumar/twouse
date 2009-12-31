/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.Entity;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.URI;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityImpl#getEntityURI <em>Entity URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EntityImpl extends EObjectImpl implements Entity
{
  /**
   * The cached value of the '{@link #getEntityURI() <em>Entity URI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityURI()
   * @generated
   * @ordered
   */
  protected URI entityURI;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return Owl2fsPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URI getEntityURI()
  {
    return entityURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityURI(URI newEntityURI, NotificationChain msgs)
  {
    URI oldEntityURI = entityURI;
    entityURI = newEntityURI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ENTITY__ENTITY_URI, oldEntityURI, newEntityURI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityURI(URI newEntityURI)
  {
    if (newEntityURI != entityURI)
    {
      NotificationChain msgs = null;
      if (entityURI != null)
        msgs = ((InternalEObject)entityURI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ENTITY__ENTITY_URI, null, msgs);
      if (newEntityURI != null)
        msgs = ((InternalEObject)newEntityURI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ENTITY__ENTITY_URI, null, msgs);
      msgs = basicSetEntityURI(newEntityURI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ENTITY__ENTITY_URI, newEntityURI, newEntityURI));
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
      case Owl2fsPackage.ENTITY__ENTITY_URI:
        return basicSetEntityURI(null, msgs);
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
      case Owl2fsPackage.ENTITY__ENTITY_URI:
        return getEntityURI();
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
      case Owl2fsPackage.ENTITY__ENTITY_URI:
        setEntityURI((URI)newValue);
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
      case Owl2fsPackage.ENTITY__ENTITY_URI:
        setEntityURI((URI)null);
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
      case Owl2fsPackage.ENTITY__ENTITY_URI:
        return entityURI != null;
    }
    return super.eIsSet(featureID);
  }

} //EntityImpl
