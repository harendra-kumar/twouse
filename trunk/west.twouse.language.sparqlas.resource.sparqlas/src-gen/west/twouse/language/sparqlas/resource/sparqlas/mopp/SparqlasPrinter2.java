/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasPrinter2 implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextPrinter {
	
	private class PrintToken {
		
		private String text;
		private String tokenName;
		
		public PrintToken(String text, String tokenName) {
			this.text = text;
			this.tokenName = tokenName;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
	}
	
	public final static java.lang.String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource resource;
	
	private java.util.Map<?, ?> options;
	private java.io.OutputStream outputStream;
	private java.util.List<PrintToken> tokenOutputStream;
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolverFactory tokenResolverFactory = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = false;
	private int tokenSpace = 1;
	/**
	 * A flag that indicates whether token have already been printed for the some
	 * object. The flag is set to false whenever printing of an EObject tree is
	 * started. The status of the flag is used to avoid printing default token space
	 * in front of the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters the were printed before the current line. This
	 * number is used to calculate the relative indendation when printing contained
	 * objects.
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indendation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	private int newTabsBeforeCurrentObject;
	
	public SparqlasPrinter2(java.io.OutputStream outputStream, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		tokenOutputStream = new java.util.ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		doPrint(element, new java.util.ArrayList<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement>());
		java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof west.twouse.language.sparqlas.FullIRI) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_0, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.AbbreviatedIRI) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_1, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.OntologyDocument) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_2, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.Import) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_3, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.PrefixDefinition) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_4, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SelectQuery) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_5, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ConstructQuery) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_6, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.AskQuery) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_7, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DescribeQuery) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_8, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.LiteralVariable) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_10, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ClassVariable) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_11, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyVariable) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_12, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataPropertyVariable) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_13, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.IndividualVariable) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_14, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.Class) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_15, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.Datatype) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_16, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_17, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_18, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.NamedIndividual) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_19, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.AnonymousIndividual) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_20, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.Literal) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_21, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ClassAssertion) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_22, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyAssertion) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_23, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataPropertyAssertion) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_24, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.NegativeObjectPropertyAssertion) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_25, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.NegativeDataPropertyAssertion) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_26, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SameIndividual) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_27, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DifferentIndividuals) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_28, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SubClassOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_29, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.EquivalentClasses) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_30, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DisjointClasses) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_31, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DisjointUnion) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_32, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectUnionOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_33, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectComplementOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_34, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectOneOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_35, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectIntersectionOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_36, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectAllValuesFrom) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_37, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectSomeValuesFrom) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_38, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectHasValue) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_39, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectMinCardinality) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_40, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectMaxCardinality) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_41, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectExactCardinality) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_42, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataAllValuesFrom) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_43, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataSomeValuesFrom) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_44, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataHasValue) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_45, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataMinCardinality) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_46, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataMaxCardinality) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_47, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataExactCardinality) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_48, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataUnionOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_49, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataComplementOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_50, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataOneOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_51, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataIntersectionOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_52, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DatatypeRestriction) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_53, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.FacetRestriction) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_54, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SubObjectPropertyOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_55, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.EquivalentObjectProperties) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_56, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DisjointObjectProperties) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_57, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyDomain) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_58, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyRange) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_59, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.InverseObjectPropertyAtom) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_60, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.FunctionalObjectProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_61, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.InverseFunctionalObjectProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_62, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ReflexiveObjectProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_63, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.IrreflexiveObjectProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_64, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SymmetricObjectProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_65, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.AsymmetricObjectProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_66, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.TransitiveObjectProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_67, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.SubDataPropertyOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_68, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.EquivalentDataProperties) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_69, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DisjointDataProperties) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_70, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataPropertyDomain) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_71, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DataPropertyRange) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_72, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.FunctionalDataProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_73, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.InverseObjectProperty) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_74, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyChain) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_75, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.HasKey) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_76, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ClassDeclaration) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_77, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.ObjectPropertyDeclaration) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_78, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DatatypePropertyDeclaration) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_79, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.IndividualDeclaration) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_80, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.TemplateSignature) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_81, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.TemplateParameter) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_82, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.TemplateBinding) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_83, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.TemplateParameterSubstitution) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_84, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DirectClassAssertion) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_85, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.DirectSubClassOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_86, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.StrictSubClassOf) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_87, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.sparqlas.Variable) {
			printInternal(element, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.SPARQLAS_9, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(org.eclipse.emf.ecore.EObject eObject, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement ruleElement, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement> foundFormattingElements) {
		west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation> layoutInformations = new java.util.ArrayList<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator getDecoratorTree(west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement syntaxElement) {
		west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator[] childDecorators = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator decorator = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject) {
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = initializePrintCountingMap(eObject);
		java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator> keywordsToPrint = new java.util.ArrayList<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference holded by
	 * eObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement syntaxElement = decorator.getDecoratedElement();
		west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator> subKeywordsToPrint = new java.util.ArrayList<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasTerminal) {
				west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasTerminal terminal = (west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasTerminal) syntaxElement;
				org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
				if (feature == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				int countLeft = printCountingMap.get(feature.getName());
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					decorator.addIndexToPrint(countLeft);
					printCountingMap.put(feature.getName(), countLeft - 1);
					keepDecorating = true;
				}
			}
			if (syntaxElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasChoice) {
				// for choices we do print only the choice which does print at least one feature
				west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator childToPrint = null;
				for (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality.STAR || cardinality == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality.ONE || cardinality == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference holded by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<java.lang.String, java.lang.Integer> printCountingMap) {
		west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasTerminal) {
			west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasTerminal terminal = (west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasTerminal) syntaxElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			if (feature == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.get(feature.getName());
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation> layoutInformations) {
		west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement printElement = decorator.getDecoratedElement();
		west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality cardinality = printElement.getCardinality();
		java.util.List<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement> cloned = new java.util.ArrayList<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			java.lang.Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasKeyword) {
					printKeyword(eObject, (west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasPlaceholder) {
					west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasPlaceholder placeholder = (west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasContainment) {
					west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasContainment containment = (west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasWhiteSpace) {
				foundFormattingElements.add((west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasWhiteSpace) printElement);
			}
			if (printElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasLineBreak) {
				foundFormattingElements.add((west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasLineBreak) printElement);
			}
			for (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasChoice) {
					break;
				}
			}
			if (cardinality == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality.ONE || cardinality == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality.STAR || cardinality == west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(org.eclipse.emf.ecore.EObject eObject, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasKeyword keyword, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation> layoutInformations) {
		west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasStringUtil.escapeToANTLRKeyword(value) + "'"));
	}
	
	public void printFeature(org.eclipse.emf.ecore.EObject eObject, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasPlaceholder placeholder, int count, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
			printAttribute(eObject, (org.eclipse.emf.ecore.EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (org.eclipse.emf.ecore.EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EAttribute attribute, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasPlaceholder placeholder, int count, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation> layoutInformations) {
		java.lang.String result;
		java.lang.Object attributeValue = getValue(eObject, attribute, count);
		west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		java.lang.String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			java.lang.String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		}
		// write result to the output stream
		tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName()));
	}
	
	public void printContainedObject(org.eclipse.emf.ecore.EObject eObject, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasContainment containment, int count, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature reference = containment.getFeature();
		java.lang.Object o = getValue(eObject, reference, count);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		newTabsBeforeCurrentObject = tabsBeforeCurrentObject + currentTabs;
		currentTabs = 0;
		doPrint((org.eclipse.emf.ecore.EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(java.util.List<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation> layoutInformations, west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation layoutInformation) {
		java.lang.String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			layoutInformations.remove(layoutInformation);
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			tabsBeforeCurrentObject = newTabsBeforeCurrentObject;
			return;
		}
		if (foundFormattingElements.size() > 0) {
			for (west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasWhiteSpace) {
					int amount = ((west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(new PrintToken(" ", null));
					}
				}
				if (foundFormattingElement instanceof west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasLineBreak) {
					currentTabs = ((west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasLineBreak) foundFormattingElement).getTabs();
					tokenOutputStream.add(new PrintToken(NEW_LINE, null));
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(new PrintToken("\t", null));
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		tabsBeforeCurrentObject = newTabsBeforeCurrentObject;
	}
	
	private Object getValue(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EStructuralFeature feature, int count) {
		// get value of feature
		java.lang.Object o = eObject.eGet(feature);
		if (o instanceof java.util.List<?>) {
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			o = list.get(index);
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")	
	public void printReference(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EReference reference, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasPlaceholder placeholder, int count, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation> layoutInformations) {
		java.lang.Object referencedObject = getValue(eObject, reference, count);
		west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		// NC-References must always be printed by deresolving the reference. We cannot
		// use the visible token information, because deresolving usually depends on
		// attribute values of the referenced object instead of the object itself.
		String tokenName = placeholder.getTokenName();
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		@SuppressWarnings("rawtypes")		
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
		referenceResolver.setOptions(getOptions());
		java.lang.String deresolvedReference = referenceResolver.deResolve((org.eclipse.emf.ecore.EObject) referencedObject, eObject, reference);
		java.lang.String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName));
	}
	
	public java.util.Map<java.lang.String, java.lang.Integer> initializePrintCountingMap(org.eclipse.emf.ecore.EObject eObject) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<java.lang.String, java.lang.Integer> printCountingMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
		java.util.List<org.eclipse.emf.ecore.EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (org.eclipse.emf.ecore.EStructuralFeature feature : features) {
			int count = 0;
			java.lang.Object featureValue = eObject.eGet(feature);
			if (featureValue != null) {
				if (featureValue instanceof java.util.List<?>) {
					count = ((java.util.List<?>) featureValue).size();
				} else {
					count = 1;
				}
			}
			printCountingMap.put(feature.getName(), count);
		}
		return printCountingMap;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource getResource() {
		return resource;
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
	
	protected west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformationAdapter) {
				return (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformationAdapter) adapter;
			}
		}
		west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformationAdapter newAdapter = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation getLayoutInformation(java.util.List<west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation> layoutInformations, west.twouse.language.sparqlas.resource.sparqlas.grammar.SparqlasSyntaxElement syntaxElement, java.lang.Object object, org.eclipse.emf.ecore.EObject container) {
		for (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				} else if (object == layoutInformation.getObject(container)) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	private java.lang.String getHiddenTokenText(west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private java.lang.String getVisibleTokenText(west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(java.io.PrintWriter writer) throws java.io.IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer.
	 * 
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * 
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 */
	public void printSmart(java.io.PrintWriter writer) throws java.io.IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				writer.write(currentBlock.toString());
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextScanner scanner = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			java.util.List<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextToken> tempTokens = new java.util.ArrayList<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextToken>();
			west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				writer.write(validBlock);
				// print separating whitespace
				writer.write(" ");
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
}
