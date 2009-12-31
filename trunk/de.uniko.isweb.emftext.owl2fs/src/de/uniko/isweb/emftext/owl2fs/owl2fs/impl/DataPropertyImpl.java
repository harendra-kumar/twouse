/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPropertyImpl extends EntityImpl implements DataProperty
{
  /**
   * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateParameter()
   * @generated
   * @ordered
   */
  protected TemplateParameter templateParameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataPropertyImpl()
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
    return Owl2fsPackage.Literals.DATA_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter getOwningTemplateParameter()
  {
    if (eContainerFeatureID() != Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER) return null;
    return (TemplateParameter)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter)
  {
    if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null))
    {
      if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwningTemplateParameter != null)
        msgs = ((InternalEObject)newOwningTemplateParameter).eInverseAdd(this, Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
      msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter getTemplateParameter()
  {
    if (templateParameter != null && templateParameter.eIsProxy())
    {
      InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
      templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
      if (templateParameter != oldTemplateParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
      }
    }
    return templateParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter basicGetTemplateParameter()
  {
    return templateParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs)
  {
    TemplateParameter oldTemplateParameter = templateParameter;
    templateParameter = newTemplateParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplateParameter(TemplateParameter newTemplateParameter)
  {
    if (newTemplateParameter != templateParameter)
    {
      NotificationChain msgs = null;
      if (templateParameter != null)
        msgs = ((InternalEObject)templateParameter).eInverseRemove(this, Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
      if (newTemplateParameter != null)
        msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
      msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
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
      case Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
      case Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER:
        if (templateParameter != null)
          msgs = ((InternalEObject)templateParameter).eInverseRemove(this, Owl2fsPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
        return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
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
      case Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        return basicSetOwningTemplateParameter(null, msgs);
      case Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER:
        return basicSetTemplateParameter(null, msgs);
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
      case Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        return eInternalContainer().eInverseRemove(this, Owl2fsPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
      case Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        return getOwningTemplateParameter();
      case Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER:
        if (resolve) return getTemplateParameter();
        return basicGetTemplateParameter();
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
      case Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        setOwningTemplateParameter((TemplateParameter)newValue);
        return;
      case Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER:
        setTemplateParameter((TemplateParameter)newValue);
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
      case Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        setOwningTemplateParameter((TemplateParameter)null);
        return;
      case Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER:
        setTemplateParameter((TemplateParameter)null);
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
      case Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        return getOwningTemplateParameter() != null;
      case Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER:
        return templateParameter != null;
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
    if (baseClass == DataPropertyExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ParameterableElement.class)
    {
      switch (derivedFeatureID)
      {
        case Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER: return Owl2fsPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
        case Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER: return Owl2fsPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
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
    if (baseClass == DataPropertyExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ParameterableElement.class)
    {
      switch (baseFeatureID)
      {
        case Owl2fsPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER;
        case Owl2fsPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //DataPropertyImpl
