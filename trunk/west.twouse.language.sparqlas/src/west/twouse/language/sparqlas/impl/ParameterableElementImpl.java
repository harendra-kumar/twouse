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
import west.twouse.language.sparqlas.SparqlmsPackage;
import west.twouse.language.sparqlas.SparqlasPackage;
import west.twouse.language.sparqlas.TemplateParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.ParameterableElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ParameterableElementImpl extends EObjectImpl implements ParameterableElement
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterableElementImpl()
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
    return SparqlasPackage.Literals.PARAMETERABLE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter getTemplateParameter()
  {
    if (eContainerFeatureID() != SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER) return null;
    return (TemplateParameter)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newTemplateParameter, SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplateParameter(TemplateParameter newTemplateParameter)
  {
    if (newTemplateParameter != eInternalContainer() || (eContainerFeatureID() != SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER && newTemplateParameter != null))
    {
      if (EcoreUtil.isAncestor(this, newTemplateParameter))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newTemplateParameter != null)
        msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
      msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
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
      case SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
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
      case SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
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
      case SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
        return eInternalContainer().eInverseRemove(this, SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
      case SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
        return getTemplateParameter();
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
      case SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
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
      case SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
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
      case SparqlasPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
        return getTemplateParameter() != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterableElementImpl
