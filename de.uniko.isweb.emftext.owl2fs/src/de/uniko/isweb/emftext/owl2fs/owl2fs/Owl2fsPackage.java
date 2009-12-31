/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

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
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory
 * @model kind="package"
 * @generated
 */
public interface Owl2fsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "owl2fs";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://west.uni-koblenz.de/OWL2FS";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "owl2fs";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Owl2fsPackage eINSTANCE = de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl.init();

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AxiomImpl <em>Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AxiomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAxiom()
   * @generated
   */
  int AXIOM = 1;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIOM__AXIOM_ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIOM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AssertionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 0;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__AXIOM_ANNOTATIONS = AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_PROPERTY = 0;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 4;

  /**
   * The feature id for the '<em><b>Entity URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ENTITY_URI = 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnnotationProperty()
   * @generated
   */
  int ANNOTATION_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Entity URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY__ENTITY_URI = ENTITY__ENTITY_URI;

  /**
   * The number of structural features of the '<em>Annotation Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.URIImpl <em>URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.URIImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getURI()
   * @generated
   */
  int URI = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__VALUE = 0;

  /**
   * The number of structural features of the '<em>URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TermImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTerm()
   * @generated
   */
  int TERM = 107;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ConstantImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 111;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.LiteralImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 6;

  /**
   * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LEXICAL_VALUE = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__DATATYPE = CONSTANT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataRangeImpl <em>Data Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataRangeImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataRange()
   * @generated
   */
  int DATA_RANGE = 8;

  /**
   * The feature id for the '<em><b>Arity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE__ARITY = 0;

  /**
   * The number of structural features of the '<em>Data Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatatypeImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 7;

  /**
   * The feature id for the '<em><b>Arity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__ARITY = DATA_RANGE__ARITY;

  /**
   * The feature id for the '<em><b>Entity URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__ENTITY_URI = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__DATA_TYPE = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyAxiomImpl <em>Data Property Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyAxiomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyAxiom()
   * @generated
   */
  int DATA_PROPERTY_AXIOM = 9;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_AXIOM__AXIOM_ANNOTATIONS = AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Data Property Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyAxiomImpl <em>Object Property Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyAxiomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyAxiom()
   * @generated
   */
  int OBJECT_PROPERTY_AXIOM = 10;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS = AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Object Property Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassExpressionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClassExpression()
   * @generated
   */
  int CLASS_EXPRESSION = 11;

  /**
   * The number of structural features of the '<em>Class Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAxiomImpl <em>Class Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAxiomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClassAxiom()
   * @generated
   */
  int CLASS_AXIOM = 12;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_AXIOM__AXIOM_ANNOTATIONS = AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Class Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyExpressionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyExpression()
   * @generated
   */
  int DATA_PROPERTY_EXPRESSION = 13;

  /**
   * The number of structural features of the '<em>Data Property Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyExpression()
   * @generated
   */
  int OBJECT_PROPERTY_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Is Functional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL = 0;

  /**
   * The feature id for the '<em><b>Is Reflexive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE = 1;

  /**
   * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL = 2;

  /**
   * The feature id for the '<em><b>Is Irreflexive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE = 3;

  /**
   * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC = 4;

  /**
   * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE = 5;

  /**
   * The feature id for the '<em><b>Is Asysmmetric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC = 6;

  /**
   * The number of structural features of the '<em>Object Property Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AsymmetricObjectPropertyImpl <em>Asymmetric Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AsymmetricObjectPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAsymmetricObjectProperty()
   * @generated
   */
  int ASYMMETRIC_OBJECT_PROPERTY = 15;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Asymmetric Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASYMMETRIC_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectProperty()
   * @generated
   */
  int OBJECT_PROPERTY = 16;

  /**
   * The feature id for the '<em><b>Entity URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__ENTITY_URI = ENTITY__ENTITY_URI;

  /**
   * The feature id for the '<em><b>Is Functional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__IS_FUNCTIONAL = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Reflexive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__IS_REFLEXIVE = ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL = ENTITY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Irreflexive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__IS_IRREFLEXIVE = ENTITY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__IS_SYMMETRIC = ENTITY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__IS_TRANSITIVE = ENTITY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is Asysmmetric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__IS_ASYSMMETRIC = ENTITY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseObjectPropertyImpl <em>Inverse Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseObjectPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getInverseObjectProperty()
   * @generated
   */
  int INVERSE_OBJECT_PROPERTY = 17;

  /**
   * The feature id for the '<em><b>Is Functional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTY__IS_FUNCTIONAL = OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL;

  /**
   * The feature id for the '<em><b>Is Reflexive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTY__IS_REFLEXIVE = OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE;

  /**
   * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL = OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL;

  /**
   * The feature id for the '<em><b>Is Irreflexive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTY__IS_IRREFLEXIVE = OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE;

  /**
   * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTY__IS_SYMMETRIC = OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC;

  /**
   * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTY__IS_TRANSITIVE = OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE;

  /**
   * The feature id for the '<em><b>Is Asysmmetric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTY__IS_ASYSMMETRIC = OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC;

  /**
   * The feature id for the '<em><b>Object Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inverse Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 18;

  /**
   * The feature id for the '<em><b>Entity URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ENTITY_URI = ENTITY__ENTITY_URI;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__OWNING_TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectIntersectionOfImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectIntersectionOf()
   * @generated
   */
  int OBJECT_INTERSECTION_OF = 19;

  /**
   * The feature id for the '<em><b>Class Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Intersection Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_INTERSECTION_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectOneOfImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectOneOf()
   * @generated
   */
  int OBJECT_ONE_OF = 20;

  /**
   * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ONE_OF__INDIVIDUALS = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object One Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ONE_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualImpl <em>Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getIndividual()
   * @generated
   */
  int INDIVIDUAL = 21;

  /**
   * The number of structural features of the '<em>Individual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NamedIndividualImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getNamedIndividual()
   * @generated
   */
  int NAMED_INDIVIDUAL = 22;

  /**
   * The feature id for the '<em><b>Entity URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INDIVIDUAL__ENTITY_URI = ENTITY__ENTITY_URI;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INDIVIDUAL__OWNING_TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INDIVIDUAL__TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Named Individual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INDIVIDUAL_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectSomeValuesFromImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectSomeValuesFrom()
   * @generated
   */
  int OBJECT_SOME_VALUES_FROM = 23;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Some Values From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SOME_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectAllValuesFromImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectAllValuesFrom()
   * @generated
   */
  int OBJECT_ALL_VALUES_FROM = 24;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object All Values From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ALL_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectExistsSelfImpl <em>Object Exists Self</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectExistsSelfImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectExistsSelf()
   * @generated
   */
  int OBJECT_EXISTS_SELF = 25;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_EXISTS_SELF__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Exists Self</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_EXISTS_SELF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectHasValueImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectHasValue()
   * @generated
   */
  int OBJECT_HAS_VALUE = 26;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_HAS_VALUE__INDIVIDUAL = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Has Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_HAS_VALUE_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectMinCardinalityImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectMinCardinality()
   * @generated
   */
  int OBJECT_MIN_CARDINALITY = 27;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MIN_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Object Min Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MIN_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectMaxCardinalityImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectMaxCardinality()
   * @generated
   */
  int OBJECT_MAX_CARDINALITY = 28;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAX_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Object Max Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAX_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataSomeValuesFromImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataSomeValuesFrom()
   * @generated
   */
  int DATA_SOME_VALUES_FROM = 29;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOME_VALUES_FROM__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Some Values From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOME_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyImpl <em>Data Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataProperty()
   * @generated
   */
  int DATA_PROPERTY = 30;

  /**
   * The feature id for the '<em><b>Entity URI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY__ENTITY_URI = ENTITY__ENTITY_URI;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY__TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataOneOfImpl <em>Data One Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataOneOfImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataOneOf()
   * @generated
   */
  int DATA_ONE_OF = 31;

  /**
   * The feature id for the '<em><b>Arity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ONE_OF__ARITY = DATA_RANGE__ARITY;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ONE_OF__CONSTANTS = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data One Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ONE_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatatypeRestrictionImpl <em>Datatype Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatatypeRestrictionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDatatypeRestriction()
   * @generated
   */
  int DATATYPE_RESTRICTION = 32;

  /**
   * The feature id for the '<em><b>Arity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_RESTRICTION__ARITY = DATA_RANGE__ARITY;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_RESTRICTION__DATATYPE = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_RESTRICTION__RESTRICTIONS = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Datatype Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_RESTRICTION_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FacetConstantPairImpl <em>Facet Constant Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FacetConstantPairImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getFacetConstantPair()
   * @generated
   */
  int FACET_CONSTANT_PAIR = 33;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_CONSTANT_PAIR__CONSTANT = 0;

  /**
   * The feature id for the '<em><b>Facet</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_CONSTANT_PAIR__FACET = 1;

  /**
   * The number of structural features of the '<em>Facet Constant Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_CONSTANT_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataAllValuesFromImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataAllValuesFrom()
   * @generated
   */
  int DATA_ALL_VALUES_FROM = 34;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ALL_VALUES_FROM__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data All Values From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ALL_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataHasValueImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataHasValue()
   * @generated
   */
  int DATA_HAS_VALUE = 35;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_HAS_VALUE__CONSTANT = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Has Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_HAS_VALUE_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataMinCardinalityImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataMinCardinality()
   * @generated
   */
  int DATA_MIN_CARDINALITY = 36;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MIN_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MIN_CARDINALITY__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Min Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MIN_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataMaxCardinalityImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataMaxCardinality()
   * @generated
   */
  int DATA_MAX_CARDINALITY = 37;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MAX_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MAX_CARDINALITY__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Max Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MAX_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataExactCardinalityImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataExactCardinality()
   * @generated
   */
  int DATA_EXACT_CARDINALITY = 38;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXACT_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXACT_CARDINALITY__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Exact Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXACT_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NegativeDataPropertyAssertionImpl <em>Negative Data Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NegativeDataPropertyAssertionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getNegativeDataPropertyAssertion()
   * @generated
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION = 39;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS = ASSERTION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Negative Data Property Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyDomainImpl <em>Data Property Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyDomainImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyDomain()
   * @generated
   */
  int DATA_PROPERTY_DOMAIN = 40;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS = DATA_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_DOMAIN__DOMAIN = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Property Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_DOMAIN_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyRangeImpl <em>Data Property Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyRangeImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyRange()
   * @generated
   */
  int DATA_PROPERTY_RANGE = 41;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_RANGE__AXIOM_ANNOTATIONS = DATA_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_RANGE__RANGE = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Property Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_RANGE_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DifferentIndividualsImpl <em>Different Individuals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DifferentIndividualsImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDifferentIndividuals()
   * @generated
   */
  int DIFFERENT_INDIVIDUALS = 42;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT_INDIVIDUALS__AXIOM_ANNOTATIONS = ASSERTION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Different Individuals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Different Individuals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT_INDIVIDUALS_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointClassesImpl <em>Disjoint Classes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointClassesImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDisjointClasses()
   * @generated
   */
  int DISJOINT_CLASSES = 43;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_CLASSES__AXIOM_ANNOTATIONS = CLASS_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Disjoint Class Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS = CLASS_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Disjoint Classes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_CLASSES_FEATURE_COUNT = CLASS_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointDataPropertiesImpl <em>Disjoint Data Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointDataPropertiesImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDisjointDataProperties()
   * @generated
   */
  int DISJOINT_DATA_PROPERTIES = 44;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_DATA_PROPERTIES__AXIOM_ANNOTATIONS = DATA_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Disjoint Data Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_DATA_PROPERTIES_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointObjectPropertiesImpl <em>Disjoint Object Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointObjectPropertiesImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDisjointObjectProperties()
   * @generated
   */
  int DISJOINT_OBJECT_PROPERTIES = 45;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Disjoint Object Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_OBJECT_PROPERTIES_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointUnionImpl <em>Disjoint Union</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointUnionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDisjointUnion()
   * @generated
   */
  int DISJOINT_UNION = 46;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_UNION__AXIOM_ANNOTATIONS = CLASS_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Union Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_UNION__UNION_CLASS = CLASS_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Disjoint Class Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS = CLASS_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Disjoint Union</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_UNION_FEATURE_COUNT = CLASS_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentClassesImpl <em>Equivalent Classes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentClassesImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getEquivalentClasses()
   * @generated
   */
  int EQUIVALENT_CLASSES = 47;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_CLASSES__AXIOM_ANNOTATIONS = CLASS_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Equivalent Class Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS = CLASS_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Equivalent Classes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_CLASSES_FEATURE_COUNT = CLASS_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentDataPropertiesImpl <em>Equivalent Data Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentDataPropertiesImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getEquivalentDataProperties()
   * @generated
   */
  int EQUIVALENT_DATA_PROPERTIES = 48;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_DATA_PROPERTIES__AXIOM_ANNOTATIONS = DATA_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Equivalent Data Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_DATA_PROPERTIES_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentObjectPropertiesImpl <em>Equivalent Object Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentObjectPropertiesImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getEquivalentObjectProperties()
   * @generated
   */
  int EQUIVALENT_OBJECT_PROPERTIES = 49;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Equivalent Object Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_OBJECT_PROPERTIES_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FunctionalDataPropertyImpl <em>Functional Data Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FunctionalDataPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getFunctionalDataProperty()
   * @generated
   */
  int FUNCTIONAL_DATA_PROPERTY = 50;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_DATA_PROPERTY__AXIOM_ANNOTATIONS = DATA_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Functional Data Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_DATA_PROPERTY_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FunctionalObjectPropertyImpl <em>Functional Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FunctionalObjectPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getFunctionalObjectProperty()
   * @generated
   */
  int FUNCTIONAL_OBJECT_PROPERTY = 51;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Functional Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseFunctionalObjectPropertyImpl <em>Inverse Functional Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseFunctionalObjectPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getInverseFunctionalObjectProperty()
   * @generated
   */
  int INVERSE_FUNCTIONAL_OBJECT_PROPERTY = 52;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inverse Functional Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_FUNCTIONAL_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyAssertionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyAssertion()
   * @generated
   */
  int OBJECT_PROPERTY_ASSERTION = 53;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS = ASSERTION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Object Property Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NegativeObjectPropertyAssertionImpl <em>Negative Object Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NegativeObjectPropertyAssertionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getNegativeObjectPropertyAssertion()
   * @generated
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION = 54;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS = ASSERTION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Negative Object Property Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyDomainImpl <em>Object Property Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyDomainImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyDomain()
   * @generated
   */
  int OBJECT_PROPERTY_DOMAIN = 55;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DOMAIN__DOMAIN = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Property Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DOMAIN_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SymmetricObjectPropertyImpl <em>Symmetric Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SymmetricObjectPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSymmetricObjectProperty()
   * @generated
   */
  int SYMMETRIC_OBJECT_PROPERTY = 56;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Symmetric Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMMETRIC_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ReflexiveObjectPropertyImpl <em>Reflexive Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ReflexiveObjectPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getReflexiveObjectProperty()
   * @generated
   */
  int REFLEXIVE_OBJECT_PROPERTY = 57;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reflexive Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubDataPropertyOfImpl <em>Sub Data Property Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubDataPropertyOfImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSubDataPropertyOf()
   * @generated
   */
  int SUB_DATA_PROPERTY_OF = 58;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DATA_PROPERTY_OF__AXIOM_ANNOTATIONS = DATA_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Super Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Data Property Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DATA_PROPERTY_OF_FEATURE_COUNT = DATA_PROPERTY_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SameIndividualImpl <em>Same Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SameIndividualImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSameIndividual()
   * @generated
   */
  int SAME_INDIVIDUAL = 59;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAME_INDIVIDUAL__AXIOM_ANNOTATIONS = ASSERTION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Same Individuals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAME_INDIVIDUAL__SAME_INDIVIDUALS = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Same Individual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAME_INDIVIDUAL_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubObjectPropertyOfImpl <em>Sub Object Property Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubObjectPropertyOfImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSubObjectPropertyOf()
   * @generated
   */
  int SUB_OBJECT_PROPERTY_OF = 60;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Super Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Object Property Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Object Property Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectComplementOfImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectComplementOf()
   * @generated
   */
  int OBJECT_COMPLEMENT_OF = 61;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Complement Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_COMPLEMENT_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl <em>Ontology</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getOntology()
   * @generated
   */
  int ONTOLOGY = 62;

  /**
   * The feature id for the '<em><b>Ontology Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__ONTOLOGY_ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__AXIOMS = 1;

  /**
   * The feature id for the '<em><b>Imported Ontologies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__IMPORTED_ONTOLOGIES = 2;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__EXPRESSIONS = 3;

  /**
   * The feature id for the '<em><b>Ontology URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__ONTOLOGY_URI = 4;

  /**
   * The feature id for the '<em><b>Version URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__VERSION_URI = 5;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__PACKAGES = 6;

  /**
   * The number of structural features of the '<em>Ontology</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyRangeImpl <em>Object Property Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyRangeImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyRange()
   * @generated
   */
  int OBJECT_PROPERTY_RANGE = 63;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_RANGE__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_RANGE__RANGE = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Property Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_RANGE_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyAssertionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyAssertion()
   * @generated
   */
  int DATA_PROPERTY_ASSERTION = 64;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS = ASSERTION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_ASSERTION__TARGET_VALUE = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Property Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAssertionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClassAssertion()
   * @generated
   */
  int CLASS_ASSERTION = 65;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ASSERTION__AXIOM_ANNOTATIONS = ASSERTION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ASSERTION__INDIVIDUAL = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ASSERTION__CLASS_EXPRESSION = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IrreflexiveObjectPropertyImpl <em>Irreflexive Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IrreflexiveObjectPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getIrreflexiveObjectProperty()
   * @generated
   */
  int IRREFLEXIVE_OBJECT_PROPERTY = 66;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Irreflexive Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectExactCardinalityImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectExactCardinality()
   * @generated
   */
  int OBJECT_EXACT_CARDINALITY = 67;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_EXACT_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Object Exact Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_EXACT_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataComplementOfImpl <em>Data Complement Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataComplementOfImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataComplementOf()
   * @generated
   */
  int DATA_COMPLEMENT_OF = 68;

  /**
   * The feature id for the '<em><b>Arity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPLEMENT_OF__ARITY = DATA_RANGE__ARITY;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPLEMENT_OF__DATA_RANGE = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Complement Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPLEMENT_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubClassOfImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSubClassOf()
   * @generated
   */
  int SUB_CLASS_OF = 69;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_CLASS_OF__AXIOM_ANNOTATIONS = CLASS_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Sub Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_CLASS_OF__SUB_CLASS_EXPRESSION = CLASS_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_CLASS_OF__SUPER_CLASS_EXPRESSION = CLASS_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Class Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_CLASS_OF_FEATURE_COUNT = CLASS_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubObjectPropertyImpl <em>Sub Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubObjectPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSubObjectProperty()
   * @generated
   */
  int SUB_OBJECT_PROPERTY = 70;

  /**
   * The number of structural features of the '<em>Sub Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TransitiveObjectPropertyImpl <em>Transitive Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TransitiveObjectPropertyImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTransitiveObjectProperty()
   * @generated
   */
  int TRANSITIVE_OBJECT_PROPERTY = 71;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transitive Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIVE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityAnnotationImpl <em>Entity Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityAnnotationImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getEntityAnnotation()
   * @generated
   */
  int ENTITY_ANNOTATION = 72;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ANNOTATION__AXIOM_ANNOTATIONS = AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ANNOTATION__ENTITY = AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entity Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ANNOTATION__ENTITY_ANNOTATIONS = AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ANNOTATION_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FullURIImpl <em>Full URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FullURIImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getFullURI()
   * @generated
   */
  int FULL_URI = 73;

  /**
   * The feature id for the '<em><b>Iri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_URI__IRI = 0;

  /**
   * The number of structural features of the '<em>Full URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_URI_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AbbreviatedURIImpl <em>Abbreviated URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AbbreviatedURIImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAbbreviatedURI()
   * @generated
   */
  int ABBREVIATED_URI = 74;

  /**
   * The feature id for the '<em><b>Local Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATED_URI__LOCAL_NAME = 0;

  /**
   * The number of structural features of the '<em>Abbreviated URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATED_URI_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectUnionOfImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectUnionOf()
   * @generated
   */
  int OBJECT_UNION_OF = 75;

  /**
   * The feature id for the '<em><b>Class Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UNION_OF__CLASS_EXPRESSIONS = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Union Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UNION_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseObjectPropertiesImpl <em>Inverse Object Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseObjectPropertiesImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getInverseObjectProperties()
   * @generated
   */
  int INVERSE_OBJECT_PROPERTIES = 76;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Object Property Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION1 = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Object Property Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION2 = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inverse Object Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTIES_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByConstantImpl <em>Annotation By Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByConstantImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnnotationByConstant()
   * @generated
   */
  int ANNOTATION_BY_CONSTANT = 77;

  /**
   * The feature id for the '<em><b>Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_BY_CONSTANT__ANNOTATION_PROPERTY = ANNOTATION__ANNOTATION_PROPERTY;

  /**
   * The feature id for the '<em><b>Annotation Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_BY_CONSTANT__ANNOTATION_VALUE = ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation By Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_BY_CONSTANT_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByEntityImpl <em>Annotation By Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByEntityImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnnotationByEntity()
   * @generated
   */
  int ANNOTATION_BY_ENTITY = 78;

  /**
   * The feature id for the '<em><b>Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_BY_ENTITY__ANNOTATION_PROPERTY = ANNOTATION__ANNOTATION_PROPERTY;

  /**
   * The feature id for the '<em><b>Annotation Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_BY_ENTITY__ANNOTATION_VALUE = ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation By Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_BY_ENTITY_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByAnonymousIndividualImpl <em>Annotation By Anonymous Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByAnonymousIndividualImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnnotationByAnonymousIndividual()
   * @generated
   */
  int ANNOTATION_BY_ANONYMOUS_INDIVIDUAL = 79;

  /**
   * The feature id for the '<em><b>Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_PROPERTY = ANNOTATION__ANNOTATION_PROPERTY;

  /**
   * The feature id for the '<em><b>Annotation Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE = ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation By Anonymous Individual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_BY_ANONYMOUS_INDIVIDUAL_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnonymousIndividualImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnonymousIndividual()
   * @generated
   */
  int ANONYMOUS_INDIVIDUAL = 80;

  /**
   * The feature id for the '<em><b>Node ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_INDIVIDUAL__NODE_ID = INDIVIDUAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Anonymous Individual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_INDIVIDUAL_FEATURE_COUNT = INDIVIDUAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DeclarationImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 81;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__AXIOM_ANNOTATIONS = AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__ENTITY = AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Functional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__IS_FUNCTIONAL = AXIOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Reflexive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__IS_REFLEXIVE = AXIOM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Inverse Functional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__IS_INVERSE_FUNCTIONAL = AXIOM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Is Irreflexive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__IS_IRREFLEXIVE = AXIOM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Is Symmetric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__IS_SYMMETRIC = AXIOM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is Transitive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__IS_TRANSITIVE = AXIOM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Is Asysmmetric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__IS_ASYSMMETRIC = AXIOM_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectAndDataPropertyAxiomImpl <em>Object And Data Property Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectAndDataPropertyAxiomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectAndDataPropertyAxiom()
   * @generated
   */
  int OBJECT_AND_DATA_PROPERTY_AXIOM = 82;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_AND_DATA_PROPERTY_AXIOM__AXIOM_ANNOTATIONS = AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Object And Data Property Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_AND_DATA_PROPERTY_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.KeyForImpl <em>Key For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.KeyForImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getKeyFor()
   * @generated
   */
  int KEY_FOR = 83;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FOR__AXIOM_ANNOTATIONS = OBJECT_AND_DATA_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FOR__CLASS_EXPRESSION = OBJECT_AND_DATA_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FOR__DATA_PROPERTY_EXPRESSIONS = OBJECT_AND_DATA_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS = OBJECT_AND_DATA_PROPERTY_AXIOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Key For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FOR_FEATURE_COUNT = OBJECT_AND_DATA_PROPERTY_AXIOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnonymousIndividualAnnotationImpl <em>Anonymous Individual Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnonymousIndividualAnnotationImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnonymousIndividualAnnotation()
   * @generated
   */
  int ANONYMOUS_INDIVIDUAL_ANNOTATION = 84;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_INDIVIDUAL_ANNOTATION__AXIOM_ANNOTATIONS = AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Anonymous Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL = AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Anonymous Indiviudal Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS = AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Anonymous Individual Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_INDIVIDUAL_ANNOTATION_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ExpressionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 85;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyDocumentImpl <em>Ontology Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyDocumentImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getOntologyDocument()
   * @generated
   */
  int ONTOLOGY_DOCUMENT = 86;

  /**
   * The feature id for the '<em><b>Ontology</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_DOCUMENT__ONTOLOGY = 0;

  /**
   * The feature id for the '<em><b>Prefix Definition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_DOCUMENT__PREFIX_DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Ontology Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_DOCUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PrefixDefinitionImpl <em>Prefix Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PrefixDefinitionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getPrefixDefinition()
   * @generated
   */
  int PREFIX_DEFINITION = 87;

  /**
   * The feature id for the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_DEFINITION__PREF = 0;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_DEFINITION__NAMESPACE = 1;

  /**
   * The number of structural features of the '<em>Prefix Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTemplateParameter()
   * @generated
   */
  int TEMPLATE_PARAMETER = 88;

  /**
   * The feature id for the '<em><b>Owned Parametered Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Signature</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER__SIGNATURE = 1;

  /**
   * The feature id for the '<em><b>Parametered Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER__PARAMETERED_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Template Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ParameterableElementImpl <em>Parameterable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ParameterableElementImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getParameterableElement()
   * @generated
   */
  int PARAMETERABLE_ELEMENT = 89;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER = 1;

  /**
   * The number of structural features of the '<em>Parameterable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERABLE_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateSignatureImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTemplateSignature()
   * @generated
   */
  int TEMPLATE_SIGNATURE = 90;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SIGNATURE__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SIGNATURE__OWNED_PARAMETER = 1;

  /**
   * The feature id for the '<em><b>Template</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SIGNATURE__TEMPLATE = 2;

  /**
   * The number of structural features of the '<em>Template Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SIGNATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateableElementImpl <em>Templateable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateableElementImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTemplateableElement()
   * @generated
   */
  int TEMPLATEABLE_ELEMENT = 91;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE = 0;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING = 1;

  /**
   * The number of structural features of the '<em>Templateable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATEABLE_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PackageImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 92;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__OWNED_TEMPLATE_SIGNATURE = TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__TEMPLATE_BINDING = TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__EXPRESSIONS = TEMPLATEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__AXIOMS = TEMPLATEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Package Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__PACKAGE_URI = TEMPLATEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = TEMPLATEABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassifierTemplateParameterImpl <em>Classifier Template Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassifierTemplateParameterImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClassifierTemplateParameter()
   * @generated
   */
  int CLASSIFIER_TEMPLATE_PARAMETER = 93;

  /**
   * The feature id for the '<em><b>Owned Parametered Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT = TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT;

  /**
   * The feature id for the '<em><b>Signature</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE = TEMPLATE_PARAMETER__SIGNATURE;

  /**
   * The feature id for the '<em><b>Parametered Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT = TEMPLATE_PARAMETER__PARAMETERED_ELEMENT;

  /**
   * The number of structural features of the '<em>Classifier Template Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_TEMPLATE_PARAMETER_FEATURE_COUNT = TEMPLATE_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterSubstitutionImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTemplateParameterSubstitution()
   * @generated
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION = 94;

  /**
   * The feature id for the '<em><b>Actual</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL = 0;

  /**
   * The feature id for the '<em><b>Formal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL = 1;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING = 2;

  /**
   * The number of structural features of the '<em>Template Parameter Substitution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateBindingImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTemplateBinding()
   * @generated
   */
  int TEMPLATE_BINDING = 95;

  /**
   * The feature id for the '<em><b>Parameter Substitution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING__PARAMETER_SUBSTITUTION = 0;

  /**
   * The feature id for the '<em><b>Bound Element</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING__BOUND_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING__SIGNATURE = 2;

  /**
   * The number of structural features of the '<em>Template Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DObjectImpl <em>DObject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DObjectImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDObject()
   * @generated
   */
  int DOBJECT = 96;

  /**
   * The number of structural features of the '<em>DObject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IObjectImpl <em>IObject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IObjectImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getIObject()
   * @generated
   */
  int IOBJECT = 97;

  /**
   * The number of structural features of the '<em>IObject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IOBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.RuleImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getRule()
   * @generated
   */
  int RULE = 98;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__AXIOM_ANNOTATIONS = AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Has Antecedent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__HAS_ANTECEDENT = AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Consequent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__HAS_CONSEQUENT = AXIOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Swrl Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__SWRL_VARIABLES = AXIOM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = AXIOM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AntecedentImpl <em>Antecedent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AntecedentImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAntecedent()
   * @generated
   */
  int ANTECEDENT = 99;

  /**
   * The feature id for the '<em><b>Contains Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTECEDENT__CONTAINS_ATOMS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTECEDENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Antecedent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTECEDENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ConsequentImpl <em>Consequent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ConsequentImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getConsequent()
   * @generated
   */
  int CONSEQUENT = 100;

  /**
   * The feature id for the '<em><b>Contains Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSEQUENT__CONTAINS_ATOMS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSEQUENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Consequent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSEQUENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AtomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 101;

  /**
   * The feature id for the '<em><b>Is In Consequent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__IS_IN_CONSEQUENT = 0;

  /**
   * The feature id for the '<em><b>Is In Antecedent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__IS_IN_ANTECEDENT = 1;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataRangeAtomImpl <em>Data Range Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataRangeAtomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataRangeAtom()
   * @generated
   */
  int DATA_RANGE_ATOM = 102;

  /**
   * The feature id for the '<em><b>Is In Consequent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_ATOM__IS_IN_CONSEQUENT = ATOM__IS_IN_CONSEQUENT;

  /**
   * The feature id for the '<em><b>Is In Antecedent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_ATOM__IS_IN_ANTECEDENT = ATOM__IS_IN_ANTECEDENT;

  /**
   * The feature id for the '<em><b>Has Predicate Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_ATOM__HAS_PREDICATE_SYMBOL = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_ATOM__HAS_TERM = ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Range Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAtomImpl <em>Class Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAtomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClassAtom()
   * @generated
   */
  int CLASS_ATOM = 103;

  /**
   * The feature id for the '<em><b>Is In Consequent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATOM__IS_IN_CONSEQUENT = ATOM__IS_IN_CONSEQUENT;

  /**
   * The feature id for the '<em><b>Is In Antecedent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATOM__IS_IN_ANTECEDENT = ATOM__IS_IN_ANTECEDENT;

  /**
   * The feature id for the '<em><b>Has Predicate Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATOM__HAS_PREDICATE_SYMBOL = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATOM__HAS_TERM = ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PropertyAtomImpl <em>Property Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PropertyAtomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getPropertyAtom()
   * @generated
   */
  int PROPERTY_ATOM = 104;

  /**
   * The feature id for the '<em><b>Is In Consequent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ATOM__IS_IN_CONSEQUENT = ATOM__IS_IN_CONSEQUENT;

  /**
   * The feature id for the '<em><b>Is In Antecedent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ATOM__IS_IN_ANTECEDENT = ATOM__IS_IN_ANTECEDENT;

  /**
   * The number of structural features of the '<em>Property Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualPropetyAtomImpl <em>Individual Propety Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualPropetyAtomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getIndividualPropetyAtom()
   * @generated
   */
  int INDIVIDUAL_PROPETY_ATOM = 105;

  /**
   * The feature id for the '<em><b>Is In Consequent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_PROPETY_ATOM__IS_IN_CONSEQUENT = PROPERTY_ATOM__IS_IN_CONSEQUENT;

  /**
   * The feature id for the '<em><b>Is In Antecedent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_PROPETY_ATOM__IS_IN_ANTECEDENT = PROPERTY_ATOM__IS_IN_ANTECEDENT;

  /**
   * The feature id for the '<em><b>Has Predicate Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL = PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Atom Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET = PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Atom Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE = PROPERTY_ATOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Individual Propety Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_PROPETY_ATOM_FEATURE_COUNT = PROPERTY_ATOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatavaluedPropertyAtomImpl <em>Datavalued Property Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatavaluedPropertyAtomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDatavaluedPropertyAtom()
   * @generated
   */
  int DATAVALUED_PROPERTY_ATOM = 106;

  /**
   * The feature id for the '<em><b>Is In Consequent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAVALUED_PROPERTY_ATOM__IS_IN_CONSEQUENT = PROPERTY_ATOM__IS_IN_CONSEQUENT;

  /**
   * The feature id for the '<em><b>Is In Antecedent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAVALUED_PROPERTY_ATOM__IS_IN_ANTECEDENT = PROPERTY_ATOM__IS_IN_ANTECEDENT;

  /**
   * The feature id for the '<em><b>Has Predicate Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL = PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Atom Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAVALUED_PROPERTY_ATOM__ATOM_TARGET = PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Atom Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE = PROPERTY_ATOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Datavalued Property Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAVALUED_PROPERTY_ATOM_FEATURE_COUNT = PROPERTY_ATOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.VariableImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 108;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataVariableImpl <em>Data Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataVariableImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataVariable()
   * @generated
   */
  int DATA_VARIABLE = 109;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VARIABLE__NAME = VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>Data Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualVariableImpl <em>Individual Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualVariableImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getIndividualVariable()
   * @generated
   */
  int INDIVIDUAL_VARIABLE = 110;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_VARIABLE__NAME = VARIABLE__NAME;

  /**
   * The number of structural features of the '<em>Individual Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.BuiltInAtomImpl <em>Built In Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.BuiltInAtomImpl
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getBuiltInAtom()
   * @generated
   */
  int BUILT_IN_ATOM = 112;

  /**
   * The feature id for the '<em><b>Is In Consequent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM__IS_IN_CONSEQUENT = ATOM__IS_IN_CONSEQUENT;

  /**
   * The feature id for the '<em><b>Is In Antecedent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM__IS_IN_ANTECEDENT = ATOM__IS_IN_ANTECEDENT;

  /**
   * The feature id for the '<em><b>Has Predicate Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM__HAS_PREDICATE_SYMBOL = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM__HAS_TERMS = ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Built In Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps <em>Data Type Maps</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataTypeMaps()
   * @generated
   */
  int DATA_TYPE_MAPS = 113;

  /**
   * The meta object id for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID <em>Built In ID</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getBuiltInID()
   * @generated
   */
  int BUILT_IN_ID = 114;


  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Assertion
   * @generated
   */
  EClass getAssertion();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom <em>Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Axiom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom
   * @generated
   */
  EClass getAxiom();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom#getAxiomAnnotations <em>Axiom Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Axiom Annotations</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom#getAxiomAnnotations()
   * @see #getAxiom()
   * @generated
   */
  EReference getAxiom_AxiomAnnotations();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation#getAnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation#getAnnotationProperty()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_AnnotationProperty();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty
   * @generated
   */
  EClass getAnnotationProperty();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Entity#getEntityURI <em>Entity URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity URI</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Entity#getEntityURI()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_EntityURI();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URI</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.URI
   * @generated
   */
  EClass getURI();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.URI#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.URI#getValue()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_Value();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Literal#getLexicalValue <em>Lexical Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lexical Value</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Literal#getLexicalValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_LexicalValue();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Literal#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Literal#getDatatype()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Datatype();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype
   * @generated
   */
  EClass getDatatype();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Type</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype#getDataType()
   * @see #getDatatype()
   * @generated
   */
  EAttribute getDatatype_DataType();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataRange
   * @generated
   */
  EClass getDataRange();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataRange#getArity <em>Arity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arity</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataRange#getArity()
   * @see #getDataRange()
   * @generated
   */
  EAttribute getDataRange_Arity();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAxiom <em>Data Property Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Axiom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAxiom
   * @generated
   */
  EClass getDataPropertyAxiom();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAxiom <em>Object Property Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Axiom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAxiom
   * @generated
   */
  EClass getObjectPropertyAxiom();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassExpression
   * @generated
   */
  EClass getClassExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAxiom <em>Class Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Axiom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAxiom
   * @generated
   */
  EClass getClassAxiom();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression
   * @generated
   */
  EClass getDataPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression
   * @generated
   */
  EClass getObjectPropertyExpression();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsFunctional <em>Is Functional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Functional</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsFunctional()
   * @see #getObjectPropertyExpression()
   * @generated
   */
  EAttribute getObjectPropertyExpression_IsFunctional();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsReflexive <em>Is Reflexive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Reflexive</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsReflexive()
   * @see #getObjectPropertyExpression()
   * @generated
   */
  EAttribute getObjectPropertyExpression_IsReflexive();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsInverseFunctional <em>Is Inverse Functional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Inverse Functional</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsInverseFunctional()
   * @see #getObjectPropertyExpression()
   * @generated
   */
  EAttribute getObjectPropertyExpression_IsInverseFunctional();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsIrreflexive <em>Is Irreflexive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Irreflexive</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsIrreflexive()
   * @see #getObjectPropertyExpression()
   * @generated
   */
  EAttribute getObjectPropertyExpression_IsIrreflexive();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsSymmetric <em>Is Symmetric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Symmetric</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsSymmetric()
   * @see #getObjectPropertyExpression()
   * @generated
   */
  EAttribute getObjectPropertyExpression_IsSymmetric();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsTransitive <em>Is Transitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Transitive</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsTransitive()
   * @see #getObjectPropertyExpression()
   * @generated
   */
  EAttribute getObjectPropertyExpression_IsTransitive();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsAsysmmetric <em>Is Asysmmetric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Asysmmetric</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression#isIsAsysmmetric()
   * @see #getObjectPropertyExpression()
   * @generated
   */
  EAttribute getObjectPropertyExpression_IsAsysmmetric();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty <em>Asymmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asymmetric Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty
   * @generated
   */
  EClass getAsymmetricObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty#getObjectPropertyExpression()
   * @see #getAsymmetricObjectProperty()
   * @generated
   */
  EReference getAsymmetricObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty
   * @generated
   */
  EClass getObjectProperty();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty <em>Inverse Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty
   * @generated
   */
  EClass getInverseObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty#getObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty#getObjectProperty()
   * @see #getInverseObjectProperty()
   * @generated
   */
  EReference getInverseObjectProperty_ObjectProperty();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Intersection Of</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf
   * @generated
   */
  EClass getObjectIntersectionOf();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf#getClassExpressions()
   * @see #getObjectIntersectionOf()
   * @generated
   */
  EReference getObjectIntersectionOf_ClassExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf <em>Object One Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object One Of</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf
   * @generated
   */
  EClass getObjectOneOf();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf#getIndividuals <em>Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Individuals</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf#getIndividuals()
   * @see #getObjectOneOf()
   * @generated
   */
  EReference getObjectOneOf_Individuals();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Individual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Individual
   * @generated
   */
  EClass getIndividual();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual <em>Named Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual
   * @generated
   */
  EClass getNamedIndividual();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Some Values From</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom
   * @generated
   */
  EClass getObjectSomeValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom#getClassExpression()
   * @see #getObjectSomeValuesFrom()
   * @generated
   */
  EReference getObjectSomeValuesFrom_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom#getObjectPropertyExpression()
   * @see #getObjectSomeValuesFrom()
   * @generated
   */
  EReference getObjectSomeValuesFrom_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom <em>Object All Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object All Values From</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom
   * @generated
   */
  EClass getObjectAllValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom#getClassExpression()
   * @see #getObjectAllValuesFrom()
   * @generated
   */
  EReference getObjectAllValuesFrom_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom#getObjectPropertyExpression()
   * @see #getObjectAllValuesFrom()
   * @generated
   */
  EReference getObjectAllValuesFrom_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf <em>Object Exists Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Exists Self</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf
   * @generated
   */
  EClass getObjectExistsSelf();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf#getObjectPropertyExpression()
   * @see #getObjectExistsSelf()
   * @generated
   */
  EReference getObjectExistsSelf_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue <em>Object Has Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Has Value</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue
   * @generated
   */
  EClass getObjectHasValue();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue#getObjectPropertyExpression()
   * @see #getObjectHasValue()
   * @generated
   */
  EReference getObjectHasValue_ObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue#getIndividual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue#getIndividual()
   * @see #getObjectHasValue()
   * @generated
   */
  EReference getObjectHasValue_Individual();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Min Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality
   * @generated
   */
  EClass getObjectMinCardinality();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality#getCardinality()
   * @see #getObjectMinCardinality()
   * @generated
   */
  EAttribute getObjectMinCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality#getClassExpression()
   * @see #getObjectMinCardinality()
   * @generated
   */
  EReference getObjectMinCardinality_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality#getObjectPropertyExpression()
   * @see #getObjectMinCardinality()
   * @generated
   */
  EReference getObjectMinCardinality_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Max Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality
   * @generated
   */
  EClass getObjectMaxCardinality();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality#getCardinality()
   * @see #getObjectMaxCardinality()
   * @generated
   */
  EAttribute getObjectMaxCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality#getClassExpression()
   * @see #getObjectMaxCardinality()
   * @generated
   */
  EReference getObjectMaxCardinality_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality#getObjectPropertyExpression()
   * @see #getObjectMaxCardinality()
   * @generated
   */
  EReference getObjectMaxCardinality_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom <em>Data Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Some Values From</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom
   * @generated
   */
  EClass getDataSomeValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom#getDataRange()
   * @see #getDataSomeValuesFrom()
   * @generated
   */
  EReference getDataSomeValuesFrom_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom#getDataPropertyExpressions()
   * @see #getDataSomeValuesFrom()
   * @generated
   */
  EReference getDataSomeValuesFrom_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty <em>Data Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty
   * @generated
   */
  EClass getDataProperty();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf <em>Data One Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data One Of</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf
   * @generated
   */
  EClass getDataOneOf();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf#getConstants()
   * @see #getDataOneOf()
   * @generated
   */
  EReference getDataOneOf_Constants();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction <em>Datatype Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype Restriction</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction
   * @generated
   */
  EClass getDatatypeRestriction();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction#getDatatype()
   * @see #getDatatypeRestriction()
   * @generated
   */
  EReference getDatatypeRestriction_Datatype();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction#getRestrictions()
   * @see #getDatatypeRestriction()
   * @generated
   */
  EReference getDatatypeRestriction_Restrictions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair <em>Facet Constant Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet Constant Pair</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair
   * @generated
   */
  EClass getFacetConstantPair();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair#getConstant()
   * @see #getFacetConstantPair()
   * @generated
   */
  EReference getFacetConstantPair_Constant();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair#getFacet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Facet</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair#getFacet()
   * @see #getFacetConstantPair()
   * @generated
   */
  EAttribute getFacetConstantPair_Facet();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom <em>Data All Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data All Values From</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom
   * @generated
   */
  EClass getDataAllValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom#getDataRange()
   * @see #getDataAllValuesFrom()
   * @generated
   */
  EReference getDataAllValuesFrom_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom#getDataPropertyExpressions()
   * @see #getDataAllValuesFrom()
   * @generated
   */
  EReference getDataAllValuesFrom_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue <em>Data Has Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Has Value</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue
   * @generated
   */
  EClass getDataHasValue();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue#getConstant()
   * @see #getDataHasValue()
   * @generated
   */
  EReference getDataHasValue_Constant();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue#getDataPropertyExpression()
   * @see #getDataHasValue()
   * @generated
   */
  EReference getDataHasValue_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality <em>Data Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Min Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality
   * @generated
   */
  EClass getDataMinCardinality();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality#getCardinality()
   * @see #getDataMinCardinality()
   * @generated
   */
  EAttribute getDataMinCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality#getDataRange()
   * @see #getDataMinCardinality()
   * @generated
   */
  EReference getDataMinCardinality_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality#getDataPropertyExpression()
   * @see #getDataMinCardinality()
   * @generated
   */
  EReference getDataMinCardinality_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality <em>Data Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Max Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality
   * @generated
   */
  EClass getDataMaxCardinality();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality#getCardinality()
   * @see #getDataMaxCardinality()
   * @generated
   */
  EAttribute getDataMaxCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality#getDataRange()
   * @see #getDataMaxCardinality()
   * @generated
   */
  EReference getDataMaxCardinality_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality#getDataPropertyExpression()
   * @see #getDataMaxCardinality()
   * @generated
   */
  EReference getDataMaxCardinality_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality <em>Data Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Exact Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality
   * @generated
   */
  EClass getDataExactCardinality();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality#getCardinality()
   * @see #getDataExactCardinality()
   * @generated
   */
  EAttribute getDataExactCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality#getDataRange()
   * @see #getDataExactCardinality()
   * @generated
   */
  EReference getDataExactCardinality_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality#getDataPropertyExpression()
   * @see #getDataExactCardinality()
   * @generated
   */
  EReference getDataExactCardinality_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Data Property Assertion</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion
   * @generated
   */
  EClass getNegativeDataPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion#getDataPropertyExpression()
   * @see #getNegativeDataPropertyAssertion()
   * @generated
   */
  EReference getNegativeDataPropertyAssertion_DataPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Value</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion#getTargetValue()
   * @see #getNegativeDataPropertyAssertion()
   * @generated
   */
  EReference getNegativeDataPropertyAssertion_TargetValue();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion#getSourceIndividual()
   * @see #getNegativeDataPropertyAssertion()
   * @generated
   */
  EReference getNegativeDataPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain <em>Data Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Domain</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain
   * @generated
   */
  EClass getDataPropertyDomain();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain#getDomain()
   * @see #getDataPropertyDomain()
   * @generated
   */
  EReference getDataPropertyDomain_Domain();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain#getDataPropertyExpression()
   * @see #getDataPropertyDomain()
   * @generated
   */
  EReference getDataPropertyDomain_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange <em>Data Property Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange
   * @generated
   */
  EClass getDataPropertyRange();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange#getRange()
   * @see #getDataPropertyRange()
   * @generated
   */
  EReference getDataPropertyRange_Range();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange#getDataPropertyExpression()
   * @see #getDataPropertyRange()
   * @generated
   */
  EReference getDataPropertyRange_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals <em>Different Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Different Individuals</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals
   * @generated
   */
  EClass getDifferentIndividuals();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals#getDifferentIndividuals <em>Different Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Different Individuals</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals#getDifferentIndividuals()
   * @see #getDifferentIndividuals()
   * @generated
   */
  EReference getDifferentIndividuals_DifferentIndividuals();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses <em>Disjoint Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Classes</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses
   * @generated
   */
  EClass getDisjointClasses();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disjoint Class Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses#getDisjointClassExpressions()
   * @see #getDisjointClasses()
   * @generated
   */
  EReference getDisjointClasses_DisjointClassExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties <em>Disjoint Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Data Properties</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties
   * @generated
   */
  EClass getDisjointDataProperties();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties#getDataPropertyExpressions()
   * @see #getDisjointDataProperties()
   * @generated
   */
  EReference getDisjointDataProperties_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties <em>Disjoint Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Object Properties</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties
   * @generated
   */
  EClass getDisjointObjectProperties();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties#getObjectPropertyExpressions()
   * @see #getDisjointObjectProperties()
   * @generated
   */
  EReference getDisjointObjectProperties_ObjectPropertyExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion <em>Disjoint Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Union</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion
   * @generated
   */
  EClass getDisjointUnion();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion#getUnionClass <em>Union Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Union Class</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion#getUnionClass()
   * @see #getDisjointUnion()
   * @generated
   */
  EReference getDisjointUnion_UnionClass();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disjoint Class Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion#getDisjointClassExpressions()
   * @see #getDisjointUnion()
   * @generated
   */
  EReference getDisjointUnion_DisjointClassExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses <em>Equivalent Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Classes</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses
   * @generated
   */
  EClass getEquivalentClasses();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses#getEquivalentClassExpressions <em>Equivalent Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Equivalent Class Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses#getEquivalentClassExpressions()
   * @see #getEquivalentClasses()
   * @generated
   */
  EReference getEquivalentClasses_EquivalentClassExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties <em>Equivalent Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Data Properties</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties
   * @generated
   */
  EClass getEquivalentDataProperties();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties#getDataPropertyExpressions()
   * @see #getEquivalentDataProperties()
   * @generated
   */
  EReference getEquivalentDataProperties_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Object Properties</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties
   * @generated
   */
  EClass getEquivalentObjectProperties();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties#getObjectPropertyExpressions()
   * @see #getEquivalentObjectProperties()
   * @generated
   */
  EReference getEquivalentObjectProperties_ObjectPropertyExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty <em>Functional Data Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functional Data Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty
   * @generated
   */
  EClass getFunctionalDataProperty();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty#getDataPropertyExpression()
   * @see #getFunctionalDataProperty()
   * @generated
   */
  EReference getFunctionalDataProperty_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty <em>Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functional Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty
   * @generated
   */
  EClass getFunctionalObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty#getObjectPropertyExpression()
   * @see #getFunctionalObjectProperty()
   * @generated
   */
  EReference getFunctionalObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Functional Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty
   * @generated
   */
  EClass getInverseFunctionalObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty#getObjectPropertyExpression()
   * @see #getInverseFunctionalObjectProperty()
   * @generated
   */
  EReference getInverseFunctionalObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Assertion</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion
   * @generated
   */
  EClass getObjectPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion#getObjectPropertyExpression()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
  EReference getObjectPropertyAssertion_ObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion#getSourceIndividual()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
  EReference getObjectPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion#getTargetIndividual()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
  EReference getObjectPropertyAssertion_TargetIndividual();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Object Property Assertion</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion
   * @generated
   */
  EClass getNegativeObjectPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion#getObjectPropertyExpression()
   * @see #getNegativeObjectPropertyAssertion()
   * @generated
   */
  EReference getNegativeObjectPropertyAssertion_ObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion#getSourceIndividual()
   * @see #getNegativeObjectPropertyAssertion()
   * @generated
   */
  EReference getNegativeObjectPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion#getTargetIndividual()
   * @see #getNegativeObjectPropertyAssertion()
   * @generated
   */
  EReference getNegativeObjectPropertyAssertion_TargetIndividual();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain <em>Object Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Domain</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain
   * @generated
   */
  EClass getObjectPropertyDomain();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain#getDomain()
   * @see #getObjectPropertyDomain()
   * @generated
   */
  EReference getObjectPropertyDomain_Domain();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain#getObjectPropertyExpression()
   * @see #getObjectPropertyDomain()
   * @generated
   */
  EReference getObjectPropertyDomain_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symmetric Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty
   * @generated
   */
  EClass getSymmetricObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty#getObjectPropertyExpression()
   * @see #getSymmetricObjectProperty()
   * @generated
   */
  EReference getSymmetricObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reflexive Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty
   * @generated
   */
  EClass getReflexiveObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty#getObjectPropertyExpression()
   * @see #getReflexiveObjectProperty()
   * @generated
   */
  EReference getReflexiveObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Data Property Of</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf
   * @generated
   */
  EClass getSubDataPropertyOf();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf#getSuperDataPropertyExpression <em>Super Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf#getSuperDataPropertyExpression()
   * @see #getSubDataPropertyOf()
   * @generated
   */
  EReference getSubDataPropertyOf_SuperDataPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf#getSubDataPropertyExpression <em>Sub Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf#getSubDataPropertyExpression()
   * @see #getSubDataPropertyOf()
   * @generated
   */
  EReference getSubDataPropertyOf_SubDataPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual <em>Same Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Same Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual
   * @generated
   */
  EClass getSameIndividual();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual#getSameIndividuals <em>Same Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Same Individuals</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual#getSameIndividuals()
   * @see #getSameIndividual()
   * @generated
   */
  EReference getSameIndividual_SameIndividuals();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Object Property Of</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf
   * @generated
   */
  EClass getSubObjectPropertyOf();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf#getSuperObjectPropertyExpression()
   * @see #getSubObjectPropertyOf()
   * @generated
   */
  EReference getSubObjectPropertyOf_SuperObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf#getSubObjectPropertyExpressions <em>Sub Object Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Object Property Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf#getSubObjectPropertyExpressions()
   * @see #getSubObjectPropertyOf()
   * @generated
   */
  EReference getSubObjectPropertyOf_SubObjectPropertyExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf <em>Object Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Complement Of</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf
   * @generated
   */
  EClass getObjectComplementOf();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf#getClassExpression()
   * @see #getObjectComplementOf()
   * @generated
   */
  EReference getObjectComplementOf_ClassExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology <em>Ontology</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ontology</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology
   * @generated
   */
  EClass getOntology();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getOntologyAnnotations <em>Ontology Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ontology Annotations</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getOntologyAnnotations()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_OntologyAnnotations();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getAxioms <em>Axioms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Axioms</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getAxioms()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_Axioms();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getImportedOntologies <em>Imported Ontologies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imported Ontologies</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getImportedOntologies()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_ImportedOntologies();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getExpressions()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_Expressions();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getOntologyURI <em>Ontology URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ontology URI</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getOntologyURI()
   * @see #getOntology()
   * @generated
   */
  EAttribute getOntology_OntologyURI();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getVersionURI <em>Version URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version URI</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getVersionURI()
   * @see #getOntology()
   * @generated
   */
  EAttribute getOntology_VersionURI();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology#getPackages()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_Packages();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange <em>Object Property Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange
   * @generated
   */
  EClass getObjectPropertyRange();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange#getRange()
   * @see #getObjectPropertyRange()
   * @generated
   */
  EReference getObjectPropertyRange_Range();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange#getObjectPropertyExpression()
   * @see #getObjectPropertyRange()
   * @generated
   */
  EReference getObjectPropertyRange_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion <em>Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Assertion</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion
   * @generated
   */
  EClass getDataPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion#getDataPropertyExpression()
   * @see #getDataPropertyAssertion()
   * @generated
   */
  EReference getDataPropertyAssertion_DataPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Value</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion#getTargetValue()
   * @see #getDataPropertyAssertion()
   * @generated
   */
  EReference getDataPropertyAssertion_TargetValue();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion#getSourceIndividual()
   * @see #getDataPropertyAssertion()
   * @generated
   */
  EReference getDataPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion <em>Class Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Assertion</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion
   * @generated
   */
  EClass getClassAssertion();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion#getIndividual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion#getIndividual()
   * @see #getClassAssertion()
   * @generated
   */
  EReference getClassAssertion_Individual();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion#getClassExpression()
   * @see #getClassAssertion()
   * @generated
   */
  EReference getClassAssertion_ClassExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Irreflexive Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty
   * @generated
   */
  EClass getIrreflexiveObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty#getObjectPropertyExpression()
   * @see #getIrreflexiveObjectProperty()
   * @generated
   */
  EReference getIrreflexiveObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Exact Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality
   * @generated
   */
  EClass getObjectExactCardinality();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality#getCardinality()
   * @see #getObjectExactCardinality()
   * @generated
   */
  EAttribute getObjectExactCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality#getClassExpression()
   * @see #getObjectExactCardinality()
   * @generated
   */
  EReference getObjectExactCardinality_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality#getObjectPropertyExpression()
   * @see #getObjectExactCardinality()
   * @generated
   */
  EReference getObjectExactCardinality_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf <em>Data Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Complement Of</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf
   * @generated
   */
  EClass getDataComplementOf();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf#getDataRange()
   * @see #getDataComplementOf()
   * @generated
   */
  EReference getDataComplementOf_DataRange();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf <em>Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Class Of</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf
   * @generated
   */
  EClass getSubClassOf();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf#getSubClassExpression <em>Sub Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf#getSubClassExpression()
   * @see #getSubClassOf()
   * @generated
   */
  EReference getSubClassOf_SubClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf#getSuperClassExpression <em>Super Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf#getSuperClassExpression()
   * @see #getSubClassOf()
   * @generated
   */
  EReference getSubClassOf_SuperClassExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectProperty <em>Sub Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectProperty
   * @generated
   */
  EClass getSubObjectProperty();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transitive Object Property</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty
   * @generated
   */
  EClass getTransitiveObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty#getObjectPropertyExpression()
   * @see #getTransitiveObjectProperty()
   * @generated
   */
  EReference getTransitiveObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation <em>Entity Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Annotation</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation
   * @generated
   */
  EClass getEntityAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation#getEntity()
   * @see #getEntityAnnotation()
   * @generated
   */
  EReference getEntityAnnotation_Entity();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation#getEntityAnnotations <em>Entity Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity Annotations</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation#getEntityAnnotations()
   * @see #getEntityAnnotation()
   * @generated
   */
  EReference getEntityAnnotation_EntityAnnotations();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI <em>Full URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Full URI</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI
   * @generated
   */
  EClass getFullURI();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI#getIri <em>Iri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iri</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI#getIri()
   * @see #getFullURI()
   * @generated
   */
  EAttribute getFullURI_Iri();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI <em>Abbreviated URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abbreviated URI</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI
   * @generated
   */
  EClass getAbbreviatedURI();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI#getLocalName <em>Local Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Local Name</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI#getLocalName()
   * @see #getAbbreviatedURI()
   * @generated
   */
  EAttribute getAbbreviatedURI_LocalName();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf <em>Object Union Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Union Of</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf
   * @generated
   */
  EClass getObjectUnionOf();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf#getClassExpressions()
   * @see #getObjectUnionOf()
   * @generated
   */
  EReference getObjectUnionOf_ClassExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties <em>Inverse Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Object Properties</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties
   * @generated
   */
  EClass getInverseObjectProperties();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties#getObjectPropertyExpression1 <em>Object Property Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression1</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties#getObjectPropertyExpression1()
   * @see #getInverseObjectProperties()
   * @generated
   */
  EReference getInverseObjectProperties_ObjectPropertyExpression1();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties#getObjectPropertyExpression2 <em>Object Property Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression2</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties#getObjectPropertyExpression2()
   * @see #getInverseObjectProperties()
   * @generated
   */
  EReference getInverseObjectProperties_ObjectPropertyExpression2();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant <em>Annotation By Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation By Constant</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant
   * @generated
   */
  EClass getAnnotationByConstant();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant#getAnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Value</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant#getAnnotationValue()
   * @see #getAnnotationByConstant()
   * @generated
   */
  EReference getAnnotationByConstant_AnnotationValue();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByEntity <em>Annotation By Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation By Entity</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByEntity
   * @generated
   */
  EClass getAnnotationByEntity();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByEntity#getAnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Value</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByEntity#getAnnotationValue()
   * @see #getAnnotationByEntity()
   * @generated
   */
  EReference getAnnotationByEntity_AnnotationValue();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByAnonymousIndividual <em>Annotation By Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation By Anonymous Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByAnonymousIndividual
   * @generated
   */
  EClass getAnnotationByAnonymousIndividual();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByAnonymousIndividual#getAnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Value</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByAnonymousIndividual#getAnnotationValue()
   * @see #getAnnotationByAnonymousIndividual()
   * @generated
   */
  EReference getAnnotationByAnonymousIndividual_AnnotationValue();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual <em>Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anonymous Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual
   * @generated
   */
  EClass getAnonymousIndividual();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual#getNodeID <em>Node ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node ID</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual#getNodeID()
   * @see #getAnonymousIndividual()
   * @generated
   */
  EAttribute getAnonymousIndividual_NodeID();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#getEntity()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Entity();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsFunctional <em>Is Functional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Functional</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsFunctional()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_IsFunctional();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsReflexive <em>Is Reflexive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Reflexive</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsReflexive()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_IsReflexive();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsInverseFunctional <em>Is Inverse Functional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Inverse Functional</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsInverseFunctional()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_IsInverseFunctional();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsIrreflexive <em>Is Irreflexive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Irreflexive</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsIrreflexive()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_IsIrreflexive();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsSymmetric <em>Is Symmetric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Symmetric</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsSymmetric()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_IsSymmetric();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsTransitive <em>Is Transitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Transitive</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsTransitive()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_IsTransitive();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsAsysmmetric <em>Is Asysmmetric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Asysmmetric</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration#isIsAsysmmetric()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_IsAsysmmetric();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAndDataPropertyAxiom <em>Object And Data Property Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object And Data Property Axiom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAndDataPropertyAxiom
   * @generated
   */
  EClass getObjectAndDataPropertyAxiom();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor <em>Key For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key For</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor
   * @generated
   */
  EClass getKeyFor();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor#getClassExpression()
   * @see #getKeyFor()
   * @generated
   */
  EReference getKeyFor_ClassExpression();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor#getDataPropertyExpressions()
   * @see #getKeyFor()
   * @generated
   */
  EReference getKeyFor_DataPropertyExpressions();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor#getObjectPropertyExpressions()
   * @see #getKeyFor()
   * @generated
   */
  EReference getKeyFor_ObjectPropertyExpressions();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation <em>Anonymous Individual Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anonymous Individual Annotation</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation
   * @generated
   */
  EClass getAnonymousIndividualAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation#getAnonymousIndividual <em>Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anonymous Individual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation#getAnonymousIndividual()
   * @see #getAnonymousIndividualAnnotation()
   * @generated
   */
  EReference getAnonymousIndividualAnnotation_AnonymousIndividual();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation#getAnonymousIndiviudalAnnotations <em>Anonymous Indiviudal Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Anonymous Indiviudal Annotations</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation#getAnonymousIndiviudalAnnotations()
   * @see #getAnonymousIndividualAnnotation()
   * @generated
   */
  EReference getAnonymousIndividualAnnotation_AnonymousIndiviudalAnnotations();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument <em>Ontology Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ontology Document</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument
   * @generated
   */
  EClass getOntologyDocument();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument#getOntology <em>Ontology</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ontology</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument#getOntology()
   * @see #getOntologyDocument()
   * @generated
   */
  EReference getOntologyDocument_Ontology();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument#getPrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefix Definition</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument#getPrefixDefinition()
   * @see #getOntologyDocument()
   * @generated
   */
  EReference getOntologyDocument_PrefixDefinition();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Definition</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition
   * @generated
   */
  EClass getPrefixDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition#getPref()
   * @see #getPrefixDefinition()
   * @generated
   */
  EAttribute getPrefixDefinition_Pref();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition#getNamespace()
   * @see #getPrefixDefinition()
   * @generated
   */
  EReference getPrefixDefinition_Namespace();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameter</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter
   * @generated
   */
  EClass getTemplateParameter();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Parametered Element</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getOwnedParameteredElement()
   * @see #getTemplateParameter()
   * @generated
   */
  EReference getTemplateParameter_OwnedParameteredElement();

  /**
   * Returns the meta object for the container reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Signature</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getSignature()
   * @see #getTemplateParameter()
   * @generated
   */
  EReference getTemplateParameter_Signature();

  /**
   * Returns the meta object for the reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parametered Element</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter#getParameteredElement()
   * @see #getTemplateParameter()
   * @generated
   */
  EReference getTemplateParameter_ParameteredElement();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement <em>Parameterable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameterable Element</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement
   * @generated
   */
  EClass getParameterableElement();

  /**
   * Returns the meta object for the container reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owning Template Parameter</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getOwningTemplateParameter()
   * @see #getParameterableElement()
   * @generated
   */
  EReference getParameterableElement_OwningTemplateParameter();

  /**
   * Returns the meta object for the reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Template Parameter</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement#getTemplateParameter()
   * @see #getParameterableElement()
   * @generated
   */
  EReference getParameterableElement_TemplateParameter();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature <em>Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Signature</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature
   * @generated
   */
  EClass getTemplateSignature();

  /**
   * Returns the meta object for the reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getParameter()
   * @see #getTemplateSignature()
   * @generated
   */
  EReference getTemplateSignature_Parameter();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getOwnedParameter()
   * @see #getTemplateSignature()
   * @generated
   */
  EReference getTemplateSignature_OwnedParameter();

  /**
   * Returns the meta object for the container reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Template</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature#getTemplate()
   * @see #getTemplateSignature()
   * @generated
   */
  EReference getTemplateSignature_Template();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement <em>Templateable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Templateable Element</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement
   * @generated
   */
  EClass getTemplateableElement();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Template Signature</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement#getOwnedTemplateSignature()
   * @see #getTemplateableElement()
   * @generated
   */
  EReference getTemplateableElement_OwnedTemplateSignature();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Binding</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement#getTemplateBinding()
   * @see #getTemplateableElement()
   * @generated
   */
  EReference getTemplateableElement_TemplateBinding();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Package#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Package#getExpressions()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Expressions();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Package#getAxioms <em>Axioms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Axioms</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Package#getAxioms()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Axioms();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Package#getPackageUri <em>Package Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Uri</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Package#getPackageUri()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_PackageUri();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Template Parameter</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassifierTemplateParameter
   * @generated
   */
  EClass getClassifierTemplateParameter();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameter Substitution</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution
   * @generated
   */
  EClass getTemplateParameterSubstitution();

  /**
   * Returns the meta object for the reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actual</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution#getActual()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_Actual();

  /**
   * Returns the meta object for the reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution#getFormal <em>Formal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Formal</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution#getFormal()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_Formal();

  /**
   * Returns the meta object for the container reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Template Binding</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution#getTemplateBinding()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_TemplateBinding();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Binding</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding
   * @generated
   */
  EClass getTemplateBinding();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Substitution</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getParameterSubstitution()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_ParameterSubstitution();

  /**
   * Returns the meta object for the container reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Bound Element</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getBoundElement()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_BoundElement();

  /**
   * Returns the meta object for the reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signature</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding#getSignature()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_Signature();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DObject <em>DObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DObject</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DObject
   * @generated
   */
  EClass getDObject();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IObject <em>IObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IObject</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IObject
   * @generated
   */
  EClass getIObject();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getHasAntecedent <em>Has Antecedent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Antecedent</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getHasAntecedent()
   * @see #getRule()
   * @generated
   */
  EReference getRule_HasAntecedent();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getHasConsequent <em>Has Consequent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Consequent</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getHasConsequent()
   * @see #getRule()
   * @generated
   */
  EReference getRule_HasConsequent();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getSwrlVariables <em>Swrl Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Swrl Variables</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getSwrlVariables()
   * @see #getRule()
   * @generated
   */
  EReference getRule_SwrlVariables();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent <em>Antecedent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Antecedent</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent
   * @generated
   */
  EClass getAntecedent();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent#getContainsAtoms <em>Contains Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contains Atoms</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent#getContainsAtoms()
   * @see #getAntecedent()
   * @generated
   */
  EReference getAntecedent_ContainsAtoms();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent#getName()
   * @see #getAntecedent()
   * @generated
   */
  EAttribute getAntecedent_Name();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent <em>Consequent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Consequent</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent
   * @generated
   */
  EClass getConsequent();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent#getContainsAtoms <em>Contains Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contains Atoms</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent#getContainsAtoms()
   * @see #getConsequent()
   * @generated
   */
  EReference getConsequent_ContainsAtoms();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent#getName()
   * @see #getConsequent()
   * @generated
   */
  EAttribute getConsequent_Name();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the container reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Atom#getIsInConsequent <em>Is In Consequent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Is In Consequent</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Atom#getIsInConsequent()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_IsInConsequent();

  /**
   * Returns the meta object for the container reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Atom#getIsInAntecedent <em>Is In Antecedent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Is In Antecedent</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Atom#getIsInAntecedent()
   * @see #getAtom()
   * @generated
   */
  EReference getAtom_IsInAntecedent();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom <em>Data Range Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Range Atom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom
   * @generated
   */
  EClass getDataRangeAtom();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Predicate Symbol</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom#getHasPredicateSymbol()
   * @see #getDataRangeAtom()
   * @generated
   */
  EReference getDataRangeAtom_HasPredicateSymbol();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom#getHasTerm <em>Has Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Term</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom#getHasTerm()
   * @see #getDataRangeAtom()
   * @generated
   */
  EReference getDataRangeAtom_HasTerm();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom <em>Class Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Atom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom
   * @generated
   */
  EClass getClassAtom();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Predicate Symbol</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom#getHasPredicateSymbol()
   * @see #getClassAtom()
   * @generated
   */
  EReference getClassAtom_HasPredicateSymbol();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom#getHasTerm <em>Has Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Term</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom#getHasTerm()
   * @see #getClassAtom()
   * @generated
   */
  EReference getClassAtom_HasTerm();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.PropertyAtom <em>Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Atom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.PropertyAtom
   * @generated
   */
  EClass getPropertyAtom();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom <em>Individual Propety Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Individual Propety Atom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom
   * @generated
   */
  EClass getIndividualPropetyAtom();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Predicate Symbol</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getHasPredicateSymbol()
   * @see #getIndividualPropetyAtom()
   * @generated
   */
  EReference getIndividualPropetyAtom_HasPredicateSymbol();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getAtomTarget <em>Atom Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atom Target</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getAtomTarget()
   * @see #getIndividualPropetyAtom()
   * @generated
   */
  EReference getIndividualPropetyAtom_AtomTarget();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getAtomSource <em>Atom Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atom Source</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom#getAtomSource()
   * @see #getIndividualPropetyAtom()
   * @generated
   */
  EReference getIndividualPropetyAtom_AtomSource();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom <em>Datavalued Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datavalued Property Atom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom
   * @generated
   */
  EClass getDatavaluedPropertyAtom();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Has Predicate Symbol</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getHasPredicateSymbol()
   * @see #getDatavaluedPropertyAtom()
   * @generated
   */
  EReference getDatavaluedPropertyAtom_HasPredicateSymbol();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getAtomTarget <em>Atom Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atom Target</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getAtomTarget()
   * @see #getDatavaluedPropertyAtom()
   * @generated
   */
  EReference getDatavaluedPropertyAtom_AtomTarget();

  /**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getAtomSource <em>Atom Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atom Source</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom#getAtomSource()
   * @see #getDatavaluedPropertyAtom()
   * @generated
   */
  EReference getDatavaluedPropertyAtom_AtomSource();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataVariable <em>Data Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Variable</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataVariable
   * @generated
   */
  EClass getDataVariable();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualVariable <em>Individual Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Individual Variable</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualVariable
   * @generated
   */
  EClass getIndividualVariable();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom <em>Built In Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Atom</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom
   * @generated
   */
  EClass getBuiltInAtom();

  /**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom#getHasPredicateSymbol <em>Has Predicate Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Predicate Symbol</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom#getHasPredicateSymbol()
   * @see #getBuiltInAtom()
   * @generated
   */
  EAttribute getBuiltInAtom_HasPredicateSymbol();

  /**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom#getHasTerms <em>Has Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Has Terms</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom#getHasTerms()
   * @see #getBuiltInAtom()
   * @generated
   */
  EReference getBuiltInAtom_HasTerms();

  /**
   * Returns the meta object for enum '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps <em>Data Type Maps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Type Maps</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps
   * @generated
   */
  EEnum getDataTypeMaps();

  /**
   * Returns the meta object for enum '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID <em>Built In ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Built In ID</em>'.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID
   * @generated
   */
  EEnum getBuiltInID();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Owl2fsFactory getOwl2fsFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AssertionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAssertion()
     * @generated
     */
    EClass ASSERTION = eINSTANCE.getAssertion();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AxiomImpl <em>Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AxiomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAxiom()
     * @generated
     */
    EClass AXIOM = eINSTANCE.getAxiom();

    /**
     * The meta object literal for the '<em><b>Axiom Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AXIOM__AXIOM_ANNOTATIONS = eINSTANCE.getAxiom_AxiomAnnotations();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Annotation Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ANNOTATION_PROPERTY = eINSTANCE.getAnnotation_AnnotationProperty();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnnotationProperty()
     * @generated
     */
    EClass ANNOTATION_PROPERTY = eINSTANCE.getAnnotationProperty();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Entity URI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ENTITY_URI = eINSTANCE.getEntity_EntityURI();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.URIImpl <em>URI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.URIImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getURI()
     * @generated
     */
    EClass URI = eINSTANCE.getURI();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__VALUE = eINSTANCE.getURI_Value();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.LiteralImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Lexical Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__LEXICAL_VALUE = eINSTANCE.getLiteral_LexicalValue();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__DATATYPE = eINSTANCE.getLiteral_Datatype();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatatypeImpl <em>Datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatatypeImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDatatype()
     * @generated
     */
    EClass DATATYPE = eINSTANCE.getDatatype();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATATYPE__DATA_TYPE = eINSTANCE.getDatatype_DataType();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataRangeImpl <em>Data Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataRangeImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataRange()
     * @generated
     */
    EClass DATA_RANGE = eINSTANCE.getDataRange();

    /**
     * The meta object literal for the '<em><b>Arity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_RANGE__ARITY = eINSTANCE.getDataRange_Arity();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyAxiomImpl <em>Data Property Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyAxiomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyAxiom()
     * @generated
     */
    EClass DATA_PROPERTY_AXIOM = eINSTANCE.getDataPropertyAxiom();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyAxiomImpl <em>Object Property Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyAxiomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyAxiom()
     * @generated
     */
    EClass OBJECT_PROPERTY_AXIOM = eINSTANCE.getObjectPropertyAxiom();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassExpressionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClassExpression()
     * @generated
     */
    EClass CLASS_EXPRESSION = eINSTANCE.getClassExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAxiomImpl <em>Class Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAxiomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClassAxiom()
     * @generated
     */
    EClass CLASS_AXIOM = eINSTANCE.getClassAxiom();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyExpressionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyExpression()
     * @generated
     */
    EClass DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyExpressionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyExpression()
     * @generated
     */
    EClass OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Is Functional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL = eINSTANCE.getObjectPropertyExpression_IsFunctional();

    /**
     * The meta object literal for the '<em><b>Is Reflexive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE = eINSTANCE.getObjectPropertyExpression_IsReflexive();

    /**
     * The meta object literal for the '<em><b>Is Inverse Functional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL = eINSTANCE.getObjectPropertyExpression_IsInverseFunctional();

    /**
     * The meta object literal for the '<em><b>Is Irreflexive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE = eINSTANCE.getObjectPropertyExpression_IsIrreflexive();

    /**
     * The meta object literal for the '<em><b>Is Symmetric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC = eINSTANCE.getObjectPropertyExpression_IsSymmetric();

    /**
     * The meta object literal for the '<em><b>Is Transitive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE = eINSTANCE.getObjectPropertyExpression_IsTransitive();

    /**
     * The meta object literal for the '<em><b>Is Asysmmetric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC = eINSTANCE.getObjectPropertyExpression_IsAsysmmetric();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AsymmetricObjectPropertyImpl <em>Asymmetric Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AsymmetricObjectPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAsymmetricObjectProperty()
     * @generated
     */
    EClass ASYMMETRIC_OBJECT_PROPERTY = eINSTANCE.getAsymmetricObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getAsymmetricObjectProperty_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectProperty()
     * @generated
     */
    EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseObjectPropertyImpl <em>Inverse Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseObjectPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getInverseObjectProperty()
     * @generated
     */
    EClass INVERSE_OBJECT_PROPERTY = eINSTANCE.getInverseObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY = eINSTANCE.getInverseObjectProperty_ObjectProperty();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectIntersectionOfImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectIntersectionOf()
     * @generated
     */
    EClass OBJECT_INTERSECTION_OF = eINSTANCE.getObjectIntersectionOf();

    /**
     * The meta object literal for the '<em><b>Class Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS = eINSTANCE.getObjectIntersectionOf_ClassExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectOneOfImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectOneOf()
     * @generated
     */
    EClass OBJECT_ONE_OF = eINSTANCE.getObjectOneOf();

    /**
     * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ONE_OF__INDIVIDUALS = eINSTANCE.getObjectOneOf_Individuals();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualImpl <em>Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getIndividual()
     * @generated
     */
    EClass INDIVIDUAL = eINSTANCE.getIndividual();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NamedIndividualImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getNamedIndividual()
     * @generated
     */
    EClass NAMED_INDIVIDUAL = eINSTANCE.getNamedIndividual();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectSomeValuesFromImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectSomeValuesFrom()
     * @generated
     */
    EClass OBJECT_SOME_VALUES_FROM = eINSTANCE.getObjectSomeValuesFrom();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION = eINSTANCE.getObjectSomeValuesFrom_ClassExpression();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectSomeValuesFrom_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectAllValuesFromImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectAllValuesFrom()
     * @generated
     */
    EClass OBJECT_ALL_VALUES_FROM = eINSTANCE.getObjectAllValuesFrom();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION = eINSTANCE.getObjectAllValuesFrom_ClassExpression();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectAllValuesFrom_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectExistsSelfImpl <em>Object Exists Self</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectExistsSelfImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectExistsSelf()
     * @generated
     */
    EClass OBJECT_EXISTS_SELF = eINSTANCE.getObjectExistsSelf();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_EXISTS_SELF__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectExistsSelf_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectHasValueImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectHasValue()
     * @generated
     */
    EClass OBJECT_HAS_VALUE = eINSTANCE.getObjectHasValue();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectHasValue_ObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_HAS_VALUE__INDIVIDUAL = eINSTANCE.getObjectHasValue_Individual();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectMinCardinalityImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectMinCardinality()
     * @generated
     */
    EClass OBJECT_MIN_CARDINALITY = eINSTANCE.getObjectMinCardinality();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getObjectMinCardinality_Cardinality();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION = eINSTANCE.getObjectMinCardinality_ClassExpression();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectMinCardinality_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectMaxCardinalityImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectMaxCardinality()
     * @generated
     */
    EClass OBJECT_MAX_CARDINALITY = eINSTANCE.getObjectMaxCardinality();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getObjectMaxCardinality_Cardinality();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION = eINSTANCE.getObjectMaxCardinality_ClassExpression();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectMaxCardinality_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataSomeValuesFromImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataSomeValuesFrom()
     * @generated
     */
    EClass DATA_SOME_VALUES_FROM = eINSTANCE.getDataSomeValuesFrom();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOME_VALUES_FROM__DATA_RANGE = eINSTANCE.getDataSomeValuesFrom_DataRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getDataSomeValuesFrom_DataPropertyExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyImpl <em>Data Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataProperty()
     * @generated
     */
    EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataOneOfImpl <em>Data One Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataOneOfImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataOneOf()
     * @generated
     */
    EClass DATA_ONE_OF = eINSTANCE.getDataOneOf();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ONE_OF__CONSTANTS = eINSTANCE.getDataOneOf_Constants();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatatypeRestrictionImpl <em>Datatype Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatatypeRestrictionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDatatypeRestriction()
     * @generated
     */
    EClass DATATYPE_RESTRICTION = eINSTANCE.getDatatypeRestriction();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATATYPE_RESTRICTION__DATATYPE = eINSTANCE.getDatatypeRestriction_Datatype();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATATYPE_RESTRICTION__RESTRICTIONS = eINSTANCE.getDatatypeRestriction_Restrictions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FacetConstantPairImpl <em>Facet Constant Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FacetConstantPairImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getFacetConstantPair()
     * @generated
     */
    EClass FACET_CONSTANT_PAIR = eINSTANCE.getFacetConstantPair();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET_CONSTANT_PAIR__CONSTANT = eINSTANCE.getFacetConstantPair_Constant();

    /**
     * The meta object literal for the '<em><b>Facet</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACET_CONSTANT_PAIR__FACET = eINSTANCE.getFacetConstantPair_Facet();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataAllValuesFromImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataAllValuesFrom()
     * @generated
     */
    EClass DATA_ALL_VALUES_FROM = eINSTANCE.getDataAllValuesFrom();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ALL_VALUES_FROM__DATA_RANGE = eINSTANCE.getDataAllValuesFrom_DataRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getDataAllValuesFrom_DataPropertyExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataHasValueImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataHasValue()
     * @generated
     */
    EClass DATA_HAS_VALUE = eINSTANCE.getDataHasValue();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_HAS_VALUE__CONSTANT = eINSTANCE.getDataHasValue_Constant();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataHasValue_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataMinCardinalityImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataMinCardinality()
     * @generated
     */
    EClass DATA_MIN_CARDINALITY = eINSTANCE.getDataMinCardinality();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getDataMinCardinality_Cardinality();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MIN_CARDINALITY__DATA_RANGE = eINSTANCE.getDataMinCardinality_DataRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataMinCardinality_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataMaxCardinalityImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataMaxCardinality()
     * @generated
     */
    EClass DATA_MAX_CARDINALITY = eINSTANCE.getDataMaxCardinality();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getDataMaxCardinality_Cardinality();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MAX_CARDINALITY__DATA_RANGE = eINSTANCE.getDataMaxCardinality_DataRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataMaxCardinality_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataExactCardinalityImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataExactCardinality()
     * @generated
     */
    EClass DATA_EXACT_CARDINALITY = eINSTANCE.getDataExactCardinality();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getDataExactCardinality_Cardinality();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_EXACT_CARDINALITY__DATA_RANGE = eINSTANCE.getDataExactCardinality_DataRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataExactCardinality_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NegativeDataPropertyAssertionImpl <em>Negative Data Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NegativeDataPropertyAssertionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getNegativeDataPropertyAssertion()
     * @generated
     */
    EClass NEGATIVE_DATA_PROPERTY_ASSERTION = eINSTANCE.getNegativeDataPropertyAssertion();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION = eINSTANCE.getNegativeDataPropertyAssertion_DataPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Target Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE = eINSTANCE.getNegativeDataPropertyAssertion_TargetValue();

    /**
     * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getNegativeDataPropertyAssertion_SourceIndividual();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyDomainImpl <em>Data Property Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyDomainImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyDomain()
     * @generated
     */
    EClass DATA_PROPERTY_DOMAIN = eINSTANCE.getDataPropertyDomain();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_DOMAIN__DOMAIN = eINSTANCE.getDataPropertyDomain_Domain();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyDomain_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyRangeImpl <em>Data Property Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyRangeImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyRange()
     * @generated
     */
    EClass DATA_PROPERTY_RANGE = eINSTANCE.getDataPropertyRange();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_RANGE__RANGE = eINSTANCE.getDataPropertyRange_Range();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyRange_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DifferentIndividualsImpl <em>Different Individuals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DifferentIndividualsImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDifferentIndividuals()
     * @generated
     */
    EClass DIFFERENT_INDIVIDUALS = eINSTANCE.getDifferentIndividuals();

    /**
     * The meta object literal for the '<em><b>Different Individuals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS = eINSTANCE.getDifferentIndividuals_DifferentIndividuals();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointClassesImpl <em>Disjoint Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointClassesImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDisjointClasses()
     * @generated
     */
    EClass DISJOINT_CLASSES = eINSTANCE.getDisjointClasses();

    /**
     * The meta object literal for the '<em><b>Disjoint Class Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS = eINSTANCE.getDisjointClasses_DisjointClassExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointDataPropertiesImpl <em>Disjoint Data Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointDataPropertiesImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDisjointDataProperties()
     * @generated
     */
    EClass DISJOINT_DATA_PROPERTIES = eINSTANCE.getDisjointDataProperties();

    /**
     * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getDisjointDataProperties_DataPropertyExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointObjectPropertiesImpl <em>Disjoint Object Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointObjectPropertiesImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDisjointObjectProperties()
     * @generated
     */
    EClass DISJOINT_OBJECT_PROPERTIES = eINSTANCE.getDisjointObjectProperties();

    /**
     * The meta object literal for the '<em><b>Object Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getDisjointObjectProperties_ObjectPropertyExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointUnionImpl <em>Disjoint Union</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DisjointUnionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDisjointUnion()
     * @generated
     */
    EClass DISJOINT_UNION = eINSTANCE.getDisjointUnion();

    /**
     * The meta object literal for the '<em><b>Union Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJOINT_UNION__UNION_CLASS = eINSTANCE.getDisjointUnion_UnionClass();

    /**
     * The meta object literal for the '<em><b>Disjoint Class Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS = eINSTANCE.getDisjointUnion_DisjointClassExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentClassesImpl <em>Equivalent Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentClassesImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getEquivalentClasses()
     * @generated
     */
    EClass EQUIVALENT_CLASSES = eINSTANCE.getEquivalentClasses();

    /**
     * The meta object literal for the '<em><b>Equivalent Class Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS = eINSTANCE.getEquivalentClasses_EquivalentClassExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentDataPropertiesImpl <em>Equivalent Data Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentDataPropertiesImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getEquivalentDataProperties()
     * @generated
     */
    EClass EQUIVALENT_DATA_PROPERTIES = eINSTANCE.getEquivalentDataProperties();

    /**
     * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getEquivalentDataProperties_DataPropertyExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentObjectPropertiesImpl <em>Equivalent Object Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EquivalentObjectPropertiesImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getEquivalentObjectProperties()
     * @generated
     */
    EClass EQUIVALENT_OBJECT_PROPERTIES = eINSTANCE.getEquivalentObjectProperties();

    /**
     * The meta object literal for the '<em><b>Object Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getEquivalentObjectProperties_ObjectPropertyExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FunctionalDataPropertyImpl <em>Functional Data Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FunctionalDataPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getFunctionalDataProperty()
     * @generated
     */
    EClass FUNCTIONAL_DATA_PROPERTY = eINSTANCE.getFunctionalDataProperty();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION = eINSTANCE.getFunctionalDataProperty_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FunctionalObjectPropertyImpl <em>Functional Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FunctionalObjectPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getFunctionalObjectProperty()
     * @generated
     */
    EClass FUNCTIONAL_OBJECT_PROPERTY = eINSTANCE.getFunctionalObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getFunctionalObjectProperty_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseFunctionalObjectPropertyImpl <em>Inverse Functional Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseFunctionalObjectPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getInverseFunctionalObjectProperty()
     * @generated
     */
    EClass INVERSE_FUNCTIONAL_OBJECT_PROPERTY = eINSTANCE.getInverseFunctionalObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getInverseFunctionalObjectProperty_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyAssertionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyAssertion()
     * @generated
     */
    EClass OBJECT_PROPERTY_ASSERTION = eINSTANCE.getObjectPropertyAssertion();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyAssertion_ObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getObjectPropertyAssertion_SourceIndividual();

    /**
     * The meta object literal for the '<em><b>Target Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = eINSTANCE.getObjectPropertyAssertion_TargetIndividual();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NegativeObjectPropertyAssertionImpl <em>Negative Object Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.NegativeObjectPropertyAssertionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getNegativeObjectPropertyAssertion()
     * @generated
     */
    EClass NEGATIVE_OBJECT_PROPERTY_ASSERTION = eINSTANCE.getNegativeObjectPropertyAssertion();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getNegativeObjectPropertyAssertion_ObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getNegativeObjectPropertyAssertion_SourceIndividual();

    /**
     * The meta object literal for the '<em><b>Target Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = eINSTANCE.getNegativeObjectPropertyAssertion_TargetIndividual();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyDomainImpl <em>Object Property Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyDomainImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyDomain()
     * @generated
     */
    EClass OBJECT_PROPERTY_DOMAIN = eINSTANCE.getObjectPropertyDomain();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_DOMAIN__DOMAIN = eINSTANCE.getObjectPropertyDomain_Domain();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyDomain_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SymmetricObjectPropertyImpl <em>Symmetric Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SymmetricObjectPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSymmetricObjectProperty()
     * @generated
     */
    EClass SYMMETRIC_OBJECT_PROPERTY = eINSTANCE.getSymmetricObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getSymmetricObjectProperty_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ReflexiveObjectPropertyImpl <em>Reflexive Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ReflexiveObjectPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getReflexiveObjectProperty()
     * @generated
     */
    EClass REFLEXIVE_OBJECT_PROPERTY = eINSTANCE.getReflexiveObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getReflexiveObjectProperty_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubDataPropertyOfImpl <em>Sub Data Property Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubDataPropertyOfImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSubDataPropertyOf()
     * @generated
     */
    EClass SUB_DATA_PROPERTY_OF = eINSTANCE.getSubDataPropertyOf();

    /**
     * The meta object literal for the '<em><b>Super Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION = eINSTANCE.getSubDataPropertyOf_SuperDataPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Sub Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION = eINSTANCE.getSubDataPropertyOf_SubDataPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SameIndividualImpl <em>Same Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SameIndividualImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSameIndividual()
     * @generated
     */
    EClass SAME_INDIVIDUAL = eINSTANCE.getSameIndividual();

    /**
     * The meta object literal for the '<em><b>Same Individuals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SAME_INDIVIDUAL__SAME_INDIVIDUALS = eINSTANCE.getSameIndividual_SameIndividuals();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubObjectPropertyOfImpl <em>Sub Object Property Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubObjectPropertyOfImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSubObjectPropertyOf()
     * @generated
     */
    EClass SUB_OBJECT_PROPERTY_OF = eINSTANCE.getSubObjectPropertyOf();

    /**
     * The meta object literal for the '<em><b>Super Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getSubObjectPropertyOf_SuperObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Sub Object Property Expressions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getSubObjectPropertyOf_SubObjectPropertyExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectComplementOfImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectComplementOf()
     * @generated
     */
    EClass OBJECT_COMPLEMENT_OF = eINSTANCE.getObjectComplementOf();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION = eINSTANCE.getObjectComplementOf_ClassExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl <em>Ontology</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getOntology()
     * @generated
     */
    EClass ONTOLOGY = eINSTANCE.getOntology();

    /**
     * The meta object literal for the '<em><b>Ontology Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__ONTOLOGY_ANNOTATIONS = eINSTANCE.getOntology_OntologyAnnotations();

    /**
     * The meta object literal for the '<em><b>Axioms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__AXIOMS = eINSTANCE.getOntology_Axioms();

    /**
     * The meta object literal for the '<em><b>Imported Ontologies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__IMPORTED_ONTOLOGIES = eINSTANCE.getOntology_ImportedOntologies();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__EXPRESSIONS = eINSTANCE.getOntology_Expressions();

    /**
     * The meta object literal for the '<em><b>Ontology URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONTOLOGY__ONTOLOGY_URI = eINSTANCE.getOntology_OntologyURI();

    /**
     * The meta object literal for the '<em><b>Version URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONTOLOGY__VERSION_URI = eINSTANCE.getOntology_VersionURI();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__PACKAGES = eINSTANCE.getOntology_Packages();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyRangeImpl <em>Object Property Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectPropertyRangeImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyRange()
     * @generated
     */
    EClass OBJECT_PROPERTY_RANGE = eINSTANCE.getObjectPropertyRange();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_RANGE__RANGE = eINSTANCE.getObjectPropertyRange_Range();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyRange_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataPropertyAssertionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyAssertion()
     * @generated
     */
    EClass DATA_PROPERTY_ASSERTION = eINSTANCE.getDataPropertyAssertion();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyAssertion_DataPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Target Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_ASSERTION__TARGET_VALUE = eINSTANCE.getDataPropertyAssertion_TargetValue();

    /**
     * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getDataPropertyAssertion_SourceIndividual();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAssertionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClassAssertion()
     * @generated
     */
    EClass CLASS_ASSERTION = eINSTANCE.getClassAssertion();

    /**
     * The meta object literal for the '<em><b>Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_ASSERTION__INDIVIDUAL = eINSTANCE.getClassAssertion_Individual();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_ASSERTION__CLASS_EXPRESSION = eINSTANCE.getClassAssertion_ClassExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IrreflexiveObjectPropertyImpl <em>Irreflexive Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IrreflexiveObjectPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getIrreflexiveObjectProperty()
     * @generated
     */
    EClass IRREFLEXIVE_OBJECT_PROPERTY = eINSTANCE.getIrreflexiveObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getIrreflexiveObjectProperty_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectExactCardinalityImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectExactCardinality()
     * @generated
     */
    EClass OBJECT_EXACT_CARDINALITY = eINSTANCE.getObjectExactCardinality();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getObjectExactCardinality_Cardinality();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION = eINSTANCE.getObjectExactCardinality_ClassExpression();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectExactCardinality_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataComplementOfImpl <em>Data Complement Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataComplementOfImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataComplementOf()
     * @generated
     */
    EClass DATA_COMPLEMENT_OF = eINSTANCE.getDataComplementOf();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_COMPLEMENT_OF__DATA_RANGE = eINSTANCE.getDataComplementOf_DataRange();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubClassOfImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSubClassOf()
     * @generated
     */
    EClass SUB_CLASS_OF = eINSTANCE.getSubClassOf();

    /**
     * The meta object literal for the '<em><b>Sub Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_CLASS_OF__SUB_CLASS_EXPRESSION = eINSTANCE.getSubClassOf_SubClassExpression();

    /**
     * The meta object literal for the '<em><b>Super Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_CLASS_OF__SUPER_CLASS_EXPRESSION = eINSTANCE.getSubClassOf_SuperClassExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubObjectPropertyImpl <em>Sub Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.SubObjectPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getSubObjectProperty()
     * @generated
     */
    EClass SUB_OBJECT_PROPERTY = eINSTANCE.getSubObjectProperty();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TransitiveObjectPropertyImpl <em>Transitive Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TransitiveObjectPropertyImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTransitiveObjectProperty()
     * @generated
     */
    EClass TRANSITIVE_OBJECT_PROPERTY = eINSTANCE.getTransitiveObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getTransitiveObjectProperty_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityAnnotationImpl <em>Entity Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.EntityAnnotationImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getEntityAnnotation()
     * @generated
     */
    EClass ENTITY_ANNOTATION = eINSTANCE.getEntityAnnotation();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_ANNOTATION__ENTITY = eINSTANCE.getEntityAnnotation_Entity();

    /**
     * The meta object literal for the '<em><b>Entity Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_ANNOTATION__ENTITY_ANNOTATIONS = eINSTANCE.getEntityAnnotation_EntityAnnotations();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FullURIImpl <em>Full URI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.FullURIImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getFullURI()
     * @generated
     */
    EClass FULL_URI = eINSTANCE.getFullURI();

    /**
     * The meta object literal for the '<em><b>Iri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULL_URI__IRI = eINSTANCE.getFullURI_Iri();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AbbreviatedURIImpl <em>Abbreviated URI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AbbreviatedURIImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAbbreviatedURI()
     * @generated
     */
    EClass ABBREVIATED_URI = eINSTANCE.getAbbreviatedURI();

    /**
     * The meta object literal for the '<em><b>Local Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABBREVIATED_URI__LOCAL_NAME = eINSTANCE.getAbbreviatedURI_LocalName();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectUnionOfImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectUnionOf()
     * @generated
     */
    EClass OBJECT_UNION_OF = eINSTANCE.getObjectUnionOf();

    /**
     * The meta object literal for the '<em><b>Class Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_UNION_OF__CLASS_EXPRESSIONS = eINSTANCE.getObjectUnionOf_ClassExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseObjectPropertiesImpl <em>Inverse Object Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.InverseObjectPropertiesImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getInverseObjectProperties()
     * @generated
     */
    EClass INVERSE_OBJECT_PROPERTIES = eINSTANCE.getInverseObjectProperties();

    /**
     * The meta object literal for the '<em><b>Object Property Expression1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION1 = eINSTANCE.getInverseObjectProperties_ObjectPropertyExpression1();

    /**
     * The meta object literal for the '<em><b>Object Property Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION2 = eINSTANCE.getInverseObjectProperties_ObjectPropertyExpression2();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByConstantImpl <em>Annotation By Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByConstantImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnnotationByConstant()
     * @generated
     */
    EClass ANNOTATION_BY_CONSTANT = eINSTANCE.getAnnotationByConstant();

    /**
     * The meta object literal for the '<em><b>Annotation Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_BY_CONSTANT__ANNOTATION_VALUE = eINSTANCE.getAnnotationByConstant_AnnotationValue();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByEntityImpl <em>Annotation By Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByEntityImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnnotationByEntity()
     * @generated
     */
    EClass ANNOTATION_BY_ENTITY = eINSTANCE.getAnnotationByEntity();

    /**
     * The meta object literal for the '<em><b>Annotation Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_BY_ENTITY__ANNOTATION_VALUE = eINSTANCE.getAnnotationByEntity_AnnotationValue();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByAnonymousIndividualImpl <em>Annotation By Anonymous Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnnotationByAnonymousIndividualImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnnotationByAnonymousIndividual()
     * @generated
     */
    EClass ANNOTATION_BY_ANONYMOUS_INDIVIDUAL = eINSTANCE.getAnnotationByAnonymousIndividual();

    /**
     * The meta object literal for the '<em><b>Annotation Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE = eINSTANCE.getAnnotationByAnonymousIndividual_AnnotationValue();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnonymousIndividualImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnonymousIndividual()
     * @generated
     */
    EClass ANONYMOUS_INDIVIDUAL = eINSTANCE.getAnonymousIndividual();

    /**
     * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANONYMOUS_INDIVIDUAL__NODE_ID = eINSTANCE.getAnonymousIndividual_NodeID();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DeclarationImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__ENTITY = eINSTANCE.getDeclaration_Entity();

    /**
     * The meta object literal for the '<em><b>Is Functional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__IS_FUNCTIONAL = eINSTANCE.getDeclaration_IsFunctional();

    /**
     * The meta object literal for the '<em><b>Is Reflexive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__IS_REFLEXIVE = eINSTANCE.getDeclaration_IsReflexive();

    /**
     * The meta object literal for the '<em><b>Is Inverse Functional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__IS_INVERSE_FUNCTIONAL = eINSTANCE.getDeclaration_IsInverseFunctional();

    /**
     * The meta object literal for the '<em><b>Is Irreflexive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__IS_IRREFLEXIVE = eINSTANCE.getDeclaration_IsIrreflexive();

    /**
     * The meta object literal for the '<em><b>Is Symmetric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__IS_SYMMETRIC = eINSTANCE.getDeclaration_IsSymmetric();

    /**
     * The meta object literal for the '<em><b>Is Transitive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__IS_TRANSITIVE = eINSTANCE.getDeclaration_IsTransitive();

    /**
     * The meta object literal for the '<em><b>Is Asysmmetric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__IS_ASYSMMETRIC = eINSTANCE.getDeclaration_IsAsysmmetric();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectAndDataPropertyAxiomImpl <em>Object And Data Property Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ObjectAndDataPropertyAxiomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getObjectAndDataPropertyAxiom()
     * @generated
     */
    EClass OBJECT_AND_DATA_PROPERTY_AXIOM = eINSTANCE.getObjectAndDataPropertyAxiom();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.KeyForImpl <em>Key For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.KeyForImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getKeyFor()
     * @generated
     */
    EClass KEY_FOR = eINSTANCE.getKeyFor();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_FOR__CLASS_EXPRESSION = eINSTANCE.getKeyFor_ClassExpression();

    /**
     * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_FOR__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getKeyFor_DataPropertyExpressions();

    /**
     * The meta object literal for the '<em><b>Object Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getKeyFor_ObjectPropertyExpressions();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnonymousIndividualAnnotationImpl <em>Anonymous Individual Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AnonymousIndividualAnnotationImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAnonymousIndividualAnnotation()
     * @generated
     */
    EClass ANONYMOUS_INDIVIDUAL_ANNOTATION = eINSTANCE.getAnonymousIndividualAnnotation();

    /**
     * The meta object literal for the '<em><b>Anonymous Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL = eINSTANCE.getAnonymousIndividualAnnotation_AnonymousIndividual();

    /**
     * The meta object literal for the '<em><b>Anonymous Indiviudal Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS = eINSTANCE.getAnonymousIndividualAnnotation_AnonymousIndiviudalAnnotations();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ExpressionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyDocumentImpl <em>Ontology Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.OntologyDocumentImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getOntologyDocument()
     * @generated
     */
    EClass ONTOLOGY_DOCUMENT = eINSTANCE.getOntologyDocument();

    /**
     * The meta object literal for the '<em><b>Ontology</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY_DOCUMENT__ONTOLOGY = eINSTANCE.getOntologyDocument_Ontology();

    /**
     * The meta object literal for the '<em><b>Prefix Definition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY_DOCUMENT__PREFIX_DEFINITION = eINSTANCE.getOntologyDocument_PrefixDefinition();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PrefixDefinitionImpl <em>Prefix Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PrefixDefinitionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getPrefixDefinition()
     * @generated
     */
    EClass PREFIX_DEFINITION = eINSTANCE.getPrefixDefinition();

    /**
     * The meta object literal for the '<em><b>Pref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX_DEFINITION__PREF = eINSTANCE.getPrefixDefinition_Pref();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX_DEFINITION__NAMESPACE = eINSTANCE.getPrefixDefinition_Namespace();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTemplateParameter()
     * @generated
     */
    EClass TEMPLATE_PARAMETER = eINSTANCE.getTemplateParameter();

    /**
     * The meta object literal for the '<em><b>Owned Parametered Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT = eINSTANCE.getTemplateParameter_OwnedParameteredElement();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER__SIGNATURE = eINSTANCE.getTemplateParameter_Signature();

    /**
     * The meta object literal for the '<em><b>Parametered Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER__PARAMETERED_ELEMENT = eINSTANCE.getTemplateParameter_ParameteredElement();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ParameterableElementImpl <em>Parameterable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ParameterableElementImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getParameterableElement()
     * @generated
     */
    EClass PARAMETERABLE_ELEMENT = eINSTANCE.getParameterableElement();

    /**
     * The meta object literal for the '<em><b>Owning Template Parameter</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER = eINSTANCE.getParameterableElement_OwningTemplateParameter();

    /**
     * The meta object literal for the '<em><b>Template Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER = eINSTANCE.getParameterableElement_TemplateParameter();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateSignatureImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTemplateSignature()
     * @generated
     */
    EClass TEMPLATE_SIGNATURE = eINSTANCE.getTemplateSignature();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_SIGNATURE__PARAMETER = eINSTANCE.getTemplateSignature_Parameter();

    /**
     * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_SIGNATURE__OWNED_PARAMETER = eINSTANCE.getTemplateSignature_OwnedParameter();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_SIGNATURE__TEMPLATE = eINSTANCE.getTemplateSignature_Template();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateableElementImpl <em>Templateable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateableElementImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTemplateableElement()
     * @generated
     */
    EClass TEMPLATEABLE_ELEMENT = eINSTANCE.getTemplateableElement();

    /**
     * The meta object literal for the '<em><b>Owned Template Signature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE = eINSTANCE.getTemplateableElement_OwnedTemplateSignature();

    /**
     * The meta object literal for the '<em><b>Template Binding</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING = eINSTANCE.getTemplateableElement_TemplateBinding();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PackageImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__EXPRESSIONS = eINSTANCE.getPackage_Expressions();

    /**
     * The meta object literal for the '<em><b>Axioms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__AXIOMS = eINSTANCE.getPackage_Axioms();

    /**
     * The meta object literal for the '<em><b>Package Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__PACKAGE_URI = eINSTANCE.getPackage_PackageUri();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassifierTemplateParameterImpl <em>Classifier Template Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassifierTemplateParameterImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClassifierTemplateParameter()
     * @generated
     */
    EClass CLASSIFIER_TEMPLATE_PARAMETER = eINSTANCE.getClassifierTemplateParameter();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateParameterSubstitutionImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTemplateParameterSubstitution()
     * @generated
     */
    EClass TEMPLATE_PARAMETER_SUBSTITUTION = eINSTANCE.getTemplateParameterSubstitution();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL = eINSTANCE.getTemplateParameterSubstitution_Actual();

    /**
     * The meta object literal for the '<em><b>Formal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL = eINSTANCE.getTemplateParameterSubstitution_Formal();

    /**
     * The meta object literal for the '<em><b>Template Binding</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING = eINSTANCE.getTemplateParameterSubstitution_TemplateBinding();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TemplateBindingImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTemplateBinding()
     * @generated
     */
    EClass TEMPLATE_BINDING = eINSTANCE.getTemplateBinding();

    /**
     * The meta object literal for the '<em><b>Parameter Substitution</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_BINDING__PARAMETER_SUBSTITUTION = eINSTANCE.getTemplateBinding_ParameterSubstitution();

    /**
     * The meta object literal for the '<em><b>Bound Element</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_BINDING__BOUND_ELEMENT = eINSTANCE.getTemplateBinding_BoundElement();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_BINDING__SIGNATURE = eINSTANCE.getTemplateBinding_Signature();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DObjectImpl <em>DObject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DObjectImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDObject()
     * @generated
     */
    EClass DOBJECT = eINSTANCE.getDObject();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IObjectImpl <em>IObject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IObjectImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getIObject()
     * @generated
     */
    EClass IOBJECT = eINSTANCE.getIObject();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.RuleImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Has Antecedent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__HAS_ANTECEDENT = eINSTANCE.getRule_HasAntecedent();

    /**
     * The meta object literal for the '<em><b>Has Consequent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__HAS_CONSEQUENT = eINSTANCE.getRule_HasConsequent();

    /**
     * The meta object literal for the '<em><b>Swrl Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__SWRL_VARIABLES = eINSTANCE.getRule_SwrlVariables();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AntecedentImpl <em>Antecedent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AntecedentImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAntecedent()
     * @generated
     */
    EClass ANTECEDENT = eINSTANCE.getAntecedent();

    /**
     * The meta object literal for the '<em><b>Contains Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANTECEDENT__CONTAINS_ATOMS = eINSTANCE.getAntecedent_ContainsAtoms();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANTECEDENT__NAME = eINSTANCE.getAntecedent_Name();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ConsequentImpl <em>Consequent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ConsequentImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getConsequent()
     * @generated
     */
    EClass CONSEQUENT = eINSTANCE.getConsequent();

    /**
     * The meta object literal for the '<em><b>Contains Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSEQUENT__CONTAINS_ATOMS = eINSTANCE.getConsequent_ContainsAtoms();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSEQUENT__NAME = eINSTANCE.getConsequent_Name();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.AtomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Is In Consequent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__IS_IN_CONSEQUENT = eINSTANCE.getAtom_IsInConsequent();

    /**
     * The meta object literal for the '<em><b>Is In Antecedent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__IS_IN_ANTECEDENT = eINSTANCE.getAtom_IsInAntecedent();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataRangeAtomImpl <em>Data Range Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataRangeAtomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataRangeAtom()
     * @generated
     */
    EClass DATA_RANGE_ATOM = eINSTANCE.getDataRangeAtom();

    /**
     * The meta object literal for the '<em><b>Has Predicate Symbol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_RANGE_ATOM__HAS_PREDICATE_SYMBOL = eINSTANCE.getDataRangeAtom_HasPredicateSymbol();

    /**
     * The meta object literal for the '<em><b>Has Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_RANGE_ATOM__HAS_TERM = eINSTANCE.getDataRangeAtom_HasTerm();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAtomImpl <em>Class Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ClassAtomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getClassAtom()
     * @generated
     */
    EClass CLASS_ATOM = eINSTANCE.getClassAtom();

    /**
     * The meta object literal for the '<em><b>Has Predicate Symbol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_ATOM__HAS_PREDICATE_SYMBOL = eINSTANCE.getClassAtom_HasPredicateSymbol();

    /**
     * The meta object literal for the '<em><b>Has Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_ATOM__HAS_TERM = eINSTANCE.getClassAtom_HasTerm();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PropertyAtomImpl <em>Property Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.PropertyAtomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getPropertyAtom()
     * @generated
     */
    EClass PROPERTY_ATOM = eINSTANCE.getPropertyAtom();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualPropetyAtomImpl <em>Individual Propety Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualPropetyAtomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getIndividualPropetyAtom()
     * @generated
     */
    EClass INDIVIDUAL_PROPETY_ATOM = eINSTANCE.getIndividualPropetyAtom();

    /**
     * The meta object literal for the '<em><b>Has Predicate Symbol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL = eINSTANCE.getIndividualPropetyAtom_HasPredicateSymbol();

    /**
     * The meta object literal for the '<em><b>Atom Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET = eINSTANCE.getIndividualPropetyAtom_AtomTarget();

    /**
     * The meta object literal for the '<em><b>Atom Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE = eINSTANCE.getIndividualPropetyAtom_AtomSource();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatavaluedPropertyAtomImpl <em>Datavalued Property Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DatavaluedPropertyAtomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDatavaluedPropertyAtom()
     * @generated
     */
    EClass DATAVALUED_PROPERTY_ATOM = eINSTANCE.getDatavaluedPropertyAtom();

    /**
     * The meta object literal for the '<em><b>Has Predicate Symbol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL = eINSTANCE.getDatavaluedPropertyAtom_HasPredicateSymbol();

    /**
     * The meta object literal for the '<em><b>Atom Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATAVALUED_PROPERTY_ATOM__ATOM_TARGET = eINSTANCE.getDatavaluedPropertyAtom_AtomTarget();

    /**
     * The meta object literal for the '<em><b>Atom Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE = eINSTANCE.getDatavaluedPropertyAtom_AtomSource();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.TermImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.VariableImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataVariableImpl <em>Data Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.DataVariableImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataVariable()
     * @generated
     */
    EClass DATA_VARIABLE = eINSTANCE.getDataVariable();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualVariableImpl <em>Individual Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.IndividualVariableImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getIndividualVariable()
     * @generated
     */
    EClass INDIVIDUAL_VARIABLE = eINSTANCE.getIndividualVariable();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.ConstantImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.impl.BuiltInAtomImpl <em>Built In Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.BuiltInAtomImpl
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getBuiltInAtom()
     * @generated
     */
    EClass BUILT_IN_ATOM = eINSTANCE.getBuiltInAtom();

    /**
     * The meta object literal for the '<em><b>Has Predicate Symbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILT_IN_ATOM__HAS_PREDICATE_SYMBOL = eINSTANCE.getBuiltInAtom_HasPredicateSymbol();

    /**
     * The meta object literal for the '<em><b>Has Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_ATOM__HAS_TERMS = eINSTANCE.getBuiltInAtom_HasTerms();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps <em>Data Type Maps</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getDataTypeMaps()
     * @generated
     */
    EEnum DATA_TYPE_MAPS = eINSTANCE.getDataTypeMaps();

    /**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID <em>Built In ID</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID
     * @see de.uniko.isweb.emftext.owl2fs.owl2fs.impl.Owl2fsPackageImpl#getBuiltInID()
     * @generated
     */
    EEnum BUILT_IN_ID = eINSTANCE.getBuiltInID();

  }

} //Owl2fsPackage
