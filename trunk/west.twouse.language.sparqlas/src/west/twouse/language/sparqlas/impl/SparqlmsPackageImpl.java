/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import west.twouse.language.sparqlas.AbbreviatedIRI;
import west.twouse.language.sparqlas.AbstractLiteral;
import west.twouse.language.sparqlas.AnonymousIndividual;
import west.twouse.language.sparqlas.AskQuery;
import west.twouse.language.sparqlas.Assertion;
import west.twouse.language.sparqlas.AsymmetricObjectProperty;
import west.twouse.language.sparqlas.Atom;
import west.twouse.language.sparqlas.ClassAssertion;
import west.twouse.language.sparqlas.ClassAtom;
import west.twouse.language.sparqlas.ClassDeclaration;
import west.twouse.language.sparqlas.ClassExpression;
import west.twouse.language.sparqlas.ClassVariable;
import west.twouse.language.sparqlas.Constant;
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
import west.twouse.language.sparqlas.DataPropertyAtom;
import west.twouse.language.sparqlas.DataPropertyDomain;
import west.twouse.language.sparqlas.DataPropertyExpression;
import west.twouse.language.sparqlas.DataPropertyRange;
import west.twouse.language.sparqlas.DataPropertyVariable;
import west.twouse.language.sparqlas.DataRange;
import west.twouse.language.sparqlas.DataSomeValuesFrom;
import west.twouse.language.sparqlas.DataUnionOf;
import west.twouse.language.sparqlas.Datatype;
import west.twouse.language.sparqlas.DatatypePropertyDeclaration;
import west.twouse.language.sparqlas.DatatypeRestriction;
import west.twouse.language.sparqlas.Declaration;
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
import west.twouse.language.sparqlas.Expression;
import west.twouse.language.sparqlas.FacetRestriction;
import west.twouse.language.sparqlas.FullIRI;
import west.twouse.language.sparqlas.FunctionalDataProperty;
import west.twouse.language.sparqlas.FunctionalObjectProperty;
import west.twouse.language.sparqlas.HasKey;
import west.twouse.language.sparqlas.Import;
import west.twouse.language.sparqlas.Individual;
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
import west.twouse.language.sparqlas.ObjectPropertyAtom;
import west.twouse.language.sparqlas.ObjectPropertyChain;
import west.twouse.language.sparqlas.ObjectPropertyDeclaration;
import west.twouse.language.sparqlas.ObjectPropertyDomain;
import west.twouse.language.sparqlas.ObjectPropertyExpression;
import west.twouse.language.sparqlas.ObjectPropertyRange;
import west.twouse.language.sparqlas.ObjectPropertyVariable;
import west.twouse.language.sparqlas.ObjectSomeValuesFrom;
import west.twouse.language.sparqlas.ObjectUnionOf;
import west.twouse.language.sparqlas.OntologyDocument;
import west.twouse.language.sparqlas.ParameterableElement;
import west.twouse.language.sparqlas.PrefixDefinition;
import west.twouse.language.sparqlas.Query;
import west.twouse.language.sparqlas.ReflexiveObjectProperty;
import west.twouse.language.sparqlas.SameIndividual;
import west.twouse.language.sparqlas.SelectQuery;
import west.twouse.language.sparqlas.SparqlmsFactory;
import west.twouse.language.sparqlas.SparqlmsPackage;
import west.twouse.language.sparqlas.StrictSubClassOf;
import west.twouse.language.sparqlas.SubClassOf;
import west.twouse.language.sparqlas.SubDataPropertyOf;
import west.twouse.language.sparqlas.SubObjectPropertyOf;
import west.twouse.language.sparqlas.SymmetricObjectProperty;
import west.twouse.language.sparqlas.TemplateBinding;
import west.twouse.language.sparqlas.TemplateParameter;
import west.twouse.language.sparqlas.TemplateParameterSubstitution;
import west.twouse.language.sparqlas.TemplateSignature;
import west.twouse.language.sparqlas.TemplateableElement;
import west.twouse.language.sparqlas.Term;
import west.twouse.language.sparqlas.TransitiveObjectProperty;
import west.twouse.language.sparqlas.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SparqlmsPackageImpl extends EPackageImpl implements SparqlmsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ontologyDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass askQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass describeQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iriEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fullIRIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abbreviatedIRIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass individualVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

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
  private EClass datatypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass individualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedIndividualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anonymousIndividualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeObjectPropertyAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeDataPropertyAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sameIndividualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass differentIndividualsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subClassOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equivalentClassesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjointClassesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjointUnionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectUnionOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectComplementOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectOneOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectIntersectionOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectAllValuesFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectSomeValuesFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectHasValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectMinCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectMaxCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectExactCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataAllValuesFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataSomeValuesFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataHasValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataMinCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataMaxCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataExactCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataUnionOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataComplementOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataOneOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataIntersectionOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datatypeRestrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetRestrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subObjectPropertyOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyChainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equivalentObjectPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjointObjectPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyDomainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inverseObjectPropertyAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionalObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inverseFunctionalObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reflexiveObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass irreflexiveObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symmetricObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asymmetricObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitiveObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inverseObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subDataPropertyOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equivalentDataPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjointDataPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyDomainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionalDataPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasKeyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datatypePropertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass individualDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateSignatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateParameterSubstitutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directClassAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directSubClassOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strictSubClassOfEClass = null;

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
   * @see west.twouse.language.sparqlas.SparqlmsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SparqlmsPackageImpl()
  {
    super(eNS_URI, SparqlmsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SparqlmsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SparqlmsPackage init()
  {
    if (isInited) return (SparqlmsPackage)EPackage.Registry.INSTANCE.getEPackage(SparqlmsPackage.eNS_URI);

    // Obtain or create and register package
    SparqlmsPackageImpl theSparqlmsPackage = (SparqlmsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SparqlmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SparqlmsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSparqlmsPackage.createPackageContents();

    // Initialize created meta-data
    theSparqlmsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSparqlmsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SparqlmsPackage.eNS_URI, theSparqlmsPackage);
    return theSparqlmsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOntologyDocument()
  {
    return ontologyDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntologyDocument_QueryIRI()
  {
    return (EReference)ontologyDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntologyDocument_Import()
  {
    return (EReference)ontologyDocumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntologyDocument_PrefixDefinition()
  {
    return (EReference)ontologyDocumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntologyDocument_Query()
  {
    return (EReference)ontologyDocumentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImport_ImportIRI()
  {
    return (EReference)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefixDefinition()
  {
    return prefixDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefixDefinition_Pref()
  {
    return (EAttribute)prefixDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrefixDefinition_Namespace()
  {
    return (EReference)prefixDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuery()
  {
    return queryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectQuery()
  {
    return selectQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectQuery_Atoms()
  {
    return (EReference)selectQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructQuery()
  {
    return constructQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructQuery_ConstructAtoms()
  {
    return (EReference)constructQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructQuery_WhereAtoms()
  {
    return (EReference)constructQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAskQuery()
  {
    return askQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAskQuery_Atoms()
  {
    return (EReference)askQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescribeQuery()
  {
    return describeQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescribeQuery_DescribeIRI()
  {
    return (EReference)describeQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescribeQuery_Atoms()
  {
    return (EReference)describeQueryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIRI()
  {
    return iriEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIRI_Id()
  {
    return (EAttribute)iriEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFullIRI()
  {
    return fullIRIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbbreviatedIRI()
  {
    return abbreviatedIRIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Symbol()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassVariable()
  {
    return classVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyVariable()
  {
    return objectPropertyVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyVariable()
  {
    return dataPropertyVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndividualVariable()
  {
    return individualVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_ConstantIRI()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatype()
  {
    return datatypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectProperty()
  {
    return objectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataProperty()
  {
    return dataPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndividual()
  {
    return individualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedIndividual()
  {
    return namedIndividualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnonymousIndividual()
  {
    return anonymousIndividualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnonymousIndividual_NodeID()
  {
    return (EAttribute)anonymousIndividualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractLiteral()
  {
    return abstractLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralVariable()
  {
    return literalVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_LexicalForm()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_Datatype()
  {
    return (EReference)literalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtom()
  {
    return atomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssertion()
  {
    return assertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassAssertion()
  {
    return classAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassAssertion_Individual()
  {
    return (EReference)classAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassAssertion_ClassExpression()
  {
    return (EReference)classAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyAssertion()
  {
    return objectPropertyAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyAssertion_SourceIndividual()
  {
    return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyAssertion_TargetIndividual()
  {
    return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyAssertion_ObjectPropertyExpression()
  {
    return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyAssertion()
  {
    return dataPropertyAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyAssertion_SourceIndividual()
  {
    return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyAssertion_TargetValue()
  {
    return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyAssertion_DataPropertyExpression()
  {
    return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegativeObjectPropertyAssertion()
  {
    return negativeObjectPropertyAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeObjectPropertyAssertion_SourceIndividual()
  {
    return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeObjectPropertyAssertion_TargetIndividual()
  {
    return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeObjectPropertyAssertion_ObjectPropertyExpression()
  {
    return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegativeDataPropertyAssertion()
  {
    return negativeDataPropertyAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeDataPropertyAssertion_SourceIndividual()
  {
    return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeDataPropertyAssertion_TargetValue()
  {
    return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeDataPropertyAssertion_DataPropertyExpression()
  {
    return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSameIndividual()
  {
    return sameIndividualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSameIndividual_Individuals()
  {
    return (EReference)sameIndividualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDifferentIndividuals()
  {
    return differentIndividualsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDifferentIndividuals_Individuals()
  {
    return (EReference)differentIndividualsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassAtom()
  {
    return classAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubClassOf()
  {
    return subClassOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubClassOf_SubClassExpression()
  {
    return (EReference)subClassOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubClassOf_SuperClassExpression()
  {
    return (EReference)subClassOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquivalentClasses()
  {
    return equivalentClassesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquivalentClasses_ClassExpressions()
  {
    return (EReference)equivalentClassesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjointClasses()
  {
    return disjointClassesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointClasses_ClassExpressions()
  {
    return (EReference)disjointClassesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjointUnion()
  {
    return disjointUnionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointUnion_Class()
  {
    return (EReference)disjointUnionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointUnion_ClassVariable()
  {
    return (EReference)disjointUnionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointUnion_DisjointClassExpressions()
  {
    return (EReference)disjointUnionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassExpression()
  {
    return classExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectUnionOf()
  {
    return objectUnionOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectUnionOf_ClassExpressions()
  {
    return (EReference)objectUnionOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectComplementOf()
  {
    return objectComplementOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectComplementOf_ClassExpression()
  {
    return (EReference)objectComplementOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectOneOf()
  {
    return objectOneOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectOneOf_Individuals()
  {
    return (EReference)objectOneOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectIntersectionOf()
  {
    return objectIntersectionOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectIntersectionOf_ClassExpressions()
  {
    return (EReference)objectIntersectionOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectAllValuesFrom()
  {
    return objectAllValuesFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectAllValuesFrom_ClassExpression()
  {
    return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectAllValuesFrom_ObjectPropertyExpression()
  {
    return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectSomeValuesFrom()
  {
    return objectSomeValuesFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectSomeValuesFrom_ClassExpression()
  {
    return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectSomeValuesFrom_ObjectPropertyExpression()
  {
    return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectHasValue()
  {
    return objectHasValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectHasValue_Individual()
  {
    return (EReference)objectHasValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectHasValue_ObjectPropertyExpression()
  {
    return (EReference)objectHasValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectMinCardinality()
  {
    return objectMinCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectMinCardinality_Cardinality()
  {
    return (EAttribute)objectMinCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMinCardinality_ClassExpression()
  {
    return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMinCardinality_ObjectPropertyExpression()
  {
    return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectMaxCardinality()
  {
    return objectMaxCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectMaxCardinality_Cardinality()
  {
    return (EAttribute)objectMaxCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMaxCardinality_ClassExpression()
  {
    return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMaxCardinality_ObjectPropertyExpression()
  {
    return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectExactCardinality()
  {
    return objectExactCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectExactCardinality_Cardinality()
  {
    return (EAttribute)objectExactCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectExactCardinality_ClassExpression()
  {
    return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectExactCardinality_ObjectPropertyExpression()
  {
    return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataAllValuesFrom()
  {
    return dataAllValuesFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAllValuesFrom_DataRange()
  {
    return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAllValuesFrom_DataPropertyExpressions()
  {
    return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSomeValuesFrom()
  {
    return dataSomeValuesFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSomeValuesFrom_DataRange()
  {
    return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSomeValuesFrom_DataPropertyExpressions()
  {
    return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataHasValue()
  {
    return dataHasValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataHasValue_Literal()
  {
    return (EReference)dataHasValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataHasValue_DataPropertyExpression()
  {
    return (EReference)dataHasValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataMinCardinality()
  {
    return dataMinCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataMinCardinality_Cardinality()
  {
    return (EAttribute)dataMinCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataMinCardinality_DataRange()
  {
    return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataMinCardinality_DataPropertyExpression()
  {
    return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataMaxCardinality()
  {
    return dataMaxCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataMaxCardinality_Cardinality()
  {
    return (EAttribute)dataMaxCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataMaxCardinality_DataRange()
  {
    return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataMaxCardinality_DataPropertyExpression()
  {
    return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataExactCardinality()
  {
    return dataExactCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataExactCardinality_Cardinality()
  {
    return (EAttribute)dataExactCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataExactCardinality_DataRange()
  {
    return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataExactCardinality_DataPropertyExpression()
  {
    return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataRange()
  {
    return dataRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataUnionOf()
  {
    return dataUnionOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataUnionOf_DataRanges()
  {
    return (EReference)dataUnionOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataComplementOf()
  {
    return dataComplementOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataComplementOf_DataRange()
  {
    return (EReference)dataComplementOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataOneOf()
  {
    return dataOneOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataOneOf_Literals()
  {
    return (EReference)dataOneOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataIntersectionOf()
  {
    return dataIntersectionOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataIntersectionOf_DataRanges()
  {
    return (EReference)dataIntersectionOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatypeRestriction()
  {
    return datatypeRestrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypeRestriction_Datatype()
  {
    return (EReference)datatypeRestrictionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypeRestriction_Restrictions()
  {
    return (EReference)datatypeRestrictionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacetRestriction()
  {
    return facetRestrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetRestriction_ConstrainingFacet()
  {
    return (EReference)facetRestrictionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetRestriction_RestrictionValue()
  {
    return (EReference)facetRestrictionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyAtom()
  {
    return objectPropertyAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubObjectPropertyOf()
  {
    return subObjectPropertyOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubObjectPropertyOf_SubObjectPropertyExpression()
  {
    return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubObjectPropertyOf_SubObjectPropertyChain()
  {
    return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubObjectPropertyOf_SuperObjectPropertyExpression()
  {
    return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyChain()
  {
    return objectPropertyChainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyChain_ObjectPropertyExpression()
  {
    return (EReference)objectPropertyChainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquivalentObjectProperties()
  {
    return equivalentObjectPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquivalentObjectProperties_ObjectPropertyExpression()
  {
    return (EReference)equivalentObjectPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjointObjectProperties()
  {
    return disjointObjectPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointObjectProperties_ObjectPropertyExpression()
  {
    return (EReference)disjointObjectPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyDomain()
  {
    return objectPropertyDomainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyDomain_ObjectPropertyExpression()
  {
    return (EReference)objectPropertyDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyDomain_Domain()
  {
    return (EReference)objectPropertyDomainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyRange()
  {
    return objectPropertyRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyRange_ObjectPropertyExpression()
  {
    return (EReference)objectPropertyRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyRange_Range()
  {
    return (EReference)objectPropertyRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInverseObjectPropertyAtom()
  {
    return inverseObjectPropertyAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInverseObjectPropertyAtom_ObjectPropertyExpression1()
  {
    return (EReference)inverseObjectPropertyAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInverseObjectPropertyAtom_ObjectPropertyExpression2()
  {
    return (EReference)inverseObjectPropertyAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionalObjectProperty()
  {
    return functionalObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionalObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)functionalObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInverseFunctionalObjectProperty()
  {
    return inverseFunctionalObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInverseFunctionalObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)inverseFunctionalObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReflexiveObjectProperty()
  {
    return reflexiveObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReflexiveObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)reflexiveObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIrreflexiveObjectProperty()
  {
    return irreflexiveObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIrreflexiveObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)irreflexiveObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymmetricObjectProperty()
  {
    return symmetricObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymmetricObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)symmetricObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsymmetricObjectProperty()
  {
    return asymmetricObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsymmetricObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)asymmetricObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitiveObjectProperty()
  {
    return transitiveObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitiveObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)transitiveObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyExpression()
  {
    return objectPropertyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInverseObjectProperty()
  {
    return inverseObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInverseObjectProperty_ObjectProperty()
  {
    return (EReference)inverseObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyAtom()
  {
    return dataPropertyAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubDataPropertyOf()
  {
    return subDataPropertyOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubDataPropertyOf_SubDataPropertyExpression()
  {
    return (EReference)subDataPropertyOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubDataPropertyOf_SuperDataPropertyExpression()
  {
    return (EReference)subDataPropertyOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquivalentDataProperties()
  {
    return equivalentDataPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquivalentDataProperties_DataPropertyExpression()
  {
    return (EReference)equivalentDataPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjointDataProperties()
  {
    return disjointDataPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointDataProperties_DataPropertyExpression()
  {
    return (EReference)disjointDataPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyDomain()
  {
    return dataPropertyDomainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyDomain_DataPropertyExpression()
  {
    return (EReference)dataPropertyDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyDomain_Domain()
  {
    return (EReference)dataPropertyDomainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyRange()
  {
    return dataPropertyRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyRange_DataPropertyExpression()
  {
    return (EReference)dataPropertyRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyRange_Range()
  {
    return (EReference)dataPropertyRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionalDataProperty()
  {
    return functionalDataPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionalDataProperty_DataPropertyExpression()
  {
    return (EReference)functionalDataPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyExpression()
  {
    return dataPropertyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasKey()
  {
    return hasKeyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasKey_ClassExpression()
  {
    return (EReference)hasKeyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasKey_ObjectPropertyExpression()
  {
    return (EReference)hasKeyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasKey_DataPropertyExpression()
  {
    return (EReference)hasKeyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDeclaration()
  {
    return classDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDeclaration_Class()
  {
    return (EReference)classDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDeclaration_ClassVariable()
  {
    return (EReference)classDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyDeclaration()
  {
    return objectPropertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyDeclaration_ObjectProperty()
  {
    return (EReference)objectPropertyDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyDeclaration_ObjectPropertyVariable()
  {
    return (EReference)objectPropertyDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatypePropertyDeclaration()
  {
    return datatypePropertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypePropertyDeclaration_DatatypeProperty()
  {
    return (EReference)datatypePropertyDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypePropertyDeclaration_DatatypePropertyVariable()
  {
    return (EReference)datatypePropertyDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndividualDeclaration()
  {
    return individualDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndividualDeclaration_Individual()
  {
    return (EReference)individualDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndividualDeclaration_IndividualVariable()
  {
    return (EReference)individualDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateParameter()
  {
    return templateParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameter_Signature()
  {
    return (EReference)templateParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameter_ParameteredElement()
  {
    return (EReference)templateParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameter_ParameterSubstitution()
  {
    return (EReference)templateParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterableElement()
  {
    return parameterableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterableElement_TemplateParameter()
  {
    return (EReference)parameterableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateSignature()
  {
    return templateSignatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateSignature_OwnedParameter()
  {
    return (EReference)templateSignatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateSignature_Template()
  {
    return (EReference)templateSignatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateableElement()
  {
    return templateableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateableElement_OwnedTemplateSignature()
  {
    return (EReference)templateableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateableElement_TemplateBinding()
  {
    return (EReference)templateableElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateParameterSubstitution()
  {
    return templateParameterSubstitutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameterSubstitution_Actual()
  {
    return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameterSubstitution_TemplateBinding()
  {
    return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameterSubstitution_Formal()
  {
    return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateBinding()
  {
    return templateBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateBinding_ParameterSubstitution()
  {
    return (EReference)templateBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateBinding_BoundElement()
  {
    return (EReference)templateBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateBinding_Signature()
  {
    return (EReference)templateBindingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectClassAssertion()
  {
    return directClassAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectClassAssertion_Individual()
  {
    return (EReference)directClassAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectClassAssertion_ClassExpression()
  {
    return (EReference)directClassAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectSubClassOf()
  {
    return directSubClassOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectSubClassOf_SubClassExpression()
  {
    return (EReference)directSubClassOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectSubClassOf_SuperClassExpression()
  {
    return (EReference)directSubClassOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStrictSubClassOf()
  {
    return strictSubClassOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrictSubClassOf_SubClassExpression()
  {
    return (EReference)strictSubClassOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStrictSubClassOf_SuperClassExpression()
  {
    return (EReference)strictSubClassOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlmsFactory getSparqlmsFactory()
  {
    return (SparqlmsFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    ontologyDocumentEClass = createEClass(ONTOLOGY_DOCUMENT);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__QUERY_IRI);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__IMPORT);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__PREFIX_DEFINITION);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__QUERY);

    importEClass = createEClass(IMPORT);
    createEReference(importEClass, IMPORT__IMPORT_IRI);

    prefixDefinitionEClass = createEClass(PREFIX_DEFINITION);
    createEAttribute(prefixDefinitionEClass, PREFIX_DEFINITION__PREF);
    createEReference(prefixDefinitionEClass, PREFIX_DEFINITION__NAMESPACE);

    queryEClass = createEClass(QUERY);

    selectQueryEClass = createEClass(SELECT_QUERY);
    createEReference(selectQueryEClass, SELECT_QUERY__ATOMS);

    constructQueryEClass = createEClass(CONSTRUCT_QUERY);
    createEReference(constructQueryEClass, CONSTRUCT_QUERY__CONSTRUCT_ATOMS);
    createEReference(constructQueryEClass, CONSTRUCT_QUERY__WHERE_ATOMS);

    askQueryEClass = createEClass(ASK_QUERY);
    createEReference(askQueryEClass, ASK_QUERY__ATOMS);

    describeQueryEClass = createEClass(DESCRIBE_QUERY);
    createEReference(describeQueryEClass, DESCRIBE_QUERY__DESCRIBE_IRI);
    createEReference(describeQueryEClass, DESCRIBE_QUERY__ATOMS);

    iriEClass = createEClass(IRI);
    createEAttribute(iriEClass, IRI__ID);

    fullIRIEClass = createEClass(FULL_IRI);

    abbreviatedIRIEClass = createEClass(ABBREVIATED_IRI);

    termEClass = createEClass(TERM);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__SYMBOL);

    classVariableEClass = createEClass(CLASS_VARIABLE);

    objectPropertyVariableEClass = createEClass(OBJECT_PROPERTY_VARIABLE);

    dataPropertyVariableEClass = createEClass(DATA_PROPERTY_VARIABLE);

    individualVariableEClass = createEClass(INDIVIDUAL_VARIABLE);

    constantEClass = createEClass(CONSTANT);
    createEReference(constantEClass, CONSTANT__CONSTANT_IRI);

    classEClass = createEClass(CLASS);

    datatypeEClass = createEClass(DATATYPE);

    objectPropertyEClass = createEClass(OBJECT_PROPERTY);

    dataPropertyEClass = createEClass(DATA_PROPERTY);

    individualEClass = createEClass(INDIVIDUAL);

    namedIndividualEClass = createEClass(NAMED_INDIVIDUAL);

    anonymousIndividualEClass = createEClass(ANONYMOUS_INDIVIDUAL);
    createEAttribute(anonymousIndividualEClass, ANONYMOUS_INDIVIDUAL__NODE_ID);

    abstractLiteralEClass = createEClass(ABSTRACT_LITERAL);

    literalVariableEClass = createEClass(LITERAL_VARIABLE);

    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__LEXICAL_FORM);
    createEReference(literalEClass, LITERAL__DATATYPE);

    expressionEClass = createEClass(EXPRESSION);

    atomEClass = createEClass(ATOM);

    assertionEClass = createEClass(ASSERTION);

    classAssertionEClass = createEClass(CLASS_ASSERTION);
    createEReference(classAssertionEClass, CLASS_ASSERTION__INDIVIDUAL);
    createEReference(classAssertionEClass, CLASS_ASSERTION__CLASS_EXPRESSION);

    objectPropertyAssertionEClass = createEClass(OBJECT_PROPERTY_ASSERTION);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION);

    dataPropertyAssertionEClass = createEClass(DATA_PROPERTY_ASSERTION);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__TARGET_VALUE);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION);

    negativeObjectPropertyAssertionEClass = createEClass(NEGATIVE_OBJECT_PROPERTY_ASSERTION);
    createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
    createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);
    createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION);

    negativeDataPropertyAssertionEClass = createEClass(NEGATIVE_DATA_PROPERTY_ASSERTION);
    createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
    createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE);
    createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION);

    sameIndividualEClass = createEClass(SAME_INDIVIDUAL);
    createEReference(sameIndividualEClass, SAME_INDIVIDUAL__INDIVIDUALS);

    differentIndividualsEClass = createEClass(DIFFERENT_INDIVIDUALS);
    createEReference(differentIndividualsEClass, DIFFERENT_INDIVIDUALS__INDIVIDUALS);

    classAtomEClass = createEClass(CLASS_ATOM);

    subClassOfEClass = createEClass(SUB_CLASS_OF);
    createEReference(subClassOfEClass, SUB_CLASS_OF__SUB_CLASS_EXPRESSION);
    createEReference(subClassOfEClass, SUB_CLASS_OF__SUPER_CLASS_EXPRESSION);

    equivalentClassesEClass = createEClass(EQUIVALENT_CLASSES);
    createEReference(equivalentClassesEClass, EQUIVALENT_CLASSES__CLASS_EXPRESSIONS);

    disjointClassesEClass = createEClass(DISJOINT_CLASSES);
    createEReference(disjointClassesEClass, DISJOINT_CLASSES__CLASS_EXPRESSIONS);

    disjointUnionEClass = createEClass(DISJOINT_UNION);
    createEReference(disjointUnionEClass, DISJOINT_UNION__CLASS);
    createEReference(disjointUnionEClass, DISJOINT_UNION__CLASS_VARIABLE);
    createEReference(disjointUnionEClass, DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS);

    classExpressionEClass = createEClass(CLASS_EXPRESSION);

    objectUnionOfEClass = createEClass(OBJECT_UNION_OF);
    createEReference(objectUnionOfEClass, OBJECT_UNION_OF__CLASS_EXPRESSIONS);

    objectComplementOfEClass = createEClass(OBJECT_COMPLEMENT_OF);
    createEReference(objectComplementOfEClass, OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION);

    objectOneOfEClass = createEClass(OBJECT_ONE_OF);
    createEReference(objectOneOfEClass, OBJECT_ONE_OF__INDIVIDUALS);

    objectIntersectionOfEClass = createEClass(OBJECT_INTERSECTION_OF);
    createEReference(objectIntersectionOfEClass, OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS);

    objectAllValuesFromEClass = createEClass(OBJECT_ALL_VALUES_FROM);
    createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION);
    createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION);

    objectSomeValuesFromEClass = createEClass(OBJECT_SOME_VALUES_FROM);
    createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION);
    createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION);

    objectHasValueEClass = createEClass(OBJECT_HAS_VALUE);
    createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__INDIVIDUAL);
    createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION);

    objectMinCardinalityEClass = createEClass(OBJECT_MIN_CARDINALITY);
    createEAttribute(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__CARDINALITY);
    createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION);
    createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION);

    objectMaxCardinalityEClass = createEClass(OBJECT_MAX_CARDINALITY);
    createEAttribute(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__CARDINALITY);
    createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION);
    createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION);

    objectExactCardinalityEClass = createEClass(OBJECT_EXACT_CARDINALITY);
    createEAttribute(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CARDINALITY);
    createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION);
    createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION);

    dataAllValuesFromEClass = createEClass(DATA_ALL_VALUES_FROM);
    createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__DATA_RANGE);
    createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS);

    dataSomeValuesFromEClass = createEClass(DATA_SOME_VALUES_FROM);
    createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__DATA_RANGE);
    createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS);

    dataHasValueEClass = createEClass(DATA_HAS_VALUE);
    createEReference(dataHasValueEClass, DATA_HAS_VALUE__LITERAL);
    createEReference(dataHasValueEClass, DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION);

    dataMinCardinalityEClass = createEClass(DATA_MIN_CARDINALITY);
    createEAttribute(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__CARDINALITY);
    createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__DATA_RANGE);
    createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION);

    dataMaxCardinalityEClass = createEClass(DATA_MAX_CARDINALITY);
    createEAttribute(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__CARDINALITY);
    createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__DATA_RANGE);
    createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION);

    dataExactCardinalityEClass = createEClass(DATA_EXACT_CARDINALITY);
    createEAttribute(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__CARDINALITY);
    createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__DATA_RANGE);
    createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION);

    dataRangeEClass = createEClass(DATA_RANGE);

    dataUnionOfEClass = createEClass(DATA_UNION_OF);
    createEReference(dataUnionOfEClass, DATA_UNION_OF__DATA_RANGES);

    dataComplementOfEClass = createEClass(DATA_COMPLEMENT_OF);
    createEReference(dataComplementOfEClass, DATA_COMPLEMENT_OF__DATA_RANGE);

    dataOneOfEClass = createEClass(DATA_ONE_OF);
    createEReference(dataOneOfEClass, DATA_ONE_OF__LITERALS);

    dataIntersectionOfEClass = createEClass(DATA_INTERSECTION_OF);
    createEReference(dataIntersectionOfEClass, DATA_INTERSECTION_OF__DATA_RANGES);

    datatypeRestrictionEClass = createEClass(DATATYPE_RESTRICTION);
    createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__DATATYPE);
    createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__RESTRICTIONS);

    facetRestrictionEClass = createEClass(FACET_RESTRICTION);
    createEReference(facetRestrictionEClass, FACET_RESTRICTION__CONSTRAINING_FACET);
    createEReference(facetRestrictionEClass, FACET_RESTRICTION__RESTRICTION_VALUE);

    objectPropertyAtomEClass = createEClass(OBJECT_PROPERTY_ATOM);

    subObjectPropertyOfEClass = createEClass(SUB_OBJECT_PROPERTY_OF);
    createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION);
    createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_CHAIN);
    createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION);

    objectPropertyChainEClass = createEClass(OBJECT_PROPERTY_CHAIN);
    createEReference(objectPropertyChainEClass, OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSION);

    equivalentObjectPropertiesEClass = createEClass(EQUIVALENT_OBJECT_PROPERTIES);
    createEReference(equivalentObjectPropertiesEClass, EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION);

    disjointObjectPropertiesEClass = createEClass(DISJOINT_OBJECT_PROPERTIES);
    createEReference(disjointObjectPropertiesEClass, DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION);

    objectPropertyDomainEClass = createEClass(OBJECT_PROPERTY_DOMAIN);
    createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION);
    createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__DOMAIN);

    objectPropertyRangeEClass = createEClass(OBJECT_PROPERTY_RANGE);
    createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION);
    createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__RANGE);

    inverseObjectPropertyAtomEClass = createEClass(INVERSE_OBJECT_PROPERTY_ATOM);
    createEReference(inverseObjectPropertyAtomEClass, INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION1);
    createEReference(inverseObjectPropertyAtomEClass, INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION2);

    functionalObjectPropertyEClass = createEClass(FUNCTIONAL_OBJECT_PROPERTY);
    createEReference(functionalObjectPropertyEClass, FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    inverseFunctionalObjectPropertyEClass = createEClass(INVERSE_FUNCTIONAL_OBJECT_PROPERTY);
    createEReference(inverseFunctionalObjectPropertyEClass, INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    reflexiveObjectPropertyEClass = createEClass(REFLEXIVE_OBJECT_PROPERTY);
    createEReference(reflexiveObjectPropertyEClass, REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    irreflexiveObjectPropertyEClass = createEClass(IRREFLEXIVE_OBJECT_PROPERTY);
    createEReference(irreflexiveObjectPropertyEClass, IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    symmetricObjectPropertyEClass = createEClass(SYMMETRIC_OBJECT_PROPERTY);
    createEReference(symmetricObjectPropertyEClass, SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    asymmetricObjectPropertyEClass = createEClass(ASYMMETRIC_OBJECT_PROPERTY);
    createEReference(asymmetricObjectPropertyEClass, ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    transitiveObjectPropertyEClass = createEClass(TRANSITIVE_OBJECT_PROPERTY);
    createEReference(transitiveObjectPropertyEClass, TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    objectPropertyExpressionEClass = createEClass(OBJECT_PROPERTY_EXPRESSION);

    inverseObjectPropertyEClass = createEClass(INVERSE_OBJECT_PROPERTY);
    createEReference(inverseObjectPropertyEClass, INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY);

    dataPropertyAtomEClass = createEClass(DATA_PROPERTY_ATOM);

    subDataPropertyOfEClass = createEClass(SUB_DATA_PROPERTY_OF);
    createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION);
    createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION);

    equivalentDataPropertiesEClass = createEClass(EQUIVALENT_DATA_PROPERTIES);
    createEReference(equivalentDataPropertiesEClass, EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION);

    disjointDataPropertiesEClass = createEClass(DISJOINT_DATA_PROPERTIES);
    createEReference(disjointDataPropertiesEClass, DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION);

    dataPropertyDomainEClass = createEClass(DATA_PROPERTY_DOMAIN);
    createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION);
    createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__DOMAIN);

    dataPropertyRangeEClass = createEClass(DATA_PROPERTY_RANGE);
    createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION);
    createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__RANGE);

    functionalDataPropertyEClass = createEClass(FUNCTIONAL_DATA_PROPERTY);
    createEReference(functionalDataPropertyEClass, FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION);

    dataPropertyExpressionEClass = createEClass(DATA_PROPERTY_EXPRESSION);

    hasKeyEClass = createEClass(HAS_KEY);
    createEReference(hasKeyEClass, HAS_KEY__CLASS_EXPRESSION);
    createEReference(hasKeyEClass, HAS_KEY__OBJECT_PROPERTY_EXPRESSION);
    createEReference(hasKeyEClass, HAS_KEY__DATA_PROPERTY_EXPRESSION);

    declarationEClass = createEClass(DECLARATION);

    classDeclarationEClass = createEClass(CLASS_DECLARATION);
    createEReference(classDeclarationEClass, CLASS_DECLARATION__CLASS);
    createEReference(classDeclarationEClass, CLASS_DECLARATION__CLASS_VARIABLE);

    objectPropertyDeclarationEClass = createEClass(OBJECT_PROPERTY_DECLARATION);
    createEReference(objectPropertyDeclarationEClass, OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY);
    createEReference(objectPropertyDeclarationEClass, OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE);

    datatypePropertyDeclarationEClass = createEClass(DATATYPE_PROPERTY_DECLARATION);
    createEReference(datatypePropertyDeclarationEClass, DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY);
    createEReference(datatypePropertyDeclarationEClass, DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE);

    individualDeclarationEClass = createEClass(INDIVIDUAL_DECLARATION);
    createEReference(individualDeclarationEClass, INDIVIDUAL_DECLARATION__INDIVIDUAL);
    createEReference(individualDeclarationEClass, INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE);

    templateParameterEClass = createEClass(TEMPLATE_PARAMETER);
    createEReference(templateParameterEClass, TEMPLATE_PARAMETER__SIGNATURE);
    createEReference(templateParameterEClass, TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
    createEReference(templateParameterEClass, TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION);

    parameterableElementEClass = createEClass(PARAMETERABLE_ELEMENT);
    createEReference(parameterableElementEClass, PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);

    templateSignatureEClass = createEClass(TEMPLATE_SIGNATURE);
    createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__OWNED_PARAMETER);
    createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__TEMPLATE);

    templateableElementEClass = createEClass(TEMPLATEABLE_ELEMENT);
    createEReference(templateableElementEClass, TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
    createEReference(templateableElementEClass, TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);

    templateParameterSubstitutionEClass = createEClass(TEMPLATE_PARAMETER_SUBSTITUTION);
    createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
    createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
    createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL);

    templateBindingEClass = createEClass(TEMPLATE_BINDING);
    createEReference(templateBindingEClass, TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
    createEReference(templateBindingEClass, TEMPLATE_BINDING__BOUND_ELEMENT);
    createEReference(templateBindingEClass, TEMPLATE_BINDING__SIGNATURE);

    directClassAssertionEClass = createEClass(DIRECT_CLASS_ASSERTION);
    createEReference(directClassAssertionEClass, DIRECT_CLASS_ASSERTION__INDIVIDUAL);
    createEReference(directClassAssertionEClass, DIRECT_CLASS_ASSERTION__CLASS_EXPRESSION);

    directSubClassOfEClass = createEClass(DIRECT_SUB_CLASS_OF);
    createEReference(directSubClassOfEClass, DIRECT_SUB_CLASS_OF__SUB_CLASS_EXPRESSION);
    createEReference(directSubClassOfEClass, DIRECT_SUB_CLASS_OF__SUPER_CLASS_EXPRESSION);

    strictSubClassOfEClass = createEClass(STRICT_SUB_CLASS_OF);
    createEReference(strictSubClassOfEClass, STRICT_SUB_CLASS_OF__SUB_CLASS_EXPRESSION);
    createEReference(strictSubClassOfEClass, STRICT_SUB_CLASS_OF__SUPER_CLASS_EXPRESSION);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    selectQueryEClass.getESuperTypes().add(this.getQuery());
    selectQueryEClass.getESuperTypes().add(this.getTemplateableElement());
    constructQueryEClass.getESuperTypes().add(this.getQuery());
    constructQueryEClass.getESuperTypes().add(this.getTemplateableElement());
    askQueryEClass.getESuperTypes().add(this.getQuery());
    askQueryEClass.getESuperTypes().add(this.getTemplateableElement());
    describeQueryEClass.getESuperTypes().add(this.getQuery());
    describeQueryEClass.getESuperTypes().add(this.getTemplateableElement());
    fullIRIEClass.getESuperTypes().add(this.getIRI());
    abbreviatedIRIEClass.getESuperTypes().add(this.getIRI());
    variableEClass.getESuperTypes().add(this.getTerm());
    classVariableEClass.getESuperTypes().add(this.getVariable());
    classVariableEClass.getESuperTypes().add(this.getClassExpression());
    objectPropertyVariableEClass.getESuperTypes().add(this.getVariable());
    objectPropertyVariableEClass.getESuperTypes().add(this.getObjectPropertyExpression());
    dataPropertyVariableEClass.getESuperTypes().add(this.getVariable());
    dataPropertyVariableEClass.getESuperTypes().add(this.getDataPropertyExpression());
    individualVariableEClass.getESuperTypes().add(this.getVariable());
    individualVariableEClass.getESuperTypes().add(this.getIndividual());
    constantEClass.getESuperTypes().add(this.getTerm());
    classEClass.getESuperTypes().add(this.getClassExpression());
    classEClass.getESuperTypes().add(this.getConstant());
    datatypeEClass.getESuperTypes().add(this.getConstant());
    datatypeEClass.getESuperTypes().add(this.getDataRange());
    objectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
    objectPropertyEClass.getESuperTypes().add(this.getConstant());
    dataPropertyEClass.getESuperTypes().add(this.getDataPropertyExpression());
    dataPropertyEClass.getESuperTypes().add(this.getConstant());
    namedIndividualEClass.getESuperTypes().add(this.getIndividual());
    namedIndividualEClass.getESuperTypes().add(this.getConstant());
    anonymousIndividualEClass.getESuperTypes().add(this.getIndividual());
    literalVariableEClass.getESuperTypes().add(this.getVariable());
    literalVariableEClass.getESuperTypes().add(this.getAbstractLiteral());
    literalEClass.getESuperTypes().add(this.getAbstractLiteral());
    expressionEClass.getESuperTypes().add(this.getParameterableElement());
    assertionEClass.getESuperTypes().add(this.getAtom());
    classAssertionEClass.getESuperTypes().add(this.getAssertion());
    objectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    dataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    negativeObjectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    negativeDataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    sameIndividualEClass.getESuperTypes().add(this.getAssertion());
    differentIndividualsEClass.getESuperTypes().add(this.getAssertion());
    classAtomEClass.getESuperTypes().add(this.getAtom());
    subClassOfEClass.getESuperTypes().add(this.getClassAtom());
    equivalentClassesEClass.getESuperTypes().add(this.getClassAtom());
    disjointClassesEClass.getESuperTypes().add(this.getClassAtom());
    disjointUnionEClass.getESuperTypes().add(this.getClassAtom());
    classExpressionEClass.getESuperTypes().add(this.getExpression());
    objectUnionOfEClass.getESuperTypes().add(this.getClassExpression());
    objectComplementOfEClass.getESuperTypes().add(this.getClassExpression());
    objectOneOfEClass.getESuperTypes().add(this.getClassExpression());
    objectIntersectionOfEClass.getESuperTypes().add(this.getClassExpression());
    objectAllValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    objectSomeValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    objectHasValueEClass.getESuperTypes().add(this.getClassExpression());
    objectMinCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    objectMaxCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    objectExactCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    dataAllValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    dataSomeValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    dataHasValueEClass.getESuperTypes().add(this.getClassExpression());
    dataMinCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    dataMaxCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    dataExactCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    dataUnionOfEClass.getESuperTypes().add(this.getDataRange());
    dataComplementOfEClass.getESuperTypes().add(this.getDataRange());
    dataOneOfEClass.getESuperTypes().add(this.getDataRange());
    dataIntersectionOfEClass.getESuperTypes().add(this.getDataRange());
    datatypeRestrictionEClass.getESuperTypes().add(this.getDataRange());
    objectPropertyAtomEClass.getESuperTypes().add(this.getAtom());
    subObjectPropertyOfEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    equivalentObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    disjointObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    objectPropertyDomainEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    objectPropertyRangeEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    inverseObjectPropertyAtomEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    functionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    inverseFunctionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    reflexiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    irreflexiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    symmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    asymmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    transitiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    objectPropertyExpressionEClass.getESuperTypes().add(this.getExpression());
    inverseObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
    dataPropertyAtomEClass.getESuperTypes().add(this.getAtom());
    subDataPropertyOfEClass.getESuperTypes().add(this.getDataPropertyAtom());
    equivalentDataPropertiesEClass.getESuperTypes().add(this.getDataPropertyAtom());
    disjointDataPropertiesEClass.getESuperTypes().add(this.getDataPropertyAtom());
    dataPropertyDomainEClass.getESuperTypes().add(this.getDataPropertyAtom());
    dataPropertyRangeEClass.getESuperTypes().add(this.getDataPropertyAtom());
    functionalDataPropertyEClass.getESuperTypes().add(this.getDataPropertyAtom());
    dataPropertyExpressionEClass.getESuperTypes().add(this.getExpression());
    hasKeyEClass.getESuperTypes().add(this.getAtom());
    declarationEClass.getESuperTypes().add(this.getAtom());
    classDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    objectPropertyDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    datatypePropertyDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    individualDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    directClassAssertionEClass.getESuperTypes().add(this.getAssertion());
    directSubClassOfEClass.getESuperTypes().add(this.getClassAtom());
    strictSubClassOfEClass.getESuperTypes().add(this.getClassAtom());

    // Initialize classes and features; add operations and parameters
    initEClass(ontologyDocumentEClass, OntologyDocument.class, "OntologyDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOntologyDocument_QueryIRI(), this.getIRI(), null, "queryIRI", null, 0, 1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getOntologyDocument_Import(), this.getImport(), null, "import", null, 0, -1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntologyDocument_PrefixDefinition(), this.getPrefixDefinition(), null, "prefixDefinition", null, 0, -1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getOntologyDocument_Query(), this.getQuery(), null, "query", null, 1, 1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImport_ImportIRI(), this.getIRI(), null, "importIRI", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefixDefinitionEClass, PrefixDefinition.class, "PrefixDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrefixDefinition_Pref(), ecorePackage.getEString(), "pref", null, 0, 1, PrefixDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPrefixDefinition_Namespace(), this.getFullIRI(), null, "namespace", null, 1, 1, PrefixDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(queryEClass, Query.class, "Query", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectQueryEClass, SelectQuery.class, "SelectQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectQuery_Atoms(), this.getAtom(), null, "atoms", null, 0, -1, SelectQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructQueryEClass, ConstructQuery.class, "ConstructQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstructQuery_ConstructAtoms(), this.getAtom(), null, "constructAtoms", null, 0, -1, ConstructQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructQuery_WhereAtoms(), this.getAtom(), null, "whereAtoms", null, 0, -1, ConstructQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(askQueryEClass, AskQuery.class, "AskQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAskQuery_Atoms(), this.getAtom(), null, "atoms", null, 0, -1, AskQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(describeQueryEClass, DescribeQuery.class, "DescribeQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescribeQuery_DescribeIRI(), this.getIRI(), null, "describeIRI", null, 0, 1, DescribeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDescribeQuery_Atoms(), this.getAtom(), null, "atoms", null, 0, -1, DescribeQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iriEClass, west.twouse.language.sparqlas.IRI.class, "IRI", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIRI_Id(), ecorePackage.getEString(), "id", null, 1, 1, west.twouse.language.sparqlas.IRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(fullIRIEClass, FullIRI.class, "FullIRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abbreviatedIRIEClass, AbbreviatedIRI.class, "AbbreviatedIRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Symbol(), ecorePackage.getEString(), "symbol", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classVariableEClass, ClassVariable.class, "ClassVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyVariableEClass, ObjectPropertyVariable.class, "ObjectPropertyVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataPropertyVariableEClass, DataPropertyVariable.class, "DataPropertyVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(individualVariableEClass, IndividualVariable.class, "IndividualVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstant_ConstantIRI(), this.getIRI(), null, "constantIRI", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classEClass, west.twouse.language.sparqlas.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(individualEClass, Individual.class, "Individual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedIndividualEClass, NamedIndividual.class, "NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anonymousIndividualEClass, AnonymousIndividual.class, "AnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnonymousIndividual_NodeID(), ecorePackage.getEString(), "nodeID", null, 1, 1, AnonymousIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(abstractLiteralEClass, AbstractLiteral.class, "AbstractLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalVariableEClass, LiteralVariable.class, "LiteralVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteral_LexicalForm(), ecorePackage.getEString(), "lexicalForm", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getLiteral_Datatype(), this.getDatatype(), null, "datatype", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atomEClass, Atom.class, "Atom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classAssertionEClass, ClassAssertion.class, "ClassAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassAssertion_Individual(), this.getIndividual(), null, "individual", null, 1, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClassAssertion_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyAssertionEClass, ObjectPropertyAssertion.class, "ObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyAssertion_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyAssertionEClass, DataPropertyAssertion.class, "DataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataPropertyAssertion_TargetValue(), this.getAbstractLiteral(), null, "targetValue", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataPropertyAssertion_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(negativeObjectPropertyAssertionEClass, NegativeObjectPropertyAssertion.class, "NegativeObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegativeObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeObjectPropertyAssertion_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(negativeDataPropertyAssertionEClass, NegativeDataPropertyAssertion.class, "NegativeDataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegativeDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeDataPropertyAssertion_TargetValue(), this.getAbstractLiteral(), null, "targetValue", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeDataPropertyAssertion_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(sameIndividualEClass, SameIndividual.class, "SameIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSameIndividual_Individuals(), this.getIndividual(), null, "individuals", null, 2, -1, SameIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(differentIndividualsEClass, DifferentIndividuals.class, "DifferentIndividuals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDifferentIndividuals_Individuals(), this.getIndividual(), null, "individuals", null, 2, -1, DifferentIndividuals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classAtomEClass, ClassAtom.class, "ClassAtom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subClassOfEClass, SubClassOf.class, "SubClassOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubClassOf_SubClassExpression(), this.getClassExpression(), null, "subClassExpression", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubClassOf_SuperClassExpression(), this.getClassExpression(), null, "superClassExpression", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(equivalentClassesEClass, EquivalentClasses.class, "EquivalentClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentClasses_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, EquivalentClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointClassesEClass, DisjointClasses.class, "DisjointClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointClasses_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, DisjointClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointUnionEClass, DisjointUnion.class, "DisjointUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointUnion_Class(), this.getClass_(), null, "class", null, 0, 1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisjointUnion_ClassVariable(), this.getClassVariable(), null, "classVariable", null, 0, 1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisjointUnion_DisjointClassExpressions(), this.getClassExpression(), null, "disjointClassExpressions", null, 2, -1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classExpressionEClass, ClassExpression.class, "ClassExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectUnionOfEClass, ObjectUnionOf.class, "ObjectUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectUnionOf_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, ObjectUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectComplementOfEClass, ObjectComplementOf.class, "ObjectComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectComplementOf_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectOneOfEClass, ObjectOneOf.class, "ObjectOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectOneOf_Individuals(), this.getIndividual(), null, "individuals", null, 1, -1, ObjectOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectIntersectionOfEClass, ObjectIntersectionOf.class, "ObjectIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectIntersectionOf_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, ObjectIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectAllValuesFromEClass, ObjectAllValuesFrom.class, "ObjectAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectAllValuesFrom_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectAllValuesFrom_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectSomeValuesFromEClass, ObjectSomeValuesFrom.class, "ObjectSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectSomeValuesFrom_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectSomeValuesFrom_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectHasValueEClass, ObjectHasValue.class, "ObjectHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectHasValue_Individual(), this.getIndividual(), null, "individual", null, 1, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectHasValue_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectMinCardinalityEClass, ObjectMinCardinality.class, "ObjectMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMinCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMinCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectMaxCardinalityEClass, ObjectMaxCardinality.class, "ObjectMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMaxCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMaxCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectExactCardinalityEClass, ObjectExactCardinality.class, "ObjectExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectExactCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectExactCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataAllValuesFromEClass, DataAllValuesFrom.class, "DataAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataAllValuesFrom_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataAllValuesFrom_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, -1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataSomeValuesFromEClass, DataSomeValuesFrom.class, "DataSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataSomeValuesFrom_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataSomeValuesFrom_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, -1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataHasValueEClass, DataHasValue.class, "DataHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataHasValue_Literal(), this.getAbstractLiteral(), null, "literal", null, 1, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataHasValue_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataMinCardinalityEClass, DataMinCardinality.class, "DataMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataMinCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataMinCardinality_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataMaxCardinalityEClass, DataMaxCardinality.class, "DataMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataMaxCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataMaxCardinality_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataExactCardinalityEClass, DataExactCardinality.class, "DataExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataExactCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataExactCardinality_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataRangeEClass, DataRange.class, "DataRange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataUnionOfEClass, DataUnionOf.class, "DataUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataUnionOf_DataRanges(), this.getDataRange(), null, "dataRanges", null, 2, -1, DataUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataComplementOfEClass, DataComplementOf.class, "DataComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataComplementOf_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataOneOfEClass, DataOneOf.class, "DataOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataOneOf_Literals(), this.getAbstractLiteral(), null, "literals", null, 1, -1, DataOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataIntersectionOfEClass, DataIntersectionOf.class, "DataIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataIntersectionOf_DataRanges(), this.getDataRange(), null, "dataRanges", null, 2, -1, DataIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datatypeRestrictionEClass, DatatypeRestriction.class, "DatatypeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatatypeRestriction_Datatype(), this.getDatatype(), null, "datatype", null, 1, 1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatatypeRestriction_Restrictions(), this.getFacetRestriction(), null, "restrictions", null, 1, -1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(facetRestrictionEClass, FacetRestriction.class, "FacetRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFacetRestriction_ConstrainingFacet(), this.getIRI(), null, "constrainingFacet", null, 1, 1, FacetRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFacetRestriction_RestrictionValue(), this.getAbstractLiteral(), null, "restrictionValue", null, 1, 1, FacetRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectPropertyAtomEClass, ObjectPropertyAtom.class, "ObjectPropertyAtom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subObjectPropertyOfEClass, SubObjectPropertyOf.class, "SubObjectPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubObjectPropertyOf_SubObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "subObjectPropertyExpression", null, 0, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubObjectPropertyOf_SubObjectPropertyChain(), this.getObjectPropertyChain(), null, "subObjectPropertyChain", null, 0, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubObjectPropertyOf_SuperObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "superObjectPropertyExpression", null, 1, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectPropertyChainEClass, ObjectPropertyChain.class, "ObjectPropertyChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyChain_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 2, -1, ObjectPropertyChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(equivalentObjectPropertiesEClass, EquivalentObjectProperties.class, "EquivalentObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentObjectProperties_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 2, -1, EquivalentObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointObjectPropertiesEClass, DisjointObjectProperties.class, "DisjointObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointObjectProperties_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 2, -1, DisjointObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyDomainEClass, ObjectPropertyDomain.class, "ObjectPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyDomain_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyDomain_Domain(), this.getClassExpression(), null, "domain", null, 1, 1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectPropertyRangeEClass, ObjectPropertyRange.class, "ObjectPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyRange_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyRange_Range(), this.getClassExpression(), null, "range", null, 1, 1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inverseObjectPropertyAtomEClass, InverseObjectPropertyAtom.class, "InverseObjectPropertyAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseObjectPropertyAtom_ObjectPropertyExpression1(), this.getObjectPropertyExpression(), null, "objectPropertyExpression1", null, 1, 1, InverseObjectPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInverseObjectPropertyAtom_ObjectPropertyExpression2(), this.getObjectPropertyExpression(), null, "objectPropertyExpression2", null, 1, 1, InverseObjectPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(functionalObjectPropertyEClass, FunctionalObjectProperty.class, "FunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionalObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, FunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(inverseFunctionalObjectPropertyEClass, InverseFunctionalObjectProperty.class, "InverseFunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseFunctionalObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, InverseFunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(reflexiveObjectPropertyEClass, ReflexiveObjectProperty.class, "ReflexiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReflexiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ReflexiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(irreflexiveObjectPropertyEClass, IrreflexiveObjectProperty.class, "IrreflexiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIrreflexiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, IrreflexiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(symmetricObjectPropertyEClass, SymmetricObjectProperty.class, "SymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSymmetricObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, SymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(asymmetricObjectPropertyEClass, AsymmetricObjectProperty.class, "AsymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAsymmetricObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, AsymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(transitiveObjectPropertyEClass, TransitiveObjectProperty.class, "TransitiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, TransitiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyExpressionEClass, ObjectPropertyExpression.class, "ObjectPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inverseObjectPropertyEClass, InverseObjectProperty.class, "InverseObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseObjectProperty_ObjectProperty(), this.getObjectPropertyExpression(), null, "objectProperty", null, 1, 1, InverseObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyAtomEClass, DataPropertyAtom.class, "DataPropertyAtom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subDataPropertyOfEClass, SubDataPropertyOf.class, "SubDataPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubDataPropertyOf_SubDataPropertyExpression(), this.getDataPropertyExpression(), null, "subDataPropertyExpression", null, 1, 1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubDataPropertyOf_SuperDataPropertyExpression(), this.getDataPropertyExpression(), null, "superDataPropertyExpression", null, 1, 1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equivalentDataPropertiesEClass, EquivalentDataProperties.class, "EquivalentDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentDataProperties_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 2, -1, EquivalentDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disjointDataPropertiesEClass, DisjointDataProperties.class, "DisjointDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointDataProperties_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 2, -1, DisjointDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataPropertyDomainEClass, DataPropertyDomain.class, "DataPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropertyDomain_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataPropertyDomain_Domain(), this.getClassExpression(), null, "domain", null, 1, 1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataPropertyRangeEClass, DataPropertyRange.class, "DataPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropertyRange_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataPropertyRange_Range(), this.getDataRange(), null, "range", null, 1, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionalDataPropertyEClass, FunctionalDataProperty.class, "FunctionalDataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionalDataProperty_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, FunctionalDataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataPropertyExpressionEClass, DataPropertyExpression.class, "DataPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(hasKeyEClass, HasKey.class, "HasKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHasKey_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, HasKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getHasKey_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 0, -1, HasKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getHasKey_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 0, -1, HasKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassDeclaration_Class(), this.getClass_(), null, "class", null, 0, 1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDeclaration_ClassVariable(), this.getClassVariable(), null, "classVariable", null, 0, 1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectPropertyDeclarationEClass, ObjectPropertyDeclaration.class, "ObjectPropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyDeclaration_ObjectProperty(), this.getObjectProperty(), null, "objectProperty", null, 0, 1, ObjectPropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectPropertyDeclaration_ObjectPropertyVariable(), this.getObjectPropertyVariable(), null, "objectPropertyVariable", null, 0, 1, ObjectPropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datatypePropertyDeclarationEClass, DatatypePropertyDeclaration.class, "DatatypePropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatatypePropertyDeclaration_DatatypeProperty(), this.getDataProperty(), null, "datatypeProperty", null, 0, 1, DatatypePropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatatypePropertyDeclaration_DatatypePropertyVariable(), this.getDataPropertyVariable(), null, "datatypePropertyVariable", null, 0, 1, DatatypePropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(individualDeclarationEClass, IndividualDeclaration.class, "IndividualDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndividualDeclaration_Individual(), this.getNamedIndividual(), null, "individual", null, 0, 1, IndividualDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndividualDeclaration_IndividualVariable(), this.getIndividualVariable(), null, "individualVariable", null, 0, 1, IndividualDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateParameterEClass, TemplateParameter.class, "TemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateParameter_Signature(), this.getTemplateSignature(), this.getTemplateSignature_OwnedParameter(), "signature", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameter_ParameteredElement(), this.getParameterableElement(), this.getParameterableElement_TemplateParameter(), "parameteredElement", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameter_ParameterSubstitution(), this.getTemplateParameterSubstitution(), null, "parameterSubstitution", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterableElementEClass, ParameterableElement.class, "ParameterableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterableElement_TemplateParameter(), this.getTemplateParameter(), this.getTemplateParameter_ParameteredElement(), "templateParameter", null, 0, 1, ParameterableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateSignatureEClass, TemplateSignature.class, "TemplateSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateSignature_OwnedParameter(), this.getTemplateParameter(), this.getTemplateParameter_Signature(), "ownedParameter", null, 1, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateSignature_Template(), this.getTemplateableElement(), this.getTemplateableElement_OwnedTemplateSignature(), "template", null, 1, 1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateableElementEClass, TemplateableElement.class, "TemplateableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateableElement_OwnedTemplateSignature(), this.getTemplateSignature(), this.getTemplateSignature_Template(), "ownedTemplateSignature", null, 0, 1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateableElement_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_BoundElement(), "templateBinding", null, 0, -1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateParameterSubstitutionEClass, TemplateParameterSubstitution.class, "TemplateParameterSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateParameterSubstitution_Actual(), this.getParameterableElement(), null, "actual", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameterSubstitution_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_ParameterSubstitution(), "templateBinding", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameterSubstitution_Formal(), this.getParameterableElement(), null, "formal", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateBindingEClass, TemplateBinding.class, "TemplateBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateBinding_ParameterSubstitution(), this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_TemplateBinding(), "parameterSubstitution", null, 1, -1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateBinding_BoundElement(), this.getTemplateableElement(), this.getTemplateableElement_TemplateBinding(), "boundElement", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateBinding_Signature(), this.getTemplateSignature(), null, "signature", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directClassAssertionEClass, DirectClassAssertion.class, "DirectClassAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDirectClassAssertion_Individual(), this.getIndividual(), null, "individual", null, 1, 1, DirectClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDirectClassAssertion_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, DirectClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(directSubClassOfEClass, DirectSubClassOf.class, "DirectSubClassOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDirectSubClassOf_SubClassExpression(), this.getClassExpression(), null, "subClassExpression", null, 1, 1, DirectSubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDirectSubClassOf_SuperClassExpression(), this.getClassExpression(), null, "superClassExpression", null, 1, 1, DirectSubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(strictSubClassOfEClass, StrictSubClassOf.class, "StrictSubClassOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStrictSubClassOf_SubClassExpression(), this.getClassExpression(), null, "subClassExpression", null, 1, 1, StrictSubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getStrictSubClassOf_SuperClassExpression(), this.getClassExpression(), null, "superClassExpression", null, 1, 1, StrictSubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SparqlmsPackageImpl
