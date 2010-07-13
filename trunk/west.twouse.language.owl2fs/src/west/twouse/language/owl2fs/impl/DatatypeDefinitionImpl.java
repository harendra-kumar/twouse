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

import west.twouse.language.owl2fs.Annotation;
import west.twouse.language.owl2fs.AnnotationAxiom;
import west.twouse.language.owl2fs.DataRange;
import west.twouse.language.owl2fs.Datatype;
import west.twouse.language.owl2fs.DatatypeDefinition;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.DatatypeDefinitionImpl#getAxiomAnnotations <em>Axiom Annotations</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DatatypeDefinitionImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.DatatypeDefinitionImpl#getDataRange <em>Data Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionImpl extends AxiomImpl implements DatatypeDefinition
{
  /**
   * The cached value of the '{@link #getAxiomAnnotations() <em>Axiom Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxiomAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> axiomAnnotations;

  /**
   * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected Datatype datatype;

  /**
   * The cached value of the '{@link #getDataRange() <em>Data Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataRange()
   * @generated
   * @ordered
   */
  protected DataRange dataRange;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatatypeDefinitionImpl()
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
    return Owl2fsPackage.Literals.DATATYPE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAxiomAnnotations()
  {
    if (axiomAnnotations == null)
    {
      axiomAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, Owl2fsPackage.DATATYPE_DEFINITION__AXIOM_ANNOTATIONS);
    }
    return axiomAnnotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype getDatatype()
  {
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatatype(Datatype newDatatype, NotificationChain msgs)
  {
    Datatype oldDatatype = datatype;
    datatype = newDatatype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE, oldDatatype, newDatatype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatatype(Datatype newDatatype)
  {
    if (newDatatype != datatype)
    {
      NotificationChain msgs = null;
      if (datatype != null)
        msgs = ((InternalEObject)datatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE, null, msgs);
      if (newDatatype != null)
        msgs = ((InternalEObject)newDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE, null, msgs);
      msgs = basicSetDatatype(newDatatype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE, newDatatype, newDatatype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataRange getDataRange()
  {
    return dataRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataRange(DataRange newDataRange, NotificationChain msgs)
  {
    DataRange oldDataRange = dataRange;
    dataRange = newDataRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE, oldDataRange, newDataRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataRange(DataRange newDataRange)
  {
    if (newDataRange != dataRange)
    {
      NotificationChain msgs = null;
      if (dataRange != null)
        msgs = ((InternalEObject)dataRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE, null, msgs);
      if (newDataRange != null)
        msgs = ((InternalEObject)newDataRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE, null, msgs);
      msgs = basicSetDataRange(newDataRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE, newDataRange, newDataRange));
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
      case Owl2fsPackage.DATATYPE_DEFINITION__AXIOM_ANNOTATIONS:
        return ((InternalEList<?>)getAxiomAnnotations()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE:
        return basicSetDatatype(null, msgs);
      case Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE:
        return basicSetDataRange(null, msgs);
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
      case Owl2fsPackage.DATATYPE_DEFINITION__AXIOM_ANNOTATIONS:
        return getAxiomAnnotations();
      case Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE:
        return getDatatype();
      case Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE:
        return getDataRange();
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
      case Owl2fsPackage.DATATYPE_DEFINITION__AXIOM_ANNOTATIONS:
        getAxiomAnnotations().clear();
        getAxiomAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE:
        setDatatype((Datatype)newValue);
        return;
      case Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE:
        setDataRange((DataRange)newValue);
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
      case Owl2fsPackage.DATATYPE_DEFINITION__AXIOM_ANNOTATIONS:
        getAxiomAnnotations().clear();
        return;
      case Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE:
        setDatatype((Datatype)null);
        return;
      case Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE:
        setDataRange((DataRange)null);
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
      case Owl2fsPackage.DATATYPE_DEFINITION__AXIOM_ANNOTATIONS:
        return axiomAnnotations != null && !axiomAnnotations.isEmpty();
      case Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE:
        return datatype != null;
      case Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE:
        return dataRange != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == AnnotationAxiom.class)
    {
      switch (derivedFeatureID)
      {
        case Owl2fsPackage.DATATYPE_DEFINITION__AXIOM_ANNOTATIONS: return Owl2fsPackage.ANNOTATION_AXIOM__AXIOM_ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == AnnotationAxiom.class)
    {
      switch (baseFeatureID)
      {
        case Owl2fsPackage.ANNOTATION_AXIOM__AXIOM_ANNOTATIONS: return Owl2fsPackage.DATATYPE_DEFINITION__AXIOM_ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //DatatypeDefinitionImpl
