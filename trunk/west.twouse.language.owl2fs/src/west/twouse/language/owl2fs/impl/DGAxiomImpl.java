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

import west.twouse.language.owl2fs.Annotation;
import west.twouse.language.owl2fs.DGAxiom;
import west.twouse.language.owl2fs.DGEdges;
import west.twouse.language.owl2fs.DGNodes;
import west.twouse.language.owl2fs.MainClasses;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DG Axiom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.DGAxiomImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DGAxiomImpl#getDgNodes <em>Dg Nodes</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DGAxiomImpl#getDgEdges <em>Dg Edges</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DGAxiomImpl#getMainClasses <em>Main Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DGAxiomImpl extends AxiomImpl implements DGAxiom
{
  /**
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotation;

  /**
   * The cached value of the '{@link #getDgNodes() <em>Dg Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDgNodes()
   * @generated
   * @ordered
   */
  protected DGNodes dgNodes;

  /**
   * The cached value of the '{@link #getDgEdges() <em>Dg Edges</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDgEdges()
   * @generated
   * @ordered
   */
  protected DGEdges dgEdges;

  /**
   * The cached value of the '{@link #getMainClasses() <em>Main Classes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainClasses()
   * @generated
   * @ordered
   */
  protected MainClasses mainClasses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DGAxiomImpl()
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
    return Owl2fsPackage.Literals.DG_AXIOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnnotation()
  {
    if (annotation == null)
    {
      annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, Owl2fsPackage.DG_AXIOM__ANNOTATION);
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DGNodes getDgNodes()
  {
    return dgNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDgNodes(DGNodes newDgNodes, NotificationChain msgs)
  {
    DGNodes oldDgNodes = dgNodes;
    dgNodes = newDgNodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DG_AXIOM__DG_NODES, oldDgNodes, newDgNodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDgNodes(DGNodes newDgNodes)
  {
    if (newDgNodes != dgNodes)
    {
      NotificationChain msgs = null;
      if (dgNodes != null)
        msgs = ((InternalEObject)dgNodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DG_AXIOM__DG_NODES, null, msgs);
      if (newDgNodes != null)
        msgs = ((InternalEObject)newDgNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DG_AXIOM__DG_NODES, null, msgs);
      msgs = basicSetDgNodes(newDgNodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DG_AXIOM__DG_NODES, newDgNodes, newDgNodes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DGEdges getDgEdges()
  {
    return dgEdges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDgEdges(DGEdges newDgEdges, NotificationChain msgs)
  {
    DGEdges oldDgEdges = dgEdges;
    dgEdges = newDgEdges;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DG_AXIOM__DG_EDGES, oldDgEdges, newDgEdges);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDgEdges(DGEdges newDgEdges)
  {
    if (newDgEdges != dgEdges)
    {
      NotificationChain msgs = null;
      if (dgEdges != null)
        msgs = ((InternalEObject)dgEdges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DG_AXIOM__DG_EDGES, null, msgs);
      if (newDgEdges != null)
        msgs = ((InternalEObject)newDgEdges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DG_AXIOM__DG_EDGES, null, msgs);
      msgs = basicSetDgEdges(newDgEdges, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DG_AXIOM__DG_EDGES, newDgEdges, newDgEdges));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainClasses getMainClasses()
  {
    return mainClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMainClasses(MainClasses newMainClasses, NotificationChain msgs)
  {
    MainClasses oldMainClasses = mainClasses;
    mainClasses = newMainClasses;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DG_AXIOM__MAIN_CLASSES, oldMainClasses, newMainClasses);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainClasses(MainClasses newMainClasses)
  {
    if (newMainClasses != mainClasses)
    {
      NotificationChain msgs = null;
      if (mainClasses != null)
        msgs = ((InternalEObject)mainClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DG_AXIOM__MAIN_CLASSES, null, msgs);
      if (newMainClasses != null)
        msgs = ((InternalEObject)newMainClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DG_AXIOM__MAIN_CLASSES, null, msgs);
      msgs = basicSetMainClasses(newMainClasses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DG_AXIOM__MAIN_CLASSES, newMainClasses, newMainClasses));
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
      case Owl2fsPackage.DG_AXIOM__ANNOTATION:
        return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.DG_AXIOM__DG_NODES:
        return basicSetDgNodes(null, msgs);
      case Owl2fsPackage.DG_AXIOM__DG_EDGES:
        return basicSetDgEdges(null, msgs);
      case Owl2fsPackage.DG_AXIOM__MAIN_CLASSES:
        return basicSetMainClasses(null, msgs);
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
      case Owl2fsPackage.DG_AXIOM__ANNOTATION:
        return getAnnotation();
      case Owl2fsPackage.DG_AXIOM__DG_NODES:
        return getDgNodes();
      case Owl2fsPackage.DG_AXIOM__DG_EDGES:
        return getDgEdges();
      case Owl2fsPackage.DG_AXIOM__MAIN_CLASSES:
        return getMainClasses();
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
      case Owl2fsPackage.DG_AXIOM__ANNOTATION:
        getAnnotation().clear();
        getAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case Owl2fsPackage.DG_AXIOM__DG_NODES:
        setDgNodes((DGNodes)newValue);
        return;
      case Owl2fsPackage.DG_AXIOM__DG_EDGES:
        setDgEdges((DGEdges)newValue);
        return;
      case Owl2fsPackage.DG_AXIOM__MAIN_CLASSES:
        setMainClasses((MainClasses)newValue);
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
      case Owl2fsPackage.DG_AXIOM__ANNOTATION:
        getAnnotation().clear();
        return;
      case Owl2fsPackage.DG_AXIOM__DG_NODES:
        setDgNodes((DGNodes)null);
        return;
      case Owl2fsPackage.DG_AXIOM__DG_EDGES:
        setDgEdges((DGEdges)null);
        return;
      case Owl2fsPackage.DG_AXIOM__MAIN_CLASSES:
        setMainClasses((MainClasses)null);
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
      case Owl2fsPackage.DG_AXIOM__ANNOTATION:
        return annotation != null && !annotation.isEmpty();
      case Owl2fsPackage.DG_AXIOM__DG_NODES:
        return dgNodes != null;
      case Owl2fsPackage.DG_AXIOM__DG_EDGES:
        return dgEdges != null;
      case Owl2fsPackage.DG_AXIOM__MAIN_CLASSES:
        return mainClasses != null;
    }
    return super.eIsSet(featureID);
  }

} //DGAxiomImpl
