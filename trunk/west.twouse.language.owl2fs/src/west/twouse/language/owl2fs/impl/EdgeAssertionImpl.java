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

import west.twouse.language.owl2fs.EdgeAssertion;
import west.twouse.language.owl2fs.IRI;
import west.twouse.language.owl2fs.ObjectProperty;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.EdgeAssertionImpl#getObjectProperty <em>Object Property</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.EdgeAssertionImpl#getDgNode1 <em>Dg Node1</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.EdgeAssertionImpl#getDgNode2 <em>Dg Node2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeAssertionImpl extends EObjectImpl implements EdgeAssertion
{
  /**
   * The cached value of the '{@link #getObjectProperty() <em>Object Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectProperty()
   * @generated
   * @ordered
   */
  protected ObjectProperty objectProperty;

  /**
   * The cached value of the '{@link #getDgNode1() <em>Dg Node1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDgNode1()
   * @generated
   * @ordered
   */
  protected IRI dgNode1;

  /**
   * The cached value of the '{@link #getDgNode2() <em>Dg Node2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDgNode2()
   * @generated
   * @ordered
   */
  protected IRI dgNode2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgeAssertionImpl()
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
    return Owl2fsPackage.Literals.EDGE_ASSERTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectProperty getObjectProperty()
  {
    return objectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectProperty(ObjectProperty newObjectProperty, NotificationChain msgs)
  {
    ObjectProperty oldObjectProperty = objectProperty;
    objectProperty = newObjectProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY, oldObjectProperty, newObjectProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectProperty(ObjectProperty newObjectProperty)
  {
    if (newObjectProperty != objectProperty)
    {
      NotificationChain msgs = null;
      if (objectProperty != null)
        msgs = ((InternalEObject)objectProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY, null, msgs);
      if (newObjectProperty != null)
        msgs = ((InternalEObject)newObjectProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY, null, msgs);
      msgs = basicSetObjectProperty(newObjectProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY, newObjectProperty, newObjectProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getDgNode1()
  {
    return dgNode1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDgNode1(IRI newDgNode1, NotificationChain msgs)
  {
    IRI oldDgNode1 = dgNode1;
    dgNode1 = newDgNode1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.EDGE_ASSERTION__DG_NODE1, oldDgNode1, newDgNode1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDgNode1(IRI newDgNode1)
  {
    if (newDgNode1 != dgNode1)
    {
      NotificationChain msgs = null;
      if (dgNode1 != null)
        msgs = ((InternalEObject)dgNode1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.EDGE_ASSERTION__DG_NODE1, null, msgs);
      if (newDgNode1 != null)
        msgs = ((InternalEObject)newDgNode1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.EDGE_ASSERTION__DG_NODE1, null, msgs);
      msgs = basicSetDgNode1(newDgNode1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.EDGE_ASSERTION__DG_NODE1, newDgNode1, newDgNode1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getDgNode2()
  {
    return dgNode2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDgNode2(IRI newDgNode2, NotificationChain msgs)
  {
    IRI oldDgNode2 = dgNode2;
    dgNode2 = newDgNode2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.EDGE_ASSERTION__DG_NODE2, oldDgNode2, newDgNode2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDgNode2(IRI newDgNode2)
  {
    if (newDgNode2 != dgNode2)
    {
      NotificationChain msgs = null;
      if (dgNode2 != null)
        msgs = ((InternalEObject)dgNode2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.EDGE_ASSERTION__DG_NODE2, null, msgs);
      if (newDgNode2 != null)
        msgs = ((InternalEObject)newDgNode2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.EDGE_ASSERTION__DG_NODE2, null, msgs);
      msgs = basicSetDgNode2(newDgNode2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.EDGE_ASSERTION__DG_NODE2, newDgNode2, newDgNode2));
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
      case Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY:
        return basicSetObjectProperty(null, msgs);
      case Owl2fsPackage.EDGE_ASSERTION__DG_NODE1:
        return basicSetDgNode1(null, msgs);
      case Owl2fsPackage.EDGE_ASSERTION__DG_NODE2:
        return basicSetDgNode2(null, msgs);
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
      case Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY:
        return getObjectProperty();
      case Owl2fsPackage.EDGE_ASSERTION__DG_NODE1:
        return getDgNode1();
      case Owl2fsPackage.EDGE_ASSERTION__DG_NODE2:
        return getDgNode2();
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
      case Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY:
        setObjectProperty((ObjectProperty)newValue);
        return;
      case Owl2fsPackage.EDGE_ASSERTION__DG_NODE1:
        setDgNode1((IRI)newValue);
        return;
      case Owl2fsPackage.EDGE_ASSERTION__DG_NODE2:
        setDgNode2((IRI)newValue);
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
      case Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY:
        setObjectProperty((ObjectProperty)null);
        return;
      case Owl2fsPackage.EDGE_ASSERTION__DG_NODE1:
        setDgNode1((IRI)null);
        return;
      case Owl2fsPackage.EDGE_ASSERTION__DG_NODE2:
        setDgNode2((IRI)null);
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
      case Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY:
        return objectProperty != null;
      case Owl2fsPackage.EDGE_ASSERTION__DG_NODE1:
        return dgNode1 != null;
      case Owl2fsPackage.EDGE_ASSERTION__DG_NODE2:
        return dgNode2 != null;
    }
    return super.eIsSet(featureID);
  }

} //EdgeAssertionImpl
