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
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.sparqlas.ClassExpression;
import west.twouse.language.sparqlas.ClassVariable;
import west.twouse.language.sparqlas.DisjointUnion;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjoint Union</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.DisjointUnionImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.DisjointUnionImpl#getClassVariable <em>Class Variable</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.DisjointUnionImpl#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisjointUnionImpl extends ClassAtomImpl implements DisjointUnion
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected west.twouse.language.sparqlas.Class class_;

  /**
   * The cached value of the '{@link #getClassVariable() <em>Class Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassVariable()
   * @generated
   * @ordered
   */
  protected ClassVariable classVariable;

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
    return SparqlasPackage.Literals.DISJOINT_UNION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public west.twouse.language.sparqlas.Class getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(west.twouse.language.sparqlas.Class newClass, NotificationChain msgs)
  {
    west.twouse.language.sparqlas.Class oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.DISJOINT_UNION__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(west.twouse.language.sparqlas.Class newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DISJOINT_UNION__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DISJOINT_UNION__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.DISJOINT_UNION__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassVariable getClassVariable()
  {
    return classVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassVariable(ClassVariable newClassVariable, NotificationChain msgs)
  {
    ClassVariable oldClassVariable = classVariable;
    classVariable = newClassVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE, oldClassVariable, newClassVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassVariable(ClassVariable newClassVariable)
  {
    if (newClassVariable != classVariable)
    {
      NotificationChain msgs = null;
      if (classVariable != null)
        msgs = ((InternalEObject)classVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE, null, msgs);
      if (newClassVariable != null)
        msgs = ((InternalEObject)newClassVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE, null, msgs);
      msgs = basicSetClassVariable(newClassVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE, newClassVariable, newClassVariable));
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
      disjointClassExpressions = new EObjectContainmentEList<ClassExpression>(ClassExpression.class, this, SparqlasPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS);
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
      case SparqlasPackage.DISJOINT_UNION__CLASS:
        return basicSetClass(null, msgs);
      case SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE:
        return basicSetClassVariable(null, msgs);
      case SparqlasPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS:
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
      case SparqlasPackage.DISJOINT_UNION__CLASS:
        return getClass_();
      case SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE:
        return getClassVariable();
      case SparqlasPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS:
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
      case SparqlasPackage.DISJOINT_UNION__CLASS:
        setClass((west.twouse.language.sparqlas.Class)newValue);
        return;
      case SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE:
        setClassVariable((ClassVariable)newValue);
        return;
      case SparqlasPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS:
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
      case SparqlasPackage.DISJOINT_UNION__CLASS:
        setClass((west.twouse.language.sparqlas.Class)null);
        return;
      case SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE:
        setClassVariable((ClassVariable)null);
        return;
      case SparqlasPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS:
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
      case SparqlasPackage.DISJOINT_UNION__CLASS:
        return class_ != null;
      case SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE:
        return classVariable != null;
      case SparqlasPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS:
        return disjointClassExpressions != null && !disjointClassExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DisjointUnionImpl
