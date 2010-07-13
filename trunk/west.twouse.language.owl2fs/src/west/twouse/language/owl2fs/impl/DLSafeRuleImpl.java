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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.owl2fs.Annotation;
import west.twouse.language.owl2fs.Atom;
import west.twouse.language.owl2fs.DLSafeRule;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DL Safe Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.DLSafeRuleImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DLSafeRuleImpl#getBodyAtom <em>Body Atom</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DLSafeRuleImpl#getHeadAtom <em>Head Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DLSafeRuleImpl extends RuleImpl implements DLSafeRule
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
   * The cached value of the '{@link #getBodyAtom() <em>Body Atom</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyAtom()
   * @generated
   * @ordered
   */
  protected EList<Atom> bodyAtom;

  /**
   * The cached value of the '{@link #getHeadAtom() <em>Head Atom</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadAtom()
   * @generated
   * @ordered
   */
  protected EList<Atom> headAtom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DLSafeRuleImpl()
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
    return Owl2fsPackage.Literals.DL_SAFE_RULE;
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
      annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, Owl2fsPackage.DL_SAFE_RULE__ANNOTATION);
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Atom> getBodyAtom()
  {
    if (bodyAtom == null)
    {
      bodyAtom = new EObjectContainmentEList<Atom>(Atom.class, this, Owl2fsPackage.DL_SAFE_RULE__BODY_ATOM);
    }
    return bodyAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Atom> getHeadAtom()
  {
    if (headAtom == null)
    {
      headAtom = new EObjectContainmentEList<Atom>(Atom.class, this, Owl2fsPackage.DL_SAFE_RULE__HEAD_ATOM);
    }
    return headAtom;
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
      case Owl2fsPackage.DL_SAFE_RULE__ANNOTATION:
        return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.DL_SAFE_RULE__BODY_ATOM:
        return ((InternalEList<?>)getBodyAtom()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.DL_SAFE_RULE__HEAD_ATOM:
        return ((InternalEList<?>)getHeadAtom()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.DL_SAFE_RULE__ANNOTATION:
        return getAnnotation();
      case Owl2fsPackage.DL_SAFE_RULE__BODY_ATOM:
        return getBodyAtom();
      case Owl2fsPackage.DL_SAFE_RULE__HEAD_ATOM:
        return getHeadAtom();
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
      case Owl2fsPackage.DL_SAFE_RULE__ANNOTATION:
        getAnnotation().clear();
        getAnnotation().addAll((Collection<? extends Annotation>)newValue);
        return;
      case Owl2fsPackage.DL_SAFE_RULE__BODY_ATOM:
        getBodyAtom().clear();
        getBodyAtom().addAll((Collection<? extends Atom>)newValue);
        return;
      case Owl2fsPackage.DL_SAFE_RULE__HEAD_ATOM:
        getHeadAtom().clear();
        getHeadAtom().addAll((Collection<? extends Atom>)newValue);
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
      case Owl2fsPackage.DL_SAFE_RULE__ANNOTATION:
        getAnnotation().clear();
        return;
      case Owl2fsPackage.DL_SAFE_RULE__BODY_ATOM:
        getBodyAtom().clear();
        return;
      case Owl2fsPackage.DL_SAFE_RULE__HEAD_ATOM:
        getHeadAtom().clear();
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
      case Owl2fsPackage.DL_SAFE_RULE__ANNOTATION:
        return annotation != null && !annotation.isEmpty();
      case Owl2fsPackage.DL_SAFE_RULE__BODY_ATOM:
        return bodyAtom != null && !bodyAtom.isEmpty();
      case Owl2fsPackage.DL_SAFE_RULE__HEAD_ATOM:
        return headAtom != null && !headAtom.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DLSafeRuleImpl
