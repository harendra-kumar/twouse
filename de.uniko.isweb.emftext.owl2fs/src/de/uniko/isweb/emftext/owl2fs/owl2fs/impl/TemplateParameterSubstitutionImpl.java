/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterSubstitutionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterSubstitutionImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterSubstitutionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterSubstitutionImpl extends EObjectImpl implements TemplateParameterSubstitution
{
  /**
   * The cached value of the '{@link #getActual() <em>Actual</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual()
   * @generated
   * @ordered
   */
  protected ParameterableElement actual;

  /**
   * The cached value of the '{@link #getFormal() <em>Formal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormal()
   * @generated
   * @ordered
   */
  protected TemplateParameter formal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateParameterSubstitutionImpl()
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
    return Owl2fsPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterableElement getActual()
  {
    if (actual != null && actual.eIsProxy())
    {
      InternalEObject oldActual = (InternalEObject)actual;
      actual = (ParameterableElement)eResolveProxy(oldActual);
      if (actual != oldActual)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, oldActual, actual));
      }
    }
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterableElement basicGetActual()
  {
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActual(ParameterableElement newActual)
  {
    ParameterableElement oldActual = actual;
    actual = newActual;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, oldActual, actual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter getFormal()
  {
    if (formal != null && formal.eIsProxy())
    {
      InternalEObject oldFormal = (InternalEObject)formal;
      formal = (TemplateParameter)eResolveProxy(oldFormal);
      if (formal != oldFormal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
      }
    }
    return formal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter basicGetFormal()
  {
    return formal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormal(TemplateParameter newFormal)
  {
    TemplateParameter oldFormal = formal;
    formal = newFormal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateBinding getTemplateBinding()
  {
    if (eContainerFeatureID() != Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING) return null;
    return (TemplateBinding)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplateBinding(TemplateBinding newTemplateBinding, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newTemplateBinding, Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplateBinding(TemplateBinding newTemplateBinding)
  {
    if (newTemplateBinding != eInternalContainer() || (eContainerFeatureID() != Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING && newTemplateBinding != null))
    {
      if (EcoreUtil.isAncestor(this, newTemplateBinding))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newTemplateBinding != null)
        msgs = ((InternalEObject)newTemplateBinding).eInverseAdd(this, Owl2fsPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
      msgs = basicSetTemplateBinding(newTemplateBinding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, newTemplateBinding, newTemplateBinding));
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
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetTemplateBinding((TemplateBinding)otherEnd, msgs);
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
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        return basicSetTemplateBinding(null, msgs);
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
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        return eInternalContainer().eInverseRemove(this, Owl2fsPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
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
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
        if (resolve) return getActual();
        return basicGetActual();
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
        if (resolve) return getFormal();
        return basicGetFormal();
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        return getTemplateBinding();
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
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
        setActual((ParameterableElement)newValue);
        return;
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
        setFormal((TemplateParameter)newValue);
        return;
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        setTemplateBinding((TemplateBinding)newValue);
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
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
        setActual((ParameterableElement)null);
        return;
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
        setFormal((TemplateParameter)null);
        return;
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        setTemplateBinding((TemplateBinding)null);
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
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
        return actual != null;
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
        return formal != null;
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        return getTemplateBinding() != null;
    }
    return super.eIsSet(featureID);
  }

} //TemplateParameterSubstitutionImpl
