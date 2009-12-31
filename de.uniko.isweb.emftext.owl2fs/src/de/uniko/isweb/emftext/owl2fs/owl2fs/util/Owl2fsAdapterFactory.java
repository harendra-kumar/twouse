/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.util;

import de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByAnonymousIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByEntity;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Assertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Atom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAxiom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassifierTemplateParameter;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Constant;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DObject;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAxiom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataRange;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom;
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
import de.uniko.isweb.emftext.owl2fs.owl2fs.Entity;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Expression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.IObject;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Individual;
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
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAndDataPropertyAxiom;
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
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAxiom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology;
import de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement;
import de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition;
import de.uniko.isweb.emftext.owl2fs.owl2fs.PropertyAtom;
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
import de.uniko.isweb.emftext.owl2fs.owl2fs.Term;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.URI;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage
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
      public Adapter caseAssertion(Assertion object)
      {
        return createAssertionAdapter();
      }
      @Override
      public Adapter caseAxiom(Axiom object)
      {
        return createAxiomAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseAnnotationProperty(AnnotationProperty object)
      {
        return createAnnotationPropertyAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseURI(URI object)
      {
        return createURIAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseDatatype(Datatype object)
      {
        return createDatatypeAdapter();
      }
      @Override
      public Adapter caseDataRange(DataRange object)
      {
        return createDataRangeAdapter();
      }
      @Override
      public Adapter caseDataPropertyAxiom(DataPropertyAxiom object)
      {
        return createDataPropertyAxiomAdapter();
      }
      @Override
      public Adapter caseObjectPropertyAxiom(ObjectPropertyAxiom object)
      {
        return createObjectPropertyAxiomAdapter();
      }
      @Override
      public Adapter caseClassExpression(ClassExpression object)
      {
        return createClassExpressionAdapter();
      }
      @Override
      public Adapter caseClassAxiom(ClassAxiom object)
      {
        return createClassAxiomAdapter();
      }
      @Override
      public Adapter caseDataPropertyExpression(DataPropertyExpression object)
      {
        return createDataPropertyExpressionAdapter();
      }
      @Override
      public Adapter caseObjectPropertyExpression(ObjectPropertyExpression object)
      {
        return createObjectPropertyExpressionAdapter();
      }
      @Override
      public Adapter caseAsymmetricObjectProperty(AsymmetricObjectProperty object)
      {
        return createAsymmetricObjectPropertyAdapter();
      }
      @Override
      public Adapter caseObjectProperty(ObjectProperty object)
      {
        return createObjectPropertyAdapter();
      }
      @Override
      public Adapter caseInverseObjectProperty(InverseObjectProperty object)
      {
        return createInverseObjectPropertyAdapter();
      }
      @Override
      public Adapter caseClass(de.uniko.isweb.emftext.owl2fs.owl2fs.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseObjectIntersectionOf(ObjectIntersectionOf object)
      {
        return createObjectIntersectionOfAdapter();
      }
      @Override
      public Adapter caseObjectOneOf(ObjectOneOf object)
      {
        return createObjectOneOfAdapter();
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
      public Adapter caseObjectExistsSelf(ObjectExistsSelf object)
      {
        return createObjectExistsSelfAdapter();
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
      public Adapter caseDataSomeValuesFrom(DataSomeValuesFrom object)
      {
        return createDataSomeValuesFromAdapter();
      }
      @Override
      public Adapter caseDataProperty(DataProperty object)
      {
        return createDataPropertyAdapter();
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
      public Adapter caseFacetConstantPair(FacetConstantPair object)
      {
        return createFacetConstantPairAdapter();
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
      public Adapter caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object)
      {
        return createNegativeDataPropertyAssertionAdapter();
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
      public Adapter caseDifferentIndividuals(DifferentIndividuals object)
      {
        return createDifferentIndividualsAdapter();
      }
      @Override
      public Adapter caseDisjointClasses(DisjointClasses object)
      {
        return createDisjointClassesAdapter();
      }
      @Override
      public Adapter caseDisjointDataProperties(DisjointDataProperties object)
      {
        return createDisjointDataPropertiesAdapter();
      }
      @Override
      public Adapter caseDisjointObjectProperties(DisjointObjectProperties object)
      {
        return createDisjointObjectPropertiesAdapter();
      }
      @Override
      public Adapter caseDisjointUnion(DisjointUnion object)
      {
        return createDisjointUnionAdapter();
      }
      @Override
      public Adapter caseEquivalentClasses(EquivalentClasses object)
      {
        return createEquivalentClassesAdapter();
      }
      @Override
      public Adapter caseEquivalentDataProperties(EquivalentDataProperties object)
      {
        return createEquivalentDataPropertiesAdapter();
      }
      @Override
      public Adapter caseEquivalentObjectProperties(EquivalentObjectProperties object)
      {
        return createEquivalentObjectPropertiesAdapter();
      }
      @Override
      public Adapter caseFunctionalDataProperty(FunctionalDataProperty object)
      {
        return createFunctionalDataPropertyAdapter();
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
      public Adapter caseObjectPropertyDomain(ObjectPropertyDomain object)
      {
        return createObjectPropertyDomainAdapter();
      }
      @Override
      public Adapter caseSymmetricObjectProperty(SymmetricObjectProperty object)
      {
        return createSymmetricObjectPropertyAdapter();
      }
      @Override
      public Adapter caseReflexiveObjectProperty(ReflexiveObjectProperty object)
      {
        return createReflexiveObjectPropertyAdapter();
      }
      @Override
      public Adapter caseSubDataPropertyOf(SubDataPropertyOf object)
      {
        return createSubDataPropertyOfAdapter();
      }
      @Override
      public Adapter caseSameIndividual(SameIndividual object)
      {
        return createSameIndividualAdapter();
      }
      @Override
      public Adapter caseSubObjectPropertyOf(SubObjectPropertyOf object)
      {
        return createSubObjectPropertyOfAdapter();
      }
      @Override
      public Adapter caseObjectComplementOf(ObjectComplementOf object)
      {
        return createObjectComplementOfAdapter();
      }
      @Override
      public Adapter caseOntology(Ontology object)
      {
        return createOntologyAdapter();
      }
      @Override
      public Adapter caseObjectPropertyRange(ObjectPropertyRange object)
      {
        return createObjectPropertyRangeAdapter();
      }
      @Override
      public Adapter caseDataPropertyAssertion(DataPropertyAssertion object)
      {
        return createDataPropertyAssertionAdapter();
      }
      @Override
      public Adapter caseClassAssertion(ClassAssertion object)
      {
        return createClassAssertionAdapter();
      }
      @Override
      public Adapter caseIrreflexiveObjectProperty(IrreflexiveObjectProperty object)
      {
        return createIrreflexiveObjectPropertyAdapter();
      }
      @Override
      public Adapter caseObjectExactCardinality(ObjectExactCardinality object)
      {
        return createObjectExactCardinalityAdapter();
      }
      @Override
      public Adapter caseDataComplementOf(DataComplementOf object)
      {
        return createDataComplementOfAdapter();
      }
      @Override
      public Adapter caseSubClassOf(SubClassOf object)
      {
        return createSubClassOfAdapter();
      }
      @Override
      public Adapter caseSubObjectProperty(SubObjectProperty object)
      {
        return createSubObjectPropertyAdapter();
      }
      @Override
      public Adapter caseTransitiveObjectProperty(TransitiveObjectProperty object)
      {
        return createTransitiveObjectPropertyAdapter();
      }
      @Override
      public Adapter caseEntityAnnotation(EntityAnnotation object)
      {
        return createEntityAnnotationAdapter();
      }
      @Override
      public Adapter caseFullURI(FullURI object)
      {
        return createFullURIAdapter();
      }
      @Override
      public Adapter caseAbbreviatedURI(AbbreviatedURI object)
      {
        return createAbbreviatedURIAdapter();
      }
      @Override
      public Adapter caseObjectUnionOf(ObjectUnionOf object)
      {
        return createObjectUnionOfAdapter();
      }
      @Override
      public Adapter caseInverseObjectProperties(InverseObjectProperties object)
      {
        return createInverseObjectPropertiesAdapter();
      }
      @Override
      public Adapter caseAnnotationByConstant(AnnotationByConstant object)
      {
        return createAnnotationByConstantAdapter();
      }
      @Override
      public Adapter caseAnnotationByEntity(AnnotationByEntity object)
      {
        return createAnnotationByEntityAdapter();
      }
      @Override
      public Adapter caseAnnotationByAnonymousIndividual(AnnotationByAnonymousIndividual object)
      {
        return createAnnotationByAnonymousIndividualAdapter();
      }
      @Override
      public Adapter caseAnonymousIndividual(AnonymousIndividual object)
      {
        return createAnonymousIndividualAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseObjectAndDataPropertyAxiom(ObjectAndDataPropertyAxiom object)
      {
        return createObjectAndDataPropertyAxiomAdapter();
      }
      @Override
      public Adapter caseKeyFor(KeyFor object)
      {
        return createKeyForAdapter();
      }
      @Override
      public Adapter caseAnonymousIndividualAnnotation(AnonymousIndividualAnnotation object)
      {
        return createAnonymousIndividualAnnotationAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
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
      public Adapter casePackage(de.uniko.isweb.emftext.owl2fs.owl2fs.Package object)
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
      public Adapter caseDObject(DObject object)
      {
        return createDObjectAdapter();
      }
      @Override
      public Adapter caseIObject(IObject object)
      {
        return createIObjectAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseAntecedent(Antecedent object)
      {
        return createAntecedentAdapter();
      }
      @Override
      public Adapter caseConsequent(Consequent object)
      {
        return createConsequentAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseDataRangeAtom(DataRangeAtom object)
      {
        return createDataRangeAtomAdapter();
      }
      @Override
      public Adapter caseClassAtom(ClassAtom object)
      {
        return createClassAtomAdapter();
      }
      @Override
      public Adapter casePropertyAtom(PropertyAtom object)
      {
        return createPropertyAtomAdapter();
      }
      @Override
      public Adapter caseIndividualPropetyAtom(IndividualPropetyAtom object)
      {
        return createIndividualPropetyAtomAdapter();
      }
      @Override
      public Adapter caseDatavaluedPropertyAtom(DatavaluedPropertyAtom object)
      {
        return createDatavaluedPropertyAtomAdapter();
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
      public Adapter caseDataVariable(DataVariable object)
      {
        return createDataVariableAdapter();
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
      public Adapter caseBuiltInAtom(BuiltInAtom object)
      {
        return createBuiltInAtomAdapter();
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
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Assertion
   * @generated
   */
  public Adapter createAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom <em>Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom
   * @generated
   */
  public Adapter createAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty
   * @generated
   */
  public Adapter createAnnotationPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.URI
   * @generated
   */
  public Adapter createURIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype
   * @generated
   */
  public Adapter createDatatypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataRange
   * @generated
   */
  public Adapter createDataRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAxiom <em>Data Property Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAxiom
   * @generated
   */
  public Adapter createDataPropertyAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAxiom <em>Object Property Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAxiom
   * @generated
   */
  public Adapter createObjectPropertyAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassExpression
   * @generated
   */
  public Adapter createClassExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAxiom <em>Class Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAxiom
   * @generated
   */
  public Adapter createClassAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression
   * @generated
   */
  public Adapter createDataPropertyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression
   * @generated
   */
  public Adapter createObjectPropertyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty <em>Asymmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty
   * @generated
   */
  public Adapter createAsymmetricObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty
   * @generated
   */
  public Adapter createObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty <em>Inverse Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty
   * @generated
   */
  public Adapter createInverseObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf
   * @generated
   */
  public Adapter createObjectIntersectionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf <em>Object One Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf
   * @generated
   */
  public Adapter createObjectOneOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Individual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Individual
   * @generated
   */
  public Adapter createIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual <em>Named Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual
   * @generated
   */
  public Adapter createNamedIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom
   * @generated
   */
  public Adapter createObjectSomeValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom <em>Object All Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom
   * @generated
   */
  public Adapter createObjectAllValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf <em>Object Exists Self</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf
   * @generated
   */
  public Adapter createObjectExistsSelfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue <em>Object Has Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue
   * @generated
   */
  public Adapter createObjectHasValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality
   * @generated
   */
  public Adapter createObjectMinCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality
   * @generated
   */
  public Adapter createObjectMaxCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom <em>Data Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom
   * @generated
   */
  public Adapter createDataSomeValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty <em>Data Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty
   * @generated
   */
  public Adapter createDataPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf <em>Data One Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf
   * @generated
   */
  public Adapter createDataOneOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction <em>Datatype Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction
   * @generated
   */
  public Adapter createDatatypeRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair <em>Facet Constant Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair
   * @generated
   */
  public Adapter createFacetConstantPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom <em>Data All Values From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom
   * @generated
   */
  public Adapter createDataAllValuesFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue <em>Data Has Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue
   * @generated
   */
  public Adapter createDataHasValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality <em>Data Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality
   * @generated
   */
  public Adapter createDataMinCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality <em>Data Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality
   * @generated
   */
  public Adapter createDataMaxCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality <em>Data Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality
   * @generated
   */
  public Adapter createDataExactCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion
   * @generated
   */
  public Adapter createNegativeDataPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain <em>Data Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain
   * @generated
   */
  public Adapter createDataPropertyDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange <em>Data Property Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange
   * @generated
   */
  public Adapter createDataPropertyRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals <em>Different Individuals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals
   * @generated
   */
  public Adapter createDifferentIndividualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses <em>Disjoint Classes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses
   * @generated
   */
  public Adapter createDisjointClassesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties <em>Disjoint Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties
   * @generated
   */
  public Adapter createDisjointDataPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties <em>Disjoint Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties
   * @generated
   */
  public Adapter createDisjointObjectPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion <em>Disjoint Union</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion
   * @generated
   */
  public Adapter createDisjointUnionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses <em>Equivalent Classes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses
   * @generated
   */
  public Adapter createEquivalentClassesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties <em>Equivalent Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties
   * @generated
   */
  public Adapter createEquivalentDataPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties
   * @generated
   */
  public Adapter createEquivalentObjectPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty <em>Functional Data Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty
   * @generated
   */
  public Adapter createFunctionalDataPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty <em>Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty
   * @generated
   */
  public Adapter createFunctionalObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty
   * @generated
   */
  public Adapter createInverseFunctionalObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion
   * @generated
   */
  public Adapter createObjectPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion
   * @generated
   */
  public Adapter createNegativeObjectPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain <em>Object Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain
   * @generated
   */
  public Adapter createObjectPropertyDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty
   * @generated
   */
  public Adapter createSymmetricObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty
   * @generated
   */
  public Adapter createReflexiveObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf
   * @generated
   */
  public Adapter createSubDataPropertyOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual <em>Same Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual
   * @generated
   */
  public Adapter createSameIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf
   * @generated
   */
  public Adapter createSubObjectPropertyOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf <em>Object Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf
   * @generated
   */
  public Adapter createObjectComplementOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology <em>Ontology</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology
   * @generated
   */
  public Adapter createOntologyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange <em>Object Property Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange
   * @generated
   */
  public Adapter createObjectPropertyRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion <em>Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion
   * @generated
   */
  public Adapter createDataPropertyAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion <em>Class Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion
   * @generated
   */
  public Adapter createClassAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty
   * @generated
   */
  public Adapter createIrreflexiveObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality
   * @generated
   */
  public Adapter createObjectExactCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf <em>Data Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf
   * @generated
   */
  public Adapter createDataComplementOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf <em>Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf
   * @generated
   */
  public Adapter createSubClassOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectProperty <em>Sub Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectProperty
   * @generated
   */
  public Adapter createSubObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty
   * @generated
   */
  public Adapter createTransitiveObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation <em>Entity Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation
   * @generated
   */
  public Adapter createEntityAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI <em>Full URI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI
   * @generated
   */
  public Adapter createFullURIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI <em>Abbreviated URI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI
   * @generated
   */
  public Adapter createAbbreviatedURIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf <em>Object Union Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf
   * @generated
   */
  public Adapter createObjectUnionOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties <em>Inverse Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties
   * @generated
   */
  public Adapter createInverseObjectPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant <em>Annotation By Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant
   * @generated
   */
  public Adapter createAnnotationByConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByEntity <em>Annotation By Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByEntity
   * @generated
   */
  public Adapter createAnnotationByEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByAnonymousIndividual <em>Annotation By Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByAnonymousIndividual
   * @generated
   */
  public Adapter createAnnotationByAnonymousIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual <em>Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual
   * @generated
   */
  public Adapter createAnonymousIndividualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAndDataPropertyAxiom <em>Object And Data Property Axiom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAndDataPropertyAxiom
   * @generated
   */
  public Adapter createObjectAndDataPropertyAxiomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor <em>Key For</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor
   * @generated
   */
  public Adapter createKeyForAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation <em>Anonymous Individual Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation
   * @generated
   */
  public Adapter createAnonymousIndividualAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument <em>Ontology Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument
   * @generated
   */
  public Adapter createOntologyDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition
   * @generated
   */
  public Adapter createPrefixDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter
   * @generated
   */
  public Adapter createTemplateParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement <em>Parameterable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement
   * @generated
   */
  public Adapter createParameterableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature <em>Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature
   * @generated
   */
  public Adapter createTemplateSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement <em>Templateable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement
   * @generated
   */
  public Adapter createTemplateableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassifierTemplateParameter
   * @generated
   */
  public Adapter createClassifierTemplateParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution
   * @generated
   */
  public Adapter createTemplateParameterSubstitutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding
   * @generated
   */
  public Adapter createTemplateBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DObject <em>DObject</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DObject
   * @generated
   */
  public Adapter createDObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IObject <em>IObject</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IObject
   * @generated
   */
  public Adapter createIObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent <em>Antecedent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent
   * @generated
   */
  public Adapter createAntecedentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent <em>Consequent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent
   * @generated
   */
  public Adapter createConsequentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom <em>Data Range Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom
   * @generated
   */
  public Adapter createDataRangeAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom <em>Class Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom
   * @generated
   */
  public Adapter createClassAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.PropertyAtom <em>Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.PropertyAtom
   * @generated
   */
  public Adapter createPropertyAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom <em>Individual Propety Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom
   * @generated
   */
  public Adapter createIndividualPropetyAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom <em>Datavalued Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom
   * @generated
   */
  public Adapter createDatavaluedPropertyAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.DataVariable <em>Data Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.DataVariable
   * @generated
   */
  public Adapter createDataVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualVariable <em>Individual Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualVariable
   * @generated
   */
  public Adapter createIndividualVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom <em>Built In Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom
   * @generated
   */
  public Adapter createBuiltInAtomAdapter()
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
