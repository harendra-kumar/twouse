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

import west.twouse.language.owl2fs.ClassExpression;
import west.twouse.language.owl2fs.Owl2fsPackage;
import west.twouse.language.owl2fs.ParameterableElement;
import west.twouse.language.owl2fs.TemplateParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.ClassImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends EntityImpl implements west.twouse.language.owl2fs.Class
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
  protected ClassImpl()
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
    return Owl2fsPackage.Literals.CLASS;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Owl2fsPackage.CLASS__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.CLASS__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
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
      case Owl2fsPackage.CLASS__TEMPLATE_PARAMETER:
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
      case Owl2fsPackage.CLASS__TEMPLATE_PARAMETER:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Owl2fsPackage.CLASS__TEMPLATE_PARAMETER:
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
      case Owl2fsPackage.CLASS__TEMPLATE_PARAMETER:
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
      case Owl2fsPackage.CLASS__TEMPLATE_PARAMETER:
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
      case Owl2fsPackage.CLASS__TEMPLATE_PARAMETER:
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
    if (baseClass == ParameterableElement.class)
    {
      switch (derivedFeatureID)
      {
        case Owl2fsPackage.CLASS__TEMPLATE_PARAMETER: return Owl2fsPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
        default: return -1;
      }
    }
    if (baseClass == ClassExpression.class)
    {
      switch (derivedFeatureID)
      {
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
    if (baseClass == ParameterableElement.class)
    {
      switch (baseFeatureID)
      {
        case Owl2fsPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return Owl2fsPackage.CLASS__TEMPLATE_PARAMETER;
        default: return -1;
      }
    }
    if (baseClass == ClassExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ClassImpl
