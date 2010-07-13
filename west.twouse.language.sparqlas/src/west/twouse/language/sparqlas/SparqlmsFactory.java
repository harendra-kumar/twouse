/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see west.twouse.language.sparqlas.SparqlmsPackage
 * @generated
 */
public interface SparqlmsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SparqlmsFactory eINSTANCE = west.twouse.language.sparqlas.impl.SparqlmsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Ontology Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ontology Document</em>'.
   * @generated
   */
  OntologyDocument createOntologyDocument();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Prefix Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Definition</em>'.
   * @generated
   */
  PrefixDefinition createPrefixDefinition();

  /**
   * Returns a new object of class '<em>Select Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Query</em>'.
   * @generated
   */
  SelectQuery createSelectQuery();

  /**
   * Returns a new object of class '<em>Construct Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Construct Query</em>'.
   * @generated
   */
  ConstructQuery createConstructQuery();

  /**
   * Returns a new object of class '<em>Ask Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ask Query</em>'.
   * @generated
   */
  AskQuery createAskQuery();

  /**
   * Returns a new object of class '<em>Describe Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Describe Query</em>'.
   * @generated
   */
  DescribeQuery createDescribeQuery();

  /**
   * Returns a new object of class '<em>Full IRI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Full IRI</em>'.
   * @generated
   */
  FullIRI createFullIRI();

  /**
   * Returns a new object of class '<em>Abbreviated IRI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abbreviated IRI</em>'.
   * @generated
   */
  AbbreviatedIRI createAbbreviatedIRI();

  /**
   * Returns a new object of class '<em>Class Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Variable</em>'.
   * @generated
   */
  ClassVariable createClassVariable();

  /**
   * Returns a new object of class '<em>Object Property Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Variable</em>'.
   * @generated
   */
  ObjectPropertyVariable createObjectPropertyVariable();

  /**
   * Returns a new object of class '<em>Data Property Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Variable</em>'.
   * @generated
   */
  DataPropertyVariable createDataPropertyVariable();

  /**
   * Returns a new object of class '<em>Individual Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Individual Variable</em>'.
   * @generated
   */
  IndividualVariable createIndividualVariable();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype</em>'.
   * @generated
   */
  Datatype createDatatype();

  /**
   * Returns a new object of class '<em>Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property</em>'.
   * @generated
   */
  ObjectProperty createObjectProperty();

  /**
   * Returns a new object of class '<em>Data Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property</em>'.
   * @generated
   */
  DataProperty createDataProperty();

  /**
   * Returns a new object of class '<em>Named Individual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Individual</em>'.
   * @generated
   */
  NamedIndividual createNamedIndividual();

  /**
   * Returns a new object of class '<em>Anonymous Individual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anonymous Individual</em>'.
   * @generated
   */
  AnonymousIndividual createAnonymousIndividual();

  /**
   * Returns a new object of class '<em>Literal Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Variable</em>'.
   * @generated
   */
  LiteralVariable createLiteralVariable();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Class Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Assertion</em>'.
   * @generated
   */
  ClassAssertion createClassAssertion();

  /**
   * Returns a new object of class '<em>Object Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Assertion</em>'.
   * @generated
   */
  ObjectPropertyAssertion createObjectPropertyAssertion();

  /**
   * Returns a new object of class '<em>Data Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Assertion</em>'.
   * @generated
   */
  DataPropertyAssertion createDataPropertyAssertion();

  /**
   * Returns a new object of class '<em>Negative Object Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Object Property Assertion</em>'.
   * @generated
   */
  NegativeObjectPropertyAssertion createNegativeObjectPropertyAssertion();

  /**
   * Returns a new object of class '<em>Negative Data Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Data Property Assertion</em>'.
   * @generated
   */
  NegativeDataPropertyAssertion createNegativeDataPropertyAssertion();

  /**
   * Returns a new object of class '<em>Same Individual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Same Individual</em>'.
   * @generated
   */
  SameIndividual createSameIndividual();

  /**
   * Returns a new object of class '<em>Different Individuals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Different Individuals</em>'.
   * @generated
   */
  DifferentIndividuals createDifferentIndividuals();

  /**
   * Returns a new object of class '<em>Sub Class Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Class Of</em>'.
   * @generated
   */
  SubClassOf createSubClassOf();

  /**
   * Returns a new object of class '<em>Equivalent Classes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equivalent Classes</em>'.
   * @generated
   */
  EquivalentClasses createEquivalentClasses();

  /**
   * Returns a new object of class '<em>Disjoint Classes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjoint Classes</em>'.
   * @generated
   */
  DisjointClasses createDisjointClasses();

  /**
   * Returns a new object of class '<em>Disjoint Union</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjoint Union</em>'.
   * @generated
   */
  DisjointUnion createDisjointUnion();

  /**
   * Returns a new object of class '<em>Object Union Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Union Of</em>'.
   * @generated
   */
  ObjectUnionOf createObjectUnionOf();

  /**
   * Returns a new object of class '<em>Object Complement Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Complement Of</em>'.
   * @generated
   */
  ObjectComplementOf createObjectComplementOf();

  /**
   * Returns a new object of class '<em>Object One Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object One Of</em>'.
   * @generated
   */
  ObjectOneOf createObjectOneOf();

  /**
   * Returns a new object of class '<em>Object Intersection Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Intersection Of</em>'.
   * @generated
   */
  ObjectIntersectionOf createObjectIntersectionOf();

  /**
   * Returns a new object of class '<em>Object All Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object All Values From</em>'.
   * @generated
   */
  ObjectAllValuesFrom createObjectAllValuesFrom();

  /**
   * Returns a new object of class '<em>Object Some Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Some Values From</em>'.
   * @generated
   */
  ObjectSomeValuesFrom createObjectSomeValuesFrom();

  /**
   * Returns a new object of class '<em>Object Has Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Has Value</em>'.
   * @generated
   */
  ObjectHasValue createObjectHasValue();

  /**
   * Returns a new object of class '<em>Object Min Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Min Cardinality</em>'.
   * @generated
   */
  ObjectMinCardinality createObjectMinCardinality();

  /**
   * Returns a new object of class '<em>Object Max Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Max Cardinality</em>'.
   * @generated
   */
  ObjectMaxCardinality createObjectMaxCardinality();

  /**
   * Returns a new object of class '<em>Object Exact Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Exact Cardinality</em>'.
   * @generated
   */
  ObjectExactCardinality createObjectExactCardinality();

  /**
   * Returns a new object of class '<em>Data All Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data All Values From</em>'.
   * @generated
   */
  DataAllValuesFrom createDataAllValuesFrom();

  /**
   * Returns a new object of class '<em>Data Some Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Some Values From</em>'.
   * @generated
   */
  DataSomeValuesFrom createDataSomeValuesFrom();

  /**
   * Returns a new object of class '<em>Data Has Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Has Value</em>'.
   * @generated
   */
  DataHasValue createDataHasValue();

  /**
   * Returns a new object of class '<em>Data Min Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Min Cardinality</em>'.
   * @generated
   */
  DataMinCardinality createDataMinCardinality();

  /**
   * Returns a new object of class '<em>Data Max Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Max Cardinality</em>'.
   * @generated
   */
  DataMaxCardinality createDataMaxCardinality();

  /**
   * Returns a new object of class '<em>Data Exact Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Exact Cardinality</em>'.
   * @generated
   */
  DataExactCardinality createDataExactCardinality();

  /**
   * Returns a new object of class '<em>Data Union Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Union Of</em>'.
   * @generated
   */
  DataUnionOf createDataUnionOf();

  /**
   * Returns a new object of class '<em>Data Complement Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Complement Of</em>'.
   * @generated
   */
  DataComplementOf createDataComplementOf();

  /**
   * Returns a new object of class '<em>Data One Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data One Of</em>'.
   * @generated
   */
  DataOneOf createDataOneOf();

  /**
   * Returns a new object of class '<em>Data Intersection Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Intersection Of</em>'.
   * @generated
   */
  DataIntersectionOf createDataIntersectionOf();

  /**
   * Returns a new object of class '<em>Datatype Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype Restriction</em>'.
   * @generated
   */
  DatatypeRestriction createDatatypeRestriction();

  /**
   * Returns a new object of class '<em>Facet Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet Restriction</em>'.
   * @generated
   */
  FacetRestriction createFacetRestriction();

  /**
   * Returns a new object of class '<em>Sub Object Property Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Object Property Of</em>'.
   * @generated
   */
  SubObjectPropertyOf createSubObjectPropertyOf();

  /**
   * Returns a new object of class '<em>Object Property Chain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Chain</em>'.
   * @generated
   */
  ObjectPropertyChain createObjectPropertyChain();

  /**
   * Returns a new object of class '<em>Equivalent Object Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equivalent Object Properties</em>'.
   * @generated
   */
  EquivalentObjectProperties createEquivalentObjectProperties();

  /**
   * Returns a new object of class '<em>Disjoint Object Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjoint Object Properties</em>'.
   * @generated
   */
  DisjointObjectProperties createDisjointObjectProperties();

  /**
   * Returns a new object of class '<em>Object Property Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Domain</em>'.
   * @generated
   */
  ObjectPropertyDomain createObjectPropertyDomain();

  /**
   * Returns a new object of class '<em>Object Property Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Range</em>'.
   * @generated
   */
  ObjectPropertyRange createObjectPropertyRange();

  /**
   * Returns a new object of class '<em>Inverse Object Property Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inverse Object Property Atom</em>'.
   * @generated
   */
  InverseObjectPropertyAtom createInverseObjectPropertyAtom();

  /**
   * Returns a new object of class '<em>Functional Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Functional Object Property</em>'.
   * @generated
   */
  FunctionalObjectProperty createFunctionalObjectProperty();

  /**
   * Returns a new object of class '<em>Inverse Functional Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inverse Functional Object Property</em>'.
   * @generated
   */
  InverseFunctionalObjectProperty createInverseFunctionalObjectProperty();

  /**
   * Returns a new object of class '<em>Reflexive Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reflexive Object Property</em>'.
   * @generated
   */
  ReflexiveObjectProperty createReflexiveObjectProperty();

  /**
   * Returns a new object of class '<em>Irreflexive Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Irreflexive Object Property</em>'.
   * @generated
   */
  IrreflexiveObjectProperty createIrreflexiveObjectProperty();

  /**
   * Returns a new object of class '<em>Symmetric Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symmetric Object Property</em>'.
   * @generated
   */
  SymmetricObjectProperty createSymmetricObjectProperty();

  /**
   * Returns a new object of class '<em>Asymmetric Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Asymmetric Object Property</em>'.
   * @generated
   */
  AsymmetricObjectProperty createAsymmetricObjectProperty();

  /**
   * Returns a new object of class '<em>Transitive Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transitive Object Property</em>'.
   * @generated
   */
  TransitiveObjectProperty createTransitiveObjectProperty();

  /**
   * Returns a new object of class '<em>Inverse Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inverse Object Property</em>'.
   * @generated
   */
  InverseObjectProperty createInverseObjectProperty();

  /**
   * Returns a new object of class '<em>Sub Data Property Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Data Property Of</em>'.
   * @generated
   */
  SubDataPropertyOf createSubDataPropertyOf();

  /**
   * Returns a new object of class '<em>Equivalent Data Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equivalent Data Properties</em>'.
   * @generated
   */
  EquivalentDataProperties createEquivalentDataProperties();

  /**
   * Returns a new object of class '<em>Disjoint Data Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjoint Data Properties</em>'.
   * @generated
   */
  DisjointDataProperties createDisjointDataProperties();

  /**
   * Returns a new object of class '<em>Data Property Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Domain</em>'.
   * @generated
   */
  DataPropertyDomain createDataPropertyDomain();

  /**
   * Returns a new object of class '<em>Data Property Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Range</em>'.
   * @generated
   */
  DataPropertyRange createDataPropertyRange();

  /**
   * Returns a new object of class '<em>Functional Data Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Functional Data Property</em>'.
   * @generated
   */
  FunctionalDataProperty createFunctionalDataProperty();

  /**
   * Returns a new object of class '<em>Has Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Key</em>'.
   * @generated
   */
  HasKey createHasKey();

  /**
   * Returns a new object of class '<em>Class Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Declaration</em>'.
   * @generated
   */
  ClassDeclaration createClassDeclaration();

  /**
   * Returns a new object of class '<em>Object Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Declaration</em>'.
   * @generated
   */
  ObjectPropertyDeclaration createObjectPropertyDeclaration();

  /**
   * Returns a new object of class '<em>Datatype Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype Property Declaration</em>'.
   * @generated
   */
  DatatypePropertyDeclaration createDatatypePropertyDeclaration();

  /**
   * Returns a new object of class '<em>Individual Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Individual Declaration</em>'.
   * @generated
   */
  IndividualDeclaration createIndividualDeclaration();

  /**
   * Returns a new object of class '<em>Template Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Parameter</em>'.
   * @generated
   */
  TemplateParameter createTemplateParameter();

  /**
   * Returns a new object of class '<em>Template Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Signature</em>'.
   * @generated
   */
  TemplateSignature createTemplateSignature();

  /**
   * Returns a new object of class '<em>Template Parameter Substitution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Parameter Substitution</em>'.
   * @generated
   */
  TemplateParameterSubstitution createTemplateParameterSubstitution();

  /**
   * Returns a new object of class '<em>Template Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Binding</em>'.
   * @generated
   */
  TemplateBinding createTemplateBinding();

  /**
   * Returns a new object of class '<em>Direct Class Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Class Assertion</em>'.
   * @generated
   */
  DirectClassAssertion createDirectClassAssertion();

  /**
   * Returns a new object of class '<em>Direct Sub Class Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Sub Class Of</em>'.
   * @generated
   */
  DirectSubClassOf createDirectSubClassOf();

  /**
   * Returns a new object of class '<em>Strict Sub Class Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Strict Sub Class Of</em>'.
   * @generated
   */
  StrictSubClassOf createStrictSubClassOf();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SparqlmsPackage getSparqlmsPackage();

} //SparqlmsFactory
