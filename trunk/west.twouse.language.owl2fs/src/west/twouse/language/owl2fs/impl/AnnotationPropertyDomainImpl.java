/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import west.twouse.language.owl2fs.AnnotationProperty;
import west.twouse.language.owl2fs.AnnotationPropertyDomain;
import west.twouse.language.owl2fs.IRI;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Property Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.AnnotationPropertyDomainImpl#getAnnotationProperty <em>Annotation Property</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.AnnotationPropertyDomainImpl#getIri <em>Iri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationPropertyDomainImpl extends AnnotationAxiomImpl implements AnnotationPropertyDomain
{
  /**
   * The cached value of the '{@link #getAnnotationProperty() <em>Annotation Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationProperty()
   * @generated
   * @ordered
   */
  protected AnnotationProperty annotationProperty;

  /**
   * The cached value of the '{@link #getIri() <em>Iri</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIri()
   * @generated
   * @ordered
   */
  protected IRI iri;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationPropertyDomainImpl()
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
    return Owl2fsPackage.Literals.ANNOTATION_PROPERTY_DOMAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationProperty getAnnotationProperty()
  {
    return annotationProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationProperty(AnnotationProperty newAnnotationProperty, NotificationChain msgs)
  {
    AnnotationProperty oldAnnotationProperty = annotationProperty;
    annotationProperty = newAnnotationProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY, oldAnnotationProperty, newAnnotationProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationProperty(AnnotationProperty newAnnotationProperty)
  {
    if (newAnnotationProperty != annotationProperty)
    {
      NotificationChain msgs = null;
      if (annotationProperty != null)
        msgs = ((InternalEObject)annotationProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY, null, msgs);
      if (newAnnotationProperty != null)
        msgs = ((InternalEObject)newAnnotationProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY, null, msgs);
      msgs = basicSetAnnotationProperty(newAnnotationProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY, newAnnotationProperty, newAnnotationProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IRI getIri()
  {
    return iri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIri(IRI newIri, NotificationChain msgs)
  {
    IRI oldIri = iri;
    iri = newIri;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI, oldIri, newIri);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIri(IRI newIri)
  {
    if (newIri != iri)
    {
      NotificationChain msgs = null;
      if (iri != null)
        msgs = ((InternalEObject)iri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI, null, msgs);
      if (newIri != null)
        msgs = ((InternalEObject)newIri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI, null, msgs);
      msgs = basicSetIri(newIri, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI, newIri, newIri));
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
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY:
        return basicSetAnnotationProperty(null, msgs);
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI:
        return basicSetIri(null, msgs);
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
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY:
        return getAnnotationProperty();
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI:
        return getIri();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY:
        setAnnotationProperty((AnnotationProperty)newValue);
        return;
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI:
        setIri((IRI)newValue);
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
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY:
        setAnnotationProperty((AnnotationProperty)null);
        return;
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI:
        setIri((IRI)null);
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
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY:
        return annotationProperty != null;
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI:
        return iri != null;
    }
    return super.eIsSet(featureID);
  }

} //AnnotationPropertyDomainImpl
