/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

public class Owl2fsPrinter implements de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextPrinter {
	
	protected final static java.lang.String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	protected de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolverFactory tokenResolverFactory = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/** Holds the resource that is associated with this printer. may be null if the printer is used stand alone. */
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource resource;
	private java.util.Map<?, ?> options;
	
	public Owl2fsPrinter(java.io.OutputStream outputStream, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource resource) {
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
		
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.URI) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_URI((de.uniko.isweb.emftext.owl2fs.owl2fs.URI) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_FullURI((de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_AbbreviatedURI((de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_OntologyDocument((de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_PrefixDefinition((de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_Ontology((de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_Declaration((de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.Class) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_Class((de.uniko.isweb.emftext.owl2fs.owl2fs.Class) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_Datatype((de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual((de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_AnonymousIndividual((de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.Literal) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_Literal((de.uniko.isweb.emftext.owl2fs.owl2fs.Literal) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseObjectProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataComplementOf((de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataOneOf((de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DatatypeRestriction((de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_FacetConstantPair((de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectIntersectionOf((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectUnionOf((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectComplementOf((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectOneOf((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectSomeValuesFrom((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectAllValuesFrom((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectHasValue((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectExistsSelf((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectMinCardinality((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectMaxCardinality((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectExactCardinality((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataSomeValuesFrom((de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataAllValuesFrom((de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataHasValue((de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataMinCardinality((de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataMaxCardinality((de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataExactCardinality((de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_SubClassOf((de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentClasses((de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointClasses((de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointUnion((de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_SubObjectPropertyOf((de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentObjectProperties((de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointObjectProperties((de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyDomain((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyRange((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseObjectProperties((de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_FunctionalObjectProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseFunctionalObjectProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ReflexiveObjectProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_IrreflexiveObjectProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_SymmetricObjectProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_AsymmetricObjectProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_TransitiveObjectProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_SubDataPropertyOf((de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentDataProperties((de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointDataProperties((de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyDomain((de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyRange((de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_FunctionalDataProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_KeyFor((de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_SameIndividual((de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DifferentIndividuals((de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassAssertion((de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyAssertion((de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_NegativeObjectPropertyAssertion((de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyAssertion((de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_NegativeDataPropertyAssertion((de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation((de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_AnnotationProperty((de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation) {
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_EntityAnnotation((de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The cs printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsReferenceResolverSwitch getReferenceResolverSwitch() {
		return (de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsReferenceResolverSwitch) new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final java.lang.String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsProblem(errorMessage, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.Owl2fsEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource getResource() {
		return resource;
	}
	
	/** Calls {@link #doPrint(EObject, String)} and writes the result to the underlying output stream. */
	public void print(org.eclipse.emf.ecore.EObject element)  {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_URI(de.uniko.isweb.emftext.owl2fs.owl2fs.URI element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.URI__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.URI__VALUE));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("DIRTYIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.URI__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_FullURI(de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FULL_URI__IRI));
		printCountingMap.put("iri", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("iri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FULL_URI__IRI));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("FULLIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FULL_URI__IRI), element));
				out.print(" ");
			}
			printCountingMap.put("iri", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_AbbreviatedURI(de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ABBREVIATED_URI__LOCAL_NAME));
		printCountingMap.put("localName", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("AbbreviatedURI");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("{");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_AbbreviatedURI_0(element, localtab, out1, printCountingMap1);
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
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("}");
		out.print(" ");
	}
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_AbbreviatedURI_0(de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("localName");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(":");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderInQuotes):
		count = printCountingMap.get("localName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ABBREVIATED_URI__LOCAL_NAME));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ABBREVIATED_URI__LOCAL_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("localName", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_OntologyDocument(de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__ONTOLOGY));
		printCountingMap.put("ontology", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION));
		printCountingMap.put("PrefixDefinition", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_de_uniko_isweb_emftext_owl2fs_owl2fs_OntologyDocument_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_OntologyDocument_0(element, localtab, out1, printCountingMap1);
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__ONTOLOGY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ontology", count - 1);
		}
	}
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_OntologyDocument_0(de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("PrefixDefinition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION));
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
			printCountingMap.put("PrefixDefinition", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_PrefixDefinition(de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__PREF));
		printCountingMap.put("pref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE));
		printCountingMap.put("namespace", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Namespace");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("pref");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__PREF));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("DIRTYIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__PREF), element));
				out.print(" ");
			}
			printCountingMap.put("pref", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("=");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("namespace");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("namespace", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_Ontology(de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(7);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS));
		printCountingMap.put("ontologyAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__AXIOMS));
		printCountingMap.put("axioms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__IMPORTED_ONTOLOGIES));
		printCountingMap.put("importedOntologies", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__EXPRESSIONS));
		printCountingMap.put("expressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI));
		printCountingMap.put("ontologyURI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__VERSION_URI));
		printCountingMap.put("versionURI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__PACKAGES));
		printCountingMap.put("packages", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.HashMap<java.lang.String, java.lang.Integer> printCountingMap1 = null;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Ontology");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("ontologyURI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("FULLIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI), element));
				out.print(" ");
			}
			printCountingMap.put("ontologyURI", count - 1);
		}
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("versionURI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__VERSION_URI));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("DIRTYIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__VERSION_URI), element));
				out.print(" ");
			}
			printCountingMap.put("versionURI", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.HashMap<java.lang.String, java.lang.Integer>(printCountingMap);
			print_de_uniko_isweb_emftext_owl2fs_owl2fs_Ontology_0(element, localtab, out1, printCountingMap1);
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
		count = printCountingMap.get("ontologyAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ontologyAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axioms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__AXIOMS));
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
	}
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_Ontology_0(de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		java.lang.String localtab = outertab;
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Import");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("importedOntologies");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__IMPORTED_ONTOLOGIES));
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
			printCountingMap.put("importedOntologies", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_Declaration(de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(9);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__ENTITY));
		printCountingMap.put("entity", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__IS_FUNCTIONAL));
		printCountingMap.put("isFunctional", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__IS_REFLEXIVE));
		printCountingMap.put("isReflexive", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__IS_INVERSE_FUNCTIONAL));
		printCountingMap.put("isInverseFunctional", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__IS_IRREFLEXIVE));
		printCountingMap.put("isIrreflexive", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__IS_SYMMETRIC));
		printCountingMap.put("isSymmetric", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__IS_TRANSITIVE));
		printCountingMap.put("isTransitive", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__IS_ASYSMMETRIC));
		printCountingMap.put("isAsysmmetric", temp == null ? 0 : 1);
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__AXIOM_ANNOTATIONS));
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
		count = printCountingMap.get("entity");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__ENTITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entity", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_Class(de.uniko.isweb.emftext.owl2fs.owl2fs.Class element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS__ENTITY_URI));
		printCountingMap.put("entityURI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS__OWNING_TEMPLATE_PARAMETER));
		printCountingMap.put("owningTemplateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityURI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS__ENTITY_URI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityURI", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_Datatype(de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE__ARITY));
		printCountingMap.put("arity", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE__ENTITY_URI));
		printCountingMap.put("entityURI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE__DATA_TYPE));
		printCountingMap.put("dataType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("dataType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE__DATA_TYPE));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("DIRTYIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE__DATA_TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("dataType", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(10);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__ENTITY_URI));
		printCountingMap.put("entityURI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__IS_FUNCTIONAL));
		printCountingMap.put("isFunctional", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__IS_REFLEXIVE));
		printCountingMap.put("isReflexive", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL));
		printCountingMap.put("isInverseFunctional", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__IS_IRREFLEXIVE));
		printCountingMap.put("isIrreflexive", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__IS_SYMMETRIC));
		printCountingMap.put("isSymmetric", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__IS_TRANSITIVE));
		printCountingMap.put("isTransitive", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__IS_ASYSMMETRIC));
		printCountingMap.put("isAsysmmetric", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__OWNING_TEMPLATE_PARAMETER));
		printCountingMap.put("owningTemplateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityURI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__ENTITY_URI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityURI", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY__ENTITY_URI));
		printCountingMap.put("entityURI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY__OWNING_TEMPLATE_PARAMETER));
		printCountingMap.put("owningTemplateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityURI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY__ENTITY_URI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityURI", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual(de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL__ENTITY_URI));
		printCountingMap.put("entityURI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL__OWNING_TEMPLATE_PARAMETER));
		printCountingMap.put("owningTemplateParameter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL__TEMPLATE_PARAMETER));
		printCountingMap.put("templateParameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityURI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL__ENTITY_URI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityURI", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_AnonymousIndividual(de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID));
		printCountingMap.put("nodeID", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("nodeID");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("NODE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID), element));
				out.print(" ");
			}
			printCountingMap.put("nodeID", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_Literal(de.uniko.isweb.emftext.owl2fs.owl2fs.Literal element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.LITERAL__LEXICAL_VALUE));
		printCountingMap.put("lexicalValue", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.LITERAL__DATATYPE));
		printCountingMap.put("datatype", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("lexicalValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.LITERAL__LEXICAL_VALUE));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.LITERAL__LEXICAL_VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("lexicalValue", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("^^");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("datatype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.LITERAL__DATATYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("datatype", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseObjectProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(8);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__IS_FUNCTIONAL));
		printCountingMap.put("isFunctional", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__IS_REFLEXIVE));
		printCountingMap.put("isReflexive", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__IS_INVERSE_FUNCTIONAL));
		printCountingMap.put("isInverseFunctional", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__IS_IRREFLEXIVE));
		printCountingMap.put("isIrreflexive", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__IS_SYMMETRIC));
		printCountingMap.put("isSymmetric", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__IS_TRANSITIVE));
		printCountingMap.put("isTransitive", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__IS_ASYSMMETRIC));
		printCountingMap.put("isAsysmmetric", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataComplementOf(de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_COMPLEMENT_OF__ARITY));
		printCountingMap.put("arity", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_COMPLEMENT_OF__DATA_RANGE));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_COMPLEMENT_OF__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataOneOf(de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_ONE_OF__ARITY));
		printCountingMap.put("arity", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_ONE_OF__CONSTANTS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_ONE_OF__CONSTANTS));
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
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DatatypeRestriction(de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__ARITY));
		printCountingMap.put("arity", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__DATATYPE));
		printCountingMap.put("datatype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__RESTRICTIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__DATATYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("datatype", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("restrictions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__RESTRICTIONS));
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
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_FacetConstantPair(de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FACET_CONSTANT_PAIR__CONSTANT));
		printCountingMap.put("constant", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FACET_CONSTANT_PAIR__FACET));
		printCountingMap.put("facet", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("facet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FACET_CONSTANT_PAIR__FACET));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("DIRTYIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FACET_CONSTANT_PAIR__FACET), element));
				out.print(" ");
			}
			printCountingMap.put("facet", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constant");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FACET_CONSTANT_PAIR__CONSTANT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constant", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectIntersectionOf(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
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
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectUnionOf(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
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
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectComplementOf(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectOneOf(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_ONE_OF__INDIVIDUALS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_ONE_OF__INDIVIDUALS));
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
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectSomeValuesFrom(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectAllValuesFrom(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectHasValue(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectExistsSelf(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXISTS_SELF__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectExistsSelf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXISTS_SELF__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectMinCardinality(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CARDINALITY));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectMaxCardinality(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CARDINALITY));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectExactCardinality(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataSomeValuesFrom(de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
		printCountingMap.put("dataPropertyExpressions", temp == null ? 0 : 1);
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpressions", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataAllValuesFrom(de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
		printCountingMap.put("dataPropertyExpressions", temp == null ? 0 : 1);
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpressions", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataHasValue(de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__CONSTANT));
		printCountingMap.put("constant", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constant");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__CONSTANT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constant", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataMinCardinality(de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__CARDINALITY));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataMaxCardinality(de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__CARDINALITY));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataExactCardinality(de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__DATA_RANGE));
		printCountingMap.put("dataRange", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__CARDINALITY));
			if (o != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__DATA_RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataRange", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_SubClassOf(de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_CLASS_OF__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
		printCountingMap.put("subClassExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_CLASS_OF__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subClassExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("superClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superClassExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentClasses(de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS));
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
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointClasses(de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS));
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
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointUnion(de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__UNION_CLASS));
		printCountingMap.put("unionClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__UNION_CLASS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("unionClass", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("disjointClassExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS));
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
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_SubObjectPropertyOf(de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("superObjectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS));
		printCountingMap.put("subObjectPropertyExpressions", temp == null ? 0 : 1);
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__AXIOM_ANNOTATIONS));
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
		count = printCountingMap.get("subObjectPropertyExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subObjectPropertyExpressions", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("superObjectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superObjectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentObjectProperties(de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
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
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointObjectProperties(de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS));
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
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyDomain(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN));
		printCountingMap.put("domain", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("domain");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("domain", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyRange(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__RANGE));
		printCountingMap.put("range", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("range");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("range", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseObjectProperties(de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION1));
		printCountingMap.put("ObjectPropertyExpression1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION2));
		printCountingMap.put("ObjectPropertyExpression2", temp == null ? 0 : 1);
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS));
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
		count = printCountingMap.get("ObjectPropertyExpression1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ObjectPropertyExpression1", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("ObjectPropertyExpression2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("ObjectPropertyExpression2", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_FunctionalObjectProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseFunctionalObjectProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ReflexiveObjectProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_IrreflexiveObjectProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_SymmetricObjectProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_AsymmetricObjectProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("AsymmetricObjectProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_TransitiveObjectProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_SubDataPropertyOf(de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("superDataPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subDataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("superDataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superDataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentDataProperties(de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
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
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointDataProperties(de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS));
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
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyDomain(de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__DOMAIN));
		printCountingMap.put("domain", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("domain");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__DOMAIN));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("domain", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyRange(de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__RANGE));
		printCountingMap.put("range", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("range");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__RANGE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("range", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_FunctionalDataProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_KeyFor(de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__DATA_PROPERTY_EXPRESSIONS));
		printCountingMap.put("dataPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS));
		printCountingMap.put("objectPropertyExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("KeyFor");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("axiomAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpressions");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__DATA_PROPERTY_EXPRESSIONS));
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
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_SameIndividual(de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS));
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
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DifferentIndividuals(de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS));
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
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassAssertion(de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL));
		printCountingMap.put("individual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS_ASSERTION__AXIOM_ANNOTATIONS));
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
		count = printCountingMap.get("individual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyAssertion(de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("targetIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_NegativeObjectPropertyAssertion(de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("targetIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyAssertion(de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE));
		printCountingMap.put("targetValue", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("targetValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetValue", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_NegativeDataPropertyAssertion(de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(4);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE));
		printCountingMap.put("targetValue", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("targetValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetValue", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation(de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANNOTATION__ANNOTATION_PROPERTY));
		printCountingMap.put("annotationProperty", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("annotationProperty");
		if (count > 0) {
			java.lang.Object o =element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANNOTATION__ANNOTATION_PROPERTY));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("annotationProperty",count-1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation_0(de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("Comment");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("Label");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("Annotation");
			out.print(" ");
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_AnnotationProperty(de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY__ENTITY_URI));
		printCountingMap.put("entityURI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityURI");
		if (count > 0) {
			java.lang.Object o =element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY__ENTITY_URI));
			doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			printCountingMap.put("entityURI",count-1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_EntityAnnotation(de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ENTITY_ANNOTATION__AXIOM_ANNOTATIONS));
		printCountingMap.put("axiomAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ENTITY_ANNOTATION__ENTITY));
		printCountingMap.put("entity", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS));
		printCountingMap.put("entityAnnotations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("EntityAnnotation");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CompoundDefinition):
		print_de_uniko_isweb_emftext_owl2fs_owl2fs_EntityAnnotation_0(element, localtab, out, printCountingMap);
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entity");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ENTITY_ANNOTATION__ENTITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entity", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("entityAnnotations");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("entityAnnotations",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	public void print_de_uniko_isweb_emftext_owl2fs_owl2fs_EntityAnnotation_0(de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation element, java.lang.String outertab, java.io.PrintWriter out, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap){
		int alt = -1;
		alt=0;
		int matches=		0;
		int tempMatchCount;
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 3;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 4;
			matches = tempMatchCount;
		}
		tempMatchCount=		0;
		if (tempMatchCount > matches) {
			alt = 5;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("Datatype");
				out.print(" ");
			}
			break;
			case 2:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("ObjectProperty");
				out.print(" ");
			}
			break;
			case 3:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("Class");
				out.print(" ");
			}
			break;
			case 4:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("NamedIndividual");
				out.print(" ");
			}
			break;
			case 5:			{
				//////////////DEFINITION PART BEGINS (CsString):
				out.print("DataProperty");
				out.print(" ");
			}
			break;
			default:			//////////////DEFINITION PART BEGINS (CsString):
			out.print("AnnotationProperty");
			out.print(" ");
		}
	}
	
}
