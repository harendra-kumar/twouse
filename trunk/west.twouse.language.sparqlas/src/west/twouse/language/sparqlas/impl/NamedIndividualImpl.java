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

import west.twouse.language.sparqlas.Constant;
import west.twouse.language.sparqlas.IRI;
import west.twouse.language.sparqlas.NamedIndividual;
import west.twouse.language.sparqlas.SparqlmsPackage;
import west.twouse.language.sparqlas.SparqlasPackage;
import west.twouse.language.sparqlas.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.NamedIndividualImpl#getConstantIRI <em>Constant IRI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedIndividualImpl extends IndividualImpl implements NamedIndividual
{
  /**
   * The cached value of the '{@link #getConstantIRI() <em>Constant IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantIRI()
   * @generated
   * @ordered
   */
  protected IRI constantIRI;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedIndividualImpl()
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
    return SparqlasPackage.Literals.NAMED_INDIVIDUAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getConstantIRI()
  {
    return constantIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstantIRI(IRI newConstantIRI, NotificationChain msgs)
  {
    IRI oldConstantIRI = constantIRI;
    constantIRI = newConstantIRI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI, oldConstantIRI, newConstantIRI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstantIRI(IRI newConstantIRI)
  {
    if (newConstantIRI != constantIRI)
    {
      NotificationChain msgs = null;
      if (constantIRI != null)
        msgs = ((InternalEObject)constantIRI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI, null, msgs);
      if (newConstantIRI != null)
        msgs = ((InternalEObject)newConstantIRI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI, null, msgs);
      msgs = basicSetConstantIRI(newConstantIRI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI, newConstantIRI, newConstantIRI));
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
      case SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI:
        return basicSetConstantIRI(null, msgs);
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
      case SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI:
        return getConstantIRI();
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
      case SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI:
        setConstantIRI((IRI)newValue);
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
      case SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI:
        setConstantIRI((IRI)null);
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
      case SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI:
        return constantIRI != null;
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
    if (baseClass == Term.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Constant.class)
    {
      switch (derivedFeatureID)
      {
        case SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI: return SparqlasPackage.CONSTANT__CONSTANT_IRI;
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
    if (baseClass == Term.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Constant.class)
    {
      switch (baseFeatureID)
      {
        case SparqlasPackage.CONSTANT__CONSTANT_IRI: return SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //NamedIndividualImpl
