/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.QueryImpl#getQueryIRI <em>Query IRI</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.QueryImpl#getAtoms <em>Atoms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends EObjectImpl implements Query {
	/**
   * The cached value of the '{@link #getQueryIRI() <em>Query IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getQueryIRI()
   * @generated
   * @ordered
   */
	protected IRI queryIRI;

	/**
   * The cached value of the '{@link #getAtoms() <em>Atoms</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAtoms()
   * @generated
   * @ordered
   */
	protected EList<Atom> atoms;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected QueryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.QUERY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IRI getQueryIRI() {
    return queryIRI;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetQueryIRI(IRI newQueryIRI, NotificationChain msgs) {
    IRI oldQueryIRI = queryIRI;
    queryIRI = newQueryIRI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.QUERY__QUERY_IRI, oldQueryIRI, newQueryIRI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setQueryIRI(IRI newQueryIRI) {
    if (newQueryIRI != queryIRI)
    {
      NotificationChain msgs = null;
      if (queryIRI != null)
        msgs = ((InternalEObject)queryIRI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.QUERY__QUERY_IRI, null, msgs);
      if (newQueryIRI != null)
        msgs = ((InternalEObject)newQueryIRI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.QUERY__QUERY_IRI, null, msgs);
      msgs = basicSetQueryIRI(newQueryIRI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.QUERY__QUERY_IRI, newQueryIRI, newQueryIRI));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Atom> getAtoms() {
    if (atoms == null)
    {
      atoms = new EObjectContainmentEList<Atom>(Atom.class, this, SPARQLASPackage.QUERY__ATOMS);
    }
    return atoms;
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
      case SPARQLASPackage.QUERY__QUERY_IRI:
        return basicSetQueryIRI(null, msgs);
      case SPARQLASPackage.QUERY__ATOMS:
        return ((InternalEList<?>)getAtoms()).basicRemove(otherEnd, msgs);
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
      case SPARQLASPackage.QUERY__QUERY_IRI:
        return getQueryIRI();
      case SPARQLASPackage.QUERY__ATOMS:
        return getAtoms();
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
      case SPARQLASPackage.QUERY__QUERY_IRI:
        setQueryIRI((IRI)newValue);
        return;
      case SPARQLASPackage.QUERY__ATOMS:
        getAtoms().clear();
        getAtoms().addAll((Collection<? extends Atom>)newValue);
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
      case SPARQLASPackage.QUERY__QUERY_IRI:
        setQueryIRI((IRI)null);
        return;
      case SPARQLASPackage.QUERY__ATOMS:
        getAtoms().clear();
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
      case SPARQLASPackage.QUERY__QUERY_IRI:
        return queryIRI != null;
      case SPARQLASPackage.QUERY__ATOMS:
        return atoms != null && !atoms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QueryImpl
