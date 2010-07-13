/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import west.twouse.language.sparqlas.AbbreviatedIRI;
import west.twouse.language.sparqlas.AnonymousIndividual;
import west.twouse.language.sparqlas.AskQuery;
import west.twouse.language.sparqlas.AsymmetricObjectProperty;
import west.twouse.language.sparqlas.ClassAssertion;
import west.twouse.language.sparqlas.ClassDeclaration;
import west.twouse.language.sparqlas.ClassVariable;
import west.twouse.language.sparqlas.ConstructQuery;
import west.twouse.language.sparqlas.DataAllValuesFrom;
import west.twouse.language.sparqlas.DataComplementOf;
import west.twouse.language.sparqlas.DataExactCardinality;
import west.twouse.language.sparqlas.DataHasValue;
import west.twouse.language.sparqlas.DataIntersectionOf;
import west.twouse.language.sparqlas.DataMaxCardinality;
import west.twouse.language.sparqlas.DataMinCardinality;
import west.twouse.language.sparqlas.DataOneOf;
import west.twouse.language.sparqlas.DataProperty;
import west.twouse.language.sparqlas.DataPropertyAssertion;
import west.twouse.language.sparqlas.DataPropertyDomain;
import west.twouse.language.sparqlas.DataPropertyRange;
import west.twouse.language.sparqlas.DataPropertyVariable;
import west.twouse.language.sparqlas.DataSomeValuesFrom;
import west.twouse.language.sparqlas.DataUnionOf;
import west.twouse.language.sparqlas.Datatype;
import west.twouse.language.sparqlas.DatatypePropertyDeclaration;
import west.twouse.language.sparqlas.DatatypeRestriction;
import west.twouse.language.sparqlas.DescribeQuery;
import west.twouse.language.sparqlas.DifferentIndividuals;
import west.twouse.language.sparqlas.DirectClassAssertion;
import west.twouse.language.sparqlas.DirectSubClassOf;
import west.twouse.language.sparqlas.DisjointClasses;
import west.twouse.language.sparqlas.DisjointDataProperties;
import west.twouse.language.sparqlas.DisjointObjectProperties;
import west.twouse.language.sparqlas.DisjointUnion;
import west.twouse.language.sparqlas.EquivalentClasses;
import west.twouse.language.sparqlas.EquivalentDataProperties;
import west.twouse.language.sparqlas.EquivalentObjectProperties;
import west.twouse.language.sparqlas.FacetRestriction;
import west.twouse.language.sparqlas.FullIRI;
import west.twouse.language.sparqlas.FunctionalDataProperty;
import west.twouse.language.sparqlas.FunctionalObjectProperty;
import west.twouse.language.sparqlas.HasKey;
import west.twouse.language.sparqlas.Import;
import west.twouse.language.sparqlas.IndividualDeclaration;
import west.twouse.language.sparqlas.IndividualVariable;
import west.twouse.language.sparqlas.InverseFunctionalObjectProperty;
import west.twouse.language.sparqlas.InverseObjectProperty;
import west.twouse.language.sparqlas.InverseObjectPropertyAtom;
import west.twouse.language.sparqlas.IrreflexiveObjectProperty;
import west.twouse.language.sparqlas.Literal;
import west.twouse.language.sparqlas.LiteralVariable;
import west.twouse.language.sparqlas.NamedIndividual;
import west.twouse.language.sparqlas.NegativeDataPropertyAssertion;
import west.twouse.language.sparqlas.NegativeObjectPropertyAssertion;
import west.twouse.language.sparqlas.ObjectAllValuesFrom;
import west.twouse.language.sparqlas.ObjectComplementOf;
import west.twouse.language.sparqlas.ObjectExactCardinality;
import west.twouse.language.sparqlas.ObjectHasValue;
import west.twouse.language.sparqlas.ObjectIntersectionOf;
import west.twouse.language.sparqlas.ObjectMaxCardinality;
import west.twouse.language.sparqlas.ObjectMinCardinality;
import west.twouse.language.sparqlas.ObjectOneOf;
import west.twouse.language.sparqlas.ObjectProperty;
import west.twouse.language.sparqlas.ObjectPropertyAssertion;
import west.twouse.language.sparqlas.ObjectPropertyChain;
import west.twouse.language.sparqlas.ObjectPropertyDeclaration;
import west.twouse.language.sparqlas.ObjectPropertyDomain;
import west.twouse.language.sparqlas.ObjectPropertyRange;
import west.twouse.language.sparqlas.ObjectPropertyVariable;
import west.twouse.language.sparqlas.ObjectSomeValuesFrom;
import west.twouse.language.sparqlas.ObjectUnionOf;
import west.twouse.language.sparqlas.OntologyDocument;
import west.twouse.language.sparqlas.PrefixDefinition;
import west.twouse.language.sparqlas.ReflexiveObjectProperty;
import west.twouse.language.sparqlas.SameIndividual;
import west.twouse.language.sparqlas.SelectQuery;
import west.twouse.language.sparqlas.SparqlasFactory;
import west.twouse.language.sparqlas.SparqlasPackage;
import west.twouse.language.sparqlas.StrictSubClassOf;
import west.twouse.language.sparqlas.SubClassOf;
import west.twouse.language.sparqlas.SubDataPropertyOf;
import west.twouse.language.sparqlas.SubObjectPropertyOf;
import west.twouse.language.sparqlas.SymmetricObjectProperty;
import west.twouse.language.sparqlas.TemplateBinding;
import west.twouse.language.sparqlas.TemplateParameter;
import west.twouse.language.sparqlas.TemplateParameterSubstitution;
import west.twouse.language.sparqlas.TemplateSignature;
import west.twouse.language.sparqlas.TransitiveObjectProperty;
import west.twouse.language.sparqlas.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SparqlasFactoryImpl extends EFactoryImpl implements SparqlasFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SparqlasFactory init()
  {
    try
    {
      SparqlasFactory theSparqlasFactory = (SparqlasFactory)EPackage.Registry.INSTANCE.getEFactory("http://west.uni-koblenz.de/sparqlas"); 
      if (theSparqlasFactory != null)
      {
        return theSparqlasFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SparqlasFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlasFactoryImpl()
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
      case SparqlasPackage.ONTOLOGY_DOCUMENT: return createOntologyDocument();
      case SparqlasPackage.IMPORT: return createImport();
      case SparqlasPackage.PREFIX_DEFINITION: return createPrefixDefinition();
      case SparqlasPackage.SELECT_QUERY: return createSelectQuery();
      case SparqlasPackage.CONSTRUCT_QUERY: return createConstructQuery();
      case SparqlasPackage.ASK_QUERY: return createAskQuery();
      case SparqlasPackage.DESCRIBE_QUERY: return createDescribeQuery();
      case SparqlasPackage.FULL_IRI: return createFullIRI();
      case SparqlasPackage.ABBREVIATED_IRI: return createAbbreviatedIRI();
      case SparqlasPackage.VARIABLE: return createVariable();
      case SparqlasPackage.CLASS_VARIABLE: return createClassVariable();
      case SparqlasPackage.OBJECT_PROPERTY_VARIABLE: return createObjectPropertyVariable();
      case SparqlasPackage.DATA_PROPERTY_VARIABLE: return createDataPropertyVariable();
      case SparqlasPackage.INDIVIDUAL_VARIABLE: return createIndividualVariable();
      case SparqlasPackage.CLASS: return createClass();
      case SparqlasPackage.DATATYPE: return createDatatype();
      case SparqlasPackage.OBJECT_PROPERTY: return createObjectProperty();
      case SparqlasPackage.DATA_PROPERTY: return createDataProperty();
      case SparqlasPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
      case SparqlasPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
      case SparqlasPackage.LITERAL_VARIABLE: return createLiteralVariable();
      case SparqlasPackage.LITERAL: return createLiteral();
      case SparqlasPackage.CLASS_ASSERTION: return createClassAssertion();
      case SparqlasPackage.OBJECT_PROPERTY_ASSERTION: return createObjectPropertyAssertion();
      case SparqlasPackage.DATA_PROPERTY_ASSERTION: return createDataPropertyAssertion();
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: return createNegativeObjectPropertyAssertion();
      case SparqlasPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: return createNegativeDataPropertyAssertion();
      case SparqlasPackage.SAME_INDIVIDUAL: return createSameIndividual();
      case SparqlasPackage.DIFFERENT_INDIVIDUALS: return createDifferentIndividuals();
      case SparqlasPackage.SUB_CLASS_OF: return createSubClassOf();
      case SparqlasPackage.EQUIVALENT_CLASSES: return createEquivalentClasses();
      case SparqlasPackage.DISJOINT_CLASSES: return createDisjointClasses();
      case SparqlasPackage.DISJOINT_UNION: return createDisjointUnion();
      case SparqlasPackage.OBJECT_UNION_OF: return createObjectUnionOf();
      case SparqlasPackage.OBJECT_COMPLEMENT_OF: return createObjectComplementOf();
      case SparqlasPackage.OBJECT_ONE_OF: return createObjectOneOf();
      case SparqlasPackage.OBJECT_INTERSECTION_OF: return createObjectIntersectionOf();
      case SparqlasPackage.OBJECT_ALL_VALUES_FROM: return createObjectAllValuesFrom();
      case SparqlasPackage.OBJECT_SOME_VALUES_FROM: return createObjectSomeValuesFrom();
      case SparqlasPackage.OBJECT_HAS_VALUE: return createObjectHasValue();
      case SparqlasPackage.OBJECT_MIN_CARDINALITY: return createObjectMinCardinality();
      case SparqlasPackage.OBJECT_MAX_CARDINALITY: return createObjectMaxCardinality();
      case SparqlasPackage.OBJECT_EXACT_CARDINALITY: return createObjectExactCardinality();
      case SparqlasPackage.DATA_ALL_VALUES_FROM: return createDataAllValuesFrom();
      case SparqlasPackage.DATA_SOME_VALUES_FROM: return createDataSomeValuesFrom();
      case SparqlasPackage.DATA_HAS_VALUE: return createDataHasValue();
      case SparqlasPackage.DATA_MIN_CARDINALITY: return createDataMinCardinality();
      case SparqlasPackage.DATA_MAX_CARDINALITY: return createDataMaxCardinality();
      case SparqlasPackage.DATA_EXACT_CARDINALITY: return createDataExactCardinality();
      case SparqlasPackage.DATA_UNION_OF: return createDataUnionOf();
      case SparqlasPackage.DATA_COMPLEMENT_OF: return createDataComplementOf();
      case SparqlasPackage.DATA_ONE_OF: return createDataOneOf();
      case SparqlasPackage.DATA_INTERSECTION_OF: return createDataIntersectionOf();
      case SparqlasPackage.DATATYPE_RESTRICTION: return createDatatypeRestriction();
      case SparqlasPackage.FACET_RESTRICTION: return createFacetRestriction();
      case SparqlasPackage.SUB_OBJECT_PROPERTY_OF: return createSubObjectPropertyOf();
      case SparqlasPackage.OBJECT_PROPERTY_CHAIN: return createObjectPropertyChain();
      case SparqlasPackage.EQUIVALENT_OBJECT_PROPERTIES: return createEquivalentObjectProperties();
      case SparqlasPackage.DISJOINT_OBJECT_PROPERTIES: return createDisjointObjectProperties();
      case SparqlasPackage.OBJECT_PROPERTY_DOMAIN: return createObjectPropertyDomain();
      case SparqlasPackage.OBJECT_PROPERTY_RANGE: return createObjectPropertyRange();
      case SparqlasPackage.INVERSE_OBJECT_PROPERTY_ATOM: return createInverseObjectPropertyAtom();
      case SparqlasPackage.FUNCTIONAL_OBJECT_PROPERTY: return createFunctionalObjectProperty();
      case SparqlasPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY: return createInverseFunctionalObjectProperty();
      case SparqlasPackage.REFLEXIVE_OBJECT_PROPERTY: return createReflexiveObjectProperty();
      case SparqlasPackage.IRREFLEXIVE_OBJECT_PROPERTY: return createIrreflexiveObjectProperty();
      case SparqlasPackage.SYMMETRIC_OBJECT_PROPERTY: return createSymmetricObjectProperty();
      case SparqlasPackage.ASYMMETRIC_OBJECT_PROPERTY: return createAsymmetricObjectProperty();
      case SparqlasPackage.TRANSITIVE_OBJECT_PROPERTY: return createTransitiveObjectProperty();
      case SparqlasPackage.INVERSE_OBJECT_PROPERTY: return createInverseObjectProperty();
      case SparqlasPackage.SUB_DATA_PROPERTY_OF: return createSubDataPropertyOf();
      case SparqlasPackage.EQUIVALENT_DATA_PROPERTIES: return createEquivalentDataProperties();
      case SparqlasPackage.DISJOINT_DATA_PROPERTIES: return createDisjointDataProperties();
      case SparqlasPackage.DATA_PROPERTY_DOMAIN: return createDataPropertyDomain();
      case SparqlasPackage.DATA_PROPERTY_RANGE: return createDataPropertyRange();
      case SparqlasPackage.FUNCTIONAL_DATA_PROPERTY: return createFunctionalDataProperty();
      case SparqlasPackage.HAS_KEY: return createHasKey();
      case SparqlasPackage.CLASS_DECLARATION: return createClassDeclaration();
      case SparqlasPackage.OBJECT_PROPERTY_DECLARATION: return createObjectPropertyDeclaration();
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION: return createDatatypePropertyDeclaration();
      case SparqlasPackage.INDIVIDUAL_DECLARATION: return createIndividualDeclaration();
      case SparqlasPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
      case SparqlasPackage.TEMPLATE_SIGNATURE: return createTemplateSignature();
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION: return createTemplateParameterSubstitution();
      case SparqlasPackage.TEMPLATE_BINDING: return createTemplateBinding();
      case SparqlasPackage.DIRECT_CLASS_ASSERTION: return createDirectClassAssertion();
      case SparqlasPackage.DIRECT_SUB_CLASS_OF: return createDirectSubClassOf();
      case SparqlasPackage.STRICT_SUB_CLASS_OF: return createStrictSubClassOf();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
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
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
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
  public SelectQuery createSelectQuery()
  {
    SelectQueryImpl selectQuery = new SelectQueryImpl();
    return selectQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructQuery createConstructQuery()
  {
    ConstructQueryImpl constructQuery = new ConstructQueryImpl();
    return constructQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AskQuery createAskQuery()
  {
    AskQueryImpl askQuery = new AskQueryImpl();
    return askQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescribeQuery createDescribeQuery()
  {
    DescribeQueryImpl describeQuery = new DescribeQueryImpl();
    return describeQuery;
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
  public ClassVariable createClassVariable()
  {
    ClassVariableImpl classVariable = new ClassVariableImpl();
    return classVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyVariable createObjectPropertyVariable()
  {
    ObjectPropertyVariableImpl objectPropertyVariable = new ObjectPropertyVariableImpl();
    return objectPropertyVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyVariable createDataPropertyVariable()
  {
    DataPropertyVariableImpl dataPropertyVariable = new DataPropertyVariableImpl();
    return dataPropertyVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndividualVariable createIndividualVariable()
  {
    IndividualVariableImpl individualVariable = new IndividualVariableImpl();
    return individualVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public west.twouse.language.sparqlas.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
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
  public LiteralVariable createLiteralVariable()
  {
    LiteralVariableImpl literalVariable = new LiteralVariableImpl();
    return literalVariable;
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
  public FacetRestriction createFacetRestriction()
  {
    FacetRestrictionImpl facetRestriction = new FacetRestrictionImpl();
    return facetRestriction;
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
  public InverseObjectPropertyAtom createInverseObjectPropertyAtom()
  {
    InverseObjectPropertyAtomImpl inverseObjectPropertyAtom = new InverseObjectPropertyAtomImpl();
    return inverseObjectPropertyAtom;
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
  public DatatypePropertyDeclaration createDatatypePropertyDeclaration()
  {
    DatatypePropertyDeclarationImpl datatypePropertyDeclaration = new DatatypePropertyDeclarationImpl();
    return datatypePropertyDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndividualDeclaration createIndividualDeclaration()
  {
    IndividualDeclarationImpl individualDeclaration = new IndividualDeclarationImpl();
    return individualDeclaration;
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
  public DirectClassAssertion createDirectClassAssertion()
  {
    DirectClassAssertionImpl directClassAssertion = new DirectClassAssertionImpl();
    return directClassAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectSubClassOf createDirectSubClassOf()
  {
    DirectSubClassOfImpl directSubClassOf = new DirectSubClassOfImpl();
    return directSubClassOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrictSubClassOf createStrictSubClassOf()
  {
    StrictSubClassOfImpl strictSubClassOf = new StrictSubClassOfImpl();
    return strictSubClassOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlasPackage getSparqlasPackage()
  {
    return (SparqlasPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SparqlasPackage getPackage()
  {
    return SparqlasPackage.eINSTANCE;
  }

} //SparqlasFactoryImpl
