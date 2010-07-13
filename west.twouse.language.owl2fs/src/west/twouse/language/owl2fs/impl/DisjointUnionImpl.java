/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.owl2fs.ClassExpression;
import west.twouse.language.owl2fs.DisjointUnion;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoint Union</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.DisjointUnionImpl#getUnionClass <em>Union Class</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DisjointUnionImpl#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisjointUnionImpl extends ClassAxiomImpl implements DisjointUnion
{
  /**
   * The cached value of the '{@link #getUnionClass() <em>Union Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnionClass()
   * @generated
   * @ordered
   */
  protected west.twouse.language.owl2fs.Class unionClass;

  /**
   * The cached value of the '{@link #getDisjointClassExpressions() <em>Disjoint Class Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisjointClassExpressions()
   * @generated
   * @ordered
   */
  protected EList<ClassExpression> disjointClassExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DisjointUnionImpl()
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
    return Owl2fsPackage.Literals.DISJOINT_UNION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public west.twouse.language.owl2fs.Class getUnionClass()
  {
    return unionClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnionClass(west.twouse.language.owl2fs.Class newUnionClass, NotificationChain msgs)
  {
    west.twouse.language.owl2fs.Class oldUnionClass = unionClass;
    unionClass = newUnionClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DISJOINT_UNION__UNION_CLASS, oldUnionClass, newUnionClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnionClass(west.twouse.language.owl2fs.Class newUnionClass)
  {
    if (newUnionClass != unionClass)
    {
      NotificationChain msgs = null;
      if (unionClass != null)
        msgs = ((InternalEObject)unionClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DISJOINT_UNION__UNION_CLASS, null, msgs);
      if (newUnionClass != null)
        msgs = ((InternalEObject)newUnionClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DISJOINT_UNION__UNION_CLASS, null, msgs);
      msgs = basicSetUnionClass(newUnionClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DISJOINT_UNION__UNION_CLASS, newUnionClass, newUnionClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassExpression> getDisjointClassExpressions()
  {
    if (disjointClassExpressions == null)
    {
      disjointClassExpressions = new EObjectContainmentEList<ClassExpression>(ClassExpression.class, this, Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS);
    }
    return disjointClassExpressions;
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
      case Owl2fsPackage.DISJOINT_UNION__UNION_CLASS:
        return basicSetUnionClass(null, msgs);
      case Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS:
        return ((InternalEList<?>)getDisjointClassExpressions()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.DISJOINT_UNION__UNION_CLASS:
        return getUnionClass();
      case Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS:
        return getDisjointClassExpressions();
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
      case Owl2fsPackage.DISJOINT_UNION__UNION_CLASS:
        setUnionClass((west.twouse.language.owl2fs.Class)newValue);
        return;
      case Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS:
        getDisjointClassExpressions().clear();
        getDisjointClassExpressions().addAll((Collection<? extends ClassExpression>)newValue);
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
      case Owl2fsPackage.DISJOINT_UNION__UNION_CLASS:
        setUnionClass((west.twouse.language.owl2fs.Class)null);
        return;
      case Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS:
        getDisjointClassExpressions().clear();
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
      case Owl2fsPackage.DISJOINT_UNION__UNION_CLASS:
        return unionClass != null;
      case Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS:
        return disjointClassExpressions != null && !disjointClassExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DisjointUnionImpl
