/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByAnonymousIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByEntity;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassifierTemplateParameter;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataVariable;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualVariable;
import de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Literal;
import de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology;
import de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement;
import de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Rule;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
      Owl2fsFactory theOwl2fsFactory = (Owl2fsFactory)EPackage.Registry.INSTANCE.getEFactory("http://west.uni-koblenz.de/OWL2FS"); 
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
      case Owl2fsPackage.ANNOTATION: return createAnnotation();
      case Owl2fsPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
      case Owl2fsPackage.URI: return createURI();
      case Owl2fsPackage.LITERAL: return createLiteral();
      case Owl2fsPackage.DATATYPE: return createDatatype();
      case Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY: return createAsymmetricObjectProperty();
      case Owl2fsPackage.OBJECT_PROPERTY: return createObjectProperty();
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTY: return createInverseObjectProperty();
      case Owl2fsPackage.CLASS: return createClass();
      case Owl2fsPackage.OBJECT_INTERSECTION_OF: return createObjectIntersectionOf();
      case Owl2fsPackage.OBJECT_ONE_OF: return createObjectOneOf();
      case Owl2fsPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
      case Owl2fsPackage.OBJECT_SOME_VALUES_FROM: return createObjectSomeValuesFrom();
      case Owl2fsPackage.OBJECT_ALL_VALUES_FROM: return createObjectAllValuesFrom();
      case Owl2fsPackage.OBJECT_EXISTS_SELF: return createObjectExistsSelf();
      case Owl2fsPackage.OBJECT_HAS_VALUE: return createObjectHasValue();
      case Owl2fsPackage.OBJECT_MIN_CARDINALITY: return createObjectMinCardinality();
      case Owl2fsPackage.OBJECT_MAX_CARDINALITY: return createObjectMaxCardinality();
      case Owl2fsPackage.DATA_SOME_VALUES_FROM: return createDataSomeValuesFrom();
      case Owl2fsPackage.DATA_PROPERTY: return createDataProperty();
      case Owl2fsPackage.DATA_ONE_OF: return createDataOneOf();
      case Owl2fsPackage.DATATYPE_RESTRICTION: return createDatatypeRestriction();
      case Owl2fsPackage.FACET_CONSTANT_PAIR: return createFacetConstantPair();
      case Owl2fsPackage.DATA_ALL_VALUES_FROM: return createDataAllValuesFrom();
      case Owl2fsPackage.DATA_HAS_VALUE: return createDataHasValue();
      case Owl2fsPackage.DATA_MIN_CARDINALITY: return createDataMinCardinality();
      case Owl2fsPackage.DATA_MAX_CARDINALITY: return createDataMaxCardinality();
      case Owl2fsPackage.DATA_EXACT_CARDINALITY: return createDataExactCardinality();
      case Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: return createNegativeDataPropertyAssertion();
      case Owl2fsPackage.DATA_PROPERTY_DOMAIN: return createDataPropertyDomain();
      case Owl2fsPackage.DATA_PROPERTY_RANGE: return createDataPropertyRange();
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS: return createDifferentIndividuals();
      case Owl2fsPackage.DISJOINT_CLASSES: return createDisjointClasses();
      case Owl2fsPackage.DISJOINT_DATA_PROPERTIES: return createDisjointDataProperties();
      case Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES: return createDisjointObjectProperties();
      case Owl2fsPackage.DISJOINT_UNION: return createDisjointUnion();
      case Owl2fsPackage.EQUIVALENT_CLASSES: return createEquivalentClasses();
      case Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES: return createEquivalentDataProperties();
      case Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES: return createEquivalentObjectProperties();
      case Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY: return createFunctionalDataProperty();
      case Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY: return createFunctionalObjectProperty();
      case Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY: return createInverseFunctionalObjectProperty();
      case Owl2fsPackage.OBJECT_PROPERTY_ASSERTION: return createObjectPropertyAssertion();
      case Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: return createNegativeObjectPropertyAssertion();
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN: return createObjectPropertyDomain();
      case Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY: return createSymmetricObjectProperty();
      case Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY: return createReflexiveObjectProperty();
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF: return createSubDataPropertyOf();
      case Owl2fsPackage.SAME_INDIVIDUAL: return createSameIndividual();
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF: return createSubObjectPropertyOf();
      case Owl2fsPackage.OBJECT_COMPLEMENT_OF: return createObjectComplementOf();
      case Owl2fsPackage.ONTOLOGY: return createOntology();
      case Owl2fsPackage.OBJECT_PROPERTY_RANGE: return createObjectPropertyRange();
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION: return createDataPropertyAssertion();
      case Owl2fsPackage.CLASS_ASSERTION: return createClassAssertion();
      case Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY: return createIrreflexiveObjectProperty();
      case Owl2fsPackage.OBJECT_EXACT_CARDINALITY: return createObjectExactCardinality();
      case Owl2fsPackage.DATA_COMPLEMENT_OF: return createDataComplementOf();
      case Owl2fsPackage.SUB_CLASS_OF: return createSubClassOf();
      case Owl2fsPackage.SUB_OBJECT_PROPERTY: return createSubObjectProperty();
      case Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY: return createTransitiveObjectProperty();
      case Owl2fsPackage.ENTITY_ANNOTATION: return createEntityAnnotation();
      case Owl2fsPackage.FULL_URI: return createFullURI();
      case Owl2fsPackage.ABBREVIATED_URI: return createAbbreviatedURI();
      case Owl2fsPackage.OBJECT_UNION_OF: return createObjectUnionOf();
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTIES: return createInverseObjectProperties();
      case Owl2fsPackage.ANNOTATION_BY_CONSTANT: return createAnnotationByConstant();
      case Owl2fsPackage.ANNOTATION_BY_ENTITY: return createAnnotationByEntity();
      case Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL: return createAnnotationByAnonymousIndividual();
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
      case Owl2fsPackage.DECLARATION: return createDeclaration();
      case Owl2fsPackage.KEY_FOR: return createKeyFor();
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION: return createAnonymousIndividualAnnotation();
      case Owl2fsPackage.ONTOLOGY_DOCUMENT: return createOntologyDocument();
      case Owl2fsPackage.PREFIX_DEFINITION: return createPrefixDefinition();
      case Owl2fsPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
      case Owl2fsPackage.PARAMETERABLE_ELEMENT: return createParameterableElement();
      case Owl2fsPackage.TEMPLATE_SIGNATURE: return createTemplateSignature();
      case Owl2fsPackage.TEMPLATEABLE_ELEMENT: return createTemplateableElement();
      case Owl2fsPackage.PACKAGE: return createPackage();
      case Owl2fsPackage.CLASSIFIER_TEMPLATE_PARAMETER: return createClassifierTemplateParameter();
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION: return createTemplateParameterSubstitution();
      case Owl2fsPackage.TEMPLATE_BINDING: return createTemplateBinding();
      case Owl2fsPackage.RULE: return createRule();
      case Owl2fsPackage.ANTECEDENT: return createAntecedent();
      case Owl2fsPackage.CONSEQUENT: return createConsequent();
      case Owl2fsPackage.DATA_RANGE_ATOM: return createDataRangeAtom();
      case Owl2fsPackage.CLASS_ATOM: return createClassAtom();
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM: return createIndividualPropetyAtom();
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM: return createDatavaluedPropertyAtom();
      case Owl2fsPackage.DATA_VARIABLE: return createDataVariable();
      case Owl2fsPackage.INDIVIDUAL_VARIABLE: return createIndividualVariable();
      case Owl2fsPackage.BUILT_IN_ATOM: return createBuiltInAtom();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Owl2fsPackage.DATA_TYPE_MAPS:
        return createDataTypeMapsFromString(eDataType, initialValue);
      case Owl2fsPackage.BUILT_IN_ID:
        return createBuiltInIDFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Owl2fsPackage.DATA_TYPE_MAPS:
        return convertDataTypeMapsToString(eDataType, instanceValue);
      case Owl2fsPackage.BUILT_IN_ID:
        return convertBuiltInIDToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
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
  public URI createURI()
  {
    URIImpl uri = new URIImpl();
    return uri;
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
  public de.uniko.isweb.emftext.owl2fs.owl2fs.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
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
  public ObjectExistsSelf createObjectExistsSelf()
  {
    ObjectExistsSelfImpl objectExistsSelf = new ObjectExistsSelfImpl();
    return objectExistsSelf;
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
  public FacetConstantPair createFacetConstantPair()
  {
    FacetConstantPairImpl facetConstantPair = new FacetConstantPairImpl();
    return facetConstantPair;
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
  public SubObjectProperty createSubObjectProperty()
  {
    SubObjectPropertyImpl subObjectProperty = new SubObjectPropertyImpl();
    return subObjectProperty;
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
  public EntityAnnotation createEntityAnnotation()
  {
    EntityAnnotationImpl entityAnnotation = new EntityAnnotationImpl();
    return entityAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FullURI createFullURI()
  {
    FullURIImpl fullURI = new FullURIImpl();
    return fullURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbbreviatedURI createAbbreviatedURI()
  {
    AbbreviatedURIImpl abbreviatedURI = new AbbreviatedURIImpl();
    return abbreviatedURI;
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
  public AnnotationByConstant createAnnotationByConstant()
  {
    AnnotationByConstantImpl annotationByConstant = new AnnotationByConstantImpl();
    return annotationByConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationByEntity createAnnotationByEntity()
  {
    AnnotationByEntityImpl annotationByEntity = new AnnotationByEntityImpl();
    return annotationByEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationByAnonymousIndividual createAnnotationByAnonymousIndividual()
  {
    AnnotationByAnonymousIndividualImpl annotationByAnonymousIndividual = new AnnotationByAnonymousIndividualImpl();
    return annotationByAnonymousIndividual;
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
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyFor createKeyFor()
  {
    KeyForImpl keyFor = new KeyForImpl();
    return keyFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousIndividualAnnotation createAnonymousIndividualAnnotation()
  {
    AnonymousIndividualAnnotationImpl anonymousIndividualAnnotation = new AnonymousIndividualAnnotationImpl();
    return anonymousIndividualAnnotation;
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
  public de.uniko.isweb.emftext.owl2fs.owl2fs.Package createPackage()
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
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Antecedent createAntecedent()
  {
    AntecedentImpl antecedent = new AntecedentImpl();
    return antecedent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Consequent createConsequent()
  {
    ConsequentImpl consequent = new ConsequentImpl();
    return consequent;
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
  public IndividualPropetyAtom createIndividualPropetyAtom()
  {
    IndividualPropetyAtomImpl individualPropetyAtom = new IndividualPropetyAtomImpl();
    return individualPropetyAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatavaluedPropertyAtom createDatavaluedPropertyAtom()
  {
    DatavaluedPropertyAtomImpl datavaluedPropertyAtom = new DatavaluedPropertyAtomImpl();
    return datavaluedPropertyAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataVariable createDataVariable()
  {
    DataVariableImpl dataVariable = new DataVariableImpl();
    return dataVariable;
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
  public DataTypeMaps createDataTypeMapsFromString(EDataType eDataType, String initialValue)
  {
    DataTypeMaps result = DataTypeMaps.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypeMapsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInID createBuiltInIDFromString(EDataType eDataType, String initialValue)
  {
    BuiltInID result = BuiltInID.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBuiltInIDToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
