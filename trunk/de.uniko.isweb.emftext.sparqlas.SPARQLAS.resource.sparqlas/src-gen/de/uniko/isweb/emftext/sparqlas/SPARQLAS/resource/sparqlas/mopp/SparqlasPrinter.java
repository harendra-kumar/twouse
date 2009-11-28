/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

public class SparqlasPrinter implements de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextPrinter {
	
	protected final static java.lang.String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	protected de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolverFactory tokenResolverFactory = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/** Holds the resource that is associated with this printer. may be null if the printer is used stand alone. */
	private de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource resource;
	private java.util.Map<?, ?> options;
	
	public SparqlasPrinter(java.io.OutputStream outputStream, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource resource) {
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
		
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument((de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition((de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query((de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable((de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable((de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class((de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype((de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty((de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual((de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual((de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal((de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses((de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf((de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses((de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion((de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual((de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals((de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties((de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf((de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty((de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom((de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty((de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty((de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty((de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty((de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue((de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI((de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI((de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration((de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration((de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration) {
			print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration((de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The cs printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasReferenceResolverSwitch getReferenceResolverSwitch() {
		return (de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasReferenceResolverSwitch) new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final java.lang.String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasProblem(errorMessage, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.SparqlasEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource getResource() {
		return resource;
	}
	
	/** Calls {@link #doPrint(EObject, String)} and writes the result to the underlying output stream. */
	public void print(org.eclipse.emf.ecore.EObject element)  {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element,out,"");
		out.flush();
		out.close();
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument(de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION));
		printCountingMap.put("prefixDefinition", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY));
		printCountingMap.put("query", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("prefixDefinition");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("prefixDefinition",0);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("query");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("query", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition(de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.PREFIX_DEFINITION__PREF));
		printCountingMap.put("pref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.PREFIX_DEFINITION__NAMESPACE));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.PREFIX_DEFINITION__PREF));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.PREFIX_DEFINITION__PREF), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.PREFIX_DEFINITION__NAMESPACE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("namespace", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query(de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.QUERY__QUERY_IRI));
		printCountingMap.put("queryIRI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.QUERY__ATOMS));
		printCountingMap.put("atoms", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Query");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("queryIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.QUERY__QUERY_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("queryIRI", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("atoms");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.QUERY__ATOMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("atoms",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_VARIABLE__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_VARIABLE__SYMBOL));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_VARIABLE__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_VARIABLE__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_VARIABLE__SYMBOL));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_VARIABLE__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable(de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_VARIABLE__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_VARIABLE__SYMBOL));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_VARIABLE__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable(de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INDIVIDUAL_VARIABLE__SYMBOL));
		printCountingMap.put("symbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("symbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INDIVIDUAL_VARIABLE__SYMBOL));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INDIVIDUAL_VARIABLE__SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("symbol", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class(de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS__CONSTANT_IRI));
		printCountingMap.put("constantIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constantIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS__CONSTANT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constantIRI", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype(de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATATYPE__CONSTANT_IRI));
		printCountingMap.put("constantIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constantIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATATYPE__CONSTANT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constantIRI", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI));
		printCountingMap.put("constantIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constantIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constantIRI", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty(de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY__CONSTANT_IRI));
		printCountingMap.put("constantIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constantIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY__CONSTANT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constantIRI", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual(de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.NAMED_INDIVIDUAL__CONSTANT_IRI));
		printCountingMap.put("constantIRI", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("constantIRI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.NAMED_INDIVIDUAL__CONSTANT_IRI));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constantIRI", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual(de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ANONYMOUS_INDIVIDUAL__NODE_ID));
		printCountingMap.put("nodeID", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("nodeID");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ANONYMOUS_INDIVIDUAL__NODE_ID));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("NODE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ANONYMOUS_INDIVIDUAL__NODE_ID), element));
				out.print(" ");
			}
			printCountingMap.put("nodeID", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal(de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.LITERAL__LEXICAL_FORM));
		printCountingMap.put("lexicalForm", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.LITERAL__DATATYPE));
		printCountingMap.put("datatype", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("lexicalForm");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.LITERAL__LEXICAL_FORM));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.LITERAL__LEXICAL_FORM), element));
				out.print(" ");
			}
			printCountingMap.put("lexicalForm", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("^^");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("datatype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.LITERAL__DATATYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("datatype", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses(de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS));
		printCountingMap.put("classExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("EquivalentClass");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS));
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
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
		printCountingMap.put("subClassExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
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
		count = printCountingMap.get("subClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_CLASS_OF__SUB_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subClassExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("superClassExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_CLASS_OF__SUPER_CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superClassExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses(de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DISJOINT_CLASSES__CLASS_EXPRESSIONS));
		printCountingMap.put("classExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DisjointWith");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DISJOINT_CLASSES__CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DISJOINT_CLASSES__CLASS_EXPRESSIONS));
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
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
		printCountingMap.put("targetIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("PropertyValue");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("targetIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion(de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
		printCountingMap.put("sourceIndividual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE));
		printCountingMap.put("targetValue", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("PropertyValue");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("sourceIndividual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceIndividual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("targetValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetValue", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_ASSERTION__INDIVIDUAL));
		printCountingMap.put("individual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_ASSERTION__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Type");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_ASSERTION__INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_ASSERTION__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS));
		printCountingMap.put("individuals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("SameAs");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individuals");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individuals");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS));
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
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals(de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DIFFERENT_INDIVIDUALS__INDIVIDUALS));
		printCountingMap.put("individuals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DifferentFrom");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individuals");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DIFFERENT_INDIVIDUALS__INDIVIDUALS));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individuals");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DIFFERENT_INDIVIDUALS__INDIVIDUALS));
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
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties(de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("EquivalentProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION));
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
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				java.lang.Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression",0);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("subObjectPropertyExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("superObjectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("SubPropertyOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("subObjectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("subObjectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("superObjectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("superObjectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty(de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY));
		printCountingMap.put("objectProperty", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("InverseOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectProperty");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectProperty", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom(de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION1));
		printCountingMap.put("objectPropertyExpression1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION2));
		printCountingMap.put("objectPropertyExpression2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("InverseOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression1", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression2", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty(de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Functional");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty(de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("InverseFunctional");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty(de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Transitive");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Symmetric");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
		printCountingMap.put("classExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("UnionOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS));
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
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ComplementOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_ONE_OF__INDIVIDUALS));
		printCountingMap.put("individuals", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("OneOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individuals");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_ONE_OF__INDIVIDUALS));
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
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
		printCountingMap.put("classExpressions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("IntersectionOf");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
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
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS));
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
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("All");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Some");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_HAS_VALUE__INDIVIDUAL));
		printCountingMap.put("individual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Has");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_HAS_VALUE__INDIVIDUAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individual", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Min");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Max");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__CARDINALITY));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(3);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY));
		printCountingMap.put("cardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION));
		printCountingMap.put("classExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
		printCountingMap.put("objectPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Exact");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("cardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), element));
				out.print(" ");
			}
			printCountingMap.put("cardinality", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue(de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(2);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_HAS_VALUE__LITERAL));
		printCountingMap.put("literal", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION));
		printCountingMap.put("dataPropertyExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Has");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("dataPropertyExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("dataPropertyExpression", count - 1);
		}
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("literal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_HAS_VALUE__LITERAL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("literal", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI(de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.FULL_IRI__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.FULL_IRI__ID));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("FULLIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.FULL_IRI__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI(de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI element, java.lang.String outertab, java.io.PrintWriter out) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ABBREVIATED_IRI__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken):
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ABBREVIATED_IRI__ID));
			if (o != null) {
				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver resolver = tokenResolverFactory.createTokenResolver("ABBRIRI");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((java.lang.Object) o, element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ABBREVIATED_IRI__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE));
		printCountingMap.put("objectPropertyVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("ObjectProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("objectPropertyVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("objectPropertyVariable", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration(de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE));
		printCountingMap.put("datatypePropertyVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("DatatypeProperty");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("datatypePropertyVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("datatypePropertyVariable", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration(de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE));
		printCountingMap.put("individualVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Individual");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("individualVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("individualVariable", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
	public void print_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration(de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration element, java.lang.String outertab, java.io.PrintWriter out) {
		java.lang.String localtab = outertab;
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.HashMap<java.lang.String, java.lang.Integer>(1);
		java.lang.Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE));
		printCountingMap.put("classVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("Class");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (CsString):
		out.print("(");
		out.print(" ");
		//////////////DEFINITION PART BEGINS (Containment):
		count = printCountingMap.get("classVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classVariable", count - 1);
		}
		//////////////DEFINITION PART BEGINS (CsString):
		out.print(")");
		out.print(" ");
	}
	
}
