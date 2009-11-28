// $ANTLR 3.1.1

	package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;


import org.antlr.runtime.*;
import java.util.HashMap;
public class SparqlasParser extends SparqlasANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "VARIABLE", "NODE", "LITERAL", "INTEGER", "FULLIRI", "ABBRIRI", "WHITESPACE", "LINEBREAKS", "COMMENT", "FLOAT", "'Namespace'", "'('", "'='", "')'", "'Query'", "'^^'", "'EquivalentClass'", "'SubClassOf'", "'DisjointWith'", "'PropertyValue'", "'Type'", "'SameAs'", "'DifferentFrom'", "'EquivalentProperty'", "'SubPropertyOf'", "'InverseOf'", "'Functional'", "'InverseFunctional'", "'Transitive'", "'Symmetric'", "'UnionOf'", "'ComplementOf'", "'OneOf'", "'IntersectionOf'", "'All'", "'Some'", "'Has'", "'Min'", "'Max'", "'Exact'", "'ObjectProperty'", "'DatatypeProperty'", "'Individual'", "'Class'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int FLOAT=14;
    public static final int LINEBREAKS=12;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int ABBRIRI=10;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int COMMENT=13;
    public static final int T__42=42;
    public static final int INTEGER=8;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int NODE=6;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int WHITESPACE=11;
    public static final int LITERAL=7;
    public static final int FULLIRI=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int VARIABLE=5;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=4;

    // delegates
    // delegators


        public SparqlasParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SparqlasParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[105+1];
             
             
        }
        

    public String[] getTokenNames() { return SparqlasParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g"; }


    	private de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolverFactory tokenResolverFactory = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTokenResolverFactory();
    	@SuppressWarnings("unused")
    	
    	private int lastPosition;
    	private de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTokenResolveResult tokenResolveResult = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTokenResolveResult();
    	private boolean rememberExpectedElements = false;
    	private java.lang.Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	private boolean reachedIndex = false;
    	private java.util.List<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement> expectedElements = new java.util.ArrayList<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement>();
    	private int mismatchedTokenRecoveryTries = 0;
    	private java.util.Map<?, ?> options;
    	//helper lists to allow a lexer to pass errors to its parser
    	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
    	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private java.util.Collection<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasCommand<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource>> postParseCommands;
    	private boolean terminateParsing;
    	
    	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasCommand<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource>() {
    			public boolean execute(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				resource.addProblem(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasProblem() {
    					public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.SparqlasEProblemType getType() {
    						return de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.SparqlasEProblemType.ERROR;
    					}
    					public java.lang.String getMessage() {
    						return errorMessage;
    					}
    				}, line, charPositionInLine, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement expectedElement, java.lang.String message) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		if (this.reachedIndex) {
    			return;
    		}
    		int currentIndex = java.lang.Math.max(0, input.index());
    		//System.out.println("addExpectedElement() currentIndex = " + currentIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			//System.out.println("addExpectedElement() index = " + index);
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime.CommonToken tokenAtIndex = (org.antlr.runtime.CommonToken) input.get(index);
    			//System.out.println("addExpectedElement() tokenAtIndex = " + tokenAtIndex);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = java.lang.Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    		System.out.println("Adding expected element (" + message + "): " + expectedElement + "");
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasDummyEObject dummy) {
    		java.lang.Object value = element.eGet(structuralFeature);
    		java.lang.Object mapKey = dummy.getValueByName("key");
    		java.lang.Object mapValue = dummy.getValueByName("value");
    		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
    			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.util.SparqlasMapUtil.castToEMap(value);
    			if (mapKey != null && mapValue != null) {
    				valueMap.put(mapKey, mapValue);
    			}
    		}
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	private boolean addObjectToList(org.eclipse.emf.ecore.EObject element, int featureID, java.lang.Object proxy) {
    		return ((java.util.List<java.lang.Object>) element.eGet(element.eClass().getEStructuralFeature(featureID))).add(proxy);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
    		org.eclipse.emf.ecore.EObject currentTarget = target;
    		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
    			assert(object instanceof de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasDummyEObject);
    			de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasDummyEObject dummy = (de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasDummyEObject) object;
    			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
    			currentTarget = newEObject;
    		}
    		return currentTarget;
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasCommand<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource>() {
    			public boolean execute(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasLocationMap locationMap = resource.getLocationMap();
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasCommand<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource>() {
    			public boolean execute(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasLocationMap locationMap = resource.getLocationMap();
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
    		try {
    			if (encoding == null) {
    				return new SparqlasParser(new org.antlr.runtime.CommonTokenStream(new SparqlasLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new SparqlasParser(new org.antlr.runtime.CommonTokenStream(new SparqlasLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	// This default constructor is only used to call createInstance() on it
    	public SparqlasParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime.RecognitionException {
    		this.lastPosition = 0;
    		((SparqlasLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((SparqlasLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		java.lang.Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration();
    			}
    		}
    		throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasUnexpectedContentTypeException(typeObject);
    	}
    	
    	private de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTokenResolveResult getFreshTokenResolveResult() {
    		tokenResolveResult.clear();
    		return tokenResolveResult;
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public java.lang.Object getMissingSymbol(org.antlr.runtime.IntStream arg0, org.antlr.runtime.RecognitionException arg1, int arg2, org.antlr.runtime.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	protected java.util.Map<?,?> getOptions() {
    		return options;
    	}
    	
    	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasMetaInformation getMetaInformation() {
    		return new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasMetaInformation();
    	}
    	
    	public java.lang.Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasReferenceResolverSwitch getReferenceResolverSwitch() {
    		return (de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
    	}
    	
    	protected java.lang.Object getTypeObject() {
    		java.lang.Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	// Implementation that calls {@link #doParse()}  and handles the thrown
    	// RecognitionExceptions.
    	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasCommand<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource>>();
    		de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasParseResult parseResult = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				//? can be caused if a null is set on EMF models where not allowed;
    				//? this will just happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement> parseToExpectedElements(org.eclipse.emf.ecore.EClass type) {
    		rememberExpectedElements = true;
    		parseToIndexTypeObject = type;
    		parse();
    		return this.expectedElements;
    	}
    	
    	public java.lang.Object recoverFromMismatchedToken(org.antlr.runtime.IntStream input, int ttype, org.antlr.runtime.BitSet follow) throws org.antlr.runtime.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
    		postParseCommands.add(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasCommand<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource>() {
    			public boolean execute(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				resource.registerContextDependentProxy(factory, element, reference, id, proxy);
    				return true;
    			}
    		});
    	}
    	
    	// Translates errors thrown by the parser into human readable messages.
    	public void reportError(final org.antlr.runtime.RecognitionException e)  {
    		java.lang.String message = e.getMessage();
    		if (e instanceof org.antlr.runtime.MismatchedTokenException) {
    			org.antlr.runtime.MismatchedTokenException mte = (org.antlr.runtime.MismatchedTokenException) e;
    			java.lang.String tokenName = "<unknown>";
    			if (mte.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mte.expecting];
    				tokenName = de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.util.SparqlasStringUtil.formatTokenName(tokenName);
    			}
    			message = "Syntax error on token \"" + e.token.getText() + "\", \"" + tokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime.MismatchedTreeNodeException) {
    			org.antlr.runtime.MismatchedTreeNodeException mtne = (org.antlr.runtime.MismatchedTreeNodeException) e;
    			java.lang.String tokenName = "<unknown>";
    			if (mtne.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mtne.expecting];
    			}
    			message = "mismatched tree node: "+"xxx" +"; expecting " + tokenName;
    		} else if (e instanceof org.antlr.runtime.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime.MismatchedSetException) {
    			org.antlr.runtime.MismatchedSetException mse = (org.antlr.runtime.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.MismatchedNotSetException) {
    			org.antlr.runtime.MismatchedNotSetException mse = (org.antlr.runtime.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.FailedPredicateException) {
    			org.antlr.runtime.FailedPredicateException fpe = (org.antlr.runtime.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText+"}?";
    		}
    		// the resource may be null if the parse is used for code completion
    		final java.lang.String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime.CommonToken) {
    			final org.antlr.runtime.CommonToken ct = (org.antlr.runtime.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	// Translates errors thrown by the lexer into human readable messages.
    	public void reportLexicalError(final org.antlr.runtime.RecognitionException e)  {
    		java.lang.String message = "";
    		if (e instanceof org.antlr.runtime.MismatchedTokenException) {
    			org.antlr.runtime.MismatchedTokenException mte = (org.antlr.runtime.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime.EarlyExitException) {
    			org.antlr.runtime.EarlyExitException eee = (org.antlr.runtime.EarlyExitException) e;
    			message ="required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime.MismatchedSetException) {
    			org.antlr.runtime.MismatchedSetException mse = (org.antlr.runtime.MismatchedSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.MismatchedNotSetException) {
    			org.antlr.runtime.MismatchedNotSetException mse = (org.antlr.runtime.MismatchedNotSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime.MismatchedRangeException) {
    			org.antlr.runtime.MismatchedRangeException mre = (org.antlr.runtime.MismatchedRangeException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime.FailedPredicateException) {
    			org.antlr.runtime.FailedPredicateException fpe = (org.antlr.runtime.FailedPredicateException) e;
    			message ="rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.index, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	public void setOptions(java.util.Map<?,?> options) {
    		this.options = options;
    	}
    	
    	public void terminate() {
    		terminateParsing = true;
    	}



    // $ANTLR start "start"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:515:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:516:1: ( (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument ) EOF )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:517:2: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument ) EOF
            {
            if ( state.backtracking==0 ) {

              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:519:2: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:520:3: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument
            {
            if ( state.backtracking==0 ) {

              		
            }
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument_in_start86);
            c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start93); if (state.failed) return element;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:527:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument element = null] : ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition ) )* (a1_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition a0_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:530:1: ( ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition ) )* (a1_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:531:2: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition ) )* (a1_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query )
            {
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:534:2: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:535:3: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Terminal
            	      		
            	    }
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:538:3: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition )
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:539:4: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument132);
            	    a0_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createOntologyDocument();
            	      				}
            	      				if (a0_0 != null) {
            	      					if (a0_0 != null) {
            	      						addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION, a0_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a0_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:562:2: (a1_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:563:3: a1_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument165);
            a1_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createOntologyDocument();
              			}
              			if (a1_0 != null) {
              				if (a1_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ONTOLOGY_DOCUMENT__QUERY), a1_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a1_0, element); 			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:581:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition element = null] : a0= 'Namespace' a1= '(' ( (a2= STRING ) )? a3= '=' (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI ) a5= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:584:1: (a0= 'Namespace' a1= '(' ( (a2= STRING ) )? a3= '=' (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI ) a5= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:585:2: a0= 'Namespace' a1= '(' ( (a2= STRING ) )? a3= '=' (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI ) a5= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition198); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition212); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:610:2: ( (a2= STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:611:3: (a2= STRING )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Terminal
                      		
                    }
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:614:3: (a2= STRING )
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:615:4: a2= STRING
                    {
                    a2=(Token)match(input,STRING,FOLLOW_STRING_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition239); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
                      				}
                      				if (a2 != null) {
                      					de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING");
                      					tokenResolver.setOptions(getOptions());
                      					de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.PREFIX_DEFINITION__PREF), result);
                      					java.lang.Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.PREFIX_DEFINITION__PREF), resolved);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos((CommonToken) a2, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition269); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:657:2: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:658:3: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition287);
            a4_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
              			}
              			if (a4_0 != null) {
              				if (a4_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.PREFIX_DEFINITION__NAMESPACE), a4_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a4_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition305); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:687:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query element = null] : a0= 'Query' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )? ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom ) )* a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:690:1: (a0= 'Query' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )? ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom ) )* a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:691:2: a0= 'Query' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )? ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom ) )* a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,19,FOLLOW_19_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query334); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query348); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:716:2: ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=FULLIRI && LA3_0<=ABBRIRI)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:717:3: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Terminal
                      		
                    }
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:720:3: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:721:4: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query375);
                    a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
                      				}
                      				if (a2_0 != null) {
                      					if (a2_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.QUERY__QUERY_IRI), a2_0);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos(a2_0, element); 				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:741:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=34)||(LA4_0>=45 && LA4_0<=48)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:742:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Terminal
            	      		
            	    }
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:745:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom )
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:746:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query414);
            	    a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.QUERY__ATOMS, a3_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a3_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query443); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:779:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable element = null] : (a0= VARIABLE ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:782:1: ( (a0= VARIABLE ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:783:2: (a0= VARIABLE )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:786:2: (a0= VARIABLE )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:787:3: a0= VARIABLE
            {
            a0=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable476); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassVariable();
              			}
              			if (a0 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VARIABLE");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_VARIABLE__SYMBOL), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_VARIABLE__SYMBOL), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:816:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable element = null] : (a0= VARIABLE ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:819:1: ( (a0= VARIABLE ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:820:2: (a0= VARIABLE )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:823:2: (a0= VARIABLE )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:824:3: a0= VARIABLE
            {
            a0=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable516); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyVariable();
              			}
              			if (a0 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VARIABLE");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_VARIABLE__SYMBOL), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_VARIABLE__SYMBOL), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:853:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable element = null] : (a0= VARIABLE ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:856:1: ( (a0= VARIABLE ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:857:2: (a0= VARIABLE )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:860:2: (a0= VARIABLE )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:861:3: a0= VARIABLE
            {
            a0=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable556); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyVariable();
              			}
              			if (a0 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VARIABLE");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_VARIABLE__SYMBOL), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_VARIABLE__SYMBOL), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:890:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable element = null] : (a0= VARIABLE ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:893:1: ( (a0= VARIABLE ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:894:2: (a0= VARIABLE )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:897:2: (a0= VARIABLE )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:898:3: a0= VARIABLE
            {
            a0=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable596); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualVariable();
              			}
              			if (a0 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VARIABLE");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INDIVIDUAL_VARIABLE__SYMBOL), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INDIVIDUAL_VARIABLE__SYMBOL), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:927:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class element = null] : (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:930:1: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:931:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:934:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:935:3: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class636);
            a0_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClass();
              			}
              			if (a0_0 != null) {
              				if (a0_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS__CONSTANT_IRI), a0_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a0_0, element); 			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:953:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype element = null] : (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:956:1: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:957:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:960:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:961:3: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype673);
            a0_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatype();
              			}
              			if (a0_0 != null) {
              				if (a0_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATATYPE__CONSTANT_IRI), a0_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a0_0, element); 			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:979:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty element = null] : (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:982:1: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:983:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:986:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:987:3: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty710);
            a0_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectProperty();
              			}
              			if (a0_0 != null) {
              				if (a0_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY__CONSTANT_IRI), a0_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a0_0, element); 			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1005:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty element = null] : (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1008:1: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1009:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1012:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1013:3: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty747);
            a0_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataProperty();
              			}
              			if (a0_0 != null) {
              				if (a0_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY__CONSTANT_IRI), a0_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a0_0, element); 			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1031:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual element = null] : (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1034:1: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1035:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1038:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1039:3: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual784);
            a0_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createNamedIndividual();
              			}
              			if (a0_0 != null) {
              				if (a0_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.NAMED_INDIVIDUAL__CONSTANT_IRI), a0_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a0_0, element); 			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1057:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual element = null] : (a0= NODE ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1060:1: ( (a0= NODE ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1061:2: (a0= NODE )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1064:2: (a0= NODE )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1065:3: a0= NODE
            {
            a0=(Token)match(input,NODE,FOLLOW_NODE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual821); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createAnonymousIndividual();
              			}
              			if (a0 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NODE");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ANONYMOUS_INDIVIDUAL__NODE_ID), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ANONYMOUS_INDIVIDUAL__NODE_ID), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1094:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal element = null] : (a0= LITERAL ) a1= '^^' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1097:1: ( (a0= LITERAL ) a1= '^^' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1098:2: (a0= LITERAL ) a1= '^^' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1101:2: (a0= LITERAL )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1102:3: a0= LITERAL
            {
            a0=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal861); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createLiteral();
              			}
              			if (a0 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("LITERAL");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.LITERAL__LEXICAL_FORM), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.LITERAL__LEXICAL_FORM), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,20,FOLLOW_20_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal882); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createLiteral();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1143:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1144:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal900);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createLiteral();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.LITERAL__DATATYPE), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1162:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses element = null] : a0= 'EquivalentClass' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1165:1: (a0= 'EquivalentClass' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1166:2: a0= 'EquivalentClass' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,21,FOLLOW_21_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses933); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses947); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1191:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1192:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses965);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS, a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1211:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==VARIABLE||(LA5_0>=FULLIRI && LA5_0<=ABBRIRI)||(LA5_0>=35 && LA5_0<=44)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1212:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Terminal
            	      		
            	    }
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1215:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1216:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses996);
            	    a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.EQUIVALENT_CLASSES__CLASS_EXPRESSIONS, a3_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a3_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1025); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1249:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf element = null] : a0= 'SubClassOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1252:1: (a0= 'SubClassOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1253:2: a0= 'SubClassOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,22,FOLLOW_22_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1054); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1068); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1278:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1279:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1086);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_CLASS_OF__SUB_CLASS_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1298:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1299:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1108);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_CLASS_OF__SUPER_CLASS_EXPRESSION), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1126); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1328:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses element = null] : a0= 'DisjointWith' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1331:1: (a0= 'DisjointWith' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1332:2: a0= 'DisjointWith' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,23,FOLLOW_23_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1155); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1169); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1357:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1358:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1187);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DISJOINT_CLASSES__CLASS_EXPRESSIONS, a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1377:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==VARIABLE||(LA6_0>=FULLIRI && LA6_0<=ABBRIRI)||(LA6_0>=35 && LA6_0<=44)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1378:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Terminal
            	      		
            	    }
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1381:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1382:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1218);
            	    a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DISJOINT_CLASSES__CLASS_EXPRESSIONS, a3_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a3_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1247); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1415:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion element = null] : a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a5= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a5=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a3_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1418:1: (a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a5= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1419:2: a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a5= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,24,FOLLOW_24_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1276); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1290); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1444:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1445:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1308);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1464:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1465:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1330);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1484:2: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1485:3: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1352);
            a4_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
              			}
              			if (a4_0 != null) {
              				if (a4_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL), a4_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a4_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1370); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1514:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion element = null] : a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a5= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a5=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression a3_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1517:1: (a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a5= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1518:2: a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a5= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,24,FOLLOW_24_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1399); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1413); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1543:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1544:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1431);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1563:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1564:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1453);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1583:2: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1584:3: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1475);
            a4_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
              			}
              			if (a4_0 != null) {
              				if (a4_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE), a4_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a4_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1493); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1613:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion element = null] : a0= 'Type' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1616:1: (a0= 'Type' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1617:2: a0= 'Type' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,25,FOLLOW_25_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1522); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1536); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1642:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1643:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1554);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_ASSERTION__INDIVIDUAL), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1662:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1663:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1576);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_ASSERTION__CLASS_EXPRESSION), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1594); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1692:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual element = null] : a0= 'SameAs' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1695:1: (a0= 'SameAs' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1696:2: a0= 'SameAs' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,26,FOLLOW_26_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1623); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1637); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1721:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1722:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1655);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS, a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1741:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=VARIABLE && LA7_0<=NODE)||(LA7_0>=FULLIRI && LA7_0<=ABBRIRI)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1742:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Terminal
            	      		
            	    }
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1745:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1746:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1686);
            	    a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SAME_INDIVIDUAL__INDIVIDUALS, a3_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a3_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1715); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1779:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals element = null] : a0= 'DifferentFrom' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1782:1: (a0= 'DifferentFrom' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1783:2: a0= 'DifferentFrom' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,27,FOLLOW_27_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1744); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1758); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1808:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1809:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1776);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DIFFERENT_INDIVIDUALS__INDIVIDUALS, a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1828:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=VARIABLE && LA8_0<=NODE)||(LA8_0>=FULLIRI && LA8_0<=ABBRIRI)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1829:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Terminal
            	      		
            	    }
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1832:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1833:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1807);
            	    a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DIFFERENT_INDIVIDUALS__INDIVIDUALS, a3_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a3_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1836); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1866:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties element = null] : a0= 'EquivalentProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1869:1: (a0= 'EquivalentProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) )+ a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1870:2: a0= 'EquivalentProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) )+ a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,28,FOLLOW_28_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties1865); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties1879); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1895:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1896:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties1897);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION, a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1915:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==VARIABLE||(LA9_0>=FULLIRI && LA9_0<=ABBRIRI)||LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1916:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Terminal
            	      		
            	    }
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1919:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1920:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties1928);
            	    a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION, a3_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a3_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties1957); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1953:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf element = null] : a0= 'SubPropertyOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1956:1: (a0= 'SubPropertyOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1957:2: a0= 'SubPropertyOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,29,FOLLOW_29_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf1986); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf2000); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1982:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1983:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf2018);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2002:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2003:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf2040);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf2058); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2032:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty element = null] : a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2035:1: (a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2036:2: a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,30,FOLLOW_30_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty2087); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty2101); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2061:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2062:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty2119);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectProperty();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty2137); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2091:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom element = null] : a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2094:1: (a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2095:2: a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,30,FOLLOW_30_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom2166); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom2180); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2120:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2121:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom2198);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION1), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2140:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2141:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom2220);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION2), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom2238); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2170:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty element = null] : a0= 'Functional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2173:1: (a0= 'Functional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2174:2: a0= 'Functional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,31,FOLLOW_31_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty2267); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty2281); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2199:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2200:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty2299);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFunctionalObjectProperty();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty2317); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2229:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty element = null] : a0= 'InverseFunctional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2232:1: (a0= 'InverseFunctional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2233:2: a0= 'InverseFunctional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,32,FOLLOW_32_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty2346); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty2360); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2258:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2259:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty2378);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseFunctionalObjectProperty();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty2396); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2288:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty element = null] : a0= 'Transitive' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2291:1: (a0= 'Transitive' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2292:2: a0= 'Transitive' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,33,FOLLOW_33_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty2425); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createTransitiveObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty2439); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createTransitiveObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2317:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2318:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty2457);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createTransitiveObjectProperty();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty2475); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createTransitiveObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2347:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty element = null] : a0= 'Symmetric' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2350:1: (a0= 'Symmetric' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2351:2: a0= 'Symmetric' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,34,FOLLOW_34_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty2504); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSymmetricObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty2518); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSymmetricObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2376:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2377:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty2536);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSymmetricObjectProperty();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty2554); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSymmetricObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2406:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf element = null] : a0= 'UnionOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2409:1: (a0= 'UnionOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2410:2: a0= 'UnionOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,35,FOLLOW_35_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf2583); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf2597); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2435:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2436:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf2615);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS, a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2455:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==VARIABLE||(LA10_0>=FULLIRI && LA10_0<=ABBRIRI)||(LA10_0>=35 && LA10_0<=44)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2456:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Terminal
            	      		
            	    }
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2459:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2460:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf2646);
            	    a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS, a3_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a3_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf2675); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2493:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf element = null] : a0= 'ComplementOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2496:1: (a0= 'ComplementOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2497:2: a0= 'ComplementOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,36,FOLLOW_36_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2704); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectComplementOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2718); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectComplementOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2522:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2523:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2736);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectComplementOf();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2754); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectComplementOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2552:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf element = null] : a0= 'OneOf' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2555:1: (a0= 'OneOf' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2556:2: a0= 'OneOf' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,37,FOLLOW_37_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2783); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectOneOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2797); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectOneOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2581:2: ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=VARIABLE && LA11_0<=NODE)||(LA11_0>=FULLIRI && LA11_0<=ABBRIRI)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2582:3: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Terminal
            	      		
            	    }
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2585:3: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2586:4: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2824);
            	    a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectOneOf();
            	      				}
            	      				if (a2_0 != null) {
            	      					if (a2_0 != null) {
            	      						addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_ONE_OF__INDIVIDUALS, a2_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a2_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2853); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectOneOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2619:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf element = null] : a0= 'IntersectionOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2622:1: (a0= 'IntersectionOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2623:2: a0= 'IntersectionOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,38,FOLLOW_38_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2882); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2896); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2648:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2649:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2914);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS, a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2668:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==VARIABLE||(LA12_0>=FULLIRI && LA12_0<=ABBRIRI)||(LA12_0>=35 && LA12_0<=44)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2669:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    {
            	    if ( state.backtracking==0 ) {

            	      			// expected element is a Terminal
            	      		
            	    }
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2672:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2673:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2945);
            	    a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (terminateParsing) {
            	      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
            	      				}
            	      				if (element == null) {
            	      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
            	      				}
            	      				if (a3_0 != null) {
            	      					if (a3_0 != null) {
            	      						addObjectToList(element, de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS, a3_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a3_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected element after STAR or PLUS
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2974); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2706:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom element = null] : a0= 'All' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2709:1: (a0= 'All' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2710:2: a0= 'All' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,39,FOLLOW_39_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom3003); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom3017); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2735:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2736:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom3035);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2755:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2756:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom3057);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom3075); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2785:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom element = null] : a0= 'Some' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2788:1: (a0= 'Some' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2789:2: a0= 'Some' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,40,FOLLOW_40_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom3104); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom3118); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2814:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2815:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom3136);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2834:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2835:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom3158);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom3176); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2864:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue element = null] : a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2867:1: (a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2868:2: a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,41,FOLLOW_41_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue3205); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue3219); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2893:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2894:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue3237);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2913:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2914:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue3259);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_HAS_VALUE__INDIVIDUAL), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue3277); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2943:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality element = null] : a0= 'Min' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a3_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2946:1: (a0= 'Min' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2947:2: a0= 'Min' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,42,FOLLOW_42_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3306); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3320); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2972:2: (a2= INTEGER )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2973:3: a2= INTEGER
            {
            a2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3338); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
              			}
              			if (a2 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3003:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3004:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3363);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3023:2: ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==VARIABLE||(LA13_0>=FULLIRI && LA13_0<=ABBRIRI)||(LA13_0>=35 && LA13_0<=44)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3024:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Terminal
                      		
                    }
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3027:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3028:4: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3394);
                    a4_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
                      				}
                      				if (a4_0 != null) {
                      					if (a4_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION), a4_0);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos(a4_0, element); 				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3420); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3058:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality element = null] : a0= 'Max' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a3_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3061:1: (a0= 'Max' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3062:2: a0= 'Max' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,43,FOLLOW_43_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3449); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3463); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3087:2: (a2= INTEGER )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3088:3: a2= INTEGER
            {
            a2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3481); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
              			}
              			if (a2 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3118:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3119:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3506);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3138:2: ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==VARIABLE||(LA14_0>=FULLIRI && LA14_0<=ABBRIRI)||(LA14_0>=35 && LA14_0<=44)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3139:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Terminal
                      		
                    }
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3142:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3143:4: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3537);
                    a4_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
                      				}
                      				if (a4_0 != null) {
                      					if (a4_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION), a4_0);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos(a4_0, element); 				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3563); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3173:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality element = null] : a0= 'Exact' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a3_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3176:1: (a0= 'Exact' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3177:2: a0= 'Exact' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,44,FOLLOW_44_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3592); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3606); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3202:2: (a2= INTEGER )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3203:3: a2= INTEGER
            {
            a2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3624); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
              			}
              			if (a2 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
              				}
              				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3233:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3234:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3649);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element before STAR or QUESTIONMARK or PLUS
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3253:2: ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==VARIABLE||(LA15_0>=FULLIRI && LA15_0<=ABBRIRI)||(LA15_0>=35 && LA15_0<=44)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3254:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    {
                    if ( state.backtracking==0 ) {

                      			// expected element is a Terminal
                      		
                    }
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3257:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3258:4: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3680);
                    a4_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
                      				}
                      				if (a4_0 != null) {
                      					if (a4_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION), a4_0);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos(a4_0, element); 				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a5=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3706); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a5, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3288:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue element = null] : a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3291:1: (a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a4= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3292:2: a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a4= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,41,FOLLOW_41_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3735); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3749); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3317:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3318:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3767);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3337:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3338:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3789);
            a3_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
              			}
              			if (a3_0 != null) {
              				if (a3_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_HAS_VALUE__LITERAL), a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a4=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3807); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a4, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3367:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI element = null] : (a0= FULLIRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3370:1: ( (a0= FULLIRI ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3371:2: (a0= FULLIRI )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3374:2: (a0= FULLIRI )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3375:3: a0= FULLIRI
            {
            a0=(Token)match(input,FULLIRI,FOLLOW_FULLIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI3840); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFullIRI();
              			}
              			if (a0 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FULLIRI");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.FULL_IRI__ID), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.FULL_IRI__ID), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3404:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI element = null] : (a0= ABBRIRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3407:1: ( (a0= ABBRIRI ) )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3408:2: (a0= ABBRIRI )
            {
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3411:2: (a0= ABBRIRI )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3412:3: a0= ABBRIRI
            {
            a0=(Token)match(input,ABBRIRI,FOLLOW_ABBRIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI3880); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createAbbreviatedIRI();
              			}
              			if (a0 != null) {
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ABBRIRI");
              				tokenResolver.setOptions(getOptions());
              				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ABBREVIATED_IRI__ID), result);
              				java.lang.Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ABBREVIATED_IRI__ID), resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((CommonToken) a0, element);
              			}
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3441:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration element = null] : a0= 'ObjectProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3444:1: (a0= 'ObjectProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable ) a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3445:2: a0= 'ObjectProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable ) a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,45,FOLLOW_45_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3916); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3930); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3470:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3471:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3948);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyDeclaration();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3966); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3500:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration element = null] : a0= 'DatatypeProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3503:1: (a0= 'DatatypeProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable ) a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3504:2: a0= 'DatatypeProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable ) a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,46,FOLLOW_46_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration3995); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatypePropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration4009); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatypePropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3529:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3530:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration4027);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatypePropertyDeclaration();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration4045); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatypePropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3559:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration element = null] : a0= 'Individual' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3562:1: (a0= 'Individual' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable ) a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3563:2: a0= 'Individual' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable ) a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,47,FOLLOW_47_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4074); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4088); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3588:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3589:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4106);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualDeclaration();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4124); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3618:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration element = null] : a0= 'Class' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3621:1: (a0= 'Class' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable ) a3= ')' )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3622:2: a0= 'Class' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable ) a3= ')'
            {
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a0=(Token)match(input,48,FOLLOW_48_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4153); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a1=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4167); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected element is a Terminal
              	
            }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3647:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable )
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3648:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4185);
            a2_0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
              			}
              			if (element == null) {
              				element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassDeclaration();
              			}
              			if (a2_0 != null) {
              				if (a2_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_DECLARATION__CLASS_VARIABLE), a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected element is a CsString
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4203); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((CommonToken)a3, element);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3677:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3678:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FULLIRI) ) {
                alt16=1;
            }
            else if ( (LA16_0==ABBRIRI) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3679:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI4225);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3680:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI4235);
                    c1=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3684:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty | c13= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty | c14= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty | c15= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration | c16= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration | c17= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration | c18= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf c1 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses c2 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion c3 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion c4 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion c5 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual c6 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals c7 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties c8 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf c9 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom c10 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty c11 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty c12 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty c13 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty c14 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration c15 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration c16 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration c17 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration c18 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3685:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty | c13= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty | c14= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty | c15= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration | c16= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration | c17= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration | c18= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration )
            int alt17=19;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3686:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4256);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3687:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4266);
                    c1=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 3 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3688:4: c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4276);
                    c2=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 4 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3689:4: c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4286);
                    c3=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 5 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3690:4: c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4296);
                    c4=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 6 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3691:4: c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4306);
                    c5=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 7 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3692:4: c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4316);
                    c6=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 8 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3693:4: c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4326);
                    c7=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 9 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3694:4: c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4336);
                    c8=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c8; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 10 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3695:4: c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4346);
                    c9=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c9; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 11 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3696:4: c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4356);
                    c10=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c10; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 12 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3697:4: c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4366);
                    c11=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c11; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 13 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3698:4: c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4376);
                    c12=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c12; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 14 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3699:4: c13= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4386);
                    c13=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c13; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 15 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3700:4: c14= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4396);
                    c14=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c14; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 16 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3701:4: c15= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4406);
                    c15=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c15; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 17 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3702:4: c16= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4416);
                    c16=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c16; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 18 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3703:4: c17= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4426);
                    c17=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c17; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 19 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3704:4: c18= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4436);
                    c18=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c18; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3708:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class c1 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf c2 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf c3 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf c4 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf c5 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom c6 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom c7 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue c8 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality c9 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality c10 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality c11 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue c12 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3709:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue )
            int alt18=13;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3710:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4457);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3711:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4467);
                    c1=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 3 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3712:4: c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4477);
                    c2=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 4 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3713:4: c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4487);
                    c3=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 5 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3714:4: c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4497);
                    c4=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 6 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3715:4: c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4507);
                    c5=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 7 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3716:4: c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4517);
                    c6=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 8 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3717:4: c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4527);
                    c7=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 9 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3718:4: c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4537);
                    c8=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c8; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 10 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3719:4: c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4547);
                    c9=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c9; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 11 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3720:4: c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4557);
                    c10=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c10; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 12 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3721:4: c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4567);
                    c11=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c11; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 13 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3722:4: c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4577);
                    c12=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c12; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3726:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual c1 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3727:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual )
            int alt19=3;
            switch ( input.LA(1) ) {
            case VARIABLE:
                {
                alt19=1;
                }
                break;
            case FULLIRI:
            case ABBRIRI:
                {
                alt19=2;
                }
                break;
            case NODE:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3728:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4598);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3729:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4608);
                    c1=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 3 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3730:4: c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4618);
                    c2=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3734:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty c1 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3735:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty )
            int alt20=3;
            switch ( input.LA(1) ) {
            case VARIABLE:
                {
                alt20=1;
                }
                break;
            case FULLIRI:
            case ABBRIRI:
                {
                alt20=2;
                }
                break;
            case 30:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3736:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4639);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3737:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4649);
                    c1=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 3 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3738:4: c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4659);
                    c2=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression"
    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3742:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return element; }
            // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3743:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==VARIABLE) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=FULLIRI && LA21_0<=ABBRIRI)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3744:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression4680);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\twouse\\software\\plugins\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3745:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression4690);
                    c1=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA17_eotS =
        "\35\uffff";
    static final String DFA17_eofS =
        "\35\uffff";
    static final String DFA17_minS =
        "\1\25\3\uffff\1\20\16\uffff\10\5\2\uffff";
    static final String DFA17_maxS =
        "\1\60\3\uffff\1\20\16\uffff\1\12\4\36\3\12\2\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\10\uffff\1\4\1\5";
    static final String DFA17_specialS =
        "\35\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
            "\1\16\12\uffff\1\17\1\20\1\21\1\22",
            "",
            "",
            "",
            "\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\1\27\2\uffff\1\25\1\26",
            "\1\30\3\uffff\1\31\1\32\23\uffff\1\33",
            "\1\30\3\uffff\1\31\1\32\23\uffff\1\33",
            "\1\30\3\uffff\1\31\1\32\23\uffff\1\33",
            "\1\30\3\uffff\1\31\1\32\23\uffff\1\33",
            "\2\33\1\34\1\uffff\2\33",
            "\2\33\1\34\1\uffff\2\33",
            "\2\33\1\34\1\uffff\2\33",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "3684:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty | c13= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty | c14= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty | c15= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration | c16= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration | c17= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration | c18= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration );";
        }
    }
    static final String DFA18_eotS =
        "\23\uffff";
    static final String DFA18_eofS =
        "\23\uffff";
    static final String DFA18_minS =
        "\1\5\10\uffff\1\20\3\uffff\4\5\2\uffff";
    static final String DFA18_maxS =
        "\1\54\10\uffff\1\20\3\uffff\1\36\3\12\2\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14"+
        "\4\uffff\1\11\1\15";
    static final String DFA18_specialS =
        "\23\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\3\uffff\2\2\30\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
            "\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "",
            "",
            "",
            "\1\16\3\uffff\1\17\1\20\23\uffff\1\21",
            "\2\21\1\22\1\uffff\2\21",
            "\2\21\1\22\1\uffff\2\21",
            "\2\21\1\22\1\uffff\2\21",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "3708:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue );";
        }
    }
 

    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument_in_start86 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument132 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition198 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition212 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_STRING_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition239 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition269 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition287 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query334 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query348 = new BitSet(new long[]{0x0001E007FFE40600L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query375 = new BitSet(new long[]{0x0001E007FFE40000L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query414 = new BitSet(new long[]{0x0001E007FFE40000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal861 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal882 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses933 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses947 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses965 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses996 = new BitSet(new long[]{0x00001FF800040620L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1054 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1068 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1086 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1108 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1155 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1169 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1187 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1218 = new BitSet(new long[]{0x00001FF800040620L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1276 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1290 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1308 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1330 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1352 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1399 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1413 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1431 = new BitSet(new long[]{0x0000000000000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1453 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1475 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1522 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1536 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1554 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1576 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1623 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1637 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1655 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1686 = new BitSet(new long[]{0x0000000000040660L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1744 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1758 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1776 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1807 = new BitSet(new long[]{0x0000000000040660L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties1865 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties1879 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties1897 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties1928 = new BitSet(new long[]{0x0000000040040620L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf1986 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf2000 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf2018 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf2040 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty2087 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty2101 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty2119 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom2166 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom2180 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom2198 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom2220 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty2267 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty2281 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty2299 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty2346 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty2360 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty2378 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty2425 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty2439 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty2457 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty2504 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty2518 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty2536 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf2583 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf2597 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf2615 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf2646 = new BitSet(new long[]{0x00001FF800040620L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2704 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2718 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2736 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2783 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2797 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2824 = new BitSet(new long[]{0x0000000000040660L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2882 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2896 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2914 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2945 = new BitSet(new long[]{0x00001FF800040620L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom3003 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom3017 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom3035 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom3057 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom3104 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom3118 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom3136 = new BitSet(new long[]{0x00001FF800000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom3158 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue3205 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue3219 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue3237 = new BitSet(new long[]{0x0000000000000660L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue3259 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3306 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3320 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3338 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3363 = new BitSet(new long[]{0x00001FF800040620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3394 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3449 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3463 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3481 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3506 = new BitSet(new long[]{0x00001FF800040620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3537 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3592 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3606 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3624 = new BitSet(new long[]{0x0000000040000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3649 = new BitSet(new long[]{0x00001FF800040620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3680 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3735 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3749 = new BitSet(new long[]{0x0000000000000620L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3767 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3789 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULLIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABBRIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3916 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3948 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration3995 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration4009 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration4027 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4074 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4088 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4106 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4153 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4167 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4185 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression4690 = new BitSet(new long[]{0x0000000000000002L});

}