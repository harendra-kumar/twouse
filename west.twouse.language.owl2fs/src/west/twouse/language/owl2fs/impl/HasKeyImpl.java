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
import west.twouse.language.owl2fs.ClassExpression;
import west.twouse.language.owl2fs.DataPropertyExpression;
import west.twouse.language.owl2fs.HasKey;
import west.twouse.language.owl2fs.ObjectPropertyExpression;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.HasKeyImpl#getAxiomAnnotations <em>Axiom Annotations</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.HasKeyImpl#getClassExpression <em>Class Expression</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.HasKeyImpl#getObjectPropertyExpressions <em>Object Property Expressions</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.HasKeyImpl#getDataPropertyExpressions <em>Data Property Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasKeyImpl extends AxiomImpl implements HasKey
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
   * The cached value of the '{@link #getClassExpression() <em>Class Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassExpression()
   * @generated
   * @ordered
   */
  protected ClassExpression classExpression;

  /**
   * The cached value of the '{@link #getObjectPropertyExpressions() <em>Object Property Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectPropertyExpressions()
   * @generated
   * @ordered
   */
  protected EList<ObjectPropertyExpression> objectPropertyExpressions;

  /**
   * The cached value of the '{@link #getDataPropertyExpressions() <em>Data Property Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataPropertyExpressions()
   * @generated
   * @ordered
   */
  protected EList<DataPropertyExpression> dataPropertyExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HasKeyImpl()
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
    return Owl2fsPackage.Literals.HAS_KEY;
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
      axiomAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, Owl2fsPackage.HAS_KEY__AXIOM_ANNOTATIONS);
    }
    return axiomAnnotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassExpression getClassExpression()
  {
    return classExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassExpression(ClassExpression newClassExpression, NotificationChain msgs)
  {
    ClassExpression oldClassExpression = classExpression;
    classExpression = newClassExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION, oldClassExpression, newClassExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassExpression(ClassExpression newClassExpression)
  {
    if (newClassExpression != classExpression)
    {
      NotificationChain msgs = null;
      if (classExpression != null)
        msgs = ((InternalEObject)classExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION, null, msgs);
      if (newClassExpression != null)
        msgs = ((InternalEObject)newClassExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION, null, msgs);
      msgs = basicSetClassExpression(newClassExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION, newClassExpression, newClassExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ObjectPropertyExpression> getObjectPropertyExpressions()
  {
    if (objectPropertyExpressions == null)
    {
      objectPropertyExpressions = new EObjectContainmentEList<ObjectPropertyExpression>(ObjectPropertyExpression.class, this, Owl2fsPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS);
    }
    return objectPropertyExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataPropertyExpression> getDataPropertyExpressions()
  {
    if (dataPropertyExpressions == null)
    {
      dataPropertyExpressions = new EObjectContainmentEList<DataPropertyExpression>(DataPropertyExpression.class, this, Owl2fsPackage.HAS_KEY__DATA_PROPERTY_EXPRESSIONS);
    }
    return dataPropertyExpressions;
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
      case Owl2fsPackage.HAS_KEY__AXIOM_ANNOTATIONS:
        return ((InternalEList<?>)getAxiomAnnotations()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION:
        return basicSetClassExpression(null, msgs);
      case Owl2fsPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS:
        return ((InternalEList<?>)getObjectPropertyExpressions()).basicRemove(otherEnd, msgs);
      case Owl2fsPackage.HAS_KEY__DATA_PROPERTY_EXPRESSIONS:
        return ((InternalEList<?>)getDataPropertyExpressions()).basicRemove(otherEnd, msgs);
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
      case Owl2fsPackage.HAS_KEY__AXIOM_ANNOTATIONS:
        return getAxiomAnnotations();
      case Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION:
        return getClassExpression();
      case Owl2fsPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS:
        return getObjectPropertyExpressions();
      case Owl2fsPackage.HAS_KEY__DATA_PROPERTY_EXPRESSIONS:
        return getDataPropertyExpressions();
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
      case Owl2fsPackage.HAS_KEY__AXIOM_ANNOTATIONS:
        getAxiomAnnotations().clear();
        getAxiomAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)newValue);
        return;
      case Owl2fsPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS:
        getObjectPropertyExpressions().clear();
        getObjectPropertyExpressions().addAll((Collection<? extends ObjectPropertyExpression>)newValue);
        return;
      case Owl2fsPackage.HAS_KEY__DATA_PROPERTY_EXPRESSIONS:
        getDataPropertyExpressions().clear();
        getDataPropertyExpressions().addAll((Collection<? extends DataPropertyExpression>)newValue);
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
      case Owl2fsPackage.HAS_KEY__AXIOM_ANNOTATIONS:
        getAxiomAnnotations().clear();
        return;
      case Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION:
        setClassExpression((ClassExpression)null);
        return;
      case Owl2fsPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS:
        getObjectPropertyExpressions().clear();
        return;
      case Owl2fsPackage.HAS_KEY__DATA_PROPERTY_EXPRESSIONS:
        getDataPropertyExpressions().clear();
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
      case Owl2fsPackage.HAS_KEY__AXIOM_ANNOTATIONS:
        return axiomAnnotations != null && !axiomAnnotations.isEmpty();
      case Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION:
        return classExpression != null;
      case Owl2fsPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS:
        return objectPropertyExpressions != null && !objectPropertyExpressions.isEmpty();
      case Owl2fsPackage.HAS_KEY__DATA_PROPERTY_EXPRESSIONS:
        return dataPropertyExpressions != null && !dataPropertyExpressions.isEmpty();
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
        case Owl2fsPackage.HAS_KEY__AXIOM_ANNOTATIONS: return Owl2fsPackage.ANNOTATION_AXIOM__AXIOM_ANNOTATIONS;
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
        case Owl2fsPackage.ANNOTATION_AXIOM__AXIOM_ANNOTATIONS: return Owl2fsPackage.HAS_KEY__AXIOM_ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //HasKeyImpl
