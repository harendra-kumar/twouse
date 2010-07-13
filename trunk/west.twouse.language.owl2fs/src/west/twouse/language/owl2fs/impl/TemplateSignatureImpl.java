/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.owl2fs.Owl2fsPackage;
import west.twouse.language.owl2fs.TemplateParameter;
import west.twouse.language.owl2fs.TemplateSignature;
import west.twouse.language.owl2fs.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.TemplateSignatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.TemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateSignatureImpl extends EObjectImpl implements TemplateSignature
{
  /**
   * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedParameter()
   * @generated
   * @ordered
   */
  protected EList<TemplateParameter> ownedParameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateSignatureImpl()
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
    return Owl2fsPackage.Literals.TEMPLATE_SIGNATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateParameter> getOwnedParameter()
  {
    if (ownedParameter == null)
    {
      ownedParameter = new EObjectContainmentWithInverseEList<TemplateParameter>(TemplateParameter.class, this, Owl2fsPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER, Owl2fsPackage.TEMPLATE_PARAMETER__SIGNATURE);
    }
    return ownedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateableElement getTemplate()
  {
    if (eContainerFeatureID() != Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE) return null;
    return (TemplateableElement)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplate(TemplateableElement newTemplate, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newTemplate, Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplate(TemplateableElement newTemplate)
  {
    if (newTemplate != eInternalContainer() || (eContainerFeatureID() != Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null))
    {
      if (EcoreUtil.isAncestor(this, newTemplate))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newTemplate != null)
        msgs = ((InternalEObject)newTemplate).eInverseAdd(this, Owl2fsPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
      msgs = basicSetTemplate(newTemplate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE, newTemplate, newTemplate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Owl2fsPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
      case Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetTemplate((TemplateableElement)otherEnd, msgs);
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
      case Owl2fsPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
        return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE:
        return basicSetTemplate(null, msgs);
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
      case Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE:
        return eInternalContainer().eInverseRemove(this, Owl2fsPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
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
      case Owl2fsPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
        return getOwnedParameter();
      case Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE:
        return getTemplate();
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
      case Owl2fsPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
        getOwnedParameter().clear();
        getOwnedParameter().addAll((Collection<? extends TemplateParameter>)newValue);
        return;
      case Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE:
        setTemplate((TemplateableElement)newValue);
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
      case Owl2fsPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
        getOwnedParameter().clear();
        return;
      case Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE:
        setTemplate((TemplateableElement)null);
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
      case Owl2fsPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
        return ownedParameter != null && !ownedParameter.isEmpty();
      case Owl2fsPackage.TEMPLATE_SIGNATURE__TEMPLATE:
        return getTemplate() != null;
    }
    return super.eIsSet(featureID);
  }

} //TemplateSignatureImpl
