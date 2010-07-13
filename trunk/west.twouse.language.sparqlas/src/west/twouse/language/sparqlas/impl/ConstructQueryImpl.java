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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.sparqlas.Atom;
import west.twouse.language.sparqlas.ConstructQuery;
import west.twouse.language.sparqlas.SparqlmsPackage;
import west.twouse.language.sparqlas.IRI;
import west.twouse.language.sparqlas.SparqlasPackage;
import west.twouse.language.sparqlas.TemplateBinding;
import west.twouse.language.sparqlas.TemplateSignature;
import west.twouse.language.sparqlas.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Construct Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.ConstructQueryImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.ConstructQueryImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.ConstructQueryImpl#getConstructAtoms <em>Construct Atoms</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.ConstructQueryImpl#getWhereAtoms <em>Where Atoms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructQueryImpl extends QueryImpl implements ConstructQuery
{
  /**
   * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedTemplateSignature()
   * @generated
   * @ordered
   */
  protected TemplateSignature ownedTemplateSignature;

  /**
   * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateBinding()
   * @generated
   * @ordered
   */
  protected EList<TemplateBinding> templateBinding;

  /**
   * The cached value of the '{@link #getConstructAtoms() <em>Construct Atoms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructAtoms()
   * @generated
   * @ordered
   */
  protected EList<Atom> constructAtoms;

  /**
   * The cached value of the '{@link #getWhereAtoms() <em>Where Atoms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereAtoms()
   * @generated
   * @ordered
   */
  protected EList<Atom> whereAtoms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructQueryImpl()
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
    return SparqlasPackage.Literals.CONSTRUCT_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSignature getOwnedTemplateSignature()
  {
    return ownedTemplateSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs)
  {
    TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
    ownedTemplateSignature = newOwnedTemplateSignature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature)
  {
    if (newOwnedTemplateSignature != ownedTemplateSignature)
    {
      NotificationChain msgs = null;
      if (ownedTemplateSignature != null)
        msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, SparqlasPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
      if (newOwnedTemplateSignature != null)
        msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, SparqlasPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
      msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateBinding> getTemplateBinding()
  {
    if (templateBinding == null)
    {
      templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING, SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
    }
    return templateBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Atom> getConstructAtoms()
  {
    if (constructAtoms == null)
    {
      constructAtoms = new EObjectContainmentEList<Atom>(Atom.class, this, SparqlasPackage.CONSTRUCT_QUERY__CONSTRUCT_ATOMS);
    }
    return constructAtoms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Atom> getWhereAtoms()
  {
    if (whereAtoms == null)
    {
      whereAtoms = new EObjectContainmentEList<Atom>(Atom.class, this, SparqlasPackage.CONSTRUCT_QUERY__WHERE_ATOMS);
    }
    return whereAtoms;
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
      case SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE:
        if (ownedTemplateSignature != null)
          msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE, null, msgs);
        return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
      case SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
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
      case SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE:
        return basicSetOwnedTemplateSignature(null, msgs);
      case SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING:
        return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
      case SparqlasPackage.CONSTRUCT_QUERY__CONSTRUCT_ATOMS:
        return ((InternalEList<?>)getConstructAtoms()).basicRemove(otherEnd, msgs);
      case SparqlasPackage.CONSTRUCT_QUERY__WHERE_ATOMS:
        return ((InternalEList<?>)getWhereAtoms()).basicRemove(otherEnd, msgs);
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
      case SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE:
        return getOwnedTemplateSignature();
      case SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING:
        return getTemplateBinding();
      case SparqlasPackage.CONSTRUCT_QUERY__CONSTRUCT_ATOMS:
        return getConstructAtoms();
      case SparqlasPackage.CONSTRUCT_QUERY__WHERE_ATOMS:
        return getWhereAtoms();
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
      case SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE:
        setOwnedTemplateSignature((TemplateSignature)newValue);
        return;
      case SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING:
        getTemplateBinding().clear();
        getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
        return;
      case SparqlasPackage.CONSTRUCT_QUERY__CONSTRUCT_ATOMS:
        getConstructAtoms().clear();
        getConstructAtoms().addAll((Collection<? extends Atom>)newValue);
        return;
      case SparqlasPackage.CONSTRUCT_QUERY__WHERE_ATOMS:
        getWhereAtoms().clear();
        getWhereAtoms().addAll((Collection<? extends Atom>)newValue);
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
      case SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE:
        setOwnedTemplateSignature((TemplateSignature)null);
        return;
      case SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING:
        getTemplateBinding().clear();
        return;
      case SparqlasPackage.CONSTRUCT_QUERY__CONSTRUCT_ATOMS:
        getConstructAtoms().clear();
        return;
      case SparqlasPackage.CONSTRUCT_QUERY__WHERE_ATOMS:
        getWhereAtoms().clear();
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
      case SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE:
        return ownedTemplateSignature != null;
      case SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING:
        return templateBinding != null && !templateBinding.isEmpty();
      case SparqlasPackage.CONSTRUCT_QUERY__CONSTRUCT_ATOMS:
        return constructAtoms != null && !constructAtoms.isEmpty();
      case SparqlasPackage.CONSTRUCT_QUERY__WHERE_ATOMS:
        return whereAtoms != null && !whereAtoms.isEmpty();
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
    if (baseClass == TemplateableElement.class)
    {
      switch (derivedFeatureID)
      {
        case SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE: return SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
        case SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING: return SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
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
    if (baseClass == TemplateableElement.class)
    {
      switch (baseFeatureID)
      {
        case SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE;
        case SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ConstructQueryImpl
