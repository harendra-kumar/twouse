/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import west.twouse.language.sparqlas.ParameterableElement;
import west.twouse.language.sparqlas.SparqlasPackage;
import west.twouse.language.sparqlas.TemplateBinding;
import west.twouse.language.sparqlas.TemplateParameterSubstitution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateParameterSubstitutionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateParameterSubstitutionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateParameterSubstitutionImpl#getFormal <em>Formal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterSubstitutionImpl extends EObjectImpl implements TemplateParameterSubstitution
{
  /**
   * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual()
   * @generated
   * @ordered
   */
  protected ParameterableElement actual;

  /**
   * The cached value of the '{@link #getFormal() <em>Formal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormal()
   * @generated
   * @ordered
   */
  protected ParameterableElement formal;

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
    return SparqlasPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterableElement getActual()
  {
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActual(ParameterableElement newActual, NotificationChain msgs)
  {
    ParameterableElement oldActual = actual;
    actual = newActual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, oldActual, newActual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActual(ParameterableElement newActual)
  {
    if (newActual != actual)
    {
      NotificationChain msgs = null;
      if (actual != null)
        msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, null, msgs);
      if (newActual != null)
        msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, null, msgs);
      msgs = basicSetActual(newActual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, newActual, newActual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateBinding getTemplateBinding()
  {
    if (eContainerFeatureID() != SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING) return null;
    return (TemplateBinding)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplateBinding(TemplateBinding newTemplateBinding, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newTemplateBinding, SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplateBinding(TemplateBinding newTemplateBinding)
  {
    if (newTemplateBinding != eInternalContainer() || (eContainerFeatureID() != SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING && newTemplateBinding != null))
    {
      if (EcoreUtil.isAncestor(this, newTemplateBinding))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newTemplateBinding != null)
        msgs = ((InternalEObject)newTemplateBinding).eInverseAdd(this, SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
      msgs = basicSetTemplateBinding(newTemplateBinding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, newTemplateBinding, newTemplateBinding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterableElement getFormal()
  {
    return formal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormal(ParameterableElement newFormal, NotificationChain msgs)
  {
    ParameterableElement oldFormal = formal;
    formal = newFormal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, newFormal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormal(ParameterableElement newFormal)
  {
    if (newFormal != formal)
    {
      NotificationChain msgs = null;
      if (formal != null)
        msgs = ((InternalEObject)formal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, null, msgs);
      if (newFormal != null)
        msgs = ((InternalEObject)newFormal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, null, msgs);
      msgs = basicSetFormal(newFormal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, newFormal, newFormal));
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
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
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
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
        return basicSetActual(null, msgs);
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        return basicSetTemplateBinding(null, msgs);
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
        return basicSetFormal(null, msgs);
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
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        return eInternalContainer().eInverseRemove(this, SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
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
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
        return getActual();
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        return getTemplateBinding();
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
        return getFormal();
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
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
        setActual((ParameterableElement)newValue);
        return;
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        setTemplateBinding((TemplateBinding)newValue);
        return;
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
        setFormal((ParameterableElement)newValue);
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
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
        setActual((ParameterableElement)null);
        return;
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        setTemplateBinding((TemplateBinding)null);
        return;
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
        setFormal((ParameterableElement)null);
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
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
        return actual != null;
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
        return getTemplateBinding() != null;
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
        return formal != null;
    }
    return super.eIsSet(featureID);
  }

} //TemplateParameterSubstitutionImpl
