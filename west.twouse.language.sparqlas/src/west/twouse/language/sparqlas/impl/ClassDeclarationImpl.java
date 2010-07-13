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

import west.twouse.language.sparqlas.ClassDeclaration;
import west.twouse.language.sparqlas.ClassVariable;
import west.twouse.language.sparqlas.SparqlmsPackage;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.ClassDeclarationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.ClassDeclarationImpl#getClassVariable <em>Class Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDeclarationImpl extends DeclarationImpl implements ClassDeclaration
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassDeclarationImpl()
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
    return SparqlasPackage.Literals.CLASS_DECLARATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.CLASS_DECLARATION__CLASS, oldClass, newClass);
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
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.CLASS_DECLARATION__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.CLASS_DECLARATION__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.CLASS_DECLARATION__CLASS, newClass, newClass));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE, oldClassVariable, newClassVariable);
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
        msgs = ((InternalEObject)classVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE, null, msgs);
      if (newClassVariable != null)
        msgs = ((InternalEObject)newClassVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE, null, msgs);
      msgs = basicSetClassVariable(newClassVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE, newClassVariable, newClassVariable));
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
      case SparqlasPackage.CLASS_DECLARATION__CLASS:
        return basicSetClass(null, msgs);
      case SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE:
        return basicSetClassVariable(null, msgs);
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
      case SparqlasPackage.CLASS_DECLARATION__CLASS:
        return getClass_();
      case SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE:
        return getClassVariable();
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
      case SparqlasPackage.CLASS_DECLARATION__CLASS:
        setClass((west.twouse.language.sparqlas.Class)newValue);
        return;
      case SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE:
        setClassVariable((ClassVariable)newValue);
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
      case SparqlasPackage.CLASS_DECLARATION__CLASS:
        setClass((west.twouse.language.sparqlas.Class)null);
        return;
      case SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE:
        setClassVariable((ClassVariable)null);
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
      case SparqlasPackage.CLASS_DECLARATION__CLASS:
        return class_ != null;
      case SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE:
        return classVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassDeclarationImpl
