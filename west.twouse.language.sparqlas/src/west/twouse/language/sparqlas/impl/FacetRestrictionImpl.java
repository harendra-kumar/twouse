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

import west.twouse.language.sparqlas.AbstractLiteral;
import west.twouse.language.sparqlas.FacetRestriction;
import west.twouse.language.sparqlas.IRI;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.FacetRestrictionImpl#getConstrainingFacet <em>Constraining Facet</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.FacetRestrictionImpl#getRestrictionValue <em>Restriction Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetRestrictionImpl extends EObjectImpl implements FacetRestriction
{
  /**
   * The cached value of the '{@link #getConstrainingFacet() <em>Constraining Facet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstrainingFacet()
   * @generated
   * @ordered
   */
  protected IRI constrainingFacet;

  /**
   * The cached value of the '{@link #getRestrictionValue() <em>Restriction Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrictionValue()
   * @generated
   * @ordered
   */
  protected AbstractLiteral restrictionValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetRestrictionImpl()
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
    return SparqlasPackage.Literals.FACET_RESTRICTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getConstrainingFacet()
  {
    return constrainingFacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstrainingFacet(IRI newConstrainingFacet, NotificationChain msgs)
  {
    IRI oldConstrainingFacet = constrainingFacet;
    constrainingFacet = newConstrainingFacet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET, oldConstrainingFacet, newConstrainingFacet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstrainingFacet(IRI newConstrainingFacet)
  {
    if (newConstrainingFacet != constrainingFacet)
    {
      NotificationChain msgs = null;
      if (constrainingFacet != null)
        msgs = ((InternalEObject)constrainingFacet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET, null, msgs);
      if (newConstrainingFacet != null)
        msgs = ((InternalEObject)newConstrainingFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET, null, msgs);
      msgs = basicSetConstrainingFacet(newConstrainingFacet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET, newConstrainingFacet, newConstrainingFacet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractLiteral getRestrictionValue()
  {
    return restrictionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRestrictionValue(AbstractLiteral newRestrictionValue, NotificationChain msgs)
  {
    AbstractLiteral oldRestrictionValue = restrictionValue;
    restrictionValue = newRestrictionValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE, oldRestrictionValue, newRestrictionValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestrictionValue(AbstractLiteral newRestrictionValue)
  {
    if (newRestrictionValue != restrictionValue)
    {
      NotificationChain msgs = null;
      if (restrictionValue != null)
        msgs = ((InternalEObject)restrictionValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE, null, msgs);
      if (newRestrictionValue != null)
        msgs = ((InternalEObject)newRestrictionValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE, null, msgs);
      msgs = basicSetRestrictionValue(newRestrictionValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE, newRestrictionValue, newRestrictionValue));
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
      case SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET:
        return basicSetConstrainingFacet(null, msgs);
      case SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE:
        return basicSetRestrictionValue(null, msgs);
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
      case SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET:
        return getConstrainingFacet();
      case SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE:
        return getRestrictionValue();
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
      case SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET:
        setConstrainingFacet((IRI)newValue);
        return;
      case SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE:
        setRestrictionValue((AbstractLiteral)newValue);
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
      case SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET:
        setConstrainingFacet((IRI)null);
        return;
      case SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE:
        setRestrictionValue((AbstractLiteral)null);
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
      case SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET:
        return constrainingFacet != null;
      case SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE:
        return restrictionValue != null;
    }
    return super.eIsSet(featureID);
  }

} //FacetRestrictionImpl
