/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.LiteralImpl#getLexicalForm <em>Lexical Form</em>}</li>
 *   <li>{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.LiteralImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralImpl extends EObjectImpl implements Literal {
	/**
   * The default value of the '{@link #getLexicalForm() <em>Lexical Form</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLexicalForm()
   * @generated
   * @ordered
   */
	protected static final String LEXICAL_FORM_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLexicalForm() <em>Lexical Form</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLexicalForm()
   * @generated
   * @ordered
   */
	protected String lexicalForm = LEXICAL_FORM_EDEFAULT;

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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected LiteralImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return SPARQLASPackage.Literals.LITERAL;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLexicalForm() {
    return lexicalForm;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLexicalForm(String newLexicalForm) {
    String oldLexicalForm = lexicalForm;
    lexicalForm = newLexicalForm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.LITERAL__LEXICAL_FORM, oldLexicalForm, lexicalForm));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Datatype getDatatype() {
    return datatype;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDatatype(Datatype newDatatype, NotificationChain msgs) {
    Datatype oldDatatype = datatype;
    datatype = newDatatype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPARQLASPackage.LITERAL__DATATYPE, oldDatatype, newDatatype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDatatype(Datatype newDatatype) {
    if (newDatatype != datatype)
    {
      NotificationChain msgs = null;
      if (datatype != null)
        msgs = ((InternalEObject)datatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.LITERAL__DATATYPE, null, msgs);
      if (newDatatype != null)
        msgs = ((InternalEObject)newDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPARQLASPackage.LITERAL__DATATYPE, null, msgs);
      msgs = basicSetDatatype(newDatatype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPARQLASPackage.LITERAL__DATATYPE, newDatatype, newDatatype));
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
      case SPARQLASPackage.LITERAL__DATATYPE:
        return basicSetDatatype(null, msgs);
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
      case SPARQLASPackage.LITERAL__LEXICAL_FORM:
        return getLexicalForm();
      case SPARQLASPackage.LITERAL__DATATYPE:
        return getDatatype();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case SPARQLASPackage.LITERAL__LEXICAL_FORM:
        setLexicalForm((String)newValue);
        return;
      case SPARQLASPackage.LITERAL__DATATYPE:
        setDatatype((Datatype)newValue);
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
      case SPARQLASPackage.LITERAL__LEXICAL_FORM:
        setLexicalForm(LEXICAL_FORM_EDEFAULT);
        return;
      case SPARQLASPackage.LITERAL__DATATYPE:
        setDatatype((Datatype)null);
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
      case SPARQLASPackage.LITERAL__LEXICAL_FORM:
        return LEXICAL_FORM_EDEFAULT == null ? lexicalForm != null : !LEXICAL_FORM_EDEFAULT.equals(lexicalForm);
      case SPARQLASPackage.LITERAL__DATATYPE:
        return datatype != null;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lexicalForm: ");
    result.append(lexicalForm);
    result.append(')');
    return result.toString();
  }

} //LiteralImpl
