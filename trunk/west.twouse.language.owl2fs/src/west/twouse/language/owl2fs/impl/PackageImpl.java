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

import west.twouse.language.owl2fs.Axiom;
import west.twouse.language.owl2fs.Expression;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.PackageImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.PackageImpl#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.PackageImpl#getPackageUri <em>Package Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends TemplateableElementImpl implements west.twouse.language.owl2fs.Package
{
  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> expressions;

  /**
   * The cached value of the '{@link #getAxioms() <em>Axioms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxioms()
   * @generated
   * @ordered
   */
  protected EList<Axiom> axioms;

  /**
   * The default value of the '{@link #getPackageUri() <em>Package Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageUri()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageUri() <em>Package Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageUri()
   * @generated
   * @ordered
   */
  protected String packageUri = PACKAGE_URI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageImpl()
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
    return Owl2fsPackage.Literals.PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<Expression>(Expression.class, this, Owl2fsPackage.PACKAGE__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Axiom> getAxioms()
  {
    if (axioms == null)
    {
      axioms = new EObjectContainmentEList<Axiom>(Axiom.class, this, Owl2fsPackage.PACKAGE__AXIOMS);
    }
    return axioms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageUri()
  {
    return packageUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageUri(String newPackageUri)
  {
    String oldPackageUri = packageUri;
    packageUri = newPackageUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.PACKAGE__PACKAGE_URI, oldPackageUri, packageUri));
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
      case Owl2fsPackage.PACKAGE__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.PACKAGE__AXIOMS:
        return ((InternalEList<?>)getAxioms()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.PACKAGE__EXPRESSIONS:
        return getExpressions();
      case Owl2fsPackage.PACKAGE__AXIOMS:
        return getAxioms();
      case Owl2fsPackage.PACKAGE__PACKAGE_URI:
        return getPackageUri();
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
      case Owl2fsPackage.PACKAGE__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case Owl2fsPackage.PACKAGE__AXIOMS:
        getAxioms().clear();
        getAxioms().addAll((Collection<? extends Axiom>)newValue);
        return;
      case Owl2fsPackage.PACKAGE__PACKAGE_URI:
        setPackageUri((String)newValue);
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
      case Owl2fsPackage.PACKAGE__EXPRESSIONS:
        getExpressions().clear();
        return;
      case Owl2fsPackage.PACKAGE__AXIOMS:
        getAxioms().clear();
        return;
      case Owl2fsPackage.PACKAGE__PACKAGE_URI:
        setPackageUri(PACKAGE_URI_EDEFAULT);
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
      case Owl2fsPackage.PACKAGE__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
      case Owl2fsPackage.PACKAGE__AXIOMS:
        return axioms != null && !axioms.isEmpty();
      case Owl2fsPackage.PACKAGE__PACKAGE_URI:
        return PACKAGE_URI_EDEFAULT == null ? packageUri != null : !PACKAGE_URI_EDEFAULT.equals(packageUri);
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
    result.append(" (PackageUri: ");
    result.append(packageUri);
    result.append(')');
    return result.toString();
  }

} //PackageImpl
