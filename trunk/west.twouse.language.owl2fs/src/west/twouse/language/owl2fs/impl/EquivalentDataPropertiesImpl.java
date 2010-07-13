/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.owl2fs.DataPropertyExpression;
import west.twouse.language.owl2fs.EquivalentDataProperties;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Data Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.EquivalentDataPropertiesImpl#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentDataPropertiesImpl extends DataPropertyAxiomImpl implements EquivalentDataProperties
{
  /**
   * The cached value of the '{@link #getDataPropertyExpressions() <em>Data Property Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataPropertyExpressions()
   * @generated
   * @ordered
   */
  protected EList<DataPropertyExpression> dataPropertyExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EquivalentDataPropertiesImpl()
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
    return Owl2fsPackage.Literals.EQUIVALENT_DATA_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataPropertyExpression> getDataPropertyExpressions()
  {
    if (dataPropertyExpressions == null)
    {
      dataPropertyExpressions = new EObjectContainmentEList<DataPropertyExpression>(DataPropertyExpression.class, this, Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS);
    }
    return dataPropertyExpressions;
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
      case Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS:
        return ((InternalEList<?>)getDataPropertyExpressions()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS:
        return getDataPropertyExpressions();
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
      case Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS:
        getDataPropertyExpressions().clear();
        getDataPropertyExpressions().addAll((Collection<? extends DataPropertyExpression>)newValue);
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
      case Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS:
        getDataPropertyExpressions().clear();
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
      case Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS:
        return dataPropertyExpressions != null && !dataPropertyExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EquivalentDataPropertiesImpl
