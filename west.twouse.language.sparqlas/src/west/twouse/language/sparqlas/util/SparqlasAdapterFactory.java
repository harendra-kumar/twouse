/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
import west.twouse.language.sparqlas.IRI;
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
import west.twouse.language.sparqlas.TemplateableElement;
import west.twouse.language.sparqlas.Term;
import west.twouse.language.sparqlas.TransitiveObjectProperty;
import west.twouse.language.sparqlas.Variable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see west.twouse.language.sparqlas.SparqlasPackage
 * @generated
 */
public class SparqlasAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SparqlasPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlasAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SparqlasPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SparqlasSwitch<Adapter> modelSwitch =
    new SparqlasSwitch<Adapter>()
    {
      @Override
      public Adapter caseOntologyDocument(OntologyDocument object)
      {
        return createOntologyDocumentAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePrefixDefinition(PrefixDefinition object)
      {
        return createPrefixDefinitionAdapter();
      }
      @Override
      public Adapter caseQuery(Query object)
      {
        return createQueryAdapter();
      }
      @Override
      public Adapter caseSelectQuery(SelectQuery object)
      {
        return createSelectQueryAdapter();
      }
      @Override
      public Adapter caseConstructQuery(ConstructQuery object)
      {
        return createConstructQueryAdapter();
      }
      @Override
      public Adapter caseAskQuery(AskQuery object)
      {
        return createAskQueryAdapter();
      }
      @Override
      public Adapter caseDescribeQuery(DescribeQuery object)
      {
        return createDescribeQueryAdapter();
      }
      @Override
      public Adapter caseIRI(IRI object)
      {
        return createIRIAdapter();
      }
      @Override
      public Adapter caseFullIRI(FullIRI object)
      {
        return createFullIRIAdapter();
      }
      @Override
      public Adapter caseAbbreviatedIRI(AbbreviatedIRI object)
      {
        return createAbbreviatedIRIAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseClassVariable(ClassVariable object)
      {
        return createClassVariableAdapter();
      }
      @Override
      public Adapter caseObjectPropertyVariable(ObjectPropertyVariable object)
      {
        return createObjectPropertyVariableAdapter();
      }
      @Override
      public Adapter caseDataPropertyVariable(DataPropertyVariable object)
      {
        return createDataPropertyVariableAdapter();
      }
      @Override
      public Adapter caseIndividualVariable(IndividualVariable object)
      {
        return createIndividualVariableAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseClass(west.twouse.language.sparqlas.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseDatatype(Datatype object)
      {
        return createDatatypeAdapter();
      }
      @Override
      public Adapter caseObjectProperty(ObjectProperty object)
      {
        return createObjectPropertyAdapter();
      }
      @Override
      public Adapter caseDataProperty(DataProperty object)
      {
        return createDataPropertyAdapter();
      }
      @Override
      public Adapter caseIndividual(Individual object)
      {
        return createIndividualAdapter();
      }
      @Override
      public Adapter caseNamedIndividual(NamedIndividual object)
      {
        return createNamedIndividualAdapter();
      }
      @Override
      public Adapter caseAnonymousIndividual(AnonymousIndividual object)
      {
        return createAnonymousIndividualAdapter();
      }
      @Override
      public Adapter caseAbstractLiteral(AbstractLiteral object)
      {
        return createAbstractLiteralAdapter();
      }
      @Override
      public Adapter caseLiteralVariable(LiteralVariable object)
      {
        return createLiteralVariableAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseAssertion(Assertion object)
      {
        return createAssertionAdapter();
      }
      @Override
      public Adapter caseClassAssertion(ClassAssertion object)
      {
        return createClassAssertionAdapter();
      }
      @Override
      public Adapter caseObjectPropertyAssertion(ObjectPropertyAssertion object)
      {
        return createObjectPropertyAssertionAdapter();
      }
      @Override
      public Adapter caseDataPropertyAssertion(DataPropertyAssertion object)
      {
        return createDataPropertyAssertionAdapter();
      }
      @Override
      public Adapter caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object)
      {
        return createNegativeObjectPropertyAssertionAdapter();
      }
      @Override
      public Adapter caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object)
      {
        return createNegativeDataPropertyAssertionAdapter();
      }
      @Override
      public Adapter caseSameIndividual(SameIndividual object)
      {
        return createSameIndividualAdapter();
      }
      @Override
      public Adapter caseDifferentIndividuals(DifferentIndividuals object)
      {
        return createDifferentIndividualsAdapter();
      }
      @Override
      public Adapter caseClassAtom(ClassAtom object)
      {
        return createClassAtomAdapter();
      }
      @Override
      public Adapter caseSubClassOf(SubClassOf object)
      {
        return createSubClassOfAdapter();
      }
      @Override
      public Adapter caseEquivalentClasses(EquivalentClasses object)
      {
        return createEquivalentClassesAdapter();
      }
      @Override
      public Adapter caseDisjointClasses(DisjointClasses object)
      {
        return createDisjointClassesAdapter();
      }
      @Override
      public Adapter caseDisjointUnion(DisjointUnion object)
      {
        return createDisjointUnionAdapter();
      }
      @Override
      public Adapter caseClassExpression(ClassExpression object)
      {
        return createClassExpressionAdapter();
      }
      @Override
      public Adapter caseObjectUnionOf(ObjectUnionOf object)
      {
        return createObjectUnionOfAdapter();
      }
      @Override
      public Adapter caseObjectComplementOf(ObjectComplementOf object)
      {
        return createObjectComplementOfAdapter();
      }
      @Override
      public Adapter caseObjectOneOf(ObjectOneOf object)
      {
        return createObjectOneOfAdapter();
      }
      @Override
      public Adapter caseObjectIntersectionOf(ObjectIntersectionOf object)
      {
        return createObjectIntersectionOfAdapter();
      }
      @Override
      public Adapter caseObjectAllValuesFrom(ObjectAllValuesFrom object)
      {
        return createObjectAllValuesFromAdapter();
      }
      @Override
      public Adapter caseObjectSomeValuesFrom(ObjectSomeValuesFrom object)
      {
        return createObjectSomeValuesFromAdapter();
      }
      @Override
      public Adapter caseObjectHasValue(ObjectHasValue object)
      {
        return createObjectHasValueAdapter();
      }
      @Override
      public Adapter caseObjectMinCardinality(ObjectMinCardinality object)
      {
        return createObjectMinCardinalityAdapter();
      }
      @Override
      public Adapter caseObjectMaxCardinality(ObjectMaxCardinality object)
      {
        return createObjectMaxCardinalityAdapter();
      }
      @Override
      public Adapter caseObjectExactCardinality(ObjectExactCardinality object)
      {
        return createObjectExactCardinalityAdapter();
      }
      @Override
      public Adapter caseDataAllValuesFrom(DataAllValuesFrom object)
      {
        return createDataAllValuesFromAdapter();
      }
      @Override
      public Adapter caseDataSomeValuesFrom(DataSomeValuesFrom object)
      {
        return createDataSomeValuesFromAdapter();
      }
      @Override
      public Adapter caseDataHasValue(DataHasValue object)
      {
        return createDataHasValueAdapter();
      }
      @Override
      public Adapter caseDataMinCardinality(DataMinCardinality object)
      {
        return createDataMinCardinalityAdapter();
      }
      @Override
      public Adapter caseDataMaxCardinality(DataMaxCardinality object)
      {
        return createDataMaxCardinalityAdapter();
      }
      @Override
      public Adapter caseDataExactCardinality(DataExactCardinality object)
      {
        return createDataExactCardinalityAdapter();
      }
      @Override
      public Adapter caseDataRange(DataRange object)
      {
        return createDataRangeAdapter();
      }
      @Override
      public Adapter caseDataUnionOf(DataUnionOf object)
      {
        return createDataUnionOfAdapter();
      }
      @Override
      public Adapter caseDataComplementOf(DataComplementOf object)
      {
        return createDataComplementOfAdapter();
      }
      @Override
      public Adapter caseDataOneOf(DataOneOf object)
      {
        return createDataOneOfAdapter();
      }
      @Override
      public Adapter caseDataIntersectionOf(DataIntersectionOf object)
      {
        return createDataIntersectionOfAdapter();
      }
      @Override
      public Adapter caseDatatypeRestriction(DatatypeRestriction object)
      {
        return createDatatypeRestrictionAdapter();
      }
      @Override
      public Adapter caseFacetRestriction(FacetRestriction object)
      {
        return createFacetRestrictionAdapter();
      }
      @Override
      public Adapter caseObjectPropertyAtom(ObjectPropertyAtom object)
      {
        return createObjectPropertyAtomAdapter();
      }
      @Override
      public Adapter caseSubObjectPropertyOf(SubObjectPropertyOf object)
      {
        return createSubObjectPropertyOfAdapter();
      }
      @Override
      public Adapter caseObjectPropertyChain(ObjectPropertyChain object)
      {
        return createObjectPropertyChainAdapter();
      }
      @Override
      public Adapter caseEquivalentObjectProperties(EquivalentObjectProperties object)
      {
        return createEquivalentObjectPropertiesAdapter();
      }
      @Override
      public Adapter caseDisjointObjectProperties(DisjointObjectProperties object)
      {
        return createDisjointObjectPropertiesAdapter();
      }
      @Override
      public Adapter caseObjectPropertyDomain(ObjectPropertyDomain object)
      {
        return createObjectPropertyDomainAdapter();
      }
      @Override
      public Adapter caseObjectPropertyRange(ObjectPropertyRange object)
      {
        return createObjectPropertyRangeAdapter();
      }
      @Override
      public Adapter caseInverseObjectPropertyAtom(InverseObjectPropertyAtom object)
      {
        return createInverseObjectPropertyAtomAdapter();
      }
      @Override
      public Adapter caseFunctionalObjectProperty(FunctionalObjectProperty object)
      {
        return createFunctionalObjectPropertyAdapter();
      }
      @Override
      public Adapter caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty object)
      {
        return createInverseFunctionalObjectPropertyAdapter();
      }
      @Override
      public Adapter caseReflexiveObjectProperty(ReflexiveObjectProperty object)
      {
        return createReflexiveObjectPropertyAdapter();
      }
      @Override
      public Adapter caseIrreflexiveObjectProperty(IrreflexiveObjectProperty object)
      {
        return createIrreflexiveObjectPropertyAdapter();
      }
      @Override
      public Adapter caseSymmetricObjectProperty(SymmetricObjectProperty object)
      {
        return createSymmetricObjectPropertyAdapter();
      }
      @Override
      public Adapter caseAsymmetricObjectProperty(AsymmetricObjectProperty object)
      {
        return createAsymmetricObjectPropertyAdapter();
      }
      @Override
      public Adapter caseTransitiveObjectProperty(TransitiveObjectProperty object)
      {
        return createTransitiveObjectPropertyAdapter();
      }
      @Override
      public Adapter caseObjectPropertyExpression(ObjectPropertyExpression object)
      {
        return createObjectPropertyExpressionAdapter();
      }
      @Override
      public Adapter caseInverseObjectProperty(InverseObjectProperty object)
      {
        return createInverseObjectPropertyAdapter();
      }
      @Override
      public Adapter caseDataPropertyAtom(DataPropertyAtom object)
      {
        return createDataPropertyAtomAdapter();
      }
      @Override
      public Adapter caseSubDataPropertyOf(SubDataPropertyOf object)
      {
        return createSubDataPropertyOfAdapter();
      }
      @Override
      public Adapter caseEquivalentDataProperties(EquivalentDataProperties object)
      {
        return createEquivalentDataPropertiesAdapter();
      }
      @Override
      public Adapter caseDisjointDataProperties(DisjointDataProperties object)
      {
        return createDisjointDataPropertiesAdapter();
      }
      @Override
      public Adapter caseDataPropertyDomain(DataPropertyDomain object)
      {
        return createDataPropertyDomainAdapter();
      }
      @Override
      public Adapter caseDataPropertyRange(DataPropertyRange object)
      {
        return createDataPropertyRangeAdapter();
      }
      @Override
      public Adapter caseFunctionalDataProperty(FunctionalDataProperty object)
      {
        return createFunctionalDataPropertyAdapter();
      }
      @Override
      public Adapter caseDataPropertyExpression(DataPropertyExpression object)
      {
        return createDataPropertyExpressionAdapter();
      }
      @Override
      public Adapter caseHasKey(HasKey object)
      {
        return createHasKeyAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseClassDeclaration(ClassDeclaration object)
      {
        return createClassDeclarationAdapter();
      }
      @Override
      public Adapter caseObjectPropertyDeclaration(ObjectPropertyDeclaration object)
      {
        return createObjectPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseDatatypePropertyDeclaration(DatatypePropertyDeclaration object)
      {
        return createDatatypePropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseIndividualDeclaration(IndividualDeclaration object)
      {
        return createIndividualDeclarationAdapter();
      }
      @Override
      public Adapter caseTemplateParameter(TemplateParameter object)
      {
        return createTemplateParameterAdapter();
      }
      @Override
      public Adapter caseParameterableElement(ParameterableElement object)
      {
        return createParameterableElementAdapter();
      }
      @Override
      public Adapter caseTemplateSignature(TemplateSignature object)
      {
        return createTemplateSignatureAdapter();
      }
      @Override
      public Adapter caseTemplateableElement(TemplateableElement object)
      {
        return createTemplateableElementAdapter();
      }
      @Override
      public Adapter caseTemplateParameterSubstitution(TemplateParameterSubstitution object)
      {
        return createTemplateParameterSubstitutionAdapter();
      }
      @Override
      public Adapter caseTemplateBinding(TemplateBinding object)
      {
        return createTemplateBindingAdapter();
      }
      @Override
      public Adapter caseDirectClassAssertion(DirectClassAssertion object)
      {
        return createDirectClassAssertionAdapter();
      }
      @Override
      public Adapter caseDirectSubClassOf(DirectSubClassOf object)
      {
        return createDirectSubClassOfAdapter();
      }
      @Override
      public Adapter caseStrictSubClassOf(StrictSubClassOf object)
      {
        return createStrictSubClassOfAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.OntologyDocument <em>Ontology Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.OntologyDocument
   * @generated
   */
  public Adapter createOntologyDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.PrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.PrefixDefinition
   * @generated
   */
  public Adapter createPrefixDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Query
   * @generated
   */
  public Adapter createQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.SelectQuery <em>Select Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.SelectQuery
   * @generated
   */
  public Adapter createSelectQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ConstructQuery <em>Construct Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ConstructQuery
   * @generated
   */
  public Adapter createConstructQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.AskQuery <em>Ask Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.AskQuery
   * @generated
   */
  public Adapter createAskQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DescribeQuery <em>Describe Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DescribeQuery
   * @generated
   */
  public Adapter createDescribeQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.IRI <em>IRI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.IRI
   * @generated
   */
  public Adapter createIRIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.FullIRI <em>Full IRI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.FullIRI
   * @generated
   */
  public Adapter createFullIRIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.AbbreviatedIRI <em>Abbreviated IRI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.AbbreviatedIRI
   * @generated
   */
  public Adapter createAbbreviatedIRIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ClassVariable <em>Class Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ClassVariable
   * @generated
   */
  public Adapter createClassVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectPropertyVariable <em>Object Property Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectPropertyVariable
   * @generated
   */
  public Adapter createObjectPropertyVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataPropertyVariable <em>Data Property Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataPropertyVariable
   * @generated
   */
  public Adapter createDataPropertyVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.IndividualVariable <em>Individual Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.IndividualVariable
   * @generated
   */
  public Adapter createIndividualVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Datatype
   * @generated
   */
  public Adapter createDatatypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectProperty
   * @generated
   */
  public Adapter createObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataProperty <em>Data Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataProperty
   * @generated
   */
  public Adapter createDataPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Individual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Individual
   * @generated
   */
  public Adapter createIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.NamedIndividual <em>Named Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.NamedIndividual
   * @generated
   */
  public Adapter createNamedIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.AnonymousIndividual <em>Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.AnonymousIndividual
   * @generated
   */
  public Adapter createAnonymousIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.AbstractLiteral <em>Abstract Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.AbstractLiteral
   * @generated
   */
  public Adapter createAbstractLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.LiteralVariable <em>Literal Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.LiteralVariable
   * @generated
   */
  public Adapter createLiteralVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Assertion
   * @generated
   */
  public Adapter createAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ClassAssertion <em>Class Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ClassAssertion
   * @generated
   */
  public Adapter createClassAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectPropertyAssertion
   * @generated
   */
  public Adapter createObjectPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataPropertyAssertion <em>Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataPropertyAssertion
   * @generated
   */
  public Adapter createDataPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.NegativeObjectPropertyAssertion
   * @generated
   */
  public Adapter createNegativeObjectPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.NegativeDataPropertyAssertion
   * @generated
   */
  public Adapter createNegativeDataPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.SameIndividual <em>Same Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.SameIndividual
   * @generated
   */
  public Adapter createSameIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DifferentIndividuals <em>Different Individuals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DifferentIndividuals
   * @generated
   */
  public Adapter createDifferentIndividualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ClassAtom <em>Class Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ClassAtom
   * @generated
   */
  public Adapter createClassAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.SubClassOf <em>Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.SubClassOf
   * @generated
   */
  public Adapter createSubClassOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.EquivalentClasses <em>Equivalent Classes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.EquivalentClasses
   * @generated
   */
  public Adapter createEquivalentClassesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DisjointClasses <em>Disjoint Classes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DisjointClasses
   * @generated
   */
  public Adapter createDisjointClassesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DisjointUnion <em>Disjoint Union</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DisjointUnion
   * @generated
   */
  public Adapter createDisjointUnionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ClassExpression
   * @generated
   */
  public Adapter createClassExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectUnionOf <em>Object Union Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectUnionOf
   * @generated
   */
  public Adapter createObjectUnionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectComplementOf <em>Object Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectComplementOf
   * @generated
   */
  public Adapter createObjectComplementOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectOneOf <em>Object One Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectOneOf
   * @generated
   */
  public Adapter createObjectOneOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectIntersectionOf
   * @generated
   */
  public Adapter createObjectIntersectionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectAllValuesFrom <em>Object All Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectAllValuesFrom
   * @generated
   */
  public Adapter createObjectAllValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectSomeValuesFrom
   * @generated
   */
  public Adapter createObjectSomeValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectHasValue <em>Object Has Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectHasValue
   * @generated
   */
  public Adapter createObjectHasValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectMinCardinality
   * @generated
   */
  public Adapter createObjectMinCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectMaxCardinality
   * @generated
   */
  public Adapter createObjectMaxCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectExactCardinality
   * @generated
   */
  public Adapter createObjectExactCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataAllValuesFrom <em>Data All Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataAllValuesFrom
   * @generated
   */
  public Adapter createDataAllValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataSomeValuesFrom <em>Data Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataSomeValuesFrom
   * @generated
   */
  public Adapter createDataSomeValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataHasValue <em>Data Has Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataHasValue
   * @generated
   */
  public Adapter createDataHasValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataMinCardinality <em>Data Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataMinCardinality
   * @generated
   */
  public Adapter createDataMinCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataMaxCardinality <em>Data Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataMaxCardinality
   * @generated
   */
  public Adapter createDataMaxCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataExactCardinality <em>Data Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataExactCardinality
   * @generated
   */
  public Adapter createDataExactCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataRange
   * @generated
   */
  public Adapter createDataRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataUnionOf <em>Data Union Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataUnionOf
   * @generated
   */
  public Adapter createDataUnionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataComplementOf <em>Data Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataComplementOf
   * @generated
   */
  public Adapter createDataComplementOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataOneOf <em>Data One Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataOneOf
   * @generated
   */
  public Adapter createDataOneOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataIntersectionOf <em>Data Intersection Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataIntersectionOf
   * @generated
   */
  public Adapter createDataIntersectionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DatatypeRestriction <em>Datatype Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DatatypeRestriction
   * @generated
   */
  public Adapter createDatatypeRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.FacetRestriction <em>Facet Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.FacetRestriction
   * @generated
   */
  public Adapter createFacetRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectPropertyAtom <em>Object Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectPropertyAtom
   * @generated
   */
  public Adapter createObjectPropertyAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.SubObjectPropertyOf
   * @generated
   */
  public Adapter createSubObjectPropertyOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectPropertyChain <em>Object Property Chain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectPropertyChain
   * @generated
   */
  public Adapter createObjectPropertyChainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.EquivalentObjectProperties
   * @generated
   */
  public Adapter createEquivalentObjectPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DisjointObjectProperties <em>Disjoint Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DisjointObjectProperties
   * @generated
   */
  public Adapter createDisjointObjectPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectPropertyDomain <em>Object Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectPropertyDomain
   * @generated
   */
  public Adapter createObjectPropertyDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectPropertyRange <em>Object Property Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectPropertyRange
   * @generated
   */
  public Adapter createObjectPropertyRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.InverseObjectPropertyAtom <em>Inverse Object Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.InverseObjectPropertyAtom
   * @generated
   */
  public Adapter createInverseObjectPropertyAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.FunctionalObjectProperty <em>Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.FunctionalObjectProperty
   * @generated
   */
  public Adapter createFunctionalObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.InverseFunctionalObjectProperty
   * @generated
   */
  public Adapter createInverseFunctionalObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ReflexiveObjectProperty
   * @generated
   */
  public Adapter createReflexiveObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.IrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.IrreflexiveObjectProperty
   * @generated
   */
  public Adapter createIrreflexiveObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.SymmetricObjectProperty
   * @generated
   */
  public Adapter createSymmetricObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.AsymmetricObjectProperty <em>Asymmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.AsymmetricObjectProperty
   * @generated
   */
  public Adapter createAsymmetricObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.TransitiveObjectProperty
   * @generated
   */
  public Adapter createTransitiveObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectPropertyExpression
   * @generated
   */
  public Adapter createObjectPropertyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.InverseObjectProperty <em>Inverse Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.InverseObjectProperty
   * @generated
   */
  public Adapter createInverseObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataPropertyAtom <em>Data Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataPropertyAtom
   * @generated
   */
  public Adapter createDataPropertyAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.SubDataPropertyOf
   * @generated
   */
  public Adapter createSubDataPropertyOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.EquivalentDataProperties <em>Equivalent Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.EquivalentDataProperties
   * @generated
   */
  public Adapter createEquivalentDataPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DisjointDataProperties <em>Disjoint Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DisjointDataProperties
   * @generated
   */
  public Adapter createDisjointDataPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataPropertyDomain <em>Data Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataPropertyDomain
   * @generated
   */
  public Adapter createDataPropertyDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataPropertyRange <em>Data Property Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataPropertyRange
   * @generated
   */
  public Adapter createDataPropertyRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.FunctionalDataProperty <em>Functional Data Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.FunctionalDataProperty
   * @generated
   */
  public Adapter createFunctionalDataPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DataPropertyExpression
   * @generated
   */
  public Adapter createDataPropertyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.HasKey <em>Has Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.HasKey
   * @generated
   */
  public Adapter createHasKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ClassDeclaration
   * @generated
   */
  public Adapter createClassDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ObjectPropertyDeclaration <em>Object Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ObjectPropertyDeclaration
   * @generated
   */
  public Adapter createObjectPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DatatypePropertyDeclaration <em>Datatype Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DatatypePropertyDeclaration
   * @generated
   */
  public Adapter createDatatypePropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.IndividualDeclaration <em>Individual Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.IndividualDeclaration
   * @generated
   */
  public Adapter createIndividualDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.TemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.TemplateParameter
   * @generated
   */
  public Adapter createTemplateParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.ParameterableElement <em>Parameterable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.ParameterableElement
   * @generated
   */
  public Adapter createParameterableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.TemplateSignature <em>Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.TemplateSignature
   * @generated
   */
  public Adapter createTemplateSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.TemplateableElement <em>Templateable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.TemplateableElement
   * @generated
   */
  public Adapter createTemplateableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.TemplateParameterSubstitution
   * @generated
   */
  public Adapter createTemplateParameterSubstitutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.TemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.TemplateBinding
   * @generated
   */
  public Adapter createTemplateBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DirectClassAssertion <em>Direct Class Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DirectClassAssertion
   * @generated
   */
  public Adapter createDirectClassAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.DirectSubClassOf <em>Direct Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.DirectSubClassOf
   * @generated
   */
  public Adapter createDirectSubClassOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.sparqlas.StrictSubClassOf <em>Strict Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.sparqlas.StrictSubClassOf
   * @generated
   */
  public Adapter createStrictSubClassOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SparqlasAdapterFactory
