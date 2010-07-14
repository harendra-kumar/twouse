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
import west.twouse.language.sparqlas.TemplateParameter;
import west.twouse.language.sparqlas.TemplateParameterSubstitution;
import west.twouse.language.sparqlas.TemplateSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateParameterImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateParameterImpl#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateParameterImpl#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateParameterImpl extends EObjectImpl implements TemplateParameter
{
  /**
   * The cached value of the '{@link #getParameteredElement() <em>Parametered Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameteredElement()
   * @generated
   * @ordered
   */
  protected ParameterableElement parameteredElement;

  /**
   * The cached value of the '{@link #getParameterSubstitution() <em>Parameter Substitution</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterSubstitution()
   * @generated
   * @ordered
   */
  protected TemplateParameterSubstitution parameterSubstitution;

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
    return SparqlasPackage.Literals.TEMPLATE_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSignature getSignature()
  {
    if (eContainerFeatureID() != SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE) return null;
    return (TemplateSignature)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignature(TemplateSignature newSignature, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newSignature, SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignature(TemplateSignature newSignature)
  {
    if (newSignature != eInternalContainer() || (eContainerFeatureID() != SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE && newSignature != null))
    {
      if (EcoreUtil.isAncestor(this, newSignature))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newSignature != null)
        msgs = ((InternalEObject)newSignature).eInverseAdd(this, SparqlasPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
      msgs = basicSetSignature(newSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE, newSignature, newSignature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterableElement getParameteredElement()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, oldParameteredElement, newParameteredElement);
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
        msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
      if (newParameteredElement != null)
        msgs = ((InternalEObject)newParameteredElement).eInverseAdd(this, SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, ParameterableElement.class, msgs);
      msgs = basicSetParameteredElement(newParameteredElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, newParameteredElement, newParameteredElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameterSubstitution getParameterSubstitution()
  {
    if (parameterSubstitution != null && parameterSubstitution.eIsProxy())
    {
      InternalEObject oldParameterSubstitution = (InternalEObject)parameterSubstitution;
      parameterSubstitution = (TemplateParameterSubstitution)eResolveProxy(oldParameterSubstitution);
      if (parameterSubstitution != oldParameterSubstitution)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SparqlasPackage.TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION, oldParameterSubstitution, parameterSubstitution));
      }
    }
    return parameterSubstitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameterSubstitution basicGetParameterSubstitution()
  {
    return parameterSubstitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterSubstitution(TemplateParameterSubstitution newParameterSubstitution)
  {
    TemplateParameterSubstitution oldParameterSubstitution = parameterSubstitution;
    parameterSubstitution = newParameterSubstitution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION, oldParameterSubstitution, parameterSubstitution));
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
      case SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetSignature((TemplateSignature)otherEnd, msgs);
      case SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        if (parameteredElement != null)
          msgs = ((InternalEObject)parameteredElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, null, msgs);
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
      case SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE:
        return basicSetSignature(null, msgs);
      case SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
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
      case SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE:
        return eInternalContainer().eInverseRemove(this, SparqlasPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER, TemplateSignature.class, msgs);
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
      case SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE:
        return getSignature();
      case SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        return getParameteredElement();
      case SparqlasPackage.TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION:
        if (resolve) return getParameterSubstitution();
        return basicGetParameterSubstitution();
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
      case SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE:
        setSignature((TemplateSignature)newValue);
        return;
      case SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        setParameteredElement((ParameterableElement)newValue);
        return;
      case SparqlasPackage.TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION:
        setParameterSubstitution((TemplateParameterSubstitution)newValue);
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
      case SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE:
        setSignature((TemplateSignature)null);
        return;
      case SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        setParameteredElement((ParameterableElement)null);
        return;
      case SparqlasPackage.TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION:
        setParameterSubstitution((TemplateParameterSubstitution)null);
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
      case SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE:
        return getSignature() != null;
      case SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT:
        return parameteredElement != null;
      case SparqlasPackage.TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION:
        return parameterSubstitution != null;
    }
    return super.eIsSet(featureID);
  }

} //TemplateParameterImpl
