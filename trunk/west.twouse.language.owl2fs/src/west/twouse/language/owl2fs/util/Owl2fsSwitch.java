/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see west.twouse.language.owl2fs.Owl2fsPackage
 * @generated
 */
public class Owl2fsSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Owl2fsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Owl2fsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = Owl2fsPackage.eINSTANCE;
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
      case Owl2fsPackage.IRI:
      {
        IRI iri = (IRI)theEObject;
        T result = caseIRI(iri);
        if (result == null) result = caseAnnotationSubject(iri);
        if (result == null) result = caseAnnotationValue(iri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.FULL_IRI:
      {
        FullIRI fullIRI = (FullIRI)theEObject;
        T result = caseFullIRI(fullIRI);
        if (result == null) result = caseIRI(fullIRI);
        if (result == null) result = caseAnnotationSubject(fullIRI);
        if (result == null) result = caseAnnotationValue(fullIRI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ABBREVIATED_IRI:
      {
        AbbreviatedIRI abbreviatedIRI = (AbbreviatedIRI)theEObject;
        T result = caseAbbreviatedIRI(abbreviatedIRI);
        if (result == null) result = caseIRI(abbreviatedIRI);
        if (result == null) result = caseAnnotationSubject(abbreviatedIRI);
        if (result == null) result = caseAnnotationValue(abbreviatedIRI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ONTOLOGY_DOCUMENT:
      {
        OntologyDocument ontologyDocument = (OntologyDocument)theEObject;
        T result = caseOntologyDocument(ontologyDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.PREFIX_DEFINITION:
      {
        PrefixDefinition prefixDefinition = (PrefixDefinition)theEObject;
        T result = casePrefixDefinition(prefixDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ONTOLOGY:
      {
        Ontology ontology = (Ontology)theEObject;
        T result = caseOntology(ontology);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.AXIOM:
      {
        Axiom axiom = (Axiom)theEObject;
        T result = caseAxiom(axiom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseAxiom(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = caseAnnotationAxiom(declaration);
        if (result == null) result = caseAxiom(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS_DECLARATION:
      {
        ClassDeclaration classDeclaration = (ClassDeclaration)theEObject;
        T result = caseClassDeclaration(classDeclaration);
        if (result == null) result = caseDeclaration(classDeclaration);
        if (result == null) result = caseAnnotationAxiom(classDeclaration);
        if (result == null) result = caseAxiom(classDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATATYPE_DECLARATION:
      {
        DatatypeDeclaration datatypeDeclaration = (DatatypeDeclaration)theEObject;
        T result = caseDatatypeDeclaration(datatypeDeclaration);
        if (result == null) result = caseDeclaration(datatypeDeclaration);
        if (result == null) result = caseAnnotationAxiom(datatypeDeclaration);
        if (result == null) result = caseAxiom(datatypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_DECLARATION:
      {
        ObjectPropertyDeclaration objectPropertyDeclaration = (ObjectPropertyDeclaration)theEObject;
        T result = caseObjectPropertyDeclaration(objectPropertyDeclaration);
        if (result == null) result = caseDeclaration(objectPropertyDeclaration);
        if (result == null) result = caseAnnotationAxiom(objectPropertyDeclaration);
        if (result == null) result = caseAxiom(objectPropertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY_DECLARATION:
      {
        DataPropertyDeclaration dataPropertyDeclaration = (DataPropertyDeclaration)theEObject;
        T result = caseDataPropertyDeclaration(dataPropertyDeclaration);
        if (result == null) result = caseDeclaration(dataPropertyDeclaration);
        if (result == null) result = caseAnnotationAxiom(dataPropertyDeclaration);
        if (result == null) result = caseAxiom(dataPropertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_PROPERTY_DECLARATION:
      {
        AnnotationPropertyDeclaration annotationPropertyDeclaration = (AnnotationPropertyDeclaration)theEObject;
        T result = caseAnnotationPropertyDeclaration(annotationPropertyDeclaration);
        if (result == null) result = caseDeclaration(annotationPropertyDeclaration);
        if (result == null) result = caseAnnotationAxiom(annotationPropertyDeclaration);
        if (result == null) result = caseAxiom(annotationPropertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.NAMED_INDIVIDUAL_DECLARATION:
      {
        NamedIndividualDeclaration namedIndividualDeclaration = (NamedIndividualDeclaration)theEObject;
        T result = caseNamedIndividualDeclaration(namedIndividualDeclaration);
        if (result == null) result = caseDeclaration(namedIndividualDeclaration);
        if (result == null) result = caseAnnotationAxiom(namedIndividualDeclaration);
        if (result == null) result = caseAxiom(namedIndividualDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_SUBJECT:
      {
        AnnotationSubject annotationSubject = (AnnotationSubject)theEObject;
        T result = caseAnnotationSubject(annotationSubject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_VALUE:
      {
        AnnotationValue annotationValue = (AnnotationValue)theEObject;
        T result = caseAnnotationValue(annotationValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_AXIOM:
      {
        AnnotationAxiom annotationAxiom = (AnnotationAxiom)theEObject;
        T result = caseAnnotationAxiom(annotationAxiom);
        if (result == null) result = caseAxiom(annotationAxiom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_ASSERTION:
      {
        AnnotationAssertion annotationAssertion = (AnnotationAssertion)theEObject;
        T result = caseAnnotationAssertion(annotationAssertion);
        if (result == null) result = caseAnnotationAxiom(annotationAssertion);
        if (result == null) result = caseAxiom(annotationAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SUB_ANNOTATION_PROPERTY_OF:
      {
        SubAnnotationPropertyOf subAnnotationPropertyOf = (SubAnnotationPropertyOf)theEObject;
        T result = caseSubAnnotationPropertyOf(subAnnotationPropertyOf);
        if (result == null) result = caseAnnotationAxiom(subAnnotationPropertyOf);
        if (result == null) result = caseAxiom(subAnnotationPropertyOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN:
      {
        AnnotationPropertyDomain annotationPropertyDomain = (AnnotationPropertyDomain)theEObject;
        T result = caseAnnotationPropertyDomain(annotationPropertyDomain);
        if (result == null) result = caseAnnotationAxiom(annotationPropertyDomain);
        if (result == null) result = caseAxiom(annotationPropertyDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_PROPERTY_RANGE:
      {
        AnnotationPropertyRange annotationPropertyRange = (AnnotationPropertyRange)theEObject;
        T result = caseAnnotationPropertyRange(annotationPropertyRange);
        if (result == null) result = caseAnnotationAxiom(annotationPropertyRange);
        if (result == null) result = caseAxiom(annotationPropertyRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_PROPERTY:
      {
        AnnotationProperty annotationProperty = (AnnotationProperty)theEObject;
        T result = caseAnnotationProperty(annotationProperty);
        if (result == null) result = caseEntity(annotationProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS:
      {
        west.twouse.language.owl2fs.Class class_ = (west.twouse.language.owl2fs.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseEntity(class_);
        if (result == null) result = caseClassExpression(class_);
        if (result == null) result = caseParameterableElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY:
      {
        DataProperty dataProperty = (DataProperty)theEObject;
        T result = caseDataProperty(dataProperty);
        if (result == null) result = caseEntity(dataProperty);
        if (result == null) result = caseDataPropertyExpression(dataProperty);
        if (result == null) result = caseParameterableElement(dataProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATATYPE:
      {
        Datatype datatype = (Datatype)theEObject;
        T result = caseDatatype(datatype);
        if (result == null) result = caseDataRange(datatype);
        if (result == null) result = caseEntity(datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY:
      {
        ObjectProperty objectProperty = (ObjectProperty)theEObject;
        T result = caseObjectProperty(objectProperty);
        if (result == null) result = caseEntity(objectProperty);
        if (result == null) result = caseObjectPropertyExpression(objectProperty);
        if (result == null) result = caseParameterableElement(objectProperty);
        if (result == null) result = caseSubObjectPropertyExpression(objectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.INDIVIDUAL:
      {
        Individual individual = (Individual)theEObject;
        T result = caseIndividual(individual);
        if (result == null) result = caseIArg(individual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.NAMED_INDIVIDUAL:
      {
        NamedIndividual namedIndividual = (NamedIndividual)theEObject;
        T result = caseNamedIndividual(namedIndividual);
        if (result == null) result = caseEntity(namedIndividual);
        if (result == null) result = caseIndividual(namedIndividual);
        if (result == null) result = caseParameterableElement(namedIndividual);
        if (result == null) result = caseIArg(namedIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL:
      {
        AnonymousIndividual anonymousIndividual = (AnonymousIndividual)theEObject;
        T result = caseAnonymousIndividual(anonymousIndividual);
        if (result == null) result = caseIndividual(anonymousIndividual);
        if (result == null) result = caseAnnotationSubject(anonymousIndividual);
        if (result == null) result = caseAnnotationValue(anonymousIndividual);
        if (result == null) result = caseIArg(anonymousIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseAnnotationValue(literal);
        if (result == null) result = caseDArg(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION:
      {
        ObjectPropertyExpression objectPropertyExpression = (ObjectPropertyExpression)theEObject;
        T result = caseObjectPropertyExpression(objectPropertyExpression);
        if (result == null) result = caseSubObjectPropertyExpression(objectPropertyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTY:
      {
        InverseObjectProperty inverseObjectProperty = (InverseObjectProperty)theEObject;
        T result = caseInverseObjectProperty(inverseObjectProperty);
        if (result == null) result = caseObjectPropertyExpression(inverseObjectProperty);
        if (result == null) result = caseExpression(inverseObjectProperty);
        if (result == null) result = caseSubObjectPropertyExpression(inverseObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY_EXPRESSION:
      {
        DataPropertyExpression dataPropertyExpression = (DataPropertyExpression)theEObject;
        T result = caseDataPropertyExpression(dataPropertyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_RANGE:
      {
        DataRange dataRange = (DataRange)theEObject;
        T result = caseDataRange(dataRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_INTERSECTION_OF:
      {
        DataIntersectionOf dataIntersectionOf = (DataIntersectionOf)theEObject;
        T result = caseDataIntersectionOf(dataIntersectionOf);
        if (result == null) result = caseDataRange(dataIntersectionOf);
        if (result == null) result = caseExpression(dataIntersectionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_UNION_OF:
      {
        DataUnionOf dataUnionOf = (DataUnionOf)theEObject;
        T result = caseDataUnionOf(dataUnionOf);
        if (result == null) result = caseDataRange(dataUnionOf);
        if (result == null) result = caseExpression(dataUnionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_COMPLEMENT_OF:
      {
        DataComplementOf dataComplementOf = (DataComplementOf)theEObject;
        T result = caseDataComplementOf(dataComplementOf);
        if (result == null) result = caseDataRange(dataComplementOf);
        if (result == null) result = caseExpression(dataComplementOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_ONE_OF:
      {
        DataOneOf dataOneOf = (DataOneOf)theEObject;
        T result = caseDataOneOf(dataOneOf);
        if (result == null) result = caseDataRange(dataOneOf);
        if (result == null) result = caseExpression(dataOneOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATATYPE_RESTRICTION:
      {
        DatatypeRestriction datatypeRestriction = (DatatypeRestriction)theEObject;
        T result = caseDatatypeRestriction(datatypeRestriction);
        if (result == null) result = caseDataRange(datatypeRestriction);
        if (result == null) result = caseExpression(datatypeRestriction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.FACET_CONSTRAINT_PAIR:
      {
        FacetConstraintPair facetConstraintPair = (FacetConstraintPair)theEObject;
        T result = caseFacetConstraintPair(facetConstraintPair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS_EXPRESSION:
      {
        ClassExpression classExpression = (ClassExpression)theEObject;
        T result = caseClassExpression(classExpression);
        if (result == null) result = caseParameterableElement(classExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_INTERSECTION_OF:
      {
        ObjectIntersectionOf objectIntersectionOf = (ObjectIntersectionOf)theEObject;
        T result = caseObjectIntersectionOf(objectIntersectionOf);
        if (result == null) result = caseClassExpression(objectIntersectionOf);
        if (result == null) result = caseExpression(objectIntersectionOf);
        if (result == null) result = caseParameterableElement(objectIntersectionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_UNION_OF:
      {
        ObjectUnionOf objectUnionOf = (ObjectUnionOf)theEObject;
        T result = caseObjectUnionOf(objectUnionOf);
        if (result == null) result = caseClassExpression(objectUnionOf);
        if (result == null) result = caseExpression(objectUnionOf);
        if (result == null) result = caseParameterableElement(objectUnionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_COMPLEMENT_OF:
      {
        ObjectComplementOf objectComplementOf = (ObjectComplementOf)theEObject;
        T result = caseObjectComplementOf(objectComplementOf);
        if (result == null) result = caseClassExpression(objectComplementOf);
        if (result == null) result = caseExpression(objectComplementOf);
        if (result == null) result = caseParameterableElement(objectComplementOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_ONE_OF:
      {
        ObjectOneOf objectOneOf = (ObjectOneOf)theEObject;
        T result = caseObjectOneOf(objectOneOf);
        if (result == null) result = caseClassExpression(objectOneOf);
        if (result == null) result = caseExpression(objectOneOf);
        if (result == null) result = caseParameterableElement(objectOneOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_SOME_VALUES_FROM:
      {
        ObjectSomeValuesFrom objectSomeValuesFrom = (ObjectSomeValuesFrom)theEObject;
        T result = caseObjectSomeValuesFrom(objectSomeValuesFrom);
        if (result == null) result = caseClassExpression(objectSomeValuesFrom);
        if (result == null) result = caseExpression(objectSomeValuesFrom);
        if (result == null) result = caseParameterableElement(objectSomeValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_ALL_VALUES_FROM:
      {
        ObjectAllValuesFrom objectAllValuesFrom = (ObjectAllValuesFrom)theEObject;
        T result = caseObjectAllValuesFrom(objectAllValuesFrom);
        if (result == null) result = caseClassExpression(objectAllValuesFrom);
        if (result == null) result = caseExpression(objectAllValuesFrom);
        if (result == null) result = caseParameterableElement(objectAllValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_HAS_SELF:
      {
        ObjectHasSelf objectHasSelf = (ObjectHasSelf)theEObject;
        T result = caseObjectHasSelf(objectHasSelf);
        if (result == null) result = caseClassExpression(objectHasSelf);
        if (result == null) result = caseExpression(objectHasSelf);
        if (result == null) result = caseParameterableElement(objectHasSelf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_HAS_VALUE:
      {
        ObjectHasValue objectHasValue = (ObjectHasValue)theEObject;
        T result = caseObjectHasValue(objectHasValue);
        if (result == null) result = caseClassExpression(objectHasValue);
        if (result == null) result = caseExpression(objectHasValue);
        if (result == null) result = caseParameterableElement(objectHasValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_MIN_CARDINALITY:
      {
        ObjectMinCardinality objectMinCardinality = (ObjectMinCardinality)theEObject;
        T result = caseObjectMinCardinality(objectMinCardinality);
        if (result == null) result = caseClassExpression(objectMinCardinality);
        if (result == null) result = caseExpression(objectMinCardinality);
        if (result == null) result = caseParameterableElement(objectMinCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_MAX_CARDINALITY:
      {
        ObjectMaxCardinality objectMaxCardinality = (ObjectMaxCardinality)theEObject;
        T result = caseObjectMaxCardinality(objectMaxCardinality);
        if (result == null) result = caseClassExpression(objectMaxCardinality);
        if (result == null) result = caseExpression(objectMaxCardinality);
        if (result == null) result = caseParameterableElement(objectMaxCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_EXACT_CARDINALITY:
      {
        ObjectExactCardinality objectExactCardinality = (ObjectExactCardinality)theEObject;
        T result = caseObjectExactCardinality(objectExactCardinality);
        if (result == null) result = caseClassExpression(objectExactCardinality);
        if (result == null) result = caseExpression(objectExactCardinality);
        if (result == null) result = caseParameterableElement(objectExactCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_SOME_VALUES_FROM:
      {
        DataSomeValuesFrom dataSomeValuesFrom = (DataSomeValuesFrom)theEObject;
        T result = caseDataSomeValuesFrom(dataSomeValuesFrom);
        if (result == null) result = caseClassExpression(dataSomeValuesFrom);
        if (result == null) result = caseExpression(dataSomeValuesFrom);
        if (result == null) result = caseParameterableElement(dataSomeValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_ALL_VALUES_FROM:
      {
        DataAllValuesFrom dataAllValuesFrom = (DataAllValuesFrom)theEObject;
        T result = caseDataAllValuesFrom(dataAllValuesFrom);
        if (result == null) result = caseClassExpression(dataAllValuesFrom);
        if (result == null) result = caseExpression(dataAllValuesFrom);
        if (result == null) result = caseParameterableElement(dataAllValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_HAS_VALUE:
      {
        DataHasValue dataHasValue = (DataHasValue)theEObject;
        T result = caseDataHasValue(dataHasValue);
        if (result == null) result = caseClassExpression(dataHasValue);
        if (result == null) result = caseExpression(dataHasValue);
        if (result == null) result = caseParameterableElement(dataHasValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_MIN_CARDINALITY:
      {
        DataMinCardinality dataMinCardinality = (DataMinCardinality)theEObject;
        T result = caseDataMinCardinality(dataMinCardinality);
        if (result == null) result = caseClassExpression(dataMinCardinality);
        if (result == null) result = caseExpression(dataMinCardinality);
        if (result == null) result = caseParameterableElement(dataMinCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_MAX_CARDINALITY:
      {
        DataMaxCardinality dataMaxCardinality = (DataMaxCardinality)theEObject;
        T result = caseDataMaxCardinality(dataMaxCardinality);
        if (result == null) result = caseClassExpression(dataMaxCardinality);
        if (result == null) result = caseExpression(dataMaxCardinality);
        if (result == null) result = caseParameterableElement(dataMaxCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_EXACT_CARDINALITY:
      {
        DataExactCardinality dataExactCardinality = (DataExactCardinality)theEObject;
        T result = caseDataExactCardinality(dataExactCardinality);
        if (result == null) result = caseClassExpression(dataExactCardinality);
        if (result == null) result = caseExpression(dataExactCardinality);
        if (result == null) result = caseParameterableElement(dataExactCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS_AXIOM:
      {
        ClassAxiom classAxiom = (ClassAxiom)theEObject;
        T result = caseClassAxiom(classAxiom);
        if (result == null) result = caseAnnotationAxiom(classAxiom);
        if (result == null) result = caseAxiom(classAxiom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SUB_CLASS_OF:
      {
        SubClassOf subClassOf = (SubClassOf)theEObject;
        T result = caseSubClassOf(subClassOf);
        if (result == null) result = caseClassAxiom(subClassOf);
        if (result == null) result = caseAnnotationAxiom(subClassOf);
        if (result == null) result = caseAxiom(subClassOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.EQUIVALENT_CLASSES:
      {
        EquivalentClasses equivalentClasses = (EquivalentClasses)theEObject;
        T result = caseEquivalentClasses(equivalentClasses);
        if (result == null) result = caseClassAxiom(equivalentClasses);
        if (result == null) result = caseAnnotationAxiom(equivalentClasses);
        if (result == null) result = caseAxiom(equivalentClasses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DISJOINT_CLASSES:
      {
        DisjointClasses disjointClasses = (DisjointClasses)theEObject;
        T result = caseDisjointClasses(disjointClasses);
        if (result == null) result = caseClassAxiom(disjointClasses);
        if (result == null) result = caseAnnotationAxiom(disjointClasses);
        if (result == null) result = caseAxiom(disjointClasses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DISJOINT_UNION:
      {
        DisjointUnion disjointUnion = (DisjointUnion)theEObject;
        T result = caseDisjointUnion(disjointUnion);
        if (result == null) result = caseClassAxiom(disjointUnion);
        if (result == null) result = caseAnnotationAxiom(disjointUnion);
        if (result == null) result = caseAxiom(disjointUnion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_AXIOM:
      {
        ObjectPropertyAxiom objectPropertyAxiom = (ObjectPropertyAxiom)theEObject;
        T result = caseObjectPropertyAxiom(objectPropertyAxiom);
        if (result == null) result = caseAnnotationAxiom(objectPropertyAxiom);
        if (result == null) result = caseAxiom(objectPropertyAxiom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF:
      {
        SubObjectPropertyOf subObjectPropertyOf = (SubObjectPropertyOf)theEObject;
        T result = caseSubObjectPropertyOf(subObjectPropertyOf);
        if (result == null) result = caseObjectPropertyAxiom(subObjectPropertyOf);
        if (result == null) result = caseAnnotationAxiom(subObjectPropertyOf);
        if (result == null) result = caseAxiom(subObjectPropertyOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_EXPRESSION:
      {
        SubObjectPropertyExpression subObjectPropertyExpression = (SubObjectPropertyExpression)theEObject;
        T result = caseSubObjectPropertyExpression(subObjectPropertyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_CHAIN:
      {
        ObjectPropertyChain objectPropertyChain = (ObjectPropertyChain)theEObject;
        T result = caseObjectPropertyChain(objectPropertyChain);
        if (result == null) result = caseSubObjectPropertyExpression(objectPropertyChain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES:
      {
        EquivalentObjectProperties equivalentObjectProperties = (EquivalentObjectProperties)theEObject;
        T result = caseEquivalentObjectProperties(equivalentObjectProperties);
        if (result == null) result = caseObjectPropertyAxiom(equivalentObjectProperties);
        if (result == null) result = caseAnnotationAxiom(equivalentObjectProperties);
        if (result == null) result = caseAxiom(equivalentObjectProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES:
      {
        DisjointObjectProperties disjointObjectProperties = (DisjointObjectProperties)theEObject;
        T result = caseDisjointObjectProperties(disjointObjectProperties);
        if (result == null) result = caseObjectPropertyAxiom(disjointObjectProperties);
        if (result == null) result = caseAnnotationAxiom(disjointObjectProperties);
        if (result == null) result = caseAxiom(disjointObjectProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN:
      {
        ObjectPropertyDomain objectPropertyDomain = (ObjectPropertyDomain)theEObject;
        T result = caseObjectPropertyDomain(objectPropertyDomain);
        if (result == null) result = caseObjectPropertyAxiom(objectPropertyDomain);
        if (result == null) result = caseAnnotationAxiom(objectPropertyDomain);
        if (result == null) result = caseAxiom(objectPropertyDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_RANGE:
      {
        ObjectPropertyRange objectPropertyRange = (ObjectPropertyRange)theEObject;
        T result = caseObjectPropertyRange(objectPropertyRange);
        if (result == null) result = caseObjectPropertyAxiom(objectPropertyRange);
        if (result == null) result = caseAnnotationAxiom(objectPropertyRange);
        if (result == null) result = caseAxiom(objectPropertyRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTIES:
      {
        InverseObjectProperties inverseObjectProperties = (InverseObjectProperties)theEObject;
        T result = caseInverseObjectProperties(inverseObjectProperties);
        if (result == null) result = caseObjectPropertyAxiom(inverseObjectProperties);
        if (result == null) result = caseAnnotationAxiom(inverseObjectProperties);
        if (result == null) result = caseAxiom(inverseObjectProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY:
      {
        FunctionalObjectProperty functionalObjectProperty = (FunctionalObjectProperty)theEObject;
        T result = caseFunctionalObjectProperty(functionalObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(functionalObjectProperty);
        if (result == null) result = caseAnnotationAxiom(functionalObjectProperty);
        if (result == null) result = caseAxiom(functionalObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
      {
        InverseFunctionalObjectProperty inverseFunctionalObjectProperty = (InverseFunctionalObjectProperty)theEObject;
        T result = caseInverseFunctionalObjectProperty(inverseFunctionalObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(inverseFunctionalObjectProperty);
        if (result == null) result = caseAnnotationAxiom(inverseFunctionalObjectProperty);
        if (result == null) result = caseAxiom(inverseFunctionalObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY:
      {
        ReflexiveObjectProperty reflexiveObjectProperty = (ReflexiveObjectProperty)theEObject;
        T result = caseReflexiveObjectProperty(reflexiveObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(reflexiveObjectProperty);
        if (result == null) result = caseAnnotationAxiom(reflexiveObjectProperty);
        if (result == null) result = caseAxiom(reflexiveObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY:
      {
        IrreflexiveObjectProperty irreflexiveObjectProperty = (IrreflexiveObjectProperty)theEObject;
        T result = caseIrreflexiveObjectProperty(irreflexiveObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(irreflexiveObjectProperty);
        if (result == null) result = caseAnnotationAxiom(irreflexiveObjectProperty);
        if (result == null) result = caseAxiom(irreflexiveObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY:
      {
        SymmetricObjectProperty symmetricObjectProperty = (SymmetricObjectProperty)theEObject;
        T result = caseSymmetricObjectProperty(symmetricObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(symmetricObjectProperty);
        if (result == null) result = caseAnnotationAxiom(symmetricObjectProperty);
        if (result == null) result = caseAxiom(symmetricObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY:
      {
        AsymmetricObjectProperty asymmetricObjectProperty = (AsymmetricObjectProperty)theEObject;
        T result = caseAsymmetricObjectProperty(asymmetricObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(asymmetricObjectProperty);
        if (result == null) result = caseAnnotationAxiom(asymmetricObjectProperty);
        if (result == null) result = caseAxiom(asymmetricObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY:
      {
        TransitiveObjectProperty transitiveObjectProperty = (TransitiveObjectProperty)theEObject;
        T result = caseTransitiveObjectProperty(transitiveObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(transitiveObjectProperty);
        if (result == null) result = caseAnnotationAxiom(transitiveObjectProperty);
        if (result == null) result = caseAxiom(transitiveObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY_AXIOM:
      {
        DataPropertyAxiom dataPropertyAxiom = (DataPropertyAxiom)theEObject;
        T result = caseDataPropertyAxiom(dataPropertyAxiom);
        if (result == null) result = caseAnnotationAxiom(dataPropertyAxiom);
        if (result == null) result = caseAxiom(dataPropertyAxiom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF:
      {
        SubDataPropertyOf subDataPropertyOf = (SubDataPropertyOf)theEObject;
        T result = caseSubDataPropertyOf(subDataPropertyOf);
        if (result == null) result = caseDataPropertyAxiom(subDataPropertyOf);
        if (result == null) result = caseAnnotationAxiom(subDataPropertyOf);
        if (result == null) result = caseAxiom(subDataPropertyOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES:
      {
        EquivalentDataProperties equivalentDataProperties = (EquivalentDataProperties)theEObject;
        T result = caseEquivalentDataProperties(equivalentDataProperties);
        if (result == null) result = caseDataPropertyAxiom(equivalentDataProperties);
        if (result == null) result = caseAnnotationAxiom(equivalentDataProperties);
        if (result == null) result = caseAxiom(equivalentDataProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DISJOINT_DATA_PROPERTIES:
      {
        DisjointDataProperties disjointDataProperties = (DisjointDataProperties)theEObject;
        T result = caseDisjointDataProperties(disjointDataProperties);
        if (result == null) result = caseDataPropertyAxiom(disjointDataProperties);
        if (result == null) result = caseAnnotationAxiom(disjointDataProperties);
        if (result == null) result = caseAxiom(disjointDataProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY_DOMAIN:
      {
        DataPropertyDomain dataPropertyDomain = (DataPropertyDomain)theEObject;
        T result = caseDataPropertyDomain(dataPropertyDomain);
        if (result == null) result = caseDataPropertyAxiom(dataPropertyDomain);
        if (result == null) result = caseAnnotationAxiom(dataPropertyDomain);
        if (result == null) result = caseAxiom(dataPropertyDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY_RANGE:
      {
        DataPropertyRange dataPropertyRange = (DataPropertyRange)theEObject;
        T result = caseDataPropertyRange(dataPropertyRange);
        if (result == null) result = caseDataPropertyAxiom(dataPropertyRange);
        if (result == null) result = caseAnnotationAxiom(dataPropertyRange);
        if (result == null) result = caseAxiom(dataPropertyRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY:
      {
        FunctionalDataProperty functionalDataProperty = (FunctionalDataProperty)theEObject;
        T result = caseFunctionalDataProperty(functionalDataProperty);
        if (result == null) result = caseDataPropertyAxiom(functionalDataProperty);
        if (result == null) result = caseAnnotationAxiom(functionalDataProperty);
        if (result == null) result = caseAxiom(functionalDataProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATATYPE_DEFINITION:
      {
        DatatypeDefinition datatypeDefinition = (DatatypeDefinition)theEObject;
        T result = caseDatatypeDefinition(datatypeDefinition);
        if (result == null) result = caseAnnotationAxiom(datatypeDefinition);
        if (result == null) result = caseAxiom(datatypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.HAS_KEY:
      {
        HasKey hasKey = (HasKey)theEObject;
        T result = caseHasKey(hasKey);
        if (result == null) result = caseAnnotationAxiom(hasKey);
        if (result == null) result = caseAxiom(hasKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ASSERTION:
      {
        Assertion assertion = (Assertion)theEObject;
        T result = caseAssertion(assertion);
        if (result == null) result = caseAnnotationAxiom(assertion);
        if (result == null) result = caseAxiom(assertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SAME_INDIVIDUAL:
      {
        SameIndividual sameIndividual = (SameIndividual)theEObject;
        T result = caseSameIndividual(sameIndividual);
        if (result == null) result = caseAssertion(sameIndividual);
        if (result == null) result = caseAnnotationAxiom(sameIndividual);
        if (result == null) result = caseAxiom(sameIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS:
      {
        DifferentIndividuals differentIndividuals = (DifferentIndividuals)theEObject;
        T result = caseDifferentIndividuals(differentIndividuals);
        if (result == null) result = caseAssertion(differentIndividuals);
        if (result == null) result = caseAnnotationAxiom(differentIndividuals);
        if (result == null) result = caseAxiom(differentIndividuals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS_ASSERTION:
      {
        ClassAssertion classAssertion = (ClassAssertion)theEObject;
        T result = caseClassAssertion(classAssertion);
        if (result == null) result = caseAssertion(classAssertion);
        if (result == null) result = caseAnnotationAxiom(classAssertion);
        if (result == null) result = caseAxiom(classAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_ASSERTION:
      {
        ObjectPropertyAssertion objectPropertyAssertion = (ObjectPropertyAssertion)theEObject;
        T result = caseObjectPropertyAssertion(objectPropertyAssertion);
        if (result == null) result = caseAssertion(objectPropertyAssertion);
        if (result == null) result = caseAnnotationAxiom(objectPropertyAssertion);
        if (result == null) result = caseAxiom(objectPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION:
      {
        NegativeObjectPropertyAssertion negativeObjectPropertyAssertion = (NegativeObjectPropertyAssertion)theEObject;
        T result = caseNegativeObjectPropertyAssertion(negativeObjectPropertyAssertion);
        if (result == null) result = caseAssertion(negativeObjectPropertyAssertion);
        if (result == null) result = caseAnnotationAxiom(negativeObjectPropertyAssertion);
        if (result == null) result = caseAxiom(negativeObjectPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION:
      {
        DataPropertyAssertion dataPropertyAssertion = (DataPropertyAssertion)theEObject;
        T result = caseDataPropertyAssertion(dataPropertyAssertion);
        if (result == null) result = caseAssertion(dataPropertyAssertion);
        if (result == null) result = caseAnnotationAxiom(dataPropertyAssertion);
        if (result == null) result = caseAxiom(dataPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION:
      {
        NegativeDataPropertyAssertion negativeDataPropertyAssertion = (NegativeDataPropertyAssertion)theEObject;
        T result = caseNegativeDataPropertyAssertion(negativeDataPropertyAssertion);
        if (result == null) result = caseAssertion(negativeDataPropertyAssertion);
        if (result == null) result = caseAnnotationAxiom(negativeDataPropertyAssertion);
        if (result == null) result = caseAxiom(negativeDataPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = caseAxiom(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DL_SAFE_RULE:
      {
        DLSafeRule dlSafeRule = (DLSafeRule)theEObject;
        T result = caseDLSafeRule(dlSafeRule);
        if (result == null) result = caseRule(dlSafeRule);
        if (result == null) result = caseAxiom(dlSafeRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ATOM:
      {
        Atom atom = (Atom)theEObject;
        T result = caseAtom(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS_ATOM:
      {
        ClassAtom classAtom = (ClassAtom)theEObject;
        T result = caseClassAtom(classAtom);
        if (result == null) result = caseAtom(classAtom);
        if (result == null) result = caseDGAtom(classAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_RANGE_ATOM:
      {
        DataRangeAtom dataRangeAtom = (DataRangeAtom)theEObject;
        T result = caseDataRangeAtom(dataRangeAtom);
        if (result == null) result = caseAtom(dataRangeAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_ATOM:
      {
        ObjectPropertyAtom objectPropertyAtom = (ObjectPropertyAtom)theEObject;
        T result = caseObjectPropertyAtom(objectPropertyAtom);
        if (result == null) result = caseAtom(objectPropertyAtom);
        if (result == null) result = caseDGAtom(objectPropertyAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPETY_ATOM:
      {
        DataPropetyAtom dataPropetyAtom = (DataPropetyAtom)theEObject;
        T result = caseDataPropetyAtom(dataPropetyAtom);
        if (result == null) result = caseAtom(dataPropetyAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.BUILT_IN_ATOM:
      {
        BuiltInAtom builtInAtom = (BuiltInAtom)theEObject;
        T result = caseBuiltInAtom(builtInAtom);
        if (result == null) result = caseAtom(builtInAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SAME_INDIVIDUAL_ATOM:
      {
        SameIndividualAtom sameIndividualAtom = (SameIndividualAtom)theEObject;
        T result = caseSameIndividualAtom(sameIndividualAtom);
        if (result == null) result = caseAtom(sameIndividualAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM:
      {
        DifferentIndividualsAtom differentIndividualsAtom = (DifferentIndividualsAtom)theEObject;
        T result = caseDifferentIndividualsAtom(differentIndividualsAtom);
        if (result == null) result = caseAtom(differentIndividualsAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.IARG:
      {
        IArg iArg = (IArg)theEObject;
        T result = caseIArg(iArg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DARG:
      {
        DArg dArg = (DArg)theEObject;
        T result = caseDArg(dArg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseIArg(variable);
        if (result == null) result = caseDArg(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DG_RULE:
      {
        DGRule dgRule = (DGRule)theEObject;
        T result = caseDGRule(dgRule);
        if (result == null) result = caseRule(dgRule);
        if (result == null) result = caseAxiom(dgRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DG_ATOM:
      {
        DGAtom dgAtom = (DGAtom)theEObject;
        T result = caseDGAtom(dgAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DG_AXIOM:
      {
        DGAxiom dgAxiom = (DGAxiom)theEObject;
        T result = caseDGAxiom(dgAxiom);
        if (result == null) result = caseAxiom(dgAxiom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DG_NODES:
      {
        DGNodes dgNodes = (DGNodes)theEObject;
        T result = caseDGNodes(dgNodes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.NODE_ASSERTION:
      {
        NodeAssertion nodeAssertion = (NodeAssertion)theEObject;
        T result = caseNodeAssertion(nodeAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DG_EDGES:
      {
        DGEdges dgEdges = (DGEdges)theEObject;
        T result = caseDGEdges(dgEdges);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.EDGE_ASSERTION:
      {
        EdgeAssertion edgeAssertion = (EdgeAssertion)theEObject;
        T result = caseEdgeAssertion(edgeAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.MAIN_CLASSES:
      {
        MainClasses mainClasses = (MainClasses)theEObject;
        T result = caseMainClasses(mainClasses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.TEMPLATE_PARAMETER:
      {
        TemplateParameter templateParameter = (TemplateParameter)theEObject;
        T result = caseTemplateParameter(templateParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.PARAMETERABLE_ELEMENT:
      {
        ParameterableElement parameterableElement = (ParameterableElement)theEObject;
        T result = caseParameterableElement(parameterableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.TEMPLATE_SIGNATURE:
      {
        TemplateSignature templateSignature = (TemplateSignature)theEObject;
        T result = caseTemplateSignature(templateSignature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.TEMPLATEABLE_ELEMENT:
      {
        TemplateableElement templateableElement = (TemplateableElement)theEObject;
        T result = caseTemplateableElement(templateableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.PACKAGE:
      {
        west.twouse.language.owl2fs.Package package_ = (west.twouse.language.owl2fs.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseTemplateableElement(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASSIFIER_TEMPLATE_PARAMETER:
      {
        ClassifierTemplateParameter classifierTemplateParameter = (ClassifierTemplateParameter)theEObject;
        T result = caseClassifierTemplateParameter(classifierTemplateParameter);
        if (result == null) result = caseTemplateParameter(classifierTemplateParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.TEMPLATE_PARAMETER_SUBSTITUTION:
      {
        TemplateParameterSubstitution templateParameterSubstitution = (TemplateParameterSubstitution)theEObject;
        T result = caseTemplateParameterSubstitution(templateParameterSubstitution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.TEMPLATE_BINDING:
      {
        TemplateBinding templateBinding = (TemplateBinding)theEObject;
        T result = caseTemplateBinding(templateBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
   * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOntology(Ontology object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Axiom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Axiom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAxiom(Axiom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
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
   * Returns the result of interpreting the object as an instance of '<em>Datatype Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatypeDeclaration(DatatypeDeclaration object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Property Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPropertyDeclaration(DataPropertyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Property Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Property Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationPropertyDeclaration(AnnotationPropertyDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Individual Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Individual Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedIndividualDeclaration(NamedIndividualDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Subject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Subject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationSubject(AnnotationSubject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationValue(AnnotationValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Axiom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Axiom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationAxiom(AnnotationAxiom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationAssertion(AnnotationAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Annotation Property Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Annotation Property Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubAnnotationPropertyOf(SubAnnotationPropertyOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Property Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Property Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationPropertyDomain(AnnotationPropertyDomain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Property Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Property Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationPropertyRange(AnnotationPropertyRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationProperty(AnnotationProperty object)
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
  public T caseClass(west.twouse.language.owl2fs.Class object)
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
   * Returns the result of interpreting the object as an instance of '<em>Facet Constraint Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet Constraint Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetConstraintPair(FacetConstraintPair object)
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
   * Returns the result of interpreting the object as an instance of '<em>Object Has Self</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Has Self</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectHasSelf(ObjectHasSelf object)
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
   * Returns the result of interpreting the object as an instance of '<em>Class Axiom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Axiom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassAxiom(ClassAxiom object)
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
   * Returns the result of interpreting the object as an instance of '<em>Object Property Axiom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Property Axiom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectPropertyAxiom(ObjectPropertyAxiom object)
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
   * Returns the result of interpreting the object as an instance of '<em>Sub Object Property Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Object Property Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubObjectPropertyExpression(SubObjectPropertyExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Inverse Object Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inverse Object Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInverseObjectProperties(InverseObjectProperties object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Property Axiom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Property Axiom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPropertyAxiom(DataPropertyAxiom object)
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
   * Returns the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatypeDefinition(DatatypeDefinition object)
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
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DL Safe Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DL Safe Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDLSafeRule(DLSafeRule object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Range Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Range Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataRangeAtom(DataRangeAtom object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Propety Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Propety Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataPropetyAtom(DataPropetyAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltInAtom(BuiltInAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Same Individual Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Same Individual Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSameIndividualAtom(SameIndividualAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Different Individuals Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Different Individuals Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDifferentIndividualsAtom(DifferentIndividualsAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IArg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IArg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIArg(IArg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DArg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DArg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDArg(DArg object)
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
   * Returns the result of interpreting the object as an instance of '<em>DG Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DG Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDGRule(DGRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DG Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DG Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDGAtom(DGAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DG Axiom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DG Axiom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDGAxiom(DGAxiom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DG Nodes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DG Nodes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDGNodes(DGNodes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeAssertion(NodeAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DG Edges</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DG Edges</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDGEdges(DGEdges object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edge Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edge Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEdgeAssertion(EdgeAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main Classes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main Classes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMainClasses(MainClasses object)
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
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(west.twouse.language.owl2fs.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier Template Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier Template Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifierTemplateParameter(ClassifierTemplateParameter object)
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

} //Owl2fsSwitch
