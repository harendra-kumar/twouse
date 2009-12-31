/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterImpl#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterImpl extends EObjectImpl implements TemplateParameter
{
  /**
   * The cached value of the '{@link #getOwnedParameteredElement() <em>Owned Parametered Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedParameteredElement()
   * @generated
   * @ordered
   */
  protected ParameterableElement ownedParameteredElement;

  /**
   * The cached value of the '{@link #getParameteredElement() <em>Parametered Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameteredElement()
   * @generated
   * @ordered
   */
  protected ParameterableElement parameteredElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateParameterImpl()
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
    return Owl2fsPackage.Literals.TEMPLATE_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterableElement getOwnedParameteredElement()
  {
    return ownedParameteredElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedParameteredElement(ParameterableElement newOwnedParameteredElement, NotificationChain msgs)
  {
    ParameterableElement oldOwnedParameteredElement = ownedParameteredElement;
    ownedParameteredElement = newOwnedParameteredElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, oldOwnedParameteredElement, newOwnedParameteredElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedParameteredElement(ParameterableElement newOwnedParameteredElement)
  {
    if (newOwnedParameteredElement != ownedParameteredElement)
    {
      NotificationChain msgs = null;
      if (ownedParameteredElement != null)
        msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, Owl2fsPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
      if (newOwnedParameteredElement != null)
        msgs = ((InternalEObject)newOwnedParameteredElement).eInverseAdd(this, Owl2fsPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
      msgs = basicSetOwnedParameteredElement(newOwnedParameteredElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, newOwnedParameteredElement, newOwnedParameteredElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSignature getSignature()
  {
    if (eContainerFeatureID() != Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE) return null;
    return (TemplateSignature)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignature(TemplateSignature newSignature, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newSignature, Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignature(TemplateSignature newSignature)
  {
    if (newSignature != eInternalContainer() || (eContainerFeatureID() != Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE && newSignature != null))
    {
      if (EcoreUtil.isAncestor(this, newSignature))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newSignature != null)
        msgs = ((InternalEObject)newSignature).eInverseAdd(this, Owl2fsPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
      msgs = basicSetSignature(newSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE, newSignature, newSignature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterableElement getParameteredElement()
  {
    if (parameteredElement != null && parameteredElement.eIsProxy())
    {
      InternalEObject oldParameteredElement = (InternalEObject)parameteredElement;
      parameteredElement = (ParameterableElement)eResolveProxy(oldParameteredElement);
      if (parameteredElement != oldParameteredElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, oldParameteredElement, parameteredElement));
      }
    }
    return parameteredElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterableElement basicGetParameteredElement()
  {
    return parameteredElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameteredElement(ParameterableElement newParameteredElement, NotificationChain msgs)
  {
    ParameterableElement oldParameteredElement = parameteredElement;
    parameteredElement = newParameteredElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, oldParameteredElement, newParameteredElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameteredElement(ParameterableElement newParameteredElement)
  {
    if (newParameteredElement != parameteredElement)
    {
      NotificationChain msgs = null;
      if (parameteredElement != null)
        msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, Owl2fsPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
      if (newParameteredElement != null)
        msgs = ((InternalEObject)newParameteredElement).eInverseAdd(this, Owl2fsPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
      msgs = basicSetParameteredElement(newParameteredElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, newParameteredElement, newParameteredElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
        if (ownedParameteredElement != null)
          msgs = ((InternalEObject)ownedParameteredElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, null, msgs);
        return basicSetOwnedParameteredElement((ParameterableElement)otherEnd, msgs);
      case Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetSignature((TemplateSignature)otherEnd, msgs);
      case Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        if (parameteredElement != null)
          msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, Owl2fsPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
        return basicSetParameteredElement((ParameterableElement)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
        return basicSetOwnedParameteredElement(null, msgs);
      case Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE:
        return basicSetSignature(null, msgs);
      case Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        return basicSetParameteredElement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE:
        return eInternalContainer().eInverseRemove(this, Owl2fsPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
        return getOwnedParameteredElement();
      case Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE:
        return getSignature();
      case Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        if (resolve) return getParameteredElement();
        return basicGetParameteredElement();
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
      case Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
        setOwnedParameteredElement((ParameterableElement)newValue);
        return;
      case Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE:
        setSignature((TemplateSignature)newValue);
        return;
      case Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        setParameteredElement((ParameterableElement)newValue);
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
      case Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
        setOwnedParameteredElement((ParameterableElement)null);
        return;
      case Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE:
        setSignature((TemplateSignature)null);
        return;
      case Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        setParameteredElement((ParameterableElement)null);
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
      case Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
        return ownedParameteredElement != null;
      case Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE:
        return getSignature() != null;
      case Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        return parameteredElement != null;
    }
    return super.eIsSet(featureID);
  }

} //TemplateParameterImpl
