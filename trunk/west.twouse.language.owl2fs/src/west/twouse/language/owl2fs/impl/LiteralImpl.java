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

import west.twouse.language.owl2fs.Datatype;
import west.twouse.language.owl2fs.Literal;
import west.twouse.language.owl2fs.Owl2fsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link west.twouse.language.owl2fs.impl.LiteralImpl#getLexicalValue <em>Lexical Value</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.LiteralImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link west.twouse.language.owl2fs.impl.LiteralImpl#getLanguageTag <em>Language Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralImpl extends AnnotationValueImpl implements Literal
{
  /**
   * The default value of the '{@link #getLexicalValue() <em>Lexical Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLexicalValue()
   * @generated
   * @ordered
   */
  protected static final String LEXICAL_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLexicalValue() <em>Lexical Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLexicalValue()
   * @generated
   * @ordered
   */
  protected String lexicalValue = LEXICAL_VALUE_EDEFAULT;

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
   * The default value of the '{@link #getLanguageTag() <em>Language Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguageTag()
   * @generated
   * @ordered
   */
  protected static final String LANGUAGE_TAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLanguageTag() <em>Language Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguageTag()
   * @generated
   * @ordered
   */
  protected String languageTag = LANGUAGE_TAG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralImpl()
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
    return Owl2fsPackage.Literals.LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLexicalValue()
  {
    return lexicalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLexicalValue(String newLexicalValue)
  {
    String oldLexicalValue = lexicalValue;
    lexicalValue = newLexicalValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.LITERAL__LEXICAL_VALUE, oldLexicalValue, lexicalValue));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Owl2fsPackage.LITERAL__DATATYPE, oldDatatype, newDatatype);
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
        msgs = ((InternalEObject)datatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.LITERAL__DATATYPE, null, msgs);
      if (newDatatype != null)
        msgs = ((InternalEObject)newDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Owl2fsPackage.LITERAL__DATATYPE, null, msgs);
      msgs = basicSetDatatype(newDatatype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.LITERAL__DATATYPE, newDatatype, newDatatype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLanguageTag()
  {
    return languageTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLanguageTag(String newLanguageTag)
  {
    String oldLanguageTag = languageTag;
    languageTag = newLanguageTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Owl2fsPackage.LITERAL__LANGUAGE_TAG, oldLanguageTag, languageTag));
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
      case Owl2fsPackage.LITERAL__DATATYPE:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Owl2fsPackage.LITERAL__LEXICAL_VALUE:
        return getLexicalValue();
      case Owl2fsPackage.LITERAL__DATATYPE:
        return getDatatype();
      case Owl2fsPackage.LITERAL__LANGUAGE_TAG:
        return getLanguageTag();
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
      case Owl2fsPackage.LITERAL__LEXICAL_VALUE:
        setLexicalValue((String)newValue);
        return;
      case Owl2fsPackage.LITERAL__DATATYPE:
        setDatatype((Datatype)newValue);
        return;
      case Owl2fsPackage.LITERAL__LANGUAGE_TAG:
        setLanguageTag((String)newValue);
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
      case Owl2fsPackage.LITERAL__LEXICAL_VALUE:
        setLexicalValue(LEXICAL_VALUE_EDEFAULT);
        return;
      case Owl2fsPackage.LITERAL__DATATYPE:
        setDatatype((Datatype)null);
        return;
      case Owl2fsPackage.LITERAL__LANGUAGE_TAG:
        setLanguageTag(LANGUAGE_TAG_EDEFAULT);
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
      case Owl2fsPackage.LITERAL__LEXICAL_VALUE:
        return LEXICAL_VALUE_EDEFAULT == null ? lexicalValue != null : !LEXICAL_VALUE_EDEFAULT.equals(lexicalValue);
      case Owl2fsPackage.LITERAL__DATATYPE:
        return datatype != null;
      case Owl2fsPackage.LITERAL__LANGUAGE_TAG:
        return LANGUAGE_TAG_EDEFAULT == null ? languageTag != null : !LANGUAGE_TAG_EDEFAULT.equals(languageTag);
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
    result.append(" (lexicalValue: ");
    result.append(lexicalValue);
    result.append(", languageTag: ");
    result.append(languageTag);
    result.append(')');
    return result.toString();
  }

} //LiteralImpl
