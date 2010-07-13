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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.owl2fs.DGEdges;
import west.twouse.language.owl2fs.EdgeAssertion;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DG Edges</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.DGEdgesImpl#getEdgeAssertion <em>Edge Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DGEdgesImpl extends EObjectImpl implements DGEdges
{
  /**
   * The cached value of the '{@link #getEdgeAssertion() <em>Edge Assertion</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdgeAssertion()
   * @generated
   * @ordered
   */
  protected EList<EdgeAssertion> edgeAssertion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DGEdgesImpl()
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
    return Owl2fsPackage.Literals.DG_EDGES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EdgeAssertion> getEdgeAssertion()
  {
    if (edgeAssertion == null)
    {
      edgeAssertion = new EObjectContainmentEList<EdgeAssertion>(EdgeAssertion.class, this, Owl2fsPackage.DG_EDGES__EDGE_ASSERTION);
    }
    return edgeAssertion;
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
      case Owl2fsPackage.DG_EDGES__EDGE_ASSERTION:
        return ((InternalEList<?>)getEdgeAssertion()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.DG_EDGES__EDGE_ASSERTION:
        return getEdgeAssertion();
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
      case Owl2fsPackage.DG_EDGES__EDGE_ASSERTION:
        getEdgeAssertion().clear();
        getEdgeAssertion().addAll((Collection<? extends EdgeAssertion>)newValue);
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
      case Owl2fsPackage.DG_EDGES__EDGE_ASSERTION:
        getEdgeAssertion().clear();
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
      case Owl2fsPackage.DG_EDGES__EDGE_ASSERTION:
        return edgeAssertion != null && !edgeAssertion.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DGEdgesImpl
