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

import west.twouse.language.owl2fs.Datatype;
import west.twouse.language.owl2fs.Entity;
import west.twouse.language.owl2fs.IRI;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.DatatypeImpl#getEntityIRI <em>Entity IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeImpl extends DataRangeImpl implements Datatype
{
  /**
   * The cached value of the '{@link #getEntityIRI() <em>Entity IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityIRI()
   * @generated
   * @ordered
   */
  protected IRI entityIRI;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatatypeImpl()
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
    return Owl2fsPackage.Literals.DATATYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getEntityIRI()
  {
    return entityIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityIRI(IRI newEntityIRI, NotificationChain msgs)
  {
    IRI oldEntityIRI = entityIRI;
    entityIRI = newEntityIRI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATATYPE__ENTITY_IRI, oldEntityIRI, newEntityIRI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityIRI(IRI newEntityIRI)
  {
    if (newEntityIRI != entityIRI)
    {
      NotificationChain msgs = null;
      if (entityIRI != null)
        msgs = ((InternalEObject)entityIRI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATATYPE__ENTITY_IRI, null, msgs);
      if (newEntityIRI != null)
        msgs = ((InternalEObject)newEntityIRI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATATYPE__ENTITY_IRI, null, msgs);
      msgs = basicSetEntityIRI(newEntityIRI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATATYPE__ENTITY_IRI, newEntityIRI, newEntityIRI));
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
      case Owl2fsPackage.DATATYPE__ENTITY_IRI:
        return basicSetEntityIRI(null, msgs);
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
      case Owl2fsPackage.DATATYPE__ENTITY_IRI:
        return getEntityIRI();
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
      case Owl2fsPackage.DATATYPE__ENTITY_IRI:
        setEntityIRI((IRI)newValue);
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
      case Owl2fsPackage.DATATYPE__ENTITY_IRI:
        setEntityIRI((IRI)null);
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
      case Owl2fsPackage.DATATYPE__ENTITY_IRI:
        return entityIRI != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Entity.class)
    {
      switch (derivedFeatureID)
      {
        case Owl2fsPackage.DATATYPE__ENTITY_IRI: return Owl2fsPackage.ENTITY__ENTITY_IRI;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Entity.class)
    {
      switch (baseFeatureID)
      {
        case Owl2fsPackage.ENTITY__ENTITY_IRI: return Owl2fsPackage.DATATYPE__ENTITY_IRI;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //DatatypeImpl
