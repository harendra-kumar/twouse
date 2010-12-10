/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import west.twouse.language.yuml.Association;
import west.twouse.language.yuml.AssociationType;
import west.twouse.language.yuml.Attribute;
import west.twouse.language.yuml.Cardinality;
import west.twouse.language.yuml.Equivalence;
import west.twouse.language.yuml.Inheritance;
import west.twouse.language.yuml.Method;
import west.twouse.language.yuml.Model;
import west.twouse.language.yuml.Note;
import west.twouse.language.yuml.NoteAssociation;
import west.twouse.language.yuml.Visibility;
import west.twouse.language.yuml.YumlFactory;
import west.twouse.language.yuml.YumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YumlFactoryImpl extends EFactoryImpl implements YumlFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static YumlFactory init() {
    try
    {
      YumlFactory theYumlFactory = (YumlFactory)EPackage.Registry.INSTANCE.getEFactory("http://west.uni-koblenz.de/softwareweb/yuml"); 
      if (theYumlFactory != null)
      {
        return theYumlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new YumlFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public YumlFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case YumlPackage.MODEL: return createModel();
      case YumlPackage.CLASS: return createClass();
      case YumlPackage.ASSOCIATION: return createAssociation();
      case YumlPackage.INHERITANCE: return createInheritance();
      case YumlPackage.CARDINALITY: return createCardinality();
      case YumlPackage.ATTRIBUTE: return createAttribute();
      case YumlPackage.METHOD: return createMethod();
      case YumlPackage.NOTE: return createNote();
      case YumlPackage.NOTE_ASSOCIATION: return createNoteAssociation();
      case YumlPackage.EQUIVALENCE: return createEquivalence();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID())
    {
      case YumlPackage.ASSOCIATION_TYPE:
        return createAssociationTypeFromString(eDataType, initialValue);
      case YumlPackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID())
    {
      case YumlPackage.ASSOCIATION_TYPE:
        return convertAssociationTypeToString(eDataType, instanceValue);
      case YumlPackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Model createModel() {
    ModelImpl model = new ModelImpl();
    return model;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public west.twouse.language.yuml.Class createClass() {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Association createAssociation() {
    AssociationImpl association = new AssociationImpl();
    return association;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Inheritance createInheritance() {
    InheritanceImpl inheritance = new InheritanceImpl();
    return inheritance;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Cardinality createCardinality() {
    CardinalityImpl cardinality = new CardinalityImpl();
    return cardinality;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Attribute createAttribute() {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Method createMethod() {
    MethodImpl method = new MethodImpl();
    return method;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Note createNote() {
    NoteImpl note = new NoteImpl();
    return note;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NoteAssociation createNoteAssociation() {
    NoteAssociationImpl noteAssociation = new NoteAssociationImpl();
    return noteAssociation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Equivalence createEquivalence() {
    EquivalenceImpl equivalence = new EquivalenceImpl();
    return equivalence;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssociationType createAssociationTypeFromString(EDataType eDataType, String initialValue) {
    AssociationType result = AssociationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertAssociationTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
    Visibility result = Visibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public YumlPackage getYumlPackage() {
    return (YumlPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static YumlPackage getPackage() {
    return YumlPackage.eINSTANCE;
  }

} //YumlFactoryImpl
