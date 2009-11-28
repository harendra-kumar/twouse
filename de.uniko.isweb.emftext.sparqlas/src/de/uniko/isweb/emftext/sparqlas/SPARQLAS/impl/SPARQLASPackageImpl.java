/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl;

import de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Assertion;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAtom;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Constant;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Declaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Expression;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual;
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
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAtom;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression;
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
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Term;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SPARQLASPackageImpl extends EPackageImpl implements SPARQLASPackage {
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
	private EClass atomEClass = null;

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
	private EClass literalEClass = null;

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
	private EClass equivalentClassesEClass = null;

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
	private EClass disjointClassesEClass = null;

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
	private EClass assertionEClass = null;

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
	private EClass classAssertionEClass = null;

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
	private EClass equivalentObjectPropertiesEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass subPropertyOfEClass = null;

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
	private EClass transitiveObjectPropertyEClass = null;

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
	private EClass classExpressionEClass = null;

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
	private EClass dataHasValueEClass = null;

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
	private EClass declarationEClass = null;

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
	private EClass classDeclarationEClass = null;

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
	private EClass termEClass = null;

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
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private SPARQLASPackageImpl() {
    super(eNS_URI, SPARQLASFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SPARQLASPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static SPARQLASPackage init() {
    if (isInited) return (SPARQLASPackage)EPackage.Registry.INSTANCE.getEPackage(SPARQLASPackage.eNS_URI);

    // Obtain or create and register package
    SPARQLASPackageImpl theSPARQLASPackage = (SPARQLASPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SPARQLASPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SPARQLASPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSPARQLASPackage.createPackageContents();

    // Initialize created meta-data
    theSPARQLASPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSPARQLASPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SPARQLASPackage.eNS_URI, theSPARQLASPackage);
    return theSPARQLASPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getOntologyDocument() {
    return ontologyDocumentEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getOntologyDocument_PrefixDefinition() {
    return (EReference)ontologyDocumentEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getOntologyDocument_Query() {
    return (EReference)ontologyDocumentEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getPrefixDefinition() {
    return prefixDefinitionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getPrefixDefinition_Pref() {
    return (EAttribute)prefixDefinitionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getPrefixDefinition_Namespace() {
    return (EReference)prefixDefinitionEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getQuery() {
    return queryEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getQuery_QueryIRI() {
    return (EReference)queryEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getQuery_Atoms() {
    return (EReference)queryEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAtom() {
    return atomEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getVariable() {
    return variableEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getVariable_Symbol() {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getClassVariable() {
    return classVariableEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectPropertyVariable() {
    return objectPropertyVariableEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDataPropertyVariable() {
    return dataPropertyVariableEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getIndividualVariable() {
    return individualVariableEClass;
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
	public EClass getDatatype() {
    return datatypeEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectProperty() {
    return objectPropertyEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDataProperty() {
    return dataPropertyEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getIndividual() {
    return individualEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNamedIndividual() {
    return namedIndividualEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAnonymousIndividual() {
    return anonymousIndividualEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAnonymousIndividual_NodeID() {
    return (EAttribute)anonymousIndividualEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getLiteral() {
    return literalEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getLiteral_LexicalForm() {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getLiteral_Datatype() {
    return (EReference)literalEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getClassAtom() {
    return classAtomEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEquivalentClasses() {
    return equivalentClassesEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getEquivalentClasses_ClassExpressions() {
    return (EReference)equivalentClassesEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSubClassOf() {
    return subClassOfEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSubClassOf_SubClassExpression() {
    return (EReference)subClassOfEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSubClassOf_SuperClassExpression() {
    return (EReference)subClassOfEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDisjointClasses() {
    return disjointClassesEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDisjointClasses_ClassExpressions() {
    return (EReference)disjointClassesEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectPropertyAtom() {
    return objectPropertyAtomEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAssertion() {
    return assertionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectPropertyAssertion() {
    return objectPropertyAssertionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectPropertyAssertion_SourceIndividual() {
    return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectPropertyAssertion_TargetIndividual() {
    return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectPropertyAssertion_ObjectPropertyExpression() {
    return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDataPropertyAssertion() {
    return dataPropertyAssertionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDataPropertyAssertion_SourceIndividual() {
    return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDataPropertyAssertion_TargetValue() {
    return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDataPropertyAssertion_DataPropertyExpression() {
    return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getClassAssertion() {
    return classAssertionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getClassAssertion_Individual() {
    return (EReference)classAssertionEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getClassAssertion_ClassExpression() {
    return (EReference)classAssertionEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSameIndividual() {
    return sameIndividualEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSameIndividual_Individuals() {
    return (EReference)sameIndividualEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDifferentIndividuals() {
    return differentIndividualsEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDifferentIndividuals_Individuals() {
    return (EReference)differentIndividualsEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEquivalentObjectProperties() {
    return equivalentObjectPropertiesEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getEquivalentObjectProperties_ObjectPropertyExpression() {
    return (EReference)equivalentObjectPropertiesEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSubPropertyOf() {
    return subPropertyOfEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSubPropertyOf_SubObjectPropertyExpression() {
    return (EReference)subPropertyOfEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSubPropertyOf_SuperObjectPropertyExpression() {
    return (EReference)subPropertyOfEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getExpression() {
    return expressionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectPropertyExpression() {
    return objectPropertyExpressionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getInverseObjectProperty() {
    return inverseObjectPropertyEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getInverseObjectProperty_ObjectProperty() {
    return (EReference)inverseObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getInverseObjectPropertyAtom() {
    return inverseObjectPropertyAtomEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getInverseObjectPropertyAtom_ObjectPropertyExpression1() {
    return (EReference)inverseObjectPropertyAtomEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getInverseObjectPropertyAtom_ObjectPropertyExpression2() {
    return (EReference)inverseObjectPropertyAtomEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getFunctionalObjectProperty() {
    return functionalObjectPropertyEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getFunctionalObjectProperty_ObjectPropertyExpression() {
    return (EReference)functionalObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getInverseFunctionalObjectProperty() {
    return inverseFunctionalObjectPropertyEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getInverseFunctionalObjectProperty_ObjectPropertyExpression() {
    return (EReference)inverseFunctionalObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTransitiveObjectProperty() {
    return transitiveObjectPropertyEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getTransitiveObjectProperty_ObjectPropertyExpression() {
    return (EReference)transitiveObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSymmetricObjectProperty() {
    return symmetricObjectPropertyEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSymmetricObjectProperty_ObjectPropertyExpression() {
    return (EReference)symmetricObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getClassExpression() {
    return classExpressionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDataPropertyExpression() {
    return dataPropertyExpressionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectUnionOf() {
    return objectUnionOfEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectUnionOf_ClassExpressions() {
    return (EReference)objectUnionOfEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectComplementOf() {
    return objectComplementOfEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectComplementOf_ClassExpression() {
    return (EReference)objectComplementOfEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectOneOf() {
    return objectOneOfEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectOneOf_Individuals() {
    return (EReference)objectOneOfEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectIntersectionOf() {
    return objectIntersectionOfEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectIntersectionOf_ClassExpressions() {
    return (EReference)objectIntersectionOfEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectAllValuesFrom() {
    return objectAllValuesFromEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectAllValuesFrom_ClassExpression() {
    return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectAllValuesFrom_ObjectPropertyExpression() {
    return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectSomeValuesFrom() {
    return objectSomeValuesFromEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectSomeValuesFrom_ClassExpression() {
    return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectSomeValuesFrom_ObjectPropertyExpression() {
    return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectHasValue() {
    return objectHasValueEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectHasValue_Individual() {
    return (EReference)objectHasValueEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectHasValue_ObjectPropertyExpression() {
    return (EReference)objectHasValueEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectMinCardinality() {
    return objectMinCardinalityEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getObjectMinCardinality_Cardinality() {
    return (EAttribute)objectMinCardinalityEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectMinCardinality_ClassExpression() {
    return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectMinCardinality_ObjectPropertyExpression() {
    return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectMaxCardinality() {
    return objectMaxCardinalityEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getObjectMaxCardinality_Cardinality() {
    return (EAttribute)objectMaxCardinalityEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectMaxCardinality_ClassExpression() {
    return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectMaxCardinality_ObjectPropertyExpression() {
    return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectExactCardinality() {
    return objectExactCardinalityEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getObjectExactCardinality_Cardinality() {
    return (EAttribute)objectExactCardinalityEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectExactCardinality_ClassExpression() {
    return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectExactCardinality_ObjectPropertyExpression() {
    return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDataHasValue() {
    return dataHasValueEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDataHasValue_Literal() {
    return (EReference)dataHasValueEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDataHasValue_DataPropertyExpression() {
    return (EReference)dataHasValueEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getIRI() {
    return iriEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getIRI_Id() {
    return (EAttribute)iriEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getFullIRI() {
    return fullIRIEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAbbreviatedIRI() {
    return abbreviatedIRIEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDeclaration() {
    return declarationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getObjectPropertyDeclaration() {
    return objectPropertyDeclarationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getObjectPropertyDeclaration_ObjectPropertyVariable() {
    return (EReference)objectPropertyDeclarationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getDatatypePropertyDeclaration() {
    return datatypePropertyDeclarationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getDatatypePropertyDeclaration_DatatypePropertyVariable() {
    return (EReference)datatypePropertyDeclarationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getIndividualDeclaration() {
    return individualDeclarationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getIndividualDeclaration_IndividualVariable() {
    return (EReference)individualDeclarationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getClassDeclaration() {
    return classDeclarationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getClassDeclaration_ClassVariable() {
    return (EReference)classDeclarationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getConstant() {
    return constantEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getConstant_ConstantIRI() {
    return (EReference)constantEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTerm() {
    return termEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SPARQLASFactory getSPARQLASFactory() {
    return (SPARQLASFactory)getEFactoryInstance();
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
    ontologyDocumentEClass = createEClass(ONTOLOGY_DOCUMENT);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__PREFIX_DEFINITION);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__QUERY);

    prefixDefinitionEClass = createEClass(PREFIX_DEFINITION);
    createEAttribute(prefixDefinitionEClass, PREFIX_DEFINITION__PREF);
    createEReference(prefixDefinitionEClass, PREFIX_DEFINITION__NAMESPACE);

    queryEClass = createEClass(QUERY);
    createEReference(queryEClass, QUERY__QUERY_IRI);
    createEReference(queryEClass, QUERY__ATOMS);

    atomEClass = createEClass(ATOM);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__SYMBOL);

    classVariableEClass = createEClass(CLASS_VARIABLE);

    objectPropertyVariableEClass = createEClass(OBJECT_PROPERTY_VARIABLE);

    dataPropertyVariableEClass = createEClass(DATA_PROPERTY_VARIABLE);

    individualVariableEClass = createEClass(INDIVIDUAL_VARIABLE);

    classEClass = createEClass(CLASS);

    datatypeEClass = createEClass(DATATYPE);

    objectPropertyEClass = createEClass(OBJECT_PROPERTY);

    dataPropertyEClass = createEClass(DATA_PROPERTY);

    individualEClass = createEClass(INDIVIDUAL);

    namedIndividualEClass = createEClass(NAMED_INDIVIDUAL);

    anonymousIndividualEClass = createEClass(ANONYMOUS_INDIVIDUAL);
    createEAttribute(anonymousIndividualEClass, ANONYMOUS_INDIVIDUAL__NODE_ID);

    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__LEXICAL_FORM);
    createEReference(literalEClass, LITERAL__DATATYPE);

    classAtomEClass = createEClass(CLASS_ATOM);

    equivalentClassesEClass = createEClass(EQUIVALENT_CLASSES);
    createEReference(equivalentClassesEClass, EQUIVALENT_CLASSES__CLASS_EXPRESSIONS);

    subClassOfEClass = createEClass(SUB_CLASS_OF);
    createEReference(subClassOfEClass, SUB_CLASS_OF__SUB_CLASS_EXPRESSION);
    createEReference(subClassOfEClass, SUB_CLASS_OF__SUPER_CLASS_EXPRESSION);

    disjointClassesEClass = createEClass(DISJOINT_CLASSES);
    createEReference(disjointClassesEClass, DISJOINT_CLASSES__CLASS_EXPRESSIONS);

    objectPropertyAtomEClass = createEClass(OBJECT_PROPERTY_ATOM);

    assertionEClass = createEClass(ASSERTION);

    objectPropertyAssertionEClass = createEClass(OBJECT_PROPERTY_ASSERTION);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION);

    dataPropertyAssertionEClass = createEClass(DATA_PROPERTY_ASSERTION);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__TARGET_VALUE);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION);

    classAssertionEClass = createEClass(CLASS_ASSERTION);
    createEReference(classAssertionEClass, CLASS_ASSERTION__INDIVIDUAL);
    createEReference(classAssertionEClass, CLASS_ASSERTION__CLASS_EXPRESSION);

    sameIndividualEClass = createEClass(SAME_INDIVIDUAL);
    createEReference(sameIndividualEClass, SAME_INDIVIDUAL__INDIVIDUALS);

    differentIndividualsEClass = createEClass(DIFFERENT_INDIVIDUALS);
    createEReference(differentIndividualsEClass, DIFFERENT_INDIVIDUALS__INDIVIDUALS);

    equivalentObjectPropertiesEClass = createEClass(EQUIVALENT_OBJECT_PROPERTIES);
    createEReference(equivalentObjectPropertiesEClass, EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION);

    subPropertyOfEClass = createEClass(SUB_PROPERTY_OF);
    createEReference(subPropertyOfEClass, SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION);
    createEReference(subPropertyOfEClass, SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION);

    expressionEClass = createEClass(EXPRESSION);

    objectPropertyExpressionEClass = createEClass(OBJECT_PROPERTY_EXPRESSION);

    inverseObjectPropertyEClass = createEClass(INVERSE_OBJECT_PROPERTY);
    createEReference(inverseObjectPropertyEClass, INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY);

    inverseObjectPropertyAtomEClass = createEClass(INVERSE_OBJECT_PROPERTY_ATOM);
    createEReference(inverseObjectPropertyAtomEClass, INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION1);
    createEReference(inverseObjectPropertyAtomEClass, INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION2);

    functionalObjectPropertyEClass = createEClass(FUNCTIONAL_OBJECT_PROPERTY);
    createEReference(functionalObjectPropertyEClass, FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    inverseFunctionalObjectPropertyEClass = createEClass(INVERSE_FUNCTIONAL_OBJECT_PROPERTY);
    createEReference(inverseFunctionalObjectPropertyEClass, INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    transitiveObjectPropertyEClass = createEClass(TRANSITIVE_OBJECT_PROPERTY);
    createEReference(transitiveObjectPropertyEClass, TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    symmetricObjectPropertyEClass = createEClass(SYMMETRIC_OBJECT_PROPERTY);
    createEReference(symmetricObjectPropertyEClass, SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    classExpressionEClass = createEClass(CLASS_EXPRESSION);

    dataPropertyExpressionEClass = createEClass(DATA_PROPERTY_EXPRESSION);

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

    dataHasValueEClass = createEClass(DATA_HAS_VALUE);
    createEReference(dataHasValueEClass, DATA_HAS_VALUE__LITERAL);
    createEReference(dataHasValueEClass, DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION);

    iriEClass = createEClass(IRI);
    createEAttribute(iriEClass, IRI__ID);

    fullIRIEClass = createEClass(FULL_IRI);

    abbreviatedIRIEClass = createEClass(ABBREVIATED_IRI);

    declarationEClass = createEClass(DECLARATION);

    objectPropertyDeclarationEClass = createEClass(OBJECT_PROPERTY_DECLARATION);
    createEReference(objectPropertyDeclarationEClass, OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE);

    datatypePropertyDeclarationEClass = createEClass(DATATYPE_PROPERTY_DECLARATION);
    createEReference(datatypePropertyDeclarationEClass, DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE);

    individualDeclarationEClass = createEClass(INDIVIDUAL_DECLARATION);
    createEReference(individualDeclarationEClass, INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE);

    classDeclarationEClass = createEClass(CLASS_DECLARATION);
    createEReference(classDeclarationEClass, CLASS_DECLARATION__CLASS_VARIABLE);

    constantEClass = createEClass(CONSTANT);
    createEReference(constantEClass, CONSTANT__CONSTANT_IRI);

    termEClass = createEClass(TERM);
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
    variableEClass.getESuperTypes().add(this.getTerm());
    classVariableEClass.getESuperTypes().add(this.getVariable());
    classVariableEClass.getESuperTypes().add(this.getClassExpression());
    objectPropertyVariableEClass.getESuperTypes().add(this.getVariable());
    objectPropertyVariableEClass.getESuperTypes().add(this.getObjectPropertyExpression());
    dataPropertyVariableEClass.getESuperTypes().add(this.getVariable());
    dataPropertyVariableEClass.getESuperTypes().add(this.getDataPropertyExpression());
    individualVariableEClass.getESuperTypes().add(this.getVariable());
    individualVariableEClass.getESuperTypes().add(this.getIndividual());
    classEClass.getESuperTypes().add(this.getClassExpression());
    classEClass.getESuperTypes().add(this.getConstant());
    datatypeEClass.getESuperTypes().add(this.getConstant());
    objectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
    objectPropertyEClass.getESuperTypes().add(this.getConstant());
    dataPropertyEClass.getESuperTypes().add(this.getDataPropertyExpression());
    dataPropertyEClass.getESuperTypes().add(this.getConstant());
    namedIndividualEClass.getESuperTypes().add(this.getIndividual());
    namedIndividualEClass.getESuperTypes().add(this.getConstant());
    anonymousIndividualEClass.getESuperTypes().add(this.getIndividual());
    classAtomEClass.getESuperTypes().add(this.getAtom());
    equivalentClassesEClass.getESuperTypes().add(this.getClassAtom());
    subClassOfEClass.getESuperTypes().add(this.getClassAtom());
    disjointClassesEClass.getESuperTypes().add(this.getClassAtom());
    objectPropertyAtomEClass.getESuperTypes().add(this.getAtom());
    assertionEClass.getESuperTypes().add(this.getAtom());
    objectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    dataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    classAssertionEClass.getESuperTypes().add(this.getAssertion());
    sameIndividualEClass.getESuperTypes().add(this.getAssertion());
    differentIndividualsEClass.getESuperTypes().add(this.getAssertion());
    equivalentObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    subPropertyOfEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    objectPropertyExpressionEClass.getESuperTypes().add(this.getExpression());
    inverseObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
    inverseObjectPropertyAtomEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    functionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    inverseFunctionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    transitiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    symmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAtom());
    classExpressionEClass.getESuperTypes().add(this.getExpression());
    dataPropertyExpressionEClass.getESuperTypes().add(this.getExpression());
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
    dataHasValueEClass.getESuperTypes().add(this.getClassExpression());
    fullIRIEClass.getESuperTypes().add(this.getIRI());
    abbreviatedIRIEClass.getESuperTypes().add(this.getIRI());
    declarationEClass.getESuperTypes().add(this.getAtom());
    objectPropertyDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    datatypePropertyDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    individualDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    classDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    constantEClass.getESuperTypes().add(this.getTerm());

    // Initialize classes and features; add operations and parameters
    initEClass(ontologyDocumentEClass, OntologyDocument.class, "OntologyDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOntologyDocument_PrefixDefinition(), this.getPrefixDefinition(), null, "prefixDefinition", null, 0, -1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getOntologyDocument_Query(), this.getQuery(), null, "query", null, 1, 1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(prefixDefinitionEClass, PrefixDefinition.class, "PrefixDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrefixDefinition_Pref(), ecorePackage.getEString(), "pref", null, 0, 1, PrefixDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPrefixDefinition_Namespace(), this.getFullIRI(), null, "namespace", null, 1, 1, PrefixDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuery_QueryIRI(), this.getIRI(), null, "queryIRI", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getQuery_Atoms(), this.getAtom(), null, "atoms", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomEClass, Atom.class, "Atom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Symbol(), ecorePackage.getEString(), "symbol", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classVariableEClass, ClassVariable.class, "ClassVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyVariableEClass, ObjectPropertyVariable.class, "ObjectPropertyVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataPropertyVariableEClass, DataPropertyVariable.class, "DataPropertyVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(individualVariableEClass, IndividualVariable.class, "IndividualVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classEClass, de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(individualEClass, Individual.class, "Individual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedIndividualEClass, NamedIndividual.class, "NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anonymousIndividualEClass, AnonymousIndividual.class, "AnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnonymousIndividual_NodeID(), ecorePackage.getEString(), "nodeID", null, 1, 1, AnonymousIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteral_LexicalForm(), ecorePackage.getEString(), "lexicalForm", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getLiteral_Datatype(), this.getDatatype(), null, "datatype", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classAtomEClass, ClassAtom.class, "ClassAtom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(equivalentClassesEClass, EquivalentClasses.class, "EquivalentClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentClasses_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, EquivalentClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(subClassOfEClass, SubClassOf.class, "SubClassOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubClassOf_SubClassExpression(), this.getClassExpression(), null, "subClassExpression", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubClassOf_SuperClassExpression(), this.getClassExpression(), null, "superClassExpression", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointClassesEClass, DisjointClasses.class, "DisjointClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointClasses_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, DisjointClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyAtomEClass, ObjectPropertyAtom.class, "ObjectPropertyAtom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyAssertionEClass, ObjectPropertyAssertion.class, "ObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyAssertion_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyAssertionEClass, DataPropertyAssertion.class, "DataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataPropertyAssertion_TargetValue(), this.getLiteral(), null, "targetValue", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataPropertyAssertion_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classAssertionEClass, ClassAssertion.class, "ClassAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassAssertion_Individual(), this.getIndividual(), null, "individual", null, 1, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClassAssertion_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(sameIndividualEClass, SameIndividual.class, "SameIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSameIndividual_Individuals(), this.getIndividual(), null, "individuals", null, 2, -1, SameIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(differentIndividualsEClass, DifferentIndividuals.class, "DifferentIndividuals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDifferentIndividuals_Individuals(), this.getIndividual(), null, "individuals", null, 2, -1, DifferentIndividuals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(equivalentObjectPropertiesEClass, EquivalentObjectProperties.class, "EquivalentObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentObjectProperties_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 2, -1, EquivalentObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(subPropertyOfEClass, SubPropertyOf.class, "SubPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubPropertyOf_SubObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "subObjectPropertyExpression", null, 1, 1, SubPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubPropertyOf_SuperObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "superObjectPropertyExpression", null, 1, 1, SubPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyExpressionEClass, ObjectPropertyExpression.class, "ObjectPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inverseObjectPropertyEClass, InverseObjectProperty.class, "InverseObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseObjectProperty_ObjectProperty(), this.getObjectPropertyExpression(), null, "objectProperty", null, 1, 1, InverseObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(inverseObjectPropertyAtomEClass, InverseObjectPropertyAtom.class, "InverseObjectPropertyAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseObjectPropertyAtom_ObjectPropertyExpression1(), this.getObjectPropertyExpression(), null, "objectPropertyExpression1", null, 1, 1, InverseObjectPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInverseObjectPropertyAtom_ObjectPropertyExpression2(), this.getObjectPropertyExpression(), null, "objectPropertyExpression2", null, 1, 1, InverseObjectPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(functionalObjectPropertyEClass, FunctionalObjectProperty.class, "FunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionalObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, FunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(inverseFunctionalObjectPropertyEClass, InverseFunctionalObjectProperty.class, "InverseFunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseFunctionalObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, InverseFunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(transitiveObjectPropertyEClass, TransitiveObjectProperty.class, "TransitiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, TransitiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(symmetricObjectPropertyEClass, SymmetricObjectProperty.class, "SymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSymmetricObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, SymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classExpressionEClass, ClassExpression.class, "ClassExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataPropertyExpressionEClass, DataPropertyExpression.class, "DataPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

    initEClass(dataHasValueEClass, DataHasValue.class, "DataHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataHasValue_Literal(), this.getLiteral(), null, "literal", null, 1, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataHasValue_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iriEClass, de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI.class, "IRI", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIRI_Id(), ecorePackage.getEString(), "id", null, 1, 1, de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(fullIRIEClass, FullIRI.class, "FullIRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abbreviatedIRIEClass, AbbreviatedIRI.class, "AbbreviatedIRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyDeclarationEClass, ObjectPropertyDeclaration.class, "ObjectPropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyDeclaration_ObjectPropertyVariable(), this.getObjectPropertyVariable(), null, "objectPropertyVariable", null, 1, 1, ObjectPropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datatypePropertyDeclarationEClass, DatatypePropertyDeclaration.class, "DatatypePropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatatypePropertyDeclaration_DatatypePropertyVariable(), this.getDataPropertyVariable(), null, "datatypePropertyVariable", null, 1, 1, DatatypePropertyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(individualDeclarationEClass, IndividualDeclaration.class, "IndividualDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndividualDeclaration_IndividualVariable(), this.getIndividualVariable(), null, "individualVariable", null, 1, 1, IndividualDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassDeclaration_ClassVariable(), this.getClassVariable(), null, "classVariable", null, 1, 1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstant_ConstantIRI(), this.getIRI(), null, "constantIRI", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //SPARQLASPackageImpl
