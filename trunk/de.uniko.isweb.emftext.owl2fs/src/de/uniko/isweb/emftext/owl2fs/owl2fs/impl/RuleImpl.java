/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Rule;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.RuleImpl#getHasAntecedent <em>Has Antecedent</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.RuleImpl#getHasConsequent <em>Has Consequent</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.RuleImpl#getSwrlVariables <em>Swrl Variables</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.RuleImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends AxiomImpl implements Rule
{
  /**
   * The cached value of the '{@link #getHasAntecedent() <em>Has Antecedent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasAntecedent()
   * @generated
   * @ordered
   */
  protected Antecedent hasAntecedent;

  /**
   * The cached value of the '{@link #getHasConsequent() <em>Has Consequent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasConsequent()
   * @generated
   * @ordered
   */
  protected Consequent hasConsequent;

  /**
   * The cached value of the '{@link #getSwrlVariables() <em>Swrl Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwrlVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> swrlVariables;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return Owl2fsPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedent getHasAntecedent()
  {
    return hasAntecedent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasAntecedent(Antecedent newHasAntecedent, NotificationChain msgs)
  {
    Antecedent oldHasAntecedent = hasAntecedent;
    hasAntecedent = newHasAntecedent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.RULE__HAS_ANTECEDENT, oldHasAntecedent, newHasAntecedent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasAntecedent(Antecedent newHasAntecedent)
  {
    if (newHasAntecedent != hasAntecedent)
    {
      NotificationChain msgs = null;
      if (hasAntecedent != null)
        msgs = ((InternalEObject)hasAntecedent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.RULE__HAS_ANTECEDENT, null, msgs);
      if (newHasAntecedent != null)
        msgs = ((InternalEObject)newHasAntecedent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.RULE__HAS_ANTECEDENT, null, msgs);
      msgs = basicSetHasAntecedent(newHasAntecedent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.RULE__HAS_ANTECEDENT, newHasAntecedent, newHasAntecedent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Consequent getHasConsequent()
  {
    return hasConsequent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHasConsequent(Consequent newHasConsequent, NotificationChain msgs)
  {
    Consequent oldHasConsequent = hasConsequent;
    hasConsequent = newHasConsequent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.RULE__HAS_CONSEQUENT, oldHasConsequent, newHasConsequent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasConsequent(Consequent newHasConsequent)
  {
    if (newHasConsequent != hasConsequent)
    {
      NotificationChain msgs = null;
      if (hasConsequent != null)
        msgs = ((InternalEObject)hasConsequent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.RULE__HAS_CONSEQUENT, null, msgs);
      if (newHasConsequent != null)
        msgs = ((InternalEObject)newHasConsequent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.RULE__HAS_CONSEQUENT, null, msgs);
      msgs = basicSetHasConsequent(newHasConsequent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.RULE__HAS_CONSEQUENT, newHasConsequent, newHasConsequent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getSwrlVariables()
  {
    if (swrlVariables == null)
    {
      swrlVariables = new EObjectContainmentEList<Variable>(Variable.class, this, Owl2fsPackage.RULE__SWRL_VARIABLES);
    }
    return swrlVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.RULE__NAME, oldName, name));
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
      case Owl2fsPackage.RULE__HAS_ANTECEDENT:
        return basicSetHasAntecedent(null, msgs);
      case Owl2fsPackage.RULE__HAS_CONSEQUENT:
        return basicSetHasConsequent(null, msgs);
      case Owl2fsPackage.RULE__SWRL_VARIABLES:
        return ((InternalEList<?>)getSwrlVariables()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.RULE__HAS_ANTECEDENT:
        return getHasAntecedent();
      case Owl2fsPackage.RULE__HAS_CONSEQUENT:
        return getHasConsequent();
      case Owl2fsPackage.RULE__SWRL_VARIABLES:
        return getSwrlVariables();
      case Owl2fsPackage.RULE__NAME:
        return getName();
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
      case Owl2fsPackage.RULE__HAS_ANTECEDENT:
        setHasAntecedent((Antecedent)newValue);
        return;
      case Owl2fsPackage.RULE__HAS_CONSEQUENT:
        setHasConsequent((Consequent)newValue);
        return;
      case Owl2fsPackage.RULE__SWRL_VARIABLES:
        getSwrlVariables().clear();
        getSwrlVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case Owl2fsPackage.RULE__NAME:
        setName((String)newValue);
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
      case Owl2fsPackage.RULE__HAS_ANTECEDENT:
        setHasAntecedent((Antecedent)null);
        return;
      case Owl2fsPackage.RULE__HAS_CONSEQUENT:
        setHasConsequent((Consequent)null);
        return;
      case Owl2fsPackage.RULE__SWRL_VARIABLES:
        getSwrlVariables().clear();
        return;
      case Owl2fsPackage.RULE__NAME:
        setName(NAME_EDEFAULT);
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
      case Owl2fsPackage.RULE__HAS_ANTECEDENT:
        return hasAntecedent != null;
      case Owl2fsPackage.RULE__HAS_CONSEQUENT:
        return hasConsequent != null;
      case Owl2fsPackage.RULE__SWRL_VARIABLES:
        return swrlVariables != null && !swrlVariables.isEmpty();
      case Owl2fsPackage.RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
