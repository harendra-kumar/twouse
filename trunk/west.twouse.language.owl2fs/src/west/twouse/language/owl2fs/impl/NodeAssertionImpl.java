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

import west.twouse.language.owl2fs.IRI;
import west.twouse.language.owl2fs.NodeAssertion;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.NodeAssertionImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.NodeAssertionImpl#getDgNode <em>Dg Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeAssertionImpl extends EObjectImpl implements NodeAssertion
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected west.twouse.language.owl2fs.Class class_;

  /**
   * The cached value of the '{@link #getDgNode() <em>Dg Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDgNode()
   * @generated
   * @ordered
   */
  protected IRI dgNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeAssertionImpl()
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
    return Owl2fsPackage.Literals.NODE_ASSERTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public west.twouse.language.owl2fs.Class getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(west.twouse.language.owl2fs.Class newClass, NotificationChain msgs)
  {
    west.twouse.language.owl2fs.Class oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.NODE_ASSERTION__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(west.twouse.language.owl2fs.Class newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.NODE_ASSERTION__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.NODE_ASSERTION__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.NODE_ASSERTION__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getDgNode()
  {
    return dgNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDgNode(IRI newDgNode, NotificationChain msgs)
  {
    IRI oldDgNode = dgNode;
    dgNode = newDgNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.NODE_ASSERTION__DG_NODE, oldDgNode, newDgNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDgNode(IRI newDgNode)
  {
    if (newDgNode != dgNode)
    {
      NotificationChain msgs = null;
      if (dgNode != null)
        msgs = ((InternalEObject)dgNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.NODE_ASSERTION__DG_NODE, null, msgs);
      if (newDgNode != null)
        msgs = ((InternalEObject)newDgNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.NODE_ASSERTION__DG_NODE, null, msgs);
      msgs = basicSetDgNode(newDgNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.NODE_ASSERTION__DG_NODE, newDgNode, newDgNode));
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
      case Owl2fsPackage.NODE_ASSERTION__CLASS:
        return basicSetClass(null, msgs);
      case Owl2fsPackage.NODE_ASSERTION__DG_NODE:
        return basicSetDgNode(null, msgs);
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
      case Owl2fsPackage.NODE_ASSERTION__CLASS:
        return getClass_();
      case Owl2fsPackage.NODE_ASSERTION__DG_NODE:
        return getDgNode();
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
      case Owl2fsPackage.NODE_ASSERTION__CLASS:
        setClass((west.twouse.language.owl2fs.Class)newValue);
        return;
      case Owl2fsPackage.NODE_ASSERTION__DG_NODE:
        setDgNode((IRI)newValue);
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
      case Owl2fsPackage.NODE_ASSERTION__CLASS:
        setClass((west.twouse.language.owl2fs.Class)null);
        return;
      case Owl2fsPackage.NODE_ASSERTION__DG_NODE:
        setDgNode((IRI)null);
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
      case Owl2fsPackage.NODE_ASSERTION__CLASS:
        return class_ != null;
      case Owl2fsPackage.NODE_ASSERTION__DG_NODE:
        return dgNode != null;
    }
    return super.eIsSet(featureID);
  }

} //NodeAssertionImpl
