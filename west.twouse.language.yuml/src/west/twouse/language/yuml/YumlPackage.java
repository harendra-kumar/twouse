/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see west.twouse.language.yuml.YumlFactory
 * @model kind="package"
 * @generated
 */
public interface YumlPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "yuml";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://west.uni-koblenz.de/softwareweb/yuml";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "yuml";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	YumlPackage eINSTANCE = west.twouse.language.yuml.impl.YumlPackageImpl.init();

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.ModelImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getModel()
   * @generated
   */
	int MODEL = 0;

	/**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODEL__ELEMENTS = 0;

	/**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODEL_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.ModelElementImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getModelElement()
   * @generated
   */
	int MODEL_ELEMENT = 1;

	/**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.ColorableElementImpl <em>Colorable Element</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.ColorableElementImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getColorableElement()
   * @generated
   */
	int COLORABLE_ELEMENT = 2;

	/**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLORABLE_ELEMENT__COLOR = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Colorable Element</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COLORABLE_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.ClassImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getClass_()
   * @generated
   */
	int CLASS = 3;

	/**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS__COLOR = COLORABLE_ELEMENT__COLOR;

	/**
   * The feature id for the '<em><b>Stereotype</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS__STEREOTYPE = COLORABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS__NAME = COLORABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS__ATTRIBUTES = COLORABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS__METHODS = COLORABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_FEATURE_COUNT = COLORABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.RelationshipImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getRelationship()
   * @generated
   */
	int RELATIONSHIP = 4;

	/**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATIONSHIP__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATIONSHIP__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Source Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATIONSHIP__SOURCE_LABEL = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATIONSHIP__TARGET_LABEL = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int RELATIONSHIP_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.AssociationImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getAssociation()
   * @generated
   */
	int ASSOCIATION = 5;

	/**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__TARGET = RELATIONSHIP__TARGET;

	/**
   * The feature id for the '<em><b>Source Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__SOURCE_LABEL = RELATIONSHIP__SOURCE_LABEL;

  /**
   * The feature id for the '<em><b>Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__TARGET_LABEL = RELATIONSHIP__TARGET_LABEL;

		/**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
		int ASSOCIATION__TYPE = RELATIONSHIP_FEATURE_COUNT + 0;

		/**
   * The feature id for the '<em><b>Navigable Source</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
		int ASSOCIATION__NAVIGABLE_SOURCE = RELATIONSHIP_FEATURE_COUNT + 1;

		/**
   * The feature id for the '<em><b>Source Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__SOURCE_CARDINALITY = RELATIONSHIP_FEATURE_COUNT + 2;

		/**
   * The feature id for the '<em><b>Source Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
		int ASSOCIATION__SOURCE_VISIBILITY = RELATIONSHIP_FEATURE_COUNT + 3;

		/**
   * The feature id for the '<em><b>Navigable Target</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
		int ASSOCIATION__NAVIGABLE_TARGET = RELATIONSHIP_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Target Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__TARGET_CARDINALITY = RELATIONSHIP_FEATURE_COUNT + 5;

	/**
   * The feature id for the '<em><b>Target Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION__TARGET_VISIBILITY = RELATIONSHIP_FEATURE_COUNT + 6;

	/**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSOCIATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 7;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.InheritanceImpl <em>Inheritance</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.InheritanceImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getInheritance()
   * @generated
   */
	int INHERITANCE = 6;

	/**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITANCE__SOURCE = RELATIONSHIP__SOURCE;

	/**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITANCE__TARGET = RELATIONSHIP__TARGET;

	/**
   * The feature id for the '<em><b>Source Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITANCE__SOURCE_LABEL = RELATIONSHIP__SOURCE_LABEL;

	/**
   * The feature id for the '<em><b>Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITANCE__TARGET_LABEL = RELATIONSHIP__TARGET_LABEL;

	/**
   * The number of structural features of the '<em>Inheritance</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INHERITANCE_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.CardinalityImpl <em>Cardinality</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.CardinalityImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getCardinality()
   * @generated
   */
	int CARDINALITY = 7;

	/**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CARDINALITY__LOWER_BOUND = 0;

	/**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CARDINALITY__UPPER_BOUND = 1;

	/**
   * The number of structural features of the '<em>Cardinality</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CARDINALITY_FEATURE_COUNT = 2;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.ClassMemberImpl <em>Class Member</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.ClassMemberImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getClassMember()
   * @generated
   */
	int CLASS_MEMBER = 8;

	/**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_MEMBER__VISIBILITY = 0;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_MEMBER__NAME = 1;

	/**
   * The number of structural features of the '<em>Class Member</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_MEMBER_FEATURE_COUNT = 2;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.AttributeImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getAttribute()
   * @generated
   */
	int ATTRIBUTE = 9;

	/**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__VISIBILITY = CLASS_MEMBER__VISIBILITY;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__NAME = CLASS_MEMBER__NAME;

	/**
   * The feature id for the '<em><b>Stereotype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__STEREOTYPE = CLASS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE__TYPE = CLASS_MEMBER_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATTRIBUTE_FEATURE_COUNT = CLASS_MEMBER_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.MethodImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getMethod()
   * @generated
   */
	int METHOD = 10;

	/**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int METHOD__VISIBILITY = CLASS_MEMBER__VISIBILITY;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int METHOD__NAME = CLASS_MEMBER__NAME;

	/**
   * The feature id for the '<em><b>Arguments</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int METHOD__ARGUMENTS = CLASS_MEMBER_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int METHOD_FEATURE_COUNT = CLASS_MEMBER_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.NoteImpl <em>Note</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.NoteImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getNote()
   * @generated
   */
	int NOTE = 11;

	/**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOTE__COLOR = COLORABLE_ELEMENT__COLOR;

	/**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOTE__TEXT = COLORABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOTE_FEATURE_COUNT = COLORABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.NoteAssociationImpl <em>Note Association</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.NoteAssociationImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getNoteAssociation()
   * @generated
   */
	int NOTE_ASSOCIATION = 12;

	/**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOTE_ASSOCIATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOTE_ASSOCIATION__TARGET = RELATIONSHIP__TARGET;

	/**
   * The feature id for the '<em><b>Source Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOTE_ASSOCIATION__SOURCE_LABEL = RELATIONSHIP__SOURCE_LABEL;

	/**
   * The feature id for the '<em><b>Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOTE_ASSOCIATION__TARGET_LABEL = RELATIONSHIP__TARGET_LABEL;

	/**
   * The feature id for the '<em><b>Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOTE_ASSOCIATION__NOTE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Note Association</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NOTE_ASSOCIATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.impl.EquivalenceImpl <em>Equivalence</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.impl.EquivalenceImpl
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getEquivalence()
   * @generated
   */
	int EQUIVALENCE = 13;

	/**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EQUIVALENCE__SOURCE = RELATIONSHIP__SOURCE;

	/**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EQUIVALENCE__TARGET = RELATIONSHIP__TARGET;

	/**
   * The feature id for the '<em><b>Source Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EQUIVALENCE__SOURCE_LABEL = RELATIONSHIP__SOURCE_LABEL;

	/**
   * The feature id for the '<em><b>Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EQUIVALENCE__TARGET_LABEL = RELATIONSHIP__TARGET_LABEL;

	/**
   * The number of structural features of the '<em>Equivalence</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EQUIVALENCE_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.AssociationType <em>Association Type</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.AssociationType
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getAssociationType()
   * @generated
   */
	int ASSOCIATION_TYPE = 14;

	/**
   * The meta object id for the '{@link west.twouse.language.yuml.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see west.twouse.language.yuml.Visibility
   * @see west.twouse.language.yuml.impl.YumlPackageImpl#getVisibility()
   * @generated
   */
	int VISIBILITY = 15;


	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see west.twouse.language.yuml.Model
   * @generated
   */
	EClass getModel();

	/**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.yuml.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see west.twouse.language.yuml.Model#getElements()
   * @see #getModel()
   * @generated
   */
	EReference getModel_Elements();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see west.twouse.language.yuml.ModelElement
   * @generated
   */
	EClass getModelElement();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.ColorableElement <em>Colorable Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colorable Element</em>'.
   * @see west.twouse.language.yuml.ColorableElement
   * @generated
   */
	EClass getColorableElement();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.ColorableElement#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see west.twouse.language.yuml.ColorableElement#getColor()
   * @see #getColorableElement()
   * @generated
   */
	EAttribute getColorableElement_Color();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see west.twouse.language.yuml.Class
   * @generated
   */
	EClass getClass_();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Class#getStereotype <em>Stereotype</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stereotype</em>'.
   * @see west.twouse.language.yuml.Class#getStereotype()
   * @see #getClass_()
   * @generated
   */
	EAttribute getClass_Stereotype();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see west.twouse.language.yuml.Class#getName()
   * @see #getClass_()
   * @generated
   */
	EAttribute getClass_Name();

	/**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.yuml.Class#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see west.twouse.language.yuml.Class#getAttributes()
   * @see #getClass_()
   * @generated
   */
	EReference getClass_Attributes();

	/**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.yuml.Class#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see west.twouse.language.yuml.Class#getMethods()
   * @see #getClass_()
   * @generated
   */
	EReference getClass_Methods();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see west.twouse.language.yuml.Relationship
   * @generated
   */
	EClass getRelationship();

	/**
   * Returns the meta object for the containment reference '{@link west.twouse.language.yuml.Relationship#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see west.twouse.language.yuml.Relationship#getSource()
   * @see #getRelationship()
   * @generated
   */
	EReference getRelationship_Source();

	/**
   * Returns the meta object for the containment reference '{@link west.twouse.language.yuml.Relationship#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see west.twouse.language.yuml.Relationship#getTarget()
   * @see #getRelationship()
   * @generated
   */
	EReference getRelationship_Target();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Relationship#getSourceLabel <em>Source Label</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Label</em>'.
   * @see west.twouse.language.yuml.Relationship#getSourceLabel()
   * @see #getRelationship()
   * @generated
   */
	EAttribute getRelationship_SourceLabel();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Relationship#getTargetLabel <em>Target Label</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Label</em>'.
   * @see west.twouse.language.yuml.Relationship#getTargetLabel()
   * @see #getRelationship()
   * @generated
   */
	EAttribute getRelationship_TargetLabel();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see west.twouse.language.yuml.Association
   * @generated
   */
	EClass getAssociation();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Association#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see west.twouse.language.yuml.Association#getType()
   * @see #getAssociation()
   * @generated
   */
	EAttribute getAssociation_Type();

	/**
   * Returns the meta object for the containment reference '{@link west.twouse.language.yuml.Association#getSourceCardinality <em>Source Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Cardinality</em>'.
   * @see west.twouse.language.yuml.Association#getSourceCardinality()
   * @see #getAssociation()
   * @generated
   */
	EReference getAssociation_SourceCardinality();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Association#isNavigableSource <em>Navigable Source</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Navigable Source</em>'.
   * @see west.twouse.language.yuml.Association#isNavigableSource()
   * @see #getAssociation()
   * @generated
   */
	EAttribute getAssociation_NavigableSource();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Association#getSourceVisibility <em>Source Visibility</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Visibility</em>'.
   * @see west.twouse.language.yuml.Association#getSourceVisibility()
   * @see #getAssociation()
   * @generated
   */
	EAttribute getAssociation_SourceVisibility();

	/**
   * Returns the meta object for the containment reference '{@link west.twouse.language.yuml.Association#getTargetCardinality <em>Target Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Cardinality</em>'.
   * @see west.twouse.language.yuml.Association#getTargetCardinality()
   * @see #getAssociation()
   * @generated
   */
	EReference getAssociation_TargetCardinality();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Association#isNavigableTarget <em>Navigable Target</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Navigable Target</em>'.
   * @see west.twouse.language.yuml.Association#isNavigableTarget()
   * @see #getAssociation()
   * @generated
   */
	EAttribute getAssociation_NavigableTarget();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Association#getTargetVisibility <em>Target Visibility</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Visibility</em>'.
   * @see west.twouse.language.yuml.Association#getTargetVisibility()
   * @see #getAssociation()
   * @generated
   */
	EAttribute getAssociation_TargetVisibility();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.Inheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inheritance</em>'.
   * @see west.twouse.language.yuml.Inheritance
   * @generated
   */
	EClass getInheritance();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cardinality</em>'.
   * @see west.twouse.language.yuml.Cardinality
   * @generated
   */
	EClass getCardinality();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Cardinality#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see west.twouse.language.yuml.Cardinality#getLowerBound()
   * @see #getCardinality()
   * @generated
   */
	EAttribute getCardinality_LowerBound();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Cardinality#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see west.twouse.language.yuml.Cardinality#getUpperBound()
   * @see #getCardinality()
   * @generated
   */
	EAttribute getCardinality_UpperBound();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.ClassMember <em>Class Member</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Member</em>'.
   * @see west.twouse.language.yuml.ClassMember
   * @generated
   */
	EClass getClassMember();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.ClassMember#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see west.twouse.language.yuml.ClassMember#getVisibility()
   * @see #getClassMember()
   * @generated
   */
	EAttribute getClassMember_Visibility();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.ClassMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see west.twouse.language.yuml.ClassMember#getName()
   * @see #getClassMember()
   * @generated
   */
	EAttribute getClassMember_Name();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see west.twouse.language.yuml.Attribute
   * @generated
   */
	EClass getAttribute();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Attribute#getStereotype <em>Stereotype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stereotype</em>'.
   * @see west.twouse.language.yuml.Attribute#getStereotype()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Stereotype();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see west.twouse.language.yuml.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
	EAttribute getAttribute_Type();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see west.twouse.language.yuml.Method
   * @generated
   */
	EClass getMethod();

	/**
   * Returns the meta object for the attribute list '{@link west.twouse.language.yuml.Method#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Arguments</em>'.
   * @see west.twouse.language.yuml.Method#getArguments()
   * @see #getMethod()
   * @generated
   */
	EAttribute getMethod_Arguments();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note</em>'.
   * @see west.twouse.language.yuml.Note
   * @generated
   */
	EClass getNote();

	/**
   * Returns the meta object for the attribute '{@link west.twouse.language.yuml.Note#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see west.twouse.language.yuml.Note#getText()
   * @see #getNote()
   * @generated
   */
	EAttribute getNote_Text();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.NoteAssociation <em>Note Association</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note Association</em>'.
   * @see west.twouse.language.yuml.NoteAssociation
   * @generated
   */
	EClass getNoteAssociation();

	/**
   * Returns the meta object for the containment reference '{@link west.twouse.language.yuml.NoteAssociation#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Note</em>'.
   * @see west.twouse.language.yuml.NoteAssociation#getNote()
   * @see #getNoteAssociation()
   * @generated
   */
	EReference getNoteAssociation_Note();

	/**
   * Returns the meta object for class '{@link west.twouse.language.yuml.Equivalence <em>Equivalence</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalence</em>'.
   * @see west.twouse.language.yuml.Equivalence
   * @generated
   */
	EClass getEquivalence();

	/**
   * Returns the meta object for enum '{@link west.twouse.language.yuml.AssociationType <em>Association Type</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Association Type</em>'.
   * @see west.twouse.language.yuml.AssociationType
   * @generated
   */
	EEnum getAssociationType();

	/**
   * Returns the meta object for enum '{@link west.twouse.language.yuml.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility</em>'.
   * @see west.twouse.language.yuml.Visibility
   * @generated
   */
	EEnum getVisibility();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	YumlFactory getYumlFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.ModelImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getModel()
     * @generated
     */
		EClass MODEL = eINSTANCE.getModel();

		/**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.ModelElementImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getModelElement()
     * @generated
     */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.ColorableElementImpl <em>Colorable Element</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.ColorableElementImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getColorableElement()
     * @generated
     */
		EClass COLORABLE_ELEMENT = eINSTANCE.getColorableElement();

		/**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COLORABLE_ELEMENT__COLOR = eINSTANCE.getColorableElement_Color();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.ClassImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getClass_()
     * @generated
     */
		EClass CLASS = eINSTANCE.getClass_();

		/**
     * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CLASS__STEREOTYPE = eINSTANCE.getClass_Stereotype();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CLASS__METHODS = eINSTANCE.getClass_Methods();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.RelationshipImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getRelationship()
     * @generated
     */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
     * The meta object literal for the '<em><b>Source Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RELATIONSHIP__SOURCE_LABEL = eINSTANCE.getRelationship_SourceLabel();

		/**
     * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute RELATIONSHIP__TARGET_LABEL = eINSTANCE.getRelationship_TargetLabel();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.AssociationImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getAssociation()
     * @generated
     */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ASSOCIATION__TYPE = eINSTANCE.getAssociation_Type();

		/**
     * The meta object literal for the '<em><b>Source Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ASSOCIATION__SOURCE_CARDINALITY = eINSTANCE.getAssociation_SourceCardinality();

		/**
     * The meta object literal for the '<em><b>Navigable Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ASSOCIATION__NAVIGABLE_SOURCE = eINSTANCE.getAssociation_NavigableSource();

		/**
     * The meta object literal for the '<em><b>Source Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ASSOCIATION__SOURCE_VISIBILITY = eINSTANCE.getAssociation_SourceVisibility();

		/**
     * The meta object literal for the '<em><b>Target Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ASSOCIATION__TARGET_CARDINALITY = eINSTANCE.getAssociation_TargetCardinality();

		/**
     * The meta object literal for the '<em><b>Navigable Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ASSOCIATION__NAVIGABLE_TARGET = eINSTANCE.getAssociation_NavigableTarget();

		/**
     * The meta object literal for the '<em><b>Target Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ASSOCIATION__TARGET_VISIBILITY = eINSTANCE.getAssociation_TargetVisibility();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.InheritanceImpl <em>Inheritance</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.InheritanceImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getInheritance()
     * @generated
     */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.CardinalityImpl <em>Cardinality</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.CardinalityImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getCardinality()
     * @generated
     */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CARDINALITY__LOWER_BOUND = eINSTANCE.getCardinality_LowerBound();

		/**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CARDINALITY__UPPER_BOUND = eINSTANCE.getCardinality_UpperBound();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.ClassMemberImpl <em>Class Member</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.ClassMemberImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getClassMember()
     * @generated
     */
		EClass CLASS_MEMBER = eINSTANCE.getClassMember();

		/**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CLASS_MEMBER__VISIBILITY = eINSTANCE.getClassMember_Visibility();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CLASS_MEMBER__NAME = eINSTANCE.getClassMember_Name();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.AttributeImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getAttribute()
     * @generated
     */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
     * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__STEREOTYPE = eINSTANCE.getAttribute_Stereotype();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.MethodImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getMethod()
     * @generated
     */
		EClass METHOD = eINSTANCE.getMethod();

		/**
     * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute METHOD__ARGUMENTS = eINSTANCE.getMethod_Arguments();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.NoteImpl <em>Note</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.NoteImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getNote()
     * @generated
     */
		EClass NOTE = eINSTANCE.getNote();

		/**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NOTE__TEXT = eINSTANCE.getNote_Text();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.NoteAssociationImpl <em>Note Association</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.NoteAssociationImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getNoteAssociation()
     * @generated
     */
		EClass NOTE_ASSOCIATION = eINSTANCE.getNoteAssociation();

		/**
     * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NOTE_ASSOCIATION__NOTE = eINSTANCE.getNoteAssociation_Note();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.impl.EquivalenceImpl <em>Equivalence</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.impl.EquivalenceImpl
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getEquivalence()
     * @generated
     */
		EClass EQUIVALENCE = eINSTANCE.getEquivalence();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.AssociationType <em>Association Type</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.AssociationType
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getAssociationType()
     * @generated
     */
		EEnum ASSOCIATION_TYPE = eINSTANCE.getAssociationType();

		/**
     * The meta object literal for the '{@link west.twouse.language.yuml.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see west.twouse.language.yuml.Visibility
     * @see west.twouse.language.yuml.impl.YumlPackageImpl#getVisibility()
     * @generated
     */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

	}

} //YumlPackage
