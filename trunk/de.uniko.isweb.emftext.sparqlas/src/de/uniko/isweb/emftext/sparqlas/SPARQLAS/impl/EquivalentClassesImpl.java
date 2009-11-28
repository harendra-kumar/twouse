/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalent Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.EquivalentClassesImpl#getClassExpressions <em>Class Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentClassesImpl extends ClassAtomImpl implements EquivalentClasses {
	/**
   * The cached value of the '{@link #getClassExpressions() <em>Class Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getClassExpressions()
   * @generated
   * @ordered
   */
	protected EList<ClassExpression> classExpressions;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EquivalentClassesImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.EQUIVALENT_CLASSES;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ClassExpression> getClassExpressions() {
    if (classExpressions == null)
    {
      classExpressions = new EObjectContainmentEList<ClassExpression>(ClassExpression.class, this, SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS);
    }
    return classExpressions;
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
      case SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS:
        return ((InternalEList<?>)getClassExpressions()).basicRemove(otherEnd, msgs);
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
      case SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS:
        return getClassExpressions();
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
      case SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS:
        getClassExpressions().clear();
        getClassExpressions().addAll((Collection<? extends ClassExpression>)newValue);
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
      case SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS:
        getClassExpressions().clear();
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
      case SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS:
        return classExpressions != null && !classExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EquivalentClassesImpl
