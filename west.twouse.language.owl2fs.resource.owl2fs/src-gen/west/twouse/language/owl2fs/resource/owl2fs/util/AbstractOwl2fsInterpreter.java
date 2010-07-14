/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.util;

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
public class AbstractOwl2fsInterpreter<ResultType, ContextType> {
	
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
		if (object instanceof west.twouse.language.owl2fs.TemplateBinding) {
			result = interprete_west_twouse_language_owl2fs_TemplateBinding((west.twouse.language.owl2fs.TemplateBinding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.TemplateParameterSubstitution) {
			result = interprete_west_twouse_language_owl2fs_TemplateParameterSubstitution((west.twouse.language.owl2fs.TemplateParameterSubstitution) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ClassifierTemplateParameter) {
			result = interprete_west_twouse_language_owl2fs_ClassifierTemplateParameter((west.twouse.language.owl2fs.ClassifierTemplateParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Package) {
			result = interprete_west_twouse_language_owl2fs_Package((west.twouse.language.owl2fs.Package) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.TemplateableElement) {
			result = interprete_west_twouse_language_owl2fs_TemplateableElement((west.twouse.language.owl2fs.TemplateableElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.TemplateSignature) {
			result = interprete_west_twouse_language_owl2fs_TemplateSignature((west.twouse.language.owl2fs.TemplateSignature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ParameterableElement) {
			result = interprete_west_twouse_language_owl2fs_ParameterableElement((west.twouse.language.owl2fs.ParameterableElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.TemplateParameter) {
			result = interprete_west_twouse_language_owl2fs_TemplateParameter((west.twouse.language.owl2fs.TemplateParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Expression) {
			result = interprete_west_twouse_language_owl2fs_Expression((west.twouse.language.owl2fs.Expression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.MainClasses) {
			result = interprete_west_twouse_language_owl2fs_MainClasses((west.twouse.language.owl2fs.MainClasses) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.EdgeAssertion) {
			result = interprete_west_twouse_language_owl2fs_EdgeAssertion((west.twouse.language.owl2fs.EdgeAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DGEdges) {
			result = interprete_west_twouse_language_owl2fs_DGEdges((west.twouse.language.owl2fs.DGEdges) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.NodeAssertion) {
			result = interprete_west_twouse_language_owl2fs_NodeAssertion((west.twouse.language.owl2fs.NodeAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DGNodes) {
			result = interprete_west_twouse_language_owl2fs_DGNodes((west.twouse.language.owl2fs.DGNodes) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DGAxiom) {
			result = interprete_west_twouse_language_owl2fs_DGAxiom((west.twouse.language.owl2fs.DGAxiom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DGAtom) {
			result = interprete_west_twouse_language_owl2fs_DGAtom((west.twouse.language.owl2fs.DGAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DGRule) {
			result = interprete_west_twouse_language_owl2fs_DGRule((west.twouse.language.owl2fs.DGRule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Variable) {
			result = interprete_west_twouse_language_owl2fs_Variable((west.twouse.language.owl2fs.Variable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DArg) {
			result = interprete_west_twouse_language_owl2fs_DArg((west.twouse.language.owl2fs.DArg) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.IArg) {
			result = interprete_west_twouse_language_owl2fs_IArg((west.twouse.language.owl2fs.IArg) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DifferentIndividualsAtom) {
			result = interprete_west_twouse_language_owl2fs_DifferentIndividualsAtom((west.twouse.language.owl2fs.DifferentIndividualsAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.SameIndividualAtom) {
			result = interprete_west_twouse_language_owl2fs_SameIndividualAtom((west.twouse.language.owl2fs.SameIndividualAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.BuiltInAtom) {
			result = interprete_west_twouse_language_owl2fs_BuiltInAtom((west.twouse.language.owl2fs.BuiltInAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataPropetyAtom) {
			result = interprete_west_twouse_language_owl2fs_DataPropetyAtom((west.twouse.language.owl2fs.DataPropetyAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectPropertyAtom) {
			result = interprete_west_twouse_language_owl2fs_ObjectPropertyAtom((west.twouse.language.owl2fs.ObjectPropertyAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataRangeAtom) {
			result = interprete_west_twouse_language_owl2fs_DataRangeAtom((west.twouse.language.owl2fs.DataRangeAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ClassAtom) {
			result = interprete_west_twouse_language_owl2fs_ClassAtom((west.twouse.language.owl2fs.ClassAtom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Atom) {
			result = interprete_west_twouse_language_owl2fs_Atom((west.twouse.language.owl2fs.Atom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DLSafeRule) {
			result = interprete_west_twouse_language_owl2fs_DLSafeRule((west.twouse.language.owl2fs.DLSafeRule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Rule) {
			result = interprete_west_twouse_language_owl2fs_Rule((west.twouse.language.owl2fs.Rule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.NegativeDataPropertyAssertion) {
			result = interprete_west_twouse_language_owl2fs_NegativeDataPropertyAssertion((west.twouse.language.owl2fs.NegativeDataPropertyAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataPropertyAssertion) {
			result = interprete_west_twouse_language_owl2fs_DataPropertyAssertion((west.twouse.language.owl2fs.DataPropertyAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.NegativeObjectPropertyAssertion) {
			result = interprete_west_twouse_language_owl2fs_NegativeObjectPropertyAssertion((west.twouse.language.owl2fs.NegativeObjectPropertyAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectPropertyAssertion) {
			result = interprete_west_twouse_language_owl2fs_ObjectPropertyAssertion((west.twouse.language.owl2fs.ObjectPropertyAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ClassAssertion) {
			result = interprete_west_twouse_language_owl2fs_ClassAssertion((west.twouse.language.owl2fs.ClassAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DifferentIndividuals) {
			result = interprete_west_twouse_language_owl2fs_DifferentIndividuals((west.twouse.language.owl2fs.DifferentIndividuals) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.SameIndividual) {
			result = interprete_west_twouse_language_owl2fs_SameIndividual((west.twouse.language.owl2fs.SameIndividual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Assertion) {
			result = interprete_west_twouse_language_owl2fs_Assertion((west.twouse.language.owl2fs.Assertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.HasKey) {
			result = interprete_west_twouse_language_owl2fs_HasKey((west.twouse.language.owl2fs.HasKey) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DatatypeDefinition) {
			result = interprete_west_twouse_language_owl2fs_DatatypeDefinition((west.twouse.language.owl2fs.DatatypeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.FunctionalDataProperty) {
			result = interprete_west_twouse_language_owl2fs_FunctionalDataProperty((west.twouse.language.owl2fs.FunctionalDataProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataPropertyRange) {
			result = interprete_west_twouse_language_owl2fs_DataPropertyRange((west.twouse.language.owl2fs.DataPropertyRange) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataPropertyDomain) {
			result = interprete_west_twouse_language_owl2fs_DataPropertyDomain((west.twouse.language.owl2fs.DataPropertyDomain) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DisjointDataProperties) {
			result = interprete_west_twouse_language_owl2fs_DisjointDataProperties((west.twouse.language.owl2fs.DisjointDataProperties) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.EquivalentDataProperties) {
			result = interprete_west_twouse_language_owl2fs_EquivalentDataProperties((west.twouse.language.owl2fs.EquivalentDataProperties) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.SubDataPropertyOf) {
			result = interprete_west_twouse_language_owl2fs_SubDataPropertyOf((west.twouse.language.owl2fs.SubDataPropertyOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataPropertyAxiom) {
			result = interprete_west_twouse_language_owl2fs_DataPropertyAxiom((west.twouse.language.owl2fs.DataPropertyAxiom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.TransitiveObjectProperty) {
			result = interprete_west_twouse_language_owl2fs_TransitiveObjectProperty((west.twouse.language.owl2fs.TransitiveObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AsymmetricObjectProperty) {
			result = interprete_west_twouse_language_owl2fs_AsymmetricObjectProperty((west.twouse.language.owl2fs.AsymmetricObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.SymmetricObjectProperty) {
			result = interprete_west_twouse_language_owl2fs_SymmetricObjectProperty((west.twouse.language.owl2fs.SymmetricObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.IrreflexiveObjectProperty) {
			result = interprete_west_twouse_language_owl2fs_IrreflexiveObjectProperty((west.twouse.language.owl2fs.IrreflexiveObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ReflexiveObjectProperty) {
			result = interprete_west_twouse_language_owl2fs_ReflexiveObjectProperty((west.twouse.language.owl2fs.ReflexiveObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.InverseFunctionalObjectProperty) {
			result = interprete_west_twouse_language_owl2fs_InverseFunctionalObjectProperty((west.twouse.language.owl2fs.InverseFunctionalObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.FunctionalObjectProperty) {
			result = interprete_west_twouse_language_owl2fs_FunctionalObjectProperty((west.twouse.language.owl2fs.FunctionalObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.InverseObjectProperties) {
			result = interprete_west_twouse_language_owl2fs_InverseObjectProperties((west.twouse.language.owl2fs.InverseObjectProperties) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectPropertyRange) {
			result = interprete_west_twouse_language_owl2fs_ObjectPropertyRange((west.twouse.language.owl2fs.ObjectPropertyRange) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectPropertyDomain) {
			result = interprete_west_twouse_language_owl2fs_ObjectPropertyDomain((west.twouse.language.owl2fs.ObjectPropertyDomain) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DisjointObjectProperties) {
			result = interprete_west_twouse_language_owl2fs_DisjointObjectProperties((west.twouse.language.owl2fs.DisjointObjectProperties) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.EquivalentObjectProperties) {
			result = interprete_west_twouse_language_owl2fs_EquivalentObjectProperties((west.twouse.language.owl2fs.EquivalentObjectProperties) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectPropertyChain) {
			result = interprete_west_twouse_language_owl2fs_ObjectPropertyChain((west.twouse.language.owl2fs.ObjectPropertyChain) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.SubObjectPropertyExpression) {
			result = interprete_west_twouse_language_owl2fs_SubObjectPropertyExpression((west.twouse.language.owl2fs.SubObjectPropertyExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.SubObjectPropertyOf) {
			result = interprete_west_twouse_language_owl2fs_SubObjectPropertyOf((west.twouse.language.owl2fs.SubObjectPropertyOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectPropertyAxiom) {
			result = interprete_west_twouse_language_owl2fs_ObjectPropertyAxiom((west.twouse.language.owl2fs.ObjectPropertyAxiom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DisjointUnion) {
			result = interprete_west_twouse_language_owl2fs_DisjointUnion((west.twouse.language.owl2fs.DisjointUnion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DisjointClasses) {
			result = interprete_west_twouse_language_owl2fs_DisjointClasses((west.twouse.language.owl2fs.DisjointClasses) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.EquivalentClasses) {
			result = interprete_west_twouse_language_owl2fs_EquivalentClasses((west.twouse.language.owl2fs.EquivalentClasses) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.SubClassOf) {
			result = interprete_west_twouse_language_owl2fs_SubClassOf((west.twouse.language.owl2fs.SubClassOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ClassAxiom) {
			result = interprete_west_twouse_language_owl2fs_ClassAxiom((west.twouse.language.owl2fs.ClassAxiom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataExactCardinality) {
			result = interprete_west_twouse_language_owl2fs_DataExactCardinality((west.twouse.language.owl2fs.DataExactCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataMaxCardinality) {
			result = interprete_west_twouse_language_owl2fs_DataMaxCardinality((west.twouse.language.owl2fs.DataMaxCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataMinCardinality) {
			result = interprete_west_twouse_language_owl2fs_DataMinCardinality((west.twouse.language.owl2fs.DataMinCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataHasValue) {
			result = interprete_west_twouse_language_owl2fs_DataHasValue((west.twouse.language.owl2fs.DataHasValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataAllValuesFrom) {
			result = interprete_west_twouse_language_owl2fs_DataAllValuesFrom((west.twouse.language.owl2fs.DataAllValuesFrom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataSomeValuesFrom) {
			result = interprete_west_twouse_language_owl2fs_DataSomeValuesFrom((west.twouse.language.owl2fs.DataSomeValuesFrom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectExactCardinality) {
			result = interprete_west_twouse_language_owl2fs_ObjectExactCardinality((west.twouse.language.owl2fs.ObjectExactCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectMaxCardinality) {
			result = interprete_west_twouse_language_owl2fs_ObjectMaxCardinality((west.twouse.language.owl2fs.ObjectMaxCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectMinCardinality) {
			result = interprete_west_twouse_language_owl2fs_ObjectMinCardinality((west.twouse.language.owl2fs.ObjectMinCardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectHasValue) {
			result = interprete_west_twouse_language_owl2fs_ObjectHasValue((west.twouse.language.owl2fs.ObjectHasValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectHasSelf) {
			result = interprete_west_twouse_language_owl2fs_ObjectHasSelf((west.twouse.language.owl2fs.ObjectHasSelf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectAllValuesFrom) {
			result = interprete_west_twouse_language_owl2fs_ObjectAllValuesFrom((west.twouse.language.owl2fs.ObjectAllValuesFrom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectSomeValuesFrom) {
			result = interprete_west_twouse_language_owl2fs_ObjectSomeValuesFrom((west.twouse.language.owl2fs.ObjectSomeValuesFrom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectOneOf) {
			result = interprete_west_twouse_language_owl2fs_ObjectOneOf((west.twouse.language.owl2fs.ObjectOneOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectComplementOf) {
			result = interprete_west_twouse_language_owl2fs_ObjectComplementOf((west.twouse.language.owl2fs.ObjectComplementOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectUnionOf) {
			result = interprete_west_twouse_language_owl2fs_ObjectUnionOf((west.twouse.language.owl2fs.ObjectUnionOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectIntersectionOf) {
			result = interprete_west_twouse_language_owl2fs_ObjectIntersectionOf((west.twouse.language.owl2fs.ObjectIntersectionOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ClassExpression) {
			result = interprete_west_twouse_language_owl2fs_ClassExpression((west.twouse.language.owl2fs.ClassExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.FacetConstraintPair) {
			result = interprete_west_twouse_language_owl2fs_FacetConstraintPair((west.twouse.language.owl2fs.FacetConstraintPair) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DatatypeRestriction) {
			result = interprete_west_twouse_language_owl2fs_DatatypeRestriction((west.twouse.language.owl2fs.DatatypeRestriction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataOneOf) {
			result = interprete_west_twouse_language_owl2fs_DataOneOf((west.twouse.language.owl2fs.DataOneOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataComplementOf) {
			result = interprete_west_twouse_language_owl2fs_DataComplementOf((west.twouse.language.owl2fs.DataComplementOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataUnionOf) {
			result = interprete_west_twouse_language_owl2fs_DataUnionOf((west.twouse.language.owl2fs.DataUnionOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataIntersectionOf) {
			result = interprete_west_twouse_language_owl2fs_DataIntersectionOf((west.twouse.language.owl2fs.DataIntersectionOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataRange) {
			result = interprete_west_twouse_language_owl2fs_DataRange((west.twouse.language.owl2fs.DataRange) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataPropertyExpression) {
			result = interprete_west_twouse_language_owl2fs_DataPropertyExpression((west.twouse.language.owl2fs.DataPropertyExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.InverseObjectProperty) {
			result = interprete_west_twouse_language_owl2fs_InverseObjectProperty((west.twouse.language.owl2fs.InverseObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectPropertyExpression) {
			result = interprete_west_twouse_language_owl2fs_ObjectPropertyExpression((west.twouse.language.owl2fs.ObjectPropertyExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Literal) {
			result = interprete_west_twouse_language_owl2fs_Literal((west.twouse.language.owl2fs.Literal) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AnonymousIndividual) {
			result = interprete_west_twouse_language_owl2fs_AnonymousIndividual((west.twouse.language.owl2fs.AnonymousIndividual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.NamedIndividual) {
			result = interprete_west_twouse_language_owl2fs_NamedIndividual((west.twouse.language.owl2fs.NamedIndividual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Individual) {
			result = interprete_west_twouse_language_owl2fs_Individual((west.twouse.language.owl2fs.Individual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectProperty) {
			result = interprete_west_twouse_language_owl2fs_ObjectProperty((west.twouse.language.owl2fs.ObjectProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Datatype) {
			result = interprete_west_twouse_language_owl2fs_Datatype((west.twouse.language.owl2fs.Datatype) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataProperty) {
			result = interprete_west_twouse_language_owl2fs_DataProperty((west.twouse.language.owl2fs.DataProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Class) {
			result = interprete_west_twouse_language_owl2fs_Class((west.twouse.language.owl2fs.Class) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AnnotationProperty) {
			result = interprete_west_twouse_language_owl2fs_AnnotationProperty((west.twouse.language.owl2fs.AnnotationProperty) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AnnotationPropertyRange) {
			result = interprete_west_twouse_language_owl2fs_AnnotationPropertyRange((west.twouse.language.owl2fs.AnnotationPropertyRange) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AnnotationPropertyDomain) {
			result = interprete_west_twouse_language_owl2fs_AnnotationPropertyDomain((west.twouse.language.owl2fs.AnnotationPropertyDomain) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.SubAnnotationPropertyOf) {
			result = interprete_west_twouse_language_owl2fs_SubAnnotationPropertyOf((west.twouse.language.owl2fs.SubAnnotationPropertyOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AnnotationAssertion) {
			result = interprete_west_twouse_language_owl2fs_AnnotationAssertion((west.twouse.language.owl2fs.AnnotationAssertion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AnnotationAxiom) {
			result = interprete_west_twouse_language_owl2fs_AnnotationAxiom((west.twouse.language.owl2fs.AnnotationAxiom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Annotation) {
			result = interprete_west_twouse_language_owl2fs_Annotation((west.twouse.language.owl2fs.Annotation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AnnotationValue) {
			result = interprete_west_twouse_language_owl2fs_AnnotationValue((west.twouse.language.owl2fs.AnnotationValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AnnotationSubject) {
			result = interprete_west_twouse_language_owl2fs_AnnotationSubject((west.twouse.language.owl2fs.AnnotationSubject) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Entity) {
			result = interprete_west_twouse_language_owl2fs_Entity((west.twouse.language.owl2fs.Entity) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.NamedIndividualDeclaration) {
			result = interprete_west_twouse_language_owl2fs_NamedIndividualDeclaration((west.twouse.language.owl2fs.NamedIndividualDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AnnotationPropertyDeclaration) {
			result = interprete_west_twouse_language_owl2fs_AnnotationPropertyDeclaration((west.twouse.language.owl2fs.AnnotationPropertyDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DataPropertyDeclaration) {
			result = interprete_west_twouse_language_owl2fs_DataPropertyDeclaration((west.twouse.language.owl2fs.DataPropertyDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ObjectPropertyDeclaration) {
			result = interprete_west_twouse_language_owl2fs_ObjectPropertyDeclaration((west.twouse.language.owl2fs.ObjectPropertyDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.DatatypeDeclaration) {
			result = interprete_west_twouse_language_owl2fs_DatatypeDeclaration((west.twouse.language.owl2fs.DatatypeDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.ClassDeclaration) {
			result = interprete_west_twouse_language_owl2fs_ClassDeclaration((west.twouse.language.owl2fs.ClassDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Declaration) {
			result = interprete_west_twouse_language_owl2fs_Declaration((west.twouse.language.owl2fs.Declaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Comment) {
			result = interprete_west_twouse_language_owl2fs_Comment((west.twouse.language.owl2fs.Comment) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Axiom) {
			result = interprete_west_twouse_language_owl2fs_Axiom((west.twouse.language.owl2fs.Axiom) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.Ontology) {
			result = interprete_west_twouse_language_owl2fs_Ontology((west.twouse.language.owl2fs.Ontology) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.PrefixDefinition) {
			result = interprete_west_twouse_language_owl2fs_PrefixDefinition((west.twouse.language.owl2fs.PrefixDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.OntologyDocument) {
			result = interprete_west_twouse_language_owl2fs_OntologyDocument((west.twouse.language.owl2fs.OntologyDocument) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.AbbreviatedIRI) {
			result = interprete_west_twouse_language_owl2fs_AbbreviatedIRI((west.twouse.language.owl2fs.AbbreviatedIRI) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.FullIRI) {
			result = interprete_west_twouse_language_owl2fs_FullIRI((west.twouse.language.owl2fs.FullIRI) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.owl2fs.IRI) {
			result = interprete_west_twouse_language_owl2fs_IRI((west.twouse.language.owl2fs.IRI) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_IRI(west.twouse.language.owl2fs.IRI object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_FullIRI(west.twouse.language.owl2fs.FullIRI object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AbbreviatedIRI(west.twouse.language.owl2fs.AbbreviatedIRI object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_OntologyDocument(west.twouse.language.owl2fs.OntologyDocument object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_PrefixDefinition(west.twouse.language.owl2fs.PrefixDefinition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Ontology(west.twouse.language.owl2fs.Ontology object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Axiom(west.twouse.language.owl2fs.Axiom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Comment(west.twouse.language.owl2fs.Comment object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Declaration(west.twouse.language.owl2fs.Declaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ClassDeclaration(west.twouse.language.owl2fs.ClassDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DatatypeDeclaration(west.twouse.language.owl2fs.DatatypeDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectPropertyDeclaration(west.twouse.language.owl2fs.ObjectPropertyDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataPropertyDeclaration(west.twouse.language.owl2fs.DataPropertyDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AnnotationPropertyDeclaration(west.twouse.language.owl2fs.AnnotationPropertyDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_NamedIndividualDeclaration(west.twouse.language.owl2fs.NamedIndividualDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Entity(west.twouse.language.owl2fs.Entity object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AnnotationSubject(west.twouse.language.owl2fs.AnnotationSubject object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AnnotationValue(west.twouse.language.owl2fs.AnnotationValue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Annotation(west.twouse.language.owl2fs.Annotation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AnnotationAxiom(west.twouse.language.owl2fs.AnnotationAxiom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AnnotationAssertion(west.twouse.language.owl2fs.AnnotationAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_SubAnnotationPropertyOf(west.twouse.language.owl2fs.SubAnnotationPropertyOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AnnotationPropertyDomain(west.twouse.language.owl2fs.AnnotationPropertyDomain object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AnnotationPropertyRange(west.twouse.language.owl2fs.AnnotationPropertyRange object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AnnotationProperty(west.twouse.language.owl2fs.AnnotationProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Class(west.twouse.language.owl2fs.Class object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataProperty(west.twouse.language.owl2fs.DataProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Datatype(west.twouse.language.owl2fs.Datatype object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectProperty(west.twouse.language.owl2fs.ObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Individual(west.twouse.language.owl2fs.Individual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_NamedIndividual(west.twouse.language.owl2fs.NamedIndividual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AnonymousIndividual(west.twouse.language.owl2fs.AnonymousIndividual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Literal(west.twouse.language.owl2fs.Literal object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectPropertyExpression(west.twouse.language.owl2fs.ObjectPropertyExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_InverseObjectProperty(west.twouse.language.owl2fs.InverseObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataPropertyExpression(west.twouse.language.owl2fs.DataPropertyExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataRange(west.twouse.language.owl2fs.DataRange object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataIntersectionOf(west.twouse.language.owl2fs.DataIntersectionOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataUnionOf(west.twouse.language.owl2fs.DataUnionOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataComplementOf(west.twouse.language.owl2fs.DataComplementOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataOneOf(west.twouse.language.owl2fs.DataOneOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DatatypeRestriction(west.twouse.language.owl2fs.DatatypeRestriction object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_FacetConstraintPair(west.twouse.language.owl2fs.FacetConstraintPair object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ClassExpression(west.twouse.language.owl2fs.ClassExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectIntersectionOf(west.twouse.language.owl2fs.ObjectIntersectionOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectUnionOf(west.twouse.language.owl2fs.ObjectUnionOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectComplementOf(west.twouse.language.owl2fs.ObjectComplementOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectOneOf(west.twouse.language.owl2fs.ObjectOneOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectSomeValuesFrom(west.twouse.language.owl2fs.ObjectSomeValuesFrom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectAllValuesFrom(west.twouse.language.owl2fs.ObjectAllValuesFrom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectHasSelf(west.twouse.language.owl2fs.ObjectHasSelf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectHasValue(west.twouse.language.owl2fs.ObjectHasValue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectMinCardinality(west.twouse.language.owl2fs.ObjectMinCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectMaxCardinality(west.twouse.language.owl2fs.ObjectMaxCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectExactCardinality(west.twouse.language.owl2fs.ObjectExactCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataSomeValuesFrom(west.twouse.language.owl2fs.DataSomeValuesFrom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataAllValuesFrom(west.twouse.language.owl2fs.DataAllValuesFrom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataHasValue(west.twouse.language.owl2fs.DataHasValue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataMinCardinality(west.twouse.language.owl2fs.DataMinCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataMaxCardinality(west.twouse.language.owl2fs.DataMaxCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataExactCardinality(west.twouse.language.owl2fs.DataExactCardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ClassAxiom(west.twouse.language.owl2fs.ClassAxiom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_SubClassOf(west.twouse.language.owl2fs.SubClassOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_EquivalentClasses(west.twouse.language.owl2fs.EquivalentClasses object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DisjointClasses(west.twouse.language.owl2fs.DisjointClasses object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DisjointUnion(west.twouse.language.owl2fs.DisjointUnion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectPropertyAxiom(west.twouse.language.owl2fs.ObjectPropertyAxiom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_SubObjectPropertyOf(west.twouse.language.owl2fs.SubObjectPropertyOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_SubObjectPropertyExpression(west.twouse.language.owl2fs.SubObjectPropertyExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectPropertyChain(west.twouse.language.owl2fs.ObjectPropertyChain object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_EquivalentObjectProperties(west.twouse.language.owl2fs.EquivalentObjectProperties object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DisjointObjectProperties(west.twouse.language.owl2fs.DisjointObjectProperties object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectPropertyDomain(west.twouse.language.owl2fs.ObjectPropertyDomain object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectPropertyRange(west.twouse.language.owl2fs.ObjectPropertyRange object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_InverseObjectProperties(west.twouse.language.owl2fs.InverseObjectProperties object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_FunctionalObjectProperty(west.twouse.language.owl2fs.FunctionalObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_InverseFunctionalObjectProperty(west.twouse.language.owl2fs.InverseFunctionalObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ReflexiveObjectProperty(west.twouse.language.owl2fs.ReflexiveObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_IrreflexiveObjectProperty(west.twouse.language.owl2fs.IrreflexiveObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_SymmetricObjectProperty(west.twouse.language.owl2fs.SymmetricObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_AsymmetricObjectProperty(west.twouse.language.owl2fs.AsymmetricObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_TransitiveObjectProperty(west.twouse.language.owl2fs.TransitiveObjectProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataPropertyAxiom(west.twouse.language.owl2fs.DataPropertyAxiom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_SubDataPropertyOf(west.twouse.language.owl2fs.SubDataPropertyOf object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_EquivalentDataProperties(west.twouse.language.owl2fs.EquivalentDataProperties object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DisjointDataProperties(west.twouse.language.owl2fs.DisjointDataProperties object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataPropertyDomain(west.twouse.language.owl2fs.DataPropertyDomain object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataPropertyRange(west.twouse.language.owl2fs.DataPropertyRange object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_FunctionalDataProperty(west.twouse.language.owl2fs.FunctionalDataProperty object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DatatypeDefinition(west.twouse.language.owl2fs.DatatypeDefinition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_HasKey(west.twouse.language.owl2fs.HasKey object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Assertion(west.twouse.language.owl2fs.Assertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_SameIndividual(west.twouse.language.owl2fs.SameIndividual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DifferentIndividuals(west.twouse.language.owl2fs.DifferentIndividuals object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ClassAssertion(west.twouse.language.owl2fs.ClassAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectPropertyAssertion(west.twouse.language.owl2fs.ObjectPropertyAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_NegativeObjectPropertyAssertion(west.twouse.language.owl2fs.NegativeObjectPropertyAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataPropertyAssertion(west.twouse.language.owl2fs.DataPropertyAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_NegativeDataPropertyAssertion(west.twouse.language.owl2fs.NegativeDataPropertyAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Rule(west.twouse.language.owl2fs.Rule object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DLSafeRule(west.twouse.language.owl2fs.DLSafeRule object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Atom(west.twouse.language.owl2fs.Atom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ClassAtom(west.twouse.language.owl2fs.ClassAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataRangeAtom(west.twouse.language.owl2fs.DataRangeAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ObjectPropertyAtom(west.twouse.language.owl2fs.ObjectPropertyAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DataPropetyAtom(west.twouse.language.owl2fs.DataPropetyAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_BuiltInAtom(west.twouse.language.owl2fs.BuiltInAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_SameIndividualAtom(west.twouse.language.owl2fs.SameIndividualAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DifferentIndividualsAtom(west.twouse.language.owl2fs.DifferentIndividualsAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_IArg(west.twouse.language.owl2fs.IArg object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DArg(west.twouse.language.owl2fs.DArg object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Variable(west.twouse.language.owl2fs.Variable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DGRule(west.twouse.language.owl2fs.DGRule object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DGAtom(west.twouse.language.owl2fs.DGAtom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DGAxiom(west.twouse.language.owl2fs.DGAxiom object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DGNodes(west.twouse.language.owl2fs.DGNodes object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_NodeAssertion(west.twouse.language.owl2fs.NodeAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_DGEdges(west.twouse.language.owl2fs.DGEdges object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_EdgeAssertion(west.twouse.language.owl2fs.EdgeAssertion object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_MainClasses(west.twouse.language.owl2fs.MainClasses object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Expression(west.twouse.language.owl2fs.Expression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_TemplateParameter(west.twouse.language.owl2fs.TemplateParameter object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ParameterableElement(west.twouse.language.owl2fs.ParameterableElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_TemplateSignature(west.twouse.language.owl2fs.TemplateSignature object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_TemplateableElement(west.twouse.language.owl2fs.TemplateableElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_Package(west.twouse.language.owl2fs.Package object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_ClassifierTemplateParameter(west.twouse.language.owl2fs.ClassifierTemplateParameter object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_TemplateParameterSubstitution(west.twouse.language.owl2fs.TemplateParameterSubstitution object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_owl2fs_TemplateBinding(west.twouse.language.owl2fs.TemplateBinding object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
