/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition;
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
 * An implementation of the model object '<em><b>Ontology Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.OntologyDocumentImpl#getPrefixDefinition <em>Prefix Definition</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.OntologyDocumentImpl#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyDocumentImpl extends EObjectImpl implements OntologyDocument {
	/**
   * The cached value of the '{@link #getPrefixDefinition() <em>Prefix Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPrefixDefinition()
   * @generated
   * @ordered
   */
	protected EList<PrefixDefinition> prefixDefinition;

	/**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
	protected Query query;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected OntologyDocumentImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.ONTOLOGY_DOCUMENT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PrefixDefinition> getPrefixDefinition() {
    if (prefixDefinition == null)
    {
      prefixDefinition = new EObjectContainmentEList<PrefixDefinition>(PrefixDefinition.class, this, SPARQLASPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION);
    }
    return prefixDefinition;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Query getQuery() {
    return query;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs) {
    Query oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY, oldQuery, newQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setQuery(Query newQuery) {
    if (newQuery != query)
    {
      NotificationChain msgs = null;
      if (query != null)
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY, newQuery, newQuery));
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
      case SPARQLASPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION:
        return ((InternalEList<?>)getPrefixDefinition()).basicRemove(otherEnd, msgs);
      case SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY:
        return basicSetQuery(null, msgs);
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
      case SPARQLASPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION:
        return getPrefixDefinition();
      case SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY:
        return getQuery();
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
      case SPARQLASPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION:
        getPrefixDefinition().clear();
        getPrefixDefinition().addAll((Collection<? extends PrefixDefinition>)newValue);
        return;
      case SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY:
        setQuery((Query)newValue);
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
      case SPARQLASPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION:
        getPrefixDefinition().clear();
        return;
      case SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY:
        setQuery((Query)null);
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
      case SPARQLASPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION:
        return prefixDefinition != null && !prefixDefinition.isEmpty();
      case SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY:
        return query != null;
    }
    return super.eIsSet(featureID);
  }

} //OntologyDocumentImpl
