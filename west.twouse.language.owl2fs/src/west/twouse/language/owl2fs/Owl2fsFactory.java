/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see west.twouse.language.owl2fs.Owl2fsPackage
 * @generated
 */
public interface Owl2fsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Owl2fsFactory eINSTANCE = west.twouse.language.owl2fs.impl.Owl2fsFactoryImpl.init();

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
   * Returns a new object of class '<em>Ontology Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ontology Document</em>'.
   * @generated
   */
  OntologyDocument createOntologyDocument();

  /**
   * Returns a new object of class '<em>Prefix Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Definition</em>'.
   * @generated
   */
  PrefixDefinition createPrefixDefinition();

  /**
   * Returns a new object of class '<em>Ontology</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ontology</em>'.
   * @generated
   */
  Ontology createOntology();

  /**
   * Returns a new object of class '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment</em>'.
   * @generated
   */
  Comment createComment();

  /**
   * Returns a new object of class '<em>Class Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Declaration</em>'.
   * @generated
   */
  ClassDeclaration createClassDeclaration();

  /**
   * Returns a new object of class '<em>Datatype Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype Declaration</em>'.
   * @generated
   */
  DatatypeDeclaration createDatatypeDeclaration();

  /**
   * Returns a new object of class '<em>Object Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Declaration</em>'.
   * @generated
   */
  ObjectPropertyDeclaration createObjectPropertyDeclaration();

  /**
   * Returns a new object of class '<em>Data Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Declaration</em>'.
   * @generated
   */
  DataPropertyDeclaration createDataPropertyDeclaration();

  /**
   * Returns a new object of class '<em>Annotation Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Property Declaration</em>'.
   * @generated
   */
  AnnotationPropertyDeclaration createAnnotationPropertyDeclaration();

  /**
   * Returns a new object of class '<em>Named Individual Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Individual Declaration</em>'.
   * @generated
   */
  NamedIndividualDeclaration createNamedIndividualDeclaration();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Annotation Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Assertion</em>'.
   * @generated
   */
  AnnotationAssertion createAnnotationAssertion();

  /**
   * Returns a new object of class '<em>Sub Annotation Property Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Annotation Property Of</em>'.
   * @generated
   */
  SubAnnotationPropertyOf createSubAnnotationPropertyOf();

  /**
   * Returns a new object of class '<em>Annotation Property Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Property Domain</em>'.
   * @generated
   */
  AnnotationPropertyDomain createAnnotationPropertyDomain();

  /**
   * Returns a new object of class '<em>Annotation Property Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Property Range</em>'.
   * @generated
   */
  AnnotationPropertyRange createAnnotationPropertyRange();

  /**
   * Returns a new object of class '<em>Annotation Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Property</em>'.
   * @generated
   */
  AnnotationProperty createAnnotationProperty();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Data Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property</em>'.
   * @generated
   */
  DataProperty createDataProperty();

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
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Inverse Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inverse Object Property</em>'.
   * @generated
   */
  InverseObjectProperty createInverseObjectProperty();

  /**
   * Returns a new object of class '<em>Data Intersection Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Intersection Of</em>'.
   * @generated
   */
  DataIntersectionOf createDataIntersectionOf();

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
   * Returns a new object of class '<em>Datatype Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype Restriction</em>'.
   * @generated
   */
  DatatypeRestriction createDatatypeRestriction();

  /**
   * Returns a new object of class '<em>Facet Constraint Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet Constraint Pair</em>'.
   * @generated
   */
  FacetConstraintPair createFacetConstraintPair();

  /**
   * Returns a new object of class '<em>Object Intersection Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Intersection Of</em>'.
   * @generated
   */
  ObjectIntersectionOf createObjectIntersectionOf();

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
   * Returns a new object of class '<em>Object Some Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Some Values From</em>'.
   * @generated
   */
  ObjectSomeValuesFrom createObjectSomeValuesFrom();

  /**
   * Returns a new object of class '<em>Object All Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object All Values From</em>'.
   * @generated
   */
  ObjectAllValuesFrom createObjectAllValuesFrom();

  /**
   * Returns a new object of class '<em>Object Has Self</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Has Self</em>'.
   * @generated
   */
  ObjectHasSelf createObjectHasSelf();

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
   * Returns a new object of class '<em>Data Some Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Some Values From</em>'.
   * @generated
   */
  DataSomeValuesFrom createDataSomeValuesFrom();

  /**
   * Returns a new object of class '<em>Data All Values From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data All Values From</em>'.
   * @generated
   */
  DataAllValuesFrom createDataAllValuesFrom();

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
   * Returns a new object of class '<em>Inverse Object Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inverse Object Properties</em>'.
   * @generated
   */
  InverseObjectProperties createInverseObjectProperties();

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
   * Returns a new object of class '<em>Datatype Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datatype Definition</em>'.
   * @generated
   */
  DatatypeDefinition createDatatypeDefinition();

  /**
   * Returns a new object of class '<em>Has Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has Key</em>'.
   * @generated
   */
  HasKey createHasKey();

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
   * Returns a new object of class '<em>Negative Object Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Object Property Assertion</em>'.
   * @generated
   */
  NegativeObjectPropertyAssertion createNegativeObjectPropertyAssertion();

  /**
   * Returns a new object of class '<em>Data Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Property Assertion</em>'.
   * @generated
   */
  DataPropertyAssertion createDataPropertyAssertion();

  /**
   * Returns a new object of class '<em>Negative Data Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Data Property Assertion</em>'.
   * @generated
   */
  NegativeDataPropertyAssertion createNegativeDataPropertyAssertion();

  /**
   * Returns a new object of class '<em>DL Safe Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DL Safe Rule</em>'.
   * @generated
   */
  DLSafeRule createDLSafeRule();

  /**
   * Returns a new object of class '<em>Class Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Atom</em>'.
   * @generated
   */
  ClassAtom createClassAtom();

  /**
   * Returns a new object of class '<em>Data Range Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Range Atom</em>'.
   * @generated
   */
  DataRangeAtom createDataRangeAtom();

  /**
   * Returns a new object of class '<em>Object Property Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Property Atom</em>'.
   * @generated
   */
  ObjectPropertyAtom createObjectPropertyAtom();

  /**
   * Returns a new object of class '<em>Data Propety Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Propety Atom</em>'.
   * @generated
   */
  DataPropetyAtom createDataPropetyAtom();

  /**
   * Returns a new object of class '<em>Built In Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Atom</em>'.
   * @generated
   */
  BuiltInAtom createBuiltInAtom();

  /**
   * Returns a new object of class '<em>Same Individual Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Same Individual Atom</em>'.
   * @generated
   */
  SameIndividualAtom createSameIndividualAtom();

  /**
   * Returns a new object of class '<em>Different Individuals Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Different Individuals Atom</em>'.
   * @generated
   */
  DifferentIndividualsAtom createDifferentIndividualsAtom();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>DG Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DG Rule</em>'.
   * @generated
   */
  DGRule createDGRule();

  /**
   * Returns a new object of class '<em>DG Axiom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DG Axiom</em>'.
   * @generated
   */
  DGAxiom createDGAxiom();

  /**
   * Returns a new object of class '<em>DG Nodes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DG Nodes</em>'.
   * @generated
   */
  DGNodes createDGNodes();

  /**
   * Returns a new object of class '<em>Node Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Assertion</em>'.
   * @generated
   */
  NodeAssertion createNodeAssertion();

  /**
   * Returns a new object of class '<em>DG Edges</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DG Edges</em>'.
   * @generated
   */
  DGEdges createDGEdges();

  /**
   * Returns a new object of class '<em>Edge Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edge Assertion</em>'.
   * @generated
   */
  EdgeAssertion createEdgeAssertion();

  /**
   * Returns a new object of class '<em>Main Classes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Classes</em>'.
   * @generated
   */
  MainClasses createMainClasses();

  /**
   * Returns a new object of class '<em>Template Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Parameter</em>'.
   * @generated
   */
  TemplateParameter createTemplateParameter();

  /**
   * Returns a new object of class '<em>Parameterable Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameterable Element</em>'.
   * @generated
   */
  ParameterableElement createParameterableElement();

  /**
   * Returns a new object of class '<em>Template Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Signature</em>'.
   * @generated
   */
  TemplateSignature createTemplateSignature();

  /**
   * Returns a new object of class '<em>Templateable Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Templateable Element</em>'.
   * @generated
   */
  TemplateableElement createTemplateableElement();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Classifier Template Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classifier Template Parameter</em>'.
   * @generated
   */
  ClassifierTemplateParameter createClassifierTemplateParameter();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Owl2fsPackage getOwl2fsPackage();

} //Owl2fsFactory
