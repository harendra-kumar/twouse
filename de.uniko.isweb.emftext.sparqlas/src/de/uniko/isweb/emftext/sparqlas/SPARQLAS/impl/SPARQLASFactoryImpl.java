/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty;

import org.eclipse.emf.ecore.EClass;
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
public class SPARQLASFactoryImpl extends EFactoryImpl implements SPARQLASFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static SPARQLASFactory init() {
    try
    {
      SPARQLASFactory theSPARQLASFactory = (SPARQLASFactory)EPackage.Registry.INSTANCE.getEFactory("http://west.uni-koblenz.de/SPARQLAS"); 
      if (theSPARQLASFactory != null)
      {
        return theSPARQLASFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SPARQLASFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SPARQLASFactoryImpl() {
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
      case SPARQLASPackage.ONTOLOGY_DOCUMENT: return createOntologyDocument();
      case SPARQLASPackage.PREFIX_DEFINITION: return createPrefixDefinition();
      case SPARQLASPackage.QUERY: return createQuery();
      case SPARQLASPackage.CLASS_VARIABLE: return createClassVariable();
      case SPARQLASPackage.OBJECT_PROPERTY_VARIABLE: return createObjectPropertyVariable();
      case SPARQLASPackage.DATA_PROPERTY_VARIABLE: return createDataPropertyVariable();
      case SPARQLASPackage.INDIVIDUAL_VARIABLE: return createIndividualVariable();
      case SPARQLASPackage.CLASS: return createClass();
      case SPARQLASPackage.DATATYPE: return createDatatype();
      case SPARQLASPackage.OBJECT_PROPERTY: return createObjectProperty();
      case SPARQLASPackage.DATA_PROPERTY: return createDataProperty();
      case SPARQLASPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
      case SPARQLASPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
      case SPARQLASPackage.LITERAL: return createLiteral();
      case SPARQLASPackage.EQUIVALENT_CLASSES: return createEquivalentClasses();
      case SPARQLASPackage.SUB_CLASS_OF: return createSubClassOf();
      case SPARQLASPackage.DISJOINT_CLASSES: return createDisjointClasses();
      case SPARQLASPackage.OBJECT_PROPERTY_ASSERTION: return createObjectPropertyAssertion();
      case SPARQLASPackage.DATA_PROPERTY_ASSERTION: return createDataPropertyAssertion();
      case SPARQLASPackage.CLASS_ASSERTION: return createClassAssertion();
      case SPARQLASPackage.SAME_INDIVIDUAL: return createSameIndividual();
      case SPARQLASPackage.DIFFERENT_INDIVIDUALS: return createDifferentIndividuals();
      case SPARQLASPackage.EQUIVALENT_OBJECT_PROPERTIES: return createEquivalentObjectProperties();
      case SPARQLASPackage.SUB_PROPERTY_OF: return createSubPropertyOf();
      case SPARQLASPackage.INVERSE_OBJECT_PROPERTY: return createInverseObjectProperty();
      case SPARQLASPackage.INVERSE_OBJECT_PROPERTY_ATOM: return createInverseObjectPropertyAtom();
      case SPARQLASPackage.FUNCTIONAL_OBJECT_PROPERTY: return createFunctionalObjectProperty();
      case SPARQLASPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY: return createInverseFunctionalObjectProperty();
      case SPARQLASPackage.TRANSITIVE_OBJECT_PROPERTY: return createTransitiveObjectProperty();
      case SPARQLASPackage.SYMMETRIC_OBJECT_PROPERTY: return createSymmetricObjectProperty();
      case SPARQLASPackage.OBJECT_UNION_OF: return createObjectUnionOf();
      case SPARQLASPackage.OBJECT_COMPLEMENT_OF: return createObjectComplementOf();
      case SPARQLASPackage.OBJECT_ONE_OF: return createObjectOneOf();
      case SPARQLASPackage.OBJECT_INTERSECTION_OF: return createObjectIntersectionOf();
      case SPARQLASPackage.OBJECT_ALL_VALUES_FROM: return createObjectAllValuesFrom();
      case SPARQLASPackage.OBJECT_SOME_VALUES_FROM: return createObjectSomeValuesFrom();
      case SPARQLASPackage.OBJECT_HAS_VALUE: return createObjectHasValue();
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY: return createObjectMinCardinality();
      case SPARQLASPackage.OBJECT_MAX_CARDINALITY: return createObjectMaxCardinality();
      case SPARQLASPackage.OBJECT_EXACT_CARDINALITY: return createObjectExactCardinality();
      case SPARQLASPackage.DATA_HAS_VALUE: return createDataHasValue();
      case SPARQLASPackage.FULL_IRI: return createFullIRI();
      case SPARQLASPackage.ABBREVIATED_IRI: return createAbbreviatedIRI();
      case SPARQLASPackage.OBJECT_PROPERTY_DECLARATION: return createObjectPropertyDeclaration();
      case SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION: return createDatatypePropertyDeclaration();
      case SPARQLASPackage.INDIVIDUAL_DECLARATION: return createIndividualDeclaration();
      case SPARQLASPackage.CLASS_DECLARATION: return createClassDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OntologyDocument createOntologyDocument() {
    OntologyDocumentImpl ontologyDocument = new OntologyDocumentImpl();
    return ontologyDocument;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PrefixDefinition createPrefixDefinition() {
    PrefixDefinitionImpl prefixDefinition = new PrefixDefinitionImpl();
    return prefixDefinition;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Query createQuery() {
    QueryImpl query = new QueryImpl();
    return query;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClassVariable createClassVariable() {
    ClassVariableImpl classVariable = new ClassVariableImpl();
    return classVariable;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectPropertyVariable createObjectPropertyVariable() {
    ObjectPropertyVariableImpl objectPropertyVariable = new ObjectPropertyVariableImpl();
    return objectPropertyVariable;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DataPropertyVariable createDataPropertyVariable() {
    DataPropertyVariableImpl dataPropertyVariable = new DataPropertyVariableImpl();
    return dataPropertyVariable;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IndividualVariable createIndividualVariable() {
    IndividualVariableImpl individualVariable = new IndividualVariableImpl();
    return individualVariable;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class createClass() {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Datatype createDatatype() {
    DatatypeImpl datatype = new DatatypeImpl();
    return datatype;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectProperty createObjectProperty() {
    ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
    return objectProperty;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DataProperty createDataProperty() {
    DataPropertyImpl dataProperty = new DataPropertyImpl();
    return dataProperty;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NamedIndividual createNamedIndividual() {
    NamedIndividualImpl namedIndividual = new NamedIndividualImpl();
    return namedIndividual;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnonymousIndividual createAnonymousIndividual() {
    AnonymousIndividualImpl anonymousIndividual = new AnonymousIndividualImpl();
    return anonymousIndividual;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Literal createLiteral() {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EquivalentClasses createEquivalentClasses() {
    EquivalentClassesImpl equivalentClasses = new EquivalentClassesImpl();
    return equivalentClasses;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SubClassOf createSubClassOf() {
    SubClassOfImpl subClassOf = new SubClassOfImpl();
    return subClassOf;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DisjointClasses createDisjointClasses() {
    DisjointClassesImpl disjointClasses = new DisjointClassesImpl();
    return disjointClasses;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectPropertyAssertion createObjectPropertyAssertion() {
    ObjectPropertyAssertionImpl objectPropertyAssertion = new ObjectPropertyAssertionImpl();
    return objectPropertyAssertion;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DataPropertyAssertion createDataPropertyAssertion() {
    DataPropertyAssertionImpl dataPropertyAssertion = new DataPropertyAssertionImpl();
    return dataPropertyAssertion;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClassAssertion createClassAssertion() {
    ClassAssertionImpl classAssertion = new ClassAssertionImpl();
    return classAssertion;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SameIndividual createSameIndividual() {
    SameIndividualImpl sameIndividual = new SameIndividualImpl();
    return sameIndividual;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DifferentIndividuals createDifferentIndividuals() {
    DifferentIndividualsImpl differentIndividuals = new DifferentIndividualsImpl();
    return differentIndividuals;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EquivalentObjectProperties createEquivalentObjectProperties() {
    EquivalentObjectPropertiesImpl equivalentObjectProperties = new EquivalentObjectPropertiesImpl();
    return equivalentObjectProperties;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SubPropertyOf createSubPropertyOf() {
    SubPropertyOfImpl subPropertyOf = new SubPropertyOfImpl();
    return subPropertyOf;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InverseObjectProperty createInverseObjectProperty() {
    InverseObjectPropertyImpl inverseObjectProperty = new InverseObjectPropertyImpl();
    return inverseObjectProperty;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InverseObjectPropertyAtom createInverseObjectPropertyAtom() {
    InverseObjectPropertyAtomImpl inverseObjectPropertyAtom = new InverseObjectPropertyAtomImpl();
    return inverseObjectPropertyAtom;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FunctionalObjectProperty createFunctionalObjectProperty() {
    FunctionalObjectPropertyImpl functionalObjectProperty = new FunctionalObjectPropertyImpl();
    return functionalObjectProperty;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InverseFunctionalObjectProperty createInverseFunctionalObjectProperty() {
    InverseFunctionalObjectPropertyImpl inverseFunctionalObjectProperty = new InverseFunctionalObjectPropertyImpl();
    return inverseFunctionalObjectProperty;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TransitiveObjectProperty createTransitiveObjectProperty() {
    TransitiveObjectPropertyImpl transitiveObjectProperty = new TransitiveObjectPropertyImpl();
    return transitiveObjectProperty;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SymmetricObjectProperty createSymmetricObjectProperty() {
    SymmetricObjectPropertyImpl symmetricObjectProperty = new SymmetricObjectPropertyImpl();
    return symmetricObjectProperty;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectUnionOf createObjectUnionOf() {
    ObjectUnionOfImpl objectUnionOf = new ObjectUnionOfImpl();
    return objectUnionOf;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectComplementOf createObjectComplementOf() {
    ObjectComplementOfImpl objectComplementOf = new ObjectComplementOfImpl();
    return objectComplementOf;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectOneOf createObjectOneOf() {
    ObjectOneOfImpl objectOneOf = new ObjectOneOfImpl();
    return objectOneOf;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectIntersectionOf createObjectIntersectionOf() {
    ObjectIntersectionOfImpl objectIntersectionOf = new ObjectIntersectionOfImpl();
    return objectIntersectionOf;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectAllValuesFrom createObjectAllValuesFrom() {
    ObjectAllValuesFromImpl objectAllValuesFrom = new ObjectAllValuesFromImpl();
    return objectAllValuesFrom;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectSomeValuesFrom createObjectSomeValuesFrom() {
    ObjectSomeValuesFromImpl objectSomeValuesFrom = new ObjectSomeValuesFromImpl();
    return objectSomeValuesFrom;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectHasValue createObjectHasValue() {
    ObjectHasValueImpl objectHasValue = new ObjectHasValueImpl();
    return objectHasValue;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectMinCardinality createObjectMinCardinality() {
    ObjectMinCardinalityImpl objectMinCardinality = new ObjectMinCardinalityImpl();
    return objectMinCardinality;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectMaxCardinality createObjectMaxCardinality() {
    ObjectMaxCardinalityImpl objectMaxCardinality = new ObjectMaxCardinalityImpl();
    return objectMaxCardinality;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectExactCardinality createObjectExactCardinality() {
    ObjectExactCardinalityImpl objectExactCardinality = new ObjectExactCardinalityImpl();
    return objectExactCardinality;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DataHasValue createDataHasValue() {
    DataHasValueImpl dataHasValue = new DataHasValueImpl();
    return dataHasValue;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FullIRI createFullIRI() {
    FullIRIImpl fullIRI = new FullIRIImpl();
    return fullIRI;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AbbreviatedIRI createAbbreviatedIRI() {
    AbbreviatedIRIImpl abbreviatedIRI = new AbbreviatedIRIImpl();
    return abbreviatedIRI;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObjectPropertyDeclaration createObjectPropertyDeclaration() {
    ObjectPropertyDeclarationImpl objectPropertyDeclaration = new ObjectPropertyDeclarationImpl();
    return objectPropertyDeclaration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DatatypePropertyDeclaration createDatatypePropertyDeclaration() {
    DatatypePropertyDeclarationImpl datatypePropertyDeclaration = new DatatypePropertyDeclarationImpl();
    return datatypePropertyDeclaration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IndividualDeclaration createIndividualDeclaration() {
    IndividualDeclarationImpl individualDeclaration = new IndividualDeclarationImpl();
    return individualDeclaration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ClassDeclaration createClassDeclaration() {
    ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
    return classDeclaration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SPARQLASPackage getSPARQLASPackage() {
    return (SPARQLASPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static SPARQLASPackage getPackage() {
    return SPARQLASPackage.eINSTANCE;
  }

} //SPARQLASFactoryImpl
