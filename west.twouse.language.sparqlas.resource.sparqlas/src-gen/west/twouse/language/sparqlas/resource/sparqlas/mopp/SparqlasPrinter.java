/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasPrinter implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextPrinter {
	
	protected west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolverFactory tokenResolverFactory = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/**
	 * Holds the resource that is associated with this printer. may be null if the
	 * printer is used stand alone.
	 */
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource resource;
	private java.util.Map<?, ?> options;
	
	public SparqlasPrinter(java.io.OutputStream outputStream, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected static int matchCount(java.util.Map<java.lang.String, java.lang.Integer> featureCounter, java.util.Collection<java.lang.String> needed){
		int pos = 0;
		int neg = 0;
		
		for(java.lang.String featureName:featureCounter.keySet()){
			if(needed.contains(featureName)){
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, java.lang.String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof west.twouse.language.sparqlas.FullIRI) {
			print_west_twouse_language_sparqlas_FullIRI((west.twouse.language.sparqlas.FullIRI) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.AbbreviatedIRI) {
			print_west_twouse_language_sparqlas_AbbreviatedIRI((west.twouse.language.sparqlas.AbbreviatedIRI) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.OntologyDocument) {
			print_west_twouse_language_sparqlas_OntologyDocument((west.twouse.language.sparqlas.OntologyDocument) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.Import) {
			print_west_twouse_language_sparqlas_Import((west.twouse.language.sparqlas.Import) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.PrefixDefinition) {
			print_west_twouse_language_sparqlas_PrefixDefinition((west.twouse.language.sparqlas.PrefixDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SelectQuery) {
			print_west_twouse_language_sparqlas_SelectQuery((west.twouse.language.sparqlas.SelectQuery) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ConstructQuery) {
			print_west_twouse_language_sparqlas_ConstructQuery((west.twouse.language.sparqlas.ConstructQuery) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.AskQuery) {
			print_west_twouse_language_sparqlas_AskQuery((west.twouse.language.sparqlas.AskQuery) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DescribeQuery) {
			print_west_twouse_language_sparqlas_DescribeQuery((west.twouse.language.sparqlas.DescribeQuery) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.LiteralVariable) {
			print_west_twouse_language_sparqlas_LiteralVariable((west.twouse.language.sparqlas.LiteralVariable) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ClassVariable) {
			print_west_twouse_language_sparqlas_ClassVariable((west.twouse.language.sparqlas.ClassVariable) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyVariable) {
			print_west_twouse_language_sparqlas_ObjectPropertyVariable((west.twouse.language.sparqlas.ObjectPropertyVariable) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataPropertyVariable) {
			print_west_twouse_language_sparqlas_DataPropertyVariable((west.twouse.language.sparqlas.DataPropertyVariable) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.IndividualVariable) {
			print_west_twouse_language_sparqlas_IndividualVariable((west.twouse.language.sparqlas.IndividualVariable) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.Class) {
			print_west_twouse_language_sparqlas_Class((west.twouse.language.sparqlas.Class) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.Datatype) {
			print_west_twouse_language_sparqlas_Datatype((west.twouse.language.sparqlas.Datatype) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectProperty) {
			print_west_twouse_language_sparqlas_ObjectProperty((west.twouse.language.sparqlas.ObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataProperty) {
			print_west_twouse_language_sparqlas_DataProperty((west.twouse.language.sparqlas.DataProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.NamedIndividual) {
			print_west_twouse_language_sparqlas_NamedIndividual((west.twouse.language.sparqlas.NamedIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.AnonymousIndividual) {
			print_west_twouse_language_sparqlas_AnonymousIndividual((west.twouse.language.sparqlas.AnonymousIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.Literal) {
			print_west_twouse_language_sparqlas_Literal((west.twouse.language.sparqlas.Literal) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ClassAssertion) {
			print_west_twouse_language_sparqlas_ClassAssertion((west.twouse.language.sparqlas.ClassAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyAssertion) {
			print_west_twouse_language_sparqlas_ObjectPropertyAssertion((west.twouse.language.sparqlas.ObjectPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataPropertyAssertion) {
			print_west_twouse_language_sparqlas_DataPropertyAssertion((west.twouse.language.sparqlas.DataPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.NegativeObjectPropertyAssertion) {
			print_west_twouse_language_sparqlas_NegativeObjectPropertyAssertion((west.twouse.language.sparqlas.NegativeObjectPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.NegativeDataPropertyAssertion) {
			print_west_twouse_language_sparqlas_NegativeDataPropertyAssertion((west.twouse.language.sparqlas.NegativeDataPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SameIndividual) {
			print_west_twouse_language_sparqlas_SameIndividual((west.twouse.language.sparqlas.SameIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DifferentIndividuals) {
			print_west_twouse_language_sparqlas_DifferentIndividuals((west.twouse.language.sparqlas.DifferentIndividuals) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SubClassOf) {
			print_west_twouse_language_sparqlas_SubClassOf((west.twouse.language.sparqlas.SubClassOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.EquivalentClasses) {
			print_west_twouse_language_sparqlas_EquivalentClasses((west.twouse.language.sparqlas.EquivalentClasses) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DisjointClasses) {
			print_west_twouse_language_sparqlas_DisjointClasses((west.twouse.language.sparqlas.DisjointClasses) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DisjointUnion) {
			print_west_twouse_language_sparqlas_DisjointUnion((west.twouse.language.sparqlas.DisjointUnion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectUnionOf) {
			print_west_twouse_language_sparqlas_ObjectUnionOf((west.twouse.language.sparqlas.ObjectUnionOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectComplementOf) {
			print_west_twouse_language_sparqlas_ObjectComplementOf((west.twouse.language.sparqlas.ObjectComplementOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectOneOf) {
			print_west_twouse_language_sparqlas_ObjectOneOf((west.twouse.language.sparqlas.ObjectOneOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectIntersectionOf) {
			print_west_twouse_language_sparqlas_ObjectIntersectionOf((west.twouse.language.sparqlas.ObjectIntersectionOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectAllValuesFrom) {
			print_west_twouse_language_sparqlas_ObjectAllValuesFrom((west.twouse.language.sparqlas.ObjectAllValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectSomeValuesFrom) {
			print_west_twouse_language_sparqlas_ObjectSomeValuesFrom((west.twouse.language.sparqlas.ObjectSomeValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectHasValue) {
			print_west_twouse_language_sparqlas_ObjectHasValue((west.twouse.language.sparqlas.ObjectHasValue) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectMinCardinality) {
			print_west_twouse_language_sparqlas_ObjectMinCardinality((west.twouse.language.sparqlas.ObjectMinCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectMaxCardinality) {
			print_west_twouse_language_sparqlas_ObjectMaxCardinality((west.twouse.language.sparqlas.ObjectMaxCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectExactCardinality) {
			print_west_twouse_language_sparqlas_ObjectExactCardinality((west.twouse.language.sparqlas.ObjectExactCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataAllValuesFrom) {
			print_west_twouse_language_sparqlas_DataAllValuesFrom((west.twouse.language.sparqlas.DataAllValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataSomeValuesFrom) {
			print_west_twouse_language_sparqlas_DataSomeValuesFrom((west.twouse.language.sparqlas.DataSomeValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataHasValue) {
			print_west_twouse_language_sparqlas_DataHasValue((west.twouse.language.sparqlas.DataHasValue) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataMinCardinality) {
			print_west_twouse_language_sparqlas_DataMinCardinality((west.twouse.language.sparqlas.DataMinCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataMaxCardinality) {
			print_west_twouse_language_sparqlas_DataMaxCardinality((west.twouse.language.sparqlas.DataMaxCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataExactCardinality) {
			print_west_twouse_language_sparqlas_DataExactCardinality((west.twouse.language.sparqlas.DataExactCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataUnionOf) {
			print_west_twouse_language_sparqlas_DataUnionOf((west.twouse.language.sparqlas.DataUnionOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataComplementOf) {
			print_west_twouse_language_sparqlas_DataComplementOf((west.twouse.language.sparqlas.DataComplementOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataOneOf) {
			print_west_twouse_language_sparqlas_DataOneOf((west.twouse.language.sparqlas.DataOneOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataIntersectionOf) {
			print_west_twouse_language_sparqlas_DataIntersectionOf((west.twouse.language.sparqlas.DataIntersectionOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DatatypeRestriction) {
			print_west_twouse_language_sparqlas_DatatypeRestriction((west.twouse.language.sparqlas.DatatypeRestriction) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.FacetRestriction) {
			print_west_twouse_language_sparqlas_FacetRestriction((west.twouse.language.sparqlas.FacetRestriction) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SubObjectPropertyOf) {
			print_west_twouse_language_sparqlas_SubObjectPropertyOf((west.twouse.language.sparqlas.SubObjectPropertyOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.EquivalentObjectProperties) {
			print_west_twouse_language_sparqlas_EquivalentObjectProperties((west.twouse.language.sparqlas.EquivalentObjectProperties) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DisjointObjectProperties) {
			print_west_twouse_language_sparqlas_DisjointObjectProperties((west.twouse.language.sparqlas.DisjointObjectProperties) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyDomain) {
			print_west_twouse_language_sparqlas_ObjectPropertyDomain((west.twouse.language.sparqlas.ObjectPropertyDomain) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyRange) {
			print_west_twouse_language_sparqlas_ObjectPropertyRange((west.twouse.language.sparqlas.ObjectPropertyRange) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.InverseObjectPropertyAtom) {
			print_west_twouse_language_sparqlas_InverseObjectPropertyAtom((west.twouse.language.sparqlas.InverseObjectPropertyAtom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.FunctionalObjectProperty) {
			print_west_twouse_language_sparqlas_FunctionalObjectProperty((west.twouse.language.sparqlas.FunctionalObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.InverseFunctionalObjectProperty) {
			print_west_twouse_language_sparqlas_InverseFunctionalObjectProperty((west.twouse.language.sparqlas.InverseFunctionalObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ReflexiveObjectProperty) {
			print_west_twouse_language_sparqlas_ReflexiveObjectProperty((west.twouse.language.sparqlas.ReflexiveObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.IrreflexiveObjectProperty) {
			print_west_twouse_language_sparqlas_IrreflexiveObjectProperty((west.twouse.language.sparqlas.IrreflexiveObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SymmetricObjectProperty) {
			print_west_twouse_language_sparqlas_SymmetricObjectProperty((west.twouse.language.sparqlas.SymmetricObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.AsymmetricObjectProperty) {
			print_west_twouse_language_sparqlas_AsymmetricObjectProperty((west.twouse.language.sparqlas.AsymmetricObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.TransitiveObjectProperty) {
			print_west_twouse_language_sparqlas_TransitiveObjectProperty((west.twouse.language.sparqlas.TransitiveObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SubDataPropertyOf) {
			print_west_twouse_language_sparqlas_SubDataPropertyOf((west.twouse.language.sparqlas.SubDataPropertyOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.EquivalentDataProperties) {
			print_west_twouse_language_sparqlas_EquivalentDataProperties((west.twouse.language.sparqlas.EquivalentDataProperties) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DisjointDataProperties) {
			print_west_twouse_language_sparqlas_DisjointDataProperties((west.twouse.language.sparqlas.DisjointDataProperties) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataPropertyDomain) {
			print_west_twouse_language_sparqlas_DataPropertyDomain((west.twouse.language.sparqlas.DataPropertyDomain) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataPropertyRange) {
			print_west_twouse_language_sparqlas_DataPropertyRange((west.twouse.language.sparqlas.DataPropertyRange) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.FunctionalDataProperty) {
			print_west_twouse_language_sparqlas_FunctionalDataProperty((west.twouse.language.sparqlas.FunctionalDataProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.InverseObjectProperty) {
			print_west_twouse_language_sparqlas_InverseObjectProperty((west.twouse.language.sparqlas.InverseObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyChain) {
			print_west_twouse_language_sparqlas_ObjectPropertyChain((west.twouse.language.sparqlas.ObjectPropertyChain) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.HasKey) {
			print_west_twouse_language_sparqlas_HasKey((west.twouse.language.sparqlas.HasKey) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ClassDeclaration) {
			print_west_twouse_language_sparqlas_ClassDeclaration((west.twouse.language.sparqlas.ClassDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyDeclaration) {
			print_west_twouse_language_sparqlas_ObjectPropertyDeclaration((west.twouse.language.sparqlas.ObjectPropertyDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DatatypePropertyDeclaration) {
			print_west_twouse_language_sparqlas_DatatypePropertyDeclaration((west.twouse.language.sparqlas.DatatypePropertyDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.IndividualDeclaration) {
			print_west_twouse_language_sparqlas_IndividualDeclaration((west.twouse.language.sparqlas.IndividualDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.TemplateSignature) {
			print_west_twouse_language_sparqlas_TemplateSignature((west.twouse.language.sparqlas.TemplateSignature) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.TemplateParameter) {
			print_west_twouse_language_sparqlas_TemplateParameter((west.twouse.language.sparqlas.TemplateParameter) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.TemplateBinding) {
			print_west_twouse_language_sparqlas_TemplateBinding((west.twouse.language.sparqlas.TemplateBinding) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.TemplateParameterSubstitution) {
			print_west_twouse_language_sparqlas_TemplateParameterSubstitution((west.twouse.language.sparqlas.TemplateParameterSubstitution) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DirectClassAssertion) {
			print_west_twouse_language_sparqlas_DirectClassAssertion((west.twouse.language.sparqlas.DirectClassAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DirectSubClassOf) {
			print_west_twouse_language_sparqlas_DirectSubClassOf((west.twouse.language.sparqlas.DirectSubClassOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.StrictSubClassOf) {
			print_west_twouse_language_sparqlas_StrictSubClassOf((west.twouse.language.sparqlas.StrictSubClassOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.Variable) {
			print_west_twouse_language_sparqlas_Variable((west.twouse.language.sparqlas.Variable) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasReferenceResolverSwitch getReferenceResolverSwitch() {
		return (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasReferenceResolverSwitch) new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final java.lang.String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasProblem(errorMessage, west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_west_twouse_language_sparqlas_FullIRI(west.twouse.language.sparqlas.FullIRI element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FULL_IRI__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FULL_IRI__ID));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("FULLIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FULL_IRI__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_AbbreviatedIRI(west.twouse.language.sparqlas.AbbreviatedIRI element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ABBREVIATED_IRI__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ABBREVIATED_IRI__ID));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("ABBRIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ABBREVIATED_IRI__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_OntologyDocument(west.twouse.language.sparqlas.OntologyDocument element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI));
		printCountingMap.put("queryIRI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ONTOLOGY_DOCUMENT__IMPORT));
		printCountingMap.put("import", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION));
		printCountingMap.put("prefixDefinition", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY));
		printCountingMap.put("query", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_west_twouse_language_sparqlas_OntologyDocument_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_west_twouse_language_sparqlas_OntologyDocument_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_west_twouse_language_sparqlas_OntologyDocument_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("query");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("query", count - 1);
		}
	}
	public void print_west_twouse_language_sparqlas_OntologyDocument_0(west.twouse.language.sparqlas.OntologyDocument element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("IRI");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("queryIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ONTOLOGY_DOCUMENT__QUERY_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("queryIRI", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	public void print_west_twouse_language_sparqlas_OntologyDocument_1(west.twouse.language.sparqlas.OntologyDocument element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("import");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ONTOLOGY_DOCUMENT__IMPORT));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("import", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	public void print_west_twouse_language_sparqlas_OntologyDocument_2(west.twouse.language.sparqlas.OntologyDocument element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("prefixDefinition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("prefixDefinition", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_sparqlas_Import(west.twouse.language.sparqlas.Import element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.IMPORT__IMPORT_IRI));
		printCountingMap.put("importIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Import");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("importIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.IMPORT__IMPORT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("importIRI", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_PrefixDefinition(west.twouse.language.sparqlas.PrefixDefinition element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.PREFIX_DEFINITION__PREF));
		printCountingMap.put("pref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.PREFIX_DEFINITION__NAMESPACE));
		printCountingMap.put("namespace", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Namespace");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("pref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.PREFIX_DEFINITION__PREF));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("ABBRIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.PREFIX_DEFINITION__PREF), element));
				out.print(" ");
			}
			printCountingMap.put("pref", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("namespace");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.PREFIX_DEFINITION__NAMESPACE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("namespace", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_SelectQuery(west.twouse.language.sparqlas.SelectQuery element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SELECT_QUERY__OWNED_TEMPLATE_SIGNATURE));
		printCountingMap.put("ownedTemplateSignature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SELECT_QUERY__TEMPLATE_BINDING));
		printCountingMap.put("templateBinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SELECT_QUERY__ATOMS));
		printCountingMap.put("atoms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SELECT_QUERY__VARIABLES));
		printCountingMap.put("variables", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Select");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_west_twouse_language_sparqlas_SelectQuery_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("Where");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedTemplateSignature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SELECT_QUERY__OWNED_TEMPLATE_SIGNATURE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTemplateSignature", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("templateBinding");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SELECT_QUERY__TEMPLATE_BINDING));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("templateBinding", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("atoms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SELECT_QUERY__ATOMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("atoms", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_SelectQuery_0(west.twouse.language.sparqlas.SelectQuery element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"variables"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("*");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("variables");
			if (count > 0) {
				java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SELECT_QUERY__VARIABLES));
				int index  = list.size() - count;
				if (index < 0) {
					index = 0;
				}
				java.util.ListIterator<?> it  = list.listIterator(index);
				while (it.hasNext()) {
					java.lang.Object o = it.next();
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("variables", 0);
			}
		}
	}
	
	public void print_west_twouse_language_sparqlas_ConstructQuery(west.twouse.language.sparqlas.ConstructQuery element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE));
		printCountingMap.put("ownedTemplateSignature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING));
		printCountingMap.put("templateBinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CONSTRUCT_QUERY__CONSTRUCT_ATOMS));
		printCountingMap.put("constructAtoms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CONSTRUCT_QUERY__WHERE_ATOMS));
		printCountingMap.put("whereAtoms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Construct");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedTemplateSignature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTemplateSignature", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("templateBinding");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CONSTRUCT_QUERY__TEMPLATE_BINDING));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("templateBinding", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constructAtoms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CONSTRUCT_QUERY__CONSTRUCT_ATOMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constructAtoms", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("Where");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("whereAtoms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CONSTRUCT_QUERY__WHERE_ATOMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("whereAtoms", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_AskQuery(west.twouse.language.sparqlas.AskQuery element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ASK_QUERY__OWNED_TEMPLATE_SIGNATURE));
		printCountingMap.put("ownedTemplateSignature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ASK_QUERY__TEMPLATE_BINDING));
		printCountingMap.put("templateBinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ASK_QUERY__ATOMS));
		printCountingMap.put("atoms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Ask");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("Where");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedTemplateSignature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ASK_QUERY__OWNED_TEMPLATE_SIGNATURE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTemplateSignature", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("templateBinding");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ASK_QUERY__TEMPLATE_BINDING));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("templateBinding", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("atoms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ASK_QUERY__ATOMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("atoms", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_DescribeQuery(west.twouse.language.sparqlas.DescribeQuery element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE));
		printCountingMap.put("ownedTemplateSignature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING));
		printCountingMap.put("templateBinding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI));
		printCountingMap.put("describeIRI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DESCRIBE_QUERY__ATOMS));
		printCountingMap.put("atoms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("Describe");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DescribeQuery_0(element, localtab, out, printCountingMap);
	}
	public void print_west_twouse_language_sparqlas_DescribeQuery_0(west.twouse.language.sparqlas.DescribeQuery element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"describeIRI"		));
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_west_twouse_language_sparqlas_DescribeQuery_0_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("describeIRI");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DESCRIBE_QUERY__DESCRIBE_IRI));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("describeIRI", count - 1);
			}
		}
	}
	public void print_west_twouse_language_sparqlas_DescribeQuery_0_0(west.twouse.language.sparqlas.DescribeQuery element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("Where");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedTemplateSignature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedTemplateSignature", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("templateBinding");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DESCRIBE_QUERY__TEMPLATE_BINDING));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("templateBinding", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("atoms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DESCRIBE_QUERY__ATOMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("atoms", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_Variable(west.twouse.language.sparqlas.Variable element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.VARIABLE__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.VARIABLE__SYMBOL));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.VARIABLE__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_LiteralVariable(west.twouse.language.sparqlas.LiteralVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.LITERAL_VARIABLE__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.LITERAL_VARIABLE__SYMBOL));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.LITERAL_VARIABLE__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_ClassVariable(west.twouse.language.sparqlas.ClassVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_VARIABLE__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_VARIABLE__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_VARIABLE__SYMBOL));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_VARIABLE__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectPropertyVariable(west.twouse.language.sparqlas.ObjectPropertyVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_VARIABLE__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_VARIABLE__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_VARIABLE__SYMBOL));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_VARIABLE__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataPropertyVariable(west.twouse.language.sparqlas.DataPropertyVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_VARIABLE__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_VARIABLE__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_VARIABLE__SYMBOL));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_VARIABLE__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_IndividualVariable(west.twouse.language.sparqlas.IndividualVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INDIVIDUAL_VARIABLE__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INDIVIDUAL_VARIABLE__SYMBOL));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INDIVIDUAL_VARIABLE__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_Class(west.twouse.language.sparqlas.Class element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS__CONSTANT_IRI));
		printCountingMap.put("constantIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constantIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS__CONSTANT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constantIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_Datatype(west.twouse.language.sparqlas.Datatype element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATATYPE__CONSTANT_IRI));
		printCountingMap.put("constantIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constantIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATATYPE__CONSTANT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constantIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectProperty(west.twouse.language.sparqlas.ObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY__CONSTANT_IRI));
		printCountingMap.put("constantIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constantIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY__CONSTANT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constantIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataProperty(west.twouse.language.sparqlas.DataProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY__CONSTANT_IRI));
		printCountingMap.put("constantIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constantIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY__CONSTANT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constantIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_NamedIndividual(west.twouse.language.sparqlas.NamedIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI));
		printCountingMap.put("constantIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constantIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NAMED_INDIVIDUAL__CONSTANT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constantIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_AnonymousIndividual(west.twouse.language.sparqlas.AnonymousIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ANONYMOUS_INDIVIDUAL__NODE_ID));
		printCountingMap.put("nodeID", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("nodeID");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ANONYMOUS_INDIVIDUAL__NODE_ID));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("NODE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ANONYMOUS_INDIVIDUAL__NODE_ID), element));
				out.print(" ");
			}
			printCountingMap.put("nodeID", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_Literal(west.twouse.language.sparqlas.Literal element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.LITERAL__LEXICAL_FORM));
		printCountingMap.put("lexicalForm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.LITERAL__DATATYPE));
		printCountingMap.put("datatype", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("lexicalForm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.LITERAL__LEXICAL_FORM));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.LITERAL__LEXICAL_FORM), element));
				out.print(" ");
			}
			printCountingMap.put("lexicalForm", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("^^");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("datatype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.LITERAL__DATATYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("datatype", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_ClassAssertion(west.twouse.language.sparqlas.ClassAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_ASSERTION__INDIVIDUAL));
		printCountingMap.put("individual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_ASSERTION__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ClassAssertion_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_ASSERTION__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("individual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_ASSERTION__INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individual", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ClassAssertion_0(west.twouse.language.sparqlas.ClassAssertion element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Type");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ClassAssertion");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectPropertyAssertion(west.twouse.language.sparqlas.ObjectPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
		printCountingMap.put("targetIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectPropertyAssertion_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("targetIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetIndividual", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectPropertyAssertion_0(west.twouse.language.sparqlas.ObjectPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("PropertyValue");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectPropertyAssertion");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataPropertyAssertion(west.twouse.language.sparqlas.DataPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE));
		printCountingMap.put("targetValue", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataPropertyAssertion_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("targetValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetValue", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataPropertyAssertion_0(west.twouse.language.sparqlas.DataPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("PropertyValue");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataPropertyAssertion");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_NegativeObjectPropertyAssertion(west.twouse.language.sparqlas.NegativeObjectPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
		printCountingMap.put("targetIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_NegativeObjectPropertyAssertion_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("targetIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetIndividual", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_NegativeObjectPropertyAssertion_0(west.twouse.language.sparqlas.NegativeObjectPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("NegativePropertyValue");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("NegativeObjectPropertyAssertion");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_NegativeDataPropertyAssertion(west.twouse.language.sparqlas.NegativeDataPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE));
		printCountingMap.put("targetValue", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_NegativeDataPropertyAssertion_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("targetValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetValue", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_NegativeDataPropertyAssertion_0(west.twouse.language.sparqlas.NegativeDataPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("NegativePropertyValue");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("NegativeDataPropertyAssertion");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_SameIndividual(west.twouse.language.sparqlas.SameIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SAME_INDIVIDUAL__INDIVIDUALS));
		printCountingMap.put("individuals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_SameIndividual_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("individuals");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SAME_INDIVIDUAL__INDIVIDUALS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individuals", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("individuals");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SAME_INDIVIDUAL__INDIVIDUALS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individuals", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_SameIndividual_0(west.twouse.language.sparqlas.SameIndividual element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("SameAs");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("SameIndividual");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DifferentIndividuals(west.twouse.language.sparqlas.DifferentIndividuals element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIFFERENT_INDIVIDUALS__INDIVIDUALS));
		printCountingMap.put("individuals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DifferentIndividuals_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("individuals");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIFFERENT_INDIVIDUALS__INDIVIDUALS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individuals", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("individuals");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIFFERENT_INDIVIDUALS__INDIVIDUALS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individuals", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DifferentIndividuals_0(west.twouse.language.sparqlas.DifferentIndividuals element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("DifferentFrom");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DifferentIndividuals");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_SubClassOf(west.twouse.language.sparqlas.SubClassOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
		printCountingMap.put("subClassExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
		printCountingMap.put("superClassExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("SubClassOf");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subClassExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("superClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superClassExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_EquivalentClasses(west.twouse.language.sparqlas.EquivalentClasses element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS));
		printCountingMap.put("classExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_EquivalentClasses_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpressions", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpressions", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_EquivalentClasses_0(west.twouse.language.sparqlas.EquivalentClasses element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("EquivalentTo");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("EquivalentClasses");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DisjointClasses(west.twouse.language.sparqlas.DisjointClasses element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_CLASSES__CLASS_EXPRESSIONS));
		printCountingMap.put("classExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DisjointClasses_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_CLASSES__CLASS_EXPRESSIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpressions", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_CLASSES__CLASS_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpressions", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DisjointClasses_0(west.twouse.language.sparqlas.DisjointClasses element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("DisjointWith");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DisjointClasses");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DisjointUnion(west.twouse.language.sparqlas.DisjointUnion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_UNION__CLASS));
		printCountingMap.put("class", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE));
		printCountingMap.put("classVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS));
		printCountingMap.put("disjointClassExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("DisjointUnion");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DisjointUnion_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("disjointClassExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("disjointClassExpressions", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("disjointClassExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("disjointClassExpressions", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DisjointUnion_0(west.twouse.language.sparqlas.DisjointUnion element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"class"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"classVariable"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("classVariable");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_UNION__CLASS_VARIABLE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("classVariable", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("class");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_UNION__CLASS));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("class", count - 1);
			}
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectUnionOf(west.twouse.language.sparqlas.ObjectUnionOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_UNION_OF__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
		printCountingMap.put("classExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectUnionOf_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpressions", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpressions", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectUnionOf_0(west.twouse.language.sparqlas.ObjectUnionOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Or");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectUnionOf");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectComplementOf(west.twouse.language.sparqlas.ObjectComplementOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_COMPLEMENT_OF__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectComplementOf_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectComplementOf_0(west.twouse.language.sparqlas.ObjectComplementOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Not");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectComplementOf");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectOneOf(west.twouse.language.sparqlas.ObjectOneOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_ONE_OF__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_ONE_OF__INDIVIDUALS));
		printCountingMap.put("individuals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectOneOf_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("individuals");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_ONE_OF__INDIVIDUALS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individuals", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectOneOf_0(west.twouse.language.sparqlas.ObjectOneOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("One");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectOneOf");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectIntersectionOf(west.twouse.language.sparqlas.ObjectIntersectionOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_INTERSECTION_OF__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
		printCountingMap.put("classExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectIntersectionOf_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpressions", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpressions", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectIntersectionOf_0(west.twouse.language.sparqlas.ObjectIntersectionOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("And");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectIntersectionOf");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectAllValuesFrom(west.twouse.language.sparqlas.ObjectAllValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_ALL_VALUES_FROM__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectAllValuesFrom_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectAllValuesFrom_0(west.twouse.language.sparqlas.ObjectAllValuesFrom element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("All");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectAllValuesFrom");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectSomeValuesFrom(west.twouse.language.sparqlas.ObjectSomeValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_SOME_VALUES_FROM__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectSomeValuesFrom_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectSomeValuesFrom_0(west.twouse.language.sparqlas.ObjectSomeValuesFrom element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Some");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectSomeValuesFrom");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectHasValue(west.twouse.language.sparqlas.ObjectHasValue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_HAS_VALUE__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_HAS_VALUE__INDIVIDUAL));
		printCountingMap.put("individual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectHasValue_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("individual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_HAS_VALUE__INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individual", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectHasValue_0(west.twouse.language.sparqlas.ObjectHasValue element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Has");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectHasValue");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectMinCardinality(west.twouse.language.sparqlas.ObjectMinCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MIN_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MIN_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectMinCardinality_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MIN_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectMinCardinality_0(west.twouse.language.sparqlas.ObjectMinCardinality element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Min");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectMinCardinality");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectMaxCardinality(west.twouse.language.sparqlas.ObjectMaxCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MAX_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MAX_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectMaxCardinality_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MAX_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectMaxCardinality_0(west.twouse.language.sparqlas.ObjectMaxCardinality element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Max");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectMaxCardinality");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectExactCardinality(west.twouse.language.sparqlas.ObjectExactCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_EXACT_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectExactCardinality_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectExactCardinality_0(west.twouse.language.sparqlas.ObjectExactCardinality element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Exact");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectExactCardinality");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataAllValuesFrom(west.twouse.language.sparqlas.DataAllValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_ALL_VALUES_FROM__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_ALL_VALUES_FROM__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
		printCountingMap.put("dataPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataAllValuesFrom_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpressions", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_ALL_VALUES_FROM__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataAllValuesFrom_0(west.twouse.language.sparqlas.DataAllValuesFrom element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("All");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataAllValuesFrom");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataSomeValuesFrom(west.twouse.language.sparqlas.DataSomeValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_SOME_VALUES_FROM__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
		printCountingMap.put("dataPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataSomeValuesFrom_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpressions", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_SOME_VALUES_FROM__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataSomeValuesFrom_0(west.twouse.language.sparqlas.DataSomeValuesFrom element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Some");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataSomeValuesFrom");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataHasValue(west.twouse.language.sparqlas.DataHasValue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_HAS_VALUE__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_HAS_VALUE__LITERAL));
		printCountingMap.put("literal", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataHasValue_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("literal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_HAS_VALUE__LITERAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("literal", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataHasValue_0(west.twouse.language.sparqlas.DataHasValue element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Has");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataHasValue");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataMinCardinality(west.twouse.language.sparqlas.DataMinCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MIN_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MIN_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MIN_CARDINALITY__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataMinCardinality_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MIN_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MIN_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MIN_CARDINALITY__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataMinCardinality_0(west.twouse.language.sparqlas.DataMinCardinality element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Min");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataMinCardinality");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataMaxCardinality(west.twouse.language.sparqlas.DataMaxCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MAX_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MAX_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MAX_CARDINALITY__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataMaxCardinality_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MAX_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MAX_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_MAX_CARDINALITY__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataMaxCardinality_0(west.twouse.language.sparqlas.DataMaxCardinality element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Max");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataMaxCardinality");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataExactCardinality(west.twouse.language.sparqlas.DataExactCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_EXACT_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_EXACT_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_EXACT_CARDINALITY__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataExactCardinality_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_EXACT_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_EXACT_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_EXACT_CARDINALITY__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataExactCardinality_0(west.twouse.language.sparqlas.DataExactCardinality element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Exact");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataExactCardinality");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataUnionOf(west.twouse.language.sparqlas.DataUnionOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_UNION_OF__DATA_RANGES));
		printCountingMap.put("dataRanges", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataUnionOf_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataRanges");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_UNION_OF__DATA_RANGES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRanges", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataRanges");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_UNION_OF__DATA_RANGES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRanges", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataUnionOf_0(west.twouse.language.sparqlas.DataUnionOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Or");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataUnionOf");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataComplementOf(west.twouse.language.sparqlas.DataComplementOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_COMPLEMENT_OF__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataComplementOf_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_COMPLEMENT_OF__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataComplementOf_0(west.twouse.language.sparqlas.DataComplementOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Not");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataComplementOf");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataOneOf(west.twouse.language.sparqlas.DataOneOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_ONE_OF__LITERALS));
		printCountingMap.put("literals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataOneOf_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("literals");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_ONE_OF__LITERALS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("literals", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataOneOf_0(west.twouse.language.sparqlas.DataOneOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("One");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataOneOf");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataIntersectionOf(west.twouse.language.sparqlas.DataIntersectionOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_INTERSECTION_OF__DATA_RANGES));
		printCountingMap.put("dataRanges", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataIntersectionOf_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataRanges");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_INTERSECTION_OF__DATA_RANGES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRanges", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataRanges");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_INTERSECTION_OF__DATA_RANGES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRanges", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataIntersectionOf_0(west.twouse.language.sparqlas.DataIntersectionOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("And");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataIntersectionOf");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DatatypeRestriction(west.twouse.language.sparqlas.DatatypeRestriction element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATATYPE_RESTRICTION__DATATYPE));
		printCountingMap.put("datatype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATATYPE_RESTRICTION__RESTRICTIONS));
		printCountingMap.put("restrictions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("DatatypeRestriction");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("datatype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATATYPE_RESTRICTION__DATATYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("datatype", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("restrictions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATATYPE_RESTRICTION__RESTRICTIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("restrictions", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_FacetRestriction(west.twouse.language.sparqlas.FacetRestriction element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET));
		printCountingMap.put("constrainingFacet", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE));
		printCountingMap.put("restrictionValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constrainingFacet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FACET_RESTRICTION__CONSTRAINING_FACET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constrainingFacet", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("restrictionValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FACET_RESTRICTION__RESTRICTION_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("restrictionValue", count - 1);
		}
	}
	
	public void print_west_twouse_language_sparqlas_SubObjectPropertyOf(west.twouse.language.sparqlas.SubObjectPropertyOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("subObjectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_CHAIN));
		printCountingMap.put("subObjectPropertyChain", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("superObjectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_SubObjectPropertyOf_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_SubObjectPropertyOf_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("superObjectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superObjectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_SubObjectPropertyOf_0(west.twouse.language.sparqlas.SubObjectPropertyOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("SubPropertyOf");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("SubObjectPropertyOf");
			out.print(" ");
		}
	}
	public void print_west_twouse_language_sparqlas_SubObjectPropertyOf_1(west.twouse.language.sparqlas.SubObjectPropertyOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"subObjectPropertyExpression"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"subObjectPropertyChain"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("subObjectPropertyChain");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_CHAIN));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("subObjectPropertyChain", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("subObjectPropertyExpression");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("subObjectPropertyExpression", count - 1);
			}
		}
	}
	
	public void print_west_twouse_language_sparqlas_EquivalentObjectProperties(west.twouse.language.sparqlas.EquivalentObjectProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_EquivalentObjectProperties_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_EquivalentObjectProperties_0(west.twouse.language.sparqlas.EquivalentObjectProperties element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("EquivalentProperty");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("EquivalentObjectProperties");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DisjointObjectProperties(west.twouse.language.sparqlas.DisjointObjectProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DisjointObjectProperties_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DisjointObjectProperties_0(west.twouse.language.sparqlas.DisjointObjectProperties element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("DisjointProperty");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DisjointObjectProperties");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectPropertyDomain(west.twouse.language.sparqlas.ObjectPropertyDomain element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN));
		printCountingMap.put("domain", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectPropertyDomain_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("domain");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("domain", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectPropertyDomain_0(west.twouse.language.sparqlas.ObjectPropertyDomain element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Domain");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectPropertyDomain");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectPropertyRange(west.twouse.language.sparqlas.ObjectPropertyRange element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_RANGE__RANGE));
		printCountingMap.put("range", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectPropertyRange_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("range");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_RANGE__RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("range", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectPropertyRange_0(west.twouse.language.sparqlas.ObjectPropertyRange element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Range");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectPropertyRange");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_InverseObjectPropertyAtom(west.twouse.language.sparqlas.InverseObjectPropertyAtom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION1));
		printCountingMap.put("objectPropertyExpression1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION2));
		printCountingMap.put("objectPropertyExpression2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_InverseObjectPropertyAtom_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression1", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression2", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_InverseObjectPropertyAtom_0(west.twouse.language.sparqlas.InverseObjectPropertyAtom element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("InverseOf");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("InverseObjectProperties");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_FunctionalObjectProperty(west.twouse.language.sparqlas.FunctionalObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("FunctionalObjectProperty");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_InverseFunctionalObjectProperty(west.twouse.language.sparqlas.InverseFunctionalObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_InverseFunctionalObjectProperty_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_InverseFunctionalObjectProperty_0(west.twouse.language.sparqlas.InverseFunctionalObjectProperty element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("InverseFunctional");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("InverseFunctionalObjectProperty");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ReflexiveObjectProperty(west.twouse.language.sparqlas.ReflexiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ReflexiveObjectProperty_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ReflexiveObjectProperty_0(west.twouse.language.sparqlas.ReflexiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Reflexive");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ReflexiveObjectProperty");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_IrreflexiveObjectProperty(west.twouse.language.sparqlas.IrreflexiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_IrreflexiveObjectProperty_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_IrreflexiveObjectProperty_0(west.twouse.language.sparqlas.IrreflexiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Irreflexive");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("IrreflexiveObjectProperty");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_SymmetricObjectProperty(west.twouse.language.sparqlas.SymmetricObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_SymmetricObjectProperty_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_SymmetricObjectProperty_0(west.twouse.language.sparqlas.SymmetricObjectProperty element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Symmetric");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("SymmetricObjectProperty");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_AsymmetricObjectProperty(west.twouse.language.sparqlas.AsymmetricObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_AsymmetricObjectProperty_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_AsymmetricObjectProperty_0(west.twouse.language.sparqlas.AsymmetricObjectProperty element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Asymmetric");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("AsymmetricObjectProperty");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_TransitiveObjectProperty(west.twouse.language.sparqlas.TransitiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_TransitiveObjectProperty_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_TransitiveObjectProperty_0(west.twouse.language.sparqlas.TransitiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Transitive");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("TransitiveObjectProperty");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_SubDataPropertyOf(west.twouse.language.sparqlas.SubDataPropertyOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("subDataPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("superDataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_SubDataPropertyOf_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subDataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subDataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("superDataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superDataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_SubDataPropertyOf_0(west.twouse.language.sparqlas.SubDataPropertyOf element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("SubPropertyOf");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("SubDataPropertyOf");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_EquivalentDataProperties(west.twouse.language.sparqlas.EquivalentDataProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_EquivalentDataProperties_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_EquivalentDataProperties_0(west.twouse.language.sparqlas.EquivalentDataProperties element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("EquivalentProperty");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("EquivalentDataProperties");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DisjointDataProperties(west.twouse.language.sparqlas.DisjointDataProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DisjointDataProperties_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DisjointDataProperties_0(west.twouse.language.sparqlas.DisjointDataProperties element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("DisjointProperty");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DisjointDataProperties");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataPropertyDomain(west.twouse.language.sparqlas.DataPropertyDomain element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_DOMAIN__DOMAIN));
		printCountingMap.put("domain", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataPropertyDomain_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("domain");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_DOMAIN__DOMAIN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("domain", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataPropertyDomain_0(west.twouse.language.sparqlas.DataPropertyDomain element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Domain");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataPropertyDomain");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_DataPropertyRange(west.twouse.language.sparqlas.DataPropertyRange element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_RANGE__RANGE));
		printCountingMap.put("range", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DataPropertyRange_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("range");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATA_PROPERTY_RANGE__RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("range", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DataPropertyRange_0(west.twouse.language.sparqlas.DataPropertyRange element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Range");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("DataPropertyRange");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_FunctionalDataProperty(west.twouse.language.sparqlas.FunctionalDataProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("FunctionalDataProperty");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_InverseObjectProperty(west.twouse.language.sparqlas.InverseObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INVERSE_OBJECT_PROPERTY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY));
		printCountingMap.put("objectProperty", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_InverseObjectProperty_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectProperty", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_InverseObjectProperty_0(west.twouse.language.sparqlas.InverseObjectProperty element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("InverseOf");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectInverseOf");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectPropertyChain(west.twouse.language.sparqlas.ObjectPropertyChain element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectPropertyChain_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectPropertyChain_0(west.twouse.language.sparqlas.ObjectPropertyChain element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("Chain");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ObjectPropertyChain");
			out.print(" ");
		}
	}
	
	public void print_west_twouse_language_sparqlas_HasKey(west.twouse.language.sparqlas.HasKey element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.HAS_KEY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.HAS_KEY__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("HasKey");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.HAS_KEY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.HAS_KEY__DATA_PROPERTY_EXPRESSION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_ClassDeclaration(west.twouse.language.sparqlas.ClassDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_DECLARATION__CLASS));
		printCountingMap.put("class", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE));
		printCountingMap.put("classVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("Class");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ClassDeclaration_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ClassDeclaration_0(west.twouse.language.sparqlas.ClassDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"class"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"classVariable"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("classVariable");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_DECLARATION__CLASS_VARIABLE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("classVariable", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("class");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.CLASS_DECLARATION__CLASS));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("class", count - 1);
			}
		}
	}
	
	public void print_west_twouse_language_sparqlas_ObjectPropertyDeclaration(west.twouse.language.sparqlas.ObjectPropertyDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY));
		printCountingMap.put("objectProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE));
		printCountingMap.put("objectPropertyVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("ObjectProperty");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_ObjectPropertyDeclaration_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_ObjectPropertyDeclaration_0(west.twouse.language.sparqlas.ObjectPropertyDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"objectProperty"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"objectPropertyVariable"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("objectPropertyVariable");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("objectPropertyVariable", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("objectProperty");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("objectProperty", count - 1);
			}
		}
	}
	
	public void print_west_twouse_language_sparqlas_DatatypePropertyDeclaration(west.twouse.language.sparqlas.DatatypePropertyDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY));
		printCountingMap.put("datatypeProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE));
		printCountingMap.put("datatypePropertyVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("DataProperty");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_DatatypePropertyDeclaration_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_DatatypePropertyDeclaration_0(west.twouse.language.sparqlas.DatatypePropertyDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"datatypeProperty"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"datatypePropertyVariable"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("datatypePropertyVariable");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("datatypePropertyVariable", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("datatypeProperty");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("datatypeProperty", count - 1);
			}
		}
	}
	
	public void print_west_twouse_language_sparqlas_IndividualDeclaration(west.twouse.language.sparqlas.IndividualDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL));
		printCountingMap.put("individual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE));
		printCountingMap.put("individualVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("NamedIndividual");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_west_twouse_language_sparqlas_IndividualDeclaration_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_sparqlas_IndividualDeclaration_0(west.twouse.language.sparqlas.IndividualDeclaration element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"individual"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"individualVariable"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("individualVariable");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("individualVariable", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("individual");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("individual", count - 1);
			}
		}
	}
	
	public void print_west_twouse_language_sparqlas_TemplateSignature(west.twouse.language.sparqlas.TemplateSignature element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER));
		printCountingMap.put("ownedParameter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_SIGNATURE__TEMPLATE));
		printCountingMap.put("template", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedParameter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedParameter", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ownedParameter");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ownedParameter", 0);
		}
	}
	
	public void print_west_twouse_language_sparqlas_TemplateParameter(west.twouse.language.sparqlas.TemplateParameter element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_PARAMETER__SIGNATURE));
		printCountingMap.put("signature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT));
		printCountingMap.put("parameteredElement", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION));
		printCountingMap.put("parameterSubstitution", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Parameter");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameteredElement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameteredElement", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_TemplateBinding(west.twouse.language.sparqlas.TemplateBinding element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION));
		printCountingMap.put("parameterSubstitution", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_BINDING__BOUND_ELEMENT));
		printCountingMap.put("boundElement", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_BINDING__SIGNATURE));
		printCountingMap.put("signature", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Bind");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameterSubstitution");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameterSubstitution", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameterSubstitution");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameterSubstitution", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_TemplateParameterSubstitution(west.twouse.language.sparqlas.TemplateParameterSubstitution element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL));
		printCountingMap.put("actual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING));
		printCountingMap.put("templateBinding", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL));
		printCountingMap.put("formal", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("formal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("formal", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("actual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("actual", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_DirectClassAssertion(west.twouse.language.sparqlas.DirectClassAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIRECT_CLASS_ASSERTION__INDIVIDUAL));
		printCountingMap.put("individual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIRECT_CLASS_ASSERTION__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("DirectType");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIRECT_CLASS_ASSERTION__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("individual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIRECT_CLASS_ASSERTION__INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individual", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_DirectSubClassOf(west.twouse.language.sparqlas.DirectSubClassOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIRECT_SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
		printCountingMap.put("subClassExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIRECT_SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
		printCountingMap.put("superClassExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("DirectSubClassOf");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIRECT_SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subClassExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("superClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.DIRECT_SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superClassExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_sparqlas_StrictSubClassOf(west.twouse.language.sparqlas.StrictSubClassOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.STRICT_SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
		printCountingMap.put("subClassExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.STRICT_SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
		printCountingMap.put("superClassExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("StrictSubClassOf");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.STRICT_SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subClassExpression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("superClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.sparqlas.SparqlasPackage.STRICT_SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superClassExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
}
