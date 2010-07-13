/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

public class Owl2fsPrinter implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextPrinter {
	
	protected final static java.lang.String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	protected west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolverFactory tokenResolverFactory = new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/** Holds the resource that is associated with this printer. may be null if the printer is used stand alone. */
	private west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource resource;
	private java.util.Map<?, ?> options;
	
	public Owl2fsPrinter(java.io.OutputStream outputStream, west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource resource) {
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
		
		if (element instanceof west.twouse.language.owl2fs.FullIRI) {
			print_west_twouse_language_owl2fs_FullIRI((west.twouse.language.owl2fs.FullIRI) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.AbbreviatedIRI) {
			print_west_twouse_language_owl2fs_AbbreviatedIRI((west.twouse.language.owl2fs.AbbreviatedIRI) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.OntologyDocument) {
			print_west_twouse_language_owl2fs_OntologyDocument((west.twouse.language.owl2fs.OntologyDocument) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.PrefixDefinition) {
			print_west_twouse_language_owl2fs_PrefixDefinition((west.twouse.language.owl2fs.PrefixDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.Ontology) {
			print_west_twouse_language_owl2fs_Ontology((west.twouse.language.owl2fs.Ontology) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.Comment) {
			print_west_twouse_language_owl2fs_Comment((west.twouse.language.owl2fs.Comment) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ClassDeclaration) {
			print_west_twouse_language_owl2fs_ClassDeclaration((west.twouse.language.owl2fs.ClassDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DatatypeDeclaration) {
			print_west_twouse_language_owl2fs_DatatypeDeclaration((west.twouse.language.owl2fs.DatatypeDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectPropertyDeclaration) {
			print_west_twouse_language_owl2fs_ObjectPropertyDeclaration((west.twouse.language.owl2fs.ObjectPropertyDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataPropertyDeclaration) {
			print_west_twouse_language_owl2fs_DataPropertyDeclaration((west.twouse.language.owl2fs.DataPropertyDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.AnnotationPropertyDeclaration) {
			print_west_twouse_language_owl2fs_AnnotationPropertyDeclaration((west.twouse.language.owl2fs.AnnotationPropertyDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.NamedIndividualDeclaration) {
			print_west_twouse_language_owl2fs_NamedIndividualDeclaration((west.twouse.language.owl2fs.NamedIndividualDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.Class) {
			print_west_twouse_language_owl2fs_Class((west.twouse.language.owl2fs.Class) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.Datatype) {
			print_west_twouse_language_owl2fs_Datatype((west.twouse.language.owl2fs.Datatype) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectProperty) {
			print_west_twouse_language_owl2fs_ObjectProperty((west.twouse.language.owl2fs.ObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataProperty) {
			print_west_twouse_language_owl2fs_DataProperty((west.twouse.language.owl2fs.DataProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.AnnotationProperty) {
			print_west_twouse_language_owl2fs_AnnotationProperty((west.twouse.language.owl2fs.AnnotationProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.NamedIndividual) {
			print_west_twouse_language_owl2fs_NamedIndividual((west.twouse.language.owl2fs.NamedIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.AnnotationAssertion) {
			print_west_twouse_language_owl2fs_AnnotationAssertion((west.twouse.language.owl2fs.AnnotationAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.SubAnnotationPropertyOf) {
			print_west_twouse_language_owl2fs_SubAnnotationPropertyOf((west.twouse.language.owl2fs.SubAnnotationPropertyOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.AnnotationPropertyDomain) {
			print_west_twouse_language_owl2fs_AnnotationPropertyDomain((west.twouse.language.owl2fs.AnnotationPropertyDomain) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.AnnotationPropertyRange) {
			print_west_twouse_language_owl2fs_AnnotationPropertyRange((west.twouse.language.owl2fs.AnnotationPropertyRange) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.Annotation) {
			print_west_twouse_language_owl2fs_Annotation((west.twouse.language.owl2fs.Annotation) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.AnonymousIndividual) {
			print_west_twouse_language_owl2fs_AnonymousIndividual((west.twouse.language.owl2fs.AnonymousIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.Literal) {
			print_west_twouse_language_owl2fs_Literal((west.twouse.language.owl2fs.Literal) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.InverseObjectProperty) {
			print_west_twouse_language_owl2fs_InverseObjectProperty((west.twouse.language.owl2fs.InverseObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataComplementOf) {
			print_west_twouse_language_owl2fs_DataComplementOf((west.twouse.language.owl2fs.DataComplementOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataOneOf) {
			print_west_twouse_language_owl2fs_DataOneOf((west.twouse.language.owl2fs.DataOneOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DatatypeRestriction) {
			print_west_twouse_language_owl2fs_DatatypeRestriction((west.twouse.language.owl2fs.DatatypeRestriction) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.FacetConstraintPair) {
			print_west_twouse_language_owl2fs_FacetConstraintPair((west.twouse.language.owl2fs.FacetConstraintPair) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectIntersectionOf) {
			print_west_twouse_language_owl2fs_ObjectIntersectionOf((west.twouse.language.owl2fs.ObjectIntersectionOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectUnionOf) {
			print_west_twouse_language_owl2fs_ObjectUnionOf((west.twouse.language.owl2fs.ObjectUnionOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectComplementOf) {
			print_west_twouse_language_owl2fs_ObjectComplementOf((west.twouse.language.owl2fs.ObjectComplementOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectOneOf) {
			print_west_twouse_language_owl2fs_ObjectOneOf((west.twouse.language.owl2fs.ObjectOneOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectSomeValuesFrom) {
			print_west_twouse_language_owl2fs_ObjectSomeValuesFrom((west.twouse.language.owl2fs.ObjectSomeValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectAllValuesFrom) {
			print_west_twouse_language_owl2fs_ObjectAllValuesFrom((west.twouse.language.owl2fs.ObjectAllValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectHasValue) {
			print_west_twouse_language_owl2fs_ObjectHasValue((west.twouse.language.owl2fs.ObjectHasValue) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectHasSelf) {
			print_west_twouse_language_owl2fs_ObjectHasSelf((west.twouse.language.owl2fs.ObjectHasSelf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectMinCardinality) {
			print_west_twouse_language_owl2fs_ObjectMinCardinality((west.twouse.language.owl2fs.ObjectMinCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectMaxCardinality) {
			print_west_twouse_language_owl2fs_ObjectMaxCardinality((west.twouse.language.owl2fs.ObjectMaxCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectExactCardinality) {
			print_west_twouse_language_owl2fs_ObjectExactCardinality((west.twouse.language.owl2fs.ObjectExactCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataSomeValuesFrom) {
			print_west_twouse_language_owl2fs_DataSomeValuesFrom((west.twouse.language.owl2fs.DataSomeValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataAllValuesFrom) {
			print_west_twouse_language_owl2fs_DataAllValuesFrom((west.twouse.language.owl2fs.DataAllValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataHasValue) {
			print_west_twouse_language_owl2fs_DataHasValue((west.twouse.language.owl2fs.DataHasValue) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataMinCardinality) {
			print_west_twouse_language_owl2fs_DataMinCardinality((west.twouse.language.owl2fs.DataMinCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataMaxCardinality) {
			print_west_twouse_language_owl2fs_DataMaxCardinality((west.twouse.language.owl2fs.DataMaxCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataExactCardinality) {
			print_west_twouse_language_owl2fs_DataExactCardinality((west.twouse.language.owl2fs.DataExactCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.SubClassOf) {
			print_west_twouse_language_owl2fs_SubClassOf((west.twouse.language.owl2fs.SubClassOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.EquivalentClasses) {
			print_west_twouse_language_owl2fs_EquivalentClasses((west.twouse.language.owl2fs.EquivalentClasses) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DisjointClasses) {
			print_west_twouse_language_owl2fs_DisjointClasses((west.twouse.language.owl2fs.DisjointClasses) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DisjointUnion) {
			print_west_twouse_language_owl2fs_DisjointUnion((west.twouse.language.owl2fs.DisjointUnion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.SubObjectPropertyOf) {
			print_west_twouse_language_owl2fs_SubObjectPropertyOf((west.twouse.language.owl2fs.SubObjectPropertyOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectPropertyChain) {
			print_west_twouse_language_owl2fs_ObjectPropertyChain((west.twouse.language.owl2fs.ObjectPropertyChain) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.EquivalentObjectProperties) {
			print_west_twouse_language_owl2fs_EquivalentObjectProperties((west.twouse.language.owl2fs.EquivalentObjectProperties) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DisjointObjectProperties) {
			print_west_twouse_language_owl2fs_DisjointObjectProperties((west.twouse.language.owl2fs.DisjointObjectProperties) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectPropertyDomain) {
			print_west_twouse_language_owl2fs_ObjectPropertyDomain((west.twouse.language.owl2fs.ObjectPropertyDomain) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectPropertyRange) {
			print_west_twouse_language_owl2fs_ObjectPropertyRange((west.twouse.language.owl2fs.ObjectPropertyRange) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.InverseObjectProperties) {
			print_west_twouse_language_owl2fs_InverseObjectProperties((west.twouse.language.owl2fs.InverseObjectProperties) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.FunctionalObjectProperty) {
			print_west_twouse_language_owl2fs_FunctionalObjectProperty((west.twouse.language.owl2fs.FunctionalObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.InverseFunctionalObjectProperty) {
			print_west_twouse_language_owl2fs_InverseFunctionalObjectProperty((west.twouse.language.owl2fs.InverseFunctionalObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ReflexiveObjectProperty) {
			print_west_twouse_language_owl2fs_ReflexiveObjectProperty((west.twouse.language.owl2fs.ReflexiveObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.IrreflexiveObjectProperty) {
			print_west_twouse_language_owl2fs_IrreflexiveObjectProperty((west.twouse.language.owl2fs.IrreflexiveObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.SymmetricObjectProperty) {
			print_west_twouse_language_owl2fs_SymmetricObjectProperty((west.twouse.language.owl2fs.SymmetricObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.AsymmetricObjectProperty) {
			print_west_twouse_language_owl2fs_AsymmetricObjectProperty((west.twouse.language.owl2fs.AsymmetricObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.TransitiveObjectProperty) {
			print_west_twouse_language_owl2fs_TransitiveObjectProperty((west.twouse.language.owl2fs.TransitiveObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.SubDataPropertyOf) {
			print_west_twouse_language_owl2fs_SubDataPropertyOf((west.twouse.language.owl2fs.SubDataPropertyOf) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.EquivalentDataProperties) {
			print_west_twouse_language_owl2fs_EquivalentDataProperties((west.twouse.language.owl2fs.EquivalentDataProperties) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DisjointDataProperties) {
			print_west_twouse_language_owl2fs_DisjointDataProperties((west.twouse.language.owl2fs.DisjointDataProperties) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataPropertyDomain) {
			print_west_twouse_language_owl2fs_DataPropertyDomain((west.twouse.language.owl2fs.DataPropertyDomain) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataPropertyRange) {
			print_west_twouse_language_owl2fs_DataPropertyRange((west.twouse.language.owl2fs.DataPropertyRange) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.FunctionalDataProperty) {
			print_west_twouse_language_owl2fs_FunctionalDataProperty((west.twouse.language.owl2fs.FunctionalDataProperty) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DatatypeDefinition) {
			print_west_twouse_language_owl2fs_DatatypeDefinition((west.twouse.language.owl2fs.DatatypeDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.HasKey) {
			print_west_twouse_language_owl2fs_HasKey((west.twouse.language.owl2fs.HasKey) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.SameIndividual) {
			print_west_twouse_language_owl2fs_SameIndividual((west.twouse.language.owl2fs.SameIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DifferentIndividuals) {
			print_west_twouse_language_owl2fs_DifferentIndividuals((west.twouse.language.owl2fs.DifferentIndividuals) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ClassAssertion) {
			print_west_twouse_language_owl2fs_ClassAssertion((west.twouse.language.owl2fs.ClassAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectPropertyAssertion) {
			print_west_twouse_language_owl2fs_ObjectPropertyAssertion((west.twouse.language.owl2fs.ObjectPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.NegativeObjectPropertyAssertion) {
			print_west_twouse_language_owl2fs_NegativeObjectPropertyAssertion((west.twouse.language.owl2fs.NegativeObjectPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataPropertyAssertion) {
			print_west_twouse_language_owl2fs_DataPropertyAssertion((west.twouse.language.owl2fs.DataPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.NegativeDataPropertyAssertion) {
			print_west_twouse_language_owl2fs_NegativeDataPropertyAssertion((west.twouse.language.owl2fs.NegativeDataPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DLSafeRule) {
			print_west_twouse_language_owl2fs_DLSafeRule((west.twouse.language.owl2fs.DLSafeRule) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ClassAtom) {
			print_west_twouse_language_owl2fs_ClassAtom((west.twouse.language.owl2fs.ClassAtom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataRangeAtom) {
			print_west_twouse_language_owl2fs_DataRangeAtom((west.twouse.language.owl2fs.DataRangeAtom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.ObjectPropertyAtom) {
			print_west_twouse_language_owl2fs_ObjectPropertyAtom((west.twouse.language.owl2fs.ObjectPropertyAtom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DataPropetyAtom) {
			print_west_twouse_language_owl2fs_DataPropetyAtom((west.twouse.language.owl2fs.DataPropetyAtom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.BuiltInAtom) {
			print_west_twouse_language_owl2fs_BuiltInAtom((west.twouse.language.owl2fs.BuiltInAtom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.SameIndividualAtom) {
			print_west_twouse_language_owl2fs_SameIndividualAtom((west.twouse.language.owl2fs.SameIndividualAtom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DifferentIndividualsAtom) {
			print_west_twouse_language_owl2fs_DifferentIndividualsAtom((west.twouse.language.owl2fs.DifferentIndividualsAtom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.Variable) {
			print_west_twouse_language_owl2fs_Variable((west.twouse.language.owl2fs.Variable) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DGRule) {
			print_west_twouse_language_owl2fs_DGRule((west.twouse.language.owl2fs.DGRule) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DGAxiom) {
			print_west_twouse_language_owl2fs_DGAxiom((west.twouse.language.owl2fs.DGAxiom) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DGNodes) {
			print_west_twouse_language_owl2fs_DGNodes((west.twouse.language.owl2fs.DGNodes) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.NodeAssertion) {
			print_west_twouse_language_owl2fs_NodeAssertion((west.twouse.language.owl2fs.NodeAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.DGEdges) {
			print_west_twouse_language_owl2fs_DGEdges((west.twouse.language.owl2fs.DGEdges) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.EdgeAssertion) {
			print_west_twouse_language_owl2fs_EdgeAssertion((west.twouse.language.owl2fs.EdgeAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.owl2fs.MainClasses) {
			print_west_twouse_language_owl2fs_MainClasses((west.twouse.language.owl2fs.MainClasses) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The cs printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsReferenceResolverSwitch getReferenceResolverSwitch() {
		return (west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsReferenceResolverSwitch) new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final java.lang.String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsProblem(errorMessage, west.twouse.language.owl2fs.resource.owl2fs.Owl2fsEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource getResource() {
		return resource;
	}
	
	/** Calls {@link #doPrint(EObject, String)} and writes the result to the underlying output stream. */
	public void print(org.eclipse.emf.ecore.EObject element)  {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_west_twouse_language_owl2fs_FullIRI(west.twouse.language.owl2fs.FullIRI element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FULL_IRI__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FULL_IRI__VALUE));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("FULLIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FULL_IRI__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	public void print_west_twouse_language_owl2fs_AbbreviatedIRI(west.twouse.language.owl2fs.AbbreviatedIRI element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ABBREVIATED_IRI__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ABBREVIATED_IRI__PREFIX));
		printCountingMap.put("prefix", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("prefix");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ABBREVIATED_IRI__PREFIX));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("ABBRIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ABBREVIATED_IRI__PREFIX), element));
			}
			printCountingMap.put("prefix", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ABBREVIATED_IRI__VALUE));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("ABBRIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ABBREVIATED_IRI__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	public void print_west_twouse_language_owl2fs_OntologyDocument(west.twouse.language.owl2fs.OntologyDocument element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__ONTOLOGY));
		printCountingMap.put("ontology", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION));
		printCountingMap.put("prefixDefinition", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__COMMENT));
		printCountingMap.put("comment", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_west_twouse_language_owl2fs_OntologyDocument_0(element, localtab, out1, printCountingMap1);
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ontology");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__ONTOLOGY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ontology", count - 1);
		}
	}
	public void print_west_twouse_language_owl2fs_OntologyDocument_0(west.twouse.language.owl2fs.OntologyDocument element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"prefixDefinition"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"comment"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (Containment):
				count = printCountingMap.get("comment");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__COMMENT));
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
					printCountingMap.put("comment", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("prefixDefinition");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION));
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
		}
	}
	
	public void print_west_twouse_language_owl2fs_PrefixDefinition(west.twouse.language.owl2fs.PrefixDefinition element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__PREF));
		printCountingMap.put("pref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE));
		printCountingMap.put("namespace", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Prefix");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__PREF));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("ABBRIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__PREF), element));
			}
			printCountingMap.put("pref", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":=");
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("namespace");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("namespace", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_Ontology(west.twouse.language.owl2fs.Ontology element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(8);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__EXPRESSIONS));
		printCountingMap.put("expressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__PACKAGES));
		printCountingMap.put("packages", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__COMMENT));
		printCountingMap.put("comment", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI));
		printCountingMap.put("ontologyIRI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__VERSION_IRI));
		printCountingMap.put("versionIRI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS));
		printCountingMap.put("directlyImportsDocuments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS));
		printCountingMap.put("ontologyAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__AXIOMS));
		printCountingMap.put("axioms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Ontology");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("comment");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__COMMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("comment",0);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_west_twouse_language_owl2fs_Ontology_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("comment");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__COMMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("comment",0);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_west_twouse_language_owl2fs_Ontology_1(element, localtab, out1, printCountingMap1);
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
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_west_twouse_language_owl2fs_Ontology_2(element, localtab, out1, printCountingMap1);
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
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axioms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__AXIOMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axioms",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("comment");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__COMMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("comment",0);
		}
	}
	public void print_west_twouse_language_owl2fs_Ontology_0(west.twouse.language.owl2fs.Ontology element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ontologyIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ontologyIRI", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("comment");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__COMMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("comment",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("versionIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__VERSION_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("versionIRI", count - 1);
		}
	}
	public void print_west_twouse_language_owl2fs_Ontology_1(west.twouse.language.owl2fs.Ontology element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Import");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("comment");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__COMMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("comment",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("directlyImportsDocuments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS));
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
			printCountingMap.put("directlyImportsDocuments", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("comment");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__COMMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("comment",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_west_twouse_language_owl2fs_Ontology_2(west.twouse.language.owl2fs.Ontology element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("comment");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__COMMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("comment",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ontologyAnnotations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS));
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
			printCountingMap.put("ontologyAnnotations", count - 1);
		}
	}
	
	public void print_west_twouse_language_owl2fs_Comment(west.twouse.language.owl2fs.Comment element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.COMMENT__COMMENT));
		printCountingMap.put("comment", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("comment");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.COMMENT__COMMENT));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("COMMENT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.COMMENT__COMMENT), element));
				out.print(" ");
			}
			printCountingMap.put("comment", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ClassDeclaration(west.twouse.language.owl2fs.ClassDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_DECLARATION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_DECLARATION__ENTITY));
		printCountingMap.put("entity", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Declaration");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_DECLARATION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Class");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entity");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_DECLARATION__ENTITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entity", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DatatypeDeclaration(west.twouse.language.owl2fs.DatatypeDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_DECLARATION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_DECLARATION__ENTITY));
		printCountingMap.put("entity", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Declaration");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_DECLARATION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Datatype");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entity");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_DECLARATION__ENTITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entity", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ObjectPropertyDeclaration(west.twouse.language.owl2fs.ObjectPropertyDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DECLARATION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DECLARATION__ENTITY));
		printCountingMap.put("entity", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Declaration");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DECLARATION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entity");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DECLARATION__ENTITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entity", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DataPropertyDeclaration(west.twouse.language.owl2fs.DataPropertyDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_DECLARATION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_DECLARATION__ENTITY));
		printCountingMap.put("entity", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Declaration");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_DECLARATION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entity");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_DECLARATION__ENTITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entity", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_AnnotationPropertyDeclaration(west.twouse.language.owl2fs.AnnotationPropertyDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_DECLARATION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_DECLARATION__ENTITY));
		printCountingMap.put("entity", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Declaration");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_DECLARATION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("AnnotationProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entity");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_DECLARATION__ENTITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entity", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_NamedIndividualDeclaration(west.twouse.language.owl2fs.NamedIndividualDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL_DECLARATION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL_DECLARATION__ENTITY));
		printCountingMap.put("entity", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Declaration");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL_DECLARATION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("NamedIndividual");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entity");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL_DECLARATION__ENTITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entity", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_Class(west.twouse.language.owl2fs.Class element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS__ENTITY_IRI));
		printCountingMap.put("entityIRI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS__ENTITY_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_owl2fs_Datatype(west.twouse.language.owl2fs.Datatype element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE__ENTITY_IRI));
		printCountingMap.put("entityIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE__ENTITY_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_owl2fs_ObjectProperty(west.twouse.language.owl2fs.ObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__ENTITY_IRI));
		printCountingMap.put("entityIRI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__ENTITY_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_owl2fs_DataProperty(west.twouse.language.owl2fs.DataProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY__ENTITY_IRI));
		printCountingMap.put("entityIRI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY__ENTITY_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_owl2fs_AnnotationProperty(west.twouse.language.owl2fs.AnnotationProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY__ENTITY_IRI));
		printCountingMap.put("entityIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY__ENTITY_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_owl2fs_NamedIndividual(west.twouse.language.owl2fs.NamedIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL__ENTITY_IRI));
		printCountingMap.put("entityIRI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL__ENTITY_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityIRI", count - 1);
		}
	}
	
	public void print_west_twouse_language_owl2fs_AnnotationAssertion(west.twouse.language.owl2fs.AnnotationAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY));
		printCountingMap.put("annotationProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT));
		printCountingMap.put("annotationSubject", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE));
		printCountingMap.put("annotationValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("AnnotationAssertion");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_ASSERTION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotationProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotationProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotationSubject");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_SUBJECT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotationSubject", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotationValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_ASSERTION__ANNOTATION_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotationValue", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_SubAnnotationPropertyOf(west.twouse.language.owl2fs.SubAnnotationPropertyOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_ANNOTATION_PROPERTY_OF__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY));
		printCountingMap.put("subAnnotationProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY));
		printCountingMap.put("superAnnotationProperty", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("SubAnnotationPropertyOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_ANNOTATION_PROPERTY_OF__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("subAnnotationProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subAnnotationProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("superAnnotationProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superAnnotationProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_AnnotationPropertyDomain(west.twouse.language.owl2fs.AnnotationPropertyDomain element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY));
		printCountingMap.put("annotationProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI));
		printCountingMap.put("iri", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("AnnotationPropertyDomain");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotationProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotationProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_DOMAIN__IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iri", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_AnnotationPropertyRange(west.twouse.language.owl2fs.AnnotationPropertyRange element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_RANGE__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY));
		printCountingMap.put("annotationProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_RANGE__IRI));
		printCountingMap.put("iri", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("AnnotationPropertyRange");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_RANGE__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotationProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotationProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY_RANGE__IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iri", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_Annotation(west.twouse.language.owl2fs.Annotation element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION__ANNOTATION_ANNOTATIONS));
		printCountingMap.put("annotationAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION__ANNOTATION_PROPERTY));
		printCountingMap.put("annotationProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION__ANNOTATION_VALUE));
		printCountingMap.put("annotationValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Annotation");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotationAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION__ANNOTATION_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotationAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotationProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION__ANNOTATION_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotationProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotationValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANNOTATION__ANNOTATION_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotationValue", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_AnonymousIndividual(west.twouse.language.owl2fs.AnonymousIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID));
		printCountingMap.put("nodeID", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("nodeID");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("NODE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID), element));
				out.print(" ");
			}
			printCountingMap.put("nodeID", count - 1);
		}
	}
	
	public void print_west_twouse_language_owl2fs_Literal(west.twouse.language.owl2fs.Literal element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.LITERAL__LEXICAL_VALUE));
		printCountingMap.put("lexicalValue", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.LITERAL__DATATYPE));
		printCountingMap.put("datatype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.LITERAL__LANGUAGE_TAG));
		printCountingMap.put("languageTag", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("lexicalValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.LITERAL__LEXICAL_VALUE));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.LITERAL__LEXICAL_VALUE), element));
			}
			printCountingMap.put("lexicalValue", count - 1);
		}
		//////////////DEFINITION PART BEGINS (WhiteSpaces):
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
		print_west_twouse_language_owl2fs_Literal_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_west_twouse_language_owl2fs_Literal_0(west.twouse.language.owl2fs.Literal element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"datatype"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"languageTag"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
				count = printCountingMap.get("languageTag");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.LITERAL__LANGUAGE_TAG));
					if (o != null) {
						west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("LANGTAG");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.LITERAL__LANGUAGE_TAG), element));
						out.print(" ");
					}
					printCountingMap.put("languageTag", count - 1);
				}
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("^^");
			//////////////DEFINITION PART BEGINS (WhiteSpaces):
			//////////////DEFINITION PART BEGINS (Containment):
			count = printCountingMap.get("datatype");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.LITERAL__DATATYPE));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("datatype", count - 1);
			}
		}
	}
	
	public void print_west_twouse_language_owl2fs_InverseObjectProperty(west.twouse.language.owl2fs.InverseObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY));
		printCountingMap.put("objectProperty", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectInverseOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DataComplementOf(west.twouse.language.owl2fs.DataComplementOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_COMPLEMENT_OF__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataComplementOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_COMPLEMENT_OF__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DataOneOf(west.twouse.language.owl2fs.DataOneOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_ONE_OF__CONSTANTS));
		printCountingMap.put("constants", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataOneOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constants");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_ONE_OF__CONSTANTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constants",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DatatypeRestriction(west.twouse.language.owl2fs.DatatypeRestriction element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__DATATYPE));
		printCountingMap.put("datatype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__RESTRICTIONS));
		printCountingMap.put("restrictions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DatatypeRestriction");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("datatype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__DATATYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("datatype", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("restrictions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__RESTRICTIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("restrictions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_FacetConstraintPair(west.twouse.language.owl2fs.FacetConstraintPair element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT));
		printCountingMap.put("constant", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET));
		printCountingMap.put("facet", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("facet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FACET_CONSTRAINT_PAIR__FACET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("facet", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constant");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FACET_CONSTRAINT_PAIR__CONSTANT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constant", count - 1);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ObjectIntersectionOf(west.twouse.language.owl2fs.ObjectIntersectionOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_INTERSECTION_OF__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
		printCountingMap.put("classExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectIntersectionOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_ObjectUnionOf(west.twouse.language.owl2fs.ObjectUnionOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_UNION_OF__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
		printCountingMap.put("classExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectUnionOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_ObjectComplementOf(west.twouse.language.owl2fs.ObjectComplementOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_COMPLEMENT_OF__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectComplementOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_ObjectOneOf(west.twouse.language.owl2fs.ObjectOneOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_ONE_OF__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_ONE_OF__INDIVIDUALS));
		printCountingMap.put("individuals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectOneOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individuals");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_ONE_OF__INDIVIDUALS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individuals",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_ObjectSomeValuesFrom(west.twouse.language.owl2fs.ObjectSomeValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectSomeValuesFrom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_ObjectAllValuesFrom(west.twouse.language.owl2fs.ObjectAllValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectAllValuesFrom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_ObjectHasValue(west.twouse.language.owl2fs.ObjectHasValue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL));
		printCountingMap.put("individual", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectHasValue");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_ObjectHasSelf(west.twouse.language.owl2fs.ObjectHasSelf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_HAS_SELF__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_HAS_SELF__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectHasSelf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_HAS_SELF__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_ObjectMinCardinality(west.twouse.language.owl2fs.ObjectMinCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectMinCardinality");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_ObjectMaxCardinality(west.twouse.language.owl2fs.ObjectMaxCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectMaxCardinality");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_ObjectExactCardinality(west.twouse.language.owl2fs.ObjectExactCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectExactCardinality");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_DataSomeValuesFrom(west.twouse.language.owl2fs.DataSomeValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
		printCountingMap.put("dataPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataSomeValuesFrom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_DataAllValuesFrom(west.twouse.language.owl2fs.DataAllValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
		printCountingMap.put("dataPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataAllValuesFrom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_DataHasValue(west.twouse.language.owl2fs.DataHasValue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__CONSTANT));
		printCountingMap.put("constant", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataHasValue");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constant");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__CONSTANT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constant", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_DataMinCardinality(west.twouse.language.owl2fs.DataMinCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataMinCardinality");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_DataMaxCardinality(west.twouse.language.owl2fs.DataMaxCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataMaxCardinality");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_DataExactCardinality(west.twouse.language.owl2fs.DataExactCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataExactCardinality");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__CARDINALITY));
			if (o != null) {
				west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_SubClassOf(west.twouse.language.owl2fs.SubClassOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_CLASS_OF__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
		printCountingMap.put("subClassExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
		printCountingMap.put("superClassExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("SubClassOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_CLASS_OF__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("subClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subClassExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("superClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superClassExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_EquivalentClasses(west.twouse.language.owl2fs.EquivalentClasses element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS));
		printCountingMap.put("equivalentClassExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("EquivalentClasses");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("equivalentClassExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS));
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
			printCountingMap.put("equivalentClassExpressions", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("equivalentClassExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("equivalentClassExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DisjointClasses(west.twouse.language.owl2fs.DisjointClasses element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS));
		printCountingMap.put("disjointClassExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DisjointClasses");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("disjointClassExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("disjointClassExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("disjointClassExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DisjointUnion(west.twouse.language.owl2fs.DisjointUnion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_UNION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_UNION__UNION_CLASS));
		printCountingMap.put("unionClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS));
		printCountingMap.put("disjointClassExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DisjointUnion");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_UNION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("unionClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_UNION__UNION_CLASS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("unionClass", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("disjointClassExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("disjointClassExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("disjointClassExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_SubObjectPropertyOf(west.twouse.language.owl2fs.SubObjectPropertyOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("subObjectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("superObjectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("SubObjectPropertyOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("subObjectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subObjectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("superObjectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superObjectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ObjectPropertyChain(west.twouse.language.owl2fs.ObjectPropertyChain element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS));
		printCountingMap.put("objectPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectPropertyChain");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS));
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
			printCountingMap.put("objectPropertyExpressions", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_EquivalentObjectProperties(west.twouse.language.owl2fs.EquivalentObjectProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
		printCountingMap.put("objectPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("EquivalentObjectProperties");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
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
			printCountingMap.put("objectPropertyExpressions", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DisjointObjectProperties(west.twouse.language.owl2fs.DisjointObjectProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
		printCountingMap.put("objectPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DisjointObjectProperties");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
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
			printCountingMap.put("objectPropertyExpressions", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ObjectPropertyDomain(west.twouse.language.owl2fs.ObjectPropertyDomain element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN));
		printCountingMap.put("domain", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectPropertyDomain");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("domain");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("domain", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ObjectPropertyRange(west.twouse.language.owl2fs.ObjectPropertyRange element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__RANGE));
		printCountingMap.put("range", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectPropertyRange");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("range");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("range", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_InverseObjectProperties(west.twouse.language.owl2fs.InverseObjectProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION1));
		printCountingMap.put("objectPropertyExpression1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION2));
		printCountingMap.put("objectPropertyExpression2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("InverseObjectProperties");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression1", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression2", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_FunctionalObjectProperty(west.twouse.language.owl2fs.FunctionalObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("FunctionalObjectProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_InverseFunctionalObjectProperty(west.twouse.language.owl2fs.InverseFunctionalObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("InverseFunctionalObjectProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ReflexiveObjectProperty(west.twouse.language.owl2fs.ReflexiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ReflexiveObjectProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_IrreflexiveObjectProperty(west.twouse.language.owl2fs.IrreflexiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("IrreflexiveObjectProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_SymmetricObjectProperty(west.twouse.language.owl2fs.SymmetricObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("SymmetricObjectProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_AsymmetricObjectProperty(west.twouse.language.owl2fs.AsymmetricObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("AntiSymmetricObjectProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_TransitiveObjectProperty(west.twouse.language.owl2fs.TransitiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("TransitiveObjectProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_SubDataPropertyOf(west.twouse.language.owl2fs.SubDataPropertyOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("superDataPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("subDataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("SubDataPropertyOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("subDataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subDataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("superDataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superDataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_EquivalentDataProperties(west.twouse.language.owl2fs.EquivalentDataProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
		printCountingMap.put("dataPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("EquivalentDataProperties");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DisjointDataProperties(west.twouse.language.owl2fs.DisjointDataProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
		printCountingMap.put("dataPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DisjointDataProperties");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DataPropertyDomain(west.twouse.language.owl2fs.DataPropertyDomain element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__DOMAIN));
		printCountingMap.put("domain", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataPropertyDomain");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("domain");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__DOMAIN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("domain", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DataPropertyRange(west.twouse.language.owl2fs.DataPropertyRange element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__RANGE));
		printCountingMap.put("range", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataPropertyRange");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("range");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("range", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_FunctionalDataProperty(west.twouse.language.owl2fs.FunctionalDataProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("FunctionalDataProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DatatypeDefinition(west.twouse.language.owl2fs.DatatypeDefinition element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_DEFINITION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE));
		printCountingMap.put("datatype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DatatypeDefinition");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_DEFINITION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("datatype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_DEFINITION__DATATYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("datatype", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATATYPE_DEFINITION__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_HasKey(west.twouse.language.owl2fs.HasKey element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.HAS_KEY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS));
		printCountingMap.put("objectPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.HAS_KEY__DATA_PROPERTY_EXPRESSIONS));
		printCountingMap.put("dataPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("HasKey");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.HAS_KEY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.HAS_KEY__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.HAS_KEY__DATA_PROPERTY_EXPRESSIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpressions",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_SameIndividual(west.twouse.language.owl2fs.SameIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS));
		printCountingMap.put("sameIndividuals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("SameIndividual");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sameIndividuals");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS));
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
			printCountingMap.put("sameIndividuals", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sameIndividuals");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sameIndividuals",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DifferentIndividuals(west.twouse.language.owl2fs.DifferentIndividuals element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS));
		printCountingMap.put("differentIndividuals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DifferentIndividuals");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("differentIndividuals");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS));
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
			printCountingMap.put("differentIndividuals", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("differentIndividuals");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("differentIndividuals",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ClassAssertion(west.twouse.language.owl2fs.ClassAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL));
		printCountingMap.put("individual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ClassAssertion");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_ASSERTION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ObjectPropertyAssertion(west.twouse.language.owl2fs.ObjectPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
		printCountingMap.put("targetIndividual", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectPropertyAssertion");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("targetIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_NegativeObjectPropertyAssertion(west.twouse.language.owl2fs.NegativeObjectPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
		printCountingMap.put("targetIndividual", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("NegativeObjectPropertyAssertion");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("targetIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DataPropertyAssertion(west.twouse.language.owl2fs.DataPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE));
		printCountingMap.put("targetValue", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataPropertyAssertion");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("targetValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetValue", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_NegativeDataPropertyAssertion(west.twouse.language.owl2fs.NegativeDataPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE));
		printCountingMap.put("targetValue", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("NegativeDataPropertyAssertion");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("axiomAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("targetValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetValue", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DLSafeRule(west.twouse.language.owl2fs.DLSafeRule element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DL_SAFE_RULE__ANNOTATION));
		printCountingMap.put("annotation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DL_SAFE_RULE__BODY_ATOM));
		printCountingMap.put("bodyAtom", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DL_SAFE_RULE__HEAD_ATOM));
		printCountingMap.put("headAtom", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DLSafeRule");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotation");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DL_SAFE_RULE__ANNOTATION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotation",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Body");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("bodyAtom");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DL_SAFE_RULE__BODY_ATOM));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("bodyAtom",0);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Head");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("headAtom");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DL_SAFE_RULE__HEAD_ATOM));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("headAtom",0);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ClassAtom(west.twouse.language.owl2fs.ClassAtom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_ATOM__IARG));
		printCountingMap.put("iArg", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ClassAtom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_ATOM__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iArg");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.CLASS_ATOM__IARG));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iArg", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DataRangeAtom(west.twouse.language.owl2fs.DataRangeAtom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_RANGE_ATOM__DARG));
		printCountingMap.put("dArg", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataRangeAtom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_RANGE_ATOM__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dArg");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_RANGE_ATOM__DARG));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dArg", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_ObjectPropertyAtom(west.twouse.language.owl2fs.ObjectPropertyAtom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ATOM__IARG1));
		printCountingMap.put("iArg1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ATOM__IARG2));
		printCountingMap.put("iArg2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectPropertyAtom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iArg1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ATOM__IARG1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iArg1", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iArg2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ATOM__IARG2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iArg2", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DataPropetyAtom(west.twouse.language.owl2fs.DataPropetyAtom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY));
		printCountingMap.put("dataProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPETY_ATOM__IARG));
		printCountingMap.put("iArg", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPETY_ATOM__DARG));
		printCountingMap.put("dArg", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DataPropetyAtom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPETY_ATOM__DATA_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iArg");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPETY_ATOM__IARG));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iArg", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dArg");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DATA_PROPETY_ATOM__DARG));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dArg", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_BuiltInAtom(west.twouse.language.owl2fs.BuiltInAtom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.BUILT_IN_ATOM__IRI));
		printCountingMap.put("iri", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.BUILT_IN_ATOM__DARG));
		printCountingMap.put("dArg", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("BuiltInAtom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.BUILT_IN_ATOM__IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iri", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dArg");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.BUILT_IN_ATOM__DARG));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dArg",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_SameIndividualAtom(west.twouse.language.owl2fs.SameIndividualAtom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL_ATOM__IARG1));
		printCountingMap.put("iArg1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL_ATOM__IARG2));
		printCountingMap.put("iArg2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("SameIndividualAtom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iArg1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL_ATOM__IARG1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iArg1", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iArg2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL_ATOM__IARG2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iArg2", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DifferentIndividualsAtom(west.twouse.language.owl2fs.DifferentIndividualsAtom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1));
		printCountingMap.put("iArg1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2));
		printCountingMap.put("iArg2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DifferentIndividualsAtom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iArg1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iArg1", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iArg2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS_ATOM__IARG2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iArg2", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_Variable(west.twouse.language.owl2fs.Variable element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.VARIABLE__IRI));
		printCountingMap.put("iri", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Variable");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("iri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.VARIABLE__IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iri", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_west_twouse_language_owl2fs_DGRule(west.twouse.language.owl2fs.DGRule element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_RULE__ANNOTATION));
		printCountingMap.put("annotation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_RULE__BODY_ATOM));
		printCountingMap.put("bodyAtom", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_RULE__HEAD_ATOM));
		printCountingMap.put("headAtom", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DescriptionGraphRule");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotation");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_RULE__ANNOTATION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotation",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Body");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("bodyAtom");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_RULE__BODY_ATOM));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("bodyAtom",0);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Head");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		localtab += "	";
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("headAtom");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_RULE__HEAD_ATOM));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("headAtom",0);
		}
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DGAxiom(west.twouse.language.owl2fs.DGAxiom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_AXIOM__ANNOTATION));
		printCountingMap.put("annotation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_AXIOM__DG_NODES));
		printCountingMap.put("dgNodes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_AXIOM__DG_EDGES));
		printCountingMap.put("dgEdges", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_AXIOM__MAIN_CLASSES));
		printCountingMap.put("mainClasses", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DescriptionGraph");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotation");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_AXIOM__ANNOTATION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("annotation",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dgNodes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_AXIOM__DG_NODES));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dgNodes", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dgEdges");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_AXIOM__DG_EDGES));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dgEdges", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("mainClasses");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_AXIOM__MAIN_CLASSES));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("mainClasses", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DGNodes(west.twouse.language.owl2fs.DGNodes element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_NODES__NODE_ASSERTION));
		printCountingMap.put("nodeAssertion", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Nodes");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("nodeAssertion");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_NODES__NODE_ASSERTION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("nodeAssertion",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_NodeAssertion(west.twouse.language.owl2fs.NodeAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NODE_ASSERTION__CLASS));
		printCountingMap.put("class", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NODE_ASSERTION__DG_NODE));
		printCountingMap.put("dgNode", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("NodeAssertion");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("class");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NODE_ASSERTION__CLASS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("class", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dgNode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.NODE_ASSERTION__DG_NODE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dgNode", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_DGEdges(west.twouse.language.owl2fs.DGEdges element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_EDGES__EDGE_ASSERTION));
		printCountingMap.put("edgeAssertion", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Edges");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("edgeAssertion");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.DG_EDGES__EDGE_ASSERTION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("edgeAssertion",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_EdgeAssertion(west.twouse.language.owl2fs.EdgeAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY));
		printCountingMap.put("objectProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EDGE_ASSERTION__DG_NODE1));
		printCountingMap.put("dgNode1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EDGE_ASSERTION__DG_NODE2));
		printCountingMap.put("dgNode2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("EdgeAssertion");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EDGE_ASSERTION__OBJECT_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dgNode1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EDGE_ASSERTION__DG_NODE1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dgNode1", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dgNode2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.EDGE_ASSERTION__DG_NODE2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dgNode2", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
	public void print_west_twouse_language_owl2fs_MainClasses(west.twouse.language.owl2fs.MainClasses element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.MAIN_CLASSES__CLASS));
		printCountingMap.put("class", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("MainClasses");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("class");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.owl2fs.Owl2fsPackage.MAIN_CLASSES__CLASS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("class",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (LineBreak):
		out.println();
		out.print(localtab);
	}
	
}
