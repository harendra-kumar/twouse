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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage
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
      case Owl2fsPackage.ASSERTION:
      {
        Assertion assertion = (Assertion)theEObject;
        T result = caseAssertion(assertion);
        if (result == null) result = caseAxiom(assertion);
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
      case Owl2fsPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
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
      case Owl2fsPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.URI:
      {
        URI uri = (URI)theEObject;
        T result = caseURI(uri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseConstant(literal);
        if (result == null) result = caseDObject(literal);
        if (result == null) result = caseTerm(literal);
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
      case Owl2fsPackage.DATA_RANGE:
      {
        DataRange dataRange = (DataRange)theEObject;
        T result = caseDataRange(dataRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY_AXIOM:
      {
        DataPropertyAxiom dataPropertyAxiom = (DataPropertyAxiom)theEObject;
        T result = caseDataPropertyAxiom(dataPropertyAxiom);
        if (result == null) result = caseAxiom(dataPropertyAxiom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_AXIOM:
      {
        ObjectPropertyAxiom objectPropertyAxiom = (ObjectPropertyAxiom)theEObject;
        T result = caseObjectPropertyAxiom(objectPropertyAxiom);
        if (result == null) result = caseAxiom(objectPropertyAxiom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS_EXPRESSION:
      {
        ClassExpression classExpression = (ClassExpression)theEObject;
        T result = caseClassExpression(classExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS_AXIOM:
      {
        ClassAxiom classAxiom = (ClassAxiom)theEObject;
        T result = caseClassAxiom(classAxiom);
        if (result == null) result = caseAxiom(classAxiom);
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
      case Owl2fsPackage.OBJECT_PROPERTY_EXPRESSION:
      {
        ObjectPropertyExpression objectPropertyExpression = (ObjectPropertyExpression)theEObject;
        T result = caseObjectPropertyExpression(objectPropertyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY:
      {
        AsymmetricObjectProperty asymmetricObjectProperty = (AsymmetricObjectProperty)theEObject;
        T result = caseAsymmetricObjectProperty(asymmetricObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(asymmetricObjectProperty);
        if (result == null) result = caseAxiom(asymmetricObjectProperty);
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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTY:
      {
        InverseObjectProperty inverseObjectProperty = (InverseObjectProperty)theEObject;
        T result = caseInverseObjectProperty(inverseObjectProperty);
        if (result == null) result = caseObjectPropertyExpression(inverseObjectProperty);
        if (result == null) result = caseExpression(inverseObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS:
      {
        de.uniko.isweb.emftext.owl2fs.owl2fs.Class class_ = (de.uniko.isweb.emftext.owl2fs.owl2fs.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseEntity(class_);
        if (result == null) result = caseClassExpression(class_);
        if (result == null) result = caseParameterableElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_INTERSECTION_OF:
      {
        ObjectIntersectionOf objectIntersectionOf = (ObjectIntersectionOf)theEObject;
        T result = caseObjectIntersectionOf(objectIntersectionOf);
        if (result == null) result = caseClassExpression(objectIntersectionOf);
        if (result == null) result = caseExpression(objectIntersectionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_ONE_OF:
      {
        ObjectOneOf objectOneOf = (ObjectOneOf)theEObject;
        T result = caseObjectOneOf(objectOneOf);
        if (result == null) result = caseClassExpression(objectOneOf);
        if (result == null) result = caseExpression(objectOneOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.INDIVIDUAL:
      {
        Individual individual = (Individual)theEObject;
        T result = caseIndividual(individual);
        if (result == null) result = caseConstant(individual);
        if (result == null) result = caseIObject(individual);
        if (result == null) result = caseTerm(individual);
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
        if (result == null) result = caseConstant(namedIndividual);
        if (result == null) result = caseIObject(namedIndividual);
        if (result == null) result = caseTerm(namedIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_SOME_VALUES_FROM:
      {
        ObjectSomeValuesFrom objectSomeValuesFrom = (ObjectSomeValuesFrom)theEObject;
        T result = caseObjectSomeValuesFrom(objectSomeValuesFrom);
        if (result == null) result = caseClassExpression(objectSomeValuesFrom);
        if (result == null) result = caseExpression(objectSomeValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_ALL_VALUES_FROM:
      {
        ObjectAllValuesFrom objectAllValuesFrom = (ObjectAllValuesFrom)theEObject;
        T result = caseObjectAllValuesFrom(objectAllValuesFrom);
        if (result == null) result = caseClassExpression(objectAllValuesFrom);
        if (result == null) result = caseExpression(objectAllValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_EXISTS_SELF:
      {
        ObjectExistsSelf objectExistsSelf = (ObjectExistsSelf)theEObject;
        T result = caseObjectExistsSelf(objectExistsSelf);
        if (result == null) result = caseClassExpression(objectExistsSelf);
        if (result == null) result = caseExpression(objectExistsSelf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_HAS_VALUE:
      {
        ObjectHasValue objectHasValue = (ObjectHasValue)theEObject;
        T result = caseObjectHasValue(objectHasValue);
        if (result == null) result = caseClassExpression(objectHasValue);
        if (result == null) result = caseExpression(objectHasValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_MIN_CARDINALITY:
      {
        ObjectMinCardinality objectMinCardinality = (ObjectMinCardinality)theEObject;
        T result = caseObjectMinCardinality(objectMinCardinality);
        if (result == null) result = caseClassExpression(objectMinCardinality);
        if (result == null) result = caseExpression(objectMinCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_MAX_CARDINALITY:
      {
        ObjectMaxCardinality objectMaxCardinality = (ObjectMaxCardinality)theEObject;
        T result = caseObjectMaxCardinality(objectMaxCardinality);
        if (result == null) result = caseClassExpression(objectMaxCardinality);
        if (result == null) result = caseExpression(objectMaxCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_SOME_VALUES_FROM:
      {
        DataSomeValuesFrom dataSomeValuesFrom = (DataSomeValuesFrom)theEObject;
        T result = caseDataSomeValuesFrom(dataSomeValuesFrom);
        if (result == null) result = caseClassExpression(dataSomeValuesFrom);
        if (result == null) result = caseExpression(dataSomeValuesFrom);
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
      case Owl2fsPackage.FACET_CONSTANT_PAIR:
      {
        FacetConstantPair facetConstantPair = (FacetConstantPair)theEObject;
        T result = caseFacetConstantPair(facetConstantPair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_ALL_VALUES_FROM:
      {
        DataAllValuesFrom dataAllValuesFrom = (DataAllValuesFrom)theEObject;
        T result = caseDataAllValuesFrom(dataAllValuesFrom);
        if (result == null) result = caseClassExpression(dataAllValuesFrom);
        if (result == null) result = caseExpression(dataAllValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_HAS_VALUE:
      {
        DataHasValue dataHasValue = (DataHasValue)theEObject;
        T result = caseDataHasValue(dataHasValue);
        if (result == null) result = caseClassExpression(dataHasValue);
        if (result == null) result = caseExpression(dataHasValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_MIN_CARDINALITY:
      {
        DataMinCardinality dataMinCardinality = (DataMinCardinality)theEObject;
        T result = caseDataMinCardinality(dataMinCardinality);
        if (result == null) result = caseClassExpression(dataMinCardinality);
        if (result == null) result = caseExpression(dataMinCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_MAX_CARDINALITY:
      {
        DataMaxCardinality dataMaxCardinality = (DataMaxCardinality)theEObject;
        T result = caseDataMaxCardinality(dataMaxCardinality);
        if (result == null) result = caseClassExpression(dataMaxCardinality);
        if (result == null) result = caseExpression(dataMaxCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_EXACT_CARDINALITY:
      {
        DataExactCardinality dataExactCardinality = (DataExactCardinality)theEObject;
        T result = caseDataExactCardinality(dataExactCardinality);
        if (result == null) result = caseClassExpression(dataExactCardinality);
        if (result == null) result = caseExpression(dataExactCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION:
      {
        NegativeDataPropertyAssertion negativeDataPropertyAssertion = (NegativeDataPropertyAssertion)theEObject;
        T result = caseNegativeDataPropertyAssertion(negativeDataPropertyAssertion);
        if (result == null) result = caseAssertion(negativeDataPropertyAssertion);
        if (result == null) result = caseAxiom(negativeDataPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY_DOMAIN:
      {
        DataPropertyDomain dataPropertyDomain = (DataPropertyDomain)theEObject;
        T result = caseDataPropertyDomain(dataPropertyDomain);
        if (result == null) result = caseDataPropertyAxiom(dataPropertyDomain);
        if (result == null) result = caseAxiom(dataPropertyDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY_RANGE:
      {
        DataPropertyRange dataPropertyRange = (DataPropertyRange)theEObject;
        T result = caseDataPropertyRange(dataPropertyRange);
        if (result == null) result = caseDataPropertyAxiom(dataPropertyRange);
        if (result == null) result = caseAxiom(dataPropertyRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DIFFERENT_INDIVIDUALS:
      {
        DifferentIndividuals differentIndividuals = (DifferentIndividuals)theEObject;
        T result = caseDifferentIndividuals(differentIndividuals);
        if (result == null) result = caseAssertion(differentIndividuals);
        if (result == null) result = caseAxiom(differentIndividuals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DISJOINT_CLASSES:
      {
        DisjointClasses disjointClasses = (DisjointClasses)theEObject;
        T result = caseDisjointClasses(disjointClasses);
        if (result == null) result = caseClassAxiom(disjointClasses);
        if (result == null) result = caseAxiom(disjointClasses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DISJOINT_DATA_PROPERTIES:
      {
        DisjointDataProperties disjointDataProperties = (DisjointDataProperties)theEObject;
        T result = caseDisjointDataProperties(disjointDataProperties);
        if (result == null) result = caseDataPropertyAxiom(disjointDataProperties);
        if (result == null) result = caseAxiom(disjointDataProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES:
      {
        DisjointObjectProperties disjointObjectProperties = (DisjointObjectProperties)theEObject;
        T result = caseDisjointObjectProperties(disjointObjectProperties);
        if (result == null) result = caseObjectPropertyAxiom(disjointObjectProperties);
        if (result == null) result = caseAxiom(disjointObjectProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DISJOINT_UNION:
      {
        DisjointUnion disjointUnion = (DisjointUnion)theEObject;
        T result = caseDisjointUnion(disjointUnion);
        if (result == null) result = caseClassAxiom(disjointUnion);
        if (result == null) result = caseAxiom(disjointUnion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.EQUIVALENT_CLASSES:
      {
        EquivalentClasses equivalentClasses = (EquivalentClasses)theEObject;
        T result = caseEquivalentClasses(equivalentClasses);
        if (result == null) result = caseClassAxiom(equivalentClasses);
        if (result == null) result = caseAxiom(equivalentClasses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES:
      {
        EquivalentDataProperties equivalentDataProperties = (EquivalentDataProperties)theEObject;
        T result = caseEquivalentDataProperties(equivalentDataProperties);
        if (result == null) result = caseDataPropertyAxiom(equivalentDataProperties);
        if (result == null) result = caseAxiom(equivalentDataProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES:
      {
        EquivalentObjectProperties equivalentObjectProperties = (EquivalentObjectProperties)theEObject;
        T result = caseEquivalentObjectProperties(equivalentObjectProperties);
        if (result == null) result = caseObjectPropertyAxiom(equivalentObjectProperties);
        if (result == null) result = caseAxiom(equivalentObjectProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY:
      {
        FunctionalDataProperty functionalDataProperty = (FunctionalDataProperty)theEObject;
        T result = caseFunctionalDataProperty(functionalDataProperty);
        if (result == null) result = caseDataPropertyAxiom(functionalDataProperty);
        if (result == null) result = caseAxiom(functionalDataProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY:
      {
        FunctionalObjectProperty functionalObjectProperty = (FunctionalObjectProperty)theEObject;
        T result = caseFunctionalObjectProperty(functionalObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(functionalObjectProperty);
        if (result == null) result = caseAxiom(functionalObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
      {
        InverseFunctionalObjectProperty inverseFunctionalObjectProperty = (InverseFunctionalObjectProperty)theEObject;
        T result = caseInverseFunctionalObjectProperty(inverseFunctionalObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(inverseFunctionalObjectProperty);
        if (result == null) result = caseAxiom(inverseFunctionalObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_ASSERTION:
      {
        ObjectPropertyAssertion objectPropertyAssertion = (ObjectPropertyAssertion)theEObject;
        T result = caseObjectPropertyAssertion(objectPropertyAssertion);
        if (result == null) result = caseAssertion(objectPropertyAssertion);
        if (result == null) result = caseAxiom(objectPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION:
      {
        NegativeObjectPropertyAssertion negativeObjectPropertyAssertion = (NegativeObjectPropertyAssertion)theEObject;
        T result = caseNegativeObjectPropertyAssertion(negativeObjectPropertyAssertion);
        if (result == null) result = caseAssertion(negativeObjectPropertyAssertion);
        if (result == null) result = caseAxiom(negativeObjectPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_PROPERTY_DOMAIN:
      {
        ObjectPropertyDomain objectPropertyDomain = (ObjectPropertyDomain)theEObject;
        T result = caseObjectPropertyDomain(objectPropertyDomain);
        if (result == null) result = caseObjectPropertyAxiom(objectPropertyDomain);
        if (result == null) result = caseAxiom(objectPropertyDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY:
      {
        SymmetricObjectProperty symmetricObjectProperty = (SymmetricObjectProperty)theEObject;
        T result = caseSymmetricObjectProperty(symmetricObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(symmetricObjectProperty);
        if (result == null) result = caseAxiom(symmetricObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY:
      {
        ReflexiveObjectProperty reflexiveObjectProperty = (ReflexiveObjectProperty)theEObject;
        T result = caseReflexiveObjectProperty(reflexiveObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(reflexiveObjectProperty);
        if (result == null) result = caseAxiom(reflexiveObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SUB_DATA_PROPERTY_OF:
      {
        SubDataPropertyOf subDataPropertyOf = (SubDataPropertyOf)theEObject;
        T result = caseSubDataPropertyOf(subDataPropertyOf);
        if (result == null) result = caseDataPropertyAxiom(subDataPropertyOf);
        if (result == null) result = caseAxiom(subDataPropertyOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SAME_INDIVIDUAL:
      {
        SameIndividual sameIndividual = (SameIndividual)theEObject;
        T result = caseSameIndividual(sameIndividual);
        if (result == null) result = caseAssertion(sameIndividual);
        if (result == null) result = caseAxiom(sameIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SUB_OBJECT_PROPERTY_OF:
      {
        SubObjectPropertyOf subObjectPropertyOf = (SubObjectPropertyOf)theEObject;
        T result = caseSubObjectPropertyOf(subObjectPropertyOf);
        if (result == null) result = caseObjectPropertyAxiom(subObjectPropertyOf);
        if (result == null) result = caseAxiom(subObjectPropertyOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_COMPLEMENT_OF:
      {
        ObjectComplementOf objectComplementOf = (ObjectComplementOf)theEObject;
        T result = caseObjectComplementOf(objectComplementOf);
        if (result == null) result = caseClassExpression(objectComplementOf);
        if (result == null) result = caseExpression(objectComplementOf);
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
      case Owl2fsPackage.OBJECT_PROPERTY_RANGE:
      {
        ObjectPropertyRange objectPropertyRange = (ObjectPropertyRange)theEObject;
        T result = caseObjectPropertyRange(objectPropertyRange);
        if (result == null) result = caseObjectPropertyAxiom(objectPropertyRange);
        if (result == null) result = caseAxiom(objectPropertyRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_PROPERTY_ASSERTION:
      {
        DataPropertyAssertion dataPropertyAssertion = (DataPropertyAssertion)theEObject;
        T result = caseDataPropertyAssertion(dataPropertyAssertion);
        if (result == null) result = caseAssertion(dataPropertyAssertion);
        if (result == null) result = caseAxiom(dataPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS_ASSERTION:
      {
        ClassAssertion classAssertion = (ClassAssertion)theEObject;
        T result = caseClassAssertion(classAssertion);
        if (result == null) result = caseAssertion(classAssertion);
        if (result == null) result = caseAxiom(classAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY:
      {
        IrreflexiveObjectProperty irreflexiveObjectProperty = (IrreflexiveObjectProperty)theEObject;
        T result = caseIrreflexiveObjectProperty(irreflexiveObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(irreflexiveObjectProperty);
        if (result == null) result = caseAxiom(irreflexiveObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_EXACT_CARDINALITY:
      {
        ObjectExactCardinality objectExactCardinality = (ObjectExactCardinality)theEObject;
        T result = caseObjectExactCardinality(objectExactCardinality);
        if (result == null) result = caseClassExpression(objectExactCardinality);
        if (result == null) result = caseExpression(objectExactCardinality);
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
      case Owl2fsPackage.SUB_CLASS_OF:
      {
        SubClassOf subClassOf = (SubClassOf)theEObject;
        T result = caseSubClassOf(subClassOf);
        if (result == null) result = caseClassAxiom(subClassOf);
        if (result == null) result = caseAxiom(subClassOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.SUB_OBJECT_PROPERTY:
      {
        SubObjectProperty subObjectProperty = (SubObjectProperty)theEObject;
        T result = caseSubObjectProperty(subObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY:
      {
        TransitiveObjectProperty transitiveObjectProperty = (TransitiveObjectProperty)theEObject;
        T result = caseTransitiveObjectProperty(transitiveObjectProperty);
        if (result == null) result = caseObjectPropertyAxiom(transitiveObjectProperty);
        if (result == null) result = caseAxiom(transitiveObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ENTITY_ANNOTATION:
      {
        EntityAnnotation entityAnnotation = (EntityAnnotation)theEObject;
        T result = caseEntityAnnotation(entityAnnotation);
        if (result == null) result = caseAxiom(entityAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.FULL_URI:
      {
        FullURI fullURI = (FullURI)theEObject;
        T result = caseFullURI(fullURI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ABBREVIATED_URI:
      {
        AbbreviatedURI abbreviatedURI = (AbbreviatedURI)theEObject;
        T result = caseAbbreviatedURI(abbreviatedURI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_UNION_OF:
      {
        ObjectUnionOf objectUnionOf = (ObjectUnionOf)theEObject;
        T result = caseObjectUnionOf(objectUnionOf);
        if (result == null) result = caseClassExpression(objectUnionOf);
        if (result == null) result = caseExpression(objectUnionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.INVERSE_OBJECT_PROPERTIES:
      {
        InverseObjectProperties inverseObjectProperties = (InverseObjectProperties)theEObject;
        T result = caseInverseObjectProperties(inverseObjectProperties);
        if (result == null) result = caseObjectPropertyAxiom(inverseObjectProperties);
        if (result == null) result = caseAxiom(inverseObjectProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_BY_CONSTANT:
      {
        AnnotationByConstant annotationByConstant = (AnnotationByConstant)theEObject;
        T result = caseAnnotationByConstant(annotationByConstant);
        if (result == null) result = caseAnnotation(annotationByConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_BY_ENTITY:
      {
        AnnotationByEntity annotationByEntity = (AnnotationByEntity)theEObject;
        T result = caseAnnotationByEntity(annotationByEntity);
        if (result == null) result = caseAnnotation(annotationByEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANNOTATION_BY_ANONYMOUS_INDIVIDUAL:
      {
        AnnotationByAnonymousIndividual annotationByAnonymousIndividual = (AnnotationByAnonymousIndividual)theEObject;
        T result = caseAnnotationByAnonymousIndividual(annotationByAnonymousIndividual);
        if (result == null) result = caseAnnotation(annotationByAnonymousIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL:
      {
        AnonymousIndividual anonymousIndividual = (AnonymousIndividual)theEObject;
        T result = caseAnonymousIndividual(anonymousIndividual);
        if (result == null) result = caseIndividual(anonymousIndividual);
        if (result == null) result = caseConstant(anonymousIndividual);
        if (result == null) result = caseIObject(anonymousIndividual);
        if (result == null) result = caseTerm(anonymousIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = caseAxiom(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.OBJECT_AND_DATA_PROPERTY_AXIOM:
      {
        ObjectAndDataPropertyAxiom objectAndDataPropertyAxiom = (ObjectAndDataPropertyAxiom)theEObject;
        T result = caseObjectAndDataPropertyAxiom(objectAndDataPropertyAxiom);
        if (result == null) result = caseAxiom(objectAndDataPropertyAxiom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.KEY_FOR:
      {
        KeyFor keyFor = (KeyFor)theEObject;
        T result = caseKeyFor(keyFor);
        if (result == null) result = caseObjectAndDataPropertyAxiom(keyFor);
        if (result == null) result = caseAxiom(keyFor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.ANONYMOUS_INDIVIDUAL_ANNOTATION:
      {
        AnonymousIndividualAnnotation anonymousIndividualAnnotation = (AnonymousIndividualAnnotation)theEObject;
        T result = caseAnonymousIndividualAnnotation(anonymousIndividualAnnotation);
        if (result == null) result = caseAxiom(anonymousIndividualAnnotation);
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
        de.uniko.isweb.emftext.owl2fs.owl2fs.Package package_ = (de.uniko.isweb.emftext.owl2fs.owl2fs.Package)theEObject;
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
      case Owl2fsPackage.DOBJECT:
      {
        DObject dObject = (DObject)theEObject;
        T result = caseDObject(dObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.IOBJECT:
      {
        IObject iObject = (IObject)theEObject;
        T result = caseIObject(iObject);
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
      case Owl2fsPackage.ANTECEDENT:
      {
        Antecedent antecedent = (Antecedent)theEObject;
        T result = caseAntecedent(antecedent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CONSEQUENT:
      {
        Consequent consequent = (Consequent)theEObject;
        T result = caseConsequent(consequent);
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
      case Owl2fsPackage.DATA_RANGE_ATOM:
      {
        DataRangeAtom dataRangeAtom = (DataRangeAtom)theEObject;
        T result = caseDataRangeAtom(dataRangeAtom);
        if (result == null) result = caseAtom(dataRangeAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CLASS_ATOM:
      {
        ClassAtom classAtom = (ClassAtom)theEObject;
        T result = caseClassAtom(classAtom);
        if (result == null) result = caseAtom(classAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.PROPERTY_ATOM:
      {
        PropertyAtom propertyAtom = (PropertyAtom)theEObject;
        T result = casePropertyAtom(propertyAtom);
        if (result == null) result = caseAtom(propertyAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.INDIVIDUAL_PROPETY_ATOM:
      {
        IndividualPropetyAtom individualPropetyAtom = (IndividualPropetyAtom)theEObject;
        T result = caseIndividualPropetyAtom(individualPropetyAtom);
        if (result == null) result = casePropertyAtom(individualPropetyAtom);
        if (result == null) result = caseAtom(individualPropetyAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATAVALUED_PROPERTY_ATOM:
      {
        DatavaluedPropertyAtom datavaluedPropertyAtom = (DatavaluedPropertyAtom)theEObject;
        T result = caseDatavaluedPropertyAtom(datavaluedPropertyAtom);
        if (result == null) result = casePropertyAtom(datavaluedPropertyAtom);
        if (result == null) result = caseAtom(datavaluedPropertyAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseTerm(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.DATA_VARIABLE:
      {
        DataVariable dataVariable = (DataVariable)theEObject;
        T result = caseDataVariable(dataVariable);
        if (result == null) result = caseVariable(dataVariable);
        if (result == null) result = caseDObject(dataVariable);
        if (result == null) result = caseTerm(dataVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.INDIVIDUAL_VARIABLE:
      {
        IndividualVariable individualVariable = (IndividualVariable)theEObject;
        T result = caseIndividualVariable(individualVariable);
        if (result == null) result = caseVariable(individualVariable);
        if (result == null) result = caseIObject(individualVariable);
        if (result == null) result = caseTerm(individualVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Owl2fsPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseTerm(constant);
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
      default: return defaultCase(theEObject);
    }
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
   * Returns the result of interpreting the object as an instance of '<em>URI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURI(URI object)
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
  public T caseClass(de.uniko.isweb.emftext.owl2fs.owl2fs.Class object)
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
   * Returns the result of interpreting the object as an instance of '<em>Object Exists Self</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Exists Self</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectExistsSelf(ObjectExistsSelf object)
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
   * Returns the result of interpreting the object as an instance of '<em>Facet Constant Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet Constant Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacetConstantPair(FacetConstantPair object)
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
   * Returns the result of interpreting the object as an instance of '<em>Sub Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubObjectProperty(SubObjectProperty object)
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
   * Returns the result of interpreting the object as an instance of '<em>Entity Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityAnnotation(EntityAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Full URI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Full URI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFullURI(FullURI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abbreviated URI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abbreviated URI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbbreviatedURI(AbbreviatedURI object)
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
   * Returns the result of interpreting the object as an instance of '<em>Annotation By Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation By Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationByConstant(AnnotationByConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation By Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation By Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationByEntity(AnnotationByEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation By Anonymous Individual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation By Anonymous Individual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationByAnonymousIndividual(AnnotationByAnonymousIndividual object)
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
   * Returns the result of interpreting the object as an instance of '<em>Object And Data Property Axiom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object And Data Property Axiom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectAndDataPropertyAxiom(ObjectAndDataPropertyAxiom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key For</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key For</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyFor(KeyFor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anonymous Individual Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anonymous Individual Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnonymousIndividualAnnotation(AnonymousIndividualAnnotation object)
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
  public T casePackage(de.uniko.isweb.emftext.owl2fs.owl2fs.Package object)
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
   * Returns the result of interpreting the object as an instance of '<em>DObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDObject(DObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIObject(IObject object)
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
   * Returns the result of interpreting the object as an instance of '<em>Antecedent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Antecedent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAntecedent(Antecedent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Consequent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Consequent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsequent(Consequent object)
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
   * Returns the result of interpreting the object as an instance of '<em>Property Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyAtom(PropertyAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Individual Propety Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Individual Propety Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndividualPropetyAtom(IndividualPropetyAtom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datavalued Property Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datavalued Property Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatavaluedPropertyAtom(DatavaluedPropertyAtom object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataVariable(DataVariable object)
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
