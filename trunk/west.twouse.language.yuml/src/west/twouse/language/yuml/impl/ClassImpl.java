/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.yuml.Attribute;
import west.twouse.language.yuml.Method;
import west.twouse.language.yuml.YumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.yuml.impl.ClassImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link west.twouse.language.yuml.impl.ClassImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ColorableElementImpl implements west.twouse.language.yuml.Class {
	/**
   * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStereotype()
   * @generated
   * @ordered
   */
	protected static final String STEREOTYPE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStereotype()
   * @generated
   * @ordered
   */
	protected String stereotype = STEREOTYPE_EDEFAULT;

	/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
	protected EList<Attribute> attributes;

	/**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
	protected EList<Method> methods;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ClassImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return YumlPackage.Literals.CLASS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getStereotype() {
    return stereotype;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStereotype(String newStereotype) {
    String oldStereotype = stereotype;
    stereotype = newStereotype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.CLASS__STEREOTYPE, oldStereotype, stereotype));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YumlPackage.CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Attribute> getAttributes() {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, YumlPackage.CLASS__ATTRIBUTES);
    }
    return attributes;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Method> getMethods() {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Method>(Method.class, this, YumlPackage.CLASS__METHODS);
    }
    return methods;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case YumlPackage.CLASS__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case YumlPackage.CLASS__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case YumlPackage.CLASS__STEREOTYPE:
        return getStereotype();
      case YumlPackage.CLASS__NAME:
        return getName();
      case YumlPackage.CLASS__ATTRIBUTES:
        return getAttributes();
      case YumlPackage.CLASS__METHODS:
        return getMethods();
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
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case YumlPackage.CLASS__STEREOTYPE:
        setStereotype((String)newValue);
        return;
      case YumlPackage.CLASS__NAME:
        setName((String)newValue);
        return;
      case YumlPackage.CLASS__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case YumlPackage.CLASS__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
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
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case YumlPackage.CLASS__STEREOTYPE:
        setStereotype(STEREOTYPE_EDEFAULT);
        return;
      case YumlPackage.CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case YumlPackage.CLASS__ATTRIBUTES:
        getAttributes().clear();
        return;
      case YumlPackage.CLASS__METHODS:
        getMethods().clear();
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
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case YumlPackage.CLASS__STEREOTYPE:
        return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
      case YumlPackage.CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case YumlPackage.CLASS__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case YumlPackage.CLASS__METHODS:
        return methods != null && !methods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (stereotype: ");
    result.append(stereotype);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ClassImpl
