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

import west.twouse.language.owl2fs.ClassExpression;
import west.twouse.language.owl2fs.EquivalentClasses;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.EquivalentClassesImpl#getEquivalentClassExpressions <em>Equivalent Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentClassesImpl extends ClassAxiomImpl implements EquivalentClasses
{
  /**
   * The cached value of the '{@link #getEquivalentClassExpressions() <em>Equivalent Class Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEquivalentClassExpressions()
   * @generated
   * @ordered
   */
  protected EList<ClassExpression> equivalentClassExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EquivalentClassesImpl()
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
    return Owl2fsPackage.Literals.EQUIVALENT_CLASSES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassExpression> getEquivalentClassExpressions()
  {
    if (equivalentClassExpressions == null)
    {
      equivalentClassExpressions = new EObjectContainmentEList<ClassExpression>(ClassExpression.class, this, Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS);
    }
    return equivalentClassExpressions;
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
      case Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS:
        return ((InternalEList<?>)getEquivalentClassExpressions()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS:
        return getEquivalentClassExpressions();
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
      case Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS:
        getEquivalentClassExpressions().clear();
        getEquivalentClassExpressions().addAll((Collection<? extends ClassExpression>)newValue);
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
      case Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS:
        getEquivalentClassExpressions().clear();
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
      case Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS:
        return equivalentClassExpressions != null && !equivalentClassExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EquivalentClassesImpl
