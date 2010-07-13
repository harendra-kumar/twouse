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
import west.twouse.language.owl2fs.ObjectIntersectionOf;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Intersection Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.ObjectIntersectionOfImpl#getClassExpressions <em>Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectIntersectionOfImpl extends ClassExpressionImpl implements ObjectIntersectionOf
{
  /**
   * The cached value of the '{@link #getClassExpressions() <em>Class Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassExpressions()
   * @generated
   * @ordered
   */
  protected EList<ClassExpression> classExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectIntersectionOfImpl()
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
    return Owl2fsPackage.Literals.OBJECT_INTERSECTION_OF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassExpression> getClassExpressions()
  {
    if (classExpressions == null)
    {
      classExpressions = new EObjectContainmentEList<ClassExpression>(ClassExpression.class, this, Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS);
    }
    return classExpressions;
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
      case Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS:
        return ((InternalEList<?>)getClassExpressions()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS:
        return getClassExpressions();
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
      case Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS:
        getClassExpressions().clear();
        getClassExpressions().addAll((Collection<? extends ClassExpression>)newValue);
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
      case Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS:
        getClassExpressions().clear();
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
      case Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS:
        return classExpressions != null && !classExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ObjectIntersectionOfImpl
