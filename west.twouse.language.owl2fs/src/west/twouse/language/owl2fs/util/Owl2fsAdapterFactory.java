/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import west.twouse.language.owl2fs.AbbreviatedIRI;
import west.twouse.language.owl2fs.Annotation;
import west.twouse.language.owl2fs.AnnotationAssertion;
import west.twouse.language.owl2fs.AnnotationAxiom;
import west.twouse.language.owl2fs.AnnotationProperty;
import west.twouse.language.owl2fs.AnnotationPropertyDeclaration;
import west.twouse.language.owl2fs.AnnotationPropertyDomain;
import west.twouse.language.owl2fs.AnnotationPropertyRange;
import west.twouse.language.owl2fs.AnnotationSubject;
import west.twouse.language.owl2fs.AnnotationValue;
import west.twouse.language.owl2fs.AnonymousIndividual;
import west.twouse.language.owl2fs.Assertion;
import west.twouse.language.owl2fs.AsymmetricObjectProperty;
import west.twouse.language.owl2fs.Atom;
import west.twouse.language.owl2fs.Axiom;
import west.twouse.language.owl2fs.BuiltInAtom;
import west.twouse.language.owl2fs.ClassAssertion;
import west.twouse.language.owl2fs.ClassAtom;
import west.twouse.language.owl2fs.ClassAxiom;
import west.twouse.language.owl2fs.ClassDeclaration;
import west.twouse.language.owl2fs.ClassExpression;
import west.twouse.language.owl2fs.ClassifierTemplateParameter;
import west.twouse.language.owl2fs.Comment;
import west.twouse.language.owl2fs.DArg;
import west.twouse.language.owl2fs.DGAtom;
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
import west.twouse.language.owl2fs.DataPropertyAxiom;
import west.twouse.language.owl2fs.DataPropertyDeclaration;
import west.twouse.language.owl2fs.DataPropertyDomain;
import west.twouse.language.owl2fs.DataPropertyExpression;
import west.twouse.language.owl2fs.DataPropertyRange;
import west.twouse.language.owl2fs.DataPropetyAtom;
import west.twouse.language.owl2fs.DataRange;
import west.twouse.language.owl2fs.DataRangeAtom;
import west.twouse.language.owl2fs.DataSomeValuesFrom;
import west.twouse.language.owl2fs.DataUnionOf;
import west.twouse.language.owl2fs.Datatype;
import west.twouse.language.owl2fs.DatatypeDeclaration;
import west.twouse.language.owl2fs.DatatypeDefinition;
import west.twouse.language.owl2fs.DatatypeRestriction;
import west.twouse.language.owl2fs.Declaration;
import west.twouse.language.owl2fs.DifferentIndividuals;
import west.twouse.language.owl2fs.DifferentIndividualsAtom;
import west.twouse.language.owl2fs.DisjointClasses;
import west.twouse.language.owl2fs.DisjointDataProperties;
import west.twouse.language.owl2fs.DisjointObjectProperties;
import west.twouse.language.owl2fs.DisjointUnion;
import west.twouse.language.owl2fs.EdgeAssertion;
import west.twouse.language.owl2fs.Entity;
import west.twouse.language.owl2fs.EquivalentClasses;
import west.twouse.language.owl2fs.EquivalentDataProperties;
import west.twouse.language.owl2fs.EquivalentObjectProperties;
import west.twouse.language.owl2fs.Expression;
import west.twouse.language.owl2fs.FacetConstraintPair;
import west.twouse.language.owl2fs.FullIRI;
import west.twouse.language.owl2fs.FunctionalDataProperty;
import west.twouse.language.owl2fs.FunctionalObjectProperty;
import west.twouse.language.owl2fs.HasKey;
import west.twouse.language.owl2fs.IArg;
import west.twouse.language.owl2fs.IRI;
import west.twouse.language.owl2fs.Individual;
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
import west.twouse.language.owl2fs.ObjectPropertyAxiom;
import west.twouse.language.owl2fs.ObjectPropertyChain;
import west.twouse.language.owl2fs.ObjectPropertyDeclaration;
import west.twouse.language.owl2fs.ObjectPropertyDomain;
import west.twouse.language.owl2fs.ObjectPropertyExpression;
import west.twouse.language.owl2fs.ObjectPropertyRange;
import west.twouse.language.owl2fs.ObjectSomeValuesFrom;
import west.twouse.language.owl2fs.ObjectUnionOf;
import west.twouse.language.owl2fs.Ontology;
import west.twouse.language.owl2fs.OntologyDocument;
import west.twouse.language.owl2fs.Owl2fsPackage;
import west.twouse.language.owl2fs.ParameterableElement;
import west.twouse.language.owl2fs.PrefixDefinition;
import west.twouse.language.owl2fs.ReflexiveObjectProperty;
import west.twouse.language.owl2fs.Rule;
import west.twouse.language.owl2fs.SameIndividual;
import west.twouse.language.owl2fs.SameIndividualAtom;
import west.twouse.language.owl2fs.SubAnnotationPropertyOf;
import west.twouse.language.owl2fs.SubClassOf;
import west.twouse.language.owl2fs.SubDataPropertyOf;
import west.twouse.language.owl2fs.SubObjectPropertyExpression;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see west.twouse.language.owl2fs.Owl2fsPackage
 * @generated
 */
