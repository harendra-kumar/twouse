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

import west.twouse.language.sparqlas.IndividualDeclaration;
import west.twouse.language.sparqlas.IndividualVariable;
import west.twouse.language.sparqlas.NamedIndividual;
import west.twouse.language.sparqlas.SparqlmsPackage;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.IndividualDeclarationImpl#getIndividual <em>Individual</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.IndividualDeclarationImpl#getIndividualVariable <em>Individual Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualDeclarationImpl extends DeclarationImpl implements IndividualDeclaration
{
  /**
   * The cached value of the '{@link #getIndividual() <em>Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndividual()
   * @generated
   * @ordered
   */
  protected NamedIndividual individual;

  /**
   * The cached value of the '{@link #getIndividualVariable() <em>Individual Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndividualVariable()
   * @generated
   * @ordered
   */
  protected IndividualVariable individualVariable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndividualDeclarationImpl()
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
    return SparqlasPackage.Literals.INDIVIDUAL_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedIndividual getIndividual()
  {
    return individual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndividual(NamedIndividual newIndividual, NotificationChain msgs)
  {
    NamedIndividual oldIndividual = individual;
    individual = newIndividual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL, oldIndividual, newIndividual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndividual(NamedIndividual newIndividual)
  {
    if (newIndividual != individual)
    {
      NotificationChain msgs = null;
      if (individual != null)
        msgs = ((InternalEObject)individual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL, null, msgs);
      if (newIndividual != null)
        msgs = ((InternalEObject)newIndividual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL, null, msgs);
      msgs = basicSetIndividual(newIndividual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL, newIndividual, newIndividual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndividualVariable getIndividualVariable()
  {
    return individualVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndividualVariable(IndividualVariable newIndividualVariable, NotificationChain msgs)
  {
    IndividualVariable oldIndividualVariable = individualVariable;
    individualVariable = newIndividualVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE, oldIndividualVariable, newIndividualVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndividualVariable(IndividualVariable newIndividualVariable)
  {
    if (newIndividualVariable != individualVariable)
    {
      NotificationChain msgs = null;
      if (individualVariable != null)
        msgs = ((InternalEObject)individualVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE, null, msgs);
      if (newIndividualVariable != null)
        msgs = ((InternalEObject)newIndividualVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE, null, msgs);
      msgs = basicSetIndividualVariable(newIndividualVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE, newIndividualVariable, newIndividualVariable));
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
      case SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL:
        return basicSetIndividual(null, msgs);
      case SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE:
        return basicSetIndividualVariable(null, msgs);
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
      case SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL:
        return getIndividual();
      case SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE:
        return getIndividualVariable();
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
      case SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL:
        setIndividual((NamedIndividual)newValue);
        return;
      case SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE:
        setIndividualVariable((IndividualVariable)newValue);
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
      case SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL:
        setIndividual((NamedIndividual)null);
        return;
      case SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE:
        setIndividualVariable((IndividualVariable)null);
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
      case SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL:
        return individual != null;
      case SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE:
        return individualVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //IndividualDeclarationImpl
