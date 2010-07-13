/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see west.twouse.language.sparqlas.SparqlasPackage
 * @generated
 */
public class SparqlasSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SparqlasPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SparqlasSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SparqlasPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SparqlasPackage.ONTOLOGY_DOCUMENT:
      {
        OntologyDocument ontologyDocument = (OntologyDocument)theEObject;
        T result = caseOntologyDocument(ontologyDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.PREFIX_DEFINITION:
      {
        PrefixDefinition prefixDefinition = (PrefixDefinition)theEObject;
        T result = casePrefixDefinition(prefixDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.QUERY:
      {
        Query query = (Query)theEObject;
        T result = caseQuery(query);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.SELECT_QUERY:
      {
        SelectQuery selectQuery = (SelectQuery)theEObject;
        T result = caseSelectQuery(selectQuery);
        if (result == null) result = caseQuery(selectQuery);
        if (result == null) result = caseTemplateableElement(selectQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.CONSTRUCT_QUERY:
      {
        ConstructQuery constructQuery = (ConstructQuery)theEObject;
        T result = caseConstructQuery(constructQuery);
        if (result == null) result = caseQuery(constructQuery);
        if (result == null) result = caseTemplateableElement(constructQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.ASK_QUERY:
      {
        AskQuery askQuery = (AskQuery)theEObject;
        T result = caseAskQuery(askQuery);
        if (result == null) result = caseQuery(askQuery);
        if (result == null) result = caseTemplateableElement(askQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DESCRIBE_QUERY:
      {
        DescribeQuery describeQuery = (DescribeQuery)theEObject;
        T result = caseDescribeQuery(describeQuery);
        if (result == null) result = caseQuery(describeQuery);
        if (result == null) result = caseTemplateableElement(describeQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.IRI:
      {
        IRI iri = (IRI)theEObject;
        T result = caseIRI(iri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.FULL_IRI:
      {
        FullIRI fullIRI = (FullIRI)theEObject;
        T result = caseFullIRI(fullIRI);
        if (result == null) result = caseIRI(fullIRI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.ABBREVIATED_IRI:
      {
        AbbreviatedIRI abbreviatedIRI = (AbbreviatedIRI)theEObject;
        T result = caseAbbreviatedIRI(abbreviatedIRI);
        if (result == null) result = caseIRI(abbreviatedIRI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseTerm(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.CLASS_VARIABLE:
      {
        ClassVariable classVariable = (ClassVariable)theEObject;
        T result = caseClassVariable(classVariable);
        if (result == null) result = caseVariable(classVariable);
        if (result == null) result = caseClassExpression(classVariable);
        if (result == null) result = caseTerm(classVariable);
        if (result == null) result = caseExpression(classVariable);
        if (result == null) result = caseParameterableElement(classVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_PROPERTY_VARIABLE:
      {
        ObjectPropertyVariable objectPropertyVariable = (ObjectPropertyVariable)theEObject;
        T result = caseObjectPropertyVariable(objectPropertyVariable);
        if (result == null) result = caseVariable(objectPropertyVariable);
        if (result == null) result = caseObjectPropertyExpression(objectPropertyVariable);
        if (result == null) result = caseTerm(objectPropertyVariable);
        if (result == null) result = caseExpression(objectPropertyVariable);
        if (result == null) result = caseParameterableElement(objectPropertyVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_PROPERTY_VARIABLE:
      {
        DataPropertyVariable dataPropertyVariable = (DataPropertyVariable)theEObject;
        T result = caseDataPropertyVariable(dataPropertyVariable);
        if (result == null) result = caseVariable(dataPropertyVariable);
        if (result == null) result = caseDataPropertyExpression(dataPropertyVariable);
        if (result == null) result = caseTerm(dataPropertyVariable);
        if (result == null) result = caseExpression(dataPropertyVariable);
        if (result == null) result = caseParameterableElement(dataPropertyVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.INDIVIDUAL_VARIABLE:
      {
        IndividualVariable individualVariable = (IndividualVariable)theEObject;
        T result = caseIndividualVariable(individualVariable);
        if (result == null) result = caseVariable(individualVariable);
        if (result == null) result = caseIndividual(individualVariable);
        if (result == null) result = caseTerm(individualVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseTerm(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.CLASS:
      {
        west.twouse.language.sparqlas.Class class_ = (west.twouse.language.sparqlas.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseClassExpression(class_);
        if (result == null) result = caseConstant(class_);
        if (result == null) result = caseExpression(class_);
        if (result == null) result = caseTerm(class_);
        if (result == null) result = caseParameterableElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATATYPE:
      {
        Datatype datatype = (Datatype)theEObject;
        T result = caseDatatype(datatype);
        if (result == null) result = caseConstant(datatype);
        if (result == null) result = caseDataRange(datatype);
        if (result == null) result = caseTerm(datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_PROPERTY:
      {
        ObjectProperty objectProperty = (ObjectProperty)theEObject;
        T result = caseObjectProperty(objectProperty);
        if (result == null) result = caseObjectPropertyExpression(objectProperty);
        if (result == null) result = caseConstant(objectProperty);
        if (result == null) result = caseExpression(objectProperty);
        if (result == null) result = caseTerm(objectProperty);
        if (result == null) result = caseParameterableElement(objectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_PROPERTY:
      {
        DataProperty dataProperty = (DataProperty)theEObject;
        T result = caseDataProperty(dataProperty);
        if (result == null) result = caseDataPropertyExpression(dataProperty);
        if (result == null) result = caseConstant(dataProperty);
        if (result == null) result = caseExpression(dataProperty);
        if (result == null) result = caseTerm(dataProperty);
        if (result == null) result = caseParameterableElement(dataProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.INDIVIDUAL:
      {
        Individual individual = (Individual)theEObject;
        T result = caseIndividual(individual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.NAMED_INDIVIDUAL:
      {
        NamedIndividual namedIndividual = (NamedIndividual)theEObject;
        T result = caseNamedIndividual(namedIndividual);
        if (result == null) result = caseIndividual(namedIndividual);
        if (result == null) result = caseConstant(namedIndividual);
        if (result == null) result = caseTerm(namedIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.ANONYMOUS_INDIVIDUAL:
      {
        AnonymousIndividual anonymousIndividual = (AnonymousIndividual)theEObject;
        T result = caseAnonymousIndividual(anonymousIndividual);
        if (result == null) result = caseIndividual(anonymousIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.ABSTRACT_LITERAL:
      {
        AbstractLiteral abstractLiteral = (AbstractLiteral)theEObject;
        T result = caseAbstractLiteral(abstractLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.LITERAL_VARIABLE:
      {
        LiteralVariable literalVariable = (LiteralVariable)theEObject;
        T result = caseLiteralVariable(literalVariable);
        if (result == null) result = caseVariable(literalVariable);
        if (result == null) result = caseAbstractLiteral(literalVariable);
        if (result == null) result = caseTerm(literalVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseAbstractLiteral(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseParameterableElement(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.ATOM:
      {
        Atom atom = (Atom)theEObject;
        T result = caseAtom(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.ASSERTION:
      {
        Assertion assertion = (Assertion)theEObject;
        T result = caseAssertion(assertion);
        if (result == null) result = caseAtom(assertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.CLASS_ASSERTION:
      {
        ClassAssertion classAssertion = (ClassAssertion)theEObject;
        T result = caseClassAssertion(classAssertion);
        if (result == null) result = caseAssertion(classAssertion);
        if (result == null) result = caseAtom(classAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_PROPERTY_ASSERTION:
      {
        ObjectPropertyAssertion objectPropertyAssertion = (ObjectPropertyAssertion)theEObject;
        T result = caseObjectPropertyAssertion(objectPropertyAssertion);
        if (result == null) result = caseAssertion(objectPropertyAssertion);
        if (result == null) result = caseAtom(objectPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_PROPERTY_ASSERTION:
      {
        DataPropertyAssertion dataPropertyAssertion = (DataPropertyAssertion)theEObject;
        T result = caseDataPropertyAssertion(dataPropertyAssertion);
        if (result == null) result = caseAssertion(dataPropertyAssertion);
        if (result == null) result = caseAtom(dataPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION:
      {
        NegativeObjectPropertyAssertion negativeObjectPropertyAssertion = (NegativeObjectPropertyAssertion)theEObject;
        T result = caseNegativeObjectPropertyAssertion(negativeObjectPropertyAssertion);
        if (result == null) result = caseAssertion(negativeObjectPropertyAssertion);
        if (result == null) result = caseAtom(negativeObjectPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.NEGATIVE_DATA_PROPERTY_ASSERTION:
      {
        NegativeDataPropertyAssertion negativeDataPropertyAssertion = (NegativeDataPropertyAssertion)theEObject;
        T result = caseNegativeDataPropertyAssertion(negativeDataPropertyAssertion);
        if (result == null) result = caseAssertion(negativeDataPropertyAssertion);
        if (result == null) result = caseAtom(negativeDataPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.SAME_INDIVIDUAL:
      {
        SameIndividual sameIndividual = (SameIndividual)theEObject;
        T result = caseSameIndividual(sameIndividual);
        if (result == null) result = caseAssertion(sameIndividual);
        if (result == null) result = caseAtom(sameIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DIFFERENT_INDIVIDUALS:
      {
        DifferentIndividuals differentIndividuals = (DifferentIndividuals)theEObject;
        T result = caseDifferentIndividuals(differentIndividuals);
        if (result == null) result = caseAssertion(differentIndividuals);
        if (result == null) result = caseAtom(differentIndividuals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.CLASS_ATOM:
      {
        ClassAtom classAtom = (ClassAtom)theEObject;
        T result = caseClassAtom(classAtom);
        if (result == null) result = caseAtom(classAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.SUB_CLASS_OF:
      {
        SubClassOf subClassOf = (SubClassOf)theEObject;
        T result = caseSubClassOf(subClassOf);
        if (result == null) result = caseClassAtom(subClassOf);
        if (result == null) result = caseAtom(subClassOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.EQUIVALENT_CLASSES:
      {
        EquivalentClasses equivalentClasses = (EquivalentClasses)theEObject;
        T result = caseEquivalentClasses(equivalentClasses);
        if (result == null) result = caseClassAtom(equivalentClasses);
        if (result == null) result = caseAtom(equivalentClasses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DISJOINT_CLASSES:
      {
        DisjointClasses disjointClasses = (DisjointClasses)theEObject;
        T result = caseDisjointClasses(disjointClasses);
        if (result == null) result = caseClassAtom(disjointClasses);
        if (result == null) result = caseAtom(disjointClasses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DISJOINT_UNION:
      {
        DisjointUnion disjointUnion = (DisjointUnion)theEObject;
        T result = caseDisjointUnion(disjointUnion);
        if (result == null) result = caseClassAtom(disjointUnion);
        if (result == null) result = caseAtom(disjointUnion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.CLASS_EXPRESSION:
      {
        ClassExpression classExpression = (ClassExpression)theEObject;
        T result = caseClassExpression(classExpression);
        if (result == null) result = caseExpression(classExpression);
        if (result == null) result = caseParameterableElement(classExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_UNION_OF:
      {
        ObjectUnionOf objectUnionOf = (ObjectUnionOf)theEObject;
        T result = caseObjectUnionOf(objectUnionOf);
        if (result == null) result = caseClassExpression(objectUnionOf);
        if (result == null) result = caseExpression(objectUnionOf);
        if (result == null) result = caseParameterableElement(objectUnionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_COMPLEMENT_OF:
      {
        ObjectComplementOf objectComplementOf = (ObjectComplementOf)theEObject;
        T result = caseObjectComplementOf(objectComplementOf);
        if (result == null) result = caseClassExpression(objectComplementOf);
        if (result == null) result = caseExpression(objectComplementOf);
        if (result == null) result = caseParameterableElement(objectComplementOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_ONE_OF:
      {
        ObjectOneOf objectOneOf = (ObjectOneOf)theEObject;
        T result = caseObjectOneOf(objectOneOf);
        if (result == null) result = caseClassExpression(objectOneOf);
        if (result == null) result = caseExpression(objectOneOf);
        if (result == null) result = caseParameterableElement(objectOneOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_INTERSECTION_OF:
      {
        ObjectIntersectionOf objectIntersectionOf = (ObjectIntersectionOf)theEObject;
        T result = caseObjectIntersectionOf(objectIntersectionOf);
        if (result == null) result = caseClassExpression(objectIntersectionOf);
        if (result == null) result = caseExpression(objectIntersectionOf);
        if (result == null) result = caseParameterableElement(objectIntersectionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_ALL_VALUES_FROM:
      {
        ObjectAllValuesFrom objectAllValuesFrom = (ObjectAllValuesFrom)theEObject;
        T result = caseObjectAllValuesFrom(objectAllValuesFrom);
        if (result == null) result = caseClassExpression(objectAllValuesFrom);
        if (result == null) result = caseExpression(objectAllValuesFrom);
        if (result == null) result = caseParameterableElement(objectAllValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_SOME_VALUES_FROM:
      {
        ObjectSomeValuesFrom objectSomeValuesFrom = (ObjectSomeValuesFrom)theEObject;
        T result = caseObjectSomeValuesFrom(objectSomeValuesFrom);
        if (result == null) result = caseClassExpression(objectSomeValuesFrom);
        if (result == null) result = caseExpression(objectSomeValuesFrom);
        if (result == null) result = caseParameterableElement(objectSomeValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_HAS_VALUE:
      {
        ObjectHasValue objectHasValue = (ObjectHasValue)theEObject;
        T result = caseObjectHasValue(objectHasValue);
        if (result == null) result = caseClassExpression(objectHasValue);
        if (result == null) result = caseExpression(objectHasValue);
        if (result == null) result = caseParameterableElement(objectHasValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_MIN_CARDINALITY:
      {
        ObjectMinCardinality objectMinCardinality = (ObjectMinCardinality)theEObject;
        T result = caseObjectMinCardinality(objectMinCardinality);
        if (result == null) result = caseClassExpression(objectMinCardinality);
        if (result == null) result = caseExpression(objectMinCardinality);
        if (result == null) result = caseParameterableElement(objectMinCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_MAX_CARDINALITY:
      {
        ObjectMaxCardinality objectMaxCardinality = (ObjectMaxCardinality)theEObject;
        T result = caseObjectMaxCardinality(objectMaxCardinality);
        if (result == null) result = caseClassExpression(objectMaxCardinality);
        if (result == null) result = caseExpression(objectMaxCardinality);
        if (result == null) result = caseParameterableElement(objectMaxCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_EXACT_CARDINALITY:
      {
        ObjectExactCardinality objectExactCardinality = (ObjectExactCardinality)theEObject;
        T result = caseObjectExactCardinality(objectExactCardinality);
        if (result == null) result = caseClassExpression(objectExactCardinality);
        if (result == null) result = caseExpression(objectExactCardinality);
        if (result == null) result = caseParameterableElement(objectExactCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_ALL_VALUES_FROM:
      {
        DataAllValuesFrom dataAllValuesFrom = (DataAllValuesFrom)theEObject;
        T result = caseDataAllValuesFrom(dataAllValuesFrom);
        if (result == null) result = caseClassExpression(dataAllValuesFrom);
        if (result == null) result = caseExpression(dataAllValuesFrom);
        if (result == null) result = caseParameterableElement(dataAllValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_SOME_VALUES_FROM:
      {
        DataSomeValuesFrom dataSomeValuesFrom = (DataSomeValuesFrom)theEObject;
        T result = caseDataSomeValuesFrom(dataSomeValuesFrom);
        if (result == null) result = caseClassExpression(dataSomeValuesFrom);
        if (result == null) result = caseExpression(dataSomeValuesFrom);
        if (result == null) result = caseParameterableElement(dataSomeValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_HAS_VALUE:
      {
        DataHasValue dataHasValue = (DataHasValue)theEObject;
        T result = caseDataHasValue(dataHasValue);
        if (result == null) result = caseClassExpression(dataHasValue);
        if (result == null) result = caseExpression(dataHasValue);
        if (result == null) result = caseParameterableElement(dataHasValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_MIN_CARDINALITY:
      {
        DataMinCardinality dataMinCardinality = (DataMinCardinality)theEObject;
        T result = caseDataMinCardinality(dataMinCardinality);
        if (result == null) result = caseClassExpression(dataMinCardinality);
        if (result == null) result = caseExpression(dataMinCardinality);
        if (result == null) result = caseParameterableElement(dataMinCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_MAX_CARDINALITY:
      {
        DataMaxCardinality dataMaxCardinality = (DataMaxCardinality)theEObject;
        T result = caseDataMaxCardinality(dataMaxCardinality);
        if (result == null) result = caseClassExpression(dataMaxCardinality);
        if (result == null) result = caseExpression(dataMaxCardinality);
        if (result == null) result = caseParameterableElement(dataMaxCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_EXACT_CARDINALITY:
      {
        DataExactCardinality dataExactCardinality = (DataExactCardinality)theEObject;
        T result = caseDataExactCardinality(dataExactCardinality);
        if (result == null) result = caseClassExpression(dataExactCardinality);
        if (result == null) result = caseExpression(dataExactCardinality);
        if (result == null) result = caseParameterableElement(dataExactCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_RANGE:
      {
        DataRange dataRange = (DataRange)theEObject;
        T result = caseDataRange(dataRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_UNION_OF:
      {
        DataUnionOf dataUnionOf = (DataUnionOf)theEObject;
        T result = caseDataUnionOf(dataUnionOf);
        if (result == null) result = caseDataRange(dataUnionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_COMPLEMENT_OF:
      {
        DataComplementOf dataComplementOf = (DataComplementOf)theEObject;
        T result = caseDataComplementOf(dataComplementOf);
        if (result == null) result = caseDataRange(dataComplementOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_ONE_OF:
      {
        DataOneOf dataOneOf = (DataOneOf)theEObject;
        T result = caseDataOneOf(dataOneOf);
        if (result == null) result = caseDataRange(dataOneOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_INTERSECTION_OF:
      {
        DataIntersectionOf dataIntersectionOf = (DataIntersectionOf)theEObject;
        T result = caseDataIntersectionOf(dataIntersectionOf);
        if (result == null) result = caseDataRange(dataIntersectionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATATYPE_RESTRICTION:
      {
        DatatypeRestriction datatypeRestriction = (DatatypeRestriction)theEObject;
        T result = caseDatatypeRestriction(datatypeRestriction);
        if (result == null) result = caseDataRange(datatypeRestriction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.FACET_RESTRICTION:
      {
        FacetRestriction facetRestriction = (FacetRestriction)theEObject;
        T result = caseFacetRestriction(facetRestriction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_PROPERTY_ATOM:
      {
        ObjectPropertyAtom objectPropertyAtom = (ObjectPropertyAtom)theEObject;
        T result = caseObjectPropertyAtom(objectPropertyAtom);
        if (result == null) result = caseAtom(objectPropertyAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.SUB_OBJECT_PROPERTY_OF:
      {
        SubObjectPropertyOf subObjectPropertyOf = (SubObjectPropertyOf)theEObject;
        T result = caseSubObjectPropertyOf(subObjectPropertyOf);
        if (result == null) result = caseObjectPropertyAtom(subObjectPropertyOf);
        if (result == null) result = caseAtom(subObjectPropertyOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_PROPERTY_CHAIN:
      {
        ObjectPropertyChain objectPropertyChain = (ObjectPropertyChain)theEObject;
        T result = caseObjectPropertyChain(objectPropertyChain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.EQUIVALENT_OBJECT_PROPERTIES:
      {
        EquivalentObjectProperties equivalentObjectProperties = (EquivalentObjectProperties)theEObject;
        T result = caseEquivalentObjectProperties(equivalentObjectProperties);
        if (result == null) result = caseObjectPropertyAtom(equivalentObjectProperties);
        if (result == null) result = caseAtom(equivalentObjectProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DISJOINT_OBJECT_PROPERTIES:
      {
        DisjointObjectProperties disjointObjectProperties = (DisjointObjectProperties)theEObject;
        T result = caseDisjointObjectProperties(disjointObjectProperties);
        if (result == null) result = caseObjectPropertyAtom(disjointObjectProperties);
        if (result == null) result = caseAtom(disjointObjectProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_PROPERTY_DOMAIN:
      {
        ObjectPropertyDomain objectPropertyDomain = (ObjectPropertyDomain)theEObject;
        T result = caseObjectPropertyDomain(objectPropertyDomain);
        if (result == null) result = caseObjectPropertyAtom(objectPropertyDomain);
        if (result == null) result = caseAtom(objectPropertyDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_PROPERTY_RANGE:
      {
        ObjectPropertyRange objectPropertyRange = (ObjectPropertyRange)theEObject;
        T result = caseObjectPropertyRange(objectPropertyRange);
        if (result == null) result = caseObjectPropertyAtom(objectPropertyRange);
        if (result == null) result = caseAtom(objectPropertyRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.INVERSE_OBJECT_PROPERTY_ATOM:
      {
        InverseObjectPropertyAtom inverseObjectPropertyAtom = (InverseObjectPropertyAtom)theEObject;
        T result = caseInverseObjectPropertyAtom(inverseObjectPropertyAtom);
        if (result == null) result = caseObjectPropertyAtom(inverseObjectPropertyAtom);
        if (result == null) result = caseAtom(inverseObjectPropertyAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.FUNCTIONAL_OBJECT_PROPERTY:
      {
        FunctionalObjectProperty functionalObjectProperty = (FunctionalObjectProperty)theEObject;
        T result = caseFunctionalObjectProperty(functionalObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(functionalObjectProperty);
        if (result == null) result = caseAtom(functionalObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
      {
        InverseFunctionalObjectProperty inverseFunctionalObjectProperty = (InverseFunctionalObjectProperty)theEObject;
        T result = caseInverseFunctionalObjectProperty(inverseFunctionalObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(inverseFunctionalObjectProperty);
        if (result == null) result = caseAtom(inverseFunctionalObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.REFLEXIVE_OBJECT_PROPERTY:
      {
        ReflexiveObjectProperty reflexiveObjectProperty = (ReflexiveObjectProperty)theEObject;
        T result = caseReflexiveObjectProperty(reflexiveObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(reflexiveObjectProperty);
        if (result == null) result = caseAtom(reflexiveObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.IRREFLEXIVE_OBJECT_PROPERTY:
      {
        IrreflexiveObjectProperty irreflexiveObjectProperty = (IrreflexiveObjectProperty)theEObject;
        T result = caseIrreflexiveObjectProperty(irreflexiveObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(irreflexiveObjectProperty);
        if (result == null) result = caseAtom(irreflexiveObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.SYMMETRIC_OBJECT_PROPERTY:
      {
        SymmetricObjectProperty symmetricObjectProperty = (SymmetricObjectProperty)theEObject;
        T result = caseSymmetricObjectProperty(symmetricObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(symmetricObjectProperty);
        if (result == null) result = caseAtom(symmetricObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.ASYMMETRIC_OBJECT_PROPERTY:
      {
        AsymmetricObjectProperty asymmetricObjectProperty = (AsymmetricObjectProperty)theEObject;
        T result = caseAsymmetricObjectProperty(asymmetricObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(asymmetricObjectProperty);
        if (result == null) result = caseAtom(asymmetricObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.TRANSITIVE_OBJECT_PROPERTY:
      {
        TransitiveObjectProperty transitiveObjectProperty = (TransitiveObjectProperty)theEObject;
        T result = caseTransitiveObjectProperty(transitiveObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(transitiveObjectProperty);
        if (result == null) result = caseAtom(transitiveObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_PROPERTY_EXPRESSION:
      {
        ObjectPropertyExpression objectPropertyExpression = (ObjectPropertyExpression)theEObject;
        T result = caseObjectPropertyExpression(objectPropertyExpression);
        if (result == null) result = caseExpression(objectPropertyExpression);
        if (result == null) result = caseParameterableElement(objectPropertyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.INVERSE_OBJECT_PROPERTY:
      {
        InverseObjectProperty inverseObjectProperty = (InverseObjectProperty)theEObject;
        T result = caseInverseObjectProperty(inverseObjectProperty);
        if (result == null) result = caseObjectPropertyExpression(inverseObjectProperty);
        if (result == null) result = caseExpression(inverseObjectProperty);
        if (result == null) result = caseParameterableElement(inverseObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_PROPERTY_ATOM:
      {
        DataPropertyAtom dataPropertyAtom = (DataPropertyAtom)theEObject;
        T result = caseDataPropertyAtom(dataPropertyAtom);
        if (result == null) result = caseAtom(dataPropertyAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.SUB_DATA_PROPERTY_OF:
      {
        SubDataPropertyOf subDataPropertyOf = (SubDataPropertyOf)theEObject;
        T result = caseSubDataPropertyOf(subDataPropertyOf);
        if (result == null) result = caseDataPropertyAtom(subDataPropertyOf);
        if (result == null) result = caseAtom(subDataPropertyOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.EQUIVALENT_DATA_PROPERTIES:
      {
        EquivalentDataProperties equivalentDataProperties = (EquivalentDataProperties)theEObject;
        T result = caseEquivalentDataProperties(equivalentDataProperties);
        if (result == null) result = caseDataPropertyAtom(equivalentDataProperties);
        if (result == null) result = caseAtom(equivalentDataProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DISJOINT_DATA_PROPERTIES:
      {
        DisjointDataProperties disjointDataProperties = (DisjointDataProperties)theEObject;
        T result = caseDisjointDataProperties(disjointDataProperties);
        if (result == null) result = caseDataPropertyAtom(disjointDataProperties);
        if (result == null) result = caseAtom(disjointDataProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_PROPERTY_DOMAIN:
      {
        DataPropertyDomain dataPropertyDomain = (DataPropertyDomain)theEObject;
        T result = caseDataPropertyDomain(dataPropertyDomain);
        if (result == null) result = caseDataPropertyAtom(dataPropertyDomain);
        if (result == null) result = caseAtom(dataPropertyDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_PROPERTY_RANGE:
      {
        DataPropertyRange dataPropertyRange = (DataPropertyRange)theEObject;
        T result = caseDataPropertyRange(dataPropertyRange);
        if (result == null) result = caseDataPropertyAtom(dataPropertyRange);
        if (result == null) result = caseAtom(dataPropertyRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.FUNCTIONAL_DATA_PROPERTY:
      {
        FunctionalDataProperty functionalDataProperty = (FunctionalDataProperty)theEObject;
        T result = caseFunctionalDataProperty(functionalDataProperty);
        if (result == null) result = caseDataPropertyAtom(functionalDataProperty);
        if (result == null) result = caseAtom(functionalDataProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATA_PROPERTY_EXPRESSION:
      {
        DataPropertyExpression dataPropertyExpression = (DataPropertyExpression)theEObject;
        T result = caseDataPropertyExpression(dataPropertyExpression);
        if (result == null) result = caseExpression(dataPropertyExpression);
        if (result == null) result = caseParameterableElement(dataPropertyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.HAS_KEY:
      {
        HasKey hasKey = (HasKey)theEObject;
        T result = caseHasKey(hasKey);
        if (result == null) result = caseAtom(hasKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = caseAtom(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.CLASS_DECLARATION:
      {
        ClassDeclaration classDeclaration = (ClassDeclaration)theEObject;
        T result = caseClassDeclaration(classDeclaration);
        if (result == null) result = caseDeclaration(classDeclaration);
        if (result == null) result = caseAtom(classDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.OBJECT_PROPERTY_DECLARATION:
      {
        ObjectPropertyDeclaration objectPropertyDeclaration = (ObjectPropertyDeclaration)theEObject;
        T result = caseObjectPropertyDeclaration(objectPropertyDeclaration);
        if (result == null) result = caseDeclaration(objectPropertyDeclaration);
        if (result == null) result = caseAtom(objectPropertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DATATYPE_PROPERTY_DECLARATION:
      {
        DatatypePropertyDeclaration datatypePropertyDeclaration = (DatatypePropertyDeclaration)theEObject;
        T result = caseDatatypePropertyDeclaration(datatypePropertyDeclaration);
        if (result == null) result = caseDeclaration(datatypePropertyDeclaration);
        if (result == null) result = caseAtom(datatypePropertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.INDIVIDUAL_DECLARATION:
      {
        IndividualDeclaration individualDeclaration = (IndividualDeclaration)theEObject;
        T result = caseIndividualDeclaration(individualDeclaration);
        if (result == null) result = caseDeclaration(individualDeclaration);
        if (result == null) result = caseAtom(individualDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.TEMPLATE_PARAMETER:
      {
        TemplateParameter templateParameter = (TemplateParameter)theEObject;
        T result = caseTemplateParameter(templateParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.PARAMETERABLE_ELEMENT:
      {
        ParameterableElement parameterableElement = (ParameterableElement)theEObject;
        T result = caseParameterableElement(parameterableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.TEMPLATE_SIGNATURE:
      {
        TemplateSignature templateSignature = (TemplateSignature)theEObject;
        T result = caseTemplateSignature(templateSignature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.TEMPLATEABLE_ELEMENT:
      {
        TemplateableElement templateableElement = (TemplateableElement)theEObject;
        T result = caseTemplateableElement(templateableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION:
      {
        TemplateParameterSubstitution templateParameterSubstitution = (TemplateParameterSubstitution)theEObject;
        T result = caseTemplateParameterSubstitution(templateParameterSubstitution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.TEMPLATE_BINDING:
      {
        TemplateBinding templateBinding = (TemplateBinding)theEObject;
        T result = caseTemplateBinding(templateBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DIRECT_CLASS_ASSERTION:
      {
        DirectClassAssertion directClassAssertion = (DirectClassAssertion)theEObject;
        T result = caseDirectClassAssertion(directClassAssertion);
        if (result == null) result = caseAssertion(directClassAssertion);
        if (result == null) result = caseAtom(directClassAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.DIRECT_SUB_CLASS_OF:
      {
        DirectSubClassOf directSubClassOf = (DirectSubClassOf)theEObject;
        T result = caseDirectSubClassOf(directSubClassOf);
        if (result == null) result = caseClassAtom(directSubClassOf);
        if (result == null) result = caseAtom(directSubClassOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SparqlasPackage.STRICT_SUB_CLASS_OF:
      {
        StrictSubClassOf strictSubClassOf = (StrictSubClassOf)theEObject;
        T result = caseStrictSubClassOf(strictSubClassOf);
        if (result == null) result = caseClassAtom(strictSubClassOf);
        if (result == null) result = caseAtom(strictSubClassOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ontology Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ontology Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOntologyDocument(OntologyDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixDefinition(PrefixDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery(Query object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectQuery(SelectQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Construct Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Construct Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructQuery(ConstructQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ask Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ask Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAskQuery(AskQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Describe Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Describe Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescribeQuery(DescribeQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IRI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IRI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIRI(IRI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Full IRI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Full IRI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFullIRI(FullIRI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abbreviated IRI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abbreviated IRI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbbreviatedIRI(AbbreviatedIRI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassVariable(ClassVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Property Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Property Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectPropertyVariable(ObjectPropertyVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Property Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Property Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPropertyVariable(DataPropertyVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Individual Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Individual Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndividualVariable(IndividualVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(west.twouse.language.sparqlas.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatype(Datatype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectProperty(ObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataProperty(DataProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndividual(Individual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Individual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Individual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedIndividual(NamedIndividual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anonymous Individual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anonymous Individual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnonymousIndividual(AnonymousIndividual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractLiteral(AbstractLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralVariable(LiteralVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtom(Atom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertion(Assertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassAssertion(ClassAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Property Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectPropertyAssertion(ObjectPropertyAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Property Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPropertyAssertion(DataPropertyAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negative Object Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negative Object Property Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegativeObjectPropertyAssertion(NegativeObjectPropertyAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negative Data Property Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negative Data Property Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegativeDataPropertyAssertion(NegativeDataPropertyAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Same Individual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Same Individual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSameIndividual(SameIndividual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Different Individuals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Different Individuals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDifferentIndividuals(DifferentIndividuals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassAtom(ClassAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Class Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Class Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubClassOf(SubClassOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equivalent Classes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equivalent Classes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquivalentClasses(EquivalentClasses object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disjoint Classes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disjoint Classes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisjointClasses(DisjointClasses object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disjoint Union</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disjoint Union</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisjointUnion(DisjointUnion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassExpression(ClassExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Union Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Union Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectUnionOf(ObjectUnionOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Complement Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Complement Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectComplementOf(ObjectComplementOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object One Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object One Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectOneOf(ObjectOneOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Intersection Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Intersection Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectIntersectionOf(ObjectIntersectionOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object All Values From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object All Values From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectAllValuesFrom(ObjectAllValuesFrom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Some Values From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Some Values From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectSomeValuesFrom(ObjectSomeValuesFrom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Has Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Has Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectHasValue(ObjectHasValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Min Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Min Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectMinCardinality(ObjectMinCardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Max Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Max Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectMaxCardinality(ObjectMaxCardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Exact Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Exact Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectExactCardinality(ObjectExactCardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data All Values From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data All Values From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataAllValuesFrom(DataAllValuesFrom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Some Values From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Some Values From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataSomeValuesFrom(DataSomeValuesFrom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Has Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Has Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataHasValue(DataHasValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Min Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Min Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataMinCardinality(DataMinCardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Max Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Max Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataMaxCardinality(DataMaxCardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Exact Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Exact Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataExactCardinality(DataExactCardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataRange(DataRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Union Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Union Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataUnionOf(DataUnionOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Complement Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Complement Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataComplementOf(DataComplementOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data One Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data One Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataOneOf(DataOneOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Intersection Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Intersection Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataIntersectionOf(DataIntersectionOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype Restriction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype Restriction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatypeRestriction(DatatypeRestriction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet Restriction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet Restriction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetRestriction(FacetRestriction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Property Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Property Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectPropertyAtom(ObjectPropertyAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Object Property Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Object Property Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubObjectPropertyOf(SubObjectPropertyOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Property Chain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Property Chain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectPropertyChain(ObjectPropertyChain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equivalent Object Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equivalent Object Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquivalentObjectProperties(EquivalentObjectProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disjoint Object Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disjoint Object Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisjointObjectProperties(DisjointObjectProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Property Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Property Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectPropertyDomain(ObjectPropertyDomain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Property Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Property Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectPropertyRange(ObjectPropertyRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inverse Object Property Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inverse Object Property Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInverseObjectPropertyAtom(InverseObjectPropertyAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Functional Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Functional Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionalObjectProperty(FunctionalObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inverse Functional Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inverse Functional Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reflexive Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reflexive Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReflexiveObjectProperty(ReflexiveObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Irreflexive Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Irreflexive Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIrreflexiveObjectProperty(IrreflexiveObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symmetric Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symmetric Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymmetricObjectProperty(SymmetricObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Asymmetric Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Asymmetric Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsymmetricObjectProperty(AsymmetricObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transitive Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transitive Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitiveObjectProperty(TransitiveObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Property Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Property Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectPropertyExpression(ObjectPropertyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inverse Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inverse Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInverseObjectProperty(InverseObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Property Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Property Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPropertyAtom(DataPropertyAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Data Property Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Data Property Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubDataPropertyOf(SubDataPropertyOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equivalent Data Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equivalent Data Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquivalentDataProperties(EquivalentDataProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disjoint Data Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disjoint Data Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisjointDataProperties(DisjointDataProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Property Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Property Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPropertyDomain(DataPropertyDomain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Property Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Property Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPropertyRange(DataPropertyRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Functional Data Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Functional Data Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionalDataProperty(FunctionalDataProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Property Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Property Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPropertyExpression(DataPropertyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHasKey(HasKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDeclaration(ClassDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Property Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectPropertyDeclaration(ObjectPropertyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype Property Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatypePropertyDeclaration(DatatypePropertyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Individual Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Individual Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndividualDeclaration(IndividualDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateParameter(TemplateParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterableElement(ParameterableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Signature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Signature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateSignature(TemplateSignature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateableElement(TemplateableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Parameter Substitution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Parameter Substitution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateParameterSubstitution(TemplateParameterSubstitution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateBinding(TemplateBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Class Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Class Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectClassAssertion(DirectClassAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Direct Sub Class Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Direct Sub Class Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectSubClassOf(DirectSubClassOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strict Sub Class Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strict Sub Class Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrictSubClassOf(StrictSubClassOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SparqlasSwitch
