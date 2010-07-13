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

import west.twouse.language.owl2fs.BuiltInAtom;
import west.twouse.language.owl2fs.DArg;
import west.twouse.language.owl2fs.IRI;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Built In Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.BuiltInAtomImpl#getIri <em>Iri</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.BuiltInAtomImpl#getDArg <em>DArg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltInAtomImpl extends AtomImpl implements BuiltInAtom
{
  /**
   * The cached value of the '{@link #getIri() <em>Iri</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIri()
   * @generated
   * @ordered
   */
  protected IRI iri;

  /**
   * The cached value of the '{@link #getDArg() <em>DArg</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDArg()
   * @generated
   * @ordered
   */
  protected EList<DArg> dArg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuiltInAtomImpl()
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
    return Owl2fsPackage.Literals.BUILT_IN_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getIri()
  {
    return iri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIri(IRI newIri, NotificationChain msgs)
  {
    IRI oldIri = iri;
    iri = newIri;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.BUILT_IN_ATOM__IRI, oldIri, newIri);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIri(IRI newIri)
  {
    if (newIri != iri)
    {
      NotificationChain msgs = null;
      if (iri != null)
        msgs = ((InternalEObject)iri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.BUILT_IN_ATOM__IRI, null, msgs);
      if (newIri != null)
        msgs = ((InternalEObject)newIri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.BUILT_IN_ATOM__IRI, null, msgs);
      msgs = basicSetIri(newIri, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.BUILT_IN_ATOM__IRI, newIri, newIri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DArg> getDArg()
  {
    if (dArg == null)
    {
      dArg = new EObjectContainmentEList<DArg>(DArg.class, this, Owl2fsPackage.BUILT_IN_ATOM__DARG);
    }
    return dArg;
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
      case Owl2fsPackage.BUILT_IN_ATOM__IRI:
        return basicSetIri(null, msgs);
      case Owl2fsPackage.BUILT_IN_ATOM__DARG:
        return ((InternalEList<?>)getDArg()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.BUILT_IN_ATOM__IRI:
        return getIri();
      case Owl2fsPackage.BUILT_IN_ATOM__DARG:
        return getDArg();
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
      case Owl2fsPackage.BUILT_IN_ATOM__IRI:
        setIri((IRI)newValue);
        return;
      case Owl2fsPackage.BUILT_IN_ATOM__DARG:
        getDArg().clear();
        getDArg().addAll((Collection<? extends DArg>)newValue);
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
      case Owl2fsPackage.BUILT_IN_ATOM__IRI:
        setIri((IRI)null);
        return;
      case Owl2fsPackage.BUILT_IN_ATOM__DARG:
        getDArg().clear();
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
      case Owl2fsPackage.BUILT_IN_ATOM__IRI:
        return iri != null;
      case Owl2fsPackage.BUILT_IN_ATOM__DARG:
        return dArg != null && !dArg.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BuiltInAtomImpl
