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

import west.twouse.language.owl2fs.FullIRI;
import west.twouse.language.owl2fs.Owl2fsPackage;
import west.twouse.language.owl2fs.PrefixDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefix Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.PrefixDefinitionImpl#getPref <em>Pref</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.PrefixDefinitionImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrefixDefinitionImpl extends EObjectImpl implements PrefixDefinition
{
  /**
   * The default value of the '{@link #getPref() <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPref()
   * @generated
   * @ordered
   */
  protected static final String PREF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPref() <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPref()
   * @generated
   * @ordered
   */
  protected String pref = PREF_EDEFAULT;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected FullIRI namespace;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefixDefinitionImpl()
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
    return Owl2fsPackage.Literals.PREFIX_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPref()
  {
    return pref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPref(String newPref)
  {
    String oldPref = pref;
    pref = newPref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.PREFIX_DEFINITION__PREF, oldPref, pref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FullIRI getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespace(FullIRI newNamespace, NotificationChain msgs)
  {
    FullIRI oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE, oldNamespace, newNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(FullIRI newNamespace)
  {
    if (newNamespace != namespace)
    {
      NotificationChain msgs = null;
      if (namespace != null)
        msgs = ((InternalEObject)namespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE, null, msgs);
      if (newNamespace != null)
        msgs = ((InternalEObject)newNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE, null, msgs);
      msgs = basicSetNamespace(newNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE, newNamespace, newNamespace));
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
      case Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE:
        return basicSetNamespace(null, msgs);
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
      case Owl2fsPackage.PREFIX_DEFINITION__PREF:
        return getPref();
      case Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE:
        return getNamespace();
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
      case Owl2fsPackage.PREFIX_DEFINITION__PREF:
        setPref((String)newValue);
        return;
      case Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE:
        setNamespace((FullIRI)newValue);
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
      case Owl2fsPackage.PREFIX_DEFINITION__PREF:
        setPref(PREF_EDEFAULT);
        return;
      case Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE:
        setNamespace((FullIRI)null);
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
      case Owl2fsPackage.PREFIX_DEFINITION__PREF:
        return PREF_EDEFAULT == null ? pref != null : !PREF_EDEFAULT.equals(pref);
      case Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE:
        return namespace != null;
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
    result.append(" (pref: ");
    result.append(pref);
    result.append(')');
    return result.toString();
  }

} //PrefixDefinitionImpl
