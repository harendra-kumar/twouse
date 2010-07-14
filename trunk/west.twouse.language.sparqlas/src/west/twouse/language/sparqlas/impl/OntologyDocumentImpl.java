/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.impl;

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

import west.twouse.language.sparqlas.IRI;
import west.twouse.language.sparqlas.Import;
import west.twouse.language.sparqlas.OntologyDocument;
import west.twouse.language.sparqlas.PrefixDefinition;
import west.twouse.language.sparqlas.Query;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.OntologyDocumentImpl#getQueryIRI <em>Query IRI</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.OntologyDocumentImpl#getImport <em>Import</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.OntologyDocumentImpl#getPrefixDefinition <em>Prefix Definition</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.OntologyDocumentImpl#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyDocumentImpl extends EObjectImpl implements OntologyDocument
{
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
   * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImport()
   * @generated
   * @ordered
   */
  protected EList<Import> import_;

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
  protected OntologyDocumentImpl()
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
    return SparqlasPackage.Literals.ONTOLOGY_DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getQueryIRI()
  {
    return queryIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQueryIRI(IRI newQueryIRI, NotificationChain msgs)
  {
    IRI oldQueryIRI = queryIRI;
    queryIRI = newQueryIRI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI, oldQueryIRI, newQueryIRI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQueryIRI(IRI newQueryIRI)
  {
    if (newQueryIRI != queryIRI)
    {
      NotificationChain msgs = null;
      if (queryIRI != null)
        msgs = ((InternalEObject)queryIRI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI, null, msgs);
      if (newQueryIRI != null)
        msgs = ((InternalEObject)newQueryIRI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI, null, msgs);
      msgs = basicSetQueryIRI(newQueryIRI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI, newQueryIRI, newQueryIRI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImport()
  {
    if (import_ == null)
    {
      import_ = new EObjectContainmentEList<Import>(Import.class, this, SparqlasPackage.ONTOLOGY_DOCUMENT__IMPORT);
    }
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PrefixDefinition> getPrefixDefinition()
  {
    if (prefixDefinition == null)
    {
      prefixDefinition = new EObjectContainmentEList<PrefixDefinition>(PrefixDefinition.class, this, SparqlasPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION);
    }
    return prefixDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs)
  {
    Query oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY, oldQuery, newQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(Query newQuery)
  {
    if (newQuery != query)
    {
      NotificationChain msgs = null;
      if (query != null)
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY, newQuery, newQuery));
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
      case SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI:
        return basicSetQueryIRI(null, msgs);
      case SparqlasPackage.ONTOLOGY_DOCUMENT__IMPORT:
        return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
      case SparqlasPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION:
        return ((InternalEList<?>)getPrefixDefinition()).basicRemove(otherEnd, msgs);
      case SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI:
        return getQueryIRI();
      case SparqlasPackage.ONTOLOGY_DOCUMENT__IMPORT:
        return getImport();
      case SparqlasPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION:
        return getPrefixDefinition();
      case SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI:
        setQueryIRI((IRI)newValue);
        return;
      case SparqlasPackage.ONTOLOGY_DOCUMENT__IMPORT:
        getImport().clear();
        getImport().addAll((Collection<? extends Import>)newValue);
        return;
      case SparqlasPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION:
        getPrefixDefinition().clear();
        getPrefixDefinition().addAll((Collection<? extends PrefixDefinition>)newValue);
        return;
      case SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY:
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI:
        setQueryIRI((IRI)null);
        return;
      case SparqlasPackage.ONTOLOGY_DOCUMENT__IMPORT:
        getImport().clear();
        return;
      case SparqlasPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION:
        getPrefixDefinition().clear();
        return;
      case SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI:
        return queryIRI != null;
      case SparqlasPackage.ONTOLOGY_DOCUMENT__IMPORT:
        return import_ != null && !import_.isEmpty();
      case SparqlasPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION:
        return prefixDefinition != null && !prefixDefinition.isEmpty();
      case SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY:
        return query != null;
    }
    return super.eIsSet(featureID);
  }

} //OntologyDocumentImpl
