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

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import west.twouse.language.owl2fs.Annotation;
import west.twouse.language.owl2fs.Axiom;
import west.twouse.language.owl2fs.Comment;
import west.twouse.language.owl2fs.Expression;
import west.twouse.language.owl2fs.IRI;
import west.twouse.language.owl2fs.Ontology;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.OntologyImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.OntologyImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.OntologyImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.OntologyImpl#getOntologyIRI <em>Ontology IRI</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.OntologyImpl#getVersionIRI <em>Version IRI</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.OntologyImpl#getDirectlyImportsDocuments <em>Directly Imports Documents</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.OntologyImpl#getOntologyAnnotations <em>Ontology Annotations</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.OntologyImpl#getAxioms <em>Axioms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyImpl extends EObjectImpl implements Ontology
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
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<west.twouse.language.owl2fs.Package> packages;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected EList<Comment> comment;

  /**
   * The cached value of the '{@link #getOntologyIRI() <em>Ontology IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntologyIRI()
   * @generated
   * @ordered
   */
  protected IRI ontologyIRI;

  /**
   * The cached value of the '{@link #getVersionIRI() <em>Version IRI</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionIRI()
   * @generated
   * @ordered
   */
  protected IRI versionIRI;

  /**
   * The cached value of the '{@link #getDirectlyImportsDocuments() <em>Directly Imports Documents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectlyImportsDocuments()
   * @generated
   * @ordered
   */
  protected EList<IRI> directlyImportsDocuments;

  /**
   * The cached value of the '{@link #getOntologyAnnotations() <em>Ontology Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntologyAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> ontologyAnnotations;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OntologyImpl()
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
    return Owl2fsPackage.Literals.ONTOLOGY;
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
      expressions = new EObjectContainmentEList<Expression>(Expression.class, this, Owl2fsPackage.ONTOLOGY__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<west.twouse.language.owl2fs.Package> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<west.twouse.language.owl2fs.Package>(west.twouse.language.owl2fs.Package.class, this, Owl2fsPackage.ONTOLOGY__PACKAGES);
    }
    return packages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comment> getComment()
  {
    if (comment == null)
    {
      comment = new EObjectContainmentEList<Comment>(Comment.class, this, Owl2fsPackage.ONTOLOGY__COMMENT);
    }
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getOntologyIRI()
  {
    return ontologyIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOntologyIRI(IRI newOntologyIRI, NotificationChain msgs)
  {
    IRI oldOntologyIRI = ontologyIRI;
    ontologyIRI = newOntologyIRI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI, oldOntologyIRI, newOntologyIRI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOntologyIRI(IRI newOntologyIRI)
  {
    if (newOntologyIRI != ontologyIRI)
    {
      NotificationChain msgs = null;
      if (ontologyIRI != null)
        msgs = ((InternalEObject)ontologyIRI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI, null, msgs);
      if (newOntologyIRI != null)
        msgs = ((InternalEObject)newOntologyIRI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI, null, msgs);
      msgs = basicSetOntologyIRI(newOntologyIRI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI, newOntologyIRI, newOntologyIRI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getVersionIRI()
  {
    return versionIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersionIRI(IRI newVersionIRI, NotificationChain msgs)
  {
    IRI oldVersionIRI = versionIRI;
    versionIRI = newVersionIRI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ONTOLOGY__VERSION_IRI, oldVersionIRI, newVersionIRI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersionIRI(IRI newVersionIRI)
  {
    if (newVersionIRI != versionIRI)
    {
      NotificationChain msgs = null;
      if (versionIRI != null)
        msgs = ((InternalEObject)versionIRI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ONTOLOGY__VERSION_IRI, null, msgs);
      if (newVersionIRI != null)
        msgs = ((InternalEObject)newVersionIRI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ONTOLOGY__VERSION_IRI, null, msgs);
      msgs = basicSetVersionIRI(newVersionIRI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ONTOLOGY__VERSION_IRI, newVersionIRI, newVersionIRI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IRI> getDirectlyImportsDocuments()
  {
    if (directlyImportsDocuments == null)
    {
      directlyImportsDocuments = new EObjectContainmentEList<IRI>(IRI.class, this, Owl2fsPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS);
    }
    return directlyImportsDocuments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getOntologyAnnotations()
  {
    if (ontologyAnnotations == null)
    {
      ontologyAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS);
    }
    return ontologyAnnotations;
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
      axioms = new EObjectContainmentEList<Axiom>(Axiom.class, this, Owl2fsPackage.ONTOLOGY__AXIOMS);
    }
    return axioms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean versionURIrequiresontologyURItobespecified(DiagnosticChain diagnostics)
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
      case Owl2fsPackage.ONTOLOGY__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.ONTOLOGY__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.ONTOLOGY__COMMENT:
        return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI:
        return basicSetOntologyIRI(null, msgs);
      case Owl2fsPackage.ONTOLOGY__VERSION_IRI:
        return basicSetVersionIRI(null, msgs);
      case Owl2fsPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS:
        return ((InternalEList<?>)getDirectlyImportsDocuments()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        return ((InternalEList<?>)getOntologyAnnotations()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.ONTOLOGY__AXIOMS:
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
      case Owl2fsPackage.ONTOLOGY__EXPRESSIONS:
        return getExpressions();
      case Owl2fsPackage.ONTOLOGY__PACKAGES:
        return getPackages();
      case Owl2fsPackage.ONTOLOGY__COMMENT:
        return getComment();
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI:
        return getOntologyIRI();
      case Owl2fsPackage.ONTOLOGY__VERSION_IRI:
        return getVersionIRI();
      case Owl2fsPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS:
        return getDirectlyImportsDocuments();
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        return getOntologyAnnotations();
      case Owl2fsPackage.ONTOLOGY__AXIOMS:
        return getAxioms();
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
      case Owl2fsPackage.ONTOLOGY__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends west.twouse.language.owl2fs.Package>)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__COMMENT:
        getComment().clear();
        getComment().addAll((Collection<? extends Comment>)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI:
        setOntologyIRI((IRI)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__VERSION_IRI:
        setVersionIRI((IRI)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS:
        getDirectlyImportsDocuments().clear();
        getDirectlyImportsDocuments().addAll((Collection<? extends IRI>)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        getOntologyAnnotations().clear();
        getOntologyAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__AXIOMS:
        getAxioms().clear();
        getAxioms().addAll((Collection<? extends Axiom>)newValue);
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
      case Owl2fsPackage.ONTOLOGY__EXPRESSIONS:
        getExpressions().clear();
        return;
      case Owl2fsPackage.ONTOLOGY__PACKAGES:
        getPackages().clear();
        return;
      case Owl2fsPackage.ONTOLOGY__COMMENT:
        getComment().clear();
        return;
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI:
        setOntologyIRI((IRI)null);
        return;
      case Owl2fsPackage.ONTOLOGY__VERSION_IRI:
        setVersionIRI((IRI)null);
        return;
      case Owl2fsPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS:
        getDirectlyImportsDocuments().clear();
        return;
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        getOntologyAnnotations().clear();
        return;
      case Owl2fsPackage.ONTOLOGY__AXIOMS:
        getAxioms().clear();
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
      case Owl2fsPackage.ONTOLOGY__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
      case Owl2fsPackage.ONTOLOGY__PACKAGES:
        return packages != null && !packages.isEmpty();
      case Owl2fsPackage.ONTOLOGY__COMMENT:
        return comment != null && !comment.isEmpty();
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI:
        return ontologyIRI != null;
      case Owl2fsPackage.ONTOLOGY__VERSION_IRI:
        return versionIRI != null;
      case Owl2fsPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS:
        return directlyImportsDocuments != null && !directlyImportsDocuments.isEmpty();
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        return ontologyAnnotations != null && !ontologyAnnotations.isEmpty();
      case Owl2fsPackage.ONTOLOGY__AXIOMS:
        return axioms != null && !axioms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OntologyImpl
