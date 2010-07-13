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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import west.twouse.language.owl2fs.FacetConstraintPair;
import west.twouse.language.owl2fs.IRI;
import west.twouse.language.owl2fs.Literal;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet Constraint Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.FacetConstraintPairImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.FacetConstraintPairImpl#getFacet <em>Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetConstraintPairImpl extends EObjectImpl implements FacetConstraintPair
{
  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected Literal constant;

  /**
   * The cached value of the '{@link #getFacet() <em>Facet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacet()
   * @generated
   * @ordered
   */
  protected IRI facet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetConstraintPairImpl()
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
    return Owl2fsPackage.Literals.FACET_CONSTRAINT_PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant(Literal newConstant, NotificationChain msgs)
  {
    Literal oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(Literal newConstant)
  {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT, newConstant, newConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getFacet()
  {
    return facet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFacet(IRI newFacet, NotificationChain msgs)
  {
    IRI oldFacet = facet;
    facet = newFacet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET, oldFacet, newFacet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFacet(IRI newFacet)
  {
    if (newFacet != facet)
    {
      NotificationChain msgs = null;
      if (facet != null)
        msgs = ((InternalEObject)facet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET, null, msgs);
      if (newFacet != null)
        msgs = ((InternalEObject)newFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET, null, msgs);
      msgs = basicSetFacet(newFacet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET, newFacet, newFacet));
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
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT:
        return basicSetConstant(null, msgs);
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET:
        return basicSetFacet(null, msgs);
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
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT:
        return getConstant();
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET:
        return getFacet();
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
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT:
        setConstant((Literal)newValue);
        return;
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET:
        setFacet((IRI)newValue);
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
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT:
        setConstant((Literal)null);
        return;
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET:
        setFacet((IRI)null);
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
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT:
        return constant != null;
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET:
        return facet != null;
    }
    return super.eIsSet(featureID);
  }

} //FacetConstraintPairImpl
