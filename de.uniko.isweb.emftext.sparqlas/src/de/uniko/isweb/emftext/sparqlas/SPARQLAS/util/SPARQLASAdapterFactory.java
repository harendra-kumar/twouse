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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage
 * @generated
 */
public class SPARQLASAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static SPARQLASPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SPARQLASAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = SPARQLASPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
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
	protected SPARQLASSwitch<Adapter> modelSwitch =
		new SPARQLASSwitch<Adapter>()
    {
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
      public Adapter caseQuery(Query object)
      {
        return createQueryAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
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
      public Adapter caseClass(de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class object)
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
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseClassAtom(ClassAtom object)
      {
        return createClassAtomAdapter();
      }
      @Override
      public Adapter caseEquivalentClasses(EquivalentClasses object)
      {
        return createEquivalentClassesAdapter();
      }
      @Override
      public Adapter caseSubClassOf(SubClassOf object)
      {
        return createSubClassOfAdapter();
      }
      @Override
      public Adapter caseDisjointClasses(DisjointClasses object)
      {
        return createDisjointClassesAdapter();
      }
      @Override
      public Adapter caseObjectPropertyAtom(ObjectPropertyAtom object)
      {
        return createObjectPropertyAtomAdapter();
      }
      @Override
      public Adapter caseAssertion(Assertion object)
      {
        return createAssertionAdapter();
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
      public Adapter caseClassAssertion(ClassAssertion object)
      {
        return createClassAssertionAdapter();
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
      public Adapter caseEquivalentObjectProperties(EquivalentObjectProperties object)
      {
        return createEquivalentObjectPropertiesAdapter();
      }
      @Override
      public Adapter caseSubPropertyOf(SubPropertyOf object)
      {
        return createSubPropertyOfAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
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
      public Adapter caseTransitiveObjectProperty(TransitiveObjectProperty object)
      {
        return createTransitiveObjectPropertyAdapter();
      }
      @Override
      public Adapter caseSymmetricObjectProperty(SymmetricObjectProperty object)
      {
        return createSymmetricObjectPropertyAdapter();
      }
      @Override
      public Adapter caseClassExpression(ClassExpression object)
      {
        return createClassExpressionAdapter();
      }
      @Override
      public Adapter caseDataPropertyExpression(DataPropertyExpression object)
      {
        return createDataPropertyExpressionAdapter();
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
      public Adapter caseDataHasValue(DataHasValue object)
      {
        return createDataHasValueAdapter();
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
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
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
      public Adapter caseClassDeclaration(ClassDeclaration object)
      {
        return createClassDeclarationAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
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
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument <em>Ontology Document</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument
   * @generated
   */
	public Adapter createOntologyDocumentAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition
   * @generated
   */
	public Adapter createPrefixDefinitionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query
   * @generated
   */
	public Adapter createQueryAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom
   * @generated
   */
	public Adapter createAtomAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Variable
   * @generated
   */
	public Adapter createVariableAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable <em>Class Variable</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable
   * @generated
   */
	public Adapter createClassVariableAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable <em>Object Property Variable</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable
   * @generated
   */
	public Adapter createObjectPropertyVariableAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable <em>Data Property Variable</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable
   * @generated
   */
	public Adapter createDataPropertyVariableAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable <em>Individual Variable</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable
   * @generated
   */
	public Adapter createIndividualVariableAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class
   * @generated
   */
	public Adapter createClassAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype
   * @generated
   */
	public Adapter createDatatypeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty
   * @generated
   */
	public Adapter createObjectPropertyAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty <em>Data Property</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty
   * @generated
   */
	public Adapter createDataPropertyAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual
   * @generated
   */
	public Adapter createIndividualAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual <em>Named Individual</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual
   * @generated
   */
	public Adapter createNamedIndividualAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual <em>Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual
   * @generated
   */
	public Adapter createAnonymousIndividualAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal
   * @generated
   */
	public Adapter createLiteralAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAtom <em>Class Atom</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAtom
   * @generated
   */
	public Adapter createClassAtomAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses <em>Equivalent Classes</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses
   * @generated
   */
	public Adapter createEquivalentClassesAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf <em>Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf
   * @generated
   */
	public Adapter createSubClassOfAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses <em>Disjoint Classes</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses
   * @generated
   */
	public Adapter createDisjointClassesAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAtom <em>Object Property Atom</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAtom
   * @generated
   */
	public Adapter createObjectPropertyAtomAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Assertion
   * @generated
   */
	public Adapter createAssertionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion
   * @generated
   */
	public Adapter createObjectPropertyAssertionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion <em>Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion
   * @generated
   */
	public Adapter createDataPropertyAssertionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion <em>Class Assertion</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion
   * @generated
   */
	public Adapter createClassAssertionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual <em>Same Individual</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual
   * @generated
   */
	public Adapter createSameIndividualAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals <em>Different Individuals</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals
   * @generated
   */
	public Adapter createDifferentIndividualsAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties
   * @generated
   */
	public Adapter createEquivalentObjectPropertiesAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf <em>Sub Property Of</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf
   * @generated
   */
	public Adapter createSubPropertyOfAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Expression
   * @generated
   */
	public Adapter createExpressionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression
   * @generated
   */
	public Adapter createObjectPropertyExpressionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty <em>Inverse Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty
   * @generated
   */
	public Adapter createInverseObjectPropertyAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom <em>Inverse Object Property Atom</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom
   * @generated
   */
	public Adapter createInverseObjectPropertyAtomAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty <em>Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty
   * @generated
   */
	public Adapter createFunctionalObjectPropertyAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty
   * @generated
   */
	public Adapter createInverseFunctionalObjectPropertyAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty
   * @generated
   */
	public Adapter createTransitiveObjectPropertyAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty
   * @generated
   */
	public Adapter createSymmetricObjectPropertyAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression
   * @generated
   */
	public Adapter createClassExpressionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression
   * @generated
   */
	public Adapter createDataPropertyExpressionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf <em>Object Union Of</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf
   * @generated
   */
	public Adapter createObjectUnionOfAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf <em>Object Complement Of</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf
   * @generated
   */
	public Adapter createObjectComplementOfAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf <em>Object One Of</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf
   * @generated
   */
	public Adapter createObjectOneOfAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf
   * @generated
   */
	public Adapter createObjectIntersectionOfAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom <em>Object All Values From</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom
   * @generated
   */
	public Adapter createObjectAllValuesFromAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom
   * @generated
   */
	public Adapter createObjectSomeValuesFromAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue <em>Object Has Value</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue
   * @generated
   */
	public Adapter createObjectHasValueAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality
   * @generated
   */
	public Adapter createObjectMinCardinalityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality
   * @generated
   */
	public Adapter createObjectMaxCardinalityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality
   * @generated
   */
	public Adapter createObjectExactCardinalityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue <em>Data Has Value</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue
   * @generated
   */
	public Adapter createDataHasValueAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI <em>IRI</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI
   * @generated
   */
	public Adapter createIRIAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI <em>Full IRI</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI
   * @generated
   */
	public Adapter createFullIRIAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI <em>Abbreviated IRI</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI
   * @generated
   */
	public Adapter createAbbreviatedIRIAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Declaration
   * @generated
   */
	public Adapter createDeclarationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration <em>Object Property Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration
   * @generated
   */
	public Adapter createObjectPropertyDeclarationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration <em>Datatype Property Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration
   * @generated
   */
	public Adapter createDatatypePropertyDeclarationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration <em>Individual Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration
   * @generated
   */
	public Adapter createIndividualDeclarationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration
   * @generated
   */
	public Adapter createClassDeclarationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Constant
   * @generated
   */
	public Adapter createConstantAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Term
   * @generated
   */
	public Adapter createTermAdapter() {
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
	public Adapter createEObjectAdapter() {
    return null;
  }

} //SPARQLASAdapterFactory
