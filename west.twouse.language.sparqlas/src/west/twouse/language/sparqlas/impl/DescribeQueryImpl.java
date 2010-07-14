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
import west.twouse.language.sparqlas.DescribeQuery;
import west.twouse.language.sparqlas.IRI;
import west.twouse.language.sparqlas.SparqlasPackage;
import west.twouse.language.sparqlas.TemplateBinding;
import west.twouse.language.sparqlas.TemplateSignature;
import west.twouse.language.sparqlas.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Describe Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.DescribeQueryImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.DescribeQueryImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.DescribeQueryImpl#getDescribeIRI <em>Describe IRI</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.DescribeQueryImpl#getAtoms <em>Atoms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescribeQueryImpl extends QueryImpl implements DescribeQuery
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
   * The cached value of the '{@link #getDescribeIRI() <em>Describe IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescribeIRI()
   * @generated
   * @ordered
   */
  protected IRI describeIRI;

  /**
   * The cached value of the '{@link #getAtoms() <em>Atoms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtoms()
   * @generated
   * @ordered
   */
  protected EList<Atom> atoms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DescribeQueryImpl()
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
    return SparqlasPackage.Literals.DESCRIBE_QUERY;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
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
      templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING, SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
    }
    return templateBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getDescribeIRI()
  {
    return describeIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescribeIRI(IRI newDescribeIRI, NotificationChain msgs)
  {
    IRI oldDescribeIRI = describeIRI;
    describeIRI = newDescribeIRI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI, oldDescribeIRI, newDescribeIRI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescribeIRI(IRI newDescribeIRI)
  {
    if (newDescribeIRI != describeIRI)
    {
      NotificationChain msgs = null;
      if (describeIRI != null)
        msgs = ((InternalEObject)describeIRI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI, null, msgs);
      if (newDescribeIRI != null)
        msgs = ((InternalEObject)newDescribeIRI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI, null, msgs);
      msgs = basicSetDescribeIRI(newDescribeIRI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI, newDescribeIRI, newDescribeIRI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Atom> getAtoms()
  {
    if (atoms == null)
    {
      atoms = new EObjectContainmentEList<Atom>(Atom.class, this, SparqlasPackage.DESCRIBE_QUERY__ATOMS);
    }
    return atoms;
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
      case SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE:
        if (ownedTemplateSignature != null)
          msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE, null, msgs);
        return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
      case SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING:
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
      case SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE:
        return basicSetOwnedTemplateSignature(null, msgs);
      case SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING:
        return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
      case SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI:
        return basicSetDescribeIRI(null, msgs);
      case SparqlasPackage.DESCRIBE_QUERY__ATOMS:
        return ((InternalEList<?>)getAtoms()).basicRemove(otherEnd, msgs);
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
      case SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE:
        return getOwnedTemplateSignature();
      case SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING:
        return getTemplateBinding();
      case SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI:
        return getDescribeIRI();
      case SparqlasPackage.DESCRIBE_QUERY__ATOMS:
        return getAtoms();
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
      case SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE:
        setOwnedTemplateSignature((TemplateSignature)newValue);
        return;
      case SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING:
        getTemplateBinding().clear();
        getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
        return;
      case SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI:
        setDescribeIRI((IRI)newValue);
        return;
      case SparqlasPackage.DESCRIBE_QUERY__ATOMS:
        getAtoms().clear();
        getAtoms().addAll((Collection<? extends Atom>)newValue);
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
      case SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE:
        setOwnedTemplateSignature((TemplateSignature)null);
        return;
      case SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING:
        getTemplateBinding().clear();
        return;
      case SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI:
        setDescribeIRI((IRI)null);
        return;
      case SparqlasPackage.DESCRIBE_QUERY__ATOMS:
        getAtoms().clear();
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
      case SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE:
        return ownedTemplateSignature != null;
      case SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING:
        return templateBinding != null && !templateBinding.isEmpty();
      case SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI:
        return describeIRI != null;
      case SparqlasPackage.DESCRIBE_QUERY__ATOMS:
        return atoms != null && !atoms.isEmpty();
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
        case SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE: return SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
        case SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING: return SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
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
        case SparqlasPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE;
        case SparqlasPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //DescribeQueryImpl
