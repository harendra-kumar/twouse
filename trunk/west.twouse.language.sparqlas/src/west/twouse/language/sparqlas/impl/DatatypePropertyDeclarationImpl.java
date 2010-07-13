/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import west.twouse.language.sparqlas.DataProperty;
import west.twouse.language.sparqlas.DataPropertyVariable;
import west.twouse.language.sparqlas.DatatypePropertyDeclaration;
import west.twouse.language.sparqlas.SparqlmsPackage;
import west.twouse.language.sparqlas.SparqlasPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.impl.DatatypePropertyDeclarationImpl#getDatatypeProperty <em>Datatype Property</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.impl.DatatypePropertyDeclarationImpl#getDatatypePropertyVariable <em>Datatype Property Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypePropertyDeclarationImpl extends DeclarationImpl implements DatatypePropertyDeclaration
{
  /**
   * The cached value of the '{@link #getDatatypeProperty() <em>Datatype Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatypeProperty()
   * @generated
   * @ordered
   */
  protected DataProperty datatypeProperty;

  /**
   * The cached value of the '{@link #getDatatypePropertyVariable() <em>Datatype Property Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatypePropertyVariable()
   * @generated
   * @ordered
   */
  protected DataPropertyVariable datatypePropertyVariable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatatypePropertyDeclarationImpl()
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
    return SparqlasPackage.Literals.DATATYPE_PROPERTY_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataProperty getDatatypeProperty()
  {
    return datatypeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatatypeProperty(DataProperty newDatatypeProperty, NotificationChain msgs)
  {
    DataProperty oldDatatypeProperty = datatypeProperty;
    datatypeProperty = newDatatypeProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY, oldDatatypeProperty, newDatatypeProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatatypeProperty(DataProperty newDatatypeProperty)
  {
    if (newDatatypeProperty != datatypeProperty)
    {
      NotificationChain msgs = null;
      if (datatypeProperty != null)
        msgs = ((InternalEObject)datatypeProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY, null, msgs);
      if (newDatatypeProperty != null)
        msgs = ((InternalEObject)newDatatypeProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY, null, msgs);
      msgs = basicSetDatatypeProperty(newDatatypeProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY, newDatatypeProperty, newDatatypeProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyVariable getDatatypePropertyVariable()
  {
    return datatypePropertyVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatatypePropertyVariable(DataPropertyVariable newDatatypePropertyVariable, NotificationChain msgs)
  {
    DataPropertyVariable oldDatatypePropertyVariable = datatypePropertyVariable;
    datatypePropertyVariable = newDatatypePropertyVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE, oldDatatypePropertyVariable, newDatatypePropertyVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatatypePropertyVariable(DataPropertyVariable newDatatypePropertyVariable)
  {
    if (newDatatypePropertyVariable != datatypePropertyVariable)
    {
      NotificationChain msgs = null;
      if (datatypePropertyVariable != null)
        msgs = ((InternalEObject)datatypePropertyVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE, null, msgs);
      if (newDatatypePropertyVariable != null)
        msgs = ((InternalEObject)newDatatypePropertyVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE, null, msgs);
      msgs = basicSetDatatypePropertyVariable(newDatatypePropertyVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE, newDatatypePropertyVariable, newDatatypePropertyVariable));
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
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY:
        return basicSetDatatypeProperty(null, msgs);
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE:
        return basicSetDatatypePropertyVariable(null, msgs);
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
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY:
        return getDatatypeProperty();
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE:
        return getDatatypePropertyVariable();
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
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY:
        setDatatypeProperty((DataProperty)newValue);
        return;
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE:
        setDatatypePropertyVariable((DataPropertyVariable)newValue);
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
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY:
        setDatatypeProperty((DataProperty)null);
        return;
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE:
        setDatatypePropertyVariable((DataPropertyVariable)null);
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
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY:
        return datatypeProperty != null;
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE:
        return datatypePropertyVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //DatatypePropertyDeclarationImpl
