/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import west.twouse.language.yuml.Association;
import west.twouse.language.yuml.AssociationType;
import west.twouse.language.yuml.Attribute;
import west.twouse.language.yuml.Cardinality;
import west.twouse.language.yuml.ClassMember;
import west.twouse.language.yuml.ColorableElement;
import west.twouse.language.yuml.Equivalence;
import west.twouse.language.yuml.Inheritance;
import west.twouse.language.yuml.Method;
import west.twouse.language.yuml.Model;
import west.twouse.language.yuml.ModelElement;
import west.twouse.language.yuml.Note;
import west.twouse.language.yuml.NoteAssociation;
import west.twouse.language.yuml.Relationship;
import west.twouse.language.yuml.Visibility;
import west.twouse.language.yuml.YumlFactory;
import west.twouse.language.yuml.YumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YumlPackageImpl extends EPackageImpl implements YumlPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass modelEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass modelElementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass colorableElementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass classEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass relationshipEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass associationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass inheritanceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass cardinalityEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass classMemberEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass attributeEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass methodEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass noteEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass noteAssociationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass equivalenceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum associationTypeEEnum = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum visibilityEEnum = null;

	/**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see west.twouse.language.yuml.YumlPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private YumlPackageImpl() {
    super(eNS_URI, YumlFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link YumlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static YumlPackage init() {
    if (isInited) return (YumlPackage)EPackage.Registry.INSTANCE.getEPackage(YumlPackage.eNS_URI);

    // Obtain or create and register package
    YumlPackageImpl theYumlPackage = (YumlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof YumlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new YumlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theYumlPackage.createPackageContents();

    // Initialize created meta-data
    theYumlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theYumlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(YumlPackage.eNS_URI, theYumlPackage);
    return theYumlPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getModel() {
    return modelEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getModel_Elements() {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getModelElement() {
    return modelElementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getColorableElement() {
    return colorableElementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getColorableElement_Color() {
    return (EAttribute)colorableElementEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getClass_() {
    return classEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getClass_Stereotype() {
    return (EAttribute)classEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getClass_Name() {
    return (EAttribute)classEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getClass_Attributes() {
    return (EReference)classEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getClass_Methods() {
    return (EReference)classEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getRelationship() {
    return relationshipEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRelationship_Source() {
    return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getRelationship_Target() {
    return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRelationship_SourceLabel() {
    return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getRelationship_TargetLabel() {
    return (EAttribute)relationshipEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAssociation() {
    return associationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAssociation_Type() {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAssociation_SourceCardinality() {
    return (EReference)associationEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAssociation_NavigableSource() {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAssociation_SourceVisibility() {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAssociation_TargetCardinality() {
    return (EReference)associationEClass.getEStructuralFeatures().get(5);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAssociation_NavigableTarget() {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAssociation_TargetVisibility() {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(6);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getInheritance() {
    return inheritanceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCardinality() {
    return cardinalityEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getCardinality_LowerBound() {
    return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getCardinality_UpperBound() {
    return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getClassMember() {
    return classMemberEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getClassMember_Visibility() {
    return (EAttribute)classMemberEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getClassMember_Name() {
    return (EAttribute)classMemberEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAttribute() {
    return attributeEClass;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Stereotype()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAttribute_Type() {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMethod() {
    return methodEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getMethod_Arguments() {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNote() {
    return noteEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNote_Text() {
    return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNoteAssociation() {
    return noteAssociationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getNoteAssociation_Note() {
    return (EReference)noteAssociationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEquivalence() {
    return equivalenceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getAssociationType() {
    return associationTypeEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getVisibility() {
    return visibilityEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public YumlFactory getYumlFactory() {
    return (YumlFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    modelElementEClass = createEClass(MODEL_ELEMENT);

    colorableElementEClass = createEClass(COLORABLE_ELEMENT);
    createEAttribute(colorableElementEClass, COLORABLE_ELEMENT__COLOR);

    classEClass = createEClass(CLASS);
    createEAttribute(classEClass, CLASS__STEREOTYPE);
    createEAttribute(classEClass, CLASS__NAME);
    createEReference(classEClass, CLASS__ATTRIBUTES);
    createEReference(classEClass, CLASS__METHODS);

    relationshipEClass = createEClass(RELATIONSHIP);
    createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
    createEReference(relationshipEClass, RELATIONSHIP__TARGET);
    createEAttribute(relationshipEClass, RELATIONSHIP__SOURCE_LABEL);
    createEAttribute(relationshipEClass, RELATIONSHIP__TARGET_LABEL);

    associationEClass = createEClass(ASSOCIATION);
    createEAttribute(associationEClass, ASSOCIATION__TYPE);
    createEAttribute(associationEClass, ASSOCIATION__NAVIGABLE_SOURCE);
    createEReference(associationEClass, ASSOCIATION__SOURCE_CARDINALITY);
    createEAttribute(associationEClass, ASSOCIATION__SOURCE_VISIBILITY);
    createEAttribute(associationEClass, ASSOCIATION__NAVIGABLE_TARGET);
    createEReference(associationEClass, ASSOCIATION__TARGET_CARDINALITY);
    createEAttribute(associationEClass, ASSOCIATION__TARGET_VISIBILITY);

    inheritanceEClass = createEClass(INHERITANCE);

    cardinalityEClass = createEClass(CARDINALITY);
    createEAttribute(cardinalityEClass, CARDINALITY__LOWER_BOUND);
    createEAttribute(cardinalityEClass, CARDINALITY__UPPER_BOUND);

    classMemberEClass = createEClass(CLASS_MEMBER);
    createEAttribute(classMemberEClass, CLASS_MEMBER__VISIBILITY);
    createEAttribute(classMemberEClass, CLASS_MEMBER__NAME);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__STEREOTYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

    methodEClass = createEClass(METHOD);
    createEAttribute(methodEClass, METHOD__ARGUMENTS);

    noteEClass = createEClass(NOTE);
    createEAttribute(noteEClass, NOTE__TEXT);

    noteAssociationEClass = createEClass(NOTE_ASSOCIATION);
    createEReference(noteAssociationEClass, NOTE_ASSOCIATION__NOTE);

    equivalenceEClass = createEClass(EQUIVALENCE);

    // Create enums
    associationTypeEEnum = createEEnum(ASSOCIATION_TYPE);
    visibilityEEnum = createEEnum(VISIBILITY);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    colorableElementEClass.getESuperTypes().add(this.getModelElement());
    classEClass.getESuperTypes().add(this.getColorableElement());
    relationshipEClass.getESuperTypes().add(this.getModelElement());
    associationEClass.getESuperTypes().add(this.getRelationship());
    inheritanceEClass.getESuperTypes().add(this.getRelationship());
    attributeEClass.getESuperTypes().add(this.getClassMember());
    methodEClass.getESuperTypes().add(this.getClassMember());
    noteEClass.getESuperTypes().add(this.getColorableElement());
    noteAssociationEClass.getESuperTypes().add(this.getRelationship());
    equivalenceEClass.getESuperTypes().add(this.getRelationship());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getModelElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(colorableElementEClass, ColorableElement.class, "ColorableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorableElement_Color(), ecorePackage.getEString(), "color", null, 0, 1, ColorableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classEClass, west.twouse.language.yuml.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_Stereotype(), ecorePackage.getEString(), "stereotype", null, 0, 1, west.twouse.language.yuml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 1, 1, west.twouse.language.yuml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClass_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, west.twouse.language.yuml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Methods(), this.getMethod(), null, "methods", null, 0, -1, west.twouse.language.yuml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationship_Source(), this.getClass_(), null, "source", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getRelationship_Target(), this.getColorableElement(), null, "target", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getRelationship_SourceLabel(), ecorePackage.getEString(), "sourceLabel", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getRelationship_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssociation_Type(), this.getAssociationType(), "type", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getAssociation_NavigableSource(), ecorePackage.getEBoolean(), "navigableSource", "false", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getAssociation_SourceCardinality(), this.getCardinality(), null, "sourceCardinality", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getAssociation_SourceVisibility(), this.getVisibility(), "sourceVisibility", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getAssociation_NavigableTarget(), ecorePackage.getEBoolean(), "navigableTarget", "false", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getAssociation_TargetCardinality(), this.getCardinality(), null, "targetCardinality", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getAssociation_TargetVisibility(), this.getVisibility(), "targetVisibility", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCardinality_LowerBound(), ecorePackage.getEString(), "lowerBound", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getCardinality_UpperBound(), ecorePackage.getEString(), "upperBound", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classMemberEClass, ClassMember.class, "ClassMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassMember_Visibility(), this.getVisibility(), "visibility", null, 1, 1, ClassMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getClassMember_Name(), ecorePackage.getEString(), "name", null, 1, 1, ClassMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Stereotype(), ecorePackage.getEString(), "stereotype", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_Arguments(), ecorePackage.getEString(), "arguments", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNote_Text(), ecorePackage.getEString(), "text", null, 1, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(noteAssociationEClass, NoteAssociation.class, "NoteAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNoteAssociation_Note(), this.getNote(), null, "note", null, 1, 1, NoteAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(equivalenceEClass, Equivalence.class, "Equivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(associationTypeEEnum, AssociationType.class, "AssociationType");
    addEEnumLiteral(associationTypeEEnum, AssociationType.SIMPLE_ASSOCIATION);
    addEEnumLiteral(associationTypeEEnum, AssociationType.AGGREGATION);
    addEEnumLiteral(associationTypeEEnum, AssociationType.COMPOSITION);

    initEEnum(visibilityEEnum, Visibility.class, "Visibility");
    addEEnumLiteral(visibilityEEnum, Visibility.UNSPECIFIED);
    addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
    addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
    addEEnumLiteral(visibilityEEnum, Visibility.PROTECTED);
    addEEnumLiteral(visibilityEEnum, Visibility.PACKAGE);

    // Create resource
    createResource(eNS_URI);
  }

} //YumlPackageImpl
