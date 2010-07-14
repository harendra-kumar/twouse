/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.impl;

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

import west.twouse.language.sparqlas.SparqlasPackage;
import west.twouse.language.sparqlas.TemplateBinding;
import west.twouse.language.sparqlas.TemplateParameterSubstitution;
import west.twouse.language.sparqlas.TemplateSignature;
import west.twouse.language.sparqlas.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateBindingImpl#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateBindingImpl#getBoundElement <em>Bound Element</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.TemplateBindingImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateBindingImpl extends EObjectImpl implements TemplateBinding
{
  /**
   * The cached value of the '{@link #getParameterSubstitution() <em>Parameter Substitution</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterSubstitution()
   * @generated
   * @ordered
   */
  protected EList<TemplateParameterSubstitution> parameterSubstitution;

  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected TemplateSignature signature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateBindingImpl()
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
    return SparqlasPackage.Literals.TEMPLATE_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateParameterSubstitution> getParameterSubstitution()
  {
    if (parameterSubstitution == null)
    {
      parameterSubstitution = new EObjectContainmentWithInverseEList<TemplateParameterSubstitution>(TemplateParameterSubstitution.class, this, SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
    }
    return parameterSubstitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateableElement getBoundElement()
  {
    if (eContainerFeatureID() != SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT) return null;
    return (TemplateableElement)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoundElement(TemplateableElement newBoundElement, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newBoundElement, SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoundElement(TemplateableElement newBoundElement)
  {
    if (newBoundElement != eInternalContainer() || (eContainerFeatureID() != SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT && newBoundElement != null))
    {
      if (EcoreUtil.isAncestor(this, newBoundElement))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newBoundElement != null)
        msgs = ((InternalEObject)newBoundElement).eInverseAdd(this, SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, TemplateableElement.class, msgs);
      msgs = basicSetBoundElement(newBoundElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT, newBoundElement, newBoundElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSignature getSignature()
  {
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignature(TemplateSignature newSignature, NotificationChain msgs)
  {
    TemplateSignature oldSignature = signature;
    signature = newSignature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_BINDING__SIGNATURE, oldSignature, newSignature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignature(TemplateSignature newSignature)
  {
    if (newSignature != signature)
    {
      NotificationChain msgs = null;
      if (signature != null)
        msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.TEMPLATE_BINDING__SIGNATURE, null, msgs);
      if (newSignature != null)
        msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.TEMPLATE_BINDING__SIGNATURE, null, msgs);
      msgs = basicSetSignature(newSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.TEMPLATE_BINDING__SIGNATURE, newSignature, newSignature));
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
      case SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterSubstitution()).basicAdd(otherEnd, msgs);
      case SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetBoundElement((TemplateableElement)otherEnd, msgs);
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
      case SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        return ((InternalEList<?>)getParameterSubstitution()).basicRemove(otherEnd, msgs);
      case SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        return basicSetBoundElement(null, msgs);
      case SparqlasPackage.TEMPLATE_BINDING__SIGNATURE:
        return basicSetSignature(null, msgs);
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
      case SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        return eInternalContainer().eInverseRemove(this, SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, TemplateableElement.class, msgs);
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
      case SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        return getParameterSubstitution();
      case SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        return getBoundElement();
      case SparqlasPackage.TEMPLATE_BINDING__SIGNATURE:
        return getSignature();
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
      case SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        getParameterSubstitution().clear();
        getParameterSubstitution().addAll((Collection<? extends TemplateParameterSubstitution>)newValue);
        return;
      case SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        setBoundElement((TemplateableElement)newValue);
        return;
      case SparqlasPackage.TEMPLATE_BINDING__SIGNATURE:
        setSignature((TemplateSignature)newValue);
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
      case SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        getParameterSubstitution().clear();
        return;
      case SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        setBoundElement((TemplateableElement)null);
        return;
      case SparqlasPackage.TEMPLATE_BINDING__SIGNATURE:
        setSignature((TemplateSignature)null);
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
      case SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION:
        return parameterSubstitution != null && !parameterSubstitution.isEmpty();
      case SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT:
        return getBoundElement() != null;
      case SparqlasPackage.TEMPLATE_BINDING__SIGNATURE:
        return signature != null;
    }
    return super.eIsSet(featureID);
  }

} //TemplateBindingImpl
