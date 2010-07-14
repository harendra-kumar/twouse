/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractSparqlasInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		while (!interpretationStack.empty()) {
			org.eclipse.emf.ecore.EObject next = interpretationStack.pop();
			result = interprete(next, context);
			if (!continueInterpretation(result)) {
				break;
			}
		}
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof west.twouse.language.sparqlas.StrictSubClassOf) {
			result = interprete_west_twouse_language_sparqlas_StrictSubClassOf((west.twouse.language.sparqlas.StrictSubClassOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DirectSubClassOf) {
			result = interprete_west_twouse_language_sparqlas_DirectSubClassOf((west.twouse.language.sparqlas.DirectSubClassOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DirectClassAssertion) {
			result = interprete_west_twouse_language_sparqlas_DirectClassAssertion((west.twouse.language.sparqlas.DirectClassAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.TemplateBinding) {
			result = interprete_west_twouse_language_sparqlas_TemplateBinding((west.twouse.language.sparqlas.TemplateBinding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.TemplateParameterSubstitution) {
			result = interprete_west_twouse_language_sparqlas_TemplateParameterSubstitution((west.twouse.language.sparqlas.TemplateParameterSubstitution) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.TemplateableElement) {
			result = interprete_west_twouse_language_sparqlas_TemplateableElement((west.twouse.language.sparqlas.TemplateableElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.TemplateSignature) {
			result = interprete_west_twouse_language_sparqlas_TemplateSignature((west.twouse.language.sparqlas.TemplateSignature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectMaxCardinality) {
			result = interprete_west_twouse_language_sparqlas_ObjectMaxCardinality((west.twouse.language.sparqlas.ObjectMaxCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectMinCardinality) {
			result = interprete_west_twouse_language_sparqlas_ObjectMinCardinality((west.twouse.language.sparqlas.ObjectMinCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectHasValue) {
			result = interprete_west_twouse_language_sparqlas_ObjectHasValue((west.twouse.language.sparqlas.ObjectHasValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectSomeValuesFrom) {
			result = interprete_west_twouse_language_sparqlas_ObjectSomeValuesFrom((west.twouse.language.sparqlas.ObjectSomeValuesFrom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectAllValuesFrom) {
			result = interprete_west_twouse_language_sparqlas_ObjectAllValuesFrom((west.twouse.language.sparqlas.ObjectAllValuesFrom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectIntersectionOf) {
			result = interprete_west_twouse_language_sparqlas_ObjectIntersectionOf((west.twouse.language.sparqlas.ObjectIntersectionOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectOneOf) {
			result = interprete_west_twouse_language_sparqlas_ObjectOneOf((west.twouse.language.sparqlas.ObjectOneOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectComplementOf) {
			result = interprete_west_twouse_language_sparqlas_ObjectComplementOf((west.twouse.language.sparqlas.ObjectComplementOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectUnionOf) {
			result = interprete_west_twouse_language_sparqlas_ObjectUnionOf((west.twouse.language.sparqlas.ObjectUnionOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ClassExpression) {
			result = interprete_west_twouse_language_sparqlas_ClassExpression((west.twouse.language.sparqlas.ClassExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ParameterableElement) {
			result = interprete_west_twouse_language_sparqlas_ParameterableElement((west.twouse.language.sparqlas.ParameterableElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.TemplateParameter) {
			result = interprete_west_twouse_language_sparqlas_TemplateParameter((west.twouse.language.sparqlas.TemplateParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.IndividualDeclaration) {
			result = interprete_west_twouse_language_sparqlas_IndividualDeclaration((west.twouse.language.sparqlas.IndividualDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DatatypePropertyDeclaration) {
			result = interprete_west_twouse_language_sparqlas_DatatypePropertyDeclaration((west.twouse.language.sparqlas.DatatypePropertyDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectPropertyDeclaration) {
			result = interprete_west_twouse_language_sparqlas_ObjectPropertyDeclaration((west.twouse.language.sparqlas.ObjectPropertyDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ClassDeclaration) {
			result = interprete_west_twouse_language_sparqlas_ClassDeclaration((west.twouse.language.sparqlas.ClassDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Declaration) {
			result = interprete_west_twouse_language_sparqlas_Declaration((west.twouse.language.sparqlas.Declaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.HasKey) {
			result = interprete_west_twouse_language_sparqlas_HasKey((west.twouse.language.sparqlas.HasKey) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataPropertyExpression) {
			result = interprete_west_twouse_language_sparqlas_DataPropertyExpression((west.twouse.language.sparqlas.DataPropertyExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.FunctionalDataProperty) {
			result = interprete_west_twouse_language_sparqlas_FunctionalDataProperty((west.twouse.language.sparqlas.FunctionalDataProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataPropertyRange) {
			result = interprete_west_twouse_language_sparqlas_DataPropertyRange((west.twouse.language.sparqlas.DataPropertyRange) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataPropertyDomain) {
			result = interprete_west_twouse_language_sparqlas_DataPropertyDomain((west.twouse.language.sparqlas.DataPropertyDomain) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DisjointDataProperties) {
			result = interprete_west_twouse_language_sparqlas_DisjointDataProperties((west.twouse.language.sparqlas.DisjointDataProperties) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.EquivalentDataProperties) {
			result = interprete_west_twouse_language_sparqlas_EquivalentDataProperties((west.twouse.language.sparqlas.EquivalentDataProperties) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.SubDataPropertyOf) {
			result = interprete_west_twouse_language_sparqlas_SubDataPropertyOf((west.twouse.language.sparqlas.SubDataPropertyOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataPropertyAtom) {
			result = interprete_west_twouse_language_sparqlas_DataPropertyAtom((west.twouse.language.sparqlas.DataPropertyAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.InverseObjectProperty) {
			result = interprete_west_twouse_language_sparqlas_InverseObjectProperty((west.twouse.language.sparqlas.InverseObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectPropertyExpression) {
			result = interprete_west_twouse_language_sparqlas_ObjectPropertyExpression((west.twouse.language.sparqlas.ObjectPropertyExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.TransitiveObjectProperty) {
			result = interprete_west_twouse_language_sparqlas_TransitiveObjectProperty((west.twouse.language.sparqlas.TransitiveObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.AsymmetricObjectProperty) {
			result = interprete_west_twouse_language_sparqlas_AsymmetricObjectProperty((west.twouse.language.sparqlas.AsymmetricObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.SymmetricObjectProperty) {
			result = interprete_west_twouse_language_sparqlas_SymmetricObjectProperty((west.twouse.language.sparqlas.SymmetricObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.IrreflexiveObjectProperty) {
			result = interprete_west_twouse_language_sparqlas_IrreflexiveObjectProperty((west.twouse.language.sparqlas.IrreflexiveObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ReflexiveObjectProperty) {
			result = interprete_west_twouse_language_sparqlas_ReflexiveObjectProperty((west.twouse.language.sparqlas.ReflexiveObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.InverseFunctionalObjectProperty) {
			result = interprete_west_twouse_language_sparqlas_InverseFunctionalObjectProperty((west.twouse.language.sparqlas.InverseFunctionalObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.FunctionalObjectProperty) {
			result = interprete_west_twouse_language_sparqlas_FunctionalObjectProperty((west.twouse.language.sparqlas.FunctionalObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.InverseObjectPropertyAtom) {
			result = interprete_west_twouse_language_sparqlas_InverseObjectPropertyAtom((west.twouse.language.sparqlas.InverseObjectPropertyAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectPropertyRange) {
			result = interprete_west_twouse_language_sparqlas_ObjectPropertyRange((west.twouse.language.sparqlas.ObjectPropertyRange) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectPropertyDomain) {
			result = interprete_west_twouse_language_sparqlas_ObjectPropertyDomain((west.twouse.language.sparqlas.ObjectPropertyDomain) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DisjointObjectProperties) {
			result = interprete_west_twouse_language_sparqlas_DisjointObjectProperties((west.twouse.language.sparqlas.DisjointObjectProperties) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.EquivalentObjectProperties) {
			result = interprete_west_twouse_language_sparqlas_EquivalentObjectProperties((west.twouse.language.sparqlas.EquivalentObjectProperties) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectPropertyChain) {
			result = interprete_west_twouse_language_sparqlas_ObjectPropertyChain((west.twouse.language.sparqlas.ObjectPropertyChain) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.SubObjectPropertyOf) {
			result = interprete_west_twouse_language_sparqlas_SubObjectPropertyOf((west.twouse.language.sparqlas.SubObjectPropertyOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectPropertyAtom) {
			result = interprete_west_twouse_language_sparqlas_ObjectPropertyAtom((west.twouse.language.sparqlas.ObjectPropertyAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.FacetRestriction) {
			result = interprete_west_twouse_language_sparqlas_FacetRestriction((west.twouse.language.sparqlas.FacetRestriction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DatatypeRestriction) {
			result = interprete_west_twouse_language_sparqlas_DatatypeRestriction((west.twouse.language.sparqlas.DatatypeRestriction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataIntersectionOf) {
			result = interprete_west_twouse_language_sparqlas_DataIntersectionOf((west.twouse.language.sparqlas.DataIntersectionOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataOneOf) {
			result = interprete_west_twouse_language_sparqlas_DataOneOf((west.twouse.language.sparqlas.DataOneOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataComplementOf) {
			result = interprete_west_twouse_language_sparqlas_DataComplementOf((west.twouse.language.sparqlas.DataComplementOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataUnionOf) {
			result = interprete_west_twouse_language_sparqlas_DataUnionOf((west.twouse.language.sparqlas.DataUnionOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataRange) {
			result = interprete_west_twouse_language_sparqlas_DataRange((west.twouse.language.sparqlas.DataRange) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataExactCardinality) {
			result = interprete_west_twouse_language_sparqlas_DataExactCardinality((west.twouse.language.sparqlas.DataExactCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataMaxCardinality) {
			result = interprete_west_twouse_language_sparqlas_DataMaxCardinality((west.twouse.language.sparqlas.DataMaxCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataMinCardinality) {
			result = interprete_west_twouse_language_sparqlas_DataMinCardinality((west.twouse.language.sparqlas.DataMinCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataHasValue) {
			result = interprete_west_twouse_language_sparqlas_DataHasValue((west.twouse.language.sparqlas.DataHasValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataSomeValuesFrom) {
			result = interprete_west_twouse_language_sparqlas_DataSomeValuesFrom((west.twouse.language.sparqlas.DataSomeValuesFrom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataAllValuesFrom) {
			result = interprete_west_twouse_language_sparqlas_DataAllValuesFrom((west.twouse.language.sparqlas.DataAllValuesFrom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectExactCardinality) {
			result = interprete_west_twouse_language_sparqlas_ObjectExactCardinality((west.twouse.language.sparqlas.ObjectExactCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DisjointUnion) {
			result = interprete_west_twouse_language_sparqlas_DisjointUnion((west.twouse.language.sparqlas.DisjointUnion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DisjointClasses) {
			result = interprete_west_twouse_language_sparqlas_DisjointClasses((west.twouse.language.sparqlas.DisjointClasses) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.EquivalentClasses) {
			result = interprete_west_twouse_language_sparqlas_EquivalentClasses((west.twouse.language.sparqlas.EquivalentClasses) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.SubClassOf) {
			result = interprete_west_twouse_language_sparqlas_SubClassOf((west.twouse.language.sparqlas.SubClassOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ClassAtom) {
			result = interprete_west_twouse_language_sparqlas_ClassAtom((west.twouse.language.sparqlas.ClassAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DifferentIndividuals) {
			result = interprete_west_twouse_language_sparqlas_DifferentIndividuals((west.twouse.language.sparqlas.DifferentIndividuals) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.SameIndividual) {
			result = interprete_west_twouse_language_sparqlas_SameIndividual((west.twouse.language.sparqlas.SameIndividual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.NegativeDataPropertyAssertion) {
			result = interprete_west_twouse_language_sparqlas_NegativeDataPropertyAssertion((west.twouse.language.sparqlas.NegativeDataPropertyAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.NegativeObjectPropertyAssertion) {
			result = interprete_west_twouse_language_sparqlas_NegativeObjectPropertyAssertion((west.twouse.language.sparqlas.NegativeObjectPropertyAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataPropertyAssertion) {
			result = interprete_west_twouse_language_sparqlas_DataPropertyAssertion((west.twouse.language.sparqlas.DataPropertyAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectPropertyAssertion) {
			result = interprete_west_twouse_language_sparqlas_ObjectPropertyAssertion((west.twouse.language.sparqlas.ObjectPropertyAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ClassAssertion) {
			result = interprete_west_twouse_language_sparqlas_ClassAssertion((west.twouse.language.sparqlas.ClassAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Assertion) {
			result = interprete_west_twouse_language_sparqlas_Assertion((west.twouse.language.sparqlas.Assertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Atom) {
			result = interprete_west_twouse_language_sparqlas_Atom((west.twouse.language.sparqlas.Atom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Expression) {
			result = interprete_west_twouse_language_sparqlas_Expression((west.twouse.language.sparqlas.Expression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Literal) {
			result = interprete_west_twouse_language_sparqlas_Literal((west.twouse.language.sparqlas.Literal) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.LiteralVariable) {
			result = interprete_west_twouse_language_sparqlas_LiteralVariable((west.twouse.language.sparqlas.LiteralVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.AbstractLiteral) {
			result = interprete_west_twouse_language_sparqlas_AbstractLiteral((west.twouse.language.sparqlas.AbstractLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.AnonymousIndividual) {
			result = interprete_west_twouse_language_sparqlas_AnonymousIndividual((west.twouse.language.sparqlas.AnonymousIndividual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.NamedIndividual) {
			result = interprete_west_twouse_language_sparqlas_NamedIndividual((west.twouse.language.sparqlas.NamedIndividual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Individual) {
			result = interprete_west_twouse_language_sparqlas_Individual((west.twouse.language.sparqlas.Individual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataProperty) {
			result = interprete_west_twouse_language_sparqlas_DataProperty((west.twouse.language.sparqlas.DataProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectProperty) {
			result = interprete_west_twouse_language_sparqlas_ObjectProperty((west.twouse.language.sparqlas.ObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Datatype) {
			result = interprete_west_twouse_language_sparqlas_Datatype((west.twouse.language.sparqlas.Datatype) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Class) {
			result = interprete_west_twouse_language_sparqlas_Class((west.twouse.language.sparqlas.Class) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Constant) {
			result = interprete_west_twouse_language_sparqlas_Constant((west.twouse.language.sparqlas.Constant) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.IndividualVariable) {
			result = interprete_west_twouse_language_sparqlas_IndividualVariable((west.twouse.language.sparqlas.IndividualVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DataPropertyVariable) {
			result = interprete_west_twouse_language_sparqlas_DataPropertyVariable((west.twouse.language.sparqlas.DataPropertyVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ObjectPropertyVariable) {
			result = interprete_west_twouse_language_sparqlas_ObjectPropertyVariable((west.twouse.language.sparqlas.ObjectPropertyVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ClassVariable) {
			result = interprete_west_twouse_language_sparqlas_ClassVariable((west.twouse.language.sparqlas.ClassVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Variable) {
			result = interprete_west_twouse_language_sparqlas_Variable((west.twouse.language.sparqlas.Variable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Term) {
			result = interprete_west_twouse_language_sparqlas_Term((west.twouse.language.sparqlas.Term) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.AbbreviatedIRI) {
			result = interprete_west_twouse_language_sparqlas_AbbreviatedIRI((west.twouse.language.sparqlas.AbbreviatedIRI) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.FullIRI) {
			result = interprete_west_twouse_language_sparqlas_FullIRI((west.twouse.language.sparqlas.FullIRI) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.IRI) {
			result = interprete_west_twouse_language_sparqlas_IRI((west.twouse.language.sparqlas.IRI) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.DescribeQuery) {
			result = interprete_west_twouse_language_sparqlas_DescribeQuery((west.twouse.language.sparqlas.DescribeQuery) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.AskQuery) {
			result = interprete_west_twouse_language_sparqlas_AskQuery((west.twouse.language.sparqlas.AskQuery) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.ConstructQuery) {
			result = interprete_west_twouse_language_sparqlas_ConstructQuery((west.twouse.language.sparqlas.ConstructQuery) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.SelectQuery) {
			result = interprete_west_twouse_language_sparqlas_SelectQuery((west.twouse.language.sparqlas.SelectQuery) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Query) {
			result = interprete_west_twouse_language_sparqlas_Query((west.twouse.language.sparqlas.Query) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.PrefixDefinition) {
			result = interprete_west_twouse_language_sparqlas_PrefixDefinition((west.twouse.language.sparqlas.PrefixDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.Import) {
			result = interprete_west_twouse_language_sparqlas_Import((west.twouse.language.sparqlas.Import) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.sparqlas.OntologyDocument) {
			result = interprete_west_twouse_language_sparqlas_OntologyDocument((west.twouse.language.sparqlas.OntologyDocument) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_OntologyDocument(west.twouse.language.sparqlas.OntologyDocument object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Import(west.twouse.language.sparqlas.Import object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_PrefixDefinition(west.twouse.language.sparqlas.PrefixDefinition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Query(west.twouse.language.sparqlas.Query object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_SelectQuery(west.twouse.language.sparqlas.SelectQuery object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ConstructQuery(west.twouse.language.sparqlas.ConstructQuery object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_AskQuery(west.twouse.language.sparqlas.AskQuery object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DescribeQuery(west.twouse.language.sparqlas.DescribeQuery object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_IRI(west.twouse.language.sparqlas.IRI object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_FullIRI(west.twouse.language.sparqlas.FullIRI object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_AbbreviatedIRI(west.twouse.language.sparqlas.AbbreviatedIRI object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Term(west.twouse.language.sparqlas.Term object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Variable(west.twouse.language.sparqlas.Variable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ClassVariable(west.twouse.language.sparqlas.ClassVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectPropertyVariable(west.twouse.language.sparqlas.ObjectPropertyVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataPropertyVariable(west.twouse.language.sparqlas.DataPropertyVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_IndividualVariable(west.twouse.language.sparqlas.IndividualVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Constant(west.twouse.language.sparqlas.Constant object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Class(west.twouse.language.sparqlas.Class object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Datatype(west.twouse.language.sparqlas.Datatype object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectProperty(west.twouse.language.sparqlas.ObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataProperty(west.twouse.language.sparqlas.DataProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Individual(west.twouse.language.sparqlas.Individual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_NamedIndividual(west.twouse.language.sparqlas.NamedIndividual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_AnonymousIndividual(west.twouse.language.sparqlas.AnonymousIndividual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_AbstractLiteral(west.twouse.language.sparqlas.AbstractLiteral object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_LiteralVariable(west.twouse.language.sparqlas.LiteralVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Literal(west.twouse.language.sparqlas.Literal object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Expression(west.twouse.language.sparqlas.Expression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Atom(west.twouse.language.sparqlas.Atom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Assertion(west.twouse.language.sparqlas.Assertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ClassAssertion(west.twouse.language.sparqlas.ClassAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectPropertyAssertion(west.twouse.language.sparqlas.ObjectPropertyAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataPropertyAssertion(west.twouse.language.sparqlas.DataPropertyAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_NegativeObjectPropertyAssertion(west.twouse.language.sparqlas.NegativeObjectPropertyAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_NegativeDataPropertyAssertion(west.twouse.language.sparqlas.NegativeDataPropertyAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_SameIndividual(west.twouse.language.sparqlas.SameIndividual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DifferentIndividuals(west.twouse.language.sparqlas.DifferentIndividuals object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ClassAtom(west.twouse.language.sparqlas.ClassAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_SubClassOf(west.twouse.language.sparqlas.SubClassOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_EquivalentClasses(west.twouse.language.sparqlas.EquivalentClasses object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DisjointClasses(west.twouse.language.sparqlas.DisjointClasses object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DisjointUnion(west.twouse.language.sparqlas.DisjointUnion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ClassExpression(west.twouse.language.sparqlas.ClassExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectUnionOf(west.twouse.language.sparqlas.ObjectUnionOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectComplementOf(west.twouse.language.sparqlas.ObjectComplementOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectOneOf(west.twouse.language.sparqlas.ObjectOneOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectIntersectionOf(west.twouse.language.sparqlas.ObjectIntersectionOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectAllValuesFrom(west.twouse.language.sparqlas.ObjectAllValuesFrom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectSomeValuesFrom(west.twouse.language.sparqlas.ObjectSomeValuesFrom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectHasValue(west.twouse.language.sparqlas.ObjectHasValue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectMinCardinality(west.twouse.language.sparqlas.ObjectMinCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectMaxCardinality(west.twouse.language.sparqlas.ObjectMaxCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectExactCardinality(west.twouse.language.sparqlas.ObjectExactCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataAllValuesFrom(west.twouse.language.sparqlas.DataAllValuesFrom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataSomeValuesFrom(west.twouse.language.sparqlas.DataSomeValuesFrom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataHasValue(west.twouse.language.sparqlas.DataHasValue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataMinCardinality(west.twouse.language.sparqlas.DataMinCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataMaxCardinality(west.twouse.language.sparqlas.DataMaxCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataExactCardinality(west.twouse.language.sparqlas.DataExactCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataRange(west.twouse.language.sparqlas.DataRange object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataUnionOf(west.twouse.language.sparqlas.DataUnionOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataComplementOf(west.twouse.language.sparqlas.DataComplementOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataOneOf(west.twouse.language.sparqlas.DataOneOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataIntersectionOf(west.twouse.language.sparqlas.DataIntersectionOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DatatypeRestriction(west.twouse.language.sparqlas.DatatypeRestriction object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_FacetRestriction(west.twouse.language.sparqlas.FacetRestriction object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectPropertyAtom(west.twouse.language.sparqlas.ObjectPropertyAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_SubObjectPropertyOf(west.twouse.language.sparqlas.SubObjectPropertyOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectPropertyChain(west.twouse.language.sparqlas.ObjectPropertyChain object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_EquivalentObjectProperties(west.twouse.language.sparqlas.EquivalentObjectProperties object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DisjointObjectProperties(west.twouse.language.sparqlas.DisjointObjectProperties object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectPropertyDomain(west.twouse.language.sparqlas.ObjectPropertyDomain object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectPropertyRange(west.twouse.language.sparqlas.ObjectPropertyRange object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_InverseObjectPropertyAtom(west.twouse.language.sparqlas.InverseObjectPropertyAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_FunctionalObjectProperty(west.twouse.language.sparqlas.FunctionalObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_InverseFunctionalObjectProperty(west.twouse.language.sparqlas.InverseFunctionalObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ReflexiveObjectProperty(west.twouse.language.sparqlas.ReflexiveObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_IrreflexiveObjectProperty(west.twouse.language.sparqlas.IrreflexiveObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_SymmetricObjectProperty(west.twouse.language.sparqlas.SymmetricObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_AsymmetricObjectProperty(west.twouse.language.sparqlas.AsymmetricObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_TransitiveObjectProperty(west.twouse.language.sparqlas.TransitiveObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectPropertyExpression(west.twouse.language.sparqlas.ObjectPropertyExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_InverseObjectProperty(west.twouse.language.sparqlas.InverseObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataPropertyAtom(west.twouse.language.sparqlas.DataPropertyAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_SubDataPropertyOf(west.twouse.language.sparqlas.SubDataPropertyOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_EquivalentDataProperties(west.twouse.language.sparqlas.EquivalentDataProperties object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DisjointDataProperties(west.twouse.language.sparqlas.DisjointDataProperties object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataPropertyDomain(west.twouse.language.sparqlas.DataPropertyDomain object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataPropertyRange(west.twouse.language.sparqlas.DataPropertyRange object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_FunctionalDataProperty(west.twouse.language.sparqlas.FunctionalDataProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DataPropertyExpression(west.twouse.language.sparqlas.DataPropertyExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_HasKey(west.twouse.language.sparqlas.HasKey object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_Declaration(west.twouse.language.sparqlas.Declaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ClassDeclaration(west.twouse.language.sparqlas.ClassDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ObjectPropertyDeclaration(west.twouse.language.sparqlas.ObjectPropertyDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DatatypePropertyDeclaration(west.twouse.language.sparqlas.DatatypePropertyDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_IndividualDeclaration(west.twouse.language.sparqlas.IndividualDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_TemplateParameter(west.twouse.language.sparqlas.TemplateParameter object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_ParameterableElement(west.twouse.language.sparqlas.ParameterableElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_TemplateSignature(west.twouse.language.sparqlas.TemplateSignature object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_TemplateableElement(west.twouse.language.sparqlas.TemplateableElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_TemplateParameterSubstitution(west.twouse.language.sparqlas.TemplateParameterSubstitution object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_TemplateBinding(west.twouse.language.sparqlas.TemplateBinding object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DirectClassAssertion(west.twouse.language.sparqlas.DirectClassAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_DirectSubClassOf(west.twouse.language.sparqlas.DirectSubClassOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_sparqlas_StrictSubClassOf(west.twouse.language.sparqlas.StrictSubClassOf object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
