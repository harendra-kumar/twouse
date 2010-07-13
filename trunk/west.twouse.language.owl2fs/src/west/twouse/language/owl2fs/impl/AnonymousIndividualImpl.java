/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import west.twouse.language.owl2fs.AnonymousIndividual;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.AnonymousIndividualImpl#getNodeID <em>Node ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnonymousIndividualImpl extends IndividualImpl implements AnonymousIndividual
{
  /**
   * The default value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeID()
   * @generated
   * @ordered
   */
  protected static final String NODE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeID()
   * @generated
   * @ordered
   */
  protected String nodeID = NODE_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnonymousIndividualImpl()
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
    return Owl2fsPackage.Literals.ANONYMOUS_INDIVIDUAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNodeID()
  {
    return nodeID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeID(String newNodeID)
  {
    String oldNodeID = nodeID;
    nodeID = newNodeID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID, oldNodeID, nodeID));
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
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID:
        return getNodeID();
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
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID:
        setNodeID((String)newValue);
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
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID:
        setNodeID(NODE_ID_EDEFAULT);
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
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID:
        return NODE_ID_EDEFAULT == null ? nodeID != null : !NODE_ID_EDEFAULT.equals(nodeID);
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
    result.append(" (nodeID: ");
    result.append(nodeID);
    result.append(')');
    return result.toString();
  }

} //AnonymousIndividualImpl
