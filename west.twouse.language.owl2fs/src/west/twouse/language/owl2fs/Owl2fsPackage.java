/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see west.twouse.language.owl2fs.Owl2fsFactory
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
  String eNS_URI = "http://west.uni-koblenz.de/owl2fs";

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
  Owl2fsPackage eINSTANCE = west.twouse.language.owl2fs.impl.Owl2fsPackageImpl.init();

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AnnotationSubjectImpl <em>Annotation Subject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AnnotationSubjectImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationSubject()
   * @generated
   */
  int ANNOTATION_SUBJECT = 16;

  /**
   * The number of structural features of the '<em>Annotation Subject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_SUBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.IRIImpl <em>IRI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.IRIImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getIRI()
   * @generated
   */
  int IRI = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRI__VALUE = ANNOTATION_SUBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>IRI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRI_FEATURE_COUNT = ANNOTATION_SUBJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.FullIRIImpl <em>Full IRI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.FullIRIImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getFullIRI()
   * @generated
   */
  int FULL_IRI = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_IRI__VALUE = IRI__VALUE;

  /**
   * The number of structural features of the '<em>Full IRI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULL_IRI_FEATURE_COUNT = IRI_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AbbreviatedIRIImpl <em>Abbreviated IRI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AbbreviatedIRIImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAbbreviatedIRI()
   * @generated
   */
  int ABBREVIATED_IRI = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATED_IRI__VALUE = IRI__VALUE;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATED_IRI__PREFIX = IRI_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abbreviated IRI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATED_IRI_FEATURE_COUNT = IRI_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.OntologyDocumentImpl <em>Ontology Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.OntologyDocumentImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getOntologyDocument()
   * @generated
   */
  int ONTOLOGY_DOCUMENT = 3;

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
   * The feature id for the '<em><b>Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_DOCUMENT__COMMENT = 2;

  /**
   * The number of structural features of the '<em>Ontology Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_DOCUMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.PrefixDefinitionImpl <em>Prefix Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.PrefixDefinitionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getPrefixDefinition()
   * @generated
   */
  int PREFIX_DEFINITION = 4;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.OntologyImpl <em>Ontology</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.OntologyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getOntology()
   * @generated
   */
  int ONTOLOGY = 5;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__EXPRESSIONS = 0;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__PACKAGES = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__COMMENT = 2;

  /**
   * The feature id for the '<em><b>Ontology IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__ONTOLOGY_IRI = 3;

  /**
   * The feature id for the '<em><b>Version IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__VERSION_IRI = 4;

  /**
   * The feature id for the '<em><b>Directly Imports Documents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS = 5;

  /**
   * The feature id for the '<em><b>Ontology Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__ONTOLOGY_ANNOTATIONS = 6;

  /**
   * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY__AXIOMS = 7;

  /**
   * The number of structural features of the '<em>Ontology</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AxiomImpl <em>Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AxiomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAxiom()
   * @generated
   */
  int AXIOM = 6;

  /**
   * The number of structural features of the '<em>Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIOM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.CommentImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 7;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__COMMENT = AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DeclarationImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__AXIOM_ANNOTATIONS = AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__ENTITY = AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ClassDeclarationImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassDeclaration()
   * @generated
   */
  int CLASS_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__AXIOM_ANNOTATIONS = DECLARATION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__ENTITY = DECLARATION__ENTITY;

  /**
   * The number of structural features of the '<em>Class Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DatatypeDeclarationImpl <em>Datatype Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DatatypeDeclarationImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDatatypeDeclaration()
   * @generated
   */
  int DATATYPE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_DECLARATION__AXIOM_ANNOTATIONS = DECLARATION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_DECLARATION__ENTITY = DECLARATION__ENTITY;

  /**
   * The number of structural features of the '<em>Datatype Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyDeclarationImpl <em>Object Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectPropertyDeclarationImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyDeclaration()
   * @generated
   */
  int OBJECT_PROPERTY_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DECLARATION__AXIOM_ANNOTATIONS = DECLARATION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DECLARATION__ENTITY = DECLARATION__ENTITY;

  /**
   * The number of structural features of the '<em>Object Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataPropertyDeclarationImpl <em>Data Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataPropertyDeclarationImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyDeclaration()
   * @generated
   */
  int DATA_PROPERTY_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_DECLARATION__AXIOM_ANNOTATIONS = DECLARATION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_DECLARATION__ENTITY = DECLARATION__ENTITY;

  /**
   * The number of structural features of the '<em>Data Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AnnotationPropertyDeclarationImpl <em>Annotation Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AnnotationPropertyDeclarationImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationPropertyDeclaration()
   * @generated
   */
  int ANNOTATION_PROPERTY_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_DECLARATION__AXIOM_ANNOTATIONS = DECLARATION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_DECLARATION__ENTITY = DECLARATION__ENTITY;

  /**
   * The number of structural features of the '<em>Annotation Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.NamedIndividualDeclarationImpl <em>Named Individual Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.NamedIndividualDeclarationImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getNamedIndividualDeclaration()
   * @generated
   */
  int NAMED_INDIVIDUAL_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INDIVIDUAL_DECLARATION__AXIOM_ANNOTATIONS = DECLARATION__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INDIVIDUAL_DECLARATION__ENTITY = DECLARATION__ENTITY;

  /**
   * The number of structural features of the '<em>Named Individual Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INDIVIDUAL_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.EntityImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 15;

  /**
   * The feature id for the '<em><b>Entity IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ENTITY_IRI = 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AnnotationValueImpl <em>Annotation Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AnnotationValueImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationValue()
   * @generated
   */
  int ANNOTATION_VALUE = 17;

  /**
   * The number of structural features of the '<em>Annotation Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AnnotationImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 18;

  /**
   * The feature id for the '<em><b>Annotation Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Annotation Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_VALUE = 2;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AnnotationAxiomImpl <em>Annotation Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AnnotationAxiomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationAxiom()
   * @generated
   */
  int ANNOTATION_AXIOM = 19;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_AXIOM__AXIOM_ANNOTATIONS = AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AnnotationAssertionImpl <em>Annotation Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AnnotationAssertionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationAssertion()
   * @generated
   */
  int ANNOTATION_ASSERTION = 20;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ASSERTION__AXIOM_ANNOTATIONS = ANNOTATION_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ASSERTION__ANNOTATION_PROPERTY = ANNOTATION_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotation Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ASSERTION__ANNOTATION_SUBJECT = ANNOTATION_AXIOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Annotation Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ASSERTION__ANNOTATION_VALUE = ANNOTATION_AXIOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Annotation Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ASSERTION_FEATURE_COUNT = ANNOTATION_AXIOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.SubAnnotationPropertyOfImpl <em>Sub Annotation Property Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.SubAnnotationPropertyOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSubAnnotationPropertyOf()
   * @generated
   */
  int SUB_ANNOTATION_PROPERTY_OF = 21;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ANNOTATION_PROPERTY_OF__AXIOM_ANNOTATIONS = ANNOTATION_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Sub Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY = ANNOTATION_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY = ANNOTATION_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Annotation Property Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_ANNOTATION_PROPERTY_OF_FEATURE_COUNT = ANNOTATION_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AnnotationPropertyDomainImpl <em>Annotation Property Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AnnotationPropertyDomainImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationPropertyDomain()
   * @generated
   */
  int ANNOTATION_PROPERTY_DOMAIN = 22;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS = ANNOTATION_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY = ANNOTATION_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Iri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_DOMAIN__IRI = ANNOTATION_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Annotation Property Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_DOMAIN_FEATURE_COUNT = ANNOTATION_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AnnotationPropertyRangeImpl <em>Annotation Property Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AnnotationPropertyRangeImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationPropertyRange()
   * @generated
   */
  int ANNOTATION_PROPERTY_RANGE = 23;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_RANGE__AXIOM_ANNOTATIONS = ANNOTATION_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Annotation Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY = ANNOTATION_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Iri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_RANGE__IRI = ANNOTATION_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Annotation Property Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_RANGE_FEATURE_COUNT = ANNOTATION_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AnnotationPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationProperty()
   * @generated
   */
  int ANNOTATION_PROPERTY = 24;

  /**
   * The feature id for the '<em><b>Entity IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY__ENTITY_IRI = ENTITY__ENTITY_IRI;

  /**
   * The number of structural features of the '<em>Annotation Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ClassImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 25;

  /**
   * The feature id for the '<em><b>Entity IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ENTITY_IRI = ENTITY__ENTITY_IRI;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataPropertyImpl <em>Data Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataProperty()
   * @generated
   */
  int DATA_PROPERTY = 26;

  /**
   * The feature id for the '<em><b>Entity IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY__ENTITY_IRI = ENTITY__ENTITY_IRI;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY__TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataRangeImpl <em>Data Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataRangeImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataRange()
   * @generated
   */
  int DATA_RANGE = 36;

  /**
   * The number of structural features of the '<em>Data Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DatatypeImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 27;

  /**
   * The feature id for the '<em><b>Entity IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__ENTITY_IRI = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectProperty()
   * @generated
   */
  int OBJECT_PROPERTY = 28;

  /**
   * The feature id for the '<em><b>Entity IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__ENTITY_IRI = ENTITY__ENTITY_IRI;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.IArgImpl <em>IArg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.IArgImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getIArg()
   * @generated
   */
  int IARG = 109;

  /**
   * The number of structural features of the '<em>IArg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IARG_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.IndividualImpl <em>Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.IndividualImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getIndividual()
   * @generated
   */
  int INDIVIDUAL = 29;

  /**
   * The number of structural features of the '<em>Individual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_FEATURE_COUNT = IARG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.NamedIndividualImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getNamedIndividual()
   * @generated
   */
  int NAMED_INDIVIDUAL = 30;

  /**
   * The feature id for the '<em><b>Entity IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INDIVIDUAL__ENTITY_IRI = ENTITY__ENTITY_IRI;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INDIVIDUAL__TEMPLATE_PARAMETER = ENTITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Individual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_INDIVIDUAL_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AnonymousIndividualImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnonymousIndividual()
   * @generated
   */
  int ANONYMOUS_INDIVIDUAL = 31;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.LiteralImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 32;

  /**
   * The feature id for the '<em><b>Lexical Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LEXICAL_VALUE = ANNOTATION_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__DATATYPE = ANNOTATION_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Language Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LANGUAGE_TAG = ANNOTATION_VALUE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = ANNOTATION_VALUE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.SubObjectPropertyExpressionImpl <em>Sub Object Property Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.SubObjectPropertyExpressionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSubObjectPropertyExpression()
   * @generated
   */
  int SUB_OBJECT_PROPERTY_EXPRESSION = 68;

  /**
   * The number of structural features of the '<em>Sub Object Property Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectPropertyExpressionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyExpression()
   * @generated
   */
  int OBJECT_PROPERTY_EXPRESSION = 33;

  /**
   * The number of structural features of the '<em>Object Property Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT = SUB_OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.InverseObjectPropertyImpl <em>Inverse Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.InverseObjectPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getInverseObjectProperty()
   * @generated
   */
  int INVERSE_OBJECT_PROPERTY = 34;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataPropertyExpressionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyExpression()
   * @generated
   */
  int DATA_PROPERTY_EXPRESSION = 35;

  /**
   * The number of structural features of the '<em>Data Property Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataIntersectionOfImpl <em>Data Intersection Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataIntersectionOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataIntersectionOf()
   * @generated
   */
  int DATA_INTERSECTION_OF = 37;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INTERSECTION_OF__DATA_RANGE = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Intersection Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INTERSECTION_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataUnionOfImpl <em>Data Union Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataUnionOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataUnionOf()
   * @generated
   */
  int DATA_UNION_OF = 38;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_UNION_OF__DATA_RANGE = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Union Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_UNION_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataComplementOfImpl <em>Data Complement Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataComplementOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataComplementOf()
   * @generated
   */
  int DATA_COMPLEMENT_OF = 39;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataOneOfImpl <em>Data One Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataOneOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataOneOf()
   * @generated
   */
  int DATA_ONE_OF = 40;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DatatypeRestrictionImpl <em>Datatype Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DatatypeRestrictionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDatatypeRestriction()
   * @generated
   */
  int DATATYPE_RESTRICTION = 41;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.FacetConstraintPairImpl <em>Facet Constraint Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.FacetConstraintPairImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getFacetConstraintPair()
   * @generated
   */
  int FACET_CONSTRAINT_PAIR = 42;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_CONSTRAINT_PAIR__CONSTANT = 0;

  /**
   * The feature id for the '<em><b>Facet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_CONSTRAINT_PAIR__FACET = 1;

  /**
   * The number of structural features of the '<em>Facet Constraint Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_CONSTRAINT_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ParameterableElementImpl <em>Parameterable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ParameterableElementImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getParameterableElement()
   * @generated
   */
  int PARAMETERABLE_ELEMENT = 122;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER = 0;

  /**
   * The number of structural features of the '<em>Parameterable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERABLE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ClassExpressionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassExpression()
   * @generated
   */
  int CLASS_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_EXPRESSION__TEMPLATE_PARAMETER = PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;

  /**
   * The number of structural features of the '<em>Class Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_EXPRESSION_FEATURE_COUNT = PARAMETERABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectIntersectionOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectIntersectionOf()
   * @generated
   */
  int OBJECT_INTERSECTION_OF = 44;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_INTERSECTION_OF__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectUnionOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectUnionOf()
   * @generated
   */
  int OBJECT_UNION_OF = 45;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UNION_OF__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectComplementOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectComplementOf()
   * @generated
   */
  int OBJECT_COMPLEMENT_OF = 46;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_COMPLEMENT_OF__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectOneOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectOneOf()
   * @generated
   */
  int OBJECT_ONE_OF = 47;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ONE_OF__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectSomeValuesFromImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectSomeValuesFrom()
   * @generated
   */
  int OBJECT_SOME_VALUES_FROM = 48;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SOME_VALUES_FROM__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectAllValuesFromImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectAllValuesFrom()
   * @generated
   */
  int OBJECT_ALL_VALUES_FROM = 49;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ALL_VALUES_FROM__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectHasSelfImpl <em>Object Has Self</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectHasSelfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectHasSelf()
   * @generated
   */
  int OBJECT_HAS_SELF = 50;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_HAS_SELF__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_HAS_SELF__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Has Self</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_HAS_SELF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectHasValueImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectHasValue()
   * @generated
   */
  int OBJECT_HAS_VALUE = 51;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_HAS_VALUE__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectMinCardinalityImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectMinCardinality()
   * @generated
   */
  int OBJECT_MIN_CARDINALITY = 52;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MIN_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectMaxCardinalityImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectMaxCardinality()
   * @generated
   */
  int OBJECT_MAX_CARDINALITY = 53;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAX_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectExactCardinalityImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectExactCardinality()
   * @generated
   */
  int OBJECT_EXACT_CARDINALITY = 54;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_EXACT_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataSomeValuesFromImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataSomeValuesFrom()
   * @generated
   */
  int DATA_SOME_VALUES_FROM = 55;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOME_VALUES_FROM__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOME_VALUES_FROM__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataAllValuesFromImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataAllValuesFrom()
   * @generated
   */
  int DATA_ALL_VALUES_FROM = 56;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ALL_VALUES_FROM__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ALL_VALUES_FROM__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataHasValueImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataHasValue()
   * @generated
   */
  int DATA_HAS_VALUE = 57;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_HAS_VALUE__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataMinCardinalityImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataMinCardinality()
   * @generated
   */
  int DATA_MIN_CARDINALITY = 58;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MIN_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataMaxCardinalityImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataMaxCardinality()
   * @generated
   */
  int DATA_MAX_CARDINALITY = 59;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MAX_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataExactCardinalityImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataExactCardinality()
   * @generated
   */
  int DATA_EXACT_CARDINALITY = 60;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXACT_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ClassAxiomImpl <em>Class Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ClassAxiomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassAxiom()
   * @generated
   */
  int CLASS_AXIOM = 61;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_AXIOM__AXIOM_ANNOTATIONS = AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.SubClassOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSubClassOf()
   * @generated
   */
  int SUB_CLASS_OF = 62;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.EquivalentClassesImpl <em>Equivalent Classes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.EquivalentClassesImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getEquivalentClasses()
   * @generated
   */
  int EQUIVALENT_CLASSES = 63;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DisjointClassesImpl <em>Disjoint Classes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DisjointClassesImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDisjointClasses()
   * @generated
   */
  int DISJOINT_CLASSES = 64;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DisjointUnionImpl <em>Disjoint Union</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DisjointUnionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDisjointUnion()
   * @generated
   */
  int DISJOINT_UNION = 65;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyAxiomImpl <em>Object Property Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectPropertyAxiomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyAxiom()
   * @generated
   */
  int OBJECT_PROPERTY_AXIOM = 66;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS = AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Property Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.SubObjectPropertyOfImpl <em>Sub Object Property Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.SubObjectPropertyOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSubObjectPropertyOf()
   * @generated
   */
  int SUB_OBJECT_PROPERTY_OF = 67;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF__AXIOM_ANNOTATIONS = OBJECT_PROPERTY_AXIOM__AXIOM_ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Sub Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Object Property Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF_FEATURE_COUNT = OBJECT_PROPERTY_AXIOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyChainImpl <em>Object Property Chain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectPropertyChainImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyChain()
   * @generated
   */
  int OBJECT_PROPERTY_CHAIN = 69;

  /**
   * The feature id for the '<em><b>Object Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS = SUB_OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Property Chain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_CHAIN_FEATURE_COUNT = SUB_OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.EquivalentObjectPropertiesImpl <em>Equivalent Object Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.EquivalentObjectPropertiesImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getEquivalentObjectProperties()
   * @generated
   */
  int EQUIVALENT_OBJECT_PROPERTIES = 70;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DisjointObjectPropertiesImpl <em>Disjoint Object Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DisjointObjectPropertiesImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDisjointObjectProperties()
   * @generated
   */
  int DISJOINT_OBJECT_PROPERTIES = 71;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyDomainImpl <em>Object Property Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectPropertyDomainImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyDomain()
   * @generated
   */
  int OBJECT_PROPERTY_DOMAIN = 72;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyRangeImpl <em>Object Property Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectPropertyRangeImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyRange()
   * @generated
   */
  int OBJECT_PROPERTY_RANGE = 73;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.InverseObjectPropertiesImpl <em>Inverse Object Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.InverseObjectPropertiesImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getInverseObjectProperties()
   * @generated
   */
  int INVERSE_OBJECT_PROPERTIES = 74;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.FunctionalObjectPropertyImpl <em>Functional Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.FunctionalObjectPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getFunctionalObjectProperty()
   * @generated
   */
  int FUNCTIONAL_OBJECT_PROPERTY = 75;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.InverseFunctionalObjectPropertyImpl <em>Inverse Functional Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.InverseFunctionalObjectPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getInverseFunctionalObjectProperty()
   * @generated
   */
  int INVERSE_FUNCTIONAL_OBJECT_PROPERTY = 76;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ReflexiveObjectPropertyImpl <em>Reflexive Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ReflexiveObjectPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getReflexiveObjectProperty()
   * @generated
   */
  int REFLEXIVE_OBJECT_PROPERTY = 77;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.IrreflexiveObjectPropertyImpl <em>Irreflexive Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.IrreflexiveObjectPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getIrreflexiveObjectProperty()
   * @generated
   */
  int IRREFLEXIVE_OBJECT_PROPERTY = 78;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.SymmetricObjectPropertyImpl <em>Symmetric Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.SymmetricObjectPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSymmetricObjectProperty()
   * @generated
   */
  int SYMMETRIC_OBJECT_PROPERTY = 79;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AsymmetricObjectPropertyImpl <em>Asymmetric Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AsymmetricObjectPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAsymmetricObjectProperty()
   * @generated
   */
  int ASYMMETRIC_OBJECT_PROPERTY = 80;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.TransitiveObjectPropertyImpl <em>Transitive Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.TransitiveObjectPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTransitiveObjectProperty()
   * @generated
   */
  int TRANSITIVE_OBJECT_PROPERTY = 81;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataPropertyAxiomImpl <em>Data Property Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataPropertyAxiomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyAxiom()
   * @generated
   */
  int DATA_PROPERTY_AXIOM = 82;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_AXIOM__AXIOM_ANNOTATIONS = AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Property Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.SubDataPropertyOfImpl <em>Sub Data Property Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.SubDataPropertyOfImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSubDataPropertyOf()
   * @generated
   */
  int SUB_DATA_PROPERTY_OF = 83;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.EquivalentDataPropertiesImpl <em>Equivalent Data Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.EquivalentDataPropertiesImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getEquivalentDataProperties()
   * @generated
   */
  int EQUIVALENT_DATA_PROPERTIES = 84;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DisjointDataPropertiesImpl <em>Disjoint Data Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DisjointDataPropertiesImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDisjointDataProperties()
   * @generated
   */
  int DISJOINT_DATA_PROPERTIES = 85;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataPropertyDomainImpl <em>Data Property Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataPropertyDomainImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyDomain()
   * @generated
   */
  int DATA_PROPERTY_DOMAIN = 86;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataPropertyRangeImpl <em>Data Property Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataPropertyRangeImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyRange()
   * @generated
   */
  int DATA_PROPERTY_RANGE = 87;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.FunctionalDataPropertyImpl <em>Functional Data Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.FunctionalDataPropertyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getFunctionalDataProperty()
   * @generated
   */
  int FUNCTIONAL_DATA_PROPERTY = 88;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DatatypeDefinitionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDatatypeDefinition()
   * @generated
   */
  int DATATYPE_DEFINITION = 89;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_DEFINITION__AXIOM_ANNOTATIONS = AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_DEFINITION__DATATYPE = AXIOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_DEFINITION__DATA_RANGE = AXIOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Datatype Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_DEFINITION_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.HasKeyImpl <em>Has Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.HasKeyImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getHasKey()
   * @generated
   */
  int HAS_KEY = 90;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_KEY__AXIOM_ANNOTATIONS = AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_KEY__CLASS_EXPRESSION = AXIOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS = AXIOM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_KEY__DATA_PROPERTY_EXPRESSIONS = AXIOM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Has Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_KEY_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AssertionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 91;

  /**
   * The feature id for the '<em><b>Axiom Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__AXIOM_ANNOTATIONS = AXIOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.SameIndividualImpl <em>Same Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.SameIndividualImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSameIndividual()
   * @generated
   */
  int SAME_INDIVIDUAL = 92;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DifferentIndividualsImpl <em>Different Individuals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DifferentIndividualsImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDifferentIndividuals()
   * @generated
   */
  int DIFFERENT_INDIVIDUALS = 93;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ClassAssertionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassAssertion()
   * @generated
   */
  int CLASS_ASSERTION = 94;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectPropertyAssertionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyAssertion()
   * @generated
   */
  int OBJECT_PROPERTY_ASSERTION = 95;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.NegativeObjectPropertyAssertionImpl <em>Negative Object Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.NegativeObjectPropertyAssertionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getNegativeObjectPropertyAssertion()
   * @generated
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION = 96;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataPropertyAssertionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyAssertion()
   * @generated
   */
  int DATA_PROPERTY_ASSERTION = 97;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.NegativeDataPropertyAssertionImpl <em>Negative Data Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.NegativeDataPropertyAssertionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getNegativeDataPropertyAssertion()
   * @generated
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION = 98;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.RuleImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getRule()
   * @generated
   */
  int RULE = 99;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DLSafeRuleImpl <em>DL Safe Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DLSafeRuleImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDLSafeRule()
   * @generated
   */
  int DL_SAFE_RULE = 100;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DL_SAFE_RULE__ANNOTATION = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body Atom</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DL_SAFE_RULE__BODY_ATOM = RULE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Head Atom</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DL_SAFE_RULE__HEAD_ATOM = RULE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>DL Safe Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DL_SAFE_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.AtomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 101;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ClassAtomImpl <em>Class Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ClassAtomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassAtom()
   * @generated
   */
  int CLASS_ATOM = 102;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATOM__CLASS_EXPRESSION = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>IArg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATOM__IARG = ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataRangeAtomImpl <em>Data Range Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataRangeAtomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataRangeAtom()
   * @generated
   */
  int DATA_RANGE_ATOM = 103;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_ATOM__DATA_RANGE = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>DArg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_ATOM__DARG = ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Range Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyAtomImpl <em>Object Property Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ObjectPropertyAtomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyAtom()
   * @generated
   */
  int OBJECT_PROPERTY_ATOM = 104;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>IArg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_ATOM__IARG1 = ATOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>IArg2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_ATOM__IARG2 = ATOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Object Property Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DataPropetyAtomImpl <em>Data Propety Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DataPropetyAtomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropetyAtom()
   * @generated
   */
  int DATA_PROPETY_ATOM = 105;

  /**
   * The feature id for the '<em><b>Data Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPETY_ATOM__DATA_PROPERTY = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>IArg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPETY_ATOM__IARG = ATOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>DArg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPETY_ATOM__DARG = ATOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Propety Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPETY_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.BuiltInAtomImpl <em>Built In Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.BuiltInAtomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getBuiltInAtom()
   * @generated
   */
  int BUILT_IN_ATOM = 106;

  /**
   * The feature id for the '<em><b>Iri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM__IRI = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>DArg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM__DARG = ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Built In Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.SameIndividualAtomImpl <em>Same Individual Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.SameIndividualAtomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSameIndividualAtom()
   * @generated
   */
  int SAME_INDIVIDUAL_ATOM = 107;

  /**
   * The feature id for the '<em><b>IArg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAME_INDIVIDUAL_ATOM__IARG1 = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>IArg2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAME_INDIVIDUAL_ATOM__IARG2 = ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Same Individual Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAME_INDIVIDUAL_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DifferentIndividualsAtomImpl <em>Different Individuals Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DifferentIndividualsAtomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDifferentIndividualsAtom()
   * @generated
   */
  int DIFFERENT_INDIVIDUALS_ATOM = 108;

  /**
   * The feature id for the '<em><b>IArg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT_INDIVIDUALS_ATOM__IARG1 = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>IArg2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT_INDIVIDUALS_ATOM__IARG2 = ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Different Individuals Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT_INDIVIDUALS_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DArgImpl <em>DArg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DArgImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDArg()
   * @generated
   */
  int DARG = 110;

  /**
   * The number of structural features of the '<em>DArg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DARG_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.VariableImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 111;

  /**
   * The feature id for the '<em><b>Iri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__IRI = IARG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = IARG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DGRuleImpl <em>DG Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DGRuleImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDGRule()
   * @generated
   */
  int DG_RULE = 112;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_RULE__ANNOTATION = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body Atom</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_RULE__BODY_ATOM = RULE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Head Atom</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_RULE__HEAD_ATOM = RULE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>DG Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DGAtomImpl <em>DG Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DGAtomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDGAtom()
   * @generated
   */
  int DG_ATOM = 113;

  /**
   * The number of structural features of the '<em>DG Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_ATOM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DGAxiomImpl <em>DG Axiom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DGAxiomImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDGAxiom()
   * @generated
   */
  int DG_AXIOM = 114;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_AXIOM__ANNOTATION = AXIOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dg Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_AXIOM__DG_NODES = AXIOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dg Edges</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_AXIOM__DG_EDGES = AXIOM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Main Classes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_AXIOM__MAIN_CLASSES = AXIOM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>DG Axiom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_AXIOM_FEATURE_COUNT = AXIOM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DGNodesImpl <em>DG Nodes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DGNodesImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDGNodes()
   * @generated
   */
  int DG_NODES = 115;

  /**
   * The feature id for the '<em><b>Node Assertion</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_NODES__NODE_ASSERTION = 0;

  /**
   * The number of structural features of the '<em>DG Nodes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_NODES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.NodeAssertionImpl <em>Node Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.NodeAssertionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getNodeAssertion()
   * @generated
   */
  int NODE_ASSERTION = 116;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ASSERTION__CLASS = 0;

  /**
   * The feature id for the '<em><b>Dg Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ASSERTION__DG_NODE = 1;

  /**
   * The number of structural features of the '<em>Node Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ASSERTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.DGEdgesImpl <em>DG Edges</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.DGEdgesImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDGEdges()
   * @generated
   */
  int DG_EDGES = 117;

  /**
   * The feature id for the '<em><b>Edge Assertion</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_EDGES__EDGE_ASSERTION = 0;

  /**
   * The number of structural features of the '<em>DG Edges</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DG_EDGES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.EdgeAssertionImpl <em>Edge Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.EdgeAssertionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getEdgeAssertion()
   * @generated
   */
  int EDGE_ASSERTION = 118;

  /**
   * The feature id for the '<em><b>Object Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ASSERTION__OBJECT_PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Dg Node1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ASSERTION__DG_NODE1 = 1;

  /**
   * The feature id for the '<em><b>Dg Node2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ASSERTION__DG_NODE2 = 2;

  /**
   * The number of structural features of the '<em>Edge Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_ASSERTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.MainClassesImpl <em>Main Classes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.MainClassesImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getMainClasses()
   * @generated
   */
  int MAIN_CLASSES = 119;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_CLASSES__CLASS = 0;

  /**
   * The number of structural features of the '<em>Main Classes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_CLASSES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ExpressionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 120;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.TemplateParameterImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTemplateParameter()
   * @generated
   */
  int TEMPLATE_PARAMETER = 121;

  /**
   * The feature id for the '<em><b>Signature</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER__SIGNATURE = 0;

  /**
   * The feature id for the '<em><b>Parametered Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER__PARAMETERED_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Parameter Substitution</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION = 2;

  /**
   * The number of structural features of the '<em>Template Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.TemplateSignatureImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTemplateSignature()
   * @generated
   */
  int TEMPLATE_SIGNATURE = 123;

  /**
   * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SIGNATURE__OWNED_PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Template</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SIGNATURE__TEMPLATE = 1;

  /**
   * The number of structural features of the '<em>Template Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SIGNATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.TemplateableElementImpl <em>Templateable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.TemplateableElementImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTemplateableElement()
   * @generated
   */
  int TEMPLATEABLE_ELEMENT = 124;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.PackageImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 125;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.ClassifierTemplateParameterImpl <em>Classifier Template Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.ClassifierTemplateParameterImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassifierTemplateParameter()
   * @generated
   */
  int CLASSIFIER_TEMPLATE_PARAMETER = 126;

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
   * The feature id for the '<em><b>Parameter Substitution</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION = TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION;

  /**
   * The number of structural features of the '<em>Classifier Template Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_TEMPLATE_PARAMETER_FEATURE_COUNT = TEMPLATE_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.TemplateParameterSubstitutionImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTemplateParameterSubstitution()
   * @generated
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION = 127;

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
   * The meta object id for the '{@link west.twouse.language.owl2fs.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.owl2fs.impl.TemplateBindingImpl
   * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTemplateBinding()
   * @generated
   */
  int TEMPLATE_BINDING = 128;

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
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.IRI <em>IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IRI</em>'.
   * @see west.twouse.language.owl2fs.IRI
   * @generated
   */
  EClass getIRI();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.IRI#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see west.twouse.language.owl2fs.IRI#getValue()
   * @see #getIRI()
   * @generated
   */
  EAttribute getIRI_Value();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.FullIRI <em>Full IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Full IRI</em>'.
   * @see west.twouse.language.owl2fs.FullIRI
   * @generated
   */
  EClass getFullIRI();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AbbreviatedIRI <em>Abbreviated IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abbreviated IRI</em>'.
   * @see west.twouse.language.owl2fs.AbbreviatedIRI
   * @generated
   */
  EClass getAbbreviatedIRI();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.AbbreviatedIRI#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see west.twouse.language.owl2fs.AbbreviatedIRI#getPrefix()
   * @see #getAbbreviatedIRI()
   * @generated
   */
  EAttribute getAbbreviatedIRI_Prefix();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.OntologyDocument <em>Ontology Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ontology Document</em>'.
   * @see west.twouse.language.owl2fs.OntologyDocument
   * @generated
   */
  EClass getOntologyDocument();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.OntologyDocument#getOntology <em>Ontology</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ontology</em>'.
   * @see west.twouse.language.owl2fs.OntologyDocument#getOntology()
   * @see #getOntologyDocument()
   * @generated
   */
  EReference getOntologyDocument_Ontology();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.OntologyDocument#getPrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefix Definition</em>'.
   * @see west.twouse.language.owl2fs.OntologyDocument#getPrefixDefinition()
   * @see #getOntologyDocument()
   * @generated
   */
  EReference getOntologyDocument_PrefixDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.OntologyDocument#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comment</em>'.
   * @see west.twouse.language.owl2fs.OntologyDocument#getComment()
   * @see #getOntologyDocument()
   * @generated
   */
  EReference getOntologyDocument_Comment();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.PrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Definition</em>'.
   * @see west.twouse.language.owl2fs.PrefixDefinition
   * @generated
   */
  EClass getPrefixDefinition();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.PrefixDefinition#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see west.twouse.language.owl2fs.PrefixDefinition#getPref()
   * @see #getPrefixDefinition()
   * @generated
   */
  EAttribute getPrefixDefinition_Pref();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.PrefixDefinition#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see west.twouse.language.owl2fs.PrefixDefinition#getNamespace()
   * @see #getPrefixDefinition()
   * @generated
   */
  EReference getPrefixDefinition_Namespace();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Ontology <em>Ontology</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ontology</em>'.
   * @see west.twouse.language.owl2fs.Ontology
   * @generated
   */
  EClass getOntology();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.Ontology#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see west.twouse.language.owl2fs.Ontology#getExpressions()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_Expressions();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.Ontology#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see west.twouse.language.owl2fs.Ontology#getPackages()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_Packages();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.Ontology#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comment</em>'.
   * @see west.twouse.language.owl2fs.Ontology#getComment()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_Comment();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.Ontology#getOntologyIRI <em>Ontology IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ontology IRI</em>'.
   * @see west.twouse.language.owl2fs.Ontology#getOntologyIRI()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_OntologyIRI();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.Ontology#getVersionIRI <em>Version IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Version IRI</em>'.
   * @see west.twouse.language.owl2fs.Ontology#getVersionIRI()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_VersionIRI();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.Ontology#getDirectlyImportsDocuments <em>Directly Imports Documents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directly Imports Documents</em>'.
   * @see west.twouse.language.owl2fs.Ontology#getDirectlyImportsDocuments()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_DirectlyImportsDocuments();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.Ontology#getOntologyAnnotations <em>Ontology Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ontology Annotations</em>'.
   * @see west.twouse.language.owl2fs.Ontology#getOntologyAnnotations()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_OntologyAnnotations();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.Ontology#getAxioms <em>Axioms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Axioms</em>'.
   * @see west.twouse.language.owl2fs.Ontology#getAxioms()
   * @see #getOntology()
   * @generated
   */
  EReference getOntology_Axioms();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Axiom <em>Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Axiom</em>'.
   * @see west.twouse.language.owl2fs.Axiom
   * @generated
   */
  EClass getAxiom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see west.twouse.language.owl2fs.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.Comment#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see west.twouse.language.owl2fs.Comment#getComment()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Comment();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see west.twouse.language.owl2fs.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.Declaration#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see west.twouse.language.owl2fs.Declaration#getEntity()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Entity();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Declaration</em>'.
   * @see west.twouse.language.owl2fs.ClassDeclaration
   * @generated
   */
  EClass getClassDeclaration();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DatatypeDeclaration <em>Datatype Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype Declaration</em>'.
   * @see west.twouse.language.owl2fs.DatatypeDeclaration
   * @generated
   */
  EClass getDatatypeDeclaration();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectPropertyDeclaration <em>Object Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Declaration</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyDeclaration
   * @generated
   */
  EClass getObjectPropertyDeclaration();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataPropertyDeclaration <em>Data Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Declaration</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyDeclaration
   * @generated
   */
  EClass getDataPropertyDeclaration();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AnnotationPropertyDeclaration <em>Annotation Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Property Declaration</em>'.
   * @see west.twouse.language.owl2fs.AnnotationPropertyDeclaration
   * @generated
   */
  EClass getAnnotationPropertyDeclaration();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.NamedIndividualDeclaration <em>Named Individual Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Individual Declaration</em>'.
   * @see west.twouse.language.owl2fs.NamedIndividualDeclaration
   * @generated
   */
  EClass getNamedIndividualDeclaration();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see west.twouse.language.owl2fs.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.Entity#getEntityIRI <em>Entity IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity IRI</em>'.
   * @see west.twouse.language.owl2fs.Entity#getEntityIRI()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_EntityIRI();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AnnotationSubject <em>Annotation Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Subject</em>'.
   * @see west.twouse.language.owl2fs.AnnotationSubject
   * @generated
   */
  EClass getAnnotationSubject();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Value</em>'.
   * @see west.twouse.language.owl2fs.AnnotationValue
   * @generated
   */
  EClass getAnnotationValue();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see west.twouse.language.owl2fs.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.Annotation#getAnnotationAnnotations <em>Annotation Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation Annotations</em>'.
   * @see west.twouse.language.owl2fs.Annotation#getAnnotationAnnotations()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_AnnotationAnnotations();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.Annotation#getAnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Property</em>'.
   * @see west.twouse.language.owl2fs.Annotation#getAnnotationProperty()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_AnnotationProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.Annotation#getAnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Value</em>'.
   * @see west.twouse.language.owl2fs.Annotation#getAnnotationValue()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_AnnotationValue();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AnnotationAxiom <em>Annotation Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Axiom</em>'.
   * @see west.twouse.language.owl2fs.AnnotationAxiom
   * @generated
   */
  EClass getAnnotationAxiom();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.AnnotationAxiom#getAxiomAnnotations <em>Axiom Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Axiom Annotations</em>'.
   * @see west.twouse.language.owl2fs.AnnotationAxiom#getAxiomAnnotations()
   * @see #getAnnotationAxiom()
   * @generated
   */
  EReference getAnnotationAxiom_AxiomAnnotations();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AnnotationAssertion <em>Annotation Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Assertion</em>'.
   * @see west.twouse.language.owl2fs.AnnotationAssertion
   * @generated
   */
  EClass getAnnotationAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Property</em>'.
   * @see west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationProperty()
   * @see #getAnnotationAssertion()
   * @generated
   */
  EReference getAnnotationAssertion_AnnotationProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationSubject <em>Annotation Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Subject</em>'.
   * @see west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationSubject()
   * @see #getAnnotationAssertion()
   * @generated
   */
  EReference getAnnotationAssertion_AnnotationSubject();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Value</em>'.
   * @see west.twouse.language.owl2fs.AnnotationAssertion#getAnnotationValue()
   * @see #getAnnotationAssertion()
   * @generated
   */
  EReference getAnnotationAssertion_AnnotationValue();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.SubAnnotationPropertyOf <em>Sub Annotation Property Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Annotation Property Of</em>'.
   * @see west.twouse.language.owl2fs.SubAnnotationPropertyOf
   * @generated
   */
  EClass getSubAnnotationPropertyOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SubAnnotationPropertyOf#getSubAnnotationProperty <em>Sub Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Annotation Property</em>'.
   * @see west.twouse.language.owl2fs.SubAnnotationPropertyOf#getSubAnnotationProperty()
   * @see #getSubAnnotationPropertyOf()
   * @generated
   */
  EReference getSubAnnotationPropertyOf_SubAnnotationProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SubAnnotationPropertyOf#getSuperAnnotationProperty <em>Super Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Annotation Property</em>'.
   * @see west.twouse.language.owl2fs.SubAnnotationPropertyOf#getSuperAnnotationProperty()
   * @see #getSubAnnotationPropertyOf()
   * @generated
   */
  EReference getSubAnnotationPropertyOf_SuperAnnotationProperty();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AnnotationPropertyDomain <em>Annotation Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Property Domain</em>'.
   * @see west.twouse.language.owl2fs.AnnotationPropertyDomain
   * @generated
   */
  EClass getAnnotationPropertyDomain();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.AnnotationPropertyDomain#getAnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Property</em>'.
   * @see west.twouse.language.owl2fs.AnnotationPropertyDomain#getAnnotationProperty()
   * @see #getAnnotationPropertyDomain()
   * @generated
   */
  EReference getAnnotationPropertyDomain_AnnotationProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.AnnotationPropertyDomain#getIri <em>Iri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iri</em>'.
   * @see west.twouse.language.owl2fs.AnnotationPropertyDomain#getIri()
   * @see #getAnnotationPropertyDomain()
   * @generated
   */
  EReference getAnnotationPropertyDomain_Iri();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AnnotationPropertyRange <em>Annotation Property Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Property Range</em>'.
   * @see west.twouse.language.owl2fs.AnnotationPropertyRange
   * @generated
   */
  EClass getAnnotationPropertyRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.AnnotationPropertyRange#getAnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation Property</em>'.
   * @see west.twouse.language.owl2fs.AnnotationPropertyRange#getAnnotationProperty()
   * @see #getAnnotationPropertyRange()
   * @generated
   */
  EReference getAnnotationPropertyRange_AnnotationProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.AnnotationPropertyRange#getIri <em>Iri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iri</em>'.
   * @see west.twouse.language.owl2fs.AnnotationPropertyRange#getIri()
   * @see #getAnnotationPropertyRange()
   * @generated
   */
  EReference getAnnotationPropertyRange_Iri();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Property</em>'.
   * @see west.twouse.language.owl2fs.AnnotationProperty
   * @generated
   */
  EClass getAnnotationProperty();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see west.twouse.language.owl2fs.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataProperty <em>Data Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property</em>'.
   * @see west.twouse.language.owl2fs.DataProperty
   * @generated
   */
  EClass getDataProperty();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype</em>'.
   * @see west.twouse.language.owl2fs.Datatype
   * @generated
   */
  EClass getDatatype();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property</em>'.
   * @see west.twouse.language.owl2fs.ObjectProperty
   * @generated
   */
  EClass getObjectProperty();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Individual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Individual</em>'.
   * @see west.twouse.language.owl2fs.Individual
   * @generated
   */
  EClass getIndividual();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.NamedIndividual <em>Named Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Individual</em>'.
   * @see west.twouse.language.owl2fs.NamedIndividual
   * @generated
   */
  EClass getNamedIndividual();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AnonymousIndividual <em>Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anonymous Individual</em>'.
   * @see west.twouse.language.owl2fs.AnonymousIndividual
   * @generated
   */
  EClass getAnonymousIndividual();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.AnonymousIndividual#getNodeID <em>Node ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node ID</em>'.
   * @see west.twouse.language.owl2fs.AnonymousIndividual#getNodeID()
   * @see #getAnonymousIndividual()
   * @generated
   */
  EAttribute getAnonymousIndividual_NodeID();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see west.twouse.language.owl2fs.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.Literal#getLexicalValue <em>Lexical Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lexical Value</em>'.
   * @see west.twouse.language.owl2fs.Literal#getLexicalValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_LexicalValue();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.Literal#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see west.twouse.language.owl2fs.Literal#getDatatype()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Datatype();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.Literal#getLanguageTag <em>Language Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language Tag</em>'.
   * @see west.twouse.language.owl2fs.Literal#getLanguageTag()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_LanguageTag();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyExpression
   * @generated
   */
  EClass getObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.InverseObjectProperty <em>Inverse Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Object Property</em>'.
   * @see west.twouse.language.owl2fs.InverseObjectProperty
   * @generated
   */
  EClass getInverseObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.InverseObjectProperty#getObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property</em>'.
   * @see west.twouse.language.owl2fs.InverseObjectProperty#getObjectProperty()
   * @see #getInverseObjectProperty()
   * @generated
   */
  EReference getInverseObjectProperty_ObjectProperty();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyExpression
   * @generated
   */
  EClass getDataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DataRange
   * @generated
   */
  EClass getDataRange();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataIntersectionOf <em>Data Intersection Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Intersection Of</em>'.
   * @see west.twouse.language.owl2fs.DataIntersectionOf
   * @generated
   */
  EClass getDataIntersectionOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DataIntersectionOf#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DataIntersectionOf#getDataRange()
   * @see #getDataIntersectionOf()
   * @generated
   */
  EReference getDataIntersectionOf_DataRange();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataUnionOf <em>Data Union Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Union Of</em>'.
   * @see west.twouse.language.owl2fs.DataUnionOf
   * @generated
   */
  EClass getDataUnionOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DataUnionOf#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DataUnionOf#getDataRange()
   * @see #getDataUnionOf()
   * @generated
   */
  EReference getDataUnionOf_DataRange();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataComplementOf <em>Data Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Complement Of</em>'.
   * @see west.twouse.language.owl2fs.DataComplementOf
   * @generated
   */
  EClass getDataComplementOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataComplementOf#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DataComplementOf#getDataRange()
   * @see #getDataComplementOf()
   * @generated
   */
  EReference getDataComplementOf_DataRange();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataOneOf <em>Data One Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data One Of</em>'.
   * @see west.twouse.language.owl2fs.DataOneOf
   * @generated
   */
  EClass getDataOneOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DataOneOf#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see west.twouse.language.owl2fs.DataOneOf#getConstants()
   * @see #getDataOneOf()
   * @generated
   */
  EReference getDataOneOf_Constants();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DatatypeRestriction <em>Datatype Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype Restriction</em>'.
   * @see west.twouse.language.owl2fs.DatatypeRestriction
   * @generated
   */
  EClass getDatatypeRestriction();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DatatypeRestriction#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see west.twouse.language.owl2fs.DatatypeRestriction#getDatatype()
   * @see #getDatatypeRestriction()
   * @generated
   */
  EReference getDatatypeRestriction_Datatype();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DatatypeRestriction#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see west.twouse.language.owl2fs.DatatypeRestriction#getRestrictions()
   * @see #getDatatypeRestriction()
   * @generated
   */
  EReference getDatatypeRestriction_Restrictions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.FacetConstraintPair <em>Facet Constraint Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet Constraint Pair</em>'.
   * @see west.twouse.language.owl2fs.FacetConstraintPair
   * @generated
   */
  EClass getFacetConstraintPair();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.FacetConstraintPair#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see west.twouse.language.owl2fs.FacetConstraintPair#getConstant()
   * @see #getFacetConstraintPair()
   * @generated
   */
  EReference getFacetConstraintPair_Constant();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.FacetConstraintPair#getFacet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Facet</em>'.
   * @see west.twouse.language.owl2fs.FacetConstraintPair#getFacet()
   * @see #getFacetConstraintPair()
   * @generated
   */
  EReference getFacetConstraintPair_Facet();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Expression</em>'.
   * @see west.twouse.language.owl2fs.ClassExpression
   * @generated
   */
  EClass getClassExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Intersection Of</em>'.
   * @see west.twouse.language.owl2fs.ObjectIntersectionOf
   * @generated
   */
  EClass getObjectIntersectionOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.ObjectIntersectionOf#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see west.twouse.language.owl2fs.ObjectIntersectionOf#getClassExpressions()
   * @see #getObjectIntersectionOf()
   * @generated
   */
  EReference getObjectIntersectionOf_ClassExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectUnionOf <em>Object Union Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Union Of</em>'.
   * @see west.twouse.language.owl2fs.ObjectUnionOf
   * @generated
   */
  EClass getObjectUnionOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.ObjectUnionOf#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see west.twouse.language.owl2fs.ObjectUnionOf#getClassExpressions()
   * @see #getObjectUnionOf()
   * @generated
   */
  EReference getObjectUnionOf_ClassExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectComplementOf <em>Object Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Complement Of</em>'.
   * @see west.twouse.language.owl2fs.ObjectComplementOf
   * @generated
   */
  EClass getObjectComplementOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectComplementOf#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectComplementOf#getClassExpression()
   * @see #getObjectComplementOf()
   * @generated
   */
  EReference getObjectComplementOf_ClassExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectOneOf <em>Object One Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object One Of</em>'.
   * @see west.twouse.language.owl2fs.ObjectOneOf
   * @generated
   */
  EClass getObjectOneOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.ObjectOneOf#getIndividuals <em>Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Individuals</em>'.
   * @see west.twouse.language.owl2fs.ObjectOneOf#getIndividuals()
   * @see #getObjectOneOf()
   * @generated
   */
  EReference getObjectOneOf_Individuals();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Some Values From</em>'.
   * @see west.twouse.language.owl2fs.ObjectSomeValuesFrom
   * @generated
   */
  EClass getObjectSomeValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectSomeValuesFrom#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectSomeValuesFrom#getClassExpression()
   * @see #getObjectSomeValuesFrom()
   * @generated
   */
  EReference getObjectSomeValuesFrom_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectSomeValuesFrom#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectSomeValuesFrom#getObjectPropertyExpression()
   * @see #getObjectSomeValuesFrom()
   * @generated
   */
  EReference getObjectSomeValuesFrom_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectAllValuesFrom <em>Object All Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object All Values From</em>'.
   * @see west.twouse.language.owl2fs.ObjectAllValuesFrom
   * @generated
   */
  EClass getObjectAllValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectAllValuesFrom#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectAllValuesFrom#getClassExpression()
   * @see #getObjectAllValuesFrom()
   * @generated
   */
  EReference getObjectAllValuesFrom_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectAllValuesFrom#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectAllValuesFrom#getObjectPropertyExpression()
   * @see #getObjectAllValuesFrom()
   * @generated
   */
  EReference getObjectAllValuesFrom_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectHasSelf <em>Object Has Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Has Self</em>'.
   * @see west.twouse.language.owl2fs.ObjectHasSelf
   * @generated
   */
  EClass getObjectHasSelf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectHasSelf#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectHasSelf#getObjectPropertyExpression()
   * @see #getObjectHasSelf()
   * @generated
   */
  EReference getObjectHasSelf_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectHasValue <em>Object Has Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Has Value</em>'.
   * @see west.twouse.language.owl2fs.ObjectHasValue
   * @generated
   */
  EClass getObjectHasValue();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectHasValue#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectHasValue#getObjectPropertyExpression()
   * @see #getObjectHasValue()
   * @generated
   */
  EReference getObjectHasValue_ObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectHasValue#getIndividual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual</em>'.
   * @see west.twouse.language.owl2fs.ObjectHasValue#getIndividual()
   * @see #getObjectHasValue()
   * @generated
   */
  EReference getObjectHasValue_Individual();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Min Cardinality</em>'.
   * @see west.twouse.language.owl2fs.ObjectMinCardinality
   * @generated
   */
  EClass getObjectMinCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.ObjectMinCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.owl2fs.ObjectMinCardinality#getCardinality()
   * @see #getObjectMinCardinality()
   * @generated
   */
  EAttribute getObjectMinCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectMinCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectMinCardinality#getClassExpression()
   * @see #getObjectMinCardinality()
   * @generated
   */
  EReference getObjectMinCardinality_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectMinCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectMinCardinality#getObjectPropertyExpression()
   * @see #getObjectMinCardinality()
   * @generated
   */
  EReference getObjectMinCardinality_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Max Cardinality</em>'.
   * @see west.twouse.language.owl2fs.ObjectMaxCardinality
   * @generated
   */
  EClass getObjectMaxCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.ObjectMaxCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.owl2fs.ObjectMaxCardinality#getCardinality()
   * @see #getObjectMaxCardinality()
   * @generated
   */
  EAttribute getObjectMaxCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectMaxCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectMaxCardinality#getClassExpression()
   * @see #getObjectMaxCardinality()
   * @generated
   */
  EReference getObjectMaxCardinality_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectMaxCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectMaxCardinality#getObjectPropertyExpression()
   * @see #getObjectMaxCardinality()
   * @generated
   */
  EReference getObjectMaxCardinality_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Exact Cardinality</em>'.
   * @see west.twouse.language.owl2fs.ObjectExactCardinality
   * @generated
   */
  EClass getObjectExactCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.ObjectExactCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.owl2fs.ObjectExactCardinality#getCardinality()
   * @see #getObjectExactCardinality()
   * @generated
   */
  EAttribute getObjectExactCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectExactCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectExactCardinality#getClassExpression()
   * @see #getObjectExactCardinality()
   * @generated
   */
  EReference getObjectExactCardinality_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectExactCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectExactCardinality#getObjectPropertyExpression()
   * @see #getObjectExactCardinality()
   * @generated
   */
  EReference getObjectExactCardinality_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataSomeValuesFrom <em>Data Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Some Values From</em>'.
   * @see west.twouse.language.owl2fs.DataSomeValuesFrom
   * @generated
   */
  EClass getDataSomeValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataSomeValuesFrom#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DataSomeValuesFrom#getDataRange()
   * @see #getDataSomeValuesFrom()
   * @generated
   */
  EReference getDataSomeValuesFrom_DataRange();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DataSomeValuesFrom#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
   * @see west.twouse.language.owl2fs.DataSomeValuesFrom#getDataPropertyExpressions()
   * @see #getDataSomeValuesFrom()
   * @generated
   */
  EReference getDataSomeValuesFrom_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataAllValuesFrom <em>Data All Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data All Values From</em>'.
   * @see west.twouse.language.owl2fs.DataAllValuesFrom
   * @generated
   */
  EClass getDataAllValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataAllValuesFrom#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DataAllValuesFrom#getDataRange()
   * @see #getDataAllValuesFrom()
   * @generated
   */
  EReference getDataAllValuesFrom_DataRange();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DataAllValuesFrom#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
   * @see west.twouse.language.owl2fs.DataAllValuesFrom#getDataPropertyExpressions()
   * @see #getDataAllValuesFrom()
   * @generated
   */
  EReference getDataAllValuesFrom_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataHasValue <em>Data Has Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Has Value</em>'.
   * @see west.twouse.language.owl2fs.DataHasValue
   * @generated
   */
  EClass getDataHasValue();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataHasValue#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see west.twouse.language.owl2fs.DataHasValue#getConstant()
   * @see #getDataHasValue()
   * @generated
   */
  EReference getDataHasValue_Constant();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataHasValue#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.DataHasValue#getDataPropertyExpression()
   * @see #getDataHasValue()
   * @generated
   */
  EReference getDataHasValue_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataMinCardinality <em>Data Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Min Cardinality</em>'.
   * @see west.twouse.language.owl2fs.DataMinCardinality
   * @generated
   */
  EClass getDataMinCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.DataMinCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.owl2fs.DataMinCardinality#getCardinality()
   * @see #getDataMinCardinality()
   * @generated
   */
  EAttribute getDataMinCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataMinCardinality#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DataMinCardinality#getDataRange()
   * @see #getDataMinCardinality()
   * @generated
   */
  EReference getDataMinCardinality_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataMinCardinality#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.DataMinCardinality#getDataPropertyExpression()
   * @see #getDataMinCardinality()
   * @generated
   */
  EReference getDataMinCardinality_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataMaxCardinality <em>Data Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Max Cardinality</em>'.
   * @see west.twouse.language.owl2fs.DataMaxCardinality
   * @generated
   */
  EClass getDataMaxCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.DataMaxCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.owl2fs.DataMaxCardinality#getCardinality()
   * @see #getDataMaxCardinality()
   * @generated
   */
  EAttribute getDataMaxCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataMaxCardinality#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DataMaxCardinality#getDataRange()
   * @see #getDataMaxCardinality()
   * @generated
   */
  EReference getDataMaxCardinality_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataMaxCardinality#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.DataMaxCardinality#getDataPropertyExpression()
   * @see #getDataMaxCardinality()
   * @generated
   */
  EReference getDataMaxCardinality_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataExactCardinality <em>Data Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Exact Cardinality</em>'.
   * @see west.twouse.language.owl2fs.DataExactCardinality
   * @generated
   */
  EClass getDataExactCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.DataExactCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.owl2fs.DataExactCardinality#getCardinality()
   * @see #getDataExactCardinality()
   * @generated
   */
  EAttribute getDataExactCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataExactCardinality#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DataExactCardinality#getDataRange()
   * @see #getDataExactCardinality()
   * @generated
   */
  EReference getDataExactCardinality_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataExactCardinality#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.DataExactCardinality#getDataPropertyExpression()
   * @see #getDataExactCardinality()
   * @generated
   */
  EReference getDataExactCardinality_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ClassAxiom <em>Class Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Axiom</em>'.
   * @see west.twouse.language.owl2fs.ClassAxiom
   * @generated
   */
  EClass getClassAxiom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.SubClassOf <em>Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Class Of</em>'.
   * @see west.twouse.language.owl2fs.SubClassOf
   * @generated
   */
  EClass getSubClassOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SubClassOf#getSubClassExpression <em>Sub Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Class Expression</em>'.
   * @see west.twouse.language.owl2fs.SubClassOf#getSubClassExpression()
   * @see #getSubClassOf()
   * @generated
   */
  EReference getSubClassOf_SubClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SubClassOf#getSuperClassExpression <em>Super Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Class Expression</em>'.
   * @see west.twouse.language.owl2fs.SubClassOf#getSuperClassExpression()
   * @see #getSubClassOf()
   * @generated
   */
  EReference getSubClassOf_SuperClassExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.EquivalentClasses <em>Equivalent Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Classes</em>'.
   * @see west.twouse.language.owl2fs.EquivalentClasses
   * @generated
   */
  EClass getEquivalentClasses();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.EquivalentClasses#getEquivalentClassExpressions <em>Equivalent Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Equivalent Class Expressions</em>'.
   * @see west.twouse.language.owl2fs.EquivalentClasses#getEquivalentClassExpressions()
   * @see #getEquivalentClasses()
   * @generated
   */
  EReference getEquivalentClasses_EquivalentClassExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DisjointClasses <em>Disjoint Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Classes</em>'.
   * @see west.twouse.language.owl2fs.DisjointClasses
   * @generated
   */
  EClass getDisjointClasses();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DisjointClasses#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disjoint Class Expressions</em>'.
   * @see west.twouse.language.owl2fs.DisjointClasses#getDisjointClassExpressions()
   * @see #getDisjointClasses()
   * @generated
   */
  EReference getDisjointClasses_DisjointClassExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DisjointUnion <em>Disjoint Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Union</em>'.
   * @see west.twouse.language.owl2fs.DisjointUnion
   * @generated
   */
  EClass getDisjointUnion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DisjointUnion#getUnionClass <em>Union Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Union Class</em>'.
   * @see west.twouse.language.owl2fs.DisjointUnion#getUnionClass()
   * @see #getDisjointUnion()
   * @generated
   */
  EReference getDisjointUnion_UnionClass();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DisjointUnion#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disjoint Class Expressions</em>'.
   * @see west.twouse.language.owl2fs.DisjointUnion#getDisjointClassExpressions()
   * @see #getDisjointUnion()
   * @generated
   */
  EReference getDisjointUnion_DisjointClassExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectPropertyAxiom <em>Object Property Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Axiom</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyAxiom
   * @generated
   */
  EClass getObjectPropertyAxiom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Object Property Of</em>'.
   * @see west.twouse.language.owl2fs.SubObjectPropertyOf
   * @generated
   */
  EClass getSubObjectPropertyOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SubObjectPropertyOf#getSubObjectPropertyExpression <em>Sub Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.SubObjectPropertyOf#getSubObjectPropertyExpression()
   * @see #getSubObjectPropertyOf()
   * @generated
   */
  EReference getSubObjectPropertyOf_SubObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.SubObjectPropertyOf#getSuperObjectPropertyExpression()
   * @see #getSubObjectPropertyOf()
   * @generated
   */
  EReference getSubObjectPropertyOf_SuperObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.SubObjectPropertyExpression <em>Sub Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.SubObjectPropertyExpression
   * @generated
   */
  EClass getSubObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectPropertyChain <em>Object Property Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Chain</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyChain
   * @generated
   */
  EClass getObjectPropertyChain();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.ObjectPropertyChain#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expressions</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyChain#getObjectPropertyExpressions()
   * @see #getObjectPropertyChain()
   * @generated
   */
  EReference getObjectPropertyChain_ObjectPropertyExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Object Properties</em>'.
   * @see west.twouse.language.owl2fs.EquivalentObjectProperties
   * @generated
   */
  EClass getEquivalentObjectProperties();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.EquivalentObjectProperties#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expressions</em>'.
   * @see west.twouse.language.owl2fs.EquivalentObjectProperties#getObjectPropertyExpressions()
   * @see #getEquivalentObjectProperties()
   * @generated
   */
  EReference getEquivalentObjectProperties_ObjectPropertyExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DisjointObjectProperties <em>Disjoint Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Object Properties</em>'.
   * @see west.twouse.language.owl2fs.DisjointObjectProperties
   * @generated
   */
  EClass getDisjointObjectProperties();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DisjointObjectProperties#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expressions</em>'.
   * @see west.twouse.language.owl2fs.DisjointObjectProperties#getObjectPropertyExpressions()
   * @see #getDisjointObjectProperties()
   * @generated
   */
  EReference getDisjointObjectProperties_ObjectPropertyExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectPropertyDomain <em>Object Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Domain</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyDomain
   * @generated
   */
  EClass getObjectPropertyDomain();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectPropertyDomain#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyDomain#getDomain()
   * @see #getObjectPropertyDomain()
   * @generated
   */
  EReference getObjectPropertyDomain_Domain();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectPropertyDomain#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyDomain#getObjectPropertyExpression()
   * @see #getObjectPropertyDomain()
   * @generated
   */
  EReference getObjectPropertyDomain_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectPropertyRange <em>Object Property Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Range</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyRange
   * @generated
   */
  EClass getObjectPropertyRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectPropertyRange#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyRange#getRange()
   * @see #getObjectPropertyRange()
   * @generated
   */
  EReference getObjectPropertyRange_Range();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectPropertyRange#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyRange#getObjectPropertyExpression()
   * @see #getObjectPropertyRange()
   * @generated
   */
  EReference getObjectPropertyRange_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.InverseObjectProperties <em>Inverse Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Object Properties</em>'.
   * @see west.twouse.language.owl2fs.InverseObjectProperties
   * @generated
   */
  EClass getInverseObjectProperties();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.InverseObjectProperties#getObjectPropertyExpression1 <em>Object Property Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression1</em>'.
   * @see west.twouse.language.owl2fs.InverseObjectProperties#getObjectPropertyExpression1()
   * @see #getInverseObjectProperties()
   * @generated
   */
  EReference getInverseObjectProperties_ObjectPropertyExpression1();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.InverseObjectProperties#getObjectPropertyExpression2 <em>Object Property Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression2</em>'.
   * @see west.twouse.language.owl2fs.InverseObjectProperties#getObjectPropertyExpression2()
   * @see #getInverseObjectProperties()
   * @generated
   */
  EReference getInverseObjectProperties_ObjectPropertyExpression2();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.FunctionalObjectProperty <em>Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functional Object Property</em>'.
   * @see west.twouse.language.owl2fs.FunctionalObjectProperty
   * @generated
   */
  EClass getFunctionalObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.FunctionalObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.FunctionalObjectProperty#getObjectPropertyExpression()
   * @see #getFunctionalObjectProperty()
   * @generated
   */
  EReference getFunctionalObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Functional Object Property</em>'.
   * @see west.twouse.language.owl2fs.InverseFunctionalObjectProperty
   * @generated
   */
  EClass getInverseFunctionalObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.InverseFunctionalObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.InverseFunctionalObjectProperty#getObjectPropertyExpression()
   * @see #getInverseFunctionalObjectProperty()
   * @generated
   */
  EReference getInverseFunctionalObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reflexive Object Property</em>'.
   * @see west.twouse.language.owl2fs.ReflexiveObjectProperty
   * @generated
   */
  EClass getReflexiveObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ReflexiveObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ReflexiveObjectProperty#getObjectPropertyExpression()
   * @see #getReflexiveObjectProperty()
   * @generated
   */
  EReference getReflexiveObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.IrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Irreflexive Object Property</em>'.
   * @see west.twouse.language.owl2fs.IrreflexiveObjectProperty
   * @generated
   */
  EClass getIrreflexiveObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.IrreflexiveObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.IrreflexiveObjectProperty#getObjectPropertyExpression()
   * @see #getIrreflexiveObjectProperty()
   * @generated
   */
  EReference getIrreflexiveObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symmetric Object Property</em>'.
   * @see west.twouse.language.owl2fs.SymmetricObjectProperty
   * @generated
   */
  EClass getSymmetricObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SymmetricObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.SymmetricObjectProperty#getObjectPropertyExpression()
   * @see #getSymmetricObjectProperty()
   * @generated
   */
  EReference getSymmetricObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.AsymmetricObjectProperty <em>Asymmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asymmetric Object Property</em>'.
   * @see west.twouse.language.owl2fs.AsymmetricObjectProperty
   * @generated
   */
  EClass getAsymmetricObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.AsymmetricObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.AsymmetricObjectProperty#getObjectPropertyExpression()
   * @see #getAsymmetricObjectProperty()
   * @generated
   */
  EReference getAsymmetricObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transitive Object Property</em>'.
   * @see west.twouse.language.owl2fs.TransitiveObjectProperty
   * @generated
   */
  EClass getTransitiveObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.TransitiveObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.TransitiveObjectProperty#getObjectPropertyExpression()
   * @see #getTransitiveObjectProperty()
   * @generated
   */
  EReference getTransitiveObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataPropertyAxiom <em>Data Property Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Axiom</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyAxiom
   * @generated
   */
  EClass getDataPropertyAxiom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Data Property Of</em>'.
   * @see west.twouse.language.owl2fs.SubDataPropertyOf
   * @generated
   */
  EClass getSubDataPropertyOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SubDataPropertyOf#getSuperDataPropertyExpression <em>Super Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.SubDataPropertyOf#getSuperDataPropertyExpression()
   * @see #getSubDataPropertyOf()
   * @generated
   */
  EReference getSubDataPropertyOf_SuperDataPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SubDataPropertyOf#getSubDataPropertyExpression <em>Sub Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.SubDataPropertyOf#getSubDataPropertyExpression()
   * @see #getSubDataPropertyOf()
   * @generated
   */
  EReference getSubDataPropertyOf_SubDataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.EquivalentDataProperties <em>Equivalent Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Data Properties</em>'.
   * @see west.twouse.language.owl2fs.EquivalentDataProperties
   * @generated
   */
  EClass getEquivalentDataProperties();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.EquivalentDataProperties#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
   * @see west.twouse.language.owl2fs.EquivalentDataProperties#getDataPropertyExpressions()
   * @see #getEquivalentDataProperties()
   * @generated
   */
  EReference getEquivalentDataProperties_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DisjointDataProperties <em>Disjoint Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Data Properties</em>'.
   * @see west.twouse.language.owl2fs.DisjointDataProperties
   * @generated
   */
  EClass getDisjointDataProperties();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DisjointDataProperties#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
   * @see west.twouse.language.owl2fs.DisjointDataProperties#getDataPropertyExpressions()
   * @see #getDisjointDataProperties()
   * @generated
   */
  EReference getDisjointDataProperties_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataPropertyDomain <em>Data Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Domain</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyDomain
   * @generated
   */
  EClass getDataPropertyDomain();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataPropertyDomain#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyDomain#getDomain()
   * @see #getDataPropertyDomain()
   * @generated
   */
  EReference getDataPropertyDomain_Domain();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataPropertyDomain#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyDomain#getDataPropertyExpression()
   * @see #getDataPropertyDomain()
   * @generated
   */
  EReference getDataPropertyDomain_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataPropertyRange <em>Data Property Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Range</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyRange
   * @generated
   */
  EClass getDataPropertyRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataPropertyRange#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyRange#getRange()
   * @see #getDataPropertyRange()
   * @generated
   */
  EReference getDataPropertyRange_Range();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataPropertyRange#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyRange#getDataPropertyExpression()
   * @see #getDataPropertyRange()
   * @generated
   */
  EReference getDataPropertyRange_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.FunctionalDataProperty <em>Functional Data Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functional Data Property</em>'.
   * @see west.twouse.language.owl2fs.FunctionalDataProperty
   * @generated
   */
  EClass getFunctionalDataProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.FunctionalDataProperty#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.FunctionalDataProperty#getDataPropertyExpression()
   * @see #getFunctionalDataProperty()
   * @generated
   */
  EReference getFunctionalDataProperty_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DatatypeDefinition <em>Datatype Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype Definition</em>'.
   * @see west.twouse.language.owl2fs.DatatypeDefinition
   * @generated
   */
  EClass getDatatypeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DatatypeDefinition#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see west.twouse.language.owl2fs.DatatypeDefinition#getDatatype()
   * @see #getDatatypeDefinition()
   * @generated
   */
  EReference getDatatypeDefinition_Datatype();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DatatypeDefinition#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DatatypeDefinition#getDataRange()
   * @see #getDatatypeDefinition()
   * @generated
   */
  EReference getDatatypeDefinition_DataRange();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.HasKey <em>Has Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Key</em>'.
   * @see west.twouse.language.owl2fs.HasKey
   * @generated
   */
  EClass getHasKey();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.HasKey#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.owl2fs.HasKey#getClassExpression()
   * @see #getHasKey()
   * @generated
   */
  EReference getHasKey_ClassExpression();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.HasKey#getObjectPropertyExpressions <em>Object Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expressions</em>'.
   * @see west.twouse.language.owl2fs.HasKey#getObjectPropertyExpressions()
   * @see #getHasKey()
   * @generated
   */
  EReference getHasKey_ObjectPropertyExpressions();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.HasKey#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
   * @see west.twouse.language.owl2fs.HasKey#getDataPropertyExpressions()
   * @see #getHasKey()
   * @generated
   */
  EReference getHasKey_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see west.twouse.language.owl2fs.Assertion
   * @generated
   */
  EClass getAssertion();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.SameIndividual <em>Same Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Same Individual</em>'.
   * @see west.twouse.language.owl2fs.SameIndividual
   * @generated
   */
  EClass getSameIndividual();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.SameIndividual#getSameIndividuals <em>Same Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Same Individuals</em>'.
   * @see west.twouse.language.owl2fs.SameIndividual#getSameIndividuals()
   * @see #getSameIndividual()
   * @generated
   */
  EReference getSameIndividual_SameIndividuals();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DifferentIndividuals <em>Different Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Different Individuals</em>'.
   * @see west.twouse.language.owl2fs.DifferentIndividuals
   * @generated
   */
  EClass getDifferentIndividuals();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DifferentIndividuals#getDifferentIndividuals <em>Different Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Different Individuals</em>'.
   * @see west.twouse.language.owl2fs.DifferentIndividuals#getDifferentIndividuals()
   * @see #getDifferentIndividuals()
   * @generated
   */
  EReference getDifferentIndividuals_DifferentIndividuals();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ClassAssertion <em>Class Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Assertion</em>'.
   * @see west.twouse.language.owl2fs.ClassAssertion
   * @generated
   */
  EClass getClassAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ClassAssertion#getIndividual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual</em>'.
   * @see west.twouse.language.owl2fs.ClassAssertion#getIndividual()
   * @see #getClassAssertion()
   * @generated
   */
  EReference getClassAssertion_Individual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ClassAssertion#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.owl2fs.ClassAssertion#getClassExpression()
   * @see #getClassAssertion()
   * @generated
   */
  EReference getClassAssertion_ClassExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Assertion</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyAssertion
   * @generated
   */
  EClass getObjectPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyAssertion#getObjectPropertyExpression()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
  EReference getObjectPropertyAssertion_ObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyAssertion#getSourceIndividual()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
  EReference getObjectPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Individual</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyAssertion#getTargetIndividual()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
  EReference getObjectPropertyAssertion_TargetIndividual();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Object Property Assertion</em>'.
   * @see west.twouse.language.owl2fs.NegativeObjectPropertyAssertion
   * @generated
   */
  EClass getNegativeObjectPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.NegativeObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.NegativeObjectPropertyAssertion#getObjectPropertyExpression()
   * @see #getNegativeObjectPropertyAssertion()
   * @generated
   */
  EReference getNegativeObjectPropertyAssertion_ObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.NegativeObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see west.twouse.language.owl2fs.NegativeObjectPropertyAssertion#getSourceIndividual()
   * @see #getNegativeObjectPropertyAssertion()
   * @generated
   */
  EReference getNegativeObjectPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Individual</em>'.
   * @see west.twouse.language.owl2fs.NegativeObjectPropertyAssertion#getTargetIndividual()
   * @see #getNegativeObjectPropertyAssertion()
   * @generated
   */
  EReference getNegativeObjectPropertyAssertion_TargetIndividual();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataPropertyAssertion <em>Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Assertion</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyAssertion
   * @generated
   */
  EClass getDataPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyAssertion#getDataPropertyExpression()
   * @see #getDataPropertyAssertion()
   * @generated
   */
  EReference getDataPropertyAssertion_DataPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Value</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyAssertion#getTargetValue()
   * @see #getDataPropertyAssertion()
   * @generated
   */
  EReference getDataPropertyAssertion_TargetValue();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see west.twouse.language.owl2fs.DataPropertyAssertion#getSourceIndividual()
   * @see #getDataPropertyAssertion()
   * @generated
   */
  EReference getDataPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Data Property Assertion</em>'.
   * @see west.twouse.language.owl2fs.NegativeDataPropertyAssertion
   * @generated
   */
  EClass getNegativeDataPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.NegativeDataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.owl2fs.NegativeDataPropertyAssertion#getDataPropertyExpression()
   * @see #getNegativeDataPropertyAssertion()
   * @generated
   */
  EReference getNegativeDataPropertyAssertion_DataPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.NegativeDataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Value</em>'.
   * @see west.twouse.language.owl2fs.NegativeDataPropertyAssertion#getTargetValue()
   * @see #getNegativeDataPropertyAssertion()
   * @generated
   */
  EReference getNegativeDataPropertyAssertion_TargetValue();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.NegativeDataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see west.twouse.language.owl2fs.NegativeDataPropertyAssertion#getSourceIndividual()
   * @see #getNegativeDataPropertyAssertion()
   * @generated
   */
  EReference getNegativeDataPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see west.twouse.language.owl2fs.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DLSafeRule <em>DL Safe Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DL Safe Rule</em>'.
   * @see west.twouse.language.owl2fs.DLSafeRule
   * @generated
   */
  EClass getDLSafeRule();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DLSafeRule#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see west.twouse.language.owl2fs.DLSafeRule#getAnnotation()
   * @see #getDLSafeRule()
   * @generated
   */
  EReference getDLSafeRule_Annotation();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DLSafeRule#getBodyAtom <em>Body Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body Atom</em>'.
   * @see west.twouse.language.owl2fs.DLSafeRule#getBodyAtom()
   * @see #getDLSafeRule()
   * @generated
   */
  EReference getDLSafeRule_BodyAtom();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DLSafeRule#getHeadAtom <em>Head Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Head Atom</em>'.
   * @see west.twouse.language.owl2fs.DLSafeRule#getHeadAtom()
   * @see #getDLSafeRule()
   * @generated
   */
  EReference getDLSafeRule_HeadAtom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see west.twouse.language.owl2fs.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ClassAtom <em>Class Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Atom</em>'.
   * @see west.twouse.language.owl2fs.ClassAtom
   * @generated
   */
  EClass getClassAtom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ClassAtom#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.owl2fs.ClassAtom#getClassExpression()
   * @see #getClassAtom()
   * @generated
   */
  EReference getClassAtom_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ClassAtom#getIArg <em>IArg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IArg</em>'.
   * @see west.twouse.language.owl2fs.ClassAtom#getIArg()
   * @see #getClassAtom()
   * @generated
   */
  EReference getClassAtom_IArg();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataRangeAtom <em>Data Range Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Range Atom</em>'.
   * @see west.twouse.language.owl2fs.DataRangeAtom
   * @generated
   */
  EClass getDataRangeAtom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataRangeAtom#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.owl2fs.DataRangeAtom#getDataRange()
   * @see #getDataRangeAtom()
   * @generated
   */
  EReference getDataRangeAtom_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataRangeAtom#getDArg <em>DArg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>DArg</em>'.
   * @see west.twouse.language.owl2fs.DataRangeAtom#getDArg()
   * @see #getDataRangeAtom()
   * @generated
   */
  EReference getDataRangeAtom_DArg();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ObjectPropertyAtom <em>Object Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Atom</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyAtom
   * @generated
   */
  EClass getObjectPropertyAtom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectPropertyAtom#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyAtom#getObjectPropertyExpression()
   * @see #getObjectPropertyAtom()
   * @generated
   */
  EReference getObjectPropertyAtom_ObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectPropertyAtom#getIArg1 <em>IArg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IArg1</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyAtom#getIArg1()
   * @see #getObjectPropertyAtom()
   * @generated
   */
  EReference getObjectPropertyAtom_IArg1();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.ObjectPropertyAtom#getIArg2 <em>IArg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IArg2</em>'.
   * @see west.twouse.language.owl2fs.ObjectPropertyAtom#getIArg2()
   * @see #getObjectPropertyAtom()
   * @generated
   */
  EReference getObjectPropertyAtom_IArg2();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DataPropetyAtom <em>Data Propety Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Propety Atom</em>'.
   * @see west.twouse.language.owl2fs.DataPropetyAtom
   * @generated
   */
  EClass getDataPropetyAtom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataPropetyAtom#getDataProperty <em>Data Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property</em>'.
   * @see west.twouse.language.owl2fs.DataPropetyAtom#getDataProperty()
   * @see #getDataPropetyAtom()
   * @generated
   */
  EReference getDataPropetyAtom_DataProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataPropetyAtom#getIArg <em>IArg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IArg</em>'.
   * @see west.twouse.language.owl2fs.DataPropetyAtom#getIArg()
   * @see #getDataPropetyAtom()
   * @generated
   */
  EReference getDataPropetyAtom_IArg();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DataPropetyAtom#getDArg <em>DArg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>DArg</em>'.
   * @see west.twouse.language.owl2fs.DataPropetyAtom#getDArg()
   * @see #getDataPropetyAtom()
   * @generated
   */
  EReference getDataPropetyAtom_DArg();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.BuiltInAtom <em>Built In Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Atom</em>'.
   * @see west.twouse.language.owl2fs.BuiltInAtom
   * @generated
   */
  EClass getBuiltInAtom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.BuiltInAtom#getIri <em>Iri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iri</em>'.
   * @see west.twouse.language.owl2fs.BuiltInAtom#getIri()
   * @see #getBuiltInAtom()
   * @generated
   */
  EReference getBuiltInAtom_Iri();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.BuiltInAtom#getDArg <em>DArg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>DArg</em>'.
   * @see west.twouse.language.owl2fs.BuiltInAtom#getDArg()
   * @see #getBuiltInAtom()
   * @generated
   */
  EReference getBuiltInAtom_DArg();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.SameIndividualAtom <em>Same Individual Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Same Individual Atom</em>'.
   * @see west.twouse.language.owl2fs.SameIndividualAtom
   * @generated
   */
  EClass getSameIndividualAtom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SameIndividualAtom#getIArg1 <em>IArg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IArg1</em>'.
   * @see west.twouse.language.owl2fs.SameIndividualAtom#getIArg1()
   * @see #getSameIndividualAtom()
   * @generated
   */
  EReference getSameIndividualAtom_IArg1();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.SameIndividualAtom#getIArg2 <em>IArg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IArg2</em>'.
   * @see west.twouse.language.owl2fs.SameIndividualAtom#getIArg2()
   * @see #getSameIndividualAtom()
   * @generated
   */
  EReference getSameIndividualAtom_IArg2();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DifferentIndividualsAtom <em>Different Individuals Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Different Individuals Atom</em>'.
   * @see west.twouse.language.owl2fs.DifferentIndividualsAtom
   * @generated
   */
  EClass getDifferentIndividualsAtom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DifferentIndividualsAtom#getIArg1 <em>IArg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IArg1</em>'.
   * @see west.twouse.language.owl2fs.DifferentIndividualsAtom#getIArg1()
   * @see #getDifferentIndividualsAtom()
   * @generated
   */
  EReference getDifferentIndividualsAtom_IArg1();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DifferentIndividualsAtom#getIArg2 <em>IArg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>IArg2</em>'.
   * @see west.twouse.language.owl2fs.DifferentIndividualsAtom#getIArg2()
   * @see #getDifferentIndividualsAtom()
   * @generated
   */
  EReference getDifferentIndividualsAtom_IArg2();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.IArg <em>IArg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IArg</em>'.
   * @see west.twouse.language.owl2fs.IArg
   * @generated
   */
  EClass getIArg();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DArg <em>DArg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DArg</em>'.
   * @see west.twouse.language.owl2fs.DArg
   * @generated
   */
  EClass getDArg();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see west.twouse.language.owl2fs.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.Variable#getIri <em>Iri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iri</em>'.
   * @see west.twouse.language.owl2fs.Variable#getIri()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Iri();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DGRule <em>DG Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DG Rule</em>'.
   * @see west.twouse.language.owl2fs.DGRule
   * @generated
   */
  EClass getDGRule();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DGRule#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see west.twouse.language.owl2fs.DGRule#getAnnotation()
   * @see #getDGRule()
   * @generated
   */
  EReference getDGRule_Annotation();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DGRule#getBodyAtom <em>Body Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body Atom</em>'.
   * @see west.twouse.language.owl2fs.DGRule#getBodyAtom()
   * @see #getDGRule()
   * @generated
   */
  EReference getDGRule_BodyAtom();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DGRule#getHeadAtom <em>Head Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Head Atom</em>'.
   * @see west.twouse.language.owl2fs.DGRule#getHeadAtom()
   * @see #getDGRule()
   * @generated
   */
  EReference getDGRule_HeadAtom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DGAtom <em>DG Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DG Atom</em>'.
   * @see west.twouse.language.owl2fs.DGAtom
   * @generated
   */
  EClass getDGAtom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DGAxiom <em>DG Axiom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DG Axiom</em>'.
   * @see west.twouse.language.owl2fs.DGAxiom
   * @generated
   */
  EClass getDGAxiom();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DGAxiom#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see west.twouse.language.owl2fs.DGAxiom#getAnnotation()
   * @see #getDGAxiom()
   * @generated
   */
  EReference getDGAxiom_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DGAxiom#getDgNodes <em>Dg Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dg Nodes</em>'.
   * @see west.twouse.language.owl2fs.DGAxiom#getDgNodes()
   * @see #getDGAxiom()
   * @generated
   */
  EReference getDGAxiom_DgNodes();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DGAxiom#getDgEdges <em>Dg Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dg Edges</em>'.
   * @see west.twouse.language.owl2fs.DGAxiom#getDgEdges()
   * @see #getDGAxiom()
   * @generated
   */
  EReference getDGAxiom_DgEdges();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.DGAxiom#getMainClasses <em>Main Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main Classes</em>'.
   * @see west.twouse.language.owl2fs.DGAxiom#getMainClasses()
   * @see #getDGAxiom()
   * @generated
   */
  EReference getDGAxiom_MainClasses();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DGNodes <em>DG Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DG Nodes</em>'.
   * @see west.twouse.language.owl2fs.DGNodes
   * @generated
   */
  EClass getDGNodes();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DGNodes#getNodeAssertion <em>Node Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Node Assertion</em>'.
   * @see west.twouse.language.owl2fs.DGNodes#getNodeAssertion()
   * @see #getDGNodes()
   * @generated
   */
  EReference getDGNodes_NodeAssertion();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.NodeAssertion <em>Node Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Assertion</em>'.
   * @see west.twouse.language.owl2fs.NodeAssertion
   * @generated
   */
  EClass getNodeAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.NodeAssertion#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see west.twouse.language.owl2fs.NodeAssertion#getClass_()
   * @see #getNodeAssertion()
   * @generated
   */
  EReference getNodeAssertion_Class();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.NodeAssertion#getDgNode <em>Dg Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dg Node</em>'.
   * @see west.twouse.language.owl2fs.NodeAssertion#getDgNode()
   * @see #getNodeAssertion()
   * @generated
   */
  EReference getNodeAssertion_DgNode();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.DGEdges <em>DG Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DG Edges</em>'.
   * @see west.twouse.language.owl2fs.DGEdges
   * @generated
   */
  EClass getDGEdges();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.DGEdges#getEdgeAssertion <em>Edge Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edge Assertion</em>'.
   * @see west.twouse.language.owl2fs.DGEdges#getEdgeAssertion()
   * @see #getDGEdges()
   * @generated
   */
  EReference getDGEdges_EdgeAssertion();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.EdgeAssertion <em>Edge Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Assertion</em>'.
   * @see west.twouse.language.owl2fs.EdgeAssertion
   * @generated
   */
  EClass getEdgeAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.EdgeAssertion#getObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property</em>'.
   * @see west.twouse.language.owl2fs.EdgeAssertion#getObjectProperty()
   * @see #getEdgeAssertion()
   * @generated
   */
  EReference getEdgeAssertion_ObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.EdgeAssertion#getDgNode1 <em>Dg Node1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dg Node1</em>'.
   * @see west.twouse.language.owl2fs.EdgeAssertion#getDgNode1()
   * @see #getEdgeAssertion()
   * @generated
   */
  EReference getEdgeAssertion_DgNode1();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.EdgeAssertion#getDgNode2 <em>Dg Node2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dg Node2</em>'.
   * @see west.twouse.language.owl2fs.EdgeAssertion#getDgNode2()
   * @see #getEdgeAssertion()
   * @generated
   */
  EReference getEdgeAssertion_DgNode2();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.MainClasses <em>Main Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Classes</em>'.
   * @see west.twouse.language.owl2fs.MainClasses
   * @generated
   */
  EClass getMainClasses();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.MainClasses#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see west.twouse.language.owl2fs.MainClasses#getClass_()
   * @see #getMainClasses()
   * @generated
   */
  EReference getMainClasses_Class();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see west.twouse.language.owl2fs.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.TemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameter</em>'.
   * @see west.twouse.language.owl2fs.TemplateParameter
   * @generated
   */
  EClass getTemplateParameter();

  /**
   * Returns the meta object for the container reference '{@link west.twouse.language.owl2fs.TemplateParameter#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Signature</em>'.
   * @see west.twouse.language.owl2fs.TemplateParameter#getSignature()
   * @see #getTemplateParameter()
   * @generated
   */
  EReference getTemplateParameter_Signature();

  /**
   * Returns the meta object for the reference '{@link west.twouse.language.owl2fs.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parametered Element</em>'.
   * @see west.twouse.language.owl2fs.TemplateParameter#getParameteredElement()
   * @see #getTemplateParameter()
   * @generated
   */
  EReference getTemplateParameter_ParameteredElement();

  /**
   * Returns the meta object for the reference list '{@link west.twouse.language.owl2fs.TemplateParameter#getParameterSubstitution <em>Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parameter Substitution</em>'.
   * @see west.twouse.language.owl2fs.TemplateParameter#getParameterSubstitution()
   * @see #getTemplateParameter()
   * @generated
   */
  EReference getTemplateParameter_ParameterSubstitution();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ParameterableElement <em>Parameterable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameterable Element</em>'.
   * @see west.twouse.language.owl2fs.ParameterableElement
   * @generated
   */
  EClass getParameterableElement();

  /**
   * Returns the meta object for the reference '{@link west.twouse.language.owl2fs.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Template Parameter</em>'.
   * @see west.twouse.language.owl2fs.ParameterableElement#getTemplateParameter()
   * @see #getParameterableElement()
   * @generated
   */
  EReference getParameterableElement_TemplateParameter();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.TemplateSignature <em>Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Signature</em>'.
   * @see west.twouse.language.owl2fs.TemplateSignature
   * @generated
   */
  EClass getTemplateSignature();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
   * @see west.twouse.language.owl2fs.TemplateSignature#getOwnedParameter()
   * @see #getTemplateSignature()
   * @generated
   */
  EReference getTemplateSignature_OwnedParameter();

  /**
   * Returns the meta object for the container reference '{@link west.twouse.language.owl2fs.TemplateSignature#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Template</em>'.
   * @see west.twouse.language.owl2fs.TemplateSignature#getTemplate()
   * @see #getTemplateSignature()
   * @generated
   */
  EReference getTemplateSignature_Template();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.TemplateableElement <em>Templateable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Templateable Element</em>'.
   * @see west.twouse.language.owl2fs.TemplateableElement
   * @generated
   */
  EClass getTemplateableElement();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.owl2fs.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Template Signature</em>'.
   * @see west.twouse.language.owl2fs.TemplateableElement#getOwnedTemplateSignature()
   * @see #getTemplateableElement()
   * @generated
   */
  EReference getTemplateableElement_OwnedTemplateSignature();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.TemplateableElement#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Binding</em>'.
   * @see west.twouse.language.owl2fs.TemplateableElement#getTemplateBinding()
   * @see #getTemplateableElement()
   * @generated
   */
  EReference getTemplateableElement_TemplateBinding();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see west.twouse.language.owl2fs.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.Package#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see west.twouse.language.owl2fs.Package#getExpressions()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Expressions();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.Package#getAxioms <em>Axioms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Axioms</em>'.
   * @see west.twouse.language.owl2fs.Package#getAxioms()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Axioms();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.owl2fs.Package#getPackageUri <em>Package Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Uri</em>'.
   * @see west.twouse.language.owl2fs.Package#getPackageUri()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_PackageUri();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Template Parameter</em>'.
   * @see west.twouse.language.owl2fs.ClassifierTemplateParameter
   * @generated
   */
  EClass getClassifierTemplateParameter();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameter Substitution</em>'.
   * @see west.twouse.language.owl2fs.TemplateParameterSubstitution
   * @generated
   */
  EClass getTemplateParameterSubstitution();

  /**
   * Returns the meta object for the reference '{@link west.twouse.language.owl2fs.TemplateParameterSubstitution#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actual</em>'.
   * @see west.twouse.language.owl2fs.TemplateParameterSubstitution#getActual()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_Actual();

  /**
   * Returns the meta object for the reference '{@link west.twouse.language.owl2fs.TemplateParameterSubstitution#getFormal <em>Formal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Formal</em>'.
   * @see west.twouse.language.owl2fs.TemplateParameterSubstitution#getFormal()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_Formal();

  /**
   * Returns the meta object for the container reference '{@link west.twouse.language.owl2fs.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Template Binding</em>'.
   * @see west.twouse.language.owl2fs.TemplateParameterSubstitution#getTemplateBinding()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_TemplateBinding();

  /**
   * Returns the meta object for class '{@link west.twouse.language.owl2fs.TemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Binding</em>'.
   * @see west.twouse.language.owl2fs.TemplateBinding
   * @generated
   */
  EClass getTemplateBinding();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.owl2fs.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Substitution</em>'.
   * @see west.twouse.language.owl2fs.TemplateBinding#getParameterSubstitution()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_ParameterSubstitution();

  /**
   * Returns the meta object for the container reference '{@link west.twouse.language.owl2fs.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Bound Element</em>'.
   * @see west.twouse.language.owl2fs.TemplateBinding#getBoundElement()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_BoundElement();

  /**
   * Returns the meta object for the reference '{@link west.twouse.language.owl2fs.TemplateBinding#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signature</em>'.
   * @see west.twouse.language.owl2fs.TemplateBinding#getSignature()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_Signature();

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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.IRIImpl <em>IRI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.IRIImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getIRI()
     * @generated
     */
    EClass IRI = eINSTANCE.getIRI();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IRI__VALUE = eINSTANCE.getIRI_Value();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.FullIRIImpl <em>Full IRI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.FullIRIImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getFullIRI()
     * @generated
     */
    EClass FULL_IRI = eINSTANCE.getFullIRI();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AbbreviatedIRIImpl <em>Abbreviated IRI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AbbreviatedIRIImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAbbreviatedIRI()
     * @generated
     */
    EClass ABBREVIATED_IRI = eINSTANCE.getAbbreviatedIRI();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABBREVIATED_IRI__PREFIX = eINSTANCE.getAbbreviatedIRI_Prefix();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.OntologyDocumentImpl <em>Ontology Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.OntologyDocumentImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getOntologyDocument()
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
     * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY_DOCUMENT__COMMENT = eINSTANCE.getOntologyDocument_Comment();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.PrefixDefinitionImpl <em>Prefix Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.PrefixDefinitionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getPrefixDefinition()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.OntologyImpl <em>Ontology</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.OntologyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getOntology()
     * @generated
     */
    EClass ONTOLOGY = eINSTANCE.getOntology();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__EXPRESSIONS = eINSTANCE.getOntology_Expressions();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__PACKAGES = eINSTANCE.getOntology_Packages();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__COMMENT = eINSTANCE.getOntology_Comment();

    /**
     * The meta object literal for the '<em><b>Ontology IRI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__ONTOLOGY_IRI = eINSTANCE.getOntology_OntologyIRI();

    /**
     * The meta object literal for the '<em><b>Version IRI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__VERSION_IRI = eINSTANCE.getOntology_VersionIRI();

    /**
     * The meta object literal for the '<em><b>Directly Imports Documents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS = eINSTANCE.getOntology_DirectlyImportsDocuments();

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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AxiomImpl <em>Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AxiomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAxiom()
     * @generated
     */
    EClass AXIOM = eINSTANCE.getAxiom();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.CommentImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DeclarationImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDeclaration()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ClassDeclarationImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassDeclaration()
     * @generated
     */
    EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DatatypeDeclarationImpl <em>Datatype Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DatatypeDeclarationImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDatatypeDeclaration()
     * @generated
     */
    EClass DATATYPE_DECLARATION = eINSTANCE.getDatatypeDeclaration();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyDeclarationImpl <em>Object Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectPropertyDeclarationImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyDeclaration()
     * @generated
     */
    EClass OBJECT_PROPERTY_DECLARATION = eINSTANCE.getObjectPropertyDeclaration();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataPropertyDeclarationImpl <em>Data Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataPropertyDeclarationImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyDeclaration()
     * @generated
     */
    EClass DATA_PROPERTY_DECLARATION = eINSTANCE.getDataPropertyDeclaration();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AnnotationPropertyDeclarationImpl <em>Annotation Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AnnotationPropertyDeclarationImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationPropertyDeclaration()
     * @generated
     */
    EClass ANNOTATION_PROPERTY_DECLARATION = eINSTANCE.getAnnotationPropertyDeclaration();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.NamedIndividualDeclarationImpl <em>Named Individual Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.NamedIndividualDeclarationImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getNamedIndividualDeclaration()
     * @generated
     */
    EClass NAMED_INDIVIDUAL_DECLARATION = eINSTANCE.getNamedIndividualDeclaration();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.EntityImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Entity IRI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ENTITY_IRI = eINSTANCE.getEntity_EntityIRI();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AnnotationSubjectImpl <em>Annotation Subject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AnnotationSubjectImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationSubject()
     * @generated
     */
    EClass ANNOTATION_SUBJECT = eINSTANCE.getAnnotationSubject();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AnnotationValueImpl <em>Annotation Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AnnotationValueImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationValue()
     * @generated
     */
    EClass ANNOTATION_VALUE = eINSTANCE.getAnnotationValue();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AnnotationImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Annotation Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ANNOTATION_ANNOTATIONS = eINSTANCE.getAnnotation_AnnotationAnnotations();

    /**
     * The meta object literal for the '<em><b>Annotation Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ANNOTATION_PROPERTY = eINSTANCE.getAnnotation_AnnotationProperty();

    /**
     * The meta object literal for the '<em><b>Annotation Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ANNOTATION_VALUE = eINSTANCE.getAnnotation_AnnotationValue();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AnnotationAxiomImpl <em>Annotation Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AnnotationAxiomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationAxiom()
     * @generated
     */
    EClass ANNOTATION_AXIOM = eINSTANCE.getAnnotationAxiom();

    /**
     * The meta object literal for the '<em><b>Axiom Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_AXIOM__AXIOM_ANNOTATIONS = eINSTANCE.getAnnotationAxiom_AxiomAnnotations();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AnnotationAssertionImpl <em>Annotation Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AnnotationAssertionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationAssertion()
     * @generated
     */
    EClass ANNOTATION_ASSERTION = eINSTANCE.getAnnotationAssertion();

    /**
     * The meta object literal for the '<em><b>Annotation Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_ASSERTION__ANNOTATION_PROPERTY = eINSTANCE.getAnnotationAssertion_AnnotationProperty();

    /**
     * The meta object literal for the '<em><b>Annotation Subject</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_ASSERTION__ANNOTATION_SUBJECT = eINSTANCE.getAnnotationAssertion_AnnotationSubject();

    /**
     * The meta object literal for the '<em><b>Annotation Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_ASSERTION__ANNOTATION_VALUE = eINSTANCE.getAnnotationAssertion_AnnotationValue();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.SubAnnotationPropertyOfImpl <em>Sub Annotation Property Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.SubAnnotationPropertyOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSubAnnotationPropertyOf()
     * @generated
     */
    EClass SUB_ANNOTATION_PROPERTY_OF = eINSTANCE.getSubAnnotationPropertyOf();

    /**
     * The meta object literal for the '<em><b>Sub Annotation Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY = eINSTANCE.getSubAnnotationPropertyOf_SubAnnotationProperty();

    /**
     * The meta object literal for the '<em><b>Super Annotation Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY = eINSTANCE.getSubAnnotationPropertyOf_SuperAnnotationProperty();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AnnotationPropertyDomainImpl <em>Annotation Property Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AnnotationPropertyDomainImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationPropertyDomain()
     * @generated
     */
    EClass ANNOTATION_PROPERTY_DOMAIN = eINSTANCE.getAnnotationPropertyDomain();

    /**
     * The meta object literal for the '<em><b>Annotation Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY = eINSTANCE.getAnnotationPropertyDomain_AnnotationProperty();

    /**
     * The meta object literal for the '<em><b>Iri</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_PROPERTY_DOMAIN__IRI = eINSTANCE.getAnnotationPropertyDomain_Iri();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AnnotationPropertyRangeImpl <em>Annotation Property Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AnnotationPropertyRangeImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationPropertyRange()
     * @generated
     */
    EClass ANNOTATION_PROPERTY_RANGE = eINSTANCE.getAnnotationPropertyRange();

    /**
     * The meta object literal for the '<em><b>Annotation Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY = eINSTANCE.getAnnotationPropertyRange_AnnotationProperty();

    /**
     * The meta object literal for the '<em><b>Iri</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_PROPERTY_RANGE__IRI = eINSTANCE.getAnnotationPropertyRange_Iri();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AnnotationPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnnotationProperty()
     * @generated
     */
    EClass ANNOTATION_PROPERTY = eINSTANCE.getAnnotationProperty();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ClassImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataPropertyImpl <em>Data Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataProperty()
     * @generated
     */
    EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DatatypeImpl <em>Datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DatatypeImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDatatype()
     * @generated
     */
    EClass DATATYPE = eINSTANCE.getDatatype();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectProperty()
     * @generated
     */
    EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.IndividualImpl <em>Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.IndividualImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getIndividual()
     * @generated
     */
    EClass INDIVIDUAL = eINSTANCE.getIndividual();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.NamedIndividualImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getNamedIndividual()
     * @generated
     */
    EClass NAMED_INDIVIDUAL = eINSTANCE.getNamedIndividual();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AnonymousIndividualImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAnonymousIndividual()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.LiteralImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getLiteral()
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
     * The meta object literal for the '<em><b>Language Tag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__LANGUAGE_TAG = eINSTANCE.getLiteral_LanguageTag();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectPropertyExpressionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyExpression()
     * @generated
     */
    EClass OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.InverseObjectPropertyImpl <em>Inverse Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.InverseObjectPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getInverseObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataPropertyExpressionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyExpression()
     * @generated
     */
    EClass DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataRangeImpl <em>Data Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataRangeImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataRange()
     * @generated
     */
    EClass DATA_RANGE = eINSTANCE.getDataRange();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataIntersectionOfImpl <em>Data Intersection Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataIntersectionOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataIntersectionOf()
     * @generated
     */
    EClass DATA_INTERSECTION_OF = eINSTANCE.getDataIntersectionOf();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_INTERSECTION_OF__DATA_RANGE = eINSTANCE.getDataIntersectionOf_DataRange();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataUnionOfImpl <em>Data Union Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataUnionOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataUnionOf()
     * @generated
     */
    EClass DATA_UNION_OF = eINSTANCE.getDataUnionOf();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_UNION_OF__DATA_RANGE = eINSTANCE.getDataUnionOf_DataRange();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataComplementOfImpl <em>Data Complement Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataComplementOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataComplementOf()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataOneOfImpl <em>Data One Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataOneOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataOneOf()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DatatypeRestrictionImpl <em>Datatype Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DatatypeRestrictionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDatatypeRestriction()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.FacetConstraintPairImpl <em>Facet Constraint Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.FacetConstraintPairImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getFacetConstraintPair()
     * @generated
     */
    EClass FACET_CONSTRAINT_PAIR = eINSTANCE.getFacetConstraintPair();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET_CONSTRAINT_PAIR__CONSTANT = eINSTANCE.getFacetConstraintPair_Constant();

    /**
     * The meta object literal for the '<em><b>Facet</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET_CONSTRAINT_PAIR__FACET = eINSTANCE.getFacetConstraintPair_Facet();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ClassExpressionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassExpression()
     * @generated
     */
    EClass CLASS_EXPRESSION = eINSTANCE.getClassExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectIntersectionOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectIntersectionOf()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectUnionOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectUnionOf()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectComplementOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectComplementOf()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectOneOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectOneOf()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectSomeValuesFromImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectSomeValuesFrom()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectAllValuesFromImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectAllValuesFrom()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectHasSelfImpl <em>Object Has Self</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectHasSelfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectHasSelf()
     * @generated
     */
    EClass OBJECT_HAS_SELF = eINSTANCE.getObjectHasSelf();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_HAS_SELF__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectHasSelf_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectHasValueImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectHasValue()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectMinCardinalityImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectMinCardinality()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectMaxCardinalityImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectMaxCardinality()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectExactCardinalityImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectExactCardinality()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataSomeValuesFromImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataSomeValuesFrom()
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
     * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getDataSomeValuesFrom_DataPropertyExpressions();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataAllValuesFromImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataAllValuesFrom()
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
     * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getDataAllValuesFrom_DataPropertyExpressions();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataHasValueImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataHasValue()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataMinCardinalityImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataMinCardinality()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataMaxCardinalityImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataMaxCardinality()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataExactCardinalityImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataExactCardinality()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ClassAxiomImpl <em>Class Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ClassAxiomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassAxiom()
     * @generated
     */
    EClass CLASS_AXIOM = eINSTANCE.getClassAxiom();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.SubClassOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSubClassOf()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.EquivalentClassesImpl <em>Equivalent Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.EquivalentClassesImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getEquivalentClasses()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DisjointClassesImpl <em>Disjoint Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DisjointClassesImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDisjointClasses()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DisjointUnionImpl <em>Disjoint Union</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DisjointUnionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDisjointUnion()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyAxiomImpl <em>Object Property Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectPropertyAxiomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyAxiom()
     * @generated
     */
    EClass OBJECT_PROPERTY_AXIOM = eINSTANCE.getObjectPropertyAxiom();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.SubObjectPropertyOfImpl <em>Sub Object Property Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.SubObjectPropertyOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSubObjectPropertyOf()
     * @generated
     */
    EClass SUB_OBJECT_PROPERTY_OF = eINSTANCE.getSubObjectPropertyOf();

    /**
     * The meta object literal for the '<em><b>Sub Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getSubObjectPropertyOf_SubObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Super Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getSubObjectPropertyOf_SuperObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.SubObjectPropertyExpressionImpl <em>Sub Object Property Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.SubObjectPropertyExpressionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSubObjectPropertyExpression()
     * @generated
     */
    EClass SUB_OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getSubObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyChainImpl <em>Object Property Chain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectPropertyChainImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyChain()
     * @generated
     */
    EClass OBJECT_PROPERTY_CHAIN = eINSTANCE.getObjectPropertyChain();

    /**
     * The meta object literal for the '<em><b>Object Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getObjectPropertyChain_ObjectPropertyExpressions();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.EquivalentObjectPropertiesImpl <em>Equivalent Object Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.EquivalentObjectPropertiesImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getEquivalentObjectProperties()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DisjointObjectPropertiesImpl <em>Disjoint Object Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DisjointObjectPropertiesImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDisjointObjectProperties()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyDomainImpl <em>Object Property Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectPropertyDomainImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyDomain()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyRangeImpl <em>Object Property Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectPropertyRangeImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyRange()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.InverseObjectPropertiesImpl <em>Inverse Object Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.InverseObjectPropertiesImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getInverseObjectProperties()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.FunctionalObjectPropertyImpl <em>Functional Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.FunctionalObjectPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getFunctionalObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.InverseFunctionalObjectPropertyImpl <em>Inverse Functional Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.InverseFunctionalObjectPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getInverseFunctionalObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ReflexiveObjectPropertyImpl <em>Reflexive Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ReflexiveObjectPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getReflexiveObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.IrreflexiveObjectPropertyImpl <em>Irreflexive Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.IrreflexiveObjectPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getIrreflexiveObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.SymmetricObjectPropertyImpl <em>Symmetric Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.SymmetricObjectPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSymmetricObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AsymmetricObjectPropertyImpl <em>Asymmetric Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AsymmetricObjectPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAsymmetricObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.TransitiveObjectPropertyImpl <em>Transitive Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.TransitiveObjectPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTransitiveObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataPropertyAxiomImpl <em>Data Property Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataPropertyAxiomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyAxiom()
     * @generated
     */
    EClass DATA_PROPERTY_AXIOM = eINSTANCE.getDataPropertyAxiom();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.SubDataPropertyOfImpl <em>Sub Data Property Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.SubDataPropertyOfImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSubDataPropertyOf()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.EquivalentDataPropertiesImpl <em>Equivalent Data Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.EquivalentDataPropertiesImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getEquivalentDataProperties()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DisjointDataPropertiesImpl <em>Disjoint Data Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DisjointDataPropertiesImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDisjointDataProperties()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataPropertyDomainImpl <em>Data Property Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataPropertyDomainImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyDomain()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataPropertyRangeImpl <em>Data Property Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataPropertyRangeImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyRange()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.FunctionalDataPropertyImpl <em>Functional Data Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.FunctionalDataPropertyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getFunctionalDataProperty()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DatatypeDefinitionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDatatypeDefinition()
     * @generated
     */
    EClass DATATYPE_DEFINITION = eINSTANCE.getDatatypeDefinition();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATATYPE_DEFINITION__DATATYPE = eINSTANCE.getDatatypeDefinition_Datatype();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATATYPE_DEFINITION__DATA_RANGE = eINSTANCE.getDatatypeDefinition_DataRange();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.HasKeyImpl <em>Has Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.HasKeyImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getHasKey()
     * @generated
     */
    EClass HAS_KEY = eINSTANCE.getHasKey();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_KEY__CLASS_EXPRESSION = eINSTANCE.getHasKey_ClassExpression();

    /**
     * The meta object literal for the '<em><b>Object Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS = eINSTANCE.getHasKey_ObjectPropertyExpressions();

    /**
     * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_KEY__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getHasKey_DataPropertyExpressions();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AssertionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAssertion()
     * @generated
     */
    EClass ASSERTION = eINSTANCE.getAssertion();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.SameIndividualImpl <em>Same Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.SameIndividualImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSameIndividual()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DifferentIndividualsImpl <em>Different Individuals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DifferentIndividualsImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDifferentIndividuals()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ClassAssertionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassAssertion()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectPropertyAssertionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyAssertion()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.NegativeObjectPropertyAssertionImpl <em>Negative Object Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.NegativeObjectPropertyAssertionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getNegativeObjectPropertyAssertion()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataPropertyAssertionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropertyAssertion()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.NegativeDataPropertyAssertionImpl <em>Negative Data Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.NegativeDataPropertyAssertionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getNegativeDataPropertyAssertion()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.RuleImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DLSafeRuleImpl <em>DL Safe Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DLSafeRuleImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDLSafeRule()
     * @generated
     */
    EClass DL_SAFE_RULE = eINSTANCE.getDLSafeRule();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DL_SAFE_RULE__ANNOTATION = eINSTANCE.getDLSafeRule_Annotation();

    /**
     * The meta object literal for the '<em><b>Body Atom</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DL_SAFE_RULE__BODY_ATOM = eINSTANCE.getDLSafeRule_BodyAtom();

    /**
     * The meta object literal for the '<em><b>Head Atom</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DL_SAFE_RULE__HEAD_ATOM = eINSTANCE.getDLSafeRule_HeadAtom();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.AtomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ClassAtomImpl <em>Class Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ClassAtomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassAtom()
     * @generated
     */
    EClass CLASS_ATOM = eINSTANCE.getClassAtom();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_ATOM__CLASS_EXPRESSION = eINSTANCE.getClassAtom_ClassExpression();

    /**
     * The meta object literal for the '<em><b>IArg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_ATOM__IARG = eINSTANCE.getClassAtom_IArg();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataRangeAtomImpl <em>Data Range Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataRangeAtomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataRangeAtom()
     * @generated
     */
    EClass DATA_RANGE_ATOM = eINSTANCE.getDataRangeAtom();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_RANGE_ATOM__DATA_RANGE = eINSTANCE.getDataRangeAtom_DataRange();

    /**
     * The meta object literal for the '<em><b>DArg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_RANGE_ATOM__DARG = eINSTANCE.getDataRangeAtom_DArg();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ObjectPropertyAtomImpl <em>Object Property Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ObjectPropertyAtomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getObjectPropertyAtom()
     * @generated
     */
    EClass OBJECT_PROPERTY_ATOM = eINSTANCE.getObjectPropertyAtom();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyAtom_ObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>IArg1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_ATOM__IARG1 = eINSTANCE.getObjectPropertyAtom_IArg1();

    /**
     * The meta object literal for the '<em><b>IArg2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_ATOM__IARG2 = eINSTANCE.getObjectPropertyAtom_IArg2();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DataPropetyAtomImpl <em>Data Propety Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DataPropetyAtomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDataPropetyAtom()
     * @generated
     */
    EClass DATA_PROPETY_ATOM = eINSTANCE.getDataPropetyAtom();

    /**
     * The meta object literal for the '<em><b>Data Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPETY_ATOM__DATA_PROPERTY = eINSTANCE.getDataPropetyAtom_DataProperty();

    /**
     * The meta object literal for the '<em><b>IArg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPETY_ATOM__IARG = eINSTANCE.getDataPropetyAtom_IArg();

    /**
     * The meta object literal for the '<em><b>DArg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPETY_ATOM__DARG = eINSTANCE.getDataPropetyAtom_DArg();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.BuiltInAtomImpl <em>Built In Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.BuiltInAtomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getBuiltInAtom()
     * @generated
     */
    EClass BUILT_IN_ATOM = eINSTANCE.getBuiltInAtom();

    /**
     * The meta object literal for the '<em><b>Iri</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_ATOM__IRI = eINSTANCE.getBuiltInAtom_Iri();

    /**
     * The meta object literal for the '<em><b>DArg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_ATOM__DARG = eINSTANCE.getBuiltInAtom_DArg();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.SameIndividualAtomImpl <em>Same Individual Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.SameIndividualAtomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getSameIndividualAtom()
     * @generated
     */
    EClass SAME_INDIVIDUAL_ATOM = eINSTANCE.getSameIndividualAtom();

    /**
     * The meta object literal for the '<em><b>IArg1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SAME_INDIVIDUAL_ATOM__IARG1 = eINSTANCE.getSameIndividualAtom_IArg1();

    /**
     * The meta object literal for the '<em><b>IArg2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SAME_INDIVIDUAL_ATOM__IARG2 = eINSTANCE.getSameIndividualAtom_IArg2();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DifferentIndividualsAtomImpl <em>Different Individuals Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DifferentIndividualsAtomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDifferentIndividualsAtom()
     * @generated
     */
    EClass DIFFERENT_INDIVIDUALS_ATOM = eINSTANCE.getDifferentIndividualsAtom();

    /**
     * The meta object literal for the '<em><b>IArg1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIFFERENT_INDIVIDUALS_ATOM__IARG1 = eINSTANCE.getDifferentIndividualsAtom_IArg1();

    /**
     * The meta object literal for the '<em><b>IArg2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIFFERENT_INDIVIDUALS_ATOM__IARG2 = eINSTANCE.getDifferentIndividualsAtom_IArg2();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.IArgImpl <em>IArg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.IArgImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getIArg()
     * @generated
     */
    EClass IARG = eINSTANCE.getIArg();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DArgImpl <em>DArg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DArgImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDArg()
     * @generated
     */
    EClass DARG = eINSTANCE.getDArg();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.VariableImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Iri</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__IRI = eINSTANCE.getVariable_Iri();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DGRuleImpl <em>DG Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DGRuleImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDGRule()
     * @generated
     */
    EClass DG_RULE = eINSTANCE.getDGRule();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DG_RULE__ANNOTATION = eINSTANCE.getDGRule_Annotation();

    /**
     * The meta object literal for the '<em><b>Body Atom</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DG_RULE__BODY_ATOM = eINSTANCE.getDGRule_BodyAtom();

    /**
     * The meta object literal for the '<em><b>Head Atom</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DG_RULE__HEAD_ATOM = eINSTANCE.getDGRule_HeadAtom();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DGAtomImpl <em>DG Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DGAtomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDGAtom()
     * @generated
     */
    EClass DG_ATOM = eINSTANCE.getDGAtom();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DGAxiomImpl <em>DG Axiom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DGAxiomImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDGAxiom()
     * @generated
     */
    EClass DG_AXIOM = eINSTANCE.getDGAxiom();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DG_AXIOM__ANNOTATION = eINSTANCE.getDGAxiom_Annotation();

    /**
     * The meta object literal for the '<em><b>Dg Nodes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DG_AXIOM__DG_NODES = eINSTANCE.getDGAxiom_DgNodes();

    /**
     * The meta object literal for the '<em><b>Dg Edges</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DG_AXIOM__DG_EDGES = eINSTANCE.getDGAxiom_DgEdges();

    /**
     * The meta object literal for the '<em><b>Main Classes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DG_AXIOM__MAIN_CLASSES = eINSTANCE.getDGAxiom_MainClasses();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DGNodesImpl <em>DG Nodes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DGNodesImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDGNodes()
     * @generated
     */
    EClass DG_NODES = eINSTANCE.getDGNodes();

    /**
     * The meta object literal for the '<em><b>Node Assertion</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DG_NODES__NODE_ASSERTION = eINSTANCE.getDGNodes_NodeAssertion();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.NodeAssertionImpl <em>Node Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.NodeAssertionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getNodeAssertion()
     * @generated
     */
    EClass NODE_ASSERTION = eINSTANCE.getNodeAssertion();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ASSERTION__CLASS = eINSTANCE.getNodeAssertion_Class();

    /**
     * The meta object literal for the '<em><b>Dg Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ASSERTION__DG_NODE = eINSTANCE.getNodeAssertion_DgNode();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.DGEdgesImpl <em>DG Edges</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.DGEdgesImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getDGEdges()
     * @generated
     */
    EClass DG_EDGES = eINSTANCE.getDGEdges();

    /**
     * The meta object literal for the '<em><b>Edge Assertion</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DG_EDGES__EDGE_ASSERTION = eINSTANCE.getDGEdges_EdgeAssertion();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.EdgeAssertionImpl <em>Edge Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.EdgeAssertionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getEdgeAssertion()
     * @generated
     */
    EClass EDGE_ASSERTION = eINSTANCE.getEdgeAssertion();

    /**
     * The meta object literal for the '<em><b>Object Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_ASSERTION__OBJECT_PROPERTY = eINSTANCE.getEdgeAssertion_ObjectProperty();

    /**
     * The meta object literal for the '<em><b>Dg Node1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_ASSERTION__DG_NODE1 = eINSTANCE.getEdgeAssertion_DgNode1();

    /**
     * The meta object literal for the '<em><b>Dg Node2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_ASSERTION__DG_NODE2 = eINSTANCE.getEdgeAssertion_DgNode2();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.MainClassesImpl <em>Main Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.MainClassesImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getMainClasses()
     * @generated
     */
    EClass MAIN_CLASSES = eINSTANCE.getMainClasses();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_CLASSES__CLASS = eINSTANCE.getMainClasses_Class();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ExpressionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.TemplateParameterImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTemplateParameter()
     * @generated
     */
    EClass TEMPLATE_PARAMETER = eINSTANCE.getTemplateParameter();

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
     * The meta object literal for the '<em><b>Parameter Substitution</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION = eINSTANCE.getTemplateParameter_ParameterSubstitution();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ParameterableElementImpl <em>Parameterable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ParameterableElementImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getParameterableElement()
     * @generated
     */
    EClass PARAMETERABLE_ELEMENT = eINSTANCE.getParameterableElement();

    /**
     * The meta object literal for the '<em><b>Template Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER = eINSTANCE.getParameterableElement_TemplateParameter();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.TemplateSignatureImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTemplateSignature()
     * @generated
     */
    EClass TEMPLATE_SIGNATURE = eINSTANCE.getTemplateSignature();

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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.TemplateableElementImpl <em>Templateable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.TemplateableElementImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTemplateableElement()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.PackageImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getPackage()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.ClassifierTemplateParameterImpl <em>Classifier Template Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.ClassifierTemplateParameterImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getClassifierTemplateParameter()
     * @generated
     */
    EClass CLASSIFIER_TEMPLATE_PARAMETER = eINSTANCE.getClassifierTemplateParameter();

    /**
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.TemplateParameterSubstitutionImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTemplateParameterSubstitution()
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
     * The meta object literal for the '{@link west.twouse.language.owl2fs.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.owl2fs.impl.TemplateBindingImpl
     * @see west.twouse.language.owl2fs.impl.Owl2fsPackageImpl#getTemplateBinding()
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

  }

} //Owl2fsPackage
