/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression;
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
 * An implementation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl#isIsFunctional <em>Is Functional</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl#isIsReflexive <em>Is Reflexive</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl#isIsInverseFunctional <em>Is Inverse Functional</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl#isIsIrreflexive <em>Is Irreflexive</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl#isIsSymmetric <em>Is Symmetric</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl#isIsTransitive <em>Is Transitive</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl#isIsAsysmmetric <em>Is Asysmmetric</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyImpl extends EntityImpl implements ObjectProperty
{
  /**
   * The default value of the '{@link #isIsFunctional() <em>Is Functional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFunctional()
   * @generated
   * @ordered
   */
  protected static final boolean IS_FUNCTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsFunctional() <em>Is Functional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFunctional()
   * @generated
   * @ordered
   */
  protected boolean isFunctional = IS_FUNCTIONAL_EDEFAULT;

  /**
   * The default value of the '{@link #isIsReflexive() <em>Is Reflexive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsReflexive()
   * @generated
   * @ordered
   */
  protected static final boolean IS_REFLEXIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsReflexive() <em>Is Reflexive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsReflexive()
   * @generated
   * @ordered
   */
  protected boolean isReflexive = IS_REFLEXIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsInverseFunctional() <em>Is Inverse Functional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInverseFunctional()
   * @generated
   * @ordered
   */
  protected static final boolean IS_INVERSE_FUNCTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsInverseFunctional() <em>Is Inverse Functional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInverseFunctional()
   * @generated
   * @ordered
   */
  protected boolean isInverseFunctional = IS_INVERSE_FUNCTIONAL_EDEFAULT;

  /**
   * The default value of the '{@link #isIsIrreflexive() <em>Is Irreflexive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsIrreflexive()
   * @generated
   * @ordered
   */
  protected static final boolean IS_IRREFLEXIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsIrreflexive() <em>Is Irreflexive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsIrreflexive()
   * @generated
   * @ordered
   */
  protected boolean isIrreflexive = IS_IRREFLEXIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsSymmetric() <em>Is Symmetric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSymmetric()
   * @generated
   * @ordered
   */
  protected static final boolean IS_SYMMETRIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsSymmetric() <em>Is Symmetric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSymmetric()
   * @generated
   * @ordered
   */
  protected boolean isSymmetric = IS_SYMMETRIC_EDEFAULT;

  /**
   * The default value of the '{@link #isIsTransitive() <em>Is Transitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTransitive()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TRANSITIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsTransitive() <em>Is Transitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTransitive()
   * @generated
   * @ordered
   */
  protected boolean isTransitive = IS_TRANSITIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsAsysmmetric() <em>Is Asysmmetric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAsysmmetric()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ASYSMMETRIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAsysmmetric() <em>Is Asysmmetric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAsysmmetric()
   * @generated
   * @ordered
   */
  protected boolean isAsysmmetric = IS_ASYSMMETRIC_EDEFAULT;

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
  protected ObjectPropertyImpl()
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
    return Owl2fsPackage.Literals.OBJECT_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsFunctional()
  {
    return isFunctional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsFunctional(boolean newIsFunctional)
  {
    boolean oldIsFunctional = isFunctional;
    isFunctional = newIsFunctional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY__IS_FUNCTIONAL, oldIsFunctional, isFunctional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsReflexive()
  {
    return isReflexive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsReflexive(boolean newIsReflexive)
  {
    boolean oldIsReflexive = isReflexive;
    isReflexive = newIsReflexive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY__IS_REFLEXIVE, oldIsReflexive, isReflexive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsInverseFunctional()
  {
    return isInverseFunctional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsInverseFunctional(boolean newIsInverseFunctional)
  {
    boolean oldIsInverseFunctional = isInverseFunctional;
    isInverseFunctional = newIsInverseFunctional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL, oldIsInverseFunctional, isInverseFunctional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsIrreflexive()
  {
    return isIrreflexive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsIrreflexive(boolean newIsIrreflexive)
  {
    boolean oldIsIrreflexive = isIrreflexive;
    isIrreflexive = newIsIrreflexive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE, oldIsIrreflexive, isIrreflexive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsSymmetric()
  {
    return isSymmetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsSymmetric(boolean newIsSymmetric)
  {
    boolean oldIsSymmetric = isSymmetric;
    isSymmetric = newIsSymmetric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY__IS_SYMMETRIC, oldIsSymmetric, isSymmetric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsTransitive()
  {
    return isTransitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsTransitive(boolean newIsTransitive)
  {
    boolean oldIsTransitive = isTransitive;
    isTransitive = newIsTransitive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY__IS_TRANSITIVE, oldIsTransitive, isTransitive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAsysmmetric()
  {
    return isAsysmmetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAsysmmetric(boolean newIsAsysmmetric)
  {
    boolean oldIsAsysmmetric = isAsysmmetric;
    isAsysmmetric = newIsAsysmmetric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY__IS_ASYSMMETRIC, oldIsAsysmmetric, isAsysmmetric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter getOwningTemplateParameter()
  {
    if (eContainerFeatureID() != Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER) return null;
    return (TemplateParameter)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter)
  {
    if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null))
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
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
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
      case Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
      case Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER:
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
      case Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        return basicSetOwningTemplateParameter(null, msgs);
      case Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER:
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
      case Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER:
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
      case Owl2fsPackage.OBJECT_PROPERTY__IS_FUNCTIONAL:
        return isIsFunctional();
      case Owl2fsPackage.OBJECT_PROPERTY__IS_REFLEXIVE:
        return isIsReflexive();
      case Owl2fsPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL:
        return isIsInverseFunctional();
      case Owl2fsPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE:
        return isIsIrreflexive();
      case Owl2fsPackage.OBJECT_PROPERTY__IS_SYMMETRIC:
        return isIsSymmetric();
      case Owl2fsPackage.OBJECT_PROPERTY__IS_TRANSITIVE:
        return isIsTransitive();
      case Owl2fsPackage.OBJECT_PROPERTY__IS_ASYSMMETRIC:
        return isIsAsysmmetric();
      case Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        return getOwningTemplateParameter();
      case Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER:
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
      case Owl2fsPackage.OBJECT_PROPERTY__IS_FUNCTIONAL:
        setIsFunctional((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_REFLEXIVE:
        setIsReflexive((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL:
        setIsInverseFunctional((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE:
        setIsIrreflexive((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_SYMMETRIC:
        setIsSymmetric((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_TRANSITIVE:
        setIsTransitive((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_ASYSMMETRIC:
        setIsAsysmmetric((Boolean)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        setOwningTemplateParameter((TemplateParameter)newValue);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER:
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
      case Owl2fsPackage.OBJECT_PROPERTY__IS_FUNCTIONAL:
        setIsFunctional(IS_FUNCTIONAL_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_REFLEXIVE:
        setIsReflexive(IS_REFLEXIVE_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL:
        setIsInverseFunctional(IS_INVERSE_FUNCTIONAL_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE:
        setIsIrreflexive(IS_IRREFLEXIVE_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_SYMMETRIC:
        setIsSymmetric(IS_SYMMETRIC_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_TRANSITIVE:
        setIsTransitive(IS_TRANSITIVE_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_ASYSMMETRIC:
        setIsAsysmmetric(IS_ASYSMMETRIC_EDEFAULT);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        setOwningTemplateParameter((TemplateParameter)null);
        return;
      case Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER:
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
      case Owl2fsPackage.OBJECT_PROPERTY__IS_FUNCTIONAL:
        return isFunctional != IS_FUNCTIONAL_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_REFLEXIVE:
        return isReflexive != IS_REFLEXIVE_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL:
        return isInverseFunctional != IS_INVERSE_FUNCTIONAL_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE:
        return isIrreflexive != IS_IRREFLEXIVE_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_SYMMETRIC:
        return isSymmetric != IS_SYMMETRIC_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_TRANSITIVE:
        return isTransitive != IS_TRANSITIVE_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY__IS_ASYSMMETRIC:
        return isAsysmmetric != IS_ASYSMMETRIC_EDEFAULT;
      case Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER:
        return getOwningTemplateParameter() != null;
      case Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER:
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
    if (baseClass == ObjectPropertyExpression.class)
    {
      switch (derivedFeatureID)
      {
        case Owl2fsPackage.OBJECT_PROPERTY__IS_FUNCTIONAL: return Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL;
        case Owl2fsPackage.OBJECT_PROPERTY__IS_REFLEXIVE: return Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE;
        case Owl2fsPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL: return Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL;
        case Owl2fsPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE: return Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE;
        case Owl2fsPackage.OBJECT_PROPERTY__IS_SYMMETRIC: return Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC;
        case Owl2fsPackage.OBJECT_PROPERTY__IS_TRANSITIVE: return Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE;
        case Owl2fsPackage.OBJECT_PROPERTY__IS_ASYSMMETRIC: return Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC;
        default: return -1;
      }
    }
    if (baseClass == ParameterableElement.class)
    {
      switch (derivedFeatureID)
      {
        case Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER: return Owl2fsPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
        case Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER: return Owl2fsPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
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
    if (baseClass == ObjectPropertyExpression.class)
    {
      switch (baseFeatureID)
      {
        case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL: return Owl2fsPackage.OBJECT_PROPERTY__IS_FUNCTIONAL;
        case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE: return Owl2fsPackage.OBJECT_PROPERTY__IS_REFLEXIVE;
        case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL: return Owl2fsPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL;
        case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE: return Owl2fsPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE;
        case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC: return Owl2fsPackage.OBJECT_PROPERTY__IS_SYMMETRIC;
        case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE: return Owl2fsPackage.OBJECT_PROPERTY__IS_TRANSITIVE;
        case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC: return Owl2fsPackage.OBJECT_PROPERTY__IS_ASYSMMETRIC;
        default: return -1;
      }
    }
    if (baseClass == ParameterableElement.class)
    {
      switch (baseFeatureID)
      {
        case Owl2fsPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER;
        case Owl2fsPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isFunctional: ");
    result.append(isFunctional);
    result.append(", isReflexive: ");
    result.append(isReflexive);
    result.append(", isInverseFunctional: ");
    result.append(isInverseFunctional);
    result.append(", isIrreflexive: ");
    result.append(isIrreflexive);
    result.append(", isSymmetric: ");
    result.append(isSymmetric);
    result.append(", isTransitive: ");
    result.append(isTransitive);
    result.append(", isAsysmmetric: ");
    result.append(isAsysmmetric);
    result.append(')');
    return result.toString();
  }

} //ObjectPropertyImpl
