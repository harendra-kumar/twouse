/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import west.twouse.language.owl2fs.AbbreviatedIRI;
import west.twouse.language.owl2fs.Annotation;
import west.twouse.language.owl2fs.AnnotationAssertion;
import west.twouse.language.owl2fs.AnnotationProperty;
import west.twouse.language.owl2fs.AnnotationPropertyDeclaration;
import west.twouse.language.owl2fs.AnnotationPropertyDomain;
import west.twouse.language.owl2fs.AnnotationPropertyRange;
import west.twouse.language.owl2fs.AnonymousIndividual;
import west.twouse.language.owl2fs.AsymmetricObjectProperty;
import west.twouse.language.owl2fs.BuiltInAtom;
import west.twouse.language.owl2fs.ClassAssertion;
import west.twouse.language.owl2fs.ClassAtom;
import west.twouse.language.owl2fs.ClassDeclaration;
import west.twouse.language.owl2fs.ClassifierTemplateParameter;
import west.twouse.language.owl2fs.Comment;
import west.twouse.language.owl2fs.DGAxiom;
import west.twouse.language.owl2fs.DGEdges;
import west.twouse.language.owl2fs.DGNodes;
import west.twouse.language.owl2fs.DGRule;
import west.twouse.language.owl2fs.DLSafeRule;
import west.twouse.language.owl2fs.DataAllValuesFrom;
import west.twouse.language.owl2fs.DataComplementOf;
import west.twouse.language.owl2fs.DataExactCardinality;
import west.twouse.language.owl2fs.DataHasValue;
import west.twouse.language.owl2fs.DataIntersectionOf;
import west.twouse.language.owl2fs.DataMaxCardinality;
import west.twouse.language.owl2fs.DataMinCardinality;
import west.twouse.language.owl2fs.DataOneOf;
import west.twouse.language.owl2fs.DataProperty;
import west.twouse.language.owl2fs.DataPropertyAssertion;
import west.twouse.language.owl2fs.DataPropertyDeclaration;
import west.twouse.language.owl2fs.DataPropertyDomain;
import west.twouse.language.owl2fs.DataPropertyRange;
import west.twouse.language.owl2fs.DataPropetyAtom;
import west.twouse.language.owl2fs.DataRangeAtom;
import west.twouse.language.owl2fs.DataSomeValuesFrom;
import west.twouse.language.owl2fs.DataUnionOf;
import west.twouse.language.owl2fs.Datatype;
import west.twouse.language.owl2fs.DatatypeDeclaration;
import west.twouse.language.owl2fs.DatatypeDefinition;
import west.twouse.language.owl2fs.DatatypeRestriction;
import west.twouse.language.owl2fs.DifferentIndividuals;
import west.twouse.language.owl2fs.DifferentIndividualsAtom;
import west.twouse.language.owl2fs.DisjointClasses;
import west.twouse.language.owl2fs.DisjointDataProperties;
import west.twouse.language.owl2fs.DisjointObjectProperties;
import west.twouse.language.owl2fs.DisjointUnion;
import west.twouse.language.owl2fs.EdgeAssertion;
import west.twouse.language.owl2fs.EquivalentClasses;
import west.twouse.language.owl2fs.EquivalentDataProperties;
import west.twouse.language.owl2fs.EquivalentObjectProperties;
import west.twouse.language.owl2fs.FacetConstraintPair;
import west.twouse.language.owl2fs.FullIRI;
import west.twouse.language.owl2fs.FunctionalDataProperty;
import west.twouse.language.owl2fs.FunctionalObjectProperty;
import west.twouse.language.owl2fs.HasKey;
import west.twouse.language.owl2fs.InverseFunctionalObjectProperty;
import west.twouse.language.owl2fs.InverseObjectProperties;
import west.twouse.language.owl2fs.InverseObjectProperty;
import west.twouse.language.owl2fs.IrreflexiveObjectProperty;
import west.twouse.language.owl2fs.Literal;
import west.twouse.language.owl2fs.MainClasses;
import west.twouse.language.owl2fs.NamedIndividual;
import west.twouse.language.owl2fs.NamedIndividualDeclaration;
import west.twouse.language.owl2fs.NegativeDataPropertyAssertion;
import west.twouse.language.owl2fs.NegativeObjectPropertyAssertion;
import west.twouse.language.owl2fs.NodeAssertion;
import west.twouse.language.owl2fs.ObjectAllValuesFrom;
import west.twouse.language.owl2fs.ObjectComplementOf;
import west.twouse.language.owl2fs.ObjectExactCardinality;
import west.twouse.language.owl2fs.ObjectHasSelf;
import west.twouse.language.owl2fs.ObjectHasValue;
import west.twouse.language.owl2fs.ObjectIntersectionOf;
import west.twouse.language.owl2fs.ObjectMaxCardinality;
import west.twouse.language.owl2fs.ObjectMinCardinality;
import west.twouse.language.owl2fs.ObjectOneOf;
import west.twouse.language.owl2fs.ObjectProperty;
import west.twouse.language.owl2fs.ObjectPropertyAssertion;
import west.twouse.language.owl2fs.ObjectPropertyAtom;
import west.twouse.language.owl2fs.ObjectPropertyChain;
import west.twouse.language.owl2fs.ObjectPropertyDeclaration;
import west.twouse.language.owl2fs.ObjectPropertyDomain;
import west.twouse.language.owl2fs.ObjectPropertyRange;
import west.twouse.language.owl2fs.ObjectSomeValuesFrom;
import west.twouse.language.owl2fs.ObjectUnionOf;
import west.twouse.language.owl2fs.Ontology;
import west.twouse.language.owl2fs.OntologyDocument;
import west.twouse.language.owl2fs.Owl2fsFactory;
import west.twouse.language.owl2fs.Owl2fsPackage;
import west.twouse.language.owl2fs.ParameterableElement;
import west.twouse.language.owl2fs.PrefixDefinition;
import west.twouse.language.owl2fs.ReflexiveObjectProperty;
import west.twouse.language.owl2fs.SameIndividual;
import west.twouse.language.owl2fs.SameIndividualAtom;
import west.twouse.language.owl2fs.SubAnnotationPropertyOf;
import west.twouse.language.owl2fs.SubClassOf;
import west.twouse.language.owl2fs.SubDataPropertyOf;
import west.twouse.language.owl2fs.SubObjectPropertyOf;
import west.twouse.language.owl2fs.SymmetricObjectProperty;
import west.twouse.language.owl2fs.TemplateBinding;
import west.twouse.language.owl2fs.TemplateParameter;
import west.twouse.language.owl2fs.TemplateParameterSubstitution;
import west.twouse.language.owl2fs.TemplateSignature;
import west.twouse.language.owl2fs.TemplateableElement;
import west.twouse.language.owl2fs.TransitiveObjectProperty;
import west.twouse.language.owl2fs.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Owl2fsFactoryImpl extends EFactoryImpl implements Owl2fsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Owl2fsFactory init()
  {
    try
    {
      Owl2fsFactory theOwl2fsFactory = (Owl2fsFactory)EPackage.Registry.INSTANCE.getEFactory("http://west.uni-koblenz.de/owl2fs"); 
      if (theOwl2fsFactory != null)
      {
        return theOwl2fsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Owl2fsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Owl2fsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Owl2fsPackage.FULL_IRI: return createFullIRI();
      case Owl2fsPackage.ABBREVIATED_IRI: return createAbbreviatedIRI();
      case Owl2fsPackage.ONTOLOGY_DOCUMENT: return createOntologyDocument();
      case Owl2fsPackage.PREFIX_DEFINITION: return createPrefixDefinition();
      case Owl2fsPackage.ONTOLOGY: return createOntology();
      case Owl2fsPackage.COMMENT: return createComment();
      case Owl2fsPackage.CLASS_DECLARATION: return createClassDeclaration();
      case Owl2fsPackage.DATATYPE_DECLARATION: return createDatatypeDeclaration();
      case Owl2fsPackage.OBJECT_PROPERTY_DECLARATION: return createObjectPropertyDeclaration();
      case Owl2fsPackage.DATA_PROPERTY_DECLARATION: return createDataPropertyDeclaration();
      case Owl2fsPackage.ANNOTATION_PROPERTY_DECLARATION: return createAnnotationPropertyDeclaration();
      case Owl2fsPackage.NAMED_INDIVIDUAL_DECLARATION: return createNamedIndividualDeclaration();
      case Owl2fsPackage.ANNOTATION: return createAnnotation();
      case Owl2fsPackage.ANNOTATION_ASSERTION: return createAnnotationAssertion();
      case Owl2fsPackage.SUB_ANNOTATION_PROPERTY_OF: return createSubAnnotationPropertyOf();
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN: return createAnnotationPropertyDomain();
      case Owl2fsPackage.ANNOTATION_PROPERTY_RANGE: return createAnnotationPropertyRange();
      case Owl2fsPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
      case Owl2fsPackage.CLASS: return createClass();
      case Owl2fsPackage.DATA_PROPERTY: return createDataProperty();
      case Owl2fsPackage.DATATYPE: return createDatatype();
      case Owl2fsPackage.OBJECT_PROPERTY: return createObjectProperty();
      case Owl2fsPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
      case Owl2fsPackage.LITERAL: return createLiteral();
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTY: return createInverseObjectProperty();
      case Owl2fsPackage.DATA_INTERSECTION_OF: return createDataIntersectionOf();
      case Owl2fsPackage.DATA_UNION_OF: return createDataUnionOf();
      case Owl2fsPackage.DATA_COMPLEMENT_OF: return createDataComplementOf();
      case Owl2fsPackage.DATA_ONE_OF: return createDataOneOf();
      case Owl2fsPackage.DATATYPE_RESTRICTION: return createDatatypeRestriction();
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR: return createFacetConstraintPair();
      case Owl2fsPackage.OBJECT_INTERSECTION_OF: return createObjectIntersectionOf();
      case Owl2fsPackage.OBJECT_UNION_OF: return createObjectUnionOf();
      case Owl2fsPackage.OBJECT_COMPLEMENT_OF: return createObjectComplementOf();
      case Owl2fsPackage.OBJECT_ONE_OF: return createObjectOneOf();
      case Owl2fsPackage.OBJECT_SOME_VALUES_FROM: return createObjectSomeValuesFrom();
      case Owl2fsPackage.OBJECT_ALL_VALUES_FROM: return createObjectAllValuesFrom();
      case Owl2fsPackage.OBJECT_HAS_SELF: return createObjectHasSelf();
      case Owl2fsPackage.OBJECT_HAS_VALUE: return createObjectHasValue();
      case Owl2fsPackage.OBJECT_MIN_CARDINALITY: return createObjectMinCardinality();
      case Owl2fsPackage.OBJECT_MAX_CARDINALITY: return createObjectMaxCardinality();
      case Owl2fsPackage.OBJECT_EXACT_CARDINALITY: return createObjectExactCardinality();
      case Owl2fsPackage.DATA_SOME_VALUES_FROM: return createDataSomeValuesFrom();
      case Owl2fsPackage.DATA_ALL_VALUES_FROM: return createDataAllValuesFrom();
      case Owl2fsPackage.DATA_HAS_VALUE: return createDataHasValue();
      case Owl2fsPackage.DATA_MIN_CARDINALITY: return createDataMinCardinality();
      case Owl2fsPackage.DATA_MAX_CARDINALITY: return createDataMaxCardinality();
      case Owl2fsPackage.DATA_EXACT_CARDINALITY: return createDataExactCardinality();
      case Owl2fsPackage.SUB_CLASS_OF: return createSubClassOf();
      case Owl2fsPackage.EQUIVALENT_CLASSES: return createEquivalentClasses();
      case Owl2fsPackage.DISJOINT_CLASSES: return createDisjointClasses();
      case Owl2fsPackage.DISJOINT_UNION: return createDisjointUnion();
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF: return createSubObjectPropertyOf();
      case Owl2fsPackage.OBJECT_PROPERTY_CHAIN: return createObjectPropertyChain();
      case Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES: return createEquivalentObjectProperties();
      case Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES: return createDisjointObjectProperties();
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN: return createObjectPropertyDomain();
      case Owl2fsPackage.OBJECT_PROPERTY_RANGE: return createObjectPropertyRange();
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTIES: return createInverseObjectProperties();
      case Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY: return createFunctionalObjectProperty();
      case Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY: return createInverseFunctionalObjectProperty();
      case Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY: return createReflexiveObjectProperty();
      case Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY: return createIrreflexiveObjectProperty();
      case Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY: return createSymmetricObjectProperty();
      case Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY: return createAsymmetricObjectProperty();
      case Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY: return createTransitiveObjectProperty();
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF: return createSubDataPropertyOf();
      case Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES: return createEquivalentDataProperties();
      case Owl2fsPackage.DISJOINT_DATA_PROPERTIES: return createDisjointDataProperties();
      case Owl2fsPackage.DATA_PROPERTY_DOMAIN: return createDataPropertyDomain();
      case Owl2fsPackage.DATA_PROPERTY_RANGE: return createDataPropertyRange();
      case Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY: return createFunctionalDataProperty();
      case Owl2fsPackage.DATATYPE_DEFINITION: return createDatatypeDefinition();
      case Owl2fsPackage.HAS_KEY: return createHasKey();
      case Owl2fsPackage.SAME_INDIVIDUAL: return createSameIndividual();
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS: return createDifferentIndividuals();
      case Owl2fsPackage.CLASS_ASSERTION: return createClassAssertion();
      case Owl2fsPackage.OBJECT_PROPERTY_ASSERTION: return createObjectPropertyAssertion();
      case Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: return createNegativeObjectPropertyAssertion();
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION: return createDataPropertyAssertion();
      case Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: return createNegativeDataPropertyAssertion();
      case Owl2fsPackage.DL_SAFE_RULE: return createDLSafeRule();
      case Owl2fsPackage.CLASS_ATOM: return createClassAtom();
      case Owl2fsPackage.DATA_RANGE_ATOM: return createDataRangeAtom();
      case Owl2fsPackage.OBJECT_PROPERTY_ATOM: return createObjectPropertyAtom();
      case Owl2fsPackage.DATA_PROPETY_ATOM: return createDataPropetyAtom();
      case Owl2fsPackage.BUILT_IN_ATOM: return createBuiltInAtom();
      case Owl2fsPackage.SAME_INDIVIDUAL_ATOM: return createSameIndividualAtom();
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM: return createDifferentIndividualsAtom();
      case Owl2fsPackage.VARIABLE: return createVariable();
      case Owl2fsPackage.DG_RULE: return createDGRule();
      case Owl2fsPackage.DG_AXIOM: return createDGAxiom();
      case Owl2fsPackage.DG_NODES: return createDGNodes();
      case Owl2fsPackage.NODE_ASSERTION: return createNodeAssertion();
      case Owl2fsPackage.DG_EDGES: return createDGEdges();
      case Owl2fsPackage.EDGE_ASSERTION: return createEdgeAssertion();
      case Owl2fsPackage.MAIN_CLASSES: return createMainClasses();
      case Owl2fsPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
      case Owl2fsPackage.PARAMETERABLE_ELEMENT: return createParameterableElement();
      case Owl2fsPackage.TEMPLATE_SIGNATURE: return createTemplateSignature();
      case Owl2fsPackage.TEMPLATEABLE_ELEMENT: return createTemplateableElement();
      case Owl2fsPackage.PACKAGE: return createPackage();
      case Owl2fsPackage.CLASSIFIER_TEMPLATE_PARAMETER: return createClassifierTemplateParameter();
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION: return createTemplateParameterSubstitution();
      case Owl2fsPackage.TEMPLATE_BINDING: return createTemplateBinding();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FullIRI createFullIRI()
  {
    FullIRIImpl fullIRI = new FullIRIImpl();
    return fullIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbbreviatedIRI createAbbreviatedIRI()
  {
    AbbreviatedIRIImpl abbreviatedIRI = new AbbreviatedIRIImpl();
    return abbreviatedIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OntologyDocument createOntologyDocument()
  {
    OntologyDocumentImpl ontologyDocument = new OntologyDocumentImpl();
    return ontologyDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixDefinition createPrefixDefinition()
  {
    PrefixDefinitionImpl prefixDefinition = new PrefixDefinitionImpl();
    return prefixDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ontology createOntology()
  {
    OntologyImpl ontology = new OntologyImpl();
    return ontology;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDeclaration createClassDeclaration()
  {
    ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
    return classDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeDeclaration createDatatypeDeclaration()
  {
    DatatypeDeclarationImpl datatypeDeclaration = new DatatypeDeclarationImpl();
    return datatypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyDeclaration createObjectPropertyDeclaration()
  {
    ObjectPropertyDeclarationImpl objectPropertyDeclaration = new ObjectPropertyDeclarationImpl();
    return objectPropertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyDeclaration createDataPropertyDeclaration()
  {
    DataPropertyDeclarationImpl dataPropertyDeclaration = new DataPropertyDeclarationImpl();
    return dataPropertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationPropertyDeclaration createAnnotationPropertyDeclaration()
  {
    AnnotationPropertyDeclarationImpl annotationPropertyDeclaration = new AnnotationPropertyDeclarationImpl();
    return annotationPropertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedIndividualDeclaration createNamedIndividualDeclaration()
  {
    NamedIndividualDeclarationImpl namedIndividualDeclaration = new NamedIndividualDeclarationImpl();
    return namedIndividualDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationAssertion createAnnotationAssertion()
  {
    AnnotationAssertionImpl annotationAssertion = new AnnotationAssertionImpl();
    return annotationAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubAnnotationPropertyOf createSubAnnotationPropertyOf()
  {
    SubAnnotationPropertyOfImpl subAnnotationPropertyOf = new SubAnnotationPropertyOfImpl();
    return subAnnotationPropertyOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationPropertyDomain createAnnotationPropertyDomain()
  {
    AnnotationPropertyDomainImpl annotationPropertyDomain = new AnnotationPropertyDomainImpl();
    return annotationPropertyDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationPropertyRange createAnnotationPropertyRange()
  {
    AnnotationPropertyRangeImpl annotationPropertyRange = new AnnotationPropertyRangeImpl();
    return annotationPropertyRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationProperty createAnnotationProperty()
  {
    AnnotationPropertyImpl annotationProperty = new AnnotationPropertyImpl();
    return annotationProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public west.twouse.language.owl2fs.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataProperty createDataProperty()
  {
    DataPropertyImpl dataProperty = new DataPropertyImpl();
    return dataProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype createDatatype()
  {
    DatatypeImpl datatype = new DatatypeImpl();
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectProperty createObjectProperty()
  {
    ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
    return objectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedIndividual createNamedIndividual()
  {
    NamedIndividualImpl namedIndividual = new NamedIndividualImpl();
    return namedIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousIndividual createAnonymousIndividual()
  {
    AnonymousIndividualImpl anonymousIndividual = new AnonymousIndividualImpl();
    return anonymousIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InverseObjectProperty createInverseObjectProperty()
  {
    InverseObjectPropertyImpl inverseObjectProperty = new InverseObjectPropertyImpl();
    return inverseObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataIntersectionOf createDataIntersectionOf()
  {
    DataIntersectionOfImpl dataIntersectionOf = new DataIntersectionOfImpl();
    return dataIntersectionOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataUnionOf createDataUnionOf()
  {
    DataUnionOfImpl dataUnionOf = new DataUnionOfImpl();
    return dataUnionOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataComplementOf createDataComplementOf()
  {
    DataComplementOfImpl dataComplementOf = new DataComplementOfImpl();
    return dataComplementOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataOneOf createDataOneOf()
  {
    DataOneOfImpl dataOneOf = new DataOneOfImpl();
    return dataOneOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeRestriction createDatatypeRestriction()
  {
    DatatypeRestrictionImpl datatypeRestriction = new DatatypeRestrictionImpl();
    return datatypeRestriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetConstraintPair createFacetConstraintPair()
  {
    FacetConstraintPairImpl facetConstraintPair = new FacetConstraintPairImpl();
    return facetConstraintPair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectIntersectionOf createObjectIntersectionOf()
  {
    ObjectIntersectionOfImpl objectIntersectionOf = new ObjectIntersectionOfImpl();
    return objectIntersectionOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectUnionOf createObjectUnionOf()
  {
    ObjectUnionOfImpl objectUnionOf = new ObjectUnionOfImpl();
    return objectUnionOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectComplementOf createObjectComplementOf()
  {
    ObjectComplementOfImpl objectComplementOf = new ObjectComplementOfImpl();
    return objectComplementOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectOneOf createObjectOneOf()
  {
    ObjectOneOfImpl objectOneOf = new ObjectOneOfImpl();
    return objectOneOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectSomeValuesFrom createObjectSomeValuesFrom()
  {
    ObjectSomeValuesFromImpl objectSomeValuesFrom = new ObjectSomeValuesFromImpl();
    return objectSomeValuesFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectAllValuesFrom createObjectAllValuesFrom()
  {
    ObjectAllValuesFromImpl objectAllValuesFrom = new ObjectAllValuesFromImpl();
    return objectAllValuesFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectHasSelf createObjectHasSelf()
  {
    ObjectHasSelfImpl objectHasSelf = new ObjectHasSelfImpl();
    return objectHasSelf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectHasValue createObjectHasValue()
  {
    ObjectHasValueImpl objectHasValue = new ObjectHasValueImpl();
    return objectHasValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectMinCardinality createObjectMinCardinality()
  {
    ObjectMinCardinalityImpl objectMinCardinality = new ObjectMinCardinalityImpl();
    return objectMinCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectMaxCardinality createObjectMaxCardinality()
  {
    ObjectMaxCardinalityImpl objectMaxCardinality = new ObjectMaxCardinalityImpl();
    return objectMaxCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectExactCardinality createObjectExactCardinality()
  {
    ObjectExactCardinalityImpl objectExactCardinality = new ObjectExactCardinalityImpl();
    return objectExactCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSomeValuesFrom createDataSomeValuesFrom()
  {
    DataSomeValuesFromImpl dataSomeValuesFrom = new DataSomeValuesFromImpl();
    return dataSomeValuesFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAllValuesFrom createDataAllValuesFrom()
  {
    DataAllValuesFromImpl dataAllValuesFrom = new DataAllValuesFromImpl();
    return dataAllValuesFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataHasValue createDataHasValue()
  {
    DataHasValueImpl dataHasValue = new DataHasValueImpl();
    return dataHasValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataMinCardinality createDataMinCardinality()
  {
    DataMinCardinalityImpl dataMinCardinality = new DataMinCardinalityImpl();
    return dataMinCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataMaxCardinality createDataMaxCardinality()
  {
    DataMaxCardinalityImpl dataMaxCardinality = new DataMaxCardinalityImpl();
    return dataMaxCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataExactCardinality createDataExactCardinality()
  {
    DataExactCardinalityImpl dataExactCardinality = new DataExactCardinalityImpl();
    return dataExactCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubClassOf createSubClassOf()
  {
    SubClassOfImpl subClassOf = new SubClassOfImpl();
    return subClassOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquivalentClasses createEquivalentClasses()
  {
    EquivalentClassesImpl equivalentClasses = new EquivalentClassesImpl();
    return equivalentClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisjointClasses createDisjointClasses()
  {
    DisjointClassesImpl disjointClasses = new DisjointClassesImpl();
    return disjointClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisjointUnion createDisjointUnion()
  {
    DisjointUnionImpl disjointUnion = new DisjointUnionImpl();
    return disjointUnion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubObjectPropertyOf createSubObjectPropertyOf()
  {
    SubObjectPropertyOfImpl subObjectPropertyOf = new SubObjectPropertyOfImpl();
    return subObjectPropertyOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyChain createObjectPropertyChain()
  {
    ObjectPropertyChainImpl objectPropertyChain = new ObjectPropertyChainImpl();
    return objectPropertyChain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquivalentObjectProperties createEquivalentObjectProperties()
  {
    EquivalentObjectPropertiesImpl equivalentObjectProperties = new EquivalentObjectPropertiesImpl();
    return equivalentObjectProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisjointObjectProperties createDisjointObjectProperties()
  {
    DisjointObjectPropertiesImpl disjointObjectProperties = new DisjointObjectPropertiesImpl();
    return disjointObjectProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyDomain createObjectPropertyDomain()
  {
    ObjectPropertyDomainImpl objectPropertyDomain = new ObjectPropertyDomainImpl();
    return objectPropertyDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyRange createObjectPropertyRange()
  {
    ObjectPropertyRangeImpl objectPropertyRange = new ObjectPropertyRangeImpl();
    return objectPropertyRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InverseObjectProperties createInverseObjectProperties()
  {
    InverseObjectPropertiesImpl inverseObjectProperties = new InverseObjectPropertiesImpl();
    return inverseObjectProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalObjectProperty createFunctionalObjectProperty()
  {
    FunctionalObjectPropertyImpl functionalObjectProperty = new FunctionalObjectPropertyImpl();
    return functionalObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InverseFunctionalObjectProperty createInverseFunctionalObjectProperty()
  {
    InverseFunctionalObjectPropertyImpl inverseFunctionalObjectProperty = new InverseFunctionalObjectPropertyImpl();
    return inverseFunctionalObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReflexiveObjectProperty createReflexiveObjectProperty()
  {
    ReflexiveObjectPropertyImpl reflexiveObjectProperty = new ReflexiveObjectPropertyImpl();
    return reflexiveObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IrreflexiveObjectProperty createIrreflexiveObjectProperty()
  {
    IrreflexiveObjectPropertyImpl irreflexiveObjectProperty = new IrreflexiveObjectPropertyImpl();
    return irreflexiveObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymmetricObjectProperty createSymmetricObjectProperty()
  {
    SymmetricObjectPropertyImpl symmetricObjectProperty = new SymmetricObjectPropertyImpl();
    return symmetricObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsymmetricObjectProperty createAsymmetricObjectProperty()
  {
    AsymmetricObjectPropertyImpl asymmetricObjectProperty = new AsymmetricObjectPropertyImpl();
    return asymmetricObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitiveObjectProperty createTransitiveObjectProperty()
  {
    TransitiveObjectPropertyImpl transitiveObjectProperty = new TransitiveObjectPropertyImpl();
    return transitiveObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubDataPropertyOf createSubDataPropertyOf()
  {
    SubDataPropertyOfImpl subDataPropertyOf = new SubDataPropertyOfImpl();
    return subDataPropertyOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquivalentDataProperties createEquivalentDataProperties()
  {
    EquivalentDataPropertiesImpl equivalentDataProperties = new EquivalentDataPropertiesImpl();
    return equivalentDataProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisjointDataProperties createDisjointDataProperties()
  {
    DisjointDataPropertiesImpl disjointDataProperties = new DisjointDataPropertiesImpl();
    return disjointDataProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyDomain createDataPropertyDomain()
  {
    DataPropertyDomainImpl dataPropertyDomain = new DataPropertyDomainImpl();
    return dataPropertyDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyRange createDataPropertyRange()
  {
    DataPropertyRangeImpl dataPropertyRange = new DataPropertyRangeImpl();
    return dataPropertyRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalDataProperty createFunctionalDataProperty()
  {
    FunctionalDataPropertyImpl functionalDataProperty = new FunctionalDataPropertyImpl();
    return functionalDataProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeDefinition createDatatypeDefinition()
  {
    DatatypeDefinitionImpl datatypeDefinition = new DatatypeDefinitionImpl();
    return datatypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasKey createHasKey()
  {
    HasKeyImpl hasKey = new HasKeyImpl();
    return hasKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SameIndividual createSameIndividual()
  {
    SameIndividualImpl sameIndividual = new SameIndividualImpl();
    return sameIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DifferentIndividuals createDifferentIndividuals()
  {
    DifferentIndividualsImpl differentIndividuals = new DifferentIndividualsImpl();
    return differentIndividuals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAssertion createClassAssertion()
  {
    ClassAssertionImpl classAssertion = new ClassAssertionImpl();
    return classAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyAssertion createObjectPropertyAssertion()
  {
    ObjectPropertyAssertionImpl objectPropertyAssertion = new ObjectPropertyAssertionImpl();
    return objectPropertyAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegativeObjectPropertyAssertion createNegativeObjectPropertyAssertion()
  {
    NegativeObjectPropertyAssertionImpl negativeObjectPropertyAssertion = new NegativeObjectPropertyAssertionImpl();
    return negativeObjectPropertyAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyAssertion createDataPropertyAssertion()
  {
    DataPropertyAssertionImpl dataPropertyAssertion = new DataPropertyAssertionImpl();
    return dataPropertyAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegativeDataPropertyAssertion createNegativeDataPropertyAssertion()
  {
    NegativeDataPropertyAssertionImpl negativeDataPropertyAssertion = new NegativeDataPropertyAssertionImpl();
    return negativeDataPropertyAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DLSafeRule createDLSafeRule()
  {
    DLSafeRuleImpl dlSafeRule = new DLSafeRuleImpl();
    return dlSafeRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAtom createClassAtom()
  {
    ClassAtomImpl classAtom = new ClassAtomImpl();
    return classAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataRangeAtom createDataRangeAtom()
  {
    DataRangeAtomImpl dataRangeAtom = new DataRangeAtomImpl();
    return dataRangeAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyAtom createObjectPropertyAtom()
  {
    ObjectPropertyAtomImpl objectPropertyAtom = new ObjectPropertyAtomImpl();
    return objectPropertyAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropetyAtom createDataPropetyAtom()
  {
    DataPropetyAtomImpl dataPropetyAtom = new DataPropetyAtomImpl();
    return dataPropetyAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInAtom createBuiltInAtom()
  {
    BuiltInAtomImpl builtInAtom = new BuiltInAtomImpl();
    return builtInAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SameIndividualAtom createSameIndividualAtom()
  {
    SameIndividualAtomImpl sameIndividualAtom = new SameIndividualAtomImpl();
    return sameIndividualAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DifferentIndividualsAtom createDifferentIndividualsAtom()
  {
    DifferentIndividualsAtomImpl differentIndividualsAtom = new DifferentIndividualsAtomImpl();
    return differentIndividualsAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DGRule createDGRule()
  {
    DGRuleImpl dgRule = new DGRuleImpl();
    return dgRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DGAxiom createDGAxiom()
  {
    DGAxiomImpl dgAxiom = new DGAxiomImpl();
    return dgAxiom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DGNodes createDGNodes()
  {
    DGNodesImpl dgNodes = new DGNodesImpl();
    return dgNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeAssertion createNodeAssertion()
  {
    NodeAssertionImpl nodeAssertion = new NodeAssertionImpl();
    return nodeAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DGEdges createDGEdges()
  {
    DGEdgesImpl dgEdges = new DGEdgesImpl();
    return dgEdges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgeAssertion createEdgeAssertion()
  {
    EdgeAssertionImpl edgeAssertion = new EdgeAssertionImpl();
    return edgeAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainClasses createMainClasses()
  {
    MainClassesImpl mainClasses = new MainClassesImpl();
    return mainClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter createTemplateParameter()
  {
    TemplateParameterImpl templateParameter = new TemplateParameterImpl();
    return templateParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterableElement createParameterableElement()
  {
    ParameterableElementImpl parameterableElement = new ParameterableElementImpl();
    return parameterableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSignature createTemplateSignature()
  {
    TemplateSignatureImpl templateSignature = new TemplateSignatureImpl();
    return templateSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateableElement createTemplateableElement()
  {
    TemplateableElementImpl templateableElement = new TemplateableElementImpl();
    return templateableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public west.twouse.language.owl2fs.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassifierTemplateParameter createClassifierTemplateParameter()
  {
    ClassifierTemplateParameterImpl classifierTemplateParameter = new ClassifierTemplateParameterImpl();
    return classifierTemplateParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameterSubstitution createTemplateParameterSubstitution()
  {
    TemplateParameterSubstitutionImpl templateParameterSubstitution = new TemplateParameterSubstitutionImpl();
    return templateParameterSubstitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateBinding createTemplateBinding()
  {
    TemplateBindingImpl templateBinding = new TemplateBindingImpl();
    return templateBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Owl2fsPackage getOwl2fsPackage()
  {
    return (Owl2fsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Owl2fsPackage getPackage()
  {
    return Owl2fsPackage.eINSTANCE;
  }

} //Owl2fsFactoryImpl
