/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Expression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl#getOntologyAnnotations <em>Ontology Annotations</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl#getImportedOntologies <em>Imported Ontologies</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl#getOntologyURI <em>Ontology URI</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl#getVersionURI <em>Version URI</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyImpl extends EObjectImpl implements Ontology
{
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
   * The cached value of the '{@link #getImportedOntologies() <em>Imported Ontologies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedOntologies()
   * @generated
   * @ordered
   */
  protected EList<Ontology> importedOntologies;

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
   * The default value of the '{@link #getOntologyURI() <em>Ontology URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntologyURI()
   * @generated
   * @ordered
   */
  protected static final String ONTOLOGY_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOntologyURI() <em>Ontology URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntologyURI()
   * @generated
   * @ordered
   */
  protected String ontologyURI = ONTOLOGY_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getVersionURI() <em>Version URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionURI()
   * @generated
   * @ordered
   */
  protected static final String VERSION_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersionURI() <em>Version URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionURI()
   * @generated
   * @ordered
   */
  protected String versionURI = VERSION_URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<de.uniko.isweb.emftext.owl2fs.owl2fs.Package> packages;

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
  public EList<Ontology> getImportedOntologies()
  {
    if (importedOntologies == null)
    {
      importedOntologies = new EObjectContainmentEList<Ontology>(Ontology.class, this, Owl2fsPackage.ONTOLOGY__IMPORTED_ONTOLOGIES);
    }
    return importedOntologies;
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
  public String getOntologyURI()
  {
    return ontologyURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOntologyURI(String newOntologyURI)
  {
    String oldOntologyURI = ontologyURI;
    ontologyURI = newOntologyURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI, oldOntologyURI, ontologyURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersionURI()
  {
    return versionURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersionURI(String newVersionURI)
  {
    String oldVersionURI = versionURI;
    versionURI = newVersionURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ONTOLOGY__VERSION_URI, oldVersionURI, versionURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<de.uniko.isweb.emftext.owl2fs.owl2fs.Package> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<de.uniko.isweb.emftext.owl2fs.owl2fs.Package>(de.uniko.isweb.emftext.owl2fs.owl2fs.Package.class, this, Owl2fsPackage.ONTOLOGY__PACKAGES);
    }
    return packages;
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
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        return ((InternalEList<?>)getOntologyAnnotations()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.ONTOLOGY__AXIOMS:
        return ((InternalEList<?>)getAxioms()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.ONTOLOGY__IMPORTED_ONTOLOGIES:
        return ((InternalEList<?>)getImportedOntologies()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.ONTOLOGY__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.ONTOLOGY__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        return getOntologyAnnotations();
      case Owl2fsPackage.ONTOLOGY__AXIOMS:
        return getAxioms();
      case Owl2fsPackage.ONTOLOGY__IMPORTED_ONTOLOGIES:
        return getImportedOntologies();
      case Owl2fsPackage.ONTOLOGY__EXPRESSIONS:
        return getExpressions();
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI:
        return getOntologyURI();
      case Owl2fsPackage.ONTOLOGY__VERSION_URI:
        return getVersionURI();
      case Owl2fsPackage.ONTOLOGY__PACKAGES:
        return getPackages();
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
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        getOntologyAnnotations().clear();
        getOntologyAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__AXIOMS:
        getAxioms().clear();
        getAxioms().addAll((Collection<? extends Axiom>)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__IMPORTED_ONTOLOGIES:
        getImportedOntologies().clear();
        getImportedOntologies().addAll((Collection<? extends Ontology>)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI:
        setOntologyURI((String)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__VERSION_URI:
        setVersionURI((String)newValue);
        return;
      case Owl2fsPackage.ONTOLOGY__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends de.uniko.isweb.emftext.owl2fs.owl2fs.Package>)newValue);
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
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        getOntologyAnnotations().clear();
        return;
      case Owl2fsPackage.ONTOLOGY__AXIOMS:
        getAxioms().clear();
        return;
      case Owl2fsPackage.ONTOLOGY__IMPORTED_ONTOLOGIES:
        getImportedOntologies().clear();
        return;
      case Owl2fsPackage.ONTOLOGY__EXPRESSIONS:
        getExpressions().clear();
        return;
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI:
        setOntologyURI(ONTOLOGY_URI_EDEFAULT);
        return;
      case Owl2fsPackage.ONTOLOGY__VERSION_URI:
        setVersionURI(VERSION_URI_EDEFAULT);
        return;
      case Owl2fsPackage.ONTOLOGY__PACKAGES:
        getPackages().clear();
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
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        return ontologyAnnotations != null && !ontologyAnnotations.isEmpty();
      case Owl2fsPackage.ONTOLOGY__AXIOMS:
        return axioms != null && !axioms.isEmpty();
      case Owl2fsPackage.ONTOLOGY__IMPORTED_ONTOLOGIES:
        return importedOntologies != null && !importedOntologies.isEmpty();
      case Owl2fsPackage.ONTOLOGY__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
      case Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI:
        return ONTOLOGY_URI_EDEFAULT == null ? ontologyURI != null : !ONTOLOGY_URI_EDEFAULT.equals(ontologyURI);
      case Owl2fsPackage.ONTOLOGY__VERSION_URI:
        return VERSION_URI_EDEFAULT == null ? versionURI != null : !VERSION_URI_EDEFAULT.equals(versionURI);
      case Owl2fsPackage.ONTOLOGY__PACKAGES:
        return packages != null && !packages.isEmpty();
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
    result.append(" (ontologyURI: ");
    result.append(ontologyURI);
    result.append(", versionURI: ");
    result.append(versionURI);
    result.append(')');
    return result.toString();
  }

} //OntologyImpl