public class Owl2fsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Owl2fsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Owl2fsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Owl2fsPackage.eINSTANCE;
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
  protected Owl2fsSwitch<Adapter> modelSwitch =
    new Owl2fsSwitch<Adapter>()
    {
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
      public Adapter caseOntologyDocument(OntologyDocument object)
      {
        return createOntologyDocumentAdapter();
      }
      @Override
      public Adapter casePrefixDefinition(PrefixDefinition object)
      {
        return createPrefixDefinitionAdapter();
      }
      @Override
      public Adapter caseOntology(Ontology object)
      {
        return createOntologyAdapter();
      }
      @Override
      public Adapter caseAxiom(Axiom object)
      {
        return createAxiomAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
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
      public Adapter caseDatatypeDeclaration(DatatypeDeclaration object)
      {
        return createDatatypeDeclarationAdapter();
      }
      @Override
      public Adapter caseObjectPropertyDeclaration(ObjectPropertyDeclaration object)
      {
        return createObjectPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseDataPropertyDeclaration(DataPropertyDeclaration object)
      {
        return createDataPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseAnnotationPropertyDeclaration(AnnotationPropertyDeclaration object)
      {
        return createAnnotationPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseNamedIndividualDeclaration(NamedIndividualDeclaration object)
      {
        return createNamedIndividualDeclarationAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseAnnotationSubject(AnnotationSubject object)
      {
        return createAnnotationSubjectAdapter();
      }
      @Override
      public Adapter caseAnnotationValue(AnnotationValue object)
      {
        return createAnnotationValueAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseAnnotationAxiom(AnnotationAxiom object)
      {
        return createAnnotationAxiomAdapter();
      }
      @Override
      public Adapter caseAnnotationAssertion(AnnotationAssertion object)
      {
        return createAnnotationAssertionAdapter();
      }
      @Override
      public Adapter caseSubAnnotationPropertyOf(SubAnnotationPropertyOf object)
      {
        return createSubAnnotationPropertyOfAdapter();
      }
      @Override
      public Adapter caseAnnotationPropertyDomain(AnnotationPropertyDomain object)
      {
        return createAnnotationPropertyDomainAdapter();
      }
      @Override
      public Adapter caseAnnotationPropertyRange(AnnotationPropertyRange object)
      {
        return createAnnotationPropertyRangeAdapter();
      }
      @Override
      public Adapter caseAnnotationProperty(AnnotationProperty object)
      {
        return createAnnotationPropertyAdapter();
      }
      @Override
      public Adapter caseClass(west.twouse.language.owl2fs.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseDataProperty(DataProperty object)
      {
        return createDataPropertyAdapter();
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
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
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
      public Adapter caseDataPropertyExpression(DataPropertyExpression object)
      {
        return createDataPropertyExpressionAdapter();
      }
      @Override
      public Adapter caseDataRange(DataRange object)
      {
        return createDataRangeAdapter();
      }
      @Override
      public Adapter caseDataIntersectionOf(DataIntersectionOf object)
      {
        return createDataIntersectionOfAdapter();
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
      public Adapter caseDatatypeRestriction(DatatypeRestriction object)
      {
        return createDatatypeRestrictionAdapter();
      }
      @Override
      public Adapter caseFacetConstraintPair(FacetConstraintPair object)
      {
        return createFacetConstraintPairAdapter();
      }
      @Override
      public Adapter caseClassExpression(ClassExpression object)
      {
        return createClassExpressionAdapter();
      }
      @Override
      public Adapter caseObjectIntersectionOf(ObjectIntersectionOf object)
      {
        return createObjectIntersectionOfAdapter();
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
      public Adapter caseObjectSomeValuesFrom(ObjectSomeValuesFrom object)
      {
        return createObjectSomeValuesFromAdapter();
      }
      @Override
      public Adapter caseObjectAllValuesFrom(ObjectAllValuesFrom object)
      {
        return createObjectAllValuesFromAdapter();
      }
      @Override
      public Adapter caseObjectHasSelf(ObjectHasSelf object)
      {
        return createObjectHasSelfAdapter();
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
      public Adapter caseDataSomeValuesFrom(DataSomeValuesFrom object)
      {
        return createDataSomeValuesFromAdapter();
      }
      @Override
      public Adapter caseDataAllValuesFrom(DataAllValuesFrom object)
      {
        return createDataAllValuesFromAdapter();
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
      public Adapter caseClassAxiom(ClassAxiom object)
      {
        return createClassAxiomAdapter();
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
      public Adapter caseObjectPropertyAxiom(ObjectPropertyAxiom object)
      {
        return createObjectPropertyAxiomAdapter();
      }
      @Override
      public Adapter caseSubObjectPropertyOf(SubObjectPropertyOf object)
      {
        return createSubObjectPropertyOfAdapter();
      }
      @Override
      public Adapter caseSubObjectPropertyExpression(SubObjectPropertyExpression object)
      {
        return createSubObjectPropertyExpressionAdapter();
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
      public Adapter caseInverseObjectProperties(InverseObjectProperties object)
      {
        return createInverseObjectPropertiesAdapter();
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
      public Adapter caseDataPropertyAxiom(DataPropertyAxiom object)
      {
        return createDataPropertyAxiomAdapter();
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
      public Adapter caseDatatypeDefinition(DatatypeDefinition object)
      {
        return createDatatypeDefinitionAdapter();
      }
      @Override
      public Adapter caseHasKey(HasKey object)
      {
        return createHasKeyAdapter();
      }
      @Override
      public Adapter caseAssertion(Assertion object)
      {
        return createAssertionAdapter();
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
      public Adapter caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object)
      {
        return createNegativeObjectPropertyAssertionAdapter();
      }
      @Override
      public Adapter caseDataPropertyAssertion(DataPropertyAssertion object)
      {
        return createDataPropertyAssertionAdapter();
      }
      @Override
      public Adapter caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object)
      {
        return createNegativeDataPropertyAssertionAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseDLSafeRule(DLSafeRule object)
      {
        return createDLSafeRuleAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseClassAtom(ClassAtom object)
      {
        return createClassAtomAdapter();
      }
      @Override
      public Adapter caseDataRangeAtom(DataRangeAtom object)
      {
        return createDataRangeAtomAdapter();
      }
      @Override
      public Adapter caseObjectPropertyAtom(ObjectPropertyAtom object)
      {
        return createObjectPropertyAtomAdapter();
      }
      @Override
      public Adapter caseDataPropetyAtom(DataPropetyAtom object)
      {
        return createDataPropetyAtomAdapter();
      }
      @Override
      public Adapter caseBuiltInAtom(BuiltInAtom object)
      {
        return createBuiltInAtomAdapter();
      }
      @Override
      public Adapter caseSameIndividualAtom(SameIndividualAtom object)
      {
        return createSameIndividualAtomAdapter();
      }
      @Override
      public Adapter caseDifferentIndividualsAtom(DifferentIndividualsAtom object)
      {
        return createDifferentIndividualsAtomAdapter();
      }
      @Override
      public Adapter caseIArg(IArg object)
      {
        return createIArgAdapter();
      }
      @Override
      public Adapter caseDArg(DArg object)
      {
        return createDArgAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseDGRule(DGRule object)
      {
        return createDGRuleAdapter();
      }
      @Override
      public Adapter caseDGAtom(DGAtom object)
      {
        return createDGAtomAdapter();
      }
      @Override
      public Adapter caseDGAxiom(DGAxiom object)
      {
        return createDGAxiomAdapter();
      }
      @Override
      public Adapter caseDGNodes(DGNodes object)
      {
        return createDGNodesAdapter();
      }
      @Override
      public Adapter caseNodeAssertion(NodeAssertion object)
      {
        return createNodeAssertionAdapter();
      }
      @Override
      public Adapter caseDGEdges(DGEdges object)
      {
        return createDGEdgesAdapter();
      }
      @Override
      public Adapter caseEdgeAssertion(EdgeAssertion object)
      {
        return createEdgeAssertionAdapter();
      }
      @Override
      public Adapter caseMainClasses(MainClasses object)
      {
        return createMainClassesAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
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
      public Adapter casePackage(west.twouse.language.owl2fs.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseClassifierTemplateParameter(ClassifierTemplateParameter object)
      {
        return createClassifierTemplateParameterAdapter();
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
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.IRI <em>IRI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.IRI
   * @generated
   */
  public Adapter createIRIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.FullIRI <em>Full IRI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.FullIRI
   * @generated
   */
  public Adapter createFullIRIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AbbreviatedIRI <em>Abbreviated IRI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AbbreviatedIRI
   * @generated
   */
  public Adapter createAbbreviatedIRIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.OntologyDocument <em>Ontology Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.OntologyDocument
   * @generated
   */
  public Adapter createOntologyDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.PrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.PrefixDefinition
   * @generated
   */
  public Adapter createPrefixDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Ontology <em>Ontology</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Ontology
   * @generated
   */
  public Adapter createOntologyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Axiom <em>Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Axiom
   * @generated
   */
  public Adapter createAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ClassDeclaration
   * @generated
   */
  public Adapter createClassDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DatatypeDeclaration <em>Datatype Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DatatypeDeclaration
   * @generated
   */
  public Adapter createDatatypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectPropertyDeclaration <em>Object Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectPropertyDeclaration
   * @generated
   */
  public Adapter createObjectPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataPropertyDeclaration <em>Data Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataPropertyDeclaration
   * @generated
   */
  public Adapter createDataPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AnnotationPropertyDeclaration <em>Annotation Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AnnotationPropertyDeclaration
   * @generated
   */
  public Adapter createAnnotationPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.NamedIndividualDeclaration <em>Named Individual Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.NamedIndividualDeclaration
   * @generated
   */
  public Adapter createNamedIndividualDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AnnotationSubject <em>Annotation Subject</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AnnotationSubject
   * @generated
   */
  public Adapter createAnnotationSubjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AnnotationValue
   * @generated
   */
  public Adapter createAnnotationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AnnotationAxiom <em>Annotation Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AnnotationAxiom
   * @generated
   */
  public Adapter createAnnotationAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AnnotationAssertion <em>Annotation Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AnnotationAssertion
   * @generated
   */
  public Adapter createAnnotationAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.SubAnnotationPropertyOf <em>Sub Annotation Property Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.SubAnnotationPropertyOf
   * @generated
   */
  public Adapter createSubAnnotationPropertyOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AnnotationPropertyDomain <em>Annotation Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AnnotationPropertyDomain
   * @generated
   */
  public Adapter createAnnotationPropertyDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AnnotationPropertyRange <em>Annotation Property Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AnnotationPropertyRange
   * @generated
   */
  public Adapter createAnnotationPropertyRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AnnotationProperty
   * @generated
   */
  public Adapter createAnnotationPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataProperty <em>Data Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataProperty
   * @generated
   */
  public Adapter createDataPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Datatype
   * @generated
   */
  public Adapter createDatatypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectProperty
   * @generated
   */
  public Adapter createObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Individual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Individual
   * @generated
   */
  public Adapter createIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.NamedIndividual <em>Named Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.NamedIndividual
   * @generated
   */
  public Adapter createNamedIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AnonymousIndividual <em>Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AnonymousIndividual
   * @generated
   */
  public Adapter createAnonymousIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectPropertyExpression
   * @generated
   */
  public Adapter createObjectPropertyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.InverseObjectProperty <em>Inverse Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.InverseObjectProperty
   * @generated
   */
  public Adapter createInverseObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataPropertyExpression
   * @generated
   */
  public Adapter createDataPropertyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataRange
   * @generated
   */
  public Adapter createDataRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataIntersectionOf <em>Data Intersection Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataIntersectionOf
   * @generated
   */
  public Adapter createDataIntersectionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataUnionOf <em>Data Union Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataUnionOf
   * @generated
   */
  public Adapter createDataUnionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataComplementOf <em>Data Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataComplementOf
   * @generated
   */
  public Adapter createDataComplementOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataOneOf <em>Data One Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataOneOf
   * @generated
   */
  public Adapter createDataOneOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DatatypeRestriction <em>Datatype Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DatatypeRestriction
   * @generated
   */
  public Adapter createDatatypeRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.FacetConstraintPair <em>Facet Constraint Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.FacetConstraintPair
   * @generated
   */
  public Adapter createFacetConstraintPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ClassExpression
   * @generated
   */
  public Adapter createClassExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectIntersectionOf
   * @generated
   */
  public Adapter createObjectIntersectionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectUnionOf <em>Object Union Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectUnionOf
   * @generated
   */
  public Adapter createObjectUnionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectComplementOf <em>Object Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectComplementOf
   * @generated
   */
  public Adapter createObjectComplementOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectOneOf <em>Object One Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectOneOf
   * @generated
   */
  public Adapter createObjectOneOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectSomeValuesFrom
   * @generated
   */
  public Adapter createObjectSomeValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectAllValuesFrom <em>Object All Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectAllValuesFrom
   * @generated
   */
  public Adapter createObjectAllValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectHasSelf <em>Object Has Self</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectHasSelf
   * @generated
   */
  public Adapter createObjectHasSelfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectHasValue <em>Object Has Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectHasValue
   * @generated
   */
  public Adapter createObjectHasValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectMinCardinality
   * @generated
   */
  public Adapter createObjectMinCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectMaxCardinality
   * @generated
   */
  public Adapter createObjectMaxCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectExactCardinality
   * @generated
   */
  public Adapter createObjectExactCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataSomeValuesFrom <em>Data Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataSomeValuesFrom
   * @generated
   */
  public Adapter createDataSomeValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataAllValuesFrom <em>Data All Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataAllValuesFrom
   * @generated
   */
  public Adapter createDataAllValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataHasValue <em>Data Has Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataHasValue
   * @generated
   */
  public Adapter createDataHasValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataMinCardinality <em>Data Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataMinCardinality
   * @generated
   */
  public Adapter createDataMinCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataMaxCardinality <em>Data Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataMaxCardinality
   * @generated
   */
  public Adapter createDataMaxCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataExactCardinality <em>Data Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataExactCardinality
   * @generated
   */
  public Adapter createDataExactCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ClassAxiom <em>Class Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ClassAxiom
   * @generated
   */
  public Adapter createClassAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.SubClassOf <em>Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.SubClassOf
   * @generated
   */
  public Adapter createSubClassOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.EquivalentClasses <em>Equivalent Classes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.EquivalentClasses
   * @generated
   */
  public Adapter createEquivalentClassesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DisjointClasses <em>Disjoint Classes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DisjointClasses
   * @generated
   */
  public Adapter createDisjointClassesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DisjointUnion <em>Disjoint Union</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DisjointUnion
   * @generated
   */
  public Adapter createDisjointUnionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectPropertyAxiom <em>Object Property Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectPropertyAxiom
   * @generated
   */
  public Adapter createObjectPropertyAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.SubObjectPropertyOf
   * @generated
   */
  public Adapter createSubObjectPropertyOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.SubObjectPropertyExpression <em>Sub Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.SubObjectPropertyExpression
   * @generated
   */
  public Adapter createSubObjectPropertyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectPropertyChain <em>Object Property Chain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectPropertyChain
   * @generated
   */
  public Adapter createObjectPropertyChainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.EquivalentObjectProperties
   * @generated
   */
  public Adapter createEquivalentObjectPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DisjointObjectProperties <em>Disjoint Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DisjointObjectProperties
   * @generated
   */
  public Adapter createDisjointObjectPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectPropertyDomain <em>Object Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectPropertyDomain
   * @generated
   */
  public Adapter createObjectPropertyDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectPropertyRange <em>Object Property Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectPropertyRange
   * @generated
   */
  public Adapter createObjectPropertyRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.InverseObjectProperties <em>Inverse Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.InverseObjectProperties
   * @generated
   */
  public Adapter createInverseObjectPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.FunctionalObjectProperty <em>Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.FunctionalObjectProperty
   * @generated
   */
  public Adapter createFunctionalObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.InverseFunctionalObjectProperty
   * @generated
   */
  public Adapter createInverseFunctionalObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ReflexiveObjectProperty
   * @generated
   */
  public Adapter createReflexiveObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.IrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.IrreflexiveObjectProperty
   * @generated
   */
  public Adapter createIrreflexiveObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.SymmetricObjectProperty
   * @generated
   */
  public Adapter createSymmetricObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.AsymmetricObjectProperty <em>Asymmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.AsymmetricObjectProperty
   * @generated
   */
  public Adapter createAsymmetricObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.TransitiveObjectProperty
   * @generated
   */
  public Adapter createTransitiveObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataPropertyAxiom <em>Data Property Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataPropertyAxiom
   * @generated
   */
  public Adapter createDataPropertyAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.SubDataPropertyOf
   * @generated
   */
  public Adapter createSubDataPropertyOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.EquivalentDataProperties <em>Equivalent Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.EquivalentDataProperties
   * @generated
   */
  public Adapter createEquivalentDataPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DisjointDataProperties <em>Disjoint Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DisjointDataProperties
   * @generated
   */
  public Adapter createDisjointDataPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataPropertyDomain <em>Data Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataPropertyDomain
   * @generated
   */
  public Adapter createDataPropertyDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataPropertyRange <em>Data Property Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataPropertyRange
   * @generated
   */
  public Adapter createDataPropertyRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.FunctionalDataProperty <em>Functional Data Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.FunctionalDataProperty
   * @generated
   */
  public Adapter createFunctionalDataPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DatatypeDefinition <em>Datatype Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DatatypeDefinition
   * @generated
   */
  public Adapter createDatatypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.HasKey <em>Has Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.HasKey
   * @generated
   */
  public Adapter createHasKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Assertion
   * @generated
   */
  public Adapter createAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.SameIndividual <em>Same Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.SameIndividual
   * @generated
   */
  public Adapter createSameIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DifferentIndividuals <em>Different Individuals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DifferentIndividuals
   * @generated
   */
  public Adapter createDifferentIndividualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ClassAssertion <em>Class Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ClassAssertion
   * @generated
   */
  public Adapter createClassAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectPropertyAssertion
   * @generated
   */
  public Adapter createObjectPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.NegativeObjectPropertyAssertion
   * @generated
   */
  public Adapter createNegativeObjectPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataPropertyAssertion <em>Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataPropertyAssertion
   * @generated
   */
  public Adapter createDataPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.NegativeDataPropertyAssertion
   * @generated
   */
  public Adapter createNegativeDataPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DLSafeRule <em>DL Safe Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DLSafeRule
   * @generated
   */
  public Adapter createDLSafeRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ClassAtom <em>Class Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ClassAtom
   * @generated
   */
  public Adapter createClassAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataRangeAtom <em>Data Range Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataRangeAtom
   * @generated
   */
  public Adapter createDataRangeAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ObjectPropertyAtom <em>Object Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ObjectPropertyAtom
   * @generated
   */
  public Adapter createObjectPropertyAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DataPropetyAtom <em>Data Propety Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DataPropetyAtom
   * @generated
   */
  public Adapter createDataPropetyAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.BuiltInAtom <em>Built In Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.BuiltInAtom
   * @generated
   */
  public Adapter createBuiltInAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.SameIndividualAtom <em>Same Individual Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.SameIndividualAtom
   * @generated
   */
  public Adapter createSameIndividualAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DifferentIndividualsAtom <em>Different Individuals Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DifferentIndividualsAtom
   * @generated
   */
  public Adapter createDifferentIndividualsAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.IArg <em>IArg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.IArg
   * @generated
   */
  public Adapter createIArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DArg <em>DArg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DArg
   * @generated
   */
  public Adapter createDArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DGRule <em>DG Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DGRule
   * @generated
   */
  public Adapter createDGRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DGAtom <em>DG Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DGAtom
   * @generated
   */
  public Adapter createDGAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DGAxiom <em>DG Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DGAxiom
   * @generated
   */
  public Adapter createDGAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DGNodes <em>DG Nodes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DGNodes
   * @generated
   */
  public Adapter createDGNodesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.NodeAssertion <em>Node Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.NodeAssertion
   * @generated
   */
  public Adapter createNodeAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.DGEdges <em>DG Edges</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.DGEdges
   * @generated
   */
  public Adapter createDGEdgesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.EdgeAssertion <em>Edge Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.EdgeAssertion
   * @generated
   */
  public Adapter createEdgeAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.MainClasses <em>Main Classes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.MainClasses
   * @generated
   */
  public Adapter createMainClassesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.TemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.TemplateParameter
   * @generated
   */
  public Adapter createTemplateParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ParameterableElement <em>Parameterable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ParameterableElement
   * @generated
   */
  public Adapter createParameterableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.TemplateSignature <em>Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.TemplateSignature
   * @generated
   */
  public Adapter createTemplateSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.TemplateableElement <em>Templateable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.TemplateableElement
   * @generated
   */
  public Adapter createTemplateableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.ClassifierTemplateParameter
   * @generated
   */
  public Adapter createClassifierTemplateParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.TemplateParameterSubstitution
   * @generated
   */
  public Adapter createTemplateParameterSubstitutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link west.twouse.language.owl2fs.TemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.owl2fs.TemplateBinding
   * @generated
   */
  public Adapter createTemplateBindingAdapter()
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

} //Owl2fsAdapterFactory
