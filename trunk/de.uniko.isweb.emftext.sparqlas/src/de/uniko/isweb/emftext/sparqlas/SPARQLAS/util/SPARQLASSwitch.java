/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.util;

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
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI;
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
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Term;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty;
import de.uniko.isweb.emftext.sparqlas.SPARQLAS.Variable;

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
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage
 * @generated
 */
public class SPARQLASSwitch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static SPARQLASPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SPARQLASSwitch() {
    if (modelPackage == null)
    {
      modelPackage = SPARQLASPackage.eINSTANCE;
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	public T doSwitch(EObject theEObject) {
    return doSwitch(theEObject.eClass(), theEObject);
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case SPARQLASPackage.ONTOLOGY_DOCUMENT:
      {
        OntologyDocument ontologyDocument = (OntologyDocument)theEObject;
        T result = caseOntologyDocument(ontologyDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.PREFIX_DEFINITION:
      {
        PrefixDefinition prefixDefinition = (PrefixDefinition)theEObject;
        T result = casePrefixDefinition(prefixDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.QUERY:
      {
        Query query = (Query)theEObject;
        T result = caseQuery(query);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.ATOM:
      {
        Atom atom = (Atom)theEObject;
        T result = caseAtom(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseTerm(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.CLASS_VARIABLE:
      {
        ClassVariable classVariable = (ClassVariable)theEObject;
        T result = caseClassVariable(classVariable);
        if (result == null) result = caseVariable(classVariable);
        if (result == null) result = caseClassExpression(classVariable);
        if (result == null) result = caseTerm(classVariable);
        if (result == null) result = caseExpression(classVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_PROPERTY_VARIABLE:
      {
        ObjectPropertyVariable objectPropertyVariable = (ObjectPropertyVariable)theEObject;
        T result = caseObjectPropertyVariable(objectPropertyVariable);
        if (result == null) result = caseVariable(objectPropertyVariable);
        if (result == null) result = caseObjectPropertyExpression(objectPropertyVariable);
        if (result == null) result = caseTerm(objectPropertyVariable);
        if (result == null) result = caseExpression(objectPropertyVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.DATA_PROPERTY_VARIABLE:
      {
        DataPropertyVariable dataPropertyVariable = (DataPropertyVariable)theEObject;
        T result = caseDataPropertyVariable(dataPropertyVariable);
        if (result == null) result = caseVariable(dataPropertyVariable);
        if (result == null) result = caseDataPropertyExpression(dataPropertyVariable);
        if (result == null) result = caseTerm(dataPropertyVariable);
        if (result == null) result = caseExpression(dataPropertyVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.INDIVIDUAL_VARIABLE:
      {
        IndividualVariable individualVariable = (IndividualVariable)theEObject;
        T result = caseIndividualVariable(individualVariable);
        if (result == null) result = caseVariable(individualVariable);
        if (result == null) result = caseIndividual(individualVariable);
        if (result == null) result = caseTerm(individualVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.CLASS:
      {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class class_ = (de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseClassExpression(class_);
        if (result == null) result = caseConstant(class_);
        if (result == null) result = caseExpression(class_);
        if (result == null) result = caseTerm(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.DATATYPE:
      {
        Datatype datatype = (Datatype)theEObject;
        T result = caseDatatype(datatype);
        if (result == null) result = caseConstant(datatype);
        if (result == null) result = caseTerm(datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_PROPERTY:
      {
        ObjectProperty objectProperty = (ObjectProperty)theEObject;
        T result = caseObjectProperty(objectProperty);
        if (result == null) result = caseObjectPropertyExpression(objectProperty);
        if (result == null) result = caseConstant(objectProperty);
        if (result == null) result = caseExpression(objectProperty);
        if (result == null) result = caseTerm(objectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.DATA_PROPERTY:
      {
        DataProperty dataProperty = (DataProperty)theEObject;
        T result = caseDataProperty(dataProperty);
        if (result == null) result = caseDataPropertyExpression(dataProperty);
        if (result == null) result = caseConstant(dataProperty);
        if (result == null) result = caseExpression(dataProperty);
        if (result == null) result = caseTerm(dataProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.INDIVIDUAL:
      {
        Individual individual = (Individual)theEObject;
        T result = caseIndividual(individual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.NAMED_INDIVIDUAL:
      {
        NamedIndividual namedIndividual = (NamedIndividual)theEObject;
        T result = caseNamedIndividual(namedIndividual);
        if (result == null) result = caseIndividual(namedIndividual);
        if (result == null) result = caseConstant(namedIndividual);
        if (result == null) result = caseTerm(namedIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.ANONYMOUS_INDIVIDUAL:
      {
        AnonymousIndividual anonymousIndividual = (AnonymousIndividual)theEObject;
        T result = caseAnonymousIndividual(anonymousIndividual);
        if (result == null) result = caseIndividual(anonymousIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.CLASS_ATOM:
      {
        ClassAtom classAtom = (ClassAtom)theEObject;
        T result = caseClassAtom(classAtom);
        if (result == null) result = caseAtom(classAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.EQUIVALENT_CLASSES:
      {
        EquivalentClasses equivalentClasses = (EquivalentClasses)theEObject;
        T result = caseEquivalentClasses(equivalentClasses);
        if (result == null) result = caseClassAtom(equivalentClasses);
        if (result == null) result = caseAtom(equivalentClasses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.SUB_CLASS_OF:
      {
        SubClassOf subClassOf = (SubClassOf)theEObject;
        T result = caseSubClassOf(subClassOf);
        if (result == null) result = caseClassAtom(subClassOf);
        if (result == null) result = caseAtom(subClassOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.DISJOINT_CLASSES:
      {
        DisjointClasses disjointClasses = (DisjointClasses)theEObject;
        T result = caseDisjointClasses(disjointClasses);
        if (result == null) result = caseClassAtom(disjointClasses);
        if (result == null) result = caseAtom(disjointClasses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_PROPERTY_ATOM:
      {
        ObjectPropertyAtom objectPropertyAtom = (ObjectPropertyAtom)theEObject;
        T result = caseObjectPropertyAtom(objectPropertyAtom);
        if (result == null) result = caseAtom(objectPropertyAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.ASSERTION:
      {
        Assertion assertion = (Assertion)theEObject;
        T result = caseAssertion(assertion);
        if (result == null) result = caseAtom(assertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_PROPERTY_ASSERTION:
      {
        ObjectPropertyAssertion objectPropertyAssertion = (ObjectPropertyAssertion)theEObject;
        T result = caseObjectPropertyAssertion(objectPropertyAssertion);
        if (result == null) result = caseAssertion(objectPropertyAssertion);
        if (result == null) result = caseAtom(objectPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.DATA_PROPERTY_ASSERTION:
      {
        DataPropertyAssertion dataPropertyAssertion = (DataPropertyAssertion)theEObject;
        T result = caseDataPropertyAssertion(dataPropertyAssertion);
        if (result == null) result = caseAssertion(dataPropertyAssertion);
        if (result == null) result = caseAtom(dataPropertyAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.CLASS_ASSERTION:
      {
        ClassAssertion classAssertion = (ClassAssertion)theEObject;
        T result = caseClassAssertion(classAssertion);
        if (result == null) result = caseAssertion(classAssertion);
        if (result == null) result = caseAtom(classAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.SAME_INDIVIDUAL:
      {
        SameIndividual sameIndividual = (SameIndividual)theEObject;
        T result = caseSameIndividual(sameIndividual);
        if (result == null) result = caseAssertion(sameIndividual);
        if (result == null) result = caseAtom(sameIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.DIFFERENT_INDIVIDUALS:
      {
        DifferentIndividuals differentIndividuals = (DifferentIndividuals)theEObject;
        T result = caseDifferentIndividuals(differentIndividuals);
        if (result == null) result = caseAssertion(differentIndividuals);
        if (result == null) result = caseAtom(differentIndividuals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.EQUIVALENT_OBJECT_PROPERTIES:
      {
        EquivalentObjectProperties equivalentObjectProperties = (EquivalentObjectProperties)theEObject;
        T result = caseEquivalentObjectProperties(equivalentObjectProperties);
        if (result == null) result = caseObjectPropertyAtom(equivalentObjectProperties);
        if (result == null) result = caseAtom(equivalentObjectProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.SUB_PROPERTY_OF:
      {
        SubPropertyOf subPropertyOf = (SubPropertyOf)theEObject;
        T result = caseSubPropertyOf(subPropertyOf);
        if (result == null) result = caseObjectPropertyAtom(subPropertyOf);
        if (result == null) result = caseAtom(subPropertyOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_PROPERTY_EXPRESSION:
      {
        ObjectPropertyExpression objectPropertyExpression = (ObjectPropertyExpression)theEObject;
        T result = caseObjectPropertyExpression(objectPropertyExpression);
        if (result == null) result = caseExpression(objectPropertyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.INVERSE_OBJECT_PROPERTY:
      {
        InverseObjectProperty inverseObjectProperty = (InverseObjectProperty)theEObject;
        T result = caseInverseObjectProperty(inverseObjectProperty);
        if (result == null) result = caseObjectPropertyExpression(inverseObjectProperty);
        if (result == null) result = caseExpression(inverseObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.INVERSE_OBJECT_PROPERTY_ATOM:
      {
        InverseObjectPropertyAtom inverseObjectPropertyAtom = (InverseObjectPropertyAtom)theEObject;
        T result = caseInverseObjectPropertyAtom(inverseObjectPropertyAtom);
        if (result == null) result = caseObjectPropertyAtom(inverseObjectPropertyAtom);
        if (result == null) result = caseAtom(inverseObjectPropertyAtom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.FUNCTIONAL_OBJECT_PROPERTY:
      {
        FunctionalObjectProperty functionalObjectProperty = (FunctionalObjectProperty)theEObject;
        T result = caseFunctionalObjectProperty(functionalObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(functionalObjectProperty);
        if (result == null) result = caseAtom(functionalObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY:
      {
        InverseFunctionalObjectProperty inverseFunctionalObjectProperty = (InverseFunctionalObjectProperty)theEObject;
        T result = caseInverseFunctionalObjectProperty(inverseFunctionalObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(inverseFunctionalObjectProperty);
        if (result == null) result = caseAtom(inverseFunctionalObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.TRANSITIVE_OBJECT_PROPERTY:
      {
        TransitiveObjectProperty transitiveObjectProperty = (TransitiveObjectProperty)theEObject;
        T result = caseTransitiveObjectProperty(transitiveObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(transitiveObjectProperty);
        if (result == null) result = caseAtom(transitiveObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.SYMMETRIC_OBJECT_PROPERTY:
      {
        SymmetricObjectProperty symmetricObjectProperty = (SymmetricObjectProperty)theEObject;
        T result = caseSymmetricObjectProperty(symmetricObjectProperty);
        if (result == null) result = caseObjectPropertyAtom(symmetricObjectProperty);
        if (result == null) result = caseAtom(symmetricObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.CLASS_EXPRESSION:
      {
        ClassExpression classExpression = (ClassExpression)theEObject;
        T result = caseClassExpression(classExpression);
        if (result == null) result = caseExpression(classExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.DATA_PROPERTY_EXPRESSION:
      {
        DataPropertyExpression dataPropertyExpression = (DataPropertyExpression)theEObject;
        T result = caseDataPropertyExpression(dataPropertyExpression);
        if (result == null) result = caseExpression(dataPropertyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_UNION_OF:
      {
        ObjectUnionOf objectUnionOf = (ObjectUnionOf)theEObject;
        T result = caseObjectUnionOf(objectUnionOf);
        if (result == null) result = caseClassExpression(objectUnionOf);
        if (result == null) result = caseExpression(objectUnionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_COMPLEMENT_OF:
      {
        ObjectComplementOf objectComplementOf = (ObjectComplementOf)theEObject;
        T result = caseObjectComplementOf(objectComplementOf);
        if (result == null) result = caseClassExpression(objectComplementOf);
        if (result == null) result = caseExpression(objectComplementOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_ONE_OF:
      {
        ObjectOneOf objectOneOf = (ObjectOneOf)theEObject;
        T result = caseObjectOneOf(objectOneOf);
        if (result == null) result = caseClassExpression(objectOneOf);
        if (result == null) result = caseExpression(objectOneOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_INTERSECTION_OF:
      {
        ObjectIntersectionOf objectIntersectionOf = (ObjectIntersectionOf)theEObject;
        T result = caseObjectIntersectionOf(objectIntersectionOf);
        if (result == null) result = caseClassExpression(objectIntersectionOf);
        if (result == null) result = caseExpression(objectIntersectionOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_ALL_VALUES_FROM:
      {
        ObjectAllValuesFrom objectAllValuesFrom = (ObjectAllValuesFrom)theEObject;
        T result = caseObjectAllValuesFrom(objectAllValuesFrom);
        if (result == null) result = caseClassExpression(objectAllValuesFrom);
        if (result == null) result = caseExpression(objectAllValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_SOME_VALUES_FROM:
      {
        ObjectSomeValuesFrom objectSomeValuesFrom = (ObjectSomeValuesFrom)theEObject;
        T result = caseObjectSomeValuesFrom(objectSomeValuesFrom);
        if (result == null) result = caseClassExpression(objectSomeValuesFrom);
        if (result == null) result = caseExpression(objectSomeValuesFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_HAS_VALUE:
      {
        ObjectHasValue objectHasValue = (ObjectHasValue)theEObject;
        T result = caseObjectHasValue(objectHasValue);
        if (result == null) result = caseClassExpression(objectHasValue);
        if (result == null) result = caseExpression(objectHasValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_MIN_CARDINALITY:
      {
        ObjectMinCardinality objectMinCardinality = (ObjectMinCardinality)theEObject;
        T result = caseObjectMinCardinality(objectMinCardinality);
        if (result == null) result = caseClassExpression(objectMinCardinality);
        if (result == null) result = caseExpression(objectMinCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_MAX_CARDINALITY:
      {
        ObjectMaxCardinality objectMaxCardinality = (ObjectMaxCardinality)theEObject;
        T result = caseObjectMaxCardinality(objectMaxCardinality);
        if (result == null) result = caseClassExpression(objectMaxCardinality);
        if (result == null) result = caseExpression(objectMaxCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_EXACT_CARDINALITY:
      {
        ObjectExactCardinality objectExactCardinality = (ObjectExactCardinality)theEObject;
        T result = caseObjectExactCardinality(objectExactCardinality);
        if (result == null) result = caseClassExpression(objectExactCardinality);
        if (result == null) result = caseExpression(objectExactCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.DATA_HAS_VALUE:
      {
        DataHasValue dataHasValue = (DataHasValue)theEObject;
        T result = caseDataHasValue(dataHasValue);
        if (result == null) result = caseClassExpression(dataHasValue);
        if (result == null) result = caseExpression(dataHasValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.IRI:
      {
        IRI iri = (IRI)theEObject;
        T result = caseIRI(iri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.FULL_IRI:
      {
        FullIRI fullIRI = (FullIRI)theEObject;
        T result = caseFullIRI(fullIRI);
        if (result == null) result = caseIRI(fullIRI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.ABBREVIATED_IRI:
      {
        AbbreviatedIRI abbreviatedIRI = (AbbreviatedIRI)theEObject;
        T result = caseAbbreviatedIRI(abbreviatedIRI);
        if (result == null) result = caseIRI(abbreviatedIRI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = caseAtom(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.OBJECT_PROPERTY_DECLARATION:
      {
        ObjectPropertyDeclaration objectPropertyDeclaration = (ObjectPropertyDeclaration)theEObject;
        T result = caseObjectPropertyDeclaration(objectPropertyDeclaration);
        if (result == null) result = caseDeclaration(objectPropertyDeclaration);
        if (result == null) result = caseAtom(objectPropertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION:
      {
        DatatypePropertyDeclaration datatypePropertyDeclaration = (DatatypePropertyDeclaration)theEObject;
        T result = caseDatatypePropertyDeclaration(datatypePropertyDeclaration);
        if (result == null) result = caseDeclaration(datatypePropertyDeclaration);
        if (result == null) result = caseAtom(datatypePropertyDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.INDIVIDUAL_DECLARATION:
      {
        IndividualDeclaration individualDeclaration = (IndividualDeclaration)theEObject;
        T result = caseIndividualDeclaration(individualDeclaration);
        if (result == null) result = caseDeclaration(individualDeclaration);
        if (result == null) result = caseAtom(individualDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.CLASS_DECLARATION:
      {
        ClassDeclaration classDeclaration = (ClassDeclaration)theEObject;
        T result = caseClassDeclaration(classDeclaration);
        if (result == null) result = caseDeclaration(classDeclaration);
        if (result == null) result = caseAtom(classDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseTerm(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SPARQLASPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
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
	public T caseOntologyDocument(OntologyDocument object) {
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
	public T casePrefixDefinition(PrefixDefinition object) {
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
	public T caseQuery(Query object) {
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
	public T caseAtom(Atom object) {
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
	public T caseVariable(Variable object) {
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
	public T caseClassVariable(ClassVariable object) {
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
	public T caseObjectPropertyVariable(ObjectPropertyVariable object) {
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
	public T caseDataPropertyVariable(DataPropertyVariable object) {
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
	public T caseIndividualVariable(IndividualVariable object) {
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
	public T caseClass(de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class object) {
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
	public T caseDatatype(Datatype object) {
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
	public T caseObjectProperty(ObjectProperty object) {
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
	public T caseDataProperty(DataProperty object) {
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
	public T caseIndividual(Individual object) {
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
	public T caseNamedIndividual(NamedIndividual object) {
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
	public T caseAnonymousIndividual(AnonymousIndividual object) {
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
	public T caseLiteral(Literal object) {
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
	public T caseClassAtom(ClassAtom object) {
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
	public T caseEquivalentClasses(EquivalentClasses object) {
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
	public T caseSubClassOf(SubClassOf object) {
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
	public T caseDisjointClasses(DisjointClasses object) {
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
	public T caseObjectPropertyAtom(ObjectPropertyAtom object) {
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
	public T caseAssertion(Assertion object) {
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
	public T caseObjectPropertyAssertion(ObjectPropertyAssertion object) {
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
	public T caseDataPropertyAssertion(DataPropertyAssertion object) {
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
	public T caseClassAssertion(ClassAssertion object) {
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
	public T caseSameIndividual(SameIndividual object) {
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
	public T caseDifferentIndividuals(DifferentIndividuals object) {
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
	public T caseEquivalentObjectProperties(EquivalentObjectProperties object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Sub Property Of</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Property Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSubPropertyOf(SubPropertyOf object) {
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
	public T caseExpression(Expression object) {
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
	public T caseObjectPropertyExpression(ObjectPropertyExpression object) {
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
	public T caseInverseObjectProperty(InverseObjectProperty object) {
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
	public T caseInverseObjectPropertyAtom(InverseObjectPropertyAtom object) {
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
	public T caseFunctionalObjectProperty(FunctionalObjectProperty object) {
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
	public T caseInverseFunctionalObjectProperty(InverseFunctionalObjectProperty object) {
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
	public T caseTransitiveObjectProperty(TransitiveObjectProperty object) {
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
	public T caseSymmetricObjectProperty(SymmetricObjectProperty object) {
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
	public T caseClassExpression(ClassExpression object) {
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
	public T caseDataPropertyExpression(DataPropertyExpression object) {
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
	public T caseObjectUnionOf(ObjectUnionOf object) {
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
	public T caseObjectComplementOf(ObjectComplementOf object) {
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
	public T caseObjectOneOf(ObjectOneOf object) {
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
	public T caseObjectIntersectionOf(ObjectIntersectionOf object) {
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
	public T caseObjectAllValuesFrom(ObjectAllValuesFrom object) {
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
	public T caseObjectSomeValuesFrom(ObjectSomeValuesFrom object) {
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
	public T caseObjectHasValue(ObjectHasValue object) {
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
	public T caseObjectMinCardinality(ObjectMinCardinality object) {
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
	public T caseObjectMaxCardinality(ObjectMaxCardinality object) {
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
	public T caseObjectExactCardinality(ObjectExactCardinality object) {
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
	public T caseDataHasValue(DataHasValue object) {
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
	public T caseIRI(IRI object) {
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
	public T caseFullIRI(FullIRI object) {
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
	public T caseAbbreviatedIRI(AbbreviatedIRI object) {
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
	public T caseDeclaration(Declaration object) {
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
	public T caseObjectPropertyDeclaration(ObjectPropertyDeclaration object) {
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
	public T caseDatatypePropertyDeclaration(DatatypePropertyDeclaration object) {
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
	public T caseIndividualDeclaration(IndividualDeclaration object) {
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
	public T caseClassDeclaration(ClassDeclaration object) {
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
	public T caseConstant(Constant object) {
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
	public T caseTerm(Term object) {
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
	public T defaultCase(EObject object) {
    return null;
  }

} //SPARQLASSwitch
